package md;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: md.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6796a {

    /* renamed from: a, reason: collision with root package name */
    private T7.b f53959a;

    /* renamed from: b, reason: collision with root package name */
    private T7.c f53960b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f53961c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f53962d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f53963e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f53964f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53965g;

    public C6796a(T7.b dayNight, T7.c distanceUnitSystem, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC6492s.i(dayNight, "dayNight");
        AbstractC6492s.i(distanceUnitSystem, "distanceUnitSystem");
        this.f53959a = dayNight;
        this.f53960b = distanceUnitSystem;
        this.f53961c = z10;
        this.f53962d = z11;
        this.f53963e = z12;
        this.f53964f = z13;
        this.f53965g = z14;
    }

    public static /* synthetic */ C6796a b(C6796a c6796a, T7.b bVar, T7.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = c6796a.f53959a;
        }
        if ((i10 & 2) != 0) {
            cVar = c6796a.f53960b;
        }
        T7.c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            z10 = c6796a.f53961c;
        }
        boolean z15 = z10;
        if ((i10 & 8) != 0) {
            z11 = c6796a.f53962d;
        }
        boolean z16 = z11;
        if ((i10 & 16) != 0) {
            z12 = c6796a.f53963e;
        }
        boolean z17 = z12;
        if ((i10 & 32) != 0) {
            z13 = c6796a.f53964f;
        }
        boolean z18 = z13;
        if ((i10 & 64) != 0) {
            z14 = c6796a.f53965g;
        }
        return c6796a.a(bVar, cVar2, z15, z16, z17, z18, z14);
    }

    public final C6796a a(T7.b dayNight, T7.c distanceUnitSystem, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC6492s.i(dayNight, "dayNight");
        AbstractC6492s.i(distanceUnitSystem, "distanceUnitSystem");
        return new C6796a(dayNight, distanceUnitSystem, z10, z11, z12, z13, z14);
    }

    public final boolean c() {
        return this.f53961c;
    }

    public final boolean d() {
        return this.f53962d;
    }

    public final T7.b e() {
        return this.f53959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6796a)) {
            return false;
        }
        C6796a c6796a = (C6796a) obj;
        return this.f53959a == c6796a.f53959a && this.f53960b == c6796a.f53960b && this.f53961c == c6796a.f53961c && this.f53962d == c6796a.f53962d && this.f53963e == c6796a.f53963e && this.f53964f == c6796a.f53964f && this.f53965g == c6796a.f53965g;
    }

    public final boolean f() {
        return this.f53963e;
    }

    public final T7.c g() {
        return this.f53960b;
    }

    public final boolean h() {
        return this.f53964f;
    }

    public int hashCode() {
        return (((((((((((this.f53959a.hashCode() * 31) + this.f53960b.hashCode()) * 31) + Boolean.hashCode(this.f53961c)) * 31) + Boolean.hashCode(this.f53962d)) * 31) + Boolean.hashCode(this.f53963e)) * 31) + Boolean.hashCode(this.f53964f)) * 31) + Boolean.hashCode(this.f53965g);
    }

    public final boolean i() {
        return this.f53965g;
    }

    public String toString() {
        return "Settings: \ndayNight: " + this.f53959a + "\ndistanceUnitSystem: " + this.f53960b + "\nshow frequencies on channels 2Ghz: " + this.f53961c + "\nshow frequencies on channels 5Ghz: " + this.f53962d + "\ndiscovery keep screen on: " + this.f53963e + "\nspeedtest keep screen on: " + this.f53964f + "\nteleport tile service added: " + this.f53965g;
    }
}
