package Te;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7929a f21626a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f21627b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f21628c;

    /* renamed from: d, reason: collision with root package name */
    private final Ci.c f21629d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f21630e;

    /* renamed from: f, reason: collision with root package name */
    private final E0 f21631f;

    /* renamed from: g, reason: collision with root package name */
    private final E0 f21632g;

    /* renamed from: h, reason: collision with root package name */
    private final E0 f21633h;

    public F0(InterfaceC7929a interfaceC7929a, s9.d name, boolean z10, Ci.c badge, s9.d dVar, E0 e02, E0 e03, E0 e04) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(badge, "badge");
        this.f21626a = interfaceC7929a;
        this.f21627b = name;
        this.f21628c = z10;
        this.f21629d = badge;
        this.f21630e = dVar;
        this.f21631f = e02;
        this.f21632g = e03;
        this.f21633h = e04;
    }

    public final Ci.c a() {
        return this.f21629d;
    }

    public final s9.d b() {
        return this.f21630e;
    }

    public final InterfaceC7929a c() {
        return this.f21626a;
    }

    public final E0 d() {
        return this.f21631f;
    }

    public final E0 e() {
        return this.f21632g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return AbstractC6492s.d(this.f21626a, f02.f21626a) && AbstractC6492s.d(this.f21627b, f02.f21627b) && this.f21628c == f02.f21628c && AbstractC6492s.d(this.f21629d, f02.f21629d) && AbstractC6492s.d(this.f21630e, f02.f21630e) && AbstractC6492s.d(this.f21631f, f02.f21631f) && AbstractC6492s.d(this.f21632g, f02.f21632g) && AbstractC6492s.d(this.f21633h, f02.f21633h);
    }

    public final E0 f() {
        return this.f21633h;
    }

    public final s9.d g() {
        return this.f21627b;
    }

    public final boolean h() {
        return this.f21628c;
    }

    public int hashCode() {
        InterfaceC7929a interfaceC7929a = this.f21626a;
        int iHashCode = (((((((interfaceC7929a == null ? 0 : interfaceC7929a.hashCode()) * 31) + this.f21627b.hashCode()) * 31) + Boolean.hashCode(this.f21628c)) * 31) + this.f21629d.hashCode()) * 31;
        s9.d dVar = this.f21630e;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        E0 e02 = this.f21631f;
        int iHashCode3 = (iHashCode2 + (e02 == null ? 0 : e02.hashCode())) * 31;
        E0 e03 = this.f21632g;
        int iHashCode4 = (iHashCode3 + (e03 == null ? 0 : e03.hashCode())) * 31;
        E0 e04 = this.f21633h;
        return iHashCode4 + (e04 != null ? e04.hashCode() : 0);
    }

    public String toString() {
        return "Model(image=" + this.f21626a + ", name=" + this.f21627b + ", nameHighlighted=" + this.f21628c + ", badge=" + this.f21629d + ", bssid=" + this.f21630e + ", link2Ghz=" + this.f21631f + ", link5Ghz=" + this.f21632g + ", link6Ghz=" + this.f21633h + ")";
    }

    public /* synthetic */ F0(InterfaceC7929a interfaceC7929a, s9.d dVar, boolean z10, Ci.c cVar, s9.d dVar2, E0 e02, E0 e03, E0 e04, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : interfaceC7929a, dVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? Ci.a.a() : cVar, dVar2, (i10 & 32) != 0 ? null : e02, (i10 & 64) != 0 ? null : e03, (i10 & 128) != 0 ? null : e04);
    }
}
