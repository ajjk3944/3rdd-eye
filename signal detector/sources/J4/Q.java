package j4;

import g4.InterfaceC2336A;
import n4.C2689a;

/* loaded from: classes.dex */
public final class Q implements InterfaceC2336A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f21377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4.z f21378c;

    public /* synthetic */ Q(Class cls, g4.z zVar, int i) {
        this.f21376a = i;
        this.f21377b = cls;
        this.f21378c = zVar;
    }

    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        switch (this.f21376a) {
            case 0:
                if (c2689a.f22327a == this.f21377b) {
                    return this.f21378c;
                }
                return null;
            default:
                Class<?> cls = c2689a.f22327a;
                if (this.f21377b.isAssignableFrom(cls)) {
                    return new C2571c(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f21376a) {
            case 0:
                return "Factory[type=" + this.f21377b.getName() + ",adapter=" + this.f21378c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f21377b.getName() + ",adapter=" + this.f21378c + "]";
        }
    }
}
