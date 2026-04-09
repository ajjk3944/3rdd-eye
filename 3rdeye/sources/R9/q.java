package R9;

import b9.C2001h;
import c9.C2099t;
import java.lang.annotation.Annotation;
import java.util.List;
import p9.InterfaceC5480a;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes3.dex */
public final class q implements O9.e {

    /* renamed from: a, reason: collision with root package name */
    public final b9.p f11815a;

    public q(InterfaceC5480a<? extends O9.e> interfaceC5480a) {
        this.f11815a = C2001h.b(interfaceC5480a);
    }

    @Override // O9.e
    public final String a() {
        return b().a();
    }

    public final O9.e b() {
        return (O9.e) this.f11815a.getValue();
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return b().d(name);
    }

    @Override // O9.e
    public final O9.k e() {
        return b().e();
    }

    @Override // O9.e
    public final int f() {
        return b().f();
    }

    @Override // O9.e
    public final String g(int i) {
        return b().g(i);
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return C2099t.f18581b;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        return b().h(i);
    }

    @Override // O9.e
    public final O9.e i(int i) {
        return b().i(i);
    }

    @Override // O9.e
    public final boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        return b().j(i);
    }
}
