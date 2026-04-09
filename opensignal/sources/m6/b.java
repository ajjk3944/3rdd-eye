package m6;

import a5.v;
import androidx.media3.common.r;
import ca.p;
import io.sentry.t;
import java.util.Arrays;
import ka.h;
import u5.o;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: o, reason: collision with root package name */
    public o f16306o;

    /* renamed from: p, reason: collision with root package name */
    public io.sentry.android.replay.gestures.c f16307p;

    @Override // ka.h
    public final long b(v vVar) {
        byte[] bArr = vVar.f165a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            vVar.F(4);
            vVar.z();
        }
        int iS = u5.b.s(i10, vVar);
        vVar.E(0);
        return iS;
    }

    @Override // ka.h
    public final boolean d(v vVar, long j, t tVar) {
        byte[] bArr = vVar.f165a;
        o oVar = this.f16306o;
        if (oVar == null) {
            o oVar2 = new o(17, bArr);
            this.f16306o = oVar2;
            tVar.f12736a = oVar2.c(Arrays.copyOfRange(bArr, 9, vVar.f167c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & 127) != 3) {
            if (b2 != -1) {
                return true;
            }
            io.sentry.android.replay.gestures.c cVar = this.f16307p;
            if (cVar != null) {
                cVar.f11921d = j;
                tVar.f12737d = cVar;
            }
            ((r) tVar.f12736a).getClass();
            return false;
        }
        p pVarT = u5.b.t(vVar);
        o oVar3 = new o(oVar.f23299a, oVar.f23300b, oVar.f23301c, oVar.f23302d, oVar.f23303e, oVar.f23305g, oVar.f23306h, oVar.j, pVarT, oVar.f23308l);
        this.f16306o = oVar3;
        io.sentry.android.replay.gestures.c cVar2 = new io.sentry.android.replay.gestures.c(3);
        cVar2.f11923r = oVar3;
        cVar2.f11924x = pVarT;
        cVar2.f11921d = -1L;
        cVar2.f11922g = -1L;
        this.f16307p = cVar2;
        return true;
    }

    @Override // ka.h
    public final void f(boolean z10) {
        super.f(z10);
        if (z10) {
            this.f16306o = null;
            this.f16307p = null;
        }
    }
}
