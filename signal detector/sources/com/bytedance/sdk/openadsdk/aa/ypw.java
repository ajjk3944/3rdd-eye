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

    public void dg(long j6) {
        int i = this.ycc;
        if (i == emc || i != dg) {
            return;
        }
        this.ycc = xq;
        this.zz.add(new xq(this.ru, j6));
        this.ru = 0L;
    }

    public void emc(long j6) {
        this.ycc = ypw;
        this.uym = j6;
    }

    public void xq(long j6) {
        int i;
        int i3 = this.ycc;
        if (i3 == emc || i3 == (i = dg) || i3 == bw) {
            return;
        }
        this.ycc = i;
        this.ru = j6;
    }

    public void ypw(long j6) {
        int i;
        int i3 = this.ycc;
        if (i3 == emc || i3 == (i = bw)) {
            return;
        }
        this.ycc = i;
        this.msw = j6;
    }

    public long emc(long j6, long j7) {
        long j8;
        long j9;
        long jYpw;
        long j10 = this.msw;
        if (j10 != 0 && j6 > j10) {
            return 0L;
        }
        int i = 0;
        for (xq xqVar : this.zz) {
            if (xqVar.ypw() > j6) {
                if (j6 < xqVar.emc()) {
                    j9 = i;
                    jYpw = xqVar.ypw() - xqVar.emc();
                } else {
                    j9 = i;
                    jYpw = xqVar.ypw() - j6;
                }
                i = (int) (jYpw + j9);
            }
        }
        long j11 = this.uym;
        if (j11 < j6) {
            long j12 = this.ru;
            if (j12 == 0) {
                j12 = this.msw;
                if (j12 == 0) {
                    j8 = j7 - j6;
                }
            } else if (j12 <= j6) {
                return 0L;
            }
            return (j12 - j6) - i;
        }
        long j13 = this.ru;
        if (j13 == 0) {
            j13 = this.msw;
            if (j13 == 0) {
                j8 = j7 - j11;
            }
        } else if (j13 <= j11) {
            return 0L;
        }
        return (j13 - j11) - i;
        return j8 - i;
    }

    public int emc() {
        return this.ycc;
    }
}
