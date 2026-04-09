package ka;

import ca.k;
import ca.l;
import ca.m;
import com.google.android.exoplayer2.y0;
import h7.p;
import java.util.Arrays;
import qb.v;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a, reason: collision with root package name */
    public m f14236a;

    /* renamed from: b, reason: collision with root package name */
    public h f14237b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14238c;

    public final boolean a(l lVar) {
        boolean zJ0;
        boolean zEquals;
        e eVar = new e(0);
        if (eVar.a(lVar, true) && (eVar.f14239a & 2) == 2) {
            int iMin = Math.min(eVar.f14243e, 8);
            fb.f fVar = new fb.f(iMin);
            lVar.p(fVar.f8800a, 0, iMin);
            fVar.y(0);
            if (fVar.a() >= 5 && fVar.o() == 127 && fVar.p() == 1179402563) {
                this.f14237b = new c(0);
                return true;
            }
            fVar.y(0);
            try {
                zJ0 = io.sentry.config.a.j0(1, fVar, true);
            } catch (y0 unused) {
                zJ0 = false;
            }
            if (zJ0) {
                this.f14237b = new i(0);
            } else {
                fVar.y(0);
                if (fVar.a() < 8) {
                    zEquals = false;
                } else {
                    byte[] bArr = new byte[8];
                    fVar.c(bArr, 0, 8);
                    zEquals = Arrays.equals(bArr, g.f14246p);
                }
                if (zEquals) {
                    this.f14237b = new g(0);
                }
            }
            return true;
        }
        return false;
    }

    @Override // ca.k
    public final void c(long j, long j7) {
        h hVar = this.f14237b;
        if (hVar != null) {
            p pVar = (p) hVar.j;
            e eVar = (e) pVar.f10182e;
            eVar.f14239a = 0;
            eVar.f14240b = 0L;
            eVar.f14241c = 0;
            eVar.f14242d = 0;
            eVar.f14243e = 0;
            ((fb.f) pVar.f10183f).v(0);
            pVar.f10179b = -1;
            pVar.f10181d = false;
            if (j == 0) {
                hVar.f(!hVar.f14255h);
                return;
            }
            if (hVar.f14252e != 0) {
                long j10 = (hVar.f14253f * j7) / 1000000;
                hVar.f14249b = j10;
                f fVar = (f) hVar.f14258m;
                int i10 = v.f20828a;
                fVar.d(j10);
                hVar.f14252e = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    @Override // ca.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(ca.l r21, ca.n r22) throws com.google.android.exoplayer2.y0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.d.f(ca.l, ca.n):int");
    }

    @Override // ca.k
    public final boolean g(l lVar) {
        try {
            return a(lVar);
        } catch (y0 unused) {
            return false;
        }
    }

    @Override // ca.k
    public final void h(m mVar) {
        this.f14236a = mVar;
    }

    @Override // ca.k
    public final void release() {
    }
}
