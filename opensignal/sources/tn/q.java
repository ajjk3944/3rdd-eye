package tn;

import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final r f22929a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22930b;

    public q(r rVar, List list) {
        br.l.e(rVar, "condition");
        br.l.e(list, "value");
        this.f22929a = rVar;
        this.f22930b = list;
    }

    public final boolean a(un.h hVar) {
        Long l10 = hVar.f23609b;
        r rVar = this.f22929a;
        if (l10 != null) {
            int i10 = p.f22928a[rVar.ordinal()];
            List list = this.f22930b;
            if (i10 == 1) {
                return list.contains(l10);
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new bf.n();
                }
            } else if (list.contains(l10)) {
                return false;
            }
        } else if (rVar != r.HAS_ANY_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f22929a == qVar.f22929a && br.l.a(this.f22930b, qVar.f22930b);
    }

    public final int hashCode() {
        return this.f22930b.hashCode() + (this.f22929a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayLogicSingleChoiceGroup(condition=");
        sb2.append(this.f22929a);
        sb2.append(", value=");
        return h0.b.t(sb2, this.f22930b, ')');
    }
}
