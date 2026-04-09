package j5;

import a5.d0;
import java.io.IOException;
import java.util.ArrayList;
import o5.x0;

/* loaded from: classes.dex */
public final class o implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13303a;

    /* renamed from: d, reason: collision with root package name */
    public final s f13304d;

    /* renamed from: g, reason: collision with root package name */
    public int f13305g = -1;

    public o(s sVar, int i10) {
        this.f13304d = sVar;
        this.f13303a = i10;
    }

    @Override // o5.x0
    public final void a() throws IOException {
        int i10 = this.f13305g;
        s sVar = this.f13304d;
        if (i10 == -2) {
            sVar.b();
            throw new androidx.datastore.preferences.protobuf.m(h0.b.o("Unable to bind a sample queue to TrackGroup with mime type ", sVar.f13322e0.a(this.f13303a).f1575r[0].H, "."));
        }
        if (i10 == -1) {
            sVar.D();
        } else if (i10 != -3) {
            sVar.D();
            sVar.R[i10].s();
        }
    }

    @Override // o5.x0
    public final boolean b() {
        if (this.f13305g == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i10 = this.f13305g;
        s sVar = this.f13304d;
        return !sVar.A() && sVar.R[i10].q(sVar.f13334p0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.f13305g
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            a5.a.e(r0)
            j5.s r0 = r6.f13304d
            r0.b()
            int[] r3 = r0.f13325g0
            r3.getClass()
            int[] r3 = r0.f13325g0
            int r4 = r6.f13303a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.f13323f0
            o5.h1 r0 = r0.f13322e0
            androidx.media3.common.b1 r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.f13328j0
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.f13305g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.o.c():void");
    }

    public final boolean d() {
        int i10 = this.f13305g;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // o5.x0
    public final int h(long j) throws Throwable {
        if (!d()) {
            return 0;
        }
        int i10 = this.f13305g;
        s sVar = this.f13304d;
        if (sVar.A()) {
            return 0;
        }
        r rVar = sVar.R[i10];
        int iO = rVar.o(j, sVar.f13334p0);
        k kVar = (k) oe.s.j(sVar.J);
        if (kVar != null && !kVar.f13296h0) {
            iO = Math.min(iO, kVar.g(i10) - rVar.m());
        }
        rVar.y(iO);
        return iO;
    }

    @Override // o5.x0
    public final int j(io.sentry.internal.debugmeta.c cVar, c5.g gVar, int i10) {
        androidx.media3.common.r rVar;
        if (this.f13305g == -3) {
            gVar.b(4);
            return -4;
        }
        if (d()) {
            int i11 = this.f13305g;
            s sVar = this.f13304d;
            ArrayList arrayList = sVar.J;
            if (!sVar.A()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).G;
                        int length = sVar.R.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (sVar.f13328j0[i15] && sVar.R[i15].u() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    d0.L(arrayList, 0, i13);
                    k kVar = (k) arrayList.get(0);
                    androidx.media3.common.r rVar2 = kVar.f20267r;
                    if (!rVar2.equals(sVar.f13319c0)) {
                        sVar.G.b(sVar.f13320d, rVar2, kVar.f20268x, kVar.f20269y, kVar.B);
                    }
                    sVar.f13319c0 = rVar2;
                }
                if (arrayList.isEmpty() || ((k) arrayList.get(0)).f13296h0) {
                    int iV = sVar.R[i11].v(cVar, gVar, i10, sVar.f13334p0);
                    if (iV == -5) {
                        androidx.media3.common.r rVarD = (androidx.media3.common.r) cVar.f12354g;
                        rVarD.getClass();
                        if (i11 == sVar.X) {
                            int iU = sVar.R[i11].u();
                            while (i12 < arrayList.size() && ((k) arrayList.get(i12)).G != iU) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                rVar = ((k) arrayList.get(i12)).f20267r;
                            } else {
                                rVar = sVar.f13318b0;
                                rVar.getClass();
                            }
                            rVarD = rVarD.d(rVar);
                        }
                        cVar.f12354g = rVarD;
                    }
                    return iV;
                }
            }
        }
        return -3;
    }
}
