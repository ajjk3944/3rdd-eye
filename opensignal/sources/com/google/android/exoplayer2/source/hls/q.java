package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import pb.n0;
import ya.s0;

/* loaded from: classes.dex */
public final class q implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4504a;

    /* renamed from: d, reason: collision with root package name */
    public final u f4505d;

    /* renamed from: g, reason: collision with root package name */
    public int f4506g = -1;

    public q(u uVar, int i10) {
        this.f4505d = uVar;
        this.f4504a = i10;
    }

    @Override // ya.s0
    public final void a() throws IOException {
        u uVar = this.f4505d;
        HlsChunkSource hlsChunkSource = uVar.f4525g;
        n0 n0Var = uVar.E;
        int i10 = this.f4506g;
        if (i10 == -2) {
            uVar.b();
            TrackGroupArray trackGroupArray = uVar.f4522d0;
            String str = trackGroupArray.f4458d[this.f4504a].f4454d[0].H;
            throw new androidx.datastore.preferences.protobuf.m(c7.a.k(c7.a.d(60, str), "Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
        }
        if (i10 == -1) {
            n0Var.a();
            hlsChunkSource.maybeThrowError();
        } else if (i10 != -3) {
            n0Var.a();
            hlsChunkSource.maybeThrowError();
            uVar.Q[i10].t();
        }
    }

    @Override // ya.s0
    public final boolean b() {
        if (this.f4506g == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i10 = this.f4506g;
        u uVar = this.f4505d;
        return !uVar.A() && uVar.Q[i10].r(uVar.f4534o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r6 = this;
            int r0 = r6.f4506g
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            qb.b.g(r0)
            com.google.android.exoplayer2.source.hls.u r0 = r6.f4505d
            r0.b()
            int[] r3 = r0.f4524f0
            r3.getClass()
            int[] r3 = r0.f4524f0
            int r4 = r6.f4504a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.f4523e0
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r0.f4522d0
            com.google.android.exoplayer2.source.TrackGroup[] r0 = r0.f4458d
            r0 = r0[r4]
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.f4528i0
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.f4506g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.q.c():void");
    }

    public final boolean d() {
        int i10 = this.f4506g;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // ya.s0
    public final int h(long j) throws Throwable {
        if (!d()) {
            return 0;
        }
        int i10 = this.f4506g;
        u uVar = this.f4505d;
        if (uVar.A()) {
            return 0;
        }
        t tVar = uVar.Q[i10];
        int iP = tVar.p(j, uVar.f4534o0);
        m mVar = (m) oe.s.j(uVar.I);
        if (mVar != null && !mVar.f4497g0) {
            iP = Math.min(iP, mVar.g(i10) - tVar.n());
        }
        tVar.z(iP);
        return iP;
    }

    @Override // ya.s0
    public final int j(io.sentry.internal.debugmeta.c cVar, z9.d dVar, int i10) {
        Format format;
        if (this.f4506g == -3) {
            dVar.f3295d |= 4;
            return -4;
        }
        if (d()) {
            int i11 = this.f4506g;
            u uVar = this.f4505d;
            ArrayList arrayList = uVar.I;
            if (!uVar.A()) {
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((m) arrayList.get(i13)).G;
                        int length = uVar.Q.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (uVar.f4528i0[i15] && uVar.Q[i15].v() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    qb.v.G(arrayList, 0, i13);
                    m mVar = (m) arrayList.get(0);
                    Format format2 = mVar.f304r;
                    if (!format2.equals(uVar.f4519b0)) {
                        uVar.F.b(uVar.f4517a, format2, mVar.f305x, mVar.f306y, mVar.B);
                    }
                    uVar.f4519b0 = format2;
                }
                if (arrayList.isEmpty() || ((m) arrayList.get(0)).f4497g0) {
                    int iW = uVar.Q[i11].w(cVar, dVar, i10, uVar.f4534o0);
                    if (iW == -5) {
                        Format formatG = (Format) cVar.f12354g;
                        formatG.getClass();
                        if (i11 == uVar.W) {
                            int iV = uVar.Q[i11].v();
                            while (i12 < arrayList.size() && ((m) arrayList.get(i12)).G != iV) {
                                i12++;
                            }
                            if (i12 < arrayList.size()) {
                                format = ((m) arrayList.get(i12)).f304r;
                            } else {
                                format = uVar.f4518a0;
                                format.getClass();
                            }
                            formatG = formatG.g(format);
                        }
                        cVar.f12354g = formatG;
                    }
                    return iW;
                }
            }
        }
        return -3;
    }
}
