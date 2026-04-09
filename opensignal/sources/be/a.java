package be;

import android.graphics.Typeface;
import p.l2;

/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final Typeface f2671f;

    /* renamed from: g, reason: collision with root package name */
    public final l2 f2672g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2673h;

    public a(l2 l2Var, Typeface typeface) {
        this.f2671f = typeface;
        this.f2672g = l2Var;
    }

    @Override // a.a
    public final void y(int i10) {
        if (this.f2673h) {
            return;
        }
        xd.a aVar = (xd.a) this.f2672g.f20100d;
        if (aVar.l(this.f2671f)) {
            aVar.j(false);
        }
    }

    @Override // a.a
    public final void z(Typeface typeface, boolean z10) {
        if (this.f2673h) {
            return;
        }
        xd.a aVar = (xd.a) this.f2672g.f20100d;
        if (aVar.l(typeface)) {
            aVar.j(false);
        }
    }
}
