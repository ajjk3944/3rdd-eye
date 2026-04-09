package d0;

import com.google.android.gms.internal.ads.dc;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b7.w f21791a = new b7.w(8);

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f21792b = new i1();

    /* renamed from: c, reason: collision with root package name */
    public static final h1 f21793c = new h1();

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f21794d = new j1();

    public static final void a(o7.d dVar, z1.b bVar, a1 a1Var, z1.a aVar, dc dcVar, long j) {
        float fIntBitsToFloat;
        ArrayList arrayList = dcVar.f10425b;
        long j8 = bVar.f37834c;
        boolean z3 = bVar.f37835d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (bVar.f37834c & 4294967295L));
        boolean z10 = bVar.f37838h;
        if (!z10 && z3) {
            dcVar.f10424a = 0;
            arrayList.clear();
        }
        if (!b(bVar) && (z10 || !z3)) {
            if (arrayList.size() == 3) {
                int i4 = dcVar.f10424a;
                dcVar.f10424a = i4 + 1;
                arrayList.set(i4, bVar);
            } else {
                arrayList.add(bVar);
            }
            if (dcVar.f10424a == 3) {
                dcVar.f10424a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((z1.b) arrayList.get(i10)).f37834c >> 32))));
            }
            fIntBitsToFloat2 = (float) zj.n.Y(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((z1.b) arrayList.get(i11)).f37834c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) zj.n.Y(arrayList3);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L);
        if (a1Var != null) {
            int i12 = aVar.f37831a;
            if (i12 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i12 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = a1Var == a1.f21663b ? (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        ((d2.b) dVar.f30421b).b(bVar.f37833b, o1.b.h(jFloatToRawIntBits, j));
    }

    public static final boolean b(z1.b bVar) {
        return bVar.f37838h && !bVar.f37835d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(d0.z1 r10, long r11, ek.c r13) {
        /*
            boolean r0 = r13 instanceof d0.k1
            if (r0 == 0) goto L13
            r0 = r13
            d0.k1 r0 = (d0.k1) r0
            int r1 = r0.f21773d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21773d = r1
            goto L18
        L13:
            d0.k1 r0 = new d0.k1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f21772c
            int r1 = r0.f21773d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            nk.r r10 = r0.f21771b
            d0.z1 r11 = r0.f21770a
            ci.b.D(r13)
            r7 = r10
            r10 = r11
            goto L56
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            ci.b.D(r13)
            nk.r r7 = new nk.r
            r7.<init>()
            c0.b r3 = new c0.b
            r8 = 0
            r9 = 2
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.f21770a = r4
            r0.f21771b = r7
            r0.f21773d = r2
            c0.v0 r10 = c0.v0.f2516a
            java.lang.Object r10 = r4.f(r10, r3, r0)
            dk.a r11 = dk.a.f22275a
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r4
        L56:
            float r11 = r7.f29983a
            long r10 = r10.h(r11)
            o1.b r12 = new o1.b
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.m1.c(d0.z1, long, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(d0.t1 r4, float r5, a0.z r6, ek.c r7) {
        /*
            boolean r0 = r7 instanceof d0.c1
            if (r0 == 0) goto L13
            r0 = r7
            d0.c1 r0 = (d0.c1) r0
            int r1 = r0.f21686c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21686c = r1
            goto L18
        L13:
            d0.c1 r0 = new d0.c1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21685b
            int r1 = r0.f21686c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            nk.r r4 = r0.f21684a
            ci.b.D(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ci.b.D(r7)
            nk.r r7 = new nk.r
            r7.<init>()
            d0.e1 r1 = new d0.e1
            r3 = 0
            r1.<init>(r5, r6, r7, r3)
            r0.f21684a = r7
            r0.f21686c = r2
            c0.v0 r5 = c0.v0.f2516a
            java.lang.Object r4 = r4.f(r5, r1, r0)
            dk.a r5 = dk.a.f22275a
            if (r4 != r5) goto L4c
            return r5
        L4c:
            r4 = r7
        L4d:
            float r4 = r4.f29983a
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.m1.d(d0.t1, float, a0.z, ek.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(c2.k0 r7, c2.k r8, ek.a r9) {
        /*
            boolean r0 = r9 instanceof d0.k0
            if (r0 == 0) goto L13
            r0 = r9
            d0.k0 r0 = (d0.k0) r0
            int r1 = r0.f21769d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21769d = r1
            goto L18
        L13:
            d0.k0 r0 = new d0.k0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21768c
            int r1 = r0.f21769d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            c2.k r7 = r0.f21767b
            c2.k0 r8 = r0.f21766a
            ci.b.D(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            ci.b.D(r9)
            c2.m0 r9 = r7.f2643f
            c2.j r9 = r9.f2651s
            java.lang.Object r9 = r9.f2626a
            int r1 = r9.size()
            r4 = r2
        L43:
            if (r4 >= r1) goto L7a
            java.lang.Object r5 = r9.get(r4)
            c2.p r5 = (c2.p) r5
            boolean r5 = r5.f2661d
            if (r5 == 0) goto L77
        L4f:
            r0.f21766a = r7
            r0.f21767b = r8
            r0.f21769d = r3
            java.lang.Object r9 = r7.b(r8, r0)
            dk.a r1 = dk.a.f22275a
            if (r9 != r1) goto L5e
            return r1
        L5e:
            c2.j r9 = (c2.j) r9
            java.lang.Object r9 = r9.f2626a
            int r1 = r9.size()
            r4 = r2
        L67:
            if (r4 >= r1) goto L7a
            java.lang.Object r5 = r9.get(r4)
            c2.p r5 = (c2.p) r5
            boolean r5 = r5.f2661d
            if (r5 == 0) goto L74
            goto L4f
        L74:
            int r4 = r4 + 1
            goto L67
        L77:
            int r4 = r4 + 1
            goto L43
        L7a:
            yj.u r7 = yj.u.f37649a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.m1.e(c2.k0, c2.k, ek.a):java.lang.Object");
    }

    public static final Object f(c2.u uVar, mk.e eVar, ck.c cVar) {
        dk.a aVar;
        yj.u uVar2;
        l0 l0Var = new l0(cVar.getContext(), eVar, null);
        c2.m0 m0Var = (c2.m0) uVar;
        m0Var.getClass();
        xk.h hVar = new xk.h(1, a.a.r(cVar));
        hVar.s();
        c2.k0 k0Var = new c2.k0(m0Var, hVar);
        synchronized (m0Var.f2653u) {
            m0Var.f2652t.b(k0Var);
            ck.c cVarR = a.a.r(a.a.h(k0Var, k0Var, l0Var));
            aVar = dk.a.f22275a;
            ck.j jVar = new ck.j(cVarR);
            uVar2 = yj.u.f37649a;
            jVar.resumeWith(uVar2);
        }
        hVar.u(new c2.l0(0, k0Var));
        Object objR = hVar.r();
        return objR == aVar ? objR : uVar2;
    }

    public static final long g(z1.b bVar, a1 a1Var, z1.a aVar) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (a1Var == null) {
            return bVar.f37834c;
        }
        int i4 = aVar.f37831a;
        if (i4 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f37834c >> 32));
        } else {
            if (i4 != 2) {
                return bVar.f37834c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.f37834c & 4294967295L));
        }
        if (a1Var == a1.f21663b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public static final long h(z1.b bVar, a1 a1Var, z1.a aVar) {
        float fIntBitsToFloat;
        long j = bVar.g;
        if (a1Var == null) {
            return j;
        }
        int i4 = aVar.f37831a;
        if (i4 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else {
            if (i4 != 2) {
                return j;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        if (a1Var == a1.f21663b) {
            return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
