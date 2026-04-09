package com.bytedance.sdk.openadsdk.aa;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ypw {
    public static int bw = 3;
    public static int dg = 2;
    public static int emc = -1;
    public static int xq = 1;
    public static int ypw;
    private int ycc = emc;
    private long uym = 0;
    private long msw = 0;
    private final List<xq> zz = new ArrayList();
    private long ru = 0;

    public void dg(long j10) {
        int i10 = this.ycc;
        if (i10 == emc || i10 != dg) {
            return;
        }
        this.ycc = xq;
        this.zz.add(new xq(this.ru, j10));
        this.ru = 0L;
    }

    public void emc(long j10) {
        this.ycc = ypw;
        this.uym = j10;
    }

    public void xq(long j10) {
        int i10;
        int i11 = this.ycc;
        if (i11 == emc || i11 == (i10 = dg) || i11 == bw) {
            return;
        }
        this.ycc = i10;
        this.ru = j10;
    }

    public void ypw(long j10) {
        int i10;
        int i11 = this.ycc;
        if (i11 == emc || i11 == (i10 = bw)) {
            return;
        }
        this.ycc = i10;
        this.msw = j10;
    }

    public long emc(long j10, long j11) {
        long j12;
        long j13;
        long jYpw;
        long j14 = this.msw;
        if (j14 != 0 && j10 > j14) {
            return 0L;
        }
        int i10 = 0;
        for (xq xqVar : this.zz) {
            if (xqVar.ypw() > j10) {
                if (j10 < xqVar.emc()) {
                    j13 = i10;
                    jYpw = xqVar.ypw() - xqVar.emc();
                } else {
                    j13 = i10;
                    jYpw = xqVar.ypw() - j10;
                }
                i10 = (int) (j13 + jYpw);
            }
        }
        long j15 = this.uym;
        if (j15 < j10) {
            long j16 = this.ru;
            if (j16 == 0) {
                j16 = this.msw;
                if (j16 == 0) {
                    j12 = j11 - j10;
                }
            } else if (j16 <= j10) {
                return 0L;
            }
            return (j16 - j10) - i10;
        }
        long j17 = this.ru;
        if (j17 == 0) {
            j17 = this.msw;
            if (j17 == 0) {
                j12 = j11 - j15;
            }
        } else if (j17 <= j15) {
            return 0L;
        }
        return (j17 - j15) - i10;
        return j12 - i10;
    }

    public int emc() {
        return this.ycc;
    }
}
