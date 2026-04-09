package bf;

import b8.AbstractC4075b;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* renamed from: bf.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4101e {

    /* renamed from: a, reason: collision with root package name */
    private final String f33171a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f33172b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f33173c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f33174d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f33175e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4075b f33176f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f33177g;

    public C4101e(String id2, InterfaceC7929a icon, s9.d title, s9.d dVar, boolean z10, AbstractC4075b abstractC4075b, boolean z11) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(icon, "icon");
        AbstractC6492s.i(title, "title");
        this.f33171a = id2;
        this.f33172b = icon;
        this.f33173c = title;
        this.f33174d = dVar;
        this.f33175e = z10;
        this.f33176f = abstractC4075b;
        this.f33177g = z11;
    }

    public final InterfaceC7929a a() {
        return this.f33172b;
    }

    public final String b() {
        return this.f33171a;
    }

    public final AbstractC4075b c() {
        return this.f33176f;
    }

    public final boolean d() {
        return this.f33177g;
    }

    public final boolean e() {
        return this.f33175e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4101e)) {
            return false;
        }
        C4101e c4101e = (C4101e) obj;
        return AbstractC6492s.d(this.f33171a, c4101e.f33171a) && AbstractC6492s.d(this.f33172b, c4101e.f33172b) && AbstractC6492s.d(this.f33173c, c4101e.f33173c) && AbstractC6492s.d(this.f33174d, c4101e.f33174d) && this.f33175e == c4101e.f33175e && AbstractC6492s.d(this.f33176f, c4101e.f33176f) && this.f33177g == c4101e.f33177g;
    }

    public final s9.d f() {
        return this.f33174d;
    }

    public final s9.d g() {
        return this.f33173c;
    }

    public int hashCode() {
        int iHashCode = ((((this.f33171a.hashCode() * 31) + this.f33172b.hashCode()) * 31) + this.f33173c.hashCode()) * 31;
        s9.d dVar = this.f33174d;
        int iHashCode2 = (((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.f33175e)) * 31;
        AbstractC4075b abstractC4075b = this.f33176f;
        return ((iHashCode2 + (abstractC4075b != null ? abstractC4075b.hashCode() : 0)) * 31) + Boolean.hashCode(this.f33177g);
    }

    public String toString() {
        return "NetworkHostListItem(id=" + this.f33171a + ", icon=" + this.f33172b + ", title=" + this.f33173c + ", subtitle=" + this.f33174d + ", resultsAvailable=" + this.f33175e + ", latency=" + this.f33176f + ", removable=" + this.f33177g + ")";
    }
}
