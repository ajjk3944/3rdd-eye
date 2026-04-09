package e5;

import java.util.List;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5421a extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f46186a;

    /* renamed from: b, reason: collision with root package name */
    private final List f46187b;

    C5421a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f46186a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f46187b = list;
    }

    @Override // e5.l
    public List b() {
        return this.f46187b;
    }

    @Override // e5.l
    public String c() {
        return this.f46186a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f46186a.equals(lVar.c()) && this.f46187b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f46186a.hashCode() ^ 1000003) * 1000003) ^ this.f46187b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f46186a + ", usedDates=" + this.f46187b + "}";
    }
}
