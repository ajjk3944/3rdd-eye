package L2;

import M2.AbstractC0165e;
import M2.C0166f;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class q implements c3.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f2545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2546b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2547c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2548d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2549e;

    public q(c cVar, int i, a aVar, long j6, long j7) {
        this.f2545a = cVar;
        this.f2546b = i;
        this.f2547c = aVar;
        this.f2548d = j6;
        this.f2549e = j7;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static M2.C0166f a(L2.k r4, M2.AbstractC0165e r5, int r6) {
        /*
            M2.C r5 = r5.f2753v
            r0 = 0
            if (r5 != 0) goto L7
            r5 = r0
            goto L9
        L7:
            M2.f r5 = r5.f2711d
        L9:
            if (r5 == 0) goto L35
            boolean r1 = r5.f2756b
            if (r1 == 0) goto L35
            int[] r1 = r5.f2758d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r5.f2760f
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
            int r4 = r4.f2532l
            int r6 = r5.f2759e
            if (r4 >= r6) goto L35
            return r5
        L32:
            int r2 = r2 + 1
            goto L24
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.q.a(L2.k, M2.e, int):M2.f");
    }

    @Override // c3.b
    public final void e(c3.j jVar) {
        int i;
        int i3;
        int i6;
        int i7;
        int i8;
        long j6;
        long j7;
        int iElapsedRealtime;
        if (this.f2545a.a()) {
            M2.l lVar = (M2.l) M2.k.b().f2787a;
            if (lVar == null || lVar.f2789b) {
                k kVar = (k) this.f2545a.f2514j.get(this.f2547c);
                if (kVar != null) {
                    Object obj = kVar.f2523b;
                    if (obj instanceof AbstractC0165e) {
                        AbstractC0165e abstractC0165e = (AbstractC0165e) obj;
                        int i9 = 0;
                        boolean z6 = this.f2548d > 0;
                        int i10 = abstractC0165e.f2748q;
                        if (lVar != null) {
                            z6 &= lVar.f2790c;
                            int i11 = lVar.f2791d;
                            int i12 = lVar.f2792e;
                            i = lVar.f2788a;
                            if (abstractC0165e.f2753v != null && !abstractC0165e.d()) {
                                C0166f c0166fA = a(kVar, abstractC0165e, this.f2546b);
                                if (c0166fA == null) {
                                    return;
                                }
                                boolean z7 = c0166fA.f2757c && this.f2548d > 0;
                                i12 = c0166fA.f2759e;
                                z6 = z7;
                            }
                            i6 = i11;
                            i3 = i12;
                        } else {
                            i = 0;
                            i3 = 100;
                            i6 = 5000;
                        }
                        c cVar = this.f2545a;
                        if (jVar.e()) {
                            i7 = 0;
                        } else {
                            if (jVar.f5914d) {
                                i7 = 100;
                            } else {
                                Exception excB = jVar.b();
                                if (excB instanceof K2.d) {
                                    Status status = ((K2.d) excB).f2147a;
                                    int i13 = status.f6904a;
                                    J2.b bVar = status.f6907d;
                                    i9 = bVar == null ? -1 : bVar.f2045b;
                                    i7 = i13;
                                } else {
                                    i7 = 101;
                                }
                            }
                            i9 = -1;
                        }
                        if (z6) {
                            long j8 = this.f2548d;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            i8 = i3;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f2549e);
                            j7 = jCurrentTimeMillis;
                            j6 = j8;
                        } else {
                            i8 = i3;
                            j6 = 0;
                            j7 = 0;
                            iElapsedRealtime = -1;
                        }
                        W2.e eVar = cVar.f2517m;
                        eVar.sendMessage(eVar.obtainMessage(18, new r(new M2.j(this.f2546b, i7, i9, j6, j7, null, null, i10, iElapsedRealtime), i, i6, i8)));
                    }
                }
            }
        }
    }
}
