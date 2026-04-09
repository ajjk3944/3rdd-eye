package e5;

import androidx.media3.common.a1;
import androidx.media3.common.s0;
import androidx.media3.common.y0;
import oe.u0;
import oe.z0;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7947a;

    /* renamed from: b, reason: collision with root package name */
    public oe.h0 f7948b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f7949c;

    /* renamed from: d, reason: collision with root package name */
    public o5.z f7950d;

    /* renamed from: e, reason: collision with root package name */
    public o5.z f7951e;

    /* renamed from: f, reason: collision with root package name */
    public o5.z f7952f;

    public y(y0 y0Var) {
        this.f7947a = y0Var;
        oe.f0 f0Var = oe.h0.f19336d;
        this.f7948b = u0.f19383x;
        this.f7949c = z0.B;
    }

    public static o5.z b(s0 s0Var, oe.h0 h0Var, o5.z zVar, y0 y0Var) {
        a1 currentTimeline = s0Var.getCurrentTimeline();
        int currentPeriodIndex = s0Var.getCurrentPeriodIndex();
        Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
        int iB = (s0Var.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, y0Var, false).b(a5.d0.G(s0Var.getCurrentPosition()) - y0Var.f1831x);
        for (int i10 = 0; i10 < h0Var.size(); i10++) {
            o5.z zVar2 = (o5.z) h0Var.get(i10);
            if (c(zVar2, objL, s0Var.isPlayingAd(), s0Var.getCurrentAdGroupIndex(), s0Var.getCurrentAdIndexInAdGroup(), iB)) {
                return zVar2;
            }
        }
        if (h0Var.isEmpty() && zVar != null && c(zVar, objL, s0Var.isPlayingAd(), s0Var.getCurrentAdGroupIndex(), s0Var.getCurrentAdIndexInAdGroup(), iB)) {
            return zVar;
        }
        return null;
    }

    public static boolean c(o5.z zVar, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = zVar.f1689a;
        int i13 = zVar.f1690b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && zVar.f1691c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && zVar.f1693e == i12;
    }

    public final void a(bc.f0 f0Var, o5.z zVar, a1 a1Var) {
        if (zVar == null) {
            return;
        }
        if (a1Var.b(zVar.f1689a) != -1) {
            f0Var.r(zVar, a1Var);
            return;
        }
        a1 a1Var2 = (a1) this.f7949c.get(zVar);
        if (a1Var2 != null) {
            f0Var.r(zVar, a1Var2);
        }
    }

    public final void d(a1 a1Var) {
        bc.f0 f0Var = new bc.f0(4, 8);
        if (this.f7948b.isEmpty()) {
            a(f0Var, this.f7951e, a1Var);
            if (!a.a.k(this.f7952f, this.f7951e)) {
                a(f0Var, this.f7952f, a1Var);
            }
            if (!a.a.k(this.f7950d, this.f7951e) && !a.a.k(this.f7950d, this.f7952f)) {
                a(f0Var, this.f7950d, a1Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f7948b.size(); i10++) {
                a(f0Var, (o5.z) this.f7948b.get(i10), a1Var);
            }
            if (!this.f7948b.contains(this.f7950d)) {
                a(f0Var, this.f7950d, a1Var);
            }
        }
        this.f7949c = f0Var.c();
    }
}
