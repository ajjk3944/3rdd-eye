package pr;

/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pr.e a(java.lang.String r7, qs.c r8) {
        /*
            java.lang.String r0 = "packageFqName"
            br.l.e(r8, r0)
            pr.g[] r0 = pr.g.values()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            r4 = 0
            if (r3 >= r1) goto L29
            r5 = r0[r3]
            qs.c r6 = r5.getPackageFqName()
            boolean r6 = br.l.a(r6, r8)
            if (r6 == 0) goto L26
            java.lang.String r6 = r5.getClassNamePrefix()
            boolean r6 = tt.s.n0(r7, r6, r2)
            if (r6 == 0) goto L26
            goto L2a
        L26:
            int r3 = r3 + 1
            goto Lc
        L29:
            r5 = r4
        L2a:
            if (r5 != 0) goto L2d
            goto L6f
        L2d:
            java.lang.String r8 = r5.getClassNamePrefix()
            int r8 = r8.length()
            java.lang.String r7 = r7.substring(r8)
            java.lang.String r8 = "this as java.lang.String).substring(startIndex)"
            br.l.d(r7, r8)
            int r8 = r7.length()
            if (r8 != 0) goto L46
        L44:
            r7 = r4
            goto L63
        L46:
            int r8 = r7.length()
            r0 = r2
        L4b:
            if (r2 >= r8) goto L5f
            char r1 = r7.charAt(r2)
            int r1 = r1 + (-48)
            if (r1 < 0) goto L44
            r3 = 10
            if (r1 >= r3) goto L44
            int r0 = r0 * 10
            int r0 = r0 + r1
            int r2 = r2 + 1
            goto L4b
        L5f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L63:
            if (r7 == 0) goto L6f
            int r7 = r7.intValue()
            pr.e r8 = new pr.e
            r8.<init>(r5, r7)
            return r8
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: pr.f.a(java.lang.String, qs.c):pr.e");
    }
}
