package p2;

import java.util.Iterator;
import x.e0;
import x.l0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements x, Iterable, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f31095a;

    /* renamed from: b, reason: collision with root package name */
    public x.r f31096b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31097c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31098d;

    public l() {
        long[] jArr = l0.f36914a;
        this.f31095a = new e0();
    }

    @Override // p2.x
    public final void a(w wVar, Object obj) {
        boolean z3 = obj instanceof a;
        e0 e0Var = this.f31095a;
        if (z3 && e0Var.c(wVar)) {
            Object objG = e0Var.g(wVar);
            nk.k.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f31036a;
            if (str == null) {
                str = aVar.f31036a;
            }
            yj.c cVar = aVar2.f31037b;
            if (cVar == null) {
                cVar = aVar.f31037b;
            }
            e0Var.m(wVar, new a(str, cVar));
        } else {
            e0Var.m(wVar, obj);
        }
        wVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p2.l c() {
        /*
            r18 = this;
            r0 = r18
            p2.l r1 = new p2.l
            r1.<init>()
            boolean r2 = r0.f31097c
            r1.f31097c = r2
            boolean r2 = r0.f31098d
            r1.f31098d = r2
            x.e0 r2 = r1.f31095a
            r2.getClass()
            java.lang.String r3 = "from"
            x.e0 r4 = r0.f31095a
            nk.k.e(r4, r3)
            java.lang.Object[] r3 = r4.f36874b
            java.lang.Object[] r5 = r4.f36875c
            long[] r4 = r4.f36873a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.m(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.l.c():p2.l");
    }

    public final Object d(w wVar) {
        Object objG = this.f31095a.g(wVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return nk.k.a(this.f31095a, lVar.f31095a) && this.f31097c == lVar.f31097c && this.f31098d == lVar.f31098d;
    }

    public final void f(l lVar) {
        e0 e0Var = lVar.f31095a;
        Object[] objArr = e0Var.f36874b;
        Object[] objArr2 = e0Var.f36875c;
        long[] jArr = e0Var.f36873a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i4 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        w wVar = (w) obj;
                        e0 e0Var2 = this.f31095a;
                        Object objG = e0Var2.g(wVar);
                        nk.k.c(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = wVar.f31142b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            e0Var2.m(wVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
    }

    public final int hashCode() {
        return (((this.f31095a.hashCode() * 31) + (this.f31097c ? 1231 : 1237)) * 31) + (this.f31098d ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        x.r rVar = this.f31096b;
        if (rVar == null) {
            e0 e0Var = this.f31095a;
            e0Var.getClass();
            x.r rVar2 = new x.r(e0Var);
            this.f31096b = rVar2;
            rVar = rVar2;
        }
        return ((x.g) rVar.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f31097c
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f31098d
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            x.e0 r4 = r0.f31095a
            java.lang.Object[] r5 = r4.f36874b
            java.lang.Object[] r6 = r4.f36875c
            long[] r4 = r4.f36873a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            p2.w r8 = (p2.w) r8
            r1.append(r2)
            java.lang.String r2 = r8.f31141a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = j2.d0.r(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.l.toString():java.lang.String");
    }
}
