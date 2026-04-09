package Te;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.PSKKeyManager;
import s9.InterfaceC7929a;

/* renamed from: Te.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3569a {

    /* renamed from: a, reason: collision with root package name */
    private final String f21790a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f21791b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f21792c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f21793d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f21794e;

    /* renamed from: f, reason: collision with root package name */
    private final s9.d f21795f;

    /* renamed from: g, reason: collision with root package name */
    private final s9.d f21796g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f21797h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21798i;

    public C3569a(String id2, InterfaceC7929a image, s9.d dVar, s9.d title, s9.d dVar2, s9.d dVar3, s9.d dVar4, boolean z10, boolean z11) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(image, "image");
        AbstractC6492s.i(title, "title");
        this.f21790a = id2;
        this.f21791b = image;
        this.f21792c = dVar;
        this.f21793d = title;
        this.f21794e = dVar2;
        this.f21795f = dVar3;
        this.f21796g = dVar4;
        this.f21797h = z10;
        this.f21798i = z11;
    }

    public final boolean a() {
        return this.f21798i;
    }

    public final boolean b() {
        return this.f21797h;
    }

    public final String c() {
        return this.f21790a;
    }

    public final InterfaceC7929a d() {
        return this.f21791b;
    }

    public final s9.d e() {
        return this.f21792c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3569a)) {
            return false;
        }
        C3569a c3569a = (C3569a) obj;
        return AbstractC6492s.d(this.f21790a, c3569a.f21790a) && AbstractC6492s.d(this.f21791b, c3569a.f21791b) && AbstractC6492s.d(this.f21792c, c3569a.f21792c) && AbstractC6492s.d(this.f21793d, c3569a.f21793d) && AbstractC6492s.d(this.f21794e, c3569a.f21794e) && AbstractC6492s.d(this.f21795f, c3569a.f21795f) && AbstractC6492s.d(this.f21796g, c3569a.f21796g) && this.f21797h == c3569a.f21797h && this.f21798i == c3569a.f21798i;
    }

    public final s9.d f() {
        return this.f21794e;
    }

    public final s9.d g() {
        return this.f21793d;
    }

    public final s9.d h() {
        return this.f21795f;
    }

    public int hashCode() {
        int iHashCode = ((this.f21790a.hashCode() * 31) + this.f21791b.hashCode()) * 31;
        s9.d dVar = this.f21792c;
        int iHashCode2 = (((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f21793d.hashCode()) * 31;
        s9.d dVar2 = this.f21794e;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        s9.d dVar3 = this.f21795f;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        s9.d dVar4 = this.f21796g;
        return ((((iHashCode4 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31) + Boolean.hashCode(this.f21797h)) * 31) + Boolean.hashCode(this.f21798i);
    }

    public final s9.d i() {
        return this.f21796g;
    }

    public String toString() {
        return "Model(id=" + this.f21790a + ", image=" + this.f21791b + ", ssid=" + this.f21792c + ", title=" + this.f21793d + ", timestamp=" + this.f21794e + ", value=" + this.f21795f + ", valueSecondary=" + this.f21796g + ", hasConnectionOnTop=" + this.f21797h + ", hasConnectionOnBottom=" + this.f21798i + ")";
    }

    public /* synthetic */ C3569a(String str, InterfaceC7929a interfaceC7929a, s9.d dVar, s9.d dVar2, s9.d dVar3, s9.d dVar4, s9.d dVar5, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, interfaceC7929a, dVar, dVar2, dVar3, dVar4, dVar5, (i10 & 128) != 0 ? false : z10, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z11);
    }
}
