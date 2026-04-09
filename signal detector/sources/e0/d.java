package E0;

import java.util.ArrayList;
import java.util.List;
import q5.i;
import y5.l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1348a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1349b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1350c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1351d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z6, List list, List list2) {
        i.e(list, "columns");
        i.e(list2, "orders");
        this.f1348a = str;
        this.f1349b = z6;
        this.f1350c = list;
        this.f1351d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.f1351d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        boolean z6 = dVar.f1349b;
        String str = dVar.f1348a;
        if (this.f1349b != z6 || !i.a(this.f1350c, dVar.f1350c) || !i.a(this.f1351d, dVar.f1351d)) {
            return false;
        }
        String str2 = this.f1348a;
        return l.g0(str2, "index_") ? l.g0(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f1348a;
        return this.f1351d.hashCode() + ((this.f1350c.hashCode() + ((((l.g0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f1349b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f1348a + "', unique=" + this.f1349b + ", columns=" + this.f1350c + ", orders=" + this.f1351d + "'}";
    }

    public d(String str, List list) {
        i.e(list, "columns");
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add("ASC");
        }
        this(str, false, list, arrayList);
    }
}
