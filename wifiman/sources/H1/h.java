package h1;

import g1.AbstractC5849g;
import g1.InterfaceC5848f;

/* loaded from: classes.dex */
public class h implements e, InterfaceC5848f {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC5849g f48387a;

    /* renamed from: b, reason: collision with root package name */
    private int f48388b;

    /* renamed from: c, reason: collision with root package name */
    private j1.h f48389c;

    /* renamed from: d, reason: collision with root package name */
    private int f48390d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f48391e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f48392f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private Object f48393g;

    public h(AbstractC5849g abstractC5849g) {
        this.f48387a = abstractC5849g;
    }

    @Override // h1.e, g1.InterfaceC5848f
    public j1.e a() {
        if (this.f48389c == null) {
            this.f48389c = new j1.h();
        }
        return this.f48389c;
    }

    @Override // h1.e, g1.InterfaceC5848f
    public void apply() {
        this.f48389c.j1(this.f48388b);
        int i10 = this.f48390d;
        if (i10 != -1) {
            this.f48389c.g1(i10);
            return;
        }
        int i11 = this.f48391e;
        if (i11 != -1) {
            this.f48389c.h1(i11);
        } else {
            this.f48389c.i1(this.f48392f);
        }
    }

    @Override // g1.InterfaceC5848f
    public void b(Object obj) {
        this.f48393g = obj;
    }

    @Override // g1.InterfaceC5848f
    public e c() {
        return null;
    }

    @Override // g1.InterfaceC5848f
    public void d(j1.e eVar) {
        if (eVar instanceof j1.h) {
            this.f48389c = (j1.h) eVar;
        } else {
            this.f48389c = null;
        }
    }

    public h e(Object obj) {
        this.f48390d = -1;
        this.f48391e = this.f48387a.e(obj);
        this.f48392f = 0.0f;
        return this;
    }

    public h f(float f10) {
        this.f48390d = -1;
        this.f48391e = -1;
        this.f48392f = f10;
        return this;
    }

    public void g(int i10) {
        this.f48388b = i10;
    }

    @Override // g1.InterfaceC5848f
    public Object getKey() {
        return this.f48393g;
    }

    public h h(Object obj) {
        this.f48390d = this.f48387a.e(obj);
        this.f48391e = -1;
        this.f48392f = 0.0f;
        return this;
    }
}
