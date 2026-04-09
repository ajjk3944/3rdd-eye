package tn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final l f22923a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22924b;

    public k(l lVar, List list) {
        br.l.e(lVar, "condition");
        br.l.e(list, "value");
        this.f22923a = lVar;
        this.f22924b = list;
    }

    public final boolean a(un.f fVar) {
        ArrayList arrayList = fVar.f23605b;
        int i10 = j.f22922a[this.f22923a.ordinal()];
        List list = this.f22924b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (arrayList.isEmpty() || arrayList.isEmpty()) {
                        return false;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (list.contains(Long.valueOf(((Number) it.next()).longValue()))) {
                        }
                    }
                    return false;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new bf.n();
                    }
                } else {
                    if (arrayList.isEmpty()) {
                        return false;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (list.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                                return false;
                            }
                        }
                    }
                }
            } else if (list.isEmpty() || !arrayList.containsAll(list)) {
                return false;
            }
        } else if (arrayList.isEmpty() || !mq.o.L0(arrayList).equals(mq.o.L0(list))) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f22923a == kVar.f22923a && br.l.a(this.f22924b, kVar.f22924b);
    }

    public final int hashCode() {
        return this.f22924b.hashCode() + (this.f22923a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayLogicMultipleChoiceGroup(condition=");
        sb2.append(this.f22923a);
        sb2.append(", value=");
        return h0.b.t(sb2, this.f22924b, ')');
    }
}
