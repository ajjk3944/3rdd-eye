package A9;

import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public final class S0<T> extends F9.v<T> {

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal<b9.l<InterfaceC4350h, Object>> f208f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public S0(InterfaceC4347e interfaceC4347e, InterfaceC4350h interfaceC4350h) {
        T0 t02 = T0.f210b;
        super(interfaceC4347e, interfaceC4350h.get(t02) == null ? interfaceC4350h.plus(t02) : interfaceC4350h);
        this.f208f = new ThreadLocal<>();
        if (interfaceC4347e.getContext().get(InterfaceC4348f.a.f37870b) instanceof A) {
            return;
        }
        Object objC = F9.A.c(interfaceC4350h, null);
        F9.A.a(interfaceC4350h, objC);
        g0(interfaceC4350h, objC);
    }

    public final boolean f0() {
        boolean z10 = this.threadLocalIsSet && this.f208f.get() == null;
        this.f208f.remove();
        return !z10;
    }

    public final void g0(InterfaceC4350h interfaceC4350h, Object obj) {
        this.threadLocalIsSet = true;
        this.f208f.set(new b9.l<>(interfaceC4350h, obj));
    }

    @Override // F9.v, A9.C0605u0
    public final void s(Object obj) {
        if (this.threadLocalIsSet) {
            b9.l<InterfaceC4350h, Object> lVar = this.f208f.get();
            if (lVar != null) {
                F9.A.a(lVar.f18083b, lVar.f18084c);
            }
            this.f208f.remove();
        }
        Object objA = A0.a(obj);
        InterfaceC4347e<T> interfaceC4347e = this.f1784e;
        InterfaceC4350h context = interfaceC4347e.getContext();
        Object objC = F9.A.c(context, null);
        S0<?> s0C = objC != F9.A.f1727a ? C0609x.c(interfaceC4347e, context, objC) : null;
        try {
            this.f1784e.resumeWith(objA);
            C1992A c1992a = C1992A.f18074a;
            if (s0C == null || s0C.f0()) {
                F9.A.a(context, objC);
            }
        } catch (Throwable th) {
            if (s0C == null || s0C.f0()) {
                F9.A.a(context, objC);
            }
            throw th;
        }
    }
}
