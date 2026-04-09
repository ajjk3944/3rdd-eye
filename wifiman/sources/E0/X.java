package E0;

import java.util.List;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: c, reason: collision with root package name */
    public static final int f3808c = V.b.f22937d;

    /* renamed from: a, reason: collision with root package name */
    private final V.b f3809a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f3810b;

    public X(V.b bVar, InterfaceC6824a interfaceC6824a) {
        this.f3809a = bVar;
        this.f3810b = interfaceC6824a;
    }

    public final void a(int i10, Object obj) {
        this.f3809a.a(i10, obj);
        this.f3810b.invoke();
    }

    public final List b() {
        return this.f3809a.g();
    }

    public final void c() {
        this.f3809a.h();
        this.f3810b.invoke();
    }

    public final Object d(int i10) {
        return this.f3809a.m()[i10];
    }

    public final int e() {
        return this.f3809a.o();
    }

    public final V.b f() {
        return this.f3809a;
    }

    public final Object g(int i10) {
        Object objZ = this.f3809a.z(i10);
        this.f3810b.invoke();
        return objZ;
    }
}
