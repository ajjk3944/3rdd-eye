package o4;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class x extends ic.a implements androidx.lifecycle.w0, androidx.lifecycle.v, l7.e, m0 {
    public final /* synthetic */ i.j B;

    /* renamed from: g, reason: collision with root package name */
    public final i.j f18877g;

    /* renamed from: r, reason: collision with root package name */
    public final i.j f18878r;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f18879x;

    /* renamed from: y, reason: collision with root package name */
    public final j0 f18880y;

    public x(i.j jVar) {
        this.B = jVar;
        Handler handler = new Handler();
        this.f18877g = jVar;
        this.f18878r = jVar;
        this.f18879x = handler;
        this.f18880y = new j0();
    }

    @Override // ic.a
    public final View B(int i10) {
        return this.B.findViewById(i10);
    }

    @Override // ic.a
    public final boolean C() {
        Window window = this.B.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.lifecycle.w0
    public final androidx.lifecycle.v0 d() {
        return this.B.d();
    }

    @Override // l7.e
    public final io.sentry.t f() {
        return (io.sentry.t) this.B.f3031x.f11197d;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o h() {
        return this.B.O;
    }

    @Override // o4.m0
    public final void a() {
    }
}
