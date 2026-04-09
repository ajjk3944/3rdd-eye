package on;

import java.util.Set;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f19653a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f19654b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f19655c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19656d;

    public y(String str, Long l10, Set set, String str2) {
        br.l.e(str, "type");
        this.f19653a = str;
        this.f19654b = l10;
        this.f19655c = set;
        this.f19656d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return br.l.a(this.f19653a, yVar.f19653a) && br.l.a(this.f19654b, yVar.f19654b) && br.l.a(this.f19655c, yVar.f19655c) && br.l.a(this.f19656d, yVar.f19656d);
    }

    public final int hashCode() {
        int iHashCode = this.f19653a.hashCode() * 31;
        Long l10 = this.f19654b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Set set = this.f19655c;
        int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
        String str = this.f19656d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurvicateAnswer(type=");
        sb2.append(this.f19653a);
        sb2.append(", id=");
        sb2.append(this.f19654b);
        sb2.append(", ids=");
        sb2.append(this.f19655c);
        sb2.append(", value=");
        return h0.b.r(sb2, this.f19656d, ')');
    }
}
