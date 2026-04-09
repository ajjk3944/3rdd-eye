package vu;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final cv.j f23977d;

    /* renamed from: e, reason: collision with root package name */
    public static final cv.j f23978e;

    /* renamed from: f, reason: collision with root package name */
    public static final cv.j f23979f;

    /* renamed from: g, reason: collision with root package name */
    public static final cv.j f23980g;

    /* renamed from: h, reason: collision with root package name */
    public static final cv.j f23981h;

    /* renamed from: i, reason: collision with root package name */
    public static final cv.j f23982i;

    /* renamed from: a, reason: collision with root package name */
    public final cv.j f23983a;

    /* renamed from: b, reason: collision with root package name */
    public final cv.j f23984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23985c;

    static {
        cv.j jVar = cv.j.f6715r;
        f23977d = sm.m.m(":");
        f23978e = sm.m.m(":status");
        f23979f = sm.m.m(":method");
        f23980g = sm.m.m(":path");
        f23981h = sm.m.m(":scheme");
        f23982i = sm.m.m(":authority");
    }

    public d(cv.j jVar, cv.j jVar2) {
        br.l.e(jVar, "name");
        br.l.e(jVar2, "value");
        this.f23983a = jVar;
        this.f23984b = jVar2;
        this.f23985c = jVar2.d() + jVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f23983a, dVar.f23983a) && br.l.a(this.f23984b, dVar.f23984b);
    }

    public final int hashCode() {
        return this.f23984b.hashCode() + (this.f23983a.hashCode() * 31);
    }

    public final String toString() {
        return this.f23983a.q() + ": " + this.f23984b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        this(sm.m.m(str), sm.m.m(str2));
        br.l.e(str, "name");
        br.l.e(str2, "value");
        cv.j jVar = cv.j.f6715r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(cv.j jVar, String str) {
        this(jVar, sm.m.m(str));
        br.l.e(jVar, "name");
        br.l.e(str, "value");
        cv.j jVar2 = cv.j.f6715r;
    }
}
