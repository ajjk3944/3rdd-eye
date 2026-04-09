package c7;

/* compiled from: LiteralsEscaper.kt */
/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2073a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f18508a = {"'", "@{"};

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r12) {
        /*
            java.lang.String[] r0 = c7.C2073a.f18508a
            java.lang.String r1 = "string"
            kotlin.jvm.internal.l.f(r12, r1)
            r1 = 92
            boolean r2 = y9.q.c0(r12, r1)
            if (r2 != 0) goto L10
            return r12
        L10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r12.length()
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L1b:
            int r5 = r12.length()
            if (r4 >= r5) goto Laf
            char r5 = r12.charAt(r4)
            if (r5 == r1) goto L32
            int r5 = r4 + 1
            char r4 = r12.charAt(r4)
            r2.append(r4)
            r4 = r5
            goto L1b
        L32:
            r5 = r4
        L33:
            int r6 = r12.length()
            if (r5 >= r6) goto L42
            char r6 = r12.charAt(r5)
            if (r6 != r1) goto L42
            int r5 = r5 + 1
            goto L33
        L42:
            int r5 = r5 - r4
            int r4 = r4 + r5
            int r6 = r5 / 2
            r7 = r3
        L47:
            if (r7 >= r6) goto L4f
            r2.append(r1)
            int r7 = r7 + 1
            goto L47
        L4f:
            int r5 = r5 % 2
            r6 = 1
            if (r5 != r6) goto L1b
            int r5 = r12.length()
            if (r4 == r5) goto L9a
            char r5 = r12.charAt(r4)
            r7 = 32
            if (r5 == r7) goto L9a
            int r5 = r0.length
            r6 = r3
        L64:
            if (r6 >= r5) goto L91
            r7 = r0[r6]
            int r8 = r7.length()
            r9 = r3
        L6d:
            if (r9 >= r8) goto L88
            int r10 = r4 + r9
            int r11 = r12.length()
            if (r10 >= r11) goto L85
            char r10 = r12.charAt(r10)
            char r11 = r7.charAt(r9)
            if (r10 == r11) goto L82
            goto L85
        L82:
            int r9 = r9 + 1
            goto L6d
        L85:
            int r6 = r6 + 1
            goto L64
        L88:
            r2.append(r7)
            int r5 = r7.length()
            int r4 = r4 + r5
            goto L1b
        L91:
            a7.b r12 = new a7.b
            r0 = 0
            java.lang.String r1 = "Incorrect string escape"
            r12.<init>(r0, r1)
            throw r12
        L9a:
            a7.t r12 = new a7.t
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Alone backslash at "
            r0.<init>(r1)
            int r4 = r4 - r6
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        Laf:
            java.lang.String r12 = r2.toString()
            java.lang.String r0 = "literalBuilder.toString()"
            kotlin.jvm.internal.l.e(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C2073a.a(java.lang.String):java.lang.String");
    }
}
