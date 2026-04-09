package tn;

import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f22909a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22910b;

    public b(c cVar, List list) {
        br.l.e(cVar, "condition");
        br.l.e(list, "value");
        this.f22909a = cVar;
        this.f22910b = list;
    }

    public final boolean a(un.c cVar) {
        String str = cVar.f23599b;
        int i10 = a.f22908a[this.f22909a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new bf.n();
                }
            } else if (!tt.l.D0(str)) {
                return false;
            }
        } else if (!(!tt.l.D0(str))) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f22909a == bVar.f22909a && br.l.a(this.f22910b, bVar.f22910b);
    }

    public final int hashCode() {
        return this.f22910b.hashCode() + (this.f22909a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayLogicDateGroup(condition=");
        sb2.append(this.f22909a);
        sb2.append(", value=");
        return h0.b.t(sb2, this.f22910b, ')');
    }
}
