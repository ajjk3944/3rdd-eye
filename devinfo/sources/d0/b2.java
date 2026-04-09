package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b2 {
    static {
        new bh.r(3, null, 4);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(c2.k0 r5, boolean r6, c2.k r7, ek.a r8) {
        /*
            boolean r0 = r8 instanceof d0.a2
            if (r0 == 0) goto L13
            r0 = r8
            d0.a2 r0 = (d0.a2) r0
            int r1 = r0.f21669e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21669e = r1
            goto L18
        L13:
            d0.a2 r0 = new d0.a2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f21668d
            int r1 = r0.f21669e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.f21667c
            c2.k r6 = r0.f21666b
            c2.k0 r7 = r0.f21665a
            ci.b.D(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            ci.b.D(r8)
        L3a:
            r0.f21665a = r5
            r0.f21666b = r7
            r0.f21667c = r6
            r0.f21669e = r2
            java.lang.Object r8 = r5.b(r7, r0)
            dk.a r1 = dk.a.f22275a
            if (r8 != r1) goto L4b
            return r1
        L4b:
            c2.j r8 = (c2.j) r8
            boolean r1 = c(r8, r6)
            if (r1 == 0) goto L3a
            java.lang.Object r5 = r8.f2626a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b2.a(c2.k0, boolean, c2.k, ek.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean c(c2.j jVar, boolean z3) {
        ?? r62 = jVar.f2626a;
        int size = r62.size();
        int i4 = 0;
        while (true) {
            boolean zA = true;
            if (i4 >= size) {
                return true;
            }
            c2.p pVar = (c2.p) r62.get(i4);
            if (!z3) {
                zA = c2.h0.a(pVar);
            } else if (pVar.b() || pVar.f2664h || !pVar.f2661d) {
                zA = false;
            }
            if (!zA) {
                return false;
            }
            i4++;
        }
    }
}
