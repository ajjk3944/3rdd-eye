package Ge;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final String f7324a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f7325b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f7326c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f7327d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7328e;

    public a(String id2, s9.d title, s9.d dVar, s9.d dVar2) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(title, "title");
        this.f7324a = id2;
        this.f7325b = title;
        this.f7326c = dVar;
        this.f7327d = dVar2;
        this.f7328e = "ApRoaming";
    }

    public final s9.d a() {
        return this.f7327d;
    }

    public final s9.d b() {
        return this.f7326c;
    }

    public final s9.d c() {
        return this.f7325b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f7324a, aVar.f7324a) && AbstractC6492s.d(this.f7325b, aVar.f7325b) && AbstractC6492s.d(this.f7326c, aVar.f7326c) && AbstractC6492s.d(this.f7327d, aVar.f7327d);
    }

    @Override // Ge.g
    public String getId() {
        return this.f7324a;
    }

    @Override // Ge.g
    public String getType() {
        return this.f7328e;
    }

    public int hashCode() {
        int iHashCode = ((this.f7324a.hashCode() * 31) + this.f7325b.hashCode()) * 31;
        s9.d dVar = this.f7326c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        s9.d dVar2 = this.f7327d;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public String toString() {
        return "ApRoamingNotification(id=" + this.f7324a + ", title=" + this.f7325b + ", subtitle=" + this.f7326c + ", additionalInfo=" + this.f7327d + ")";
    }
}
