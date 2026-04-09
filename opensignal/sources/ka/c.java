package ka;

import ca.p;
import ca.q;
import com.google.android.exoplayer2.Format;
import io.sentry.t;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: o, reason: collision with root package name */
    public q f14234o;

    /* renamed from: p, reason: collision with root package name */
    public io.sentry.android.replay.gestures.c f14235p;

    @Override // ka.h
    public final long c(fb.f fVar) {
        byte[] bArr = fVar.f8800a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            fVar.z(4);
            fVar.u();
        }
        int iE = i3.g.E(i10, fVar);
        fVar.y(0);
        return iE;
    }

    @Override // ka.h
    public final boolean e(fb.f fVar, long j, t tVar) {
        byte[] bArr = fVar.f8800a;
        q qVar = this.f14234o;
        if (qVar == null) {
            q qVar2 = new q(17, bArr);
            this.f14234o = qVar2;
            tVar.f12736a = qVar2.d(Arrays.copyOfRange(bArr, 9, fVar.f8802c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & 127) != 3) {
            if (b2 != -1) {
                return true;
            }
            io.sentry.android.replay.gestures.c cVar = this.f14235p;
            if (cVar != null) {
                cVar.f11921d = j;
                tVar.f12737d = cVar;
            }
            ((Format) tVar.f12736a).getClass();
            return false;
        }
        p pVarG = ic.a.G(fVar);
        q qVar3 = new q(qVar.f3491a, qVar.f3492b, qVar.f3493c, qVar.f3494d, qVar.f3495e, qVar.f3497g, qVar.f3498h, qVar.j, pVarG, qVar.f3500l);
        this.f14234o = qVar3;
        io.sentry.android.replay.gestures.c cVar2 = new io.sentry.android.replay.gestures.c(1);
        cVar2.f11923r = qVar3;
        cVar2.f11924x = pVarG;
        cVar2.f11921d = -1L;
        cVar2.f11922g = -1L;
        this.f14235p = cVar2;
        return true;
    }

    @Override // ka.h
    public final void f(boolean z10) {
        super.f(z10);
        if (z10) {
            this.f14234o = null;
            this.f14235p = null;
        }
    }
}
