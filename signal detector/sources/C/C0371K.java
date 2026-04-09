package c;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import d5.C2280h;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: c.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371K {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f5802a;

    /* renamed from: b, reason: collision with root package name */
    public final C2280h f5803b = new C2280h();

    /* renamed from: c, reason: collision with root package name */
    public C0372L f5804c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f5805d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f5806e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5808g;

    public C0371K(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallbackA;
        this.f5802a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackA = C0367G.f5795a.a(new C0362B(this, 0), new C0362B(this, 1), new C0363C(this, 0), new C0363C(this, 1));
            } else {
                onBackInvokedCallbackA = C0365E.f5790a.a(new C0363C(this, 2));
            }
            this.f5805d = onBackInvokedCallbackA;
        }
    }

    public final C0369I a(C0372L c0372l) {
        q5.i.e(c0372l, "onBackPressedCallback");
        this.f5803b.addLast(c0372l);
        C0369I c0369i = new C0369I(this, c0372l);
        c0372l.f5810b.add(c0369i);
        e();
        c0372l.f5811c = new C0370J(0, this, C0371K.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        return c0369i;
    }

    public final void b() {
        Object objPrevious;
        if (this.f5804c == null) {
            C2280h c2280h = this.f5803b;
            ListIterator<E> listIterator = c2280h.listIterator(c2280h.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((C0372L) objPrevious).f5809a) {
                        break;
                    }
                }
            }
        }
        this.f5804c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    public final void c() {
        C0372L c0372lPrevious;
        C0372L c0372l = this.f5804c;
        if (c0372l == null) {
            C2280h c2280h = this.f5803b;
            ListIterator listIterator = c2280h.listIterator(c2280h.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0372lPrevious = 0;
                    break;
                } else {
                    c0372lPrevious = listIterator.previous();
                    if (((C0372L) c0372lPrevious).f5809a) {
                        break;
                    }
                }
            }
            c0372l = c0372lPrevious;
        }
        this.f5804c = null;
        if (c0372l == null) {
            this.f5802a.run();
            return;
        }
        switch (c0372l.f5812d) {
            case 0:
                ((p5.l) c0372l.f5813e).f(c0372l);
                break;
            case 1:
                k0.K k6 = (k0.K) c0372l.f5813e;
                k6.x(true);
                if (!k6.f21510h.f5809a) {
                    k6.f21509g.c();
                    break;
                } else {
                    k6.P();
                    break;
                }
            default:
                q0.z zVar = (q0.z) c0372l.f5813e;
                if (!zVar.f23061g.isEmpty()) {
                    q0.v vVarG = zVar.g();
                    q5.i.b(vVarG);
                    if (zVar.n(vVarG.f23043h, true, false)) {
                        zVar.c();
                        break;
                    }
                }
                break;
        }
    }

    public final void d(boolean z6) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f5806e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f5805d) == null) {
            return;
        }
        C0365E c0365e = C0365E.f5790a;
        if (z6 && !this.f5807f) {
            c0365e.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f5807f = true;
        } else {
            if (z6 || !this.f5807f) {
                return;
            }
            c0365e.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f5807f = false;
        }
    }

    public final void e() {
        boolean z6 = this.f5808g;
        boolean z7 = false;
        C2280h c2280h = this.f5803b;
        if (c2280h == null || !c2280h.isEmpty()) {
            Iterator it = c2280h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0372L) it.next()).f5809a) {
                    z7 = true;
                    break;
                }
            }
        }
        this.f5808g = z7;
        if (z7 == z6 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z7);
    }
}
