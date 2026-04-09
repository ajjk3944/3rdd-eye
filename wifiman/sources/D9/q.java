package D9;

import Y0.r;
import Y0.t;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;
import l0.C6537m;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class q implements androidx.compose.ui.window.q {

    /* renamed from: a, reason: collision with root package name */
    private final C6533i f3175a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0.d f3176b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6839p f3177c;

    public q(C6533i anchor, Y0.d density, InterfaceC6839p onSizeAndPositionChanged) {
        AbstractC6492s.i(anchor, "anchor");
        AbstractC6492s.i(density, "density");
        AbstractC6492s.i(onSizeAndPositionChanged, "onSizeAndPositionChanged");
        this.f3175a = anchor;
        this.f3176b = density;
        this.f3177c = onSizeAndPositionChanged;
    }

    @Override // androidx.compose.ui.window.q
    public long a(Y0.p anchorBounds, long j10, t layoutDirection, long j11) {
        AbstractC6492s.i(anchorBounds, "anchorBounds");
        AbstractC6492s.i(layoutDirection, "layoutDirection");
        float density = this.f3176b.getDensity() * 16;
        float fN = (this.f3175a.e() + density) + ((float) r.f(j11)) > ((float) r.f(j10)) ? (this.f3175a.n() - density) - r.f(j11) : this.f3175a.e() + density;
        int iK = (int) ((this.f3175a.k() + (C6537m.i(this.f3175a.m()) / 2)) - (r.g(j11) / 2));
        if (iK < 0) {
            iK = this.f3175a.k() + ((float) r.g(j11)) > ((float) r.g(j10)) - density ? ((int) this.f3175a.k()) - ((int) density) : (int) this.f3175a.k();
        } else if (r.g(j11) + iK > r.g(j10)) {
            iK = ((int) this.f3175a.l()) - r.g(j11);
        }
        long jA = Y0.o.a(iK, (int) fN);
        this.f3177c.invoke(Y0.n.b(jA), r.b(j11));
        return jA;
    }
}
