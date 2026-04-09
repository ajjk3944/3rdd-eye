package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.e;
import com.google.common.base.f;
import com.google.common.base.g;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public final class PairedStats implements Serializable {
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public long d() {
        return this.xStats.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    public double g() {
        g.r(d() != 0);
        return this.sumOfProductsOfDeltas / d();
    }

    public int hashCode() {
        return f.b(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public String toString() {
        return d() > 0 ? e.b(this).c("xStats", this.xStats).c("yStats", this.yStats).a("populationCovariance", g()).toString() : e.b(this).c("xStats", this.xStats).c("yStats", this.yStats).toString();
    }
}
