package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hc1 implements dj0 {
    public final jz f;
    public final int g;
    public final c5 h;
    public final long i;
    public final long j;

    public hc1(jz jzVar, int i, c5 c5Var, long j, long j2) {
        this.f = jzVar;
        this.g = i;
        this.h = c5Var;
        this.i = j;
        this.j = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.sh a(defpackage.xb1 r4, defpackage.w9 r5, int r6) {
        /*
            eb4 r5 = r5.v
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            sh r5 = r5.i
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.g
            if (r1 == 0) goto L35
            int[] r1 = r5.i
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.k
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
            if (r2 >= r3) goto L2b
            r3 = r1[r2]
            if (r3 != r6) goto L21
            goto L35
        L21:
            int r2 = r2 + 1
            goto L19
        L24:
            int r3 = r1.length
            if (r2 >= r3) goto L35
            r3 = r1[r2]
            if (r3 != r6) goto L32
        L2b:
            int r4 = r4.q
            int r6 = r5.j
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc1.a(xb1, w9, int):sh");
    }

    @Override // defpackage.dj0
    public final void i(gi4 gi4Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int iElapsedRealtime;
        if (this.f.a()) {
            tq0 tq0Var = (tq0) sq0.k().g;
            if (tq0Var == null || tq0Var.g) {
                xb1 xb1Var = (xb1) this.f.o.get(this.h);
                if (xb1Var != null) {
                    Object obj = xb1Var.g;
                    if (obj instanceof w9) {
                        w9 w9Var = (w9) obj;
                        int i6 = 0;
                        boolean z = this.i > 0;
                        int i7 = w9Var.q;
                        if (tq0Var != null) {
                            z &= tq0Var.h;
                            int i8 = tq0Var.i;
                            int i9 = tq0Var.j;
                            i = tq0Var.f;
                            if (w9Var.v != null && !w9Var.f()) {
                                sh shVarA = a(xb1Var, w9Var, this.g);
                                if (shVarA == null) {
                                    return;
                                }
                                boolean z2 = shVarA.h && this.i > 0;
                                i9 = shVarA.j;
                                z = z2;
                            }
                            i3 = i8;
                            i2 = i9;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        jz jzVar = this.f;
                        if (gi4Var.c()) {
                            i4 = 0;
                        } else {
                            if (gi4Var.d) {
                                i4 = 100;
                            } else {
                                Exception excA = gi4Var.a();
                                if (excA instanceof y4) {
                                    Status status = ((y4) excA).f;
                                    int i10 = status.f;
                                    rh rhVar = status.i;
                                    i6 = rhVar == null ? -1 : rhVar.g;
                                    i4 = i10;
                                } else {
                                    i4 = 101;
                                }
                            }
                            i6 = -1;
                        }
                        if (z) {
                            long j3 = this.i;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            i5 = i2;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.j);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            i5 = i2;
                            j = 0;
                            j2 = 0;
                            iElapsedRealtime = -1;
                        }
                        wc1 wc1Var = jzVar.r;
                        wc1Var.sendMessage(wc1Var.obtainMessage(18, new ic1(new re0(this.g, i4, i6, j, j2, null, null, i7, iElapsedRealtime), i, i3, i5)));
                    }
                }
            }
        }
    }
}
