package ru.fivestarter.brain;

import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

import ru.fivestarter.brain.neyron.Neyron;
import ru.fivestarter.brain.observer.Observer;

/**
 * @author <a href='mailto:ystartsev@wiley.com'>Yury Startsev</a>
 * @version 11.12.2014
 */
public class SynapseManagerImpl implements SynapseManager, Observer {
    Set<Neyron> targetNeyrons;

    @Override
    public void update(Neyron neyron) {
        Set<Neyron> availableNeyrons = getAvailableNeyrons(neyron);
        Neyron randomNeyron = getRandomNeyron(availableNeyrons);
        neyron.addEffected(randomNeyron);
        randomNeyron.update(neyron);
    }

    public void init(Set<Neyron> targetNeyrons) {
        this.targetNeyrons = targetNeyrons;
    }

    private Set<Neyron> getAvailableNeyrons(Neyron initiator) {
        Set<Neyron> ret = Sets.newHashSet(targetNeyrons);
        ret.remove(initiator);
        ret.removeAll(initiator.getEffected());
        return ret;
    }

    private Neyron getRandomNeyron(Set<Neyron> neyrons) {
        int item = new Random().nextInt(neyrons.size());
        int i = 0;
        Neyron ret = null;
        for (Neyron obj : neyrons) {
            if (i == item) {
                ret = obj;
                break;
            }
            i = i + 1;
        }
        return ret;

    }
}
