package af;

import b8.AbstractC4075b;
import kotlin.jvm.internal.AbstractC6492s;
import s9.InterfaceC7929a;

/* renamed from: af.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3792A {

    /* renamed from: a, reason: collision with root package name */
    private final String f25978a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7929a f25979b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f25980c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25981d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC4075b f25982e;

    public C3792A(String id2, InterfaceC7929a icon, s9.d name, boolean z10, AbstractC4075b abstractC4075b) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(icon, "icon");
        AbstractC6492s.i(name, "name");
        this.f25978a = id2;
        this.f25979b = icon;
        this.f25980c = name;
        this.f25981d = z10;
        this.f25982e = abstractC4075b;
    }

    public final InterfaceC7929a a() {
        return this.f25979b;
    }

    public final AbstractC4075b b() {
        return this.f25982e;
    }

    public final s9.d c() {
        return this.f25980c;
    }

    public final boolean d() {
        return this.f25981d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3792A)) {
            return false;
        }
        C3792A c3792a = (C3792A) obj;
        return AbstractC6492s.d(this.f25978a, c3792a.f25978a) && AbstractC6492s.d(this.f25979b, c3792a.f25979b) && AbstractC6492s.d(this.f25980c, c3792a.f25980c) && this.f25981d == c3792a.f25981d && AbstractC6492s.d(this.f25982e, c3792a.f25982e);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f25978a.hashCode() * 31) + this.f25979b.hashCode()) * 31) + this.f25980c.hashCode()) * 31) + Boolean.hashCode(this.f25981d)) * 31;
        AbstractC4075b abstractC4075b = this.f25982e;
        return iHashCode + (abstractC4075b == null ? 0 : abstractC4075b.hashCode());
    }

    public String toString() {
        return "LatencyItem(id=" + this.f25978a + ", icon=" + this.f25979b + ", name=" + this.f25980c + ", resultsAvailable=" + this.f25981d + ", latency=" + this.f25982e + ")";
    }
}
