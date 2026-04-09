package G3;

import a.AbstractC0241a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0241a f1612a = new m();

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0241a f1613b = new m();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0241a f1614c = new m();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0241a f1615d = new m();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0150d f1616e = new C0147a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0150d f1617f = new C0147a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0150d f1618g = new C0147a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0150d f1619h = new C0147a(0.0f);
    public C0152f i;

    /* renamed from: j, reason: collision with root package name */
    public C0152f f1620j;

    /* renamed from: k, reason: collision with root package name */
    public C0152f f1621k;

    /* renamed from: l, reason: collision with root package name */
    public C0152f f1622l;

    public n() {
        int i = 0;
        this.i = new C0152f(i);
        this.f1620j = new C0152f(i);
        this.f1621k = new C0152f(i);
        this.f1622l = new C0152f(i);
    }

    public static void b(AbstractC0241a abstractC0241a) {
        if (abstractC0241a instanceof m) {
            ((m) abstractC0241a).getClass();
        } else if (abstractC0241a instanceof C0151e) {
            ((C0151e) abstractC0241a).getClass();
        }
    }

    public final o a() {
        o oVar = new o();
        oVar.f1624a = this.f1612a;
        oVar.f1625b = this.f1613b;
        oVar.f1626c = this.f1614c;
        oVar.f1627d = this.f1615d;
        oVar.f1628e = this.f1616e;
        oVar.f1629f = this.f1617f;
        oVar.f1630g = this.f1618g;
        oVar.f1631h = this.f1619h;
        oVar.i = this.i;
        oVar.f1632j = this.f1620j;
        oVar.f1633k = this.f1621k;
        oVar.f1634l = this.f1622l;
        return oVar;
    }

    public final void c(float f2) {
        this.f1616e = new C0147a(f2);
        this.f1617f = new C0147a(f2);
        this.f1618g = new C0147a(f2);
        this.f1619h = new C0147a(f2);
    }
}
