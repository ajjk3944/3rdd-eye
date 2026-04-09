package tn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f22916a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22917b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22918c;

    /* renamed from: d, reason: collision with root package name */
    public final rn.a f22919d;

    public g(h hVar, List list, List list2, rn.a aVar) {
        br.l.e(hVar, "condition");
        br.l.e(list, "value");
        br.l.e(list2, "answerIds");
        br.l.e(aVar, "answerIdsOperator");
        this.f22916a = hVar;
        this.f22917b = list;
        this.f22918c = list2;
        this.f22919d = aVar;
    }

    public final boolean a(un.e eVar) {
        Boolean boolValueOf;
        Object next;
        ArrayList arrayList = eVar.f23603b;
        h hVar = h.HAS_ANY_VALUE;
        h hVar2 = this.f22916a;
        if (hVar2 == hVar) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f22918c.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    return false;
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next2 = it2.next();
                while (it2.hasNext()) {
                    boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) next2).booleanValue();
                    rn.a aVar = this.f22919d;
                    int i10 = aVar == null ? -1 : i.f22921b[aVar.ordinal()];
                    next2 = Boolean.valueOf(i10 == 1 ? zBooleanValue2 && zBooleanValue : i10 == 2 && (zBooleanValue2 || zBooleanValue));
                }
                return ((Boolean) next2).booleanValue();
            }
            long jLongValue = ((Number) it.next()).longValue();
            Iterator it3 = arrayList.iterator();
            while (true) {
                boolValueOf = null;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (((un.b) next).f23596a == jLongValue) {
                    break;
                }
            }
            un.b bVar = (un.b) next;
            Long lValueOf = bVar != null ? Long.valueOf(bVar.f23597b) : null;
            if (lValueOf != null) {
                long jLongValue2 = lValueOf.longValue();
                int i11 = i.f22920a[hVar2.ordinal()];
                List list = this.f22917b;
                if (i11 == 1) {
                    if (list == null || !list.isEmpty()) {
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            if (((Number) it4.next()).longValue() == jLongValue2) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z10);
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        if (list.size() == 2) {
                            long jLongValue3 = ((Number) list.get(0)).longValue();
                            if (jLongValue2 <= ((Number) list.get(1)).longValue() && jLongValue3 <= jLongValue2) {
                            }
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    } else if (i11 != 4) {
                        throw new bf.n();
                    }
                    z10 = true;
                    boolValueOf = Boolean.valueOf(z10);
                } else if (list == null || !list.isEmpty()) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        if (((Number) it5.next()).longValue() == jLongValue2) {
                            break;
                        }
                    }
                    z10 = true;
                    boolValueOf = Boolean.valueOf(z10);
                } else {
                    z10 = true;
                    boolValueOf = Boolean.valueOf(z10);
                }
            }
            if (boolValueOf != null) {
                arrayList2.add(boolValueOf);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f22916a == gVar.f22916a && br.l.a(this.f22917b, gVar.f22917b) && br.l.a(this.f22918c, gVar.f22918c) && this.f22919d == gVar.f22919d;
    }

    public final int hashCode() {
        return this.f22919d.hashCode() + h0.b.c(h0.b.c(this.f22916a.hashCode() * 31, 31, this.f22917b), 31, this.f22918c);
    }

    public final String toString() {
        return "DisplayLogicMatrixGroup(condition=" + this.f22916a + ", value=" + this.f22917b + ", answerIds=" + this.f22918c + ", answerIdsOperator=" + this.f22919d + ')';
    }
}
