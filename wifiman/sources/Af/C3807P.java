package af;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: af.P, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3807P {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f26025a;

    /* renamed from: b, reason: collision with root package name */
    private final De.g f26026b;

    /* renamed from: c, reason: collision with root package name */
    private final W7.e f26027c;

    /* renamed from: d, reason: collision with root package name */
    private final Ci.c f26028d;

    /* renamed from: e, reason: collision with root package name */
    private final C3806O f26029e;

    /* renamed from: f, reason: collision with root package name */
    private final C3806O f26030f;

    /* renamed from: g, reason: collision with root package name */
    private final C3806O f26031g;

    public C3807P(s9.d title, De.g gVar, W7.e eVar, Ci.c wifiBandTabs, C3806O c3806o, C3806O c3806o2, C3806O c3806o3) {
        AbstractC6492s.i(title, "title");
        AbstractC6492s.i(wifiBandTabs, "wifiBandTabs");
        this.f26025a = title;
        this.f26026b = gVar;
        this.f26027c = eVar;
        this.f26028d = wifiBandTabs;
        this.f26029e = c3806o;
        this.f26030f = c3806o2;
        this.f26031g = c3806o3;
    }

    public final De.g a() {
        return this.f26026b;
    }

    public final C3806O b() {
        return this.f26029e;
    }

    public final W7.e c() {
        return this.f26027c;
    }

    public final C3806O d() {
        return this.f26030f;
    }

    public final C3806O e() {
        return this.f26031g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3807P)) {
            return false;
        }
        C3807P c3807p = (C3807P) obj;
        return AbstractC6492s.d(this.f26025a, c3807p.f26025a) && AbstractC6492s.d(this.f26026b, c3807p.f26026b) && this.f26027c == c3807p.f26027c && AbstractC6492s.d(this.f26028d, c3807p.f26028d) && AbstractC6492s.d(this.f26029e, c3807p.f26029e) && AbstractC6492s.d(this.f26030f, c3807p.f26030f) && AbstractC6492s.d(this.f26031g, c3807p.f26031g);
    }

    public final s9.d f() {
        return this.f26025a;
    }

    public final Ci.c g() {
        return this.f26028d;
    }

    public int hashCode() {
        int iHashCode = this.f26025a.hashCode() * 31;
        De.g gVar = this.f26026b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        W7.e eVar = this.f26027c;
        int iHashCode3 = (((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f26028d.hashCode()) * 31;
        C3806O c3806o = this.f26029e;
        int iHashCode4 = (iHashCode3 + (c3806o == null ? 0 : c3806o.hashCode())) * 31;
        C3806O c3806o2 = this.f26030f;
        int iHashCode5 = (iHashCode4 + (c3806o2 == null ? 0 : c3806o2.hashCode())) * 31;
        C3806O c3806o3 = this.f26031g;
        return iHashCode5 + (c3806o3 != null ? c3806o3.hashCode() : 0);
    }

    public String toString() {
        return "Model(title=" + this.f26025a + ", badge=" + this.f26026b + ", rating=" + this.f26027c + ", wifiBandTabs=" + this.f26028d + ", firstItem=" + this.f26029e + ", secondItem=" + this.f26030f + ", thirdItem=" + this.f26031g + ")";
    }

    public /* synthetic */ C3807P(s9.d dVar, De.g gVar, W7.e eVar, Ci.c cVar, C3806O c3806o, C3806O c3806o2, C3806O c3806o3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? null : gVar, eVar, cVar, c3806o, (i10 & 32) != 0 ? null : c3806o2, (i10 & 64) != 0 ? null : c3806o3);
    }
}
