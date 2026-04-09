package com.ubnt.usurvey.product;

import ab.C3781d;
import com.ubnt.usurvey.product.m;
import kotlin.jvm.internal.AbstractC6492s;
import ua.InterfaceC8153a;

/* loaded from: classes3.dex */
public abstract class o {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40769a;

        static {
            int[] iArr = new int[m.c.values().length];
            try {
                iArr[m.c.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.c.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40769a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.ubnt.usurvey.product.m b(xa.InterfaceC8439a.d r6, com.ubnt.usurvey.product.m.c r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC6492s.i(r6, r0)
            java.lang.String r0 = "variant"
            kotlin.jvm.internal.AbstractC6492s.i(r7, r0)
            java.lang.Object r0 = r6.N()
            com.ubnt.usurvey.product.l r0 = (com.ubnt.usurvey.product.l) r0
            r1 = 0
            if (r0 == 0) goto L23
            ab.d r0 = com.ubnt.usurvey.product.u.a(r0)
            if (r0 == 0) goto L23
            ab.d$a$b r2 = r7.getVariant()
            ab.d$a r0 = r0.c(r2)
            goto L24
        L23:
            r0 = r1
        L24:
            java.util.Set r2 = r6.Q0()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            zi.j r2 = Zg.AbstractC3689v.d0(r2)
            com.ubnt.usurvey.product.n r3 = new com.ubnt.usurvey.product.n
            r3.<init>()
            zi.j r2 = zi.AbstractC8783m.O(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L3b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()
            r4 = r3
            ab.d$a r4 = (ab.C3781d.a) r4
            ab.d$a$b r4 = r4.g()
            ab.d$a$b r5 = r7.getVariant()
            boolean r4 = kotlin.jvm.internal.AbstractC6492s.d(r4, r5)
            if (r4 == 0) goto L3b
            goto L58
        L57:
            r3 = r1
        L58:
            ab.d$a r3 = (ab.C3781d.a) r3
            if (r0 == 0) goto L7a
            if (r3 == 0) goto L7a
            java.lang.String r2 = r0.a()
            java.lang.String r4 = r3.a()
            boolean r2 = ab.C3781d.a.C0988a.c(r2, r4)
            if (r2 != 0) goto L7a
            com.ubnt.usurvey.product.m$b r6 = new com.ubnt.usurvey.product.m$b
            int r7 = r7.getSize()
            java.net.URI r7 = r3.c(r7)
            r6.<init>(r7)
            return r6
        L7a:
            if (r0 != 0) goto L8c
            if (r3 == 0) goto L8c
            com.ubnt.usurvey.product.m$b r6 = new com.ubnt.usurvey.product.m$b
            int r7 = r7.getSize()
            java.net.URI r7 = r3.c(r7)
            r6.<init>(r7)
            return r6
        L8c:
            if (r0 == 0) goto Ldd
            int[] r0 = com.ubnt.usurvey.product.o.a.f40769a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            if (r7 == r0) goto Lbb
            r0 = 2
            if (r7 != r0) goto Lb5
            java.lang.Object r6 = r6.N()
            com.ubnt.usurvey.product.l r6 = (com.ubnt.usurvey.product.l) r6
            if (r6 == 0) goto Lb3
            com.ubnt.usurvey.product.r r6 = com.ubnt.usurvey.product.s.a(r6)
            if (r6 == 0) goto Lb3
            int r6 = r6.a()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto Ld1
        Lb3:
            r6 = r1
            goto Ld1
        Lb5:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lbb:
            java.lang.Object r6 = r6.N()
            com.ubnt.usurvey.product.l r6 = (com.ubnt.usurvey.product.l) r6
            if (r6 == 0) goto Lb3
            com.ubnt.usurvey.product.r r6 = com.ubnt.usurvey.product.s.a(r6)
            if (r6 == 0) goto Lb3
            int r6 = r6.b()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        Ld1:
            if (r6 == 0) goto Ldd
            com.ubnt.usurvey.product.m$a r7 = new com.ubnt.usurvey.product.m$a
            int r6 = r6.intValue()
            r7.<init>(r6)
            return r7
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ubnt.usurvey.product.o.b(xa.a$d, com.ubnt.usurvey.product.m$c):com.ubnt.usurvey.product.m");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3781d.a c(InterfaceC8153a.b it) {
        AbstractC6492s.i(it, "it");
        if (it instanceof C3781d.a) {
            return (C3781d.a) it;
        }
        return null;
    }
}
