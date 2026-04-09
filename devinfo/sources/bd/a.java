package bd;

import android.graphics.Typeface;
import me.t1;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f2117a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f2118b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2119c;

    public a(d0 d0Var, Typeface typeface) {
        this.f2117a = typeface;
        this.f2118b = d0Var;
    }

    @Override // me.t1
    public final void w(int i4) {
        if (this.f2119c) {
            return;
        }
        zc.b bVar = (zc.b) this.f2118b.f30011b;
        if (bVar.l(this.f2117a)) {
            bVar.j(false);
        }
    }

    @Override // me.t1
    public final void x(Typeface typeface, boolean z3) {
        if (this.f2119c) {
            return;
        }
        zc.b bVar = (zc.b) this.f2118b.f30011b;
        if (bVar.l(typeface)) {
            bVar.j(false);
        }
    }
}
