package k0;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0300w;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import c.InterfaceC0373M;
import h.AbstractActivityC2349g;

/* loaded from: classes.dex */
public final class x extends I5.b implements b0, InterfaceC0373M, F0.g, N {
    public final AbstractActivityC2349g i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractActivityC2349g f21726j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f21727k;

    /* renamed from: l, reason: collision with root package name */
    public final K f21728l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2349g f21729m;

    public x(AbstractActivityC2349g abstractActivityC2349g) {
        this.f21729m = abstractActivityC2349g;
        Handler handler = new Handler();
        this.f21728l = new K();
        this.i = abstractActivityC2349g;
        this.f21726j = abstractActivityC2349g;
        this.f21727k = handler;
    }

    @Override // androidx.lifecycle.b0
    public final a0 d() {
        return this.f21729m.d();
    }

    @Override // F0.g
    public final F0.f f() {
        return (F0.f) this.f21729m.f5857d.f139b;
    }

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        return this.f21729m.f20342J;
    }

    @Override // I5.b
    public final View u(int i) {
        return this.f21729m.findViewById(i);
    }

    @Override // I5.b
    public final boolean v() {
        Window window = this.f21729m.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // k0.N
    public final void a(K k6, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
    }
}
