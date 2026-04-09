package E;

import C.J;
import o0.b;

/* compiled from: RequestWithCallback.java */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final E f1278a;

    /* renamed from: b, reason: collision with root package name */
    public final D f1279b;

    /* renamed from: e, reason: collision with root package name */
    public b.a<Void> f1282e;

    /* renamed from: f, reason: collision with root package name */
    public b.a<Void> f1283f;
    public I.b i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1284g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1285h = false;

    /* renamed from: c, reason: collision with root package name */
    public final b.d f1280c = o0.b.a(new B.f(this, 3));

    /* renamed from: d, reason: collision with root package name */
    public final b.d f1281d = o0.b.a(new B8.b(this, 1));

    public B(E e4, D d10) {
        this.f1278a = e4;
        this.f1279b = d10;
    }

    public final void a() {
        A2.l.q("The callback can only complete once.", !this.f1281d.f44804c.isDone());
        this.f1283f.b(null);
    }

    public final void b() {
        G.n.a();
        if (this.f1284g || this.f1285h) {
            return;
        }
        this.f1285h = true;
        E e4 = this.f1278a;
        e4.d();
        J.e eVarF = e4.f();
        if (eVarF != null) {
            eVarF.a();
        }
    }
}
