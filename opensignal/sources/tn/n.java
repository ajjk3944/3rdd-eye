package tn;

import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final o f22926a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22927b;

    public n(o oVar, List list) {
        br.l.e(oVar, "condition");
        br.l.e(list, "value");
        this.f22926a = oVar;
        this.f22927b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(un.g r9) {
        /*
            r8 = this;
            java.lang.Long r9 = r9.f23607b
            tn.o r0 = r8.f22926a
            r1 = 0
            r2 = 1
            if (r9 != 0) goto Ld
            tn.o r9 = tn.o.HAS_ANY_VALUE
            if (r0 != r9) goto L6d
            goto L6c
        Ld:
            int[] r3 = tn.m.f22925a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            java.util.List r3 = r8.f22927b
            if (r0 == r2) goto L6e
            r4 = 2
            if (r0 == r4) goto L66
            r5 = 3
            if (r0 == r5) goto L29
            r9 = 4
            if (r0 != r9) goto L23
            goto L6c
        L23:
            bf.n r9 = new bf.n
            r9.<init>()
            throw r9
        L29:
            int r0 = r3.size()
            if (r0 != r4) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 != r2) goto L5d
            hr.g r0 = new hr.g
            java.lang.Object r4 = r3.get(r1)
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            java.lang.Object r3 = r3.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            long r6 = r3.longValue()
            r0.<init>(r4, r6)
            long r6 = r9.longValue()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L5c
            long r3 = r0.f10872d
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L5c
            return r2
        L5c:
            return r1
        L5d:
            if (r0 != 0) goto L60
            goto L6d
        L60:
            bf.n r9 = new bf.n
            r9.<init>()
            throw r9
        L66:
            boolean r9 = r3.contains(r9)
            if (r9 != 0) goto L6d
        L6c:
            return r2
        L6d:
            return r1
        L6e:
            boolean r9 = r3.contains(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.n.a(un.g):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f22926a == nVar.f22926a && br.l.a(this.f22927b, nVar.f22927b);
    }

    public final int hashCode() {
        return this.f22927b.hashCode() + (this.f22926a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayLogicRangeGroup(condition=");
        sb2.append(this.f22926a);
        sb2.append(", value=");
        return h0.b.t(sb2, this.f22927b, ')');
    }
}
