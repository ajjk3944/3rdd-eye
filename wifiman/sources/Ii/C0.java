package Ii;

import Ni.C3412n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class C0 extends C3412n implements InterfaceC3052e0, InterfaceC3083u0 {

    /* renamed from: d, reason: collision with root package name */
    public D0 f9237d;

    @Override // Ii.InterfaceC3083u0
    public I0 b() {
        return null;
    }

    @Override // Ii.InterfaceC3052e0
    public void dispose() {
        t().A0(this);
    }

    @Override // Ii.InterfaceC3083u0
    public boolean isActive() {
        return true;
    }

    public final D0 t() {
        D0 d02 = this.f9237d;
        if (d02 != null) {
            return d02;
        }
        AbstractC6492s.v("job");
        return null;
    }

    @Override // Ni.C3412n
    public String toString() {
        return S.a(this) + '@' + S.b(this) + "[job@" + S.b(t()) + ']';
    }

    public abstract boolean u();

    public abstract void v(Throwable th2);

    public final void w(D0 d02) {
        this.f9237d = d02;
    }
}
