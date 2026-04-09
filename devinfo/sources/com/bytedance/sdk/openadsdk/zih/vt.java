package com.bytedance.sdk.openadsdk.zih;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static int fkw = 3;

    /* renamed from: lh, reason: collision with root package name */
    public static int f8858lh = 1;
    public static int ouw = -1;
    public static int vt = 0;
    public static int yu = 2;

    /* renamed from: le, reason: collision with root package name */
    int f8859le = ouw;
    private long ra = 0;
    private long pno = 0;
    private final List<lh> bly = new ArrayList();
    private long tlj = 0;

    public final void lh(long j) {
        int i4;
        int i10 = this.f8859le;
        if (i10 == ouw || i10 == (i4 = yu) || i10 == fkw) {
            return;
        }
        this.f8859le = i4;
        this.tlj = j;
    }

    public final void ouw(long j) {
        this.f8859le = vt;
        this.ra = j;
    }

    public final void vt(long j) {
        int i4;
        int i10 = this.f8859le;
        if (i10 == ouw || i10 == (i4 = fkw)) {
            return;
        }
        this.f8859le = i4;
        this.pno = j;
    }

    public final void yu(long j) {
        int i4 = this.f8859le;
        if (i4 == ouw || i4 != yu) {
            return;
        }
        this.f8859le = f8858lh;
        this.bly.add(new lh(this.tlj, j));
        this.tlj = 0L;
    }

    public final long ouw(long j, long j8) {
        long j9;
        long j10 = this.pno;
        if (j10 != 0 && j > j10) {
            return 0L;
        }
        int i4 = 0;
        for (lh lhVar : this.bly) {
            long j11 = lhVar.vt;
            if (j11 > j) {
                long j12 = lhVar.ouw;
                i4 = (int) (j < j12 ? (j11 - j12) + i4 : (j11 - j) + i4);
            }
        }
        long j13 = this.ra;
        if (j13 < j) {
            long j14 = this.tlj;
            if (j14 == 0) {
                j14 = this.pno;
                if (j14 == 0) {
                    j9 = j8 - j;
                }
            } else if (j14 <= j) {
                return 0L;
            }
            return (j14 - j) - i4;
        }
        long j15 = this.tlj;
        if (j15 == 0) {
            j15 = this.pno;
            if (j15 == 0) {
                j9 = j8 - j13;
            }
        } else if (j15 <= j13) {
            return 0L;
        }
        return (j15 - j13) - i4;
        return j9 - i4;
    }
}
