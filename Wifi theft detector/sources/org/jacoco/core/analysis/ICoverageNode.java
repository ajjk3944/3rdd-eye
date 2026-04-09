package org.jacoco.core.analysis;

/* loaded from: classes4.dex */
public interface ICoverageNode {

    public enum CounterEntity {
        INSTRUCTION,
        BRANCH,
        LINE,
        COMPLEXITY,
        METHOD,
        CLASS
    }

    public enum ElementType {
        METHOD,
        CLASS,
        SOURCEFILE,
        PACKAGE,
        BUNDLE,
        GROUP
    }

    ICounter a(CounterEntity counterEntity);
}
