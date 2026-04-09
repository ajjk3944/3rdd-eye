package W;

import W.C1637z;

/* compiled from: AutoValue_QualityRatioToResolutionsTable_QualityRatio.java */
/* renamed from: W.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621i extends C1637z.a {

    /* renamed from: a, reason: collision with root package name */
    public final C1635x f13270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13271b;

    public C1621i(C1635x c1635x, int i) {
        if (c1635x == null) {
            throw new NullPointerException("Null quality");
        }
        this.f13270a = c1635x;
        this.f13271b = i;
    }

    @Override // W.C1637z.a
    public final int a() {
        return this.f13271b;
    }

    @Override // W.C1637z.a
    public final C1635x b() {
        return this.f13270a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1637z.a)) {
            return false;
        }
        C1637z.a aVar = (C1637z.a) obj;
        return this.f13270a.equals(aVar.b()) && this.f13271b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f13270a.hashCode() ^ 1000003) * 1000003) ^ this.f13271b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.f13270a);
        sb.append(", aspectRatio=");
        return B4.i.j(sb, this.f13271b, "}");
    }
}
