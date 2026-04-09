package T;

import T.H;
import androidx.compose.runtime.snapshots.g;
import d0.AbstractC5280l;
import d0.InterfaceC5279k;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o.C7006E;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
final class G extends AbstractC5280l implements H {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f20852b;

    /* renamed from: c, reason: collision with root package name */
    private final n1 f20853c;

    /* renamed from: d, reason: collision with root package name */
    private a f20854d = new a();

    public static final class a extends androidx.compose.runtime.snapshots.n implements H.a {

        /* renamed from: h, reason: collision with root package name */
        public static final C0769a f20855h = new C0769a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f20856i = 8;

        /* renamed from: j, reason: collision with root package name */
        private static final Object f20857j = new Object();

        /* renamed from: c, reason: collision with root package name */
        private int f20858c;

        /* renamed from: d, reason: collision with root package name */
        private int f20859d;

        /* renamed from: e, reason: collision with root package name */
        private o.K f20860e = o.L.a();

        /* renamed from: f, reason: collision with root package name */
        private Object f20861f = f20857j;

        /* renamed from: g, reason: collision with root package name */
        private int f20862g;

        /* renamed from: T.G$a$a, reason: collision with other inner class name */
        public static final class C0769a {
            public /* synthetic */ C0769a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.f20857j;
            }

            private C0769a() {
            }
        }

        @Override // T.H.a
        public Object a() {
            return this.f20861f;
        }

        @Override // T.H.a
        public o.K b() {
            return this.f20860e;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void c(androidx.compose.runtime.snapshots.n nVar) {
            AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) nVar;
            m(aVar.b());
            this.f20861f = aVar.f20861f;
            this.f20862g = aVar.f20862g;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public androidx.compose.runtime.snapshots.n d() {
            return new a();
        }

        public final Object j() {
            return this.f20861f;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean k(T.H r6, androidx.compose.runtime.snapshots.g r7) {
            /*
                r5 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.j.I()
                monitor-enter(r0)
                int r1 = r5.f20858c     // Catch: java.lang.Throwable -> L1a
                int r2 = r7.f()     // Catch: java.lang.Throwable -> L1a
                r3 = 1
                r4 = 0
                if (r1 != r2) goto L1c
                int r1 = r5.f20859d     // Catch: java.lang.Throwable -> L1a
                int r2 = r7.j()     // Catch: java.lang.Throwable -> L1a
                if (r1 == r2) goto L18
                goto L1c
            L18:
                r1 = r4
                goto L1d
            L1a:
                r6 = move-exception
                goto L4d
            L1c:
                r1 = r3
            L1d:
                monitor-exit(r0)
                java.lang.Object r0 = r5.f20861f
                java.lang.Object r2 = T.G.a.f20857j
                if (r0 == r2) goto L2f
                if (r1 == 0) goto L30
                int r0 = r5.f20862g
                int r6 = r5.l(r6, r7)
                if (r0 != r6) goto L2f
                goto L30
            L2f:
                r3 = r4
            L30:
                if (r3 == 0) goto L4c
                if (r1 == 0) goto L4c
                java.lang.Object r6 = androidx.compose.runtime.snapshots.j.I()
                monitor-enter(r6)
                int r0 = r7.f()     // Catch: java.lang.Throwable -> L49
                r5.f20858c = r0     // Catch: java.lang.Throwable -> L49
                int r7 = r7.j()     // Catch: java.lang.Throwable -> L49
                r5.f20859d = r7     // Catch: java.lang.Throwable -> L49
                Yg.J r7 = Yg.J.f24997a     // Catch: java.lang.Throwable -> L49
                monitor-exit(r6)
                goto L4c
            L49:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4c:
                return r3
            L4d:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: T.G.a.k(T.H, androidx.compose.runtime.snapshots.g):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[Catch: all -> 0x007c, LOOP:1: B:16:0x003c->B:40:0x00a4, LOOP_END, TryCatch #1 {all -> 0x007c, blocks: (B:13:0x002f, B:16:0x003c, B:18:0x004c, B:20:0x0058, B:22:0x0062, B:34:0x0098, B:25:0x0071, B:27:0x0075, B:31:0x0086, B:30:0x007e, B:42:0x00a8, B:40:0x00a4), top: B:64:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x00a0 A[EDGE_INSN: B:68:0x00a0->B:38:0x00a0 BREAK  A[LOOP:1: B:16:0x003c->B:40:0x00a4], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int l(T.H r22, androidx.compose.runtime.snapshots.g r23) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T.G.a.l(T.H, androidx.compose.runtime.snapshots.g):int");
        }

        public void m(o.K k10) {
            this.f20860e = k10;
        }

        public final void n(Object obj) {
            this.f20861f = obj;
        }

        public final void o(int i10) {
            this.f20862g = i10;
        }

        public final void p(int i10) {
            this.f20858c = i10;
        }

        public final void q(int i10) {
            this.f20859d = i10;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0.d f20864b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C7006E f20865c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20866d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0.d dVar, C7006E c7006e, int i10) {
            super(1);
            this.f20864b = dVar;
            this.f20865c = c7006e;
            this.f20866d = i10;
        }

        public final void a(Object obj) {
            if (obj == G.this) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof InterfaceC5279k) {
                int iA = this.f20864b.a();
                C7006E c7006e = this.f20865c;
                c7006e.r(obj, Math.min(iA - this.f20866d, c7006e.d(obj, MPv3.MAX_MESSAGE_ID)));
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Yg.J.f24997a;
        }
    }

    public G(InterfaceC6824a interfaceC6824a, n1 n1Var) {
        this.f20852b = interfaceC6824a;
        this.f20853c = n1Var;
    }

    /* JADX WARN: Finally extract failed */
    private final a t(a aVar, androidx.compose.runtime.snapshots.g gVar, boolean z10, InterfaceC6824a interfaceC6824a) {
        g.a aVar2;
        n1 n1VarD;
        int i10;
        int i11;
        a aVar3 = aVar;
        int i12 = 1;
        if (!aVar3.k(this, gVar)) {
            int i13 = 0;
            C7006E c7006e = new C7006E(0, 1, null);
            b0.d dVar = (b0.d) p1.f21185a.a();
            if (dVar == null) {
                dVar = new b0.d(0);
                p1.f21185a.b(dVar);
            }
            int iA = dVar.a();
            V.b bVarC = o1.c();
            int iO = bVarC.o();
            if (iO > 0) {
                Object[] objArrM = bVarC.m();
                int i14 = 0;
                while (true) {
                    ((I) objArrM[i14]).b(this);
                    int i15 = i14 + 1;
                    if (i15 >= iO) {
                        break;
                    }
                    i14 = i15;
                }
            }
            try {
                dVar.b(iA + 1);
                Object objH = androidx.compose.runtime.snapshots.g.f28632e.h(new b(dVar, c7006e, iA), null, interfaceC6824a);
                dVar.b(iA);
                int iO2 = bVarC.o();
                if (iO2 > 0) {
                    Object[] objArrM2 = bVarC.m();
                    do {
                        ((I) objArrM2[i13]).a(this);
                        i13++;
                    } while (i13 < iO2);
                }
                synchronized (androidx.compose.runtime.snapshots.j.I()) {
                    try {
                        aVar2 = androidx.compose.runtime.snapshots.g.f28632e;
                        androidx.compose.runtime.snapshots.g gVarC = aVar2.c();
                        if (aVar.j() == a.f20855h.a() || (n1VarD = d()) == null || !n1VarD.a(objH, aVar.j())) {
                            aVar3 = (a) androidx.compose.runtime.snapshots.j.O(this.f20854d, this, gVarC);
                            aVar3.m(c7006e);
                            aVar3.o(aVar3.l(this, gVarC));
                            aVar3.n(objH);
                        } else {
                            aVar3.m(c7006e);
                            aVar3.o(aVar3.l(this, gVarC));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                b0.d dVar2 = (b0.d) p1.f21185a.a();
                if (dVar2 != null && dVar2.a() == 0) {
                    aVar2.g();
                    synchronized (androidx.compose.runtime.snapshots.j.I()) {
                        androidx.compose.runtime.snapshots.g gVarC2 = aVar2.c();
                        aVar3.p(gVarC2.f());
                        aVar3.q(gVarC2.j());
                        Yg.J j10 = Yg.J.f24997a;
                    }
                }
                return aVar3;
            } catch (Throwable th3) {
                int iO3 = bVarC.o();
                if (iO3 > 0) {
                    Object[] objArrM3 = bVarC.m();
                    do {
                        ((I) objArrM3[i13]).a(this);
                        i13++;
                    } while (i13 < iO3);
                }
                throw th3;
            }
        }
        if (z10) {
            V.b bVarC2 = o1.c();
            int iO4 = bVarC2.o();
            if (iO4 > 0) {
                Object[] objArrM4 = bVarC2.m();
                int i16 = 0;
                do {
                    ((I) objArrM4[i16]).b(this);
                    i16++;
                } while (i16 < iO4);
            }
            try {
                o.K kB = aVar.b();
                b0.d dVar3 = (b0.d) p1.f21185a.a();
                if (dVar3 == null) {
                    dVar3 = new b0.d(0);
                    p1.f21185a.b(dVar3);
                }
                int iA2 = dVar3.a();
                Object[] objArr = kB.f54905b;
                int[] iArr = kB.f54906c;
                long[] jArr = kB.f54904a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j11 = jArr[i17];
                        long[] jArr2 = jArr;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8;
                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                            int i20 = 0;
                            while (i20 < i19) {
                                if ((j11 & 255) < 128) {
                                    int i21 = (i17 << 3) + i20;
                                    InterfaceC5279k interfaceC5279k = (InterfaceC5279k) objArr[i21];
                                    dVar3.b(iA2 + iArr[i21]);
                                    InterfaceC6835l interfaceC6835lH = gVar.h();
                                    if (interfaceC6835lH != null) {
                                        interfaceC6835lH.invoke(interfaceC5279k);
                                    }
                                    i11 = 8;
                                } else {
                                    i11 = i18;
                                }
                                j11 >>= i11;
                                i20++;
                                i18 = i11;
                                i12 = 1;
                            }
                            int i22 = i18;
                            i10 = i12;
                            if (i19 != i22) {
                                break;
                            }
                        } else {
                            i10 = i12;
                        }
                        if (i17 == length) {
                            break;
                        }
                        i17 += i10;
                        i12 = i10;
                        jArr = jArr2;
                    }
                }
                dVar3.b(iA2);
                Yg.J j12 = Yg.J.f24997a;
                int iO5 = bVarC2.o();
                if (iO5 > 0) {
                    Object[] objArrM5 = bVarC2.m();
                    int i23 = 0;
                    do {
                        ((I) objArrM5[i23]).a(this);
                        i23++;
                    } while (i23 < iO5);
                }
            } catch (Throwable th4) {
                int iO6 = bVarC2.o();
                if (iO6 > 0) {
                    Object[] objArrM6 = bVarC2.m();
                    int i24 = 0;
                    do {
                        ((I) objArrM6[i24]).a(this);
                        i24++;
                    } while (i24 < iO6);
                }
                throw th4;
            }
        }
        return aVar3;
    }

    private final String u() {
        a aVar = (a) androidx.compose.runtime.snapshots.j.F(this.f20854d);
        return aVar.k(this, androidx.compose.runtime.snapshots.g.f28632e.c()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    @Override // T.H
    public n1 d() {
        return this.f20853c;
    }

    @Override // d0.InterfaceC5279k
    public void g(androidx.compose.runtime.snapshots.n nVar) {
        AbstractC6492s.g(nVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f20854d = (a) nVar;
    }

    @Override // T.z1
    public Object getValue() {
        g.a aVar = androidx.compose.runtime.snapshots.g.f28632e;
        InterfaceC6835l interfaceC6835lH = aVar.c().h();
        if (interfaceC6835lH != null) {
            interfaceC6835lH.invoke(this);
        }
        androidx.compose.runtime.snapshots.g gVarC = aVar.c();
        return t((a) androidx.compose.runtime.snapshots.j.G(this.f20854d, gVarC), gVarC, true, this.f20852b).j();
    }

    @Override // d0.InterfaceC5279k
    public androidx.compose.runtime.snapshots.n i() {
        return this.f20854d;
    }

    @Override // T.H
    public H.a o() {
        androidx.compose.runtime.snapshots.g gVarC = androidx.compose.runtime.snapshots.g.f28632e.c();
        return t((a) androidx.compose.runtime.snapshots.j.G(this.f20854d, gVarC), gVarC, false, this.f20852b);
    }

    public final androidx.compose.runtime.snapshots.n r(androidx.compose.runtime.snapshots.g gVar) {
        return t((a) androidx.compose.runtime.snapshots.j.G(this.f20854d, gVar), gVar, false, this.f20852b);
    }

    public String toString() {
        return "DerivedState(value=" + u() + ")@" + hashCode();
    }
}
