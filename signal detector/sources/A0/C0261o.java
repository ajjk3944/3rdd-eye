package a0;

import c5.C0412i;
import h5.InterfaceC2370d;

/* renamed from: a0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261o extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0245D f4591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0261o(AbstractC0245D abstractC0245D, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4591f = abstractC0245D;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0261o) j((InterfaceC2370d) obj2, (AbstractC0245D) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        C0261o c0261o = new C0261o(this.f4591f, interfaceC2370d);
        c0261o.f4590e = obj;
        return c0261o;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        AbstractC0245D abstractC0245D = (AbstractC0245D) this.f4590e;
        AbstractC0245D abstractC0245D2 = this.f4591f;
        boolean z6 = false;
        if (!(abstractC0245D2 instanceof C0247a) && !(abstractC0245D2 instanceof C0253g) && abstractC0245D == abstractC0245D2) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
