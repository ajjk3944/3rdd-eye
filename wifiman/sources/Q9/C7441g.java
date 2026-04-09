package q9;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* renamed from: q9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7441g {

    /* renamed from: a, reason: collision with root package name */
    private final int f58510a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.c f58511b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC7929a.b f58512c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f58513d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f58514e;

    /* renamed from: f, reason: collision with root package name */
    private final s9.b f58515f;

    public C7441g(int i10, s9.c avatar, InterfaceC7929a.b avatarPlaceholder, s9.d dVar, s9.d dVar2, s9.b bVar) {
        AbstractC6492s.i(avatar, "avatar");
        AbstractC6492s.i(avatarPlaceholder, "avatarPlaceholder");
        this.f58510a = i10;
        this.f58511b = avatar;
        this.f58512c = avatarPlaceholder;
        this.f58513d = dVar;
        this.f58514e = dVar2;
        this.f58515f = bVar;
    }

    public final s9.c a() {
        return this.f58511b;
    }

    public final InterfaceC7929a.b b() {
        return this.f58512c;
    }

    public final s9.d c() {
        return this.f58514e;
    }

    public final int d() {
        return this.f58510a;
    }

    public final s9.d e() {
        return this.f58513d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7441g)) {
            return false;
        }
        C7441g c7441g = (C7441g) obj;
        return this.f58510a == c7441g.f58510a && AbstractC6492s.d(this.f58511b, c7441g.f58511b) && AbstractC6492s.d(this.f58512c, c7441g.f58512c) && AbstractC6492s.d(this.f58513d, c7441g.f58513d) && AbstractC6492s.d(this.f58514e, c7441g.f58514e) && AbstractC6492s.d(this.f58515f, c7441g.f58515f);
    }

    public final s9.b f() {
        return this.f58515f;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f58510a) * 31) + this.f58511b.hashCode()) * 31) + this.f58512c.hashCode()) * 31;
        s9.d dVar = this.f58513d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        s9.d dVar2 = this.f58514e;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        s9.b bVar = this.f58515f;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "Account(id=" + this.f58510a + ", avatar=" + this.f58511b + ", avatarPlaceholder=" + this.f58512c + ", name=" + this.f58513d + ", email=" + this.f58514e + ", trailingIcon=" + this.f58515f + ")";
    }

    public /* synthetic */ C7441g(int i10, s9.c cVar, InterfaceC7929a.b bVar, s9.d dVar, s9.d dVar2, s9.b bVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, cVar, bVar, dVar, dVar2, (i11 & 32) != 0 ? null : bVar2);
    }
}
