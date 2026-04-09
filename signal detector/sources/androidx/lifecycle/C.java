package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import p.C2767b;
import q.C2785c;
import q.C2786d;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f5176k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f5177a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final q.f f5178b = new q.f();

    /* renamed from: c, reason: collision with root package name */
    public int f5179c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5180d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5181e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5182f;

    /* renamed from: g, reason: collision with root package name */
    public int f5183g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5184h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C0.k f5185j;

    public C() {
        Object obj = f5176k;
        this.f5182f = obj;
        this.f5185j = new C0.k(18, this);
        this.f5181e = obj;
        this.f5183g = -1;
    }

    public static void a(String str) {
        C2767b.F().i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(A.f.m("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b5) {
        if (b5.f5173b) {
            if (!b5.h()) {
                b5.c(false);
                return;
            }
            int i = b5.f5174c;
            int i3 = this.f5183g;
            if (i >= i3) {
                return;
            }
            b5.f5174c = i3;
            b5.f5172a.b(this.f5181e);
        }
    }

    public final void c(B b5) {
        if (this.f5184h) {
            this.i = true;
            return;
        }
        this.f5184h = true;
        do {
            this.i = false;
            if (b5 != null) {
                b(b5);
                b5 = null;
            } else {
                q.f fVar = this.f5178b;
                fVar.getClass();
                C2786d c2786d = new C2786d(fVar);
                fVar.f22903c.put(c2786d, Boolean.FALSE);
                while (c2786d.hasNext()) {
                    b((B) ((Map.Entry) c2786d.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.f5184h = false;
    }

    public final Object d() {
        Object obj = this.f5181e;
        if (obj != f5176k) {
            return obj;
        }
        return null;
    }

    public final void e(InterfaceC0298u interfaceC0298u, E e6) {
        Object obj;
        a("observe");
        if (interfaceC0298u.j().f5259d == EnumC0292n.f5243a) {
            return;
        }
        A a6 = new A(this, interfaceC0298u, e6);
        q.f fVar = this.f5178b;
        C2785c c2785cA = fVar.a(e6);
        if (c2785cA != null) {
            obj = c2785cA.f22895b;
        } else {
            C2785c c2785c = new C2785c(e6, a6);
            fVar.f22904d++;
            C2785c c2785c2 = fVar.f22902b;
            if (c2785c2 == null) {
                fVar.f22901a = c2785c;
                fVar.f22902b = c2785c;
            } else {
                c2785c2.f22896c = c2785c;
                c2785c.f22897d = c2785c2;
                fVar.f22902b = c2785c;
            }
            obj = null;
        }
        B b5 = (B) obj;
        if (b5 != null && !b5.g(interfaceC0298u)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (b5 != null) {
            return;
        }
        interfaceC0298u.j().a(a6);
    }

    public void f() {
    }

    public void g() {
    }

    public void h(Object obj) {
        boolean z6;
        synchronized (this.f5177a) {
            z6 = this.f5182f == f5176k;
            this.f5182f = obj;
        }
        if (z6) {
            C2767b.F().G(this.f5185j);
        }
    }

    public final void i(E e6) {
        a("removeObserver");
        B b5 = (B) this.f5178b.b(e6);
        if (b5 == null) {
            return;
        }
        b5.f();
        b5.c(false);
    }

    public void j(Object obj) {
        a("setValue");
        this.f5183g++;
        this.f5181e = obj;
        c(null);
    }
}
