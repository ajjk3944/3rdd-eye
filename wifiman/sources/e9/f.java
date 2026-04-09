package E9;

import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC6839p f4394a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6824a f4395b;

    public static /* synthetic */ void b(f fVar, Float f10, Float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            f11 = null;
        }
        fVar.a(f10, f11);
    }

    public final void a(Float f10, Float f11) {
        InterfaceC6839p interfaceC6839p = this.f4394a;
        if (interfaceC6839p != null) {
            interfaceC6839p.invoke(f10, f11);
        }
    }

    public final void c(InterfaceC6824a interfaceC6824a) {
        this.f4395b = interfaceC6824a;
    }

    public final void d(InterfaceC6839p interfaceC6839p) {
        this.f4394a = interfaceC6839p;
    }
}
