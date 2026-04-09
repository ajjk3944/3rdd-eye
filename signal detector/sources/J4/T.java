package j4;

import g4.InterfaceC2336A;
import n4.C2689a;

/* loaded from: classes.dex */
public final class T implements InterfaceC2336A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f21379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f21380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4.z f21381c;

    public T(Class cls, Class cls2, g4.z zVar) {
        this.f21379a = cls;
        this.f21380b = cls2;
        this.f21381c = zVar;
    }

    @Override // g4.InterfaceC2336A
    public final g4.z a(g4.m mVar, C2689a c2689a) {
        Class cls = c2689a.f22327a;
        if (cls == this.f21379a || cls == this.f21380b) {
            return this.f21381c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f21380b.getName() + "+" + this.f21379a.getName() + ",adapter=" + this.f21381c + "]";
    }
}
