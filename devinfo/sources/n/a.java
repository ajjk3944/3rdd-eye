package n;

import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29438a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29439b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29440c;

    public View a() {
        if (this.f29439b) {
            throw new IllegalStateException("this ad destroyed!");
        }
        return (ViewGroup) this.f29440c;
    }

    public void b() {
        if (this.f29439b) {
            return;
        }
        c();
        this.f29440c = null;
        this.f29439b = true;
    }

    public abstract void c();

    public abstract void d();

    public abstract View e();

    public void finalize() throws Throwable {
        switch (this.f29438a) {
            case 1:
                super.finalize();
                b();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public abstract o.m g();

    public abstract MenuInflater h();

    public abstract CharSequence i();

    public abstract CharSequence j();

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i4);

    public abstract void o(CharSequence charSequence);

    public abstract void p(int i4);

    public abstract void q(CharSequence charSequence);

    public abstract void r(boolean z3);

    public a(ViewGroup viewGroup) {
        this.f29438a = 1;
        this.f29439b = false;
        this.f29440c = viewGroup;
    }
}
