package F9;

import A9.A0;
import A9.AbstractC0565a;
import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: Scopes.kt */
/* loaded from: classes3.dex */
public class v<T> extends AbstractC0565a<T> implements h9.d {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4347e<T> f1784e;

    public v(InterfaceC4347e interfaceC4347e, InterfaceC4350h interfaceC4350h) {
        super(interfaceC4350h, true, true);
        this.f1784e = interfaceC4347e;
    }

    @Override // A9.C0605u0
    public final boolean Q() {
        return true;
    }

    @Override // h9.d
    public final h9.d getCallerFrame() {
        InterfaceC4347e<T> interfaceC4347e = this.f1784e;
        if (interfaceC4347e instanceof h9.d) {
            return (h9.d) interfaceC4347e;
        }
        return null;
    }

    @Override // A9.C0605u0
    public void r(Object obj) {
        C0658a.a(com.google.gson.internal.c.r(this.f1784e), A0.a(obj));
    }

    @Override // A9.C0605u0
    public void s(Object obj) {
        this.f1784e.resumeWith(A0.a(obj));
    }
}
