package x9;

import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.w1;
import oe.f0;
import oe.h0;
import oe.u0;
import oe.z0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f25175a;

    /* renamed from: b, reason: collision with root package name */
    public h0 f25176b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f25177c;

    /* renamed from: d, reason: collision with root package name */
    public ya.v f25178d;

    /* renamed from: e, reason: collision with root package name */
    public ya.v f25179e;

    /* renamed from: f, reason: collision with root package name */
    public ya.v f25180f;

    public p(u1 u1Var) {
        this.f25175a = u1Var;
        f0 f0Var = h0.f19336d;
        this.f25176b = u0.f19383x;
        this.f25177c = z0.B;
    }

    public static ya.v b(g1 g1Var, h0 h0Var, ya.v vVar, u1 u1Var) {
        w1 currentTimeline = g1Var.getCurrentTimeline();
        int currentPeriodIndex = g1Var.getCurrentPeriodIndex();
        Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
        int iB = (g1Var.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, u1Var, false).b(com.google.android.exoplayer2.h.c(g1Var.getCurrentPosition()) - u1Var.f4598e);
        for (int i10 = 0; i10 < h0Var.size(); i10++) {
            ya.v vVar2 = (ya.v) h0Var.get(i10);
            if (c(vVar2, objL, g1Var.isPlayingAd(), g1Var.getCurrentAdGroupIndex(), g1Var.getCurrentAdIndexInAdGroup(), iB)) {
                return vVar2;
            }
        }
        if (h0Var.isEmpty() && vVar != null && c(vVar, objL, g1Var.isPlayingAd(), g1Var.getCurrentAdGroupIndex(), g1Var.getCurrentAdIndexInAdGroup(), iB)) {
            return vVar;
        }
        return null;
    }

    public static boolean c(ya.v vVar, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = vVar.f26177a;
        int i13 = vVar.f26178b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && vVar.f26179c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && vVar.f26181e == i12;
    }

    public final void a(bc.f0 f0Var, ya.v vVar, w1 w1Var) {
        if (vVar == null) {
            return;
        }
        if (w1Var.b(vVar.f26177a) != -1) {
            f0Var.r(vVar, w1Var);
            return;
        }
        w1 w1Var2 = (w1) this.f25177c.get(vVar);
        if (w1Var2 != null) {
            f0Var.r(vVar, w1Var2);
        }
    }

    public final void d(w1 w1Var) {
        bc.f0 f0Var = new bc.f0(4, 8);
        if (this.f25176b.isEmpty()) {
            a(f0Var, this.f25179e, w1Var);
            if (!a.a.k(this.f25180f, this.f25179e)) {
                a(f0Var, this.f25180f, w1Var);
            }
            if (!a.a.k(this.f25178d, this.f25179e) && !a.a.k(this.f25178d, this.f25180f)) {
                a(f0Var, this.f25178d, w1Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f25176b.size(); i10++) {
                a(f0Var, (ya.v) this.f25176b.get(i10), w1Var);
            }
            if (!this.f25176b.contains(this.f25178d)) {
                a(f0Var, this.f25178d, w1Var);
            }
        }
        this.f25177c = f0Var.c();
    }
}
