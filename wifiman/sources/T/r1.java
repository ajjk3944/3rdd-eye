package T;

import Ii.AbstractC3059i;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import d0.AbstractC5280l;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
abstract /* synthetic */ class r1 {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21197a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21198b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5384i f21199c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3220g f21200d;

        /* renamed from: T.r1$a$a, reason: collision with other inner class name */
        static final class C0771a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F0 f21201a;

            C0771a(F0 f02) {
                this.f21201a = f02;
            }

            @Override // Li.InterfaceC3221h
            public final Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                this.f21201a.setValue(obj);
                return Yg.J.f24997a;
            }
        }

        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f21202a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3220g f21203b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ F0 f21204c;

            /* renamed from: T.r1$a$b$a, reason: collision with other inner class name */
            static final class C0772a implements InterfaceC3221h {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ F0 f21205a;

                C0772a(F0 f02) {
                    this.f21205a = f02;
                }

                @Override // Li.InterfaceC3221h
                public final Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                    this.f21205a.setValue(obj);
                    return Yg.J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3220g interfaceC3220g, F0 f02, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f21203b = interfaceC3220g;
                this.f21204c = f02;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f21203b, this.f21204c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f21202a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    InterfaceC3220g interfaceC3220g = this.f21203b;
                    C0772a c0772a = new C0772a(this.f21204c);
                    this.f21202a = 1;
                    if (interfaceC3220g.b(c0772a, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Yg.v.b(obj);
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5384i interfaceC5384i, InterfaceC3220g interfaceC3220g, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21199c = interfaceC5384i;
            this.f21200d = interfaceC3220g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f21199c, this.f21200d, interfaceC5380e);
            aVar.f21198b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21197a;
            if (i10 == 0) {
                Yg.v.b(obj);
                F0 f02 = (F0) this.f21198b;
                if (AbstractC6492s.d(this.f21199c, C5385j.f46088a)) {
                    InterfaceC3220g interfaceC3220g = this.f21200d;
                    C0771a c0771a = new C0771a(f02);
                    this.f21197a = 1;
                    if (interfaceC3220g.b(c0771a, this) == objG) {
                        return objG;
                    }
                } else {
                    InterfaceC5384i interfaceC5384i = this.f21199c;
                    b bVar = new b(this.f21200d, f02, null);
                    this.f21197a = 2;
                    if (AbstractC3059i.g(interfaceC5384i, bVar, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F0 f02, InterfaceC5380e interfaceC5380e) {
            return ((a) create(f02, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f21206a;

        /* renamed from: b, reason: collision with root package name */
        Object f21207b;

        /* renamed from: c, reason: collision with root package name */
        Object f21208c;

        /* renamed from: d, reason: collision with root package name */
        Object f21209d;

        /* renamed from: e, reason: collision with root package name */
        Object f21210e;

        /* renamed from: f, reason: collision with root package name */
        int f21211f;

        /* renamed from: g, reason: collision with root package name */
        int f21212g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f21213h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f21214i;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o.I f21215a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o.I i10) {
                super(1);
                this.f21215a = i10;
            }

            public final void a(Object obj) {
                if (obj instanceof AbstractC5280l) {
                    ((AbstractC5280l) obj).q(androidx.compose.runtime.snapshots.e.a(4));
                }
                this.f21215a.h(obj);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(obj);
                return Yg.J.f24997a;
            }
        }

        /* renamed from: T.r1$b$b, reason: collision with other inner class name */
        static final class C0773b extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ki.g f21216a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0773b(Ki.g gVar) {
                super(2);
                this.f21216a = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.util.Set r17, androidx.compose.runtime.snapshots.g r18) {
                /*
                    r16 = this;
                    r0 = r17
                    boolean r1 = r0 instanceof V.d
                    r2 = 4
                    if (r1 == 0) goto L64
                    r1 = r0
                    V.d r1 = (V.d) r1
                    o.T r1 = r1.b()
                    java.lang.Object[] r3 = r1.f54929b
                    long[] r1 = r1.f54928a
                    int r4 = r1.length
                    int r4 = r4 + (-2)
                    if (r4 < 0) goto L61
                    r5 = 0
                    r6 = r5
                L19:
                    r7 = r1[r6]
                    long r9 = ~r7
                    r11 = 7
                    long r9 = r9 << r11
                    long r9 = r9 & r7
                    r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r9 = r9 & r11
                    int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r9 == 0) goto L5c
                    int r9 = r6 - r4
                    int r9 = ~r9
                    int r9 = r9 >>> 31
                    r10 = 8
                    int r9 = 8 - r9
                    r11 = r5
                L33:
                    if (r11 >= r9) goto L5a
                    r12 = 255(0xff, double:1.26E-321)
                    long r12 = r12 & r7
                    r14 = 128(0x80, double:6.3E-322)
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 >= 0) goto L56
                    int r12 = r6 << 3
                    int r12 = r12 + r11
                    r12 = r3[r12]
                    boolean r13 = r12 instanceof d0.AbstractC5280l
                    if (r13 == 0) goto L53
                    d0.l r12 = (d0.AbstractC5280l) r12
                    int r13 = androidx.compose.runtime.snapshots.e.a(r2)
                    boolean r12 = r12.p(r13)
                    if (r12 == 0) goto L56
                L53:
                    r1 = r16
                    goto L94
                L56:
                    long r7 = r7 >> r10
                    int r11 = r11 + 1
                    goto L33
                L5a:
                    if (r9 != r10) goto L61
                L5c:
                    if (r6 == r4) goto L61
                    int r6 = r6 + 1
                    goto L19
                L61:
                    r1 = r16
                    goto L99
                L64:
                    r1 = r0
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    boolean r3 = r1 instanceof java.util.Collection
                    if (r3 == 0) goto L75
                    r3 = r1
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    if (r3 == 0) goto L75
                    goto L61
                L75:
                    java.util.Iterator r1 = r1.iterator()
                L79:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L61
                    java.lang.Object r3 = r1.next()
                    boolean r4 = r3 instanceof d0.AbstractC5280l
                    if (r4 == 0) goto L53
                    d0.l r3 = (d0.AbstractC5280l) r3
                    int r4 = androidx.compose.runtime.snapshots.e.a(r2)
                    boolean r3 = r3.p(r4)
                    if (r3 == 0) goto L79
                    goto L53
                L94:
                    Ki.g r2 = r1.f21216a
                    r2.k(r0)
                L99:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: T.r1.b.C0773b.a(java.util.Set, androidx.compose.runtime.snapshots.g):void");
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (androidx.compose.runtime.snapshots.g) obj2);
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6824a interfaceC6824a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21214i = interfaceC6824a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f21214i, interfaceC5380e);
            bVar.f21213h = obj;
            return bVar;
        }

        /* JADX WARN: Path cross not found for [B:34:0x00e1, B:38:0x00ea], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:42:0x00f9, B:58:0x0138], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:58:0x0138, B:42:0x00f9], limit reached: 76 */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T.r1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
            return ((b) create(interfaceC3221h, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final z1 b(InterfaceC3220g interfaceC3220g, Object obj, InterfaceC5384i interfaceC5384i, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        InterfaceC5384i interfaceC5384i2 = interfaceC5384i;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zL = interfaceC3540l.l(interfaceC5384i2) | interfaceC3540l.l(interfaceC3220g);
        Object objF = interfaceC3540l.f();
        if (zL || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(interfaceC5384i2, interfaceC3220g, null);
            interfaceC3540l.K(objF);
        }
        z1 z1VarK = o1.k(obj, interfaceC3220g, interfaceC5384i2, (InterfaceC6839p) objF, interfaceC3540l, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarK;
    }

    public static final z1 c(Li.N n10, InterfaceC5384i interfaceC5384i, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC5384i = C5385j.f46088a;
        }
        InterfaceC5384i interfaceC5384i2 = interfaceC5384i;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        z1 z1VarA = o1.a(n10, n10.getValue(), interfaceC5384i2, interfaceC3540l, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(o.I i10, Set set) {
        Object[] objArr = i10.f54929b;
        long[] jArr = i10.f54928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && set.contains(objArr[(i11 << 3) + i13])) {
                        return true;
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return false;
                }
            }
            if (i11 == length) {
                return false;
            }
            i11++;
        }
    }

    public static final InterfaceC3220g e(InterfaceC6824a interfaceC6824a) {
        return AbstractC3222i.A(new b(interfaceC6824a, null));
    }
}
