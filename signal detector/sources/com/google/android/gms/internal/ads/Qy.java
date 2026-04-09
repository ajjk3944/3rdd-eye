package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Qy implements InterfaceC2151xy {

    /* renamed from: a, reason: collision with root package name */
    public final Xx f10813a;

    /* renamed from: b, reason: collision with root package name */
    public final Py f10814b;

    /* renamed from: c, reason: collision with root package name */
    public final Ny f10815c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f10816d;

    /* renamed from: e, reason: collision with root package name */
    public final C1948uA f10817e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10818f = new AtomicReference();

    public Qy(Xx xx, Py py, Ny ny, ExecutorService executorService, C1948uA c1948uA) {
        this.f10813a = xx;
        this.f10814b = py;
        this.f10815c = ny;
        this.f10816d = executorService;
        this.f10817e = c1948uA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2151xy
    public final InterfaceFutureC2326a a() {
        Xx xx = this.f10813a;
        int iD = xx.D();
        boolean zF = xx.F();
        Py py = this.f10814b;
        py.getClass();
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(AbstractC1984ut.z(new Oy(py, iD), py.f10544d));
        C1704pi c1704pi = C1704pi.f16212n;
        EnumC2059wD enumC2059wD = EnumC2059wD.f17407a;
        C1306iD c1306iDF = AbstractC1984ut.F(abstractC2221zDR, c1704pi, enumC2059wD);
        if (zF && iD != 2) {
            c1306iDF = AbstractC1984ut.F(AbstractC1984ut.C(AbstractC2221zD.r(c1306iDF), Throwable.class, C1563n2.f15728u, enumC2059wD), new C0738Tb(py), enumC2059wD);
        }
        C1358jD c1358jDG = AbstractC1984ut.G(AbstractC2221zD.r(c1306iDF), new C1754qe(9, this), enumC2059wD);
        c1358jDG.a(new CD(c1358jDG, 0, new C1448kw(2, this)), this.f10816d);
        return c1358jDG;
    }
}
