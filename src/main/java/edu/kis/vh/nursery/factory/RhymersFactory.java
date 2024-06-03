package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    public DefaultCountingOutRhymer getStandardRhymer();
    // TODO: delete modifier 'public' - is redundant for interface members

    public DefaultCountingOutRhymer getFalseRhymer();
    // TODO: delete modifier 'public' - is redundant for interface members

    public DefaultCountingOutRhymer getFIFORhymer();
    // TODO: delete modifier 'public' - is redundant for interface members

    public DefaultCountingOutRhymer getHanoiRhymer();
    // TODO: delete modifier 'public' - is redundant for interface members

}
