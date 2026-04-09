package t7;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class c extends r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22459a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f22460b;

    public c(ViewGroup viewGroup) {
        this.f22460b = viewGroup;
    }

    @Override // t7.r, t7.o
    public final void a() {
        xu.l.Y(this.f22460b, false);
    }

    @Override // t7.r, t7.o
    public final void b(q qVar) {
        xu.l.Y(this.f22460b, false);
        this.f22459a = true;
    }

    @Override // t7.r, t7.o
    public final void c(q qVar) {
        if (!this.f22459a) {
            xu.l.Y(this.f22460b, false);
        }
        qVar.A(this);
    }

    @Override // t7.r, t7.o
    public final void d() {
        xu.l.Y(this.f22460b, true);
    }
}
