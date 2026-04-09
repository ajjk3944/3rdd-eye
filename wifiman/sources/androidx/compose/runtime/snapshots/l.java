package androidx.compose.runtime.snapshots;

import T.AbstractC3517c;
import T.AbstractC3546o;
import T.B0;
import T.H;
import T.o1;
import Yg.J;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import d0.InterfaceC5270b;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.V;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.C7006E;
import o.C7009H;
import o.I;
import r.Y;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final int f28678k = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f28679a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28681c;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC5270b f28685g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f28686h;

    /* renamed from: i, reason: collision with root package name */
    private a f28687i;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f28680b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f28682d = new b();

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6835l f28683e = new c();

    /* renamed from: f, reason: collision with root package name */
    private final V.b f28684f = new V.b(new a[16], 0);

    /* renamed from: j, reason: collision with root package name */
    private long f28688j = -1;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6835l f28689a;

        /* renamed from: b, reason: collision with root package name */
        private Object f28690b;

        /* renamed from: c, reason: collision with root package name */
        private C7006E f28691c;

        /* renamed from: j, reason: collision with root package name */
        private int f28698j;

        /* renamed from: d, reason: collision with root package name */
        private int f28692d = -1;

        /* renamed from: e, reason: collision with root package name */
        private final V.f f28693e = new V.f();

        /* renamed from: f, reason: collision with root package name */
        private final C7009H f28694f = new C7009H(0, 1, null);

        /* renamed from: g, reason: collision with root package name */
        private final I f28695g = new I(0, 1, null);

        /* renamed from: h, reason: collision with root package name */
        private final V.b f28696h = new V.b(new H[16], 0);

        /* renamed from: i, reason: collision with root package name */
        private final T.I f28697i = new C1062a();

        /* renamed from: k, reason: collision with root package name */
        private final V.f f28699k = new V.f();

        /* renamed from: l, reason: collision with root package name */
        private final HashMap f28700l = new HashMap();

        /* renamed from: androidx.compose.runtime.snapshots.l$a$a, reason: collision with other inner class name */
        public static final class C1062a implements T.I {
            C1062a() {
            }

            @Override // T.I
            public void a(H h10) {
                a aVar = a.this;
                aVar.f28698j--;
            }

            @Override // T.I
            public void b(H h10) {
                a.this.f28698j++;
            }
        }

        public a(InterfaceC6835l interfaceC6835l) {
            this.f28689a = interfaceC6835l;
        }

        private final void d(Object obj) {
            int i10 = this.f28692d;
            C7006E c7006e = this.f28691c;
            if (c7006e == null) {
                return;
            }
            long[] jArr = c7006e.f54904a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = c7006e.f54905b[i14];
                            boolean z10 = c7006e.f54906c[i14] != i10;
                            if (z10) {
                                m(obj, obj2);
                            }
                            if (z10) {
                                c7006e.p(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(java.lang.Object r21, int r22, java.lang.Object r23, o.C7006E r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                int r3 = r0.f28698j
                if (r3 <= 0) goto Lb
                return
            Lb:
                r3 = -1
                r4 = r24
                int r4 = r4.o(r1, r2, r3)
                boolean r5 = r1 instanceof T.H
                r6 = 2
                if (r5 == 0) goto L91
                if (r4 == r2) goto L91
                r2 = r1
                T.H r2 = (T.H) r2
                T.H$a r2 = r2.o()
                java.util.HashMap r5 = r0.f28700l
                java.lang.Object r7 = r2.a()
                r5.put(r1, r7)
                o.K r2 = r2.b()
                V.f r5 = r0.f28699k
                r5.g(r1)
                java.lang.Object[] r7 = r2.f54905b
                long[] r2 = r2.f54904a
                int r8 = r2.length
                int r8 = r8 - r6
                if (r8 < 0) goto L8f
                r10 = 0
            L3b:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L89
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L55:
                if (r15 >= r13) goto L86
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.3E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L7f
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                d0.k r9 = (d0.InterfaceC5279k) r9
                boolean r3 = r9 instanceof d0.AbstractC5280l
                if (r3 == 0) goto L79
                r3 = r9
                d0.l r3 = (d0.AbstractC5280l) r3
                int r14 = androidx.compose.runtime.snapshots.e.a(r6)
                r3.q(r14)
            L79:
                r5.a(r9, r1)
                r3 = 8
                goto L80
            L7f:
                r3 = r14
            L80:
                long r11 = r11 >> r3
                int r15 = r15 + 1
                r14 = r3
                r3 = -1
                goto L55
            L86:
                r3 = r14
                if (r13 != r3) goto L8f
            L89:
                if (r10 == r8) goto L8f
                int r10 = r10 + 1
                r3 = -1
                goto L3b
            L8f:
                r2 = -1
                goto L92
            L91:
                r2 = r3
            L92:
                if (r4 != r2) goto La9
                boolean r2 = r1 instanceof d0.AbstractC5280l
                if (r2 == 0) goto La2
                r2 = r1
                d0.l r2 = (d0.AbstractC5280l) r2
                int r3 = androidx.compose.runtime.snapshots.e.a(r6)
                r2.q(r3)
            La2:
                V.f r2 = r0.f28693e
                r3 = r23
                r2.a(r1, r3)
            La9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.l.a.l(java.lang.Object, int, java.lang.Object, o.E):void");
        }

        private final void m(Object obj, Object obj2) {
            this.f28693e.f(obj2, obj);
            if (!(obj2 instanceof H) || this.f28693e.c(obj2)) {
                return;
            }
            this.f28699k.g(obj2);
            this.f28700l.remove(obj2);
        }

        public final void c() {
            this.f28693e.b();
            this.f28694f.i();
            this.f28699k.b();
            this.f28700l.clear();
        }

        public final void e(Object obj) {
            C7006E c7006e = (C7006E) this.f28694f.p(obj);
            if (c7006e == null) {
                return;
            }
            Object[] objArr = c7006e.f54905b;
            int[] iArr = c7006e.f54906c;
            long[] jArr = c7006e.f54904a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            m(obj, obj2);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        public final InterfaceC6835l f() {
            return this.f28689a;
        }

        public final boolean g() {
            return this.f28694f.g();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h() {
            /*
                r17 = this;
                r0 = r17
                o.I r1 = r0.f28695g
                mh.l r2 = r0.f28689a
                java.lang.Object[] r3 = r1.f54929b
                long[] r4 = r1.f54928a
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.invoke(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.l.a.h():void");
        }

        public final void i(Object obj, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
            Object obj2 = this.f28690b;
            C7006E c7006e = this.f28691c;
            int i10 = this.f28692d;
            this.f28690b = obj;
            this.f28691c = (C7006E) this.f28694f.c(obj);
            if (this.f28692d == -1) {
                this.f28692d = j.H().f();
            }
            T.I i11 = this.f28697i;
            V.b bVarC = o1.c();
            try {
                bVarC.b(i11);
                g.f28632e.h(interfaceC6835l, null, interfaceC6824a);
                bVarC.z(bVarC.o() - 1);
                Object obj3 = this.f28690b;
                AbstractC6492s.f(obj3);
                d(obj3);
                this.f28690b = obj2;
                this.f28691c = c7006e;
                this.f28692d = i10;
            } catch (Throwable th2) {
                bVarC.z(bVarC.o() - 1);
                throw th2;
            }
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public final boolean j(java.util.Set r43) {
            /*
                Method dump skipped, instructions count: 1699
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.l.a.j(java.util.Set):boolean");
        }

        public final void k(Object obj) {
            Object obj2 = this.f28690b;
            AbstractC6492s.f(obj2);
            int i10 = this.f28692d;
            C7006E c7006e = this.f28691c;
            if (c7006e == null) {
                c7006e = new C7006E(0, 1, null);
                this.f28691c = c7006e;
                this.f28694f.s(obj2, c7006e);
                J j10 = J.f24997a;
            }
            l(obj, i10, obj2, c7006e);
        }

        public final void n(InterfaceC6835l interfaceC6835l) {
            long[] jArr;
            int i10;
            long[] jArr2;
            int i11;
            long j10;
            int i12;
            long j11;
            int i13;
            C7009H c7009h = this.f28694f;
            long[] jArr3 = c7009h.f54921a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j12 = jArr3[i14];
                long j13 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = c7009h.f54922b[i18];
                            C7006E c7006e = (C7006E) c7009h.f54923c[i18];
                            Boolean bool = (Boolean) interfaceC6835l.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = c7006e.f54905b;
                                int[] iArr = c7006e.f54906c;
                                long[] jArr4 = c7006e.f54904a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i12 = i16;
                                    int i19 = 0;
                                    while (true) {
                                        long j14 = jArr4[i19];
                                        i11 = i14;
                                        j10 = j12;
                                        j11 = -9187201950435737472L;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                if ((j14 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    Object obj2 = objArr[i22];
                                                    int i23 = iArr[i22];
                                                    m(obj, obj2);
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i20 != 8) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i14 = i11;
                                        j12 = j10;
                                    }
                                } else {
                                    i11 = i14;
                                    j10 = j12;
                                    i12 = i16;
                                    j11 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j10 = j12;
                                i12 = i16;
                                j11 = j13;
                            }
                            if (bool.booleanValue()) {
                                c7009h.q(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = i14;
                            j10 = j12;
                            i12 = i16;
                            j11 = j13;
                            i13 = i15;
                        }
                        j12 = j10 >> i13;
                        i17++;
                        i15 = i13;
                        j13 = j11;
                        jArr3 = jArr2;
                        i16 = i12;
                        i14 = i11;
                    }
                    jArr = jArr3;
                    int i24 = i14;
                    if (i16 != i15) {
                        return;
                    } else {
                        i10 = i24;
                    }
                } else {
                    jArr = jArr3;
                    i10 = i14;
                }
                if (i10 == length) {
                    return;
                }
                i14 = i10 + 1;
                jArr3 = jArr;
            }
        }

        public final void o(H h10) {
            long[] jArr;
            long[] jArr2;
            int i10;
            C7006E c7006e;
            C7009H c7009h = this.f28694f;
            int iF = j.H().f();
            Object objC = this.f28693e.d().c(h10);
            if (objC == null) {
                return;
            }
            if (!(objC instanceof I)) {
                C7006E c7006e2 = (C7006E) c7009h.c(objC);
                if (c7006e2 == null) {
                    c7006e2 = new C7006E(0, 1, null);
                    c7009h.s(objC, c7006e2);
                    J j10 = J.f24997a;
                }
                l(h10, iF, objC, c7006e2);
                return;
            }
            I i11 = (I) objC;
            Object[] objArr = i11.f54929b;
            long[] jArr3 = i11.f54928a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j11 = jArr3[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            Object obj = objArr[(i12 << 3) + i15];
                            C7006E c7006e3 = (C7006E) c7009h.c(obj);
                            jArr2 = jArr3;
                            if (c7006e3 == null) {
                                c7006e = new C7006E(0, 1, null);
                                c7009h.s(obj, c7006e);
                                J j12 = J.f24997a;
                            } else {
                                c7006e = c7006e3;
                            }
                            l(h10, iF, obj, c7006e);
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            i10 = i13;
                        }
                        j11 >>= i10;
                        i15++;
                        i13 = i10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i14 != i13) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                jArr3 = jArr;
            }
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {
        b() {
            super(2);
        }

        public final void a(Set set, g gVar) {
            l.this.i(set);
            if (l.this.m()) {
                l.this.r();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Set) obj, (g) obj2);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final void a(Object obj) {
            if (l.this.f28686h) {
                return;
            }
            V.b bVar = l.this.f28684f;
            l lVar = l.this;
            synchronized (bVar) {
                a aVar = lVar.f28687i;
                AbstractC6492s.f(aVar);
                aVar.k(obj);
                J j10 = J.f24997a;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        public final void a() {
            do {
                V.b bVar = l.this.f28684f;
                l lVar = l.this;
                synchronized (bVar) {
                    try {
                        if (!lVar.f28681c) {
                            lVar.f28681c = true;
                            try {
                                V.b bVar2 = lVar.f28684f;
                                int iO = bVar2.o();
                                if (iO > 0) {
                                    Object[] objArrM = bVar2.m();
                                    int i10 = 0;
                                    do {
                                        ((a) objArrM[i10]).h();
                                        i10++;
                                    } while (i10 < iO);
                                }
                                lVar.f28681c = false;
                            } finally {
                            }
                        }
                        J j10 = J.f24997a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (l.this.m());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public l(InterfaceC6835l interfaceC6835l) {
        this.f28679a = interfaceC6835l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set set) {
        Object obj;
        List listM0;
        do {
            obj = this.f28680b.get();
            if (obj == null) {
                listM0 = set;
            } else if (obj instanceof Set) {
                listM0 = AbstractC3689v.o(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                listM0 = AbstractC3689v.M0((Collection) obj, AbstractC3689v.e(set));
            }
        } while (!Y.a(this.f28680b, obj, listM0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z10;
        synchronized (this.f28684f) {
            z10 = this.f28681c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set setP = p();
            if (setP == null) {
                return z11;
            }
            synchronized (this.f28684f) {
                try {
                    V.b bVar = this.f28684f;
                    int iO = bVar.o();
                    if (iO > 0) {
                        Object[] objArrM = bVar.m();
                        int i10 = 0;
                        do {
                            z11 = ((a) objArrM[i10]).j(setP) || z11;
                            i10++;
                        } while (i10 < iO);
                    }
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final a n(InterfaceC6835l interfaceC6835l) {
        Object obj;
        V.b bVar = this.f28684f;
        int iO = bVar.o();
        if (iO > 0) {
            Object[] objArrM = bVar.m();
            int i10 = 0;
            do {
                obj = objArrM[i10];
                if (((a) obj).f() == interfaceC6835l) {
                    break;
                }
                i10++;
            } while (i10 < iO);
            obj = null;
        } else {
            obj = null;
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        AbstractC6492s.g(interfaceC6835l, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar2 = new a((InterfaceC6835l) V.f(interfaceC6835l, 1));
        this.f28684f.b(aVar2);
        return aVar2;
    }

    private final Set p() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f28680b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new KotlinNothingValueException();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!Y.a(this.f28680b, obj, objSubList));
        return set;
    }

    private final Void q() {
        AbstractC3546o.s("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.f28679a.invoke(new d());
    }

    public final void j() {
        synchronized (this.f28684f) {
            try {
                V.b bVar = this.f28684f;
                int iO = bVar.o();
                if (iO > 0) {
                    Object[] objArrM = bVar.m();
                    int i10 = 0;
                    do {
                        ((a) objArrM[i10]).c();
                        i10++;
                    } while (i10 < iO);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(Object obj) {
        synchronized (this.f28684f) {
            try {
                V.b bVar = this.f28684f;
                int iO = bVar.o();
                int i10 = 0;
                for (int i11 = 0; i11 < iO; i11++) {
                    a aVar = (a) bVar.m()[i11];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.m()[i11 - i10] = bVar.m()[i11];
                    }
                }
                int i12 = iO - i10;
                AbstractC3682n.v(bVar.m(), null, i12, iO);
                bVar.D(i12);
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(InterfaceC6835l interfaceC6835l) {
        synchronized (this.f28684f) {
            try {
                V.b bVar = this.f28684f;
                int iO = bVar.o();
                int i10 = 0;
                for (int i11 = 0; i11 < iO; i11++) {
                    a aVar = (a) bVar.m()[i11];
                    aVar.n(interfaceC6835l);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.m()[i11 - i10] = bVar.m()[i11];
                    }
                }
                int i12 = iO - i10;
                AbstractC3682n.v(bVar.m(), null, i12, iO);
                bVar.D(i12);
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(Object obj, InterfaceC6835l interfaceC6835l, InterfaceC6824a interfaceC6824a) {
        a aVarN;
        synchronized (this.f28684f) {
            aVarN = n(interfaceC6835l);
        }
        boolean z10 = this.f28686h;
        a aVar = this.f28687i;
        long j10 = this.f28688j;
        if (j10 != -1) {
            if (!(j10 == AbstractC3517c.a())) {
                B0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j10 + "), currentThread={id=" + AbstractC3517c.a() + ", name=" + AbstractC3517c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f28686h = false;
            this.f28687i = aVarN;
            this.f28688j = AbstractC3517c.a();
            aVarN.i(obj, this.f28683e, interfaceC6824a);
        } finally {
            this.f28687i = aVar;
            this.f28686h = z10;
            this.f28688j = j10;
        }
    }

    public final void s() {
        this.f28685g = g.f28632e.i(this.f28682d);
    }

    public final void t() {
        InterfaceC5270b interfaceC5270b = this.f28685g;
        if (interfaceC5270b != null) {
            interfaceC5270b.dispose();
        }
    }
}
