package W;

import W.C1628p;

/* compiled from: AutoValue_FallbackStrategy_RuleStrategy.java */
/* renamed from: W.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617e extends C1628p.a {

    /* renamed from: b, reason: collision with root package name */
    public final C1622j f13251b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13252c;

    public C1617e(C1622j c1622j, int i) {
        if (c1622j == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f13251b = c1622j;
        this.f13252c = i;
    }

    @Override // W.C1628p.a
    public final C1635x a() {
        return this.f13251b;
    }

    @Override // W.C1628p.a
    public final int b() {
        return this.f13252c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1628p.a)) {
            return false;
        }
        C1628p.a aVar = (C1628p.a) obj;
        return this.f13251b.equals(aVar.a()) && this.f13252c == aVar.b();
    }

    public final int hashCode() {
        return ((this.f13251b.hashCode() ^ 1000003) * 1000003) ^ this.f13252c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.f13251b);
        sb.append(", fallbackRule=");
        return B4.i.j(sb, this.f13252c, "}");
    }
}
