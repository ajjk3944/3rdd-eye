package k7;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14175a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14177c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f14178d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14179e;

    public b(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        this.f14175a = str;
        this.f14176b = str2;
        this.f14177c = str3;
        this.f14178d = arrayList;
        this.f14179e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f14175a.equals(bVar.f14175a) && this.f14176b.equals(bVar.f14176b) && this.f14177c.equals(bVar.f14177c) && this.f14178d.equals(bVar.f14178d)) {
            return this.f14179e.equals(bVar.f14179e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14179e.hashCode() + ((this.f14178d.hashCode() + c7.a.g(this.f14177c, c7.a.g(this.f14176b, this.f14175a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f14175a + "', onDelete='" + this.f14176b + " +', onUpdate='" + this.f14177c + "', columnNames=" + this.f14178d + ", referenceColumnNames=" + this.f14179e + '}';
    }
}
