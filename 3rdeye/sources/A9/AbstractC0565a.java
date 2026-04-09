package A9;

import A9.InterfaceC0594o0;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: AbstractCoroutine.kt */
/* renamed from: A9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0565a<T> extends C0605u0 implements InterfaceC4347e<T>, E {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4350h f219d;

    public AbstractC0565a(InterfaceC4350h interfaceC4350h, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            O((InterfaceC0594o0) interfaceC4350h.get(InterfaceC0594o0.a.f263b));
        }
        this.f219d = interfaceC4350h.plus(this);
    }

    @Override // A9.C0605u0
    public final void N(C0606v c0606v) {
        C.a(this.f219d, c0606v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // A9.C0605u0
    public final void X(Object obj) {
        if (!(obj instanceof C0602t)) {
            e0(obj);
            return;
        }
        C0602t c0602t = (C0602t) obj;
        d0(C0602t.f271b.get(c0602t) != 0, c0602t.f272a);
    }

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        return this.f219d;
    }

    @Override // A9.E
    public final InterfaceC4350h k0() {
        return this.f219d;
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        Throwable thA = b9.m.a(obj);
        if (thA != null) {
            obj = new C0602t(false, thA);
        }
        Object objS = S(obj);
        if (objS == A0.f176b) {
            return;
        }
        s(objS);
    }

    @Override // A9.C0605u0
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void e0(T t10) {
    }

    public void d0(boolean z10, Throwable th) {
    }
}
