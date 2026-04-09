package L0;

import android.view.ViewGroup;

/* renamed from: L0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158c extends m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2423a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2424b;

    public C0158c(ViewGroup viewGroup) {
        this.f2424b = viewGroup;
    }

    @Override // L0.m, L0.j
    public final void a(l lVar) {
        a4.p.t(this.f2424b, false);
        this.f2423a = true;
    }

    @Override // L0.m, L0.j
    public final void b() {
        a4.p.t(this.f2424b, false);
    }

    @Override // L0.j
    public final void c(l lVar) {
        if (!this.f2423a) {
            a4.p.t(this.f2424b, false);
        }
        lVar.y(this);
    }

    @Override // L0.m, L0.j
    public final void e() {
        a4.p.t(this.f2424b, true);
    }
}
