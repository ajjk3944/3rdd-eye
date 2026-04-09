package E0;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import q5.i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1352a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1353b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1354c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1355d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        i.e(abstractSet, "foreignKeys");
        this.f1352a = str;
        this.f1353b = map;
        this.f1354c = abstractSet;
        this.f1355d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dd, code lost:
    
        r9 = d5.y.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e1, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final E0.e a(H0.c r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.e.a(H0.c, java.lang.String):E0.e");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f1352a.equals(eVar.f1352a) || !this.f1353b.equals(eVar.f1353b) || !i.a(this.f1354c, eVar.f1354c)) {
            return false;
        }
        Set set2 = this.f1355d;
        if (set2 == null || (set = eVar.f1355d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f1354c.hashCode() + ((this.f1353b.hashCode() + (this.f1352a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f1352a + "', columns=" + this.f1353b + ", foreignKeys=" + this.f1354c + ", indices=" + this.f1355d + '}';
    }
}
