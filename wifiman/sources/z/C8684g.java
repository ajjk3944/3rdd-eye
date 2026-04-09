package z;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8684g implements InterfaceC8683f, InterfaceC8681d {

    /* renamed from: a, reason: collision with root package name */
    private final Y0.d f66874a;

    /* renamed from: b, reason: collision with root package name */
    private final long f66875b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.f f66876c;

    public /* synthetic */ C8684g(Y0.d dVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10);
    }

    @Override // z.InterfaceC8681d
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return this.f66876c.a(eVar);
    }

    @Override // z.InterfaceC8683f
    public float b() {
        return Y0.b.h(d()) ? this.f66874a.x(Y0.b.l(d())) : Y0.h.f24523b.b();
    }

    @Override // z.InterfaceC8683f
    public float c() {
        return this.f66874a.x(Y0.b.n(d()));
    }

    @Override // z.InterfaceC8683f
    public long d() {
        return this.f66875b;
    }

    @Override // z.InterfaceC8683f
    public float e() {
        return Y0.b.g(d()) ? this.f66874a.x(Y0.b.k(d())) : Y0.h.f24523b.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8684g)) {
            return false;
        }
        C8684g c8684g = (C8684g) obj;
        return AbstractC6492s.d(this.f66874a, c8684g.f66874a) && Y0.b.f(this.f66875b, c8684g.f66875b);
    }

    @Override // z.InterfaceC8681d
    public androidx.compose.ui.e f(androidx.compose.ui.e eVar, f0.c cVar) {
        return this.f66876c.f(eVar, cVar);
    }

    @Override // z.InterfaceC8683f
    public float g() {
        return this.f66874a.x(Y0.b.m(d()));
    }

    public int hashCode() {
        return (this.f66874a.hashCode() * 31) + Y0.b.o(this.f66875b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f66874a + ", constraints=" + ((Object) Y0.b.q(this.f66875b)) + ')';
    }

    private C8684g(Y0.d dVar, long j10) {
        this.f66874a = dVar;
        this.f66875b = j10;
        this.f66876c = androidx.compose.foundation.layout.f.f28130a;
    }
}
