package j6;

import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27404a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f27405b;

    public d(ViewGroup viewGroup) {
        this.f27405b = viewGroup;
    }

    @Override // j6.p, j6.m
    public final void b() {
        u6.t.r(this.f27405b, false);
    }

    @Override // j6.p, j6.m
    public final void c(o oVar) {
        u6.t.r(this.f27405b, false);
        this.f27404a = true;
    }

    @Override // j6.p, j6.m
    public final void d(o oVar) {
        if (!this.f27404a) {
            u6.t.r(this.f27405b, false);
        }
        oVar.z(this);
    }

    @Override // j6.p, j6.m
    public final void f() {
        u6.t.r(this.f27405b, true);
    }
}
