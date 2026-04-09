package j0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final x.e0 f27024a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.api.internal.a0 f27025b;

    /* renamed from: c, reason: collision with root package name */
    public int f27026c;

    /* renamed from: d, reason: collision with root package name */
    public final x.f0 f27027d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f27028e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f27029f;
    public final ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f27030h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f27031i;
    public v j;

    /* renamed from: k, reason: collision with root package name */
    public final i1.n f27032k;

    public y() {
        long[] jArr = x.l0.f36914a;
        this.f27024a = new x.e0();
        x.f0 f0Var = x.m0.f36916a;
        this.f27027d = new x.f0();
        this.f27028e = new ArrayList();
        this.f27029f = new ArrayList();
        this.g = new ArrayList();
        this.f27030h = new ArrayList();
        this.f27031i = new ArrayList();
        this.f27032k = new u(this);
    }

    public static void b(i0.q qVar, int i4, w wVar) {
        int i10 = 0;
        long jA = qVar.a(0);
        int i11 = true & true ? (int) (jA >> 32) : 0;
        if ((1 & 2) != 0) {
            i4 = (int) (jA & 4294967295L);
        }
        long j = (i11 << 32) | (4294967295L & i4);
        s[] sVarArr = wVar.f26993a;
        int length = sVarArr.length;
        int i12 = 0;
        while (i10 < length) {
            s sVar = sVarArr[i10];
            int i13 = i12 + 1;
            if (sVar != null) {
                sVar.f26967l = d3.i.c(j, d3.i.b(qVar.a(i12), jA));
            }
            i10++;
            i12 = i13;
        }
    }

    public static int g(int[] iArr, i0.q qVar) {
        qVar.getClass();
        int i4 = iArr[0] + qVar.f25491o;
        iArr[0] = i4;
        return Math.max(0, i4);
    }

    public final long a() {
        ArrayList arrayList = this.f27031i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            s sVar = (s) arrayList.get(i4);
            s1.b bVar = sVar.f26969n;
            if (bVar != null) {
                jMax = (Math.max((int) (jMax & 4294967295L), ((int) (sVar.f26967l & 4294967295L)) + ((int) (bVar.f33249u & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), ((int) (sVar.f26967l >> 32)) + ((int) (bVar.f33249u >> 32))) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Type inference failed for: r13v18, types: [ck.c, ck.h, xk.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r49, int r50, int r51, java.util.ArrayList r52, com.google.android.gms.common.api.internal.a0 r53, i0.m r54, boolean r55, boolean r56, int r57, int r58, xk.v r59, p1.x r60) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.y.c(int, int, int, java.util.ArrayList, com.google.android.gms.common.api.internal.a0, i0.m, boolean, boolean, int, int, xk.v, p1.x):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r15 = this;
            x.e0 r0 = r15.f27024a
            boolean r1 = r0.j()
            if (r1 == 0) goto L5d
            java.lang.Object[] r1 = r0.f36875c
            long[] r2 = r0.f36873a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L13:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            j0.w r11 = (j0.w) r11
            j0.s[] r11 = r11.f26993a
            int r12 = r11.length
            r13 = r4
        L43:
            if (r13 >= r12) goto L4f
            r14 = r11[r13]
            if (r14 == 0) goto L4c
            r14.c()
        L4c:
            int r13 = r13 + 1
            goto L43
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L13
        L5a:
            r0.a()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.y.d():void");
    }

    public final void e(Object obj) {
        s[] sVarArr;
        w wVar = (w) this.f27024a.k(obj);
        if (wVar == null || (sVarArr = wVar.f26993a) == null) {
            return;
        }
        for (s sVar : sVarArr) {
            if (sVar != null) {
                sVar.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(i0.q r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Object r1 = r0.f25486i
            r2 = r17
            x.e0 r3 = r2.f27024a
            java.lang.Object r1 = r3.g(r1)
            nk.k.b(r1)
            j0.w r1 = (j0.w) r1
            j0.s[] r1 = r1.f26993a
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L76
            r7 = r1[r4]
            int r13 = r5 + 1
            if (r7 == 0) goto L6e
            long r14 = r0.a(r5)
            long r5 = r7.f26967l
            long r8 = j0.s.f26956s
            boolean r8 = d3.i.a(r5, r8)
            if (r8 != 0) goto L69
            boolean r8 = d3.i.a(r5, r14)
            if (r8 != 0) goto L69
            long r5 = d3.i.b(r14, r5)
            a0.z r8 = r7.f26962e
            if (r8 != 0) goto L3b
            goto L69
        L3b:
            u0.d1 r9 = r7.f26972q
            java.lang.Object r9 = r9.getValue()
            d3.i r9 = (d3.i) r9
            long r9 = r9.f21959a
            long r9 = d3.i.b(r9, r5)
            r7.g(r9)
            r5 = 1
            r7.f(r5)
            r5 = r19
            r7.g = r5
            xk.v r6 = r7.f26958a
            r11 = r6
            c0.b r6 = new c0.b
            r12 = r11
            r11 = 0
            r16 = r12
            r12 = 3
            r0 = r16
            r6.<init>(r7, r8, r9, r11, r12)
            r8 = 3
            r9 = 0
            xk.x.v(r0, r9, r9, r6, r8)
            goto L6b
        L69:
            r5 = r19
        L6b:
            r7.f26967l = r14
            goto L70
        L6e:
            r5 = r19
        L70:
            int r4 = r4 + 1
            r0 = r18
            r5 = r13
            goto L16
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.y.f(i0.q, boolean):void");
    }
}
