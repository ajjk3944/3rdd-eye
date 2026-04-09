package z;

import T.InterfaceC3551q0;
import T.t1;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class d0 implements f0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f66859b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f66860c;

    public d0(H h10, String str) {
        this.f66859b = str;
        this.f66860c = t1.d(h10, null, 2, null);
    }

    @Override // z.f0
    public int a(Y0.d dVar, Y0.t tVar) {
        return e().c();
    }

    @Override // z.f0
    public int b(Y0.d dVar) {
        return e().a();
    }

    @Override // z.f0
    public int c(Y0.d dVar) {
        return e().d();
    }

    @Override // z.f0
    public int d(Y0.d dVar, Y0.t tVar) {
        return e().b();
    }

    public final H e() {
        return (H) this.f66860c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return AbstractC6492s.d(e(), ((d0) obj).e());
        }
        return false;
    }

    public final void f(H h10) {
        this.f66860c.setValue(h10);
    }

    public int hashCode() {
        return this.f66859b.hashCode();
    }

    public String toString() {
        return this.f66859b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
