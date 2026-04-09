package k7;

import br.l;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f14188a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14189b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f14190c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f14191d;

    public e(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        l.e(abstractSet, "foreignKeys");
        this.f14188a = str;
        this.f14189b = map;
        this.f14190c = abstractSet;
        this.f14191d = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01da, code lost:
    
        r9 = i3.g.b(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01de, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final k7.e a(p7.b r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e.a(p7.b, java.lang.String):k7.e");
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
        if (!this.f14188a.equals(eVar.f14188a) || !this.f14189b.equals(eVar.f14189b) || !l.a(this.f14190c, eVar.f14190c)) {
            return false;
        }
        Set set2 = this.f14191d;
        if (set2 == null || (set = eVar.f14191d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f14190c.hashCode() + ((this.f14189b.hashCode() + (this.f14188a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f14188a + "', columns=" + this.f14189b + ", foreignKeys=" + this.f14190c + ", indices=" + this.f14191d + '}';
    }
}
