package Ii;

import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import mh.InterfaceC6839p;

/* renamed from: Ii.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3043a extends D0 implements InterfaceC3091y0, InterfaceC5380e, N {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5384i f9298c;

    public AbstractC3043a(InterfaceC5384i interfaceC5384i, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            g0((InterfaceC3091y0) interfaceC5384i.get(InterfaceC3091y0.f9363O));
        }
        this.f9298c = interfaceC5384i.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ii.D0
    public String H() {
        return S.a(this) + " was cancelled";
    }

    protected void N0(Object obj) {
        w(obj);
    }

    protected void O0(Throwable th2, boolean z10) {
    }

    protected void P0(Object obj) {
    }

    public final void Q0(P p10, Object obj, InterfaceC6839p interfaceC6839p) {
        p10.invoke(interfaceC6839p, obj, this);
    }

    @Override // Ii.D0
    public final void e0(Throwable th2) {
        L.a(this.f9298c, th2);
    }

    @Override // dh.InterfaceC5380e
    public final InterfaceC5384i getContext() {
        return this.f9298c;
    }

    @Override // Ii.N
    public InterfaceC5384i getCoroutineContext() {
        return this.f9298c;
    }

    @Override // Ii.D0, Ii.InterfaceC3091y0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // Ii.D0
    public String o0() {
        String strG = H.g(this.f9298c);
        if (strG == null) {
            return super.o0();
        }
        return '\"' + strG + "\":" + super.o0();
    }

    @Override // dh.InterfaceC5380e
    public final void resumeWith(Object obj) {
        Object objN0 = n0(D.b(obj));
        if (objN0 == E0.f9260b) {
            return;
        }
        N0(objN0);
    }

    @Override // Ii.D0
    protected final void v0(Object obj) {
        if (!(obj instanceof C)) {
            P0(obj);
        } else {
            C c10 = (C) obj;
            O0(c10.f9236a, c10.a());
        }
    }
}
