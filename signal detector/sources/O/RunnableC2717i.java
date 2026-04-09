package o;

import android.view.View;
import n.InterfaceC2675i;
import n.MenuC2677k;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2717i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C2713g f22520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2723l f22521b;

    public RunnableC2717i(C2723l c2723l, C2713g c2713g) {
        this.f22521b = c2723l;
        this.f22520a = c2713g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2675i interfaceC2675i;
        C2723l c2723l = this.f22521b;
        MenuC2677k menuC2677k = c2723l.f22555c;
        if (menuC2677k != null && (interfaceC2675i = menuC2677k.f22080e) != null) {
            interfaceC2675i.o(menuC2677k);
        }
        View view = (View) c2723l.f22560h;
        if (view != null && view.getWindowToken() != null) {
            C2713g c2713g = this.f22520a;
            if (c2713g.b()) {
                c2723l.f22548H = c2713g;
            } else if (c2713g.f22135e != null) {
                c2713g.d(0, 0, false, false);
                c2723l.f22548H = c2713g;
            }
        }
        c2723l.f22550J = null;
    }
}
