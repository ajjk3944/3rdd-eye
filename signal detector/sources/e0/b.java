package E0;

import java.util.List;
import q5.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1340b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1341c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1342d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1343e;

    public b(String str, String str2, String str3, List list, List list2) {
        i.e(list, "columnNames");
        i.e(list2, "referenceColumnNames");
        this.f1339a = str;
        this.f1340b = str2;
        this.f1341c = str3;
        this.f1342d = list;
        this.f1343e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (i.a(this.f1339a, bVar.f1339a) && i.a(this.f1340b, bVar.f1340b) && i.a(this.f1341c, bVar.f1341c) && i.a(this.f1342d, bVar.f1342d)) {
            return i.a(this.f1343e, bVar.f1343e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1343e.hashCode() + ((this.f1342d.hashCode() + ((this.f1341c.hashCode() + ((this.f1340b.hashCode() + (this.f1339a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f1339a + "', onDelete='" + this.f1340b + " +', onUpdate='" + this.f1341c + "', columnNames=" + this.f1342d + ", referenceColumnNames=" + this.f1343e + '}';
    }
}
