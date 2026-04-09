package oc;

import gg.i;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: oc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7117b implements InterfaceC7116a, InterfaceC7118c {

    /* renamed from: a, reason: collision with root package name */
    private final Fg.a f55607a;

    /* renamed from: b, reason: collision with root package name */
    private final Fg.a f55608b;

    /* renamed from: c, reason: collision with root package name */
    private final i f55609c;

    /* renamed from: d, reason: collision with root package name */
    private final i f55610d;

    public C7117b() {
        Boolean bool = Boolean.FALSE;
        Fg.a aVarK2 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f55607a = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(bool);
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f55608b = aVarK22;
        i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f55609c = iVarI2;
        i iVarI22 = aVarK22.e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f55610d = iVarI22;
    }

    @Override // oc.InterfaceC7118c
    public void a() {
        this.f55608b.h(Boolean.TRUE);
    }

    @Override // oc.InterfaceC7118c
    public void b() {
        this.f55607a.h(Boolean.FALSE);
    }

    @Override // oc.InterfaceC7118c
    public void c() {
        this.f55608b.h(Boolean.FALSE);
    }

    @Override // oc.InterfaceC7118c
    public void d() {
        this.f55607a.h(Boolean.TRUE);
    }
}
