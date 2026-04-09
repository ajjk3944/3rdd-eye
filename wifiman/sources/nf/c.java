package nf;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.d;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f54641e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f54642a;

    /* renamed from: b, reason: collision with root package name */
    private final g f54643b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f54644c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f54645d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return new c(false, g.LATENCY, new d.c(""), new d.c(""));
        }

        private a() {
        }
    }

    public c(boolean z10, g step, s9.d value, s9.d unit) {
        AbstractC6492s.i(step, "step");
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(unit, "unit");
        this.f54642a = z10;
        this.f54643b = step;
        this.f54644c = value;
        this.f54645d = unit;
    }

    public static /* synthetic */ c b(c cVar, boolean z10, g gVar, s9.d dVar, s9.d dVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = cVar.f54642a;
        }
        if ((i10 & 2) != 0) {
            gVar = cVar.f54643b;
        }
        if ((i10 & 4) != 0) {
            dVar = cVar.f54644c;
        }
        if ((i10 & 8) != 0) {
            dVar2 = cVar.f54645d;
        }
        return cVar.a(z10, gVar, dVar, dVar2);
    }

    public final c a(boolean z10, g step, s9.d value, s9.d unit) {
        AbstractC6492s.i(step, "step");
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(unit, "unit");
        return new c(z10, step, value, unit);
    }

    public final g c() {
        return this.f54643b;
    }

    public final s9.d d() {
        return this.f54645d;
    }

    public final s9.d e() {
        return this.f54644c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f54642a == cVar.f54642a && this.f54643b == cVar.f54643b && AbstractC6492s.d(this.f54644c, cVar.f54644c) && AbstractC6492s.d(this.f54645d, cVar.f54645d);
    }

    public final boolean f() {
        return this.f54642a;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f54642a) * 31) + this.f54643b.hashCode()) * 31) + this.f54644c.hashCode()) * 31) + this.f54645d.hashCode();
    }

    public String toString() {
        return "AnimatedSpeedValueModel(visible=" + this.f54642a + ", step=" + this.f54643b + ", value=" + this.f54644c + ", unit=" + this.f54645d + ")";
    }
}
