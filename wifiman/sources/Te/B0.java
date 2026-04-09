package Te;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21598a;

    /* renamed from: b, reason: collision with root package name */
    private final N f21599b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7929a f21600c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f21601d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21602e;

    /* renamed from: f, reason: collision with root package name */
    private final De.a f21603f;

    /* renamed from: g, reason: collision with root package name */
    private final s9.d f21604g;

    /* renamed from: h, reason: collision with root package name */
    private final s9.d f21605h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21606i;

    /* renamed from: j, reason: collision with root package name */
    private final s9.d f21607j;

    public B0(String id2, N n10, InterfaceC7929a interfaceC7929a, s9.d title, boolean z10, De.a aVar, s9.d dVar, s9.d dVar2, boolean z11, s9.d dVar3) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(title, "title");
        this.f21598a = id2;
        this.f21599b = n10;
        this.f21600c = interfaceC7929a;
        this.f21601d = title;
        this.f21602e = z10;
        this.f21603f = aVar;
        this.f21604g = dVar;
        this.f21605h = dVar2;
        this.f21606i = z11;
        this.f21607j = dVar3;
    }

    public final N a() {
        return this.f21599b;
    }

    public final String b() {
        return this.f21598a;
    }

    public final InterfaceC7929a c() {
        return this.f21600c;
    }

    public final s9.d d() {
        return this.f21604g;
    }

    public final s9.d e() {
        return this.f21601d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        return AbstractC6492s.d(this.f21598a, b02.f21598a) && this.f21599b == b02.f21599b && AbstractC6492s.d(this.f21600c, b02.f21600c) && AbstractC6492s.d(this.f21601d, b02.f21601d) && this.f21602e == b02.f21602e && AbstractC6492s.d(this.f21603f, b02.f21603f) && AbstractC6492s.d(this.f21604g, b02.f21604g) && AbstractC6492s.d(this.f21605h, b02.f21605h) && this.f21606i == b02.f21606i && AbstractC6492s.d(this.f21607j, b02.f21607j);
    }

    public final De.a f() {
        return this.f21603f;
    }

    public final boolean g() {
        return this.f21602e;
    }

    public final s9.d h() {
        return this.f21605h;
    }

    public int hashCode() {
        int iHashCode = this.f21598a.hashCode() * 31;
        N n10 = this.f21599b;
        int iHashCode2 = (iHashCode + (n10 == null ? 0 : n10.hashCode())) * 31;
        InterfaceC7929a interfaceC7929a = this.f21600c;
        int iHashCode3 = (((((iHashCode2 + (interfaceC7929a == null ? 0 : interfaceC7929a.hashCode())) * 31) + this.f21601d.hashCode()) * 31) + Boolean.hashCode(this.f21602e)) * 31;
        De.a aVar = this.f21603f;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s9.d dVar = this.f21604g;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        s9.d dVar2 = this.f21605h;
        int iHashCode6 = (((iHashCode5 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31) + Boolean.hashCode(this.f21606i)) * 31;
        s9.d dVar3 = this.f21607j;
        return iHashCode6 + (dVar3 != null ? dVar3.hashCode() : 0);
    }

    public final boolean i() {
        return this.f21606i;
    }

    public final s9.d j() {
        return this.f21607j;
    }

    public String toString() {
        return "Model(id=" + this.f21598a + ", color=" + this.f21599b + ", image=" + this.f21600c + ", title=" + this.f21601d + ", titleHighlighted=" + this.f21602e + ", titleBadge=" + this.f21603f + ", subtitle=" + this.f21604g + ", value=" + this.f21605h + ", valueDimmed=" + this.f21606i + ", valueSecondary=" + this.f21607j + ")";
    }

    public /* synthetic */ B0(String str, N n10, InterfaceC7929a interfaceC7929a, s9.d dVar, boolean z10, De.a aVar, s9.d dVar2, s9.d dVar3, boolean z11, s9.d dVar4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, n10, interfaceC7929a, dVar, z10, (i10 & 32) != 0 ? null : aVar, dVar2, dVar3, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z11, dVar4);
    }
}
