package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.v42;

/* renamed from: com.yandex.mobile.ads.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4089d extends v42 {

    /* renamed from: c, reason: collision with root package name */
    private final int f25890c;

    /* renamed from: d, reason: collision with root package name */
    private final xx1 f25891d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25892e = false;

    public AbstractC4089d(xx1 xx1Var) {
        this.f25891d = xx1Var;
        this.f25890c = xx1Var.b();
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    public abstract int b(int i);

    public abstract int b(Object obj);

    @Override // com.yandex.mobile.ads.impl.v42
    public final int b(boolean z10) {
        int i = this.f25890c;
        if (i == 0) {
            return -1;
        }
        if (this.f25892e) {
            z10 = false;
        }
        int iC = z10 ? this.f25891d.c() : i - 1;
        while (g(iC).c()) {
            iC = z10 ? this.f25891d.d(iC) : iC > 0 ? iC - 1 : -1;
            if (iC == -1) {
                return -1;
            }
        }
        return g(iC).b(z10) + f(iC);
    }

    public abstract int c(int i);

    public abstract Object d(int i);

    public abstract int e(int i);

    public abstract int f(int i);

    public abstract v42 g(int i);

    @Override // com.yandex.mobile.ads.impl.v42
    public final int a(boolean z10) {
        if (this.f25890c == 0) {
            return -1;
        }
        if (this.f25892e) {
            z10 = false;
        }
        int iA = z10 ? this.f25891d.a() : 0;
        while (g(iA).c()) {
            iA = z10 ? this.f25891d.a(iA) : iA < this.f25890c + (-1) ? iA + 1 : -1;
            if (iA == -1) {
                return -1;
            }
        }
        return g(iA).a(z10) + f(iA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.yandex.mobile.ads.impl.v42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f25892e
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r2) goto La
            r8 = r3
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.v42 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.b(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L2f
            com.yandex.mobile.ads.impl.xx1 r7 = r6.f25891d
            int r7 = r7.d(r0)
            r0 = r7
            goto L33
        L2f:
            if (r0 <= 0) goto L32
            goto L4a
        L32:
            r0 = r1
        L33:
            if (r0 == r1) goto L4c
            com.yandex.mobile.ads.impl.v42 r7 = r6.g(r0)
            boolean r7 = r7.c()
            if (r7 == 0) goto L4c
            if (r9 == 0) goto L48
            com.yandex.mobile.ads.impl.xx1 r7 = r6.f25891d
            int r0 = r7.d(r0)
            goto L33
        L48:
            if (r0 <= 0) goto L32
        L4a:
            int r0 = r0 - r2
            goto L33
        L4c:
            if (r0 == r1) goto L5c
            int r7 = r6.f(r0)
            com.yandex.mobile.ads.impl.v42 r8 = r6.g(r0)
            int r8 = r8.b(r9)
            int r8 = r8 + r7
            return r8
        L5c:
            if (r8 != r3) goto L63
            int r7 = r6.b(r9)
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC4089d.b(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB = b(obj2);
        if (iB == -1 || (iA = g(iB).a(obj3)) == -1) {
            return -1;
        }
        return e(iB) + iA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0036, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0036, code lost:
    
        r0 = r0 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.v42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.f25892e
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto Lb
            if (r8 != r3) goto La
            r8 = r2
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.v42 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.a(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L2f
            com.yandex.mobile.ads.impl.xx1 r7 = r6.f25891d
            int r7 = r7.a(r0)
            r0 = r7
            goto L36
        L2f:
            int r7 = r6.f25890c
            int r7 = r7 - r3
            if (r0 >= r7) goto L35
            goto L50
        L35:
            r0 = r1
        L36:
            if (r0 == r1) goto L52
            com.yandex.mobile.ads.impl.v42 r7 = r6.g(r0)
            boolean r7 = r7.c()
            if (r7 == 0) goto L52
            if (r9 == 0) goto L4b
            com.yandex.mobile.ads.impl.xx1 r7 = r6.f25891d
            int r0 = r7.a(r0)
            goto L36
        L4b:
            int r7 = r6.f25890c
            int r7 = r7 - r3
            if (r0 >= r7) goto L35
        L50:
            int r0 = r0 + r3
            goto L36
        L52:
            if (r0 == r1) goto L62
            int r7 = r6.f(r0)
            com.yandex.mobile.ads.impl.v42 r8 = r6.g(r0)
            int r8 = r8.a(r9)
            int r8 = r8 + r7
            return r8
        L62:
            if (r8 != r2) goto L69
            int r7 = r6.a(r9)
            return r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.AbstractC4089d.a(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final v42.b a(int i, v42.b bVar, boolean z10) {
        int iB = b(i);
        int iF = f(iB);
        g(iB).a(i - e(iB), bVar, z10);
        bVar.f34345d += iF;
        if (z10) {
            Object objD = d(iB);
            Object obj = bVar.f34344c;
            obj.getClass();
            bVar.f34344c = Pair.create(objD, obj);
        }
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final v42.b a(Object obj, v42.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iB = b(obj2);
        int iF = f(iB);
        g(iB).a(obj3, bVar);
        bVar.f34345d += iF;
        bVar.f34344c = obj;
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final Object a(int i) {
        int iB = b(i);
        return Pair.create(d(iB), g(iB).a(i - e(iB)));
    }

    @Override // com.yandex.mobile.ads.impl.v42
    public final v42.d a(int i, v42.d dVar, long j4) {
        int iC = c(i);
        int iF = f(iC);
        int iE = e(iC);
        g(iC).a(i - iF, dVar, j4);
        Object objD = d(iC);
        if (!v42.d.f34354s.equals(dVar.f34358b)) {
            objD = Pair.create(objD, dVar.f34358b);
        }
        dVar.f34358b = objD;
        dVar.f34371p += iE;
        dVar.f34372q += iE;
        return dVar;
    }
}
