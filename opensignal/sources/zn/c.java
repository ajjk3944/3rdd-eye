package zn;

import br.l;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final List f27466a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27467b;

    public c(List list, boolean z10, wn.a aVar) {
        l.e(list, "values");
        this.f27466a = list;
        this.f27467b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[LOOP:0: B:8:0x0034->B:49:?, LOOP_END, SYNTHETIC] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws java.io.IOException {
        /*
            r10 = this;
            java.util.List r0 = eo.a.f8244a
            java.lang.String r0 = h7.h0.B()
            java.lang.String r1 = "-"
            java.lang.String[] r2 = new java.lang.String[]{r1}
            r3 = 6
            java.util.List r0 = tt.l.N0(r0, r2, r3)
            r2 = 2
            java.util.List r3 = mq.o.N0(r2, r0)
            r7 = 0
            r8 = 62
            java.lang.String r4 = "-"
            r5 = 0
            r6 = 0
            java.lang.String r0 = mq.o.x0(r3, r4, r5, r6, r7, r8)
            r2 = 1
            r3 = 0
            java.util.List r4 = r10.f27466a
            if (r4 == 0) goto L30
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L30
        L2d:
            r0 = r3
            goto Lcb
        L30:
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r7 = r5.toLowerCase(r6)
            java.lang.String r8 = "toLowerCase(...)"
            br.l.d(r7, r8)
            java.lang.String r9 = r0.toLowerCase(r6)
            br.l.d(r9, r8)
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto Lc7
            boolean r7 = tt.l.q0(r0, r1, r3)
            if (r7 == 0) goto L7b
            boolean r7 = tt.l.q0(r5, r1, r3)
            if (r7 != 0) goto L7b
            java.lang.String r7 = tt.l.V0(r0, r1)
            java.lang.String r9 = r5.toLowerCase(r6)
            br.l.d(r9, r8)
            java.lang.String r7 = r7.toLowerCase(r6)
            br.l.d(r7, r8)
            boolean r7 = r9.equals(r7)
            goto L7c
        L7b:
            r7 = r3
        L7c:
            if (r7 != 0) goto Lc7
            java.lang.String r7 = "zh"
            boolean r9 = tt.s.n0(r5, r7, r3)
            if (r9 != 0) goto L88
        L86:
            r5 = r3
            goto Lc2
        L88:
            java.lang.String r9 = r0.toLowerCase(r6)
            br.l.d(r9, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            br.l.d(r5, r8)
            java.lang.String r6 = "zh-tw"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto Lbc
            java.lang.String r6 = "zh-hant"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto La7
            goto Lbc
        La7:
            boolean r6 = r5.equals(r7)
            if (r6 != 0) goto Lb5
            java.lang.String r6 = "zh-hans"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L86
        Lb5:
            java.util.List r5 = eo.a.f8245b
            boolean r5 = r5.contains(r9)
            goto Lc2
        Lbc:
            java.util.List r5 = eo.a.f8244a
            boolean r5 = r5.contains(r9)
        Lc2:
            if (r5 == 0) goto Lc5
            goto Lc7
        Lc5:
            r5 = r3
            goto Lc8
        Lc7:
            r5 = r2
        Lc8:
            if (r5 == 0) goto L34
            r0 = r2
        Lcb:
            boolean r1 = r10.f27467b
            if (r1 == 0) goto Ld3
            if (r0 != 0) goto Ld2
            return r2
        Ld2:
            return r3
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.c.a():boolean");
    }
}
