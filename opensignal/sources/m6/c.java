package m6;

import a5.d0;
import a5.v;
import androidx.media3.common.k0;
import h7.p;
import ka.h;
import u5.b0;
import u5.k;
import u5.l;
import u5.m;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public m f16308a;

    /* renamed from: b, reason: collision with root package name */
    public h f16309b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16310c;

    public final boolean a(l lVar) {
        boolean zC;
        ka.e eVar = new ka.e(1);
        if (eVar.b(lVar, true) && (eVar.f14239a & 2) == 2) {
            int iMin = Math.min(eVar.f14243e, 8);
            v vVar = new v(iMin);
            lVar.p(vVar.f165a, 0, iMin);
            vVar.E(0);
            if (vVar.a() >= 5 && vVar.t() == 127 && vVar.u() == 1179402563) {
                this.f16309b = new b(1);
                return true;
            }
            vVar.E(0);
            try {
                zC = b0.c(1, vVar, true);
            } catch (k0 unused) {
                zC = false;
            }
            if (zC) {
                this.f16309b = new f(1);
            } else {
                vVar.E(0);
                if (e.g(vVar, e.f16311p)) {
                    this.f16309b = new e(1);
                }
            }
            return true;
        }
        return false;
    }

    @Override // u5.k
    public final void c(long j, long j7) {
        h hVar = this.f16309b;
        if (hVar != null) {
            p pVar = (p) hVar.j;
            ka.e eVar = (ka.e) pVar.f10182e;
            eVar.f14239a = 0;
            eVar.f14240b = 0L;
            eVar.f14241c = 0;
            eVar.f14242d = 0;
            eVar.f14243e = 0;
            ((v) pVar.f10183f).B(0);
            pVar.f10179b = -1;
            pVar.f10181d = false;
            if (j == 0) {
                hVar.f(!hVar.f14255h);
                return;
            }
            if (hVar.f14252e != 0) {
                long j10 = (hVar.f14253f * j7) / 1000000;
                hVar.f14249b = j10;
                d dVar = (d) hVar.f14258m;
                int i10 = d0.f105a;
                dVar.d(j10);
                hVar.f14252e = 2;
            }
        }
    }

    @Override // u5.k
    public final void f(m mVar) {
        this.f16308a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018f  */
    @Override // u5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(u5.l r21, ca.n r22) throws androidx.media3.common.k0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.c.g(u5.l, ca.n):int");
    }

    @Override // u5.k
    public final boolean h(l lVar) {
        try {
            return a(lVar);
        } catch (k0 unused) {
            return false;
        }
    }

    @Override // u5.k
    public final void release() {
    }
}
