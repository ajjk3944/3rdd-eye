package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21693a = ((float) 0.125d) / 18;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (o1.b.b(c2.h0.f(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(c2.k0 r12, long r13, ek.c r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d0.a(c2.k0, long, ek.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [nk.u] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(c2.k0 r8, long r9, ek.a r11) {
        /*
            boolean r0 = r11 instanceof d0.y
            if (r0 == 0) goto L13
            r0 = r11
            d0.y r0 = (d0.y) r0
            int r1 = r0.f21898e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21898e = r1
            goto L18
        L13:
            d0.y r0 = new d0.y
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f21897d
            int r1 = r0.f21898e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            nk.q r8 = r0.f21896c
            nk.u r9 = r0.f21895b
            c2.p r10 = r0.f21894a
            ci.b.D(r11)     // Catch: c2.l -> La7
            goto L9a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            ci.b.D(r11)
            c2.m0 r11 = r8.f2643f
            c2.j r11 = r11.f2651s
            boolean r11 = d(r11, r9)
            if (r11 == 0) goto L43
            goto La6
        L43:
            c2.m0 r11 = r8.f2643f
            c2.j r11 = r11.f2651s
            java.lang.Object r11 = r11.f2626a
            int r1 = r11.size()
            r4 = 0
        L4e:
            if (r4 >= r1) goto L63
            java.lang.Object r5 = r11.get(r4)
            r6 = r5
            c2.p r6 = (c2.p) r6
            long r6 = r6.f2658a
            boolean r6 = c2.h0.d(r6, r9)
            if (r6 == 0) goto L60
            goto L64
        L60:
            int r4 = r4 + 1
            goto L4e
        L63:
            r5 = r3
        L64:
            r10 = r5
            c2.p r10 = (c2.p) r10
            if (r10 != 0) goto L6a
            goto La6
        L6a:
            nk.u r9 = new nk.u
            r9.<init>()
            nk.u r11 = new nk.u
            r11.<init>()
            r11.f29986a = r10
            j2.y1 r1 = r8.d()
            long r4 = r1.a()
            nk.q r1 = new nk.q     // Catch: c2.l -> La7
            r1.<init>()     // Catch: c2.l -> La7
            d0.z r6 = new d0.z     // Catch: c2.l -> La7
            r6.<init>(r1, r11, r9, r3)     // Catch: c2.l -> La7
            r0.f21894a = r10     // Catch: c2.l -> La7
            r0.f21895b = r9     // Catch: c2.l -> La7
            r0.f21896c = r1     // Catch: c2.l -> La7
            r0.f21898e = r2     // Catch: c2.l -> La7
            java.lang.Object r8 = r8.e(r4, r6, r0)     // Catch: c2.l -> La7
            dk.a r11 = dk.a.f22275a
            if (r8 != r11) goto L99
            return r11
        L99:
            r8 = r1
        L9a:
            boolean r8 = r8.f29982a     // Catch: c2.l -> La7
            if (r8 == 0) goto La6
            java.lang.Object r8 = r9.f29986a     // Catch: c2.l -> La7
            c2.p r8 = (c2.p) r8     // Catch: c2.l -> La7
            if (r8 != 0) goto La5
            return r10
        La5:
            return r8
        La6:
            return r3
        La7:
            java.lang.Object r8 = r9.f29986a
            c2.p r8 = (c2.p) r8
            if (r8 != 0) goto Lae
            goto Laf
        Lae:
            r10 = r8
        Laf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d0.b(c2.k0, long, ek.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(c2.k0 r4, long r5, mk.c r7, ek.a r8) {
        /*
            boolean r0 = r8 instanceof d0.c0
            if (r0 == 0) goto L13
            r0 = r8
            d0.c0 r0 = (d0.c0) r0
            int r1 = r0.f21683d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21683d = r1
            goto L18
        L13:
            d0.c0 r0 = new d0.c0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21682c
            int r1 = r0.f21683d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            mk.c r4 = r0.f21681b
            c2.k0 r5 = r0.f21680a
            ci.b.D(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ci.b.D(r8)
        L36:
            r0.f21680a = r4
            r0.f21681b = r7
            r0.f21683d = r2
            java.lang.Object r8 = a(r4, r5, r0)
            dk.a r5 = dk.a.f22275a
            if (r8 != r5) goto L45
            return r5
        L45:
            c2.p r8 = (c2.p) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = c2.h0.c(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f2658a
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.d0.c(c2.k0, long, mk.c, ek.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean d(c2.j jVar, long j) {
        Object obj;
        ?? r62 = jVar.f2626a;
        int size = r62.size();
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i4);
            if (c2.h0.d(((c2.p) obj).f2658a, j)) {
                break;
            }
            i4++;
        }
        c2.p pVar = (c2.p) obj;
        if (pVar != null && pVar.f2661d) {
            z3 = true;
        }
        return true ^ z3;
    }

    public static final float e(j2.y1 y1Var, int i4) {
        return i4 == 2 ? y1Var.d() * f21693a : y1Var.d();
    }
}
