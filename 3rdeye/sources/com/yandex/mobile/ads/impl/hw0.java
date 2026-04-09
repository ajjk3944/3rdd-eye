package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.util.Pair;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.xj0;

/* loaded from: classes3.dex */
final class hw0 {

    /* renamed from: a, reason: collision with root package name */
    private final v42.b f28397a = new v42.b();

    /* renamed from: b, reason: collision with root package name */
    private final v42.d f28398b = new v42.d();

    /* renamed from: c, reason: collision with root package name */
    private final xc f28399c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f28400d;

    /* renamed from: e, reason: collision with root package name */
    private long f28401e;

    /* renamed from: f, reason: collision with root package name */
    private int f28402f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28403g;

    /* renamed from: h, reason: collision with root package name */
    private ew0 f28404h;
    private ew0 i;

    /* renamed from: j, reason: collision with root package name */
    private ew0 f28405j;

    /* renamed from: k, reason: collision with root package name */
    private int f28406k;

    /* renamed from: l, reason: collision with root package name */
    private Object f28407l;

    /* renamed from: m, reason: collision with root package name */
    private long f28408m;

    public hw0(xc xcVar, Handler handler) {
        this.f28399c = xcVar;
        this.f28400d = handler;
    }

    private void g() {
        int i = xj0.f35328d;
        final xj0.a aVar = new xj0.a();
        for (ew0 ew0VarB = this.f28404h; ew0VarB != null; ew0VarB = ew0VarB.b()) {
            aVar.b(ew0VarB.f27059f.f28012a);
        }
        ew0 ew0Var = this.i;
        final jw0.b bVar = ew0Var == null ? null : ew0Var.f27059f.f28012a;
        this.f28400d.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.R0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24241b.a(aVar, bVar);
            }
        });
    }

    public final ew0 b() {
        ew0 ew0Var = this.i;
        if (ew0Var == null || ew0Var.b() == null) {
            throw new IllegalStateException();
        }
        this.i = this.i.b();
        g();
        return this.i;
    }

    public final void c() {
        if (this.f28406k == 0) {
            return;
        }
        ew0 ew0VarB = this.f28404h;
        if (ew0VarB == null) {
            throw new IllegalStateException();
        }
        this.f28407l = ew0VarB.f27055b;
        this.f28408m = ew0VarB.f27059f.f28012a.f27473d;
        while (ew0VarB != null) {
            ew0VarB.g();
            ew0VarB = ew0VarB.b();
        }
        this.f28404h = null;
        this.f28405j = null;
        this.i = null;
        this.f28406k = 0;
        g();
    }

    public final ew0 d() {
        return this.f28405j;
    }

    public final ew0 e() {
        return this.f28404h;
    }

    public final ew0 f() {
        return this.i;
    }

    public final boolean h() {
        ew0 ew0Var = this.f28405j;
        if (ew0Var == null) {
            return true;
        }
        if (ew0Var.f27059f.i || !ew0Var.f27057d) {
            return false;
        }
        return (!ew0Var.f27058e || ew0Var.f27054a.getBufferedPositionUs() == Long.MIN_VALUE) && this.f28405j.f27059f.f28016e != -9223372036854775807L && this.f28406k < 100;
    }

    public final ew0 a() {
        ew0 ew0Var = this.f28404h;
        if (ew0Var == null) {
            return null;
        }
        if (ew0Var == this.i) {
            this.i = ew0Var.b();
        }
        this.f28404h.g();
        int i = this.f28406k - 1;
        this.f28406k = i;
        if (i == 0) {
            this.f28405j = null;
            ew0 ew0Var2 = this.f28404h;
            this.f28407l = ew0Var2.f27055b;
            this.f28408m = ew0Var2.f27059f.f28012a.f27473d;
        }
        this.f28404h = this.f28404h.b();
        g();
        return this.f28404h;
    }

    public final ew0 a(to1[] to1VarArr, s52 s52Var, vc vcVar, mw0 mw0Var, gw0 gw0Var, t52 t52Var) {
        gw0 gw0Var2;
        long jC;
        ew0 ew0Var = this.f28405j;
        if (ew0Var == null) {
            jC = 1000000000000L;
            gw0Var2 = gw0Var;
        } else {
            gw0Var2 = gw0Var;
            jC = (ew0Var.c() + this.f28405j.f27059f.f28016e) - gw0Var2.f28013b;
        }
        ew0 ew0Var2 = new ew0(to1VarArr, jC, s52Var, vcVar, mw0Var, gw0Var2, t52Var);
        ew0 ew0Var3 = this.f28405j;
        if (ew0Var3 != null) {
            ew0Var3.a(ew0Var2);
        } else {
            this.f28404h = ew0Var2;
            this.i = ew0Var2;
        }
        this.f28407l = null;
        this.f28405j = ew0Var2;
        this.f28406k++;
        g();
        return ew0Var2;
    }

    private gw0 a(v42 v42Var, ew0 ew0Var, long j4) {
        long jC;
        v42 v42Var2;
        long jC2;
        Object obj;
        long j10;
        gw0 gw0Var = ew0Var.f27059f;
        long jC3 = (ew0Var.c() + gw0Var.f28016e) - j4;
        boolean z10 = false;
        if (gw0Var.f28018g) {
            long j11 = 0;
            int iA = v42Var.a(v42Var.a(gw0Var.f28012a.f27470a), this.f28397a, this.f28398b, this.f28402f, this.f28403g);
            if (iA == -1) {
                return null;
            }
            int i = v42Var.a(iA, this.f28397a, true).f34345d;
            Object obj2 = this.f28397a.f34344c;
            obj2.getClass();
            long j12 = gw0Var.f28012a.f27473d;
            if (v42Var.a(i, this.f28398b, 0L).f34371p == iA) {
                Pair<Object, Long> pairA = v42Var.a(this.f28398b, this.f28397a, i, -9223372036854775807L, Math.max(0L, jC3));
                if (pairA == null) {
                    return null;
                }
                Object obj3 = pairA.first;
                long jLongValue = ((Long) pairA.second).longValue();
                ew0 ew0VarB = ew0Var.b();
                if (ew0VarB != null && ew0VarB.f27055b.equals(obj3)) {
                    j12 = ew0VarB.f27059f.f28012a.f27473d;
                } else {
                    j12 = this.f28401e;
                    this.f28401e = 1 + j12;
                }
                obj = obj3;
                j10 = jLongValue;
                j11 = -9223372036854775807L;
            } else {
                obj = obj2;
                j10 = 0;
            }
            jw0.b bVarA = a(v42Var, obj, j10, j12, this.f28398b, this.f28397a);
            if (j11 != -9223372036854775807L && gw0Var.f28014c != -9223372036854775807L) {
                if (v42Var.a(gw0Var.f28012a.f27470a, this.f28397a).a() > 0) {
                    v42.b bVar = this.f28397a;
                    if (bVar.f(bVar.d())) {
                        z10 = true;
                    }
                }
                if (bVarA.a() && z10) {
                    j11 = gw0Var.f28014c;
                } else if (z10) {
                    j10 = gw0Var.f28014c;
                }
            }
            long j13 = j11;
            v42Var.a(bVarA.f27470a, this.f28397a);
            if (bVarA.a()) {
                return a(v42Var, bVarA.f27470a, bVarA.f27471b, bVarA.f27472c, j13, bVarA.f27473d);
            }
            return a(v42Var, bVarA.f27470a, j10, j13, bVarA.f27473d);
        }
        jw0.b bVar2 = gw0Var.f28012a;
        v42Var.a(bVar2.f27470a, this.f28397a);
        if (bVar2.a()) {
            int i10 = bVar2.f27471b;
            int iA2 = this.f28397a.a(i10);
            if (iA2 == -1) {
                return null;
            }
            int iC = this.f28397a.c(i10, bVar2.f27472c);
            if (iC < iA2) {
                return a(v42Var, bVar2.f27470a, i10, iC, gw0Var.f28014c, bVar2.f27473d);
            }
            long jLongValue2 = gw0Var.f28014c;
            if (jLongValue2 == -9223372036854775807L) {
                v42.d dVar = this.f28398b;
                v42.b bVar3 = this.f28397a;
                Pair<Object, Long> pairA2 = v42Var.a(dVar, bVar3, bVar3.f34345d, -9223372036854775807L, Math.max(0L, jC3));
                v42Var2 = v42Var;
                if (pairA2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairA2.second).longValue();
            } else {
                v42Var2 = v42Var;
            }
            Object obj4 = bVar2.f27470a;
            int i11 = bVar2.f27471b;
            v42Var2.a(obj4, this.f28397a);
            long jB = this.f28397a.b(i11);
            if (jB == Long.MIN_VALUE) {
                jC2 = this.f28397a.f34346e;
            } else {
                jC2 = this.f28397a.c(i11) + jB;
            }
            return a(v42Var, bVar2.f27470a, Math.max(jC2, jLongValue2), gw0Var.f28014c, bVar2.f27473d);
        }
        int iD = this.f28397a.d(bVar2.f27474e);
        if (this.f28397a.f(bVar2.f27474e) && this.f28397a.b(bVar2.f27474e, iD) == 3) {
            z10 = true;
        }
        if (iD != this.f28397a.a(bVar2.f27474e) && !z10) {
            return a(v42Var, bVar2.f27470a, bVar2.f27474e, iD, gw0Var.f28016e, bVar2.f27473d);
        }
        Object obj5 = bVar2.f27470a;
        int i12 = bVar2.f27474e;
        v42Var.a(obj5, this.f28397a);
        long jB2 = this.f28397a.b(i12);
        if (jB2 == Long.MIN_VALUE) {
            jC = this.f28397a.f34346e;
        } else {
            jC = this.f28397a.c(i12) + jB2;
        }
        return a(v42Var, bVar2.f27470a, jC, gw0Var.f28016e, bVar2.f27473d);
    }

    private gw0 a(v42 v42Var, Object obj, int i, int i10, long j4, long j10) {
        jw0.b bVar = new jw0.b(obj, i, i10, j10);
        long jA = v42Var.a(obj, this.f28397a).a(i, i10);
        long jB = i10 == this.f28397a.d(i) ? this.f28397a.b() : 0L;
        boolean zF = this.f28397a.f(i);
        if (jA != -9223372036854775807L && jB >= jA) {
            jB = Math.max(0L, jA - 1);
        }
        return new gw0(bVar, jB, j4, -9223372036854775807L, jA, zF, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.mobile.ads.impl.gw0 a(com.yandex.mobile.ads.impl.v42 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hw0.a(com.yandex.mobile.ads.impl.v42, java.lang.Object, long, long, long):com.yandex.mobile.ads.impl.gw0");
    }

    public final gw0 a(long j4, th1 th1Var) {
        ew0 ew0Var = this.f28405j;
        if (ew0Var == null) {
            v42 v42Var = th1Var.f33594a;
            jw0.b bVar = th1Var.f33595b;
            long j10 = th1Var.f33596c;
            long j11 = th1Var.f33610r;
            v42Var.a(bVar.f27470a, this.f28397a);
            if (bVar.a()) {
                return a(v42Var, bVar.f27470a, bVar.f27471b, bVar.f27472c, j10, bVar.f27473d);
            }
            return a(v42Var, bVar.f27470a, j11, j10, bVar.f27473d);
        }
        return a(th1Var.f33594a, ew0Var, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.gw0 a(com.yandex.mobile.ads.impl.v42 r18, com.yandex.mobile.ads.impl.gw0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            com.yandex.mobile.ads.impl.jw0$b r3 = r2.f28012a
            boolean r4 = r3.a()
            r5 = 0
            r6 = 1
            r7 = -1
            if (r4 != 0) goto L17
            int r4 = r3.f27474e
            if (r4 != r7) goto L17
            r12 = r6
            goto L18
        L17:
            r12 = r5
        L18:
            boolean r4 = r3.a()
            if (r4 != 0) goto L40
            int r4 = r3.f27474e
            if (r4 != r7) goto L40
            java.lang.Object r4 = r3.f27470a
            com.yandex.mobile.ads.impl.v42$b r8 = r0.f28397a
            com.yandex.mobile.ads.impl.v42$b r4 = r1.a(r4, r8)
            int r4 = r4.f34345d
            java.lang.Object r8 = r3.f27470a
            int r8 = r1.a(r8)
            com.yandex.mobile.ads.impl.v42$d r9 = r0.f28398b
            r10 = 0
            com.yandex.mobile.ads.impl.v42$d r4 = r1.a(r4, r9, r10)
            int r4 = r4.f34372q
            if (r4 != r8) goto L40
            r13 = r6
            goto L41
        L40:
            r13 = r5
        L41:
            boolean r14 = r0.a(r1, r3, r12)
            com.yandex.mobile.ads.impl.jw0$b r4 = r2.f28012a
            java.lang.Object r4 = r4.f27470a
            com.yandex.mobile.ads.impl.v42$b r8 = r0.f28397a
            r1.a(r4, r8)
            boolean r1 = r3.a()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L65
            int r1 = r3.f27474e
            if (r1 != r7) goto L5e
            goto L65
        L5e:
            com.yandex.mobile.ads.impl.v42$b r4 = r0.f28397a
            long r10 = r4.b(r1)
            goto L66
        L65:
            r10 = r8
        L66:
            boolean r1 = r3.a()
            if (r1 == 0) goto L77
            com.yandex.mobile.ads.impl.v42$b r1 = r0.f28397a
            int r4 = r3.f27471b
            int r8 = r3.f27472c
            long r8 = r1.a(r4, r8)
            goto L88
        L77:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L84
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L82
            goto L84
        L82:
            r8 = r10
            goto L88
        L84:
            com.yandex.mobile.ads.impl.v42$b r1 = r0.f28397a
            long r8 = r1.f34346e
        L88:
            boolean r1 = r3.a()
            if (r1 == 0) goto L97
            com.yandex.mobile.ads.impl.v42$b r1 = r0.f28397a
            int r4 = r3.f27471b
            boolean r5 = r1.f(r4)
            goto La4
        L97:
            int r1 = r3.f27474e
            if (r1 == r7) goto La4
            com.yandex.mobile.ads.impl.v42$b r4 = r0.f28397a
            boolean r1 = r4.f(r1)
            if (r1 == 0) goto La4
            r5 = r6
        La4:
            com.yandex.mobile.ads.impl.gw0 r1 = new com.yandex.mobile.ads.impl.gw0
            r6 = r3
            long r3 = r2.f28013b
            r18 = r1
            long r0 = r2.f28014c
            r15 = r10
            r9 = r8
            r7 = r15
            r11 = r5
            r2 = r6
            r5 = r0
            r1 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hw0.a(com.yandex.mobile.ads.impl.v42, com.yandex.mobile.ads.impl.gw0):com.yandex.mobile.ads.impl.gw0");
    }

    private boolean a(v42 v42Var, jw0.b bVar, boolean z10) {
        int iA = v42Var.a(bVar.f27470a);
        return !v42Var.a(v42Var.a(iA, this.f28397a, false).f34345d, this.f28398b, 0L).f34365j && v42Var.a(iA, this.f28397a, this.f28398b, this.f28402f, this.f28403g) == -1 && z10;
    }

    public final boolean a(dw0 dw0Var) {
        ew0 ew0Var = this.f28405j;
        return ew0Var != null && ew0Var.f27054a == dw0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(xj0.a aVar, jw0.b bVar) {
        this.f28399c.a(aVar.a(), bVar);
    }

    public final void a(long j4) {
        ew0 ew0Var = this.f28405j;
        if (ew0Var != null) {
            ew0Var.b(j4);
        }
    }

    public final boolean a(ew0 ew0Var) {
        if (ew0Var != null) {
            boolean z10 = false;
            if (ew0Var.equals(this.f28405j)) {
                return false;
            }
            this.f28405j = ew0Var;
            while (ew0Var.b() != null) {
                ew0Var = ew0Var.b();
                if (ew0Var == this.i) {
                    this.i = this.f28404h;
                    z10 = true;
                }
                ew0Var.g();
                this.f28406k--;
            }
            this.f28405j.a((ew0) null);
            g();
            return z10;
        }
        throw new IllegalStateException();
    }

    private static jw0.b a(v42 v42Var, Object obj, long j4, long j10, v42.d dVar, v42.b bVar) {
        v42Var.a(obj, bVar);
        v42Var.a(bVar.f34345d, dVar, 0L);
        int iA = v42Var.a(obj);
        while (bVar.f34346e == 0 && bVar.a() > 0 && bVar.f(bVar.d()) && bVar.b(0L) == -1) {
            int i = iA + 1;
            if (iA >= dVar.f34372q) {
                break;
            }
            v42Var.a(i, bVar, true);
            obj = bVar.f34344c;
            obj.getClass();
            iA = i;
        }
        v42Var.a(obj, bVar);
        int iB = bVar.b(j4);
        if (iB == -1) {
            return new jw0.b(bVar.a(j4), j10, obj);
        }
        return new jw0.b(obj, iB, bVar.d(iB), j10);
    }

    public final jw0.b a(v42 v42Var, Object obj, long j4) {
        long j10;
        int iA;
        Object obj2 = obj;
        int i = v42Var.a(obj2, this.f28397a).f34345d;
        Object obj3 = this.f28407l;
        if (obj3 != null && (iA = v42Var.a(obj3)) != -1 && v42Var.a(iA, this.f28397a, false).f34345d == i) {
            j10 = this.f28408m;
        } else {
            ew0 ew0VarB = this.f28404h;
            while (true) {
                if (ew0VarB != null) {
                    if (ew0VarB.f27055b.equals(obj2)) {
                        j10 = ew0VarB.f27059f.f28012a.f27473d;
                        break;
                    }
                    ew0VarB = ew0VarB.b();
                } else {
                    ew0 ew0VarB2 = this.f28404h;
                    while (true) {
                        if (ew0VarB2 != null) {
                            int iA2 = v42Var.a(ew0VarB2.f27055b);
                            if (iA2 != -1 && v42Var.a(iA2, this.f28397a, false).f34345d == i) {
                                j10 = ew0VarB2.f27059f.f28012a.f27473d;
                                break;
                            }
                            ew0VarB2 = ew0VarB2.b();
                        } else {
                            j10 = this.f28401e;
                            this.f28401e = 1 + j10;
                            if (this.f28404h == null) {
                                this.f28407l = obj2;
                                this.f28408m = j10;
                            }
                        }
                    }
                }
            }
        }
        long j11 = j10;
        v42Var.a(obj2, this.f28397a);
        v42Var.a(this.f28397a.f34345d, this.f28398b, 0L);
        boolean z10 = false;
        for (int iA3 = v42Var.a(obj); iA3 >= this.f28398b.f34371p; iA3--) {
            v42Var.a(iA3, this.f28397a, true);
            boolean z11 = this.f28397a.a() > 0;
            z10 |= z11;
            v42.b bVar = this.f28397a;
            if (bVar.b(bVar.f34346e) != -1) {
                obj2 = this.f28397a.f34344c;
                obj2.getClass();
            }
            if (z10 && (!z11 || this.f28397a.f34346e != 0)) {
                break;
            }
        }
        return a(v42Var, obj2, j4, j11, this.f28398b, this.f28397a);
    }

    private boolean a(v42 v42Var) {
        v42 v42Var2;
        ew0 ew0VarB = this.f28404h;
        if (ew0VarB == null) {
            return true;
        }
        int iA = v42Var.a(ew0VarB.f27055b);
        while (true) {
            v42Var2 = v42Var;
            iA = v42Var2.a(iA, this.f28397a, this.f28398b, this.f28402f, this.f28403g);
            while (ew0VarB.b() != null && !ew0VarB.f27059f.f28018g) {
                ew0VarB = ew0VarB.b();
            }
            ew0 ew0VarB2 = ew0VarB.b();
            if (iA == -1 || ew0VarB2 == null || v42Var2.a(ew0VarB2.f27055b) != iA) {
                break;
            }
            ew0VarB = ew0VarB2;
            v42Var = v42Var2;
        }
        boolean zA = a(ew0VarB);
        ew0VarB.f27059f = a(v42Var2, ew0VarB.f27059f);
        return !zA;
    }

    public final boolean a(v42 v42Var, long j4, long j10) {
        gw0 gw0VarA;
        gw0 gw0Var;
        boolean z10;
        gw0 gw0Var2;
        v42 v42Var2 = v42Var;
        ew0 ew0VarB = this.f28404h;
        ew0 ew0Var = null;
        while (ew0VarB != null) {
            gw0 gw0Var3 = ew0VarB.f27059f;
            if (ew0Var == null) {
                gw0VarA = a(v42Var2, gw0Var3);
            } else {
                gw0 gw0VarA2 = a(v42Var2, ew0Var, j4);
                if (gw0VarA2 == null) {
                    return !a(ew0Var);
                }
                if (gw0Var3.f28013b != gw0VarA2.f28013b || !gw0Var3.f28012a.equals(gw0VarA2.f28012a)) {
                    return !a(ew0Var);
                }
                gw0VarA = gw0VarA2;
            }
            long j11 = gw0Var3.f28014c;
            if (j11 == gw0VarA.f28014c) {
                gw0Var = gw0VarA;
                z10 = true;
                gw0Var2 = gw0Var3;
            } else {
                z10 = true;
                gw0Var2 = gw0Var3;
                gw0Var = new gw0(gw0VarA.f28012a, gw0VarA.f28013b, j11, gw0VarA.f28015d, gw0VarA.f28016e, gw0VarA.f28017f, gw0VarA.f28018g, gw0VarA.f28019h, gw0VarA.i);
            }
            ew0VarB.f27059f = gw0Var;
            long j12 = gw0Var2.f28016e;
            long j13 = gw0VarA.f28016e;
            if (j12 != -9223372036854775807L && j12 != j13) {
                dw0 dw0Var = ew0VarB.f27054a;
                if (dw0Var instanceof cp) {
                    long j14 = gw0Var.f28015d;
                    if (j14 == -9223372036854775807L) {
                        j14 = Long.MIN_VALUE;
                    }
                    ((cp) dw0Var).a(j14);
                }
                long j15 = gw0VarA.f28016e;
                boolean z11 = (ew0VarB != this.i || ew0VarB.f27059f.f28017f || (j10 != Long.MIN_VALUE && j10 < ((j15 > (-9223372036854775807L) ? 1 : (j15 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : ew0VarB.d(j15)))) ? false : z10;
                if (a(ew0VarB) || z11) {
                    return false;
                }
                return z10;
            }
            ew0Var = ew0VarB;
            ew0VarB = ew0VarB.b();
            v42Var2 = v42Var;
        }
        return true;
    }

    public final boolean a(v42 v42Var, int i) {
        this.f28402f = i;
        return a(v42Var);
    }

    public final boolean a(v42 v42Var, boolean z10) {
        this.f28403g = z10;
        return a(v42Var);
    }
}
