package org.jacoco.core.analysis;

import androidx.appcompat.app.z;
import java.io.Serializable;
import java.util.Comparator;
import org.jacoco.core.analysis.ICoverageNode;

/* loaded from: classes4.dex */
public class NodeComparator implements Comparator<ICoverageNode>, Serializable {
    private static final long serialVersionUID = 8550521643608826519L;
    private final Comparator<ICounter> counterComparator;
    private final ICoverageNode.CounterEntity entity;

    public int a(ICoverageNode iCoverageNode, ICoverageNode iCoverageNode2) {
        iCoverageNode.a(this.entity);
        iCoverageNode2.a(this.entity);
        return this.counterComparator.compare(null, null);
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(ICoverageNode iCoverageNode, ICoverageNode iCoverageNode2) {
        z.a(iCoverageNode);
        z.a(iCoverageNode2);
        return a(null, null);
    }
}
