package y5;

import java.util.List;
import p5.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f24264a;

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[EDGE_INSN: B:53:0x002d->B:9:0x002d BREAK  A[LOOP:0: B:23:0x0062->B:34:0x0093]] */
    @Override // p5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.String r0 = "$this$DelimitedRangesSequence"
            q5.i.e(r12, r0)
            java.util.List r0 = r11.f24264a
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L4b
            int r1 = r0.size()
            if (r1 == 0) goto L43
            if (r1 != r3) goto L3b
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 4
            int r12 = y5.l.a0(r12, r0, r13, r2, r1)
            if (r12 >= 0) goto L30
        L2d:
            r13 = r4
            goto Lc9
        L30:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            c5.d r13 = new c5.d
            r13.<init>(r12, r0)
            goto Lc9
        L3b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "List has more than one element."
            r12.<init>(r13)
            throw r12
        L43:
            java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
            java.lang.String r13 = "List is empty."
            r12.<init>(r13)
            throw r12
        L4b:
            v5.c r1 = new v5.c
            if (r13 >= 0) goto L50
            r13 = r2
        L50:
            int r2 = r12.length()
            r1.<init>(r13, r2, r3)
            boolean r2 = r12 instanceof java.lang.String
            r5 = 0
            int r1 = r1.f23895b
            if (r2 == 0) goto L96
            if (r13 <= r1) goto L61
            goto L2d
        L61:
            r8 = r13
        L62:
            java.util.Iterator r13 = r0.iterator()
        L66:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r13.next()
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r9 = r12
            java.lang.String r9 = (java.lang.String) r9
            int r10 = r7.length()
            r6 = 0
            boolean r3 = y5.l.d0(r5, r6, r7, r8, r9, r10)
            if (r3 == 0) goto L66
            goto L83
        L82:
            r2 = r4
        L83:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L91
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            c5.d r13 = new c5.d
            r13.<init>(r12, r2)
            goto Lc9
        L91:
            if (r8 == r1) goto L2d
            int r8 = r8 + 1
            goto L62
        L96:
            if (r13 <= r1) goto L99
            goto L2d
        L99:
            java.util.Iterator r2 = r0.iterator()
        L9d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r2.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.length()
            boolean r6 = y5.l.e0(r6, r12, r13, r7, r5)
            if (r6 == 0) goto L9d
            goto Lb6
        Lb5:
            r3 = r4
        Lb6:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lc4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            c5.d r13 = new c5.d
            r13.<init>(r12, r3)
            goto Lc9
        Lc4:
            if (r13 == r1) goto L2d
            int r13 = r13 + 1
            goto L99
        Lc9:
            if (r13 == 0) goto Ldf
            java.lang.Object r12 = r13.f5921a
            java.lang.Object r13 = r13.f5922b
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            c5.d r0 = new c5.d
            r0.<init>(r12, r13)
            return r0
        Ldf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.k.h(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
