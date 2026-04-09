package org.jacoco.core.analysis;

/* loaded from: classes4.dex */
public interface ICounter {

    public enum CounterValue {
        TOTALCOUNT,
        MISSEDCOUNT,
        COVEREDCOUNT,
        MISSEDRATIO,
        COVEREDRATIO
    }

    double a(CounterValue counterValue);
}
