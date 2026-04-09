package Te;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Te.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3572b0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21802a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f21803b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.b f21804c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f21805d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f21806e;

    /* renamed from: f, reason: collision with root package name */
    private final s9.d f21807f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21808g;

    public C3572b0(String id2, s9.d name, s9.b connectionIcon, s9.d dVar, s9.d dVar2, s9.d dVar3, boolean z10) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(connectionIcon, "connectionIcon");
        this.f21802a = id2;
        this.f21803b = name;
        this.f21804c = connectionIcon;
        this.f21805d = dVar;
        this.f21806e = dVar2;
        this.f21807f = dVar3;
        this.f21808g = z10;
    }

    public final s9.b a() {
        return this.f21804c;
    }

    public final boolean b() {
        return this.f21808g;
    }

    public final String c() {
        return this.f21802a;
    }

    public final s9.d d() {
        return this.f21805d;
    }

    public final s9.d e() {
        return this.f21803b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3572b0)) {
            return false;
        }
        C3572b0 c3572b0 = (C3572b0) obj;
        return AbstractC6492s.d(this.f21802a, c3572b0.f21802a) && AbstractC6492s.d(this.f21803b, c3572b0.f21803b) && AbstractC6492s.d(this.f21804c, c3572b0.f21804c) && AbstractC6492s.d(this.f21805d, c3572b0.f21805d) && AbstractC6492s.d(this.f21806e, c3572b0.f21806e) && AbstractC6492s.d(this.f21807f, c3572b0.f21807f) && this.f21808g == c3572b0.f21808g;
    }

    public final s9.d f() {
        return this.f21806e;
    }

    public final s9.d g() {
        return this.f21807f;
    }

    public int hashCode() {
        int iHashCode = ((((this.f21802a.hashCode() * 31) + this.f21803b.hashCode()) * 31) + this.f21804c.hashCode()) * 31;
        s9.d dVar = this.f21805d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        s9.d dVar2 = this.f21806e;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        s9.d dVar3 = this.f21807f;
        return ((iHashCode3 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31) + Boolean.hashCode(this.f21808g);
    }

    public String toString() {
        return "Model(id=" + this.f21802a + ", name=" + this.f21803b + ", connectionIcon=" + this.f21804c + ", info=" + this.f21805d + ", value=" + this.f21806e + ", valueSecondary=" + this.f21807f + ", enabled=" + this.f21808g + ")";
    }
}
