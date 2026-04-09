package d0;

import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public t1 f21919a;

    /* renamed from: b, reason: collision with root package name */
    public c0.j f21920b;

    /* renamed from: c, reason: collision with root package name */
    public k f21921c;

    /* renamed from: d, reason: collision with root package name */
    public a1 f21922d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21923e;

    /* renamed from: f, reason: collision with root package name */
    public b2.e f21924f;
    public final s1 g;

    /* renamed from: h, reason: collision with root package name */
    public final o1 f21925h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21926i;
    public int j = 1;

    /* renamed from: k, reason: collision with root package name */
    public f1 f21927k = m1.f21792b;

    /* renamed from: l, reason: collision with root package name */
    public final x1 f21928l = new x1(this);

    /* renamed from: m, reason: collision with root package name */
    public final b7.u f21929m = new b7.u(5, this);

    public z1(t1 t1Var, c0.j jVar, k kVar, a1 a1Var, boolean z3, b2.e eVar, s1 s1Var, o1 o1Var) {
        this.f21919a = t1Var;
        this.f21920b = jVar;
        this.f21921c = kVar;
        this.f21922d = a1Var;
        this.f21923e = z3;
        this.f21924f = eVar;
        this.g = s1Var;
        this.f21925h = o1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r11, ek.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof d0.u1
            if (r0 == 0) goto L13
            r0 = r13
            d0.u1 r0 = (d0.u1) r0
            int r1 = r0.f21856d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21856d = r1
            goto L18
        L13:
            d0.u1 r0 = new d0.u1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f21854b
            int r1 = r0.f21856d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            nk.t r11 = r0.f21853a
            ci.b.D(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L59
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L69
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            ci.b.D(r13)
            nk.t r6 = new nk.t
            r6.<init>()
            r6.f29985a = r11
            r10.f21926i = r3
            c0.v0 r13 = c0.v0.f2516a     // Catch: java.lang.Throwable -> L66
            d0.w1 r4 = new d0.w1     // Catch: java.lang.Throwable -> L66
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L63
            r0.f21853a = r6     // Catch: java.lang.Throwable -> L63
            r0.f21856d = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r10.f(r13, r4, r0)     // Catch: java.lang.Throwable -> L63
            dk.a r12 = dk.a.f22275a
            if (r11 != r12) goto L58
            return r12
        L58:
            r11 = r6
        L59:
            r5.f21926i = r2
            long r11 = r11.f29985a
            d3.p r13 = new d3.p
            r13.<init>(r11)
            return r13
        L63:
            r0 = move-exception
        L64:
            r11 = r0
            goto L69
        L66:
            r0 = move-exception
            r5 = r10
            goto L64
        L69:
            r5.f21926i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.z1.a(long, ek.c):java.lang.Object");
    }

    public final Object b(long j, boolean z3, ek.j jVar) {
        yj.u uVar = yj.u.f37649a;
        if (z3 && this.f21921c != null) {
            return uVar;
        }
        long jA = d3.p.a(j, 0.0f, 0.0f, this.f21922d == a1.f21663b ? 1 : 2);
        y1 y1Var = new y1(this, null);
        c0.j jVar2 = this.f21920b;
        dk.a aVar = dk.a.f22275a;
        if (jVar2 == null || !(this.f21919a.d() || this.f21919a.c())) {
            y1 y1Var2 = new y1(y1Var.f21905e, jVar);
            y1Var2.f21904d = jA;
            Object objInvokeSuspend = y1Var2.invokeSuspend(uVar);
            if (objInvokeSuspend == aVar) {
                return objInvokeSuspend;
            }
        } else {
            Object objB = jVar2.b(jA, y1Var, jVar);
            if (objB == aVar) {
                return objB;
            }
        }
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r7v22, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [w0.e] */
    public final long c(f1 f1Var, long j, int i4) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        b2.j jVar;
        b2.j jVar2;
        long j8;
        long jU;
        b2.j jVar3;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        i1.m mVarE;
        i2.z1 z1Var;
        com.google.android.gms.internal.consent_sdk.a0 a0Var2;
        i1.m mVarE2;
        b2.j jVar4 = this.f21924f.f1641a;
        int i11 = 262144;
        int i12 = 1;
        Object obj = null;
        if (jVar4 == null || !jVar4.f25565n) {
            i10 = 262144;
            jVar = null;
        } else {
            if (!jVar4.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            i1.m mVar = jVar4.f25554a.f25558e;
            i2.e0 e0VarS = i2.k.s(jVar4);
            loop0: while (true) {
                if (e0VarS == null) {
                    i10 = i11;
                    z1Var = null;
                    break;
                }
                if ((((i1.m) e0VarS.G.g).f25557d & i11) != 0) {
                    while (mVar != null) {
                        if ((mVar.f25556c & i11) != 0) {
                            w0.e eVar = null;
                            i2.j jVar5 = mVar;
                            while (jVar5 != 0) {
                                if (jVar5 instanceof i2.z1) {
                                    z1Var = (i2.z1) jVar5;
                                    i10 = i11;
                                    if (nk.k.a(jVar4.f1658r, z1Var.e()) && b2.j.class == z1Var.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i10 = i11;
                                    if ((jVar5.f25556c & i10) != 0 && (jVar5 instanceof i2.j)) {
                                        i1.m mVar2 = jVar5.f25691p;
                                        int i13 = 0;
                                        mVarE2 = jVar5;
                                        eVar = eVar;
                                        while (mVar2 != null) {
                                            if ((mVar2.f25556c & i10) != 0) {
                                                i13++;
                                                eVar = eVar;
                                                if (i13 == 1) {
                                                    mVarE2 = mVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new w0.e(new i1.m[16]);
                                                    }
                                                    if (mVarE2 != null) {
                                                        eVar.b(mVarE2);
                                                        mVarE2 = null;
                                                    }
                                                    eVar.b(mVar2);
                                                }
                                            }
                                            mVar2 = mVar2.f25559f;
                                            mVarE2 = mVarE2;
                                            eVar = eVar;
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    i11 = i10;
                                    jVar5 = mVarE2;
                                    eVar = eVar;
                                }
                                mVarE2 = i2.k.e(eVar);
                                i11 = i10;
                                jVar5 = mVarE2;
                                eVar = eVar;
                            }
                        }
                        mVar = mVar.f25558e;
                        i11 = i11;
                    }
                }
                int i14 = i11;
                e0VarS = e0VarS.v();
                mVar = (e0VarS == null || (a0Var2 = e0VarS.G) == null) ? null : (i2.w1) a0Var2.f19259f;
                i11 = i14;
            }
            jVar = (b2.j) z1Var;
        }
        long jY = jVar != null ? jVar.y(i4, j) : 0L;
        long jG = o1.b.g(j, jY);
        long jE = e(h(f1Var.a(g(e(this.f21922d == a1.f21663b ? o1.b.a(1, jG) : o1.b.a(2, jG))))));
        s1 s1Var = this.g;
        if (s1Var.f25565n) {
            ViewTreeObserver viewTreeObserver = ((j2.r) i2.k.t(s1Var)).getViewTreeObserver();
            try {
                if (j2.r.O0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    j2.r.O0 = declaredMethod;
                }
                Method method = j2.r.O0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jG2 = o1.b.g(jG, jE);
        b2.j jVar6 = this.f21924f.f1641a;
        if (jVar6 == null || !jVar6.f25565n) {
            jVar2 = null;
        } else {
            if (!jVar6.f25554a.f25565n) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            i1.m mVar3 = jVar6.f25554a.f25558e;
            i2.e0 e0VarS2 = i2.k.s(jVar6);
            loop3: while (true) {
                if (e0VarS2 == null) {
                    jVar3 = null;
                    break;
                }
                if ((((i1.m) e0VarS2.G.g).f25557d & i10) != 0) {
                    while (mVar3 != null) {
                        if ((mVar3.f25556c & i10) != 0) {
                            i2.j jVar7 = mVar3;
                            ?? eVar2 = obj;
                            while (jVar7 != 0) {
                                if (jVar7 instanceof i2.z1) {
                                    ?? r72 = (i2.z1) jVar7;
                                    if (nk.k.a(jVar6.f1658r, r72.e()) && b2.j.class == r72.getClass()) {
                                        jVar3 = r72;
                                        break loop3;
                                    }
                                } else {
                                    if ((jVar7.f25556c & i10) != 0 && (jVar7 instanceof i2.j)) {
                                        i1.m mVar4 = jVar7.f25691p;
                                        int i15 = 0;
                                        mVarE = jVar7;
                                        eVar2 = eVar2;
                                        while (mVar4 != null) {
                                            mVarE = mVarE;
                                            if ((mVar4.f25556c & i10) != 0) {
                                                i15++;
                                                if (i15 == i12) {
                                                    mVarE = mVar4;
                                                } else {
                                                    eVar2 = eVar2 == 0 ? new w0.e(new i1.m[16]) : eVar2;
                                                    if (mVarE != null) {
                                                        eVar2.b(mVarE);
                                                        mVarE = null;
                                                    }
                                                    eVar2.b(mVar4);
                                                }
                                            }
                                            mVar4 = mVar4.f25559f;
                                            i12 = 1;
                                            mVarE = mVarE;
                                            eVar2 = eVar2;
                                        }
                                        if (i15 == i12) {
                                        }
                                    }
                                    jVar7 = mVarE;
                                    eVar2 = eVar2;
                                }
                                mVarE = i2.k.e(eVar2);
                                jVar7 = mVarE;
                                eVar2 = eVar2;
                            }
                        }
                        mVar3 = mVar3.f25558e;
                        obj = null;
                    }
                }
                e0VarS2 = e0VarS2.v();
                mVar3 = (e0VarS2 == null || (a0Var = e0VarS2.G) == null) ? null : (i2.w1) a0Var.f19259f;
                obj = null;
            }
            jVar2 = jVar3;
        }
        if (jVar2 != null) {
            jU = jVar2.U(jE, jG2, i4);
            j8 = jE;
        } else {
            j8 = jE;
            jU = 0;
        }
        return o1.b.h(o1.b.h(jY, j8), jU);
    }

    public final float d(float f10) {
        return this.f21923e ? f10 * (-1) : f10;
    }

    public final long e(long j) {
        return this.f21923e ? o1.b.i(j, -1.0f) : j;
    }

    public final Object f(c0.v0 v0Var, mk.e eVar, ek.c cVar) {
        Object objF = this.f21919a.f(v0Var, new bh.t(this, eVar, (ck.c) null, 9), cVar);
        return objF == dk.a.f22275a ? objF : yj.u.f37649a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.f21922d == a1.f21663b ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f10) {
        long jFloatToRawIntBits;
        long j;
        if (f10 == 0.0f) {
            return 0L;
        }
        if (this.f21922d == a1.f21663b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public final float i(long j) {
        int i4 = (int) (4294967295L & j);
        int i10 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i4)), Math.abs(Float.intBitsToFloat(i10)))) >= 0.7853981633974483d) {
            if (this.f21922d == a1.f21662a) {
                return Float.intBitsToFloat(i4);
            }
            return 0.0f;
        }
        if (this.f21922d == a1.f21663b) {
            return Float.intBitsToFloat(i10);
        }
        return 0.0f;
    }
}
