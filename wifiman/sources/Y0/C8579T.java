package y0;

import E0.AbstractC2633k;
import Ii.AbstractC3063k;
import Ii.C3073p;
import Ii.InterfaceC3069n;
import Ii.InterfaceC3091y0;
import Yg.u;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputResetException;
import androidx.compose.ui.platform.w1;
import dh.AbstractC5382g;
import dh.C5385j;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6538n;
import l0.C6537m;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.snmp4j.mp.PduHandle;

/* renamed from: y0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8579T extends e.c implements InterfaceC8578S, InterfaceC8567G, Y0.d {

    /* renamed from: n, reason: collision with root package name */
    private Object f66242n;

    /* renamed from: o, reason: collision with root package name */
    private Object f66243o;

    /* renamed from: p, reason: collision with root package name */
    private Object[] f66244p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6839p f66245q;

    /* renamed from: r, reason: collision with root package name */
    private InterfaceC3091y0 f66246r;

    /* renamed from: v, reason: collision with root package name */
    private C8593n f66250v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f66252x;

    /* renamed from: s, reason: collision with root package name */
    private C8593n f66247s = AbstractC8576P.f66240a;

    /* renamed from: t, reason: collision with root package name */
    private final V.b f66248t = new V.b(new a[16], 0);

    /* renamed from: u, reason: collision with root package name */
    private final V.b f66249u = new V.b(new a[16], 0);

    /* renamed from: w, reason: collision with root package name */
    private long f66251w = Y0.r.f24545b.a();

    /* renamed from: y0.T$a */
    private final class a implements InterfaceC8581b, Y0.d, InterfaceC5380e {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC5380e f66253a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ C8579T f66254b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC3069n f66255c;

        /* renamed from: d, reason: collision with root package name */
        private EnumC8595p f66256d = EnumC8595p.Main;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC5384i f66257e = C5385j.f46088a;

        /* renamed from: y0.T$a$a, reason: collision with other inner class name */
        static final class C2353a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f66259a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f66260b;

            /* renamed from: d, reason: collision with root package name */
            int f66262d;

            C2353a(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f66260b = obj;
                this.f66262d |= PduHandle.NONE;
                return a.this.O0(0L, null, this);
            }
        }

        /* renamed from: y0.T$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f66263a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f66264b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f66265c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10, a aVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f66264b = j10;
                this.f66265c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new b(this.f66264b, this.f66265c, interfaceC5380e);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = eh.AbstractC5467b.g()
                    int r1 = r8.f66263a
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    Yg.v.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    Yg.v.b(r9)
                    goto L2f
                L20:
                    Yg.v.b(r9)
                    long r6 = r8.f66264b
                    long r6 = r6 - r2
                    r8.f66263a = r5
                    java.lang.Object r9 = Ii.Y.a(r6, r8)
                    if (r9 != r0) goto L2f
                    return r0
                L2f:
                    r8.f66263a = r4
                    java.lang.Object r9 = Ii.Y.a(r2, r8)
                    if (r9 != r0) goto L38
                    return r0
                L38:
                    y0.T$a r9 = r8.f66265c
                    Ii.n r9 = y0.C8579T.a.b(r9)
                    if (r9 == 0) goto L54
                    Yg.u$a r0 = Yg.u.f25017b
                    androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r0 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                    long r1 = r8.f66264b
                    r0.<init>(r1)
                    java.lang.Object r0 = Yg.v.a(r0)
                    java.lang.Object r0 = Yg.u.c(r0)
                    r9.resumeWith(r0)
                L54:
                    Yg.J r9 = Yg.J.f24997a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: y0.C8579T.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* renamed from: y0.T$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f66266a;

            /* renamed from: c, reason: collision with root package name */
            int f66268c;

            c(InterfaceC5380e interfaceC5380e) {
                super(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f66266a = obj;
                this.f66268c |= PduHandle.NONE;
                return a.this.T1(0L, null, this);
            }
        }

        public a(InterfaceC5380e interfaceC5380e) {
            this.f66253a = interfaceC5380e;
            this.f66254b = C8579T.this;
        }

        @Override // y0.InterfaceC8581b
        public Object A1(EnumC8595p enumC8595p, InterfaceC5380e interfaceC5380e) {
            C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
            c3073p.A();
            this.f66256d = enumC8595p;
            this.f66255c = c3073p;
            Object objU = c3073p.u();
            if (objU == AbstractC5467b.g()) {
                kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
            }
            return objU;
        }

        @Override // Y0.d
        public long F0(float f10) {
            return this.f66254b.F0(f10);
        }

        @Override // Y0.d
        public long K1(long j10) {
            return this.f66254b.K1(j10);
        }

        @Override // Y0.d
        public float N0(float f10) {
            return this.f66254b.N0(f10);
        }

        @Override // Y0.d
        public float N1(long j10) {
            return this.f66254b.N1(j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [Ii.y0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [Ii.y0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [mh.p] */
        @Override // y0.InterfaceC8581b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object O0(long r11, mh.InterfaceC6839p r13, dh.InterfaceC5380e r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof y0.C8579T.a.C2353a
                if (r0 == 0) goto L13
                r0 = r14
                y0.T$a$a r0 = (y0.C8579T.a.C2353a) r0
                int r1 = r0.f66262d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f66262d = r1
                goto L18
            L13:
                y0.T$a$a r0 = new y0.T$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f66260b
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f66262d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.f66259a
                Ii.y0 r11 = (Ii.InterfaceC3091y0) r11
                Yg.v.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                Yg.v.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                Ii.n r14 = r10.f66255c
                if (r14 == 0) goto L56
                Yg.u$a r2 = Yg.u.f25017b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = Yg.v.a(r2)
                java.lang.Object r2 = Yg.u.c(r2)
                r14.resumeWith(r2)
            L56:
                y0.T r14 = y0.C8579T.this
                Ii.N r4 = r14.d2()
                y0.T$a$b r7 = new y0.T$a$b
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                Ii.y0 r11 = Ii.AbstractC3059i.d(r4, r5, r6, r7, r8, r9)
                r0.f66259a = r11     // Catch: java.lang.Throwable -> L2d
                r0.f66262d = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f28948a
                r11.cancel(r12)
                return r14
            L7b:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.f28948a
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.C8579T.a.O0(long, mh.p, dh.e):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // y0.InterfaceC8581b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object T1(long r5, mh.InterfaceC6839p r7, dh.InterfaceC5380e r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof y0.C8579T.a.c
                if (r0 == 0) goto L13
                r0 = r8
                y0.T$a$c r0 = (y0.C8579T.a.c) r0
                int r1 = r0.f66268c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f66268c = r1
                goto L18
            L13:
                y0.T$a$c r0 = new y0.T$a$c
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f66266a
                java.lang.Object r1 = eh.AbstractC5467b.g()
                int r2 = r0.f66268c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Yg.v.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Yg.v.b(r8)
                r0.f66268c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.O0(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.C8579T.a.T1(long, mh.p, dh.e):java.lang.Object");
        }

        @Override // y0.InterfaceC8581b
        public C8593n Z() {
            return C8579T.this.f66247s;
        }

        @Override // Y0.d
        public float d1(float f10) {
            return this.f66254b.d1(f10);
        }

        @Override // Y0.l
        public long e0(float f10) {
            return this.f66254b.e0(f10);
        }

        @Override // Y0.d
        public long f0(long j10) {
            return this.f66254b.f0(j10);
        }

        @Override // dh.InterfaceC5380e
        public InterfaceC5384i getContext() {
            return this.f66257e;
        }

        @Override // Y0.d
        public float getDensity() {
            return this.f66254b.getDensity();
        }

        @Override // y0.InterfaceC8581b
        public w1 getViewConfiguration() {
            return C8579T.this.getViewConfiguration();
        }

        @Override // y0.InterfaceC8581b
        public long h() {
            return C8579T.this.f66251w;
        }

        @Override // Y0.l
        public float n0(long j10) {
            return this.f66254b.n0(j10);
        }

        @Override // y0.InterfaceC8581b
        public long n1() {
            return C8579T.this.n1();
        }

        @Override // dh.InterfaceC5380e
        public void resumeWith(Object obj) {
            V.b bVar = C8579T.this.f66248t;
            C8579T c8579t = C8579T.this;
            synchronized (bVar) {
                c8579t.f66248t.x(this);
                Yg.J j10 = Yg.J.f24997a;
            }
            this.f66253a.resumeWith(obj);
        }

        public final void v(Throwable th2) {
            InterfaceC3069n interfaceC3069n = this.f66255c;
            if (interfaceC3069n != null) {
                interfaceC3069n.cancel(th2);
            }
            this.f66255c = null;
        }

        @Override // Y0.d
        public float x(int i10) {
            return this.f66254b.x(i10);
        }

        @Override // Y0.d
        public int x1(float f10) {
            return this.f66254b.x1(f10);
        }

        @Override // Y0.l
        public float y() {
            return this.f66254b.y();
        }

        public final void z(C8593n c8593n, EnumC8595p enumC8595p) {
            InterfaceC3069n interfaceC3069n;
            if (enumC8595p != this.f66256d || (interfaceC3069n = this.f66255c) == null) {
                return;
            }
            this.f66255c = null;
            interfaceC3069n.resumeWith(Yg.u.c(c8593n));
        }
    }

    /* renamed from: y0.T$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66269a;

        static {
            int[] iArr = new int[EnumC8595p.values().length];
            try {
                iArr[EnumC8595p.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8595p.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8595p.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66269a = iArr;
        }
    }

    /* renamed from: y0.T$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f66270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f66270a = aVar;
        }

        public final void a(Throwable th2) {
            this.f66270a.v(th2);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: y0.T$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f66271a;

        d(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C8579T.this.new d(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66271a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC6839p interfaceC6839pH2 = C8579T.this.H2();
                C8579T c8579t = C8579T.this;
                this.f66271a = 1;
                if (interfaceC6839pH2.invoke(c8579t, this) == objG) {
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
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public C8579T(Object obj, Object obj2, Object[] objArr, InterfaceC6839p interfaceC6839p) {
        this.f66242n = obj;
        this.f66243o = obj2;
        this.f66244p = objArr;
        this.f66245q = interfaceC6839p;
    }

    private final void G2(C8593n c8593n, EnumC8595p enumC8595p) {
        V.b bVar;
        int iO;
        synchronized (this.f66248t) {
            V.b bVar2 = this.f66249u;
            bVar2.c(bVar2.o(), this.f66248t);
        }
        try {
            int i10 = b.f66269a[enumC8595p.ordinal()];
            if (i10 == 1 || i10 == 2) {
                V.b bVar3 = this.f66249u;
                int iO2 = bVar3.o();
                if (iO2 > 0) {
                    Object[] objArrM = bVar3.m();
                    int i11 = 0;
                    do {
                        ((a) objArrM[i11]).z(c8593n, enumC8595p);
                        i11++;
                    } while (i11 < iO2);
                }
            } else if (i10 == 3 && (iO = (bVar = this.f66249u).o()) > 0) {
                int i12 = iO - 1;
                Object[] objArrM2 = bVar.m();
                do {
                    ((a) objArrM2[i12]).z(c8593n, enumC8595p);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            this.f66249u.h();
        }
    }

    @Override // E0.s0
    public void C0() {
        C8593n c8593n = this.f66250v;
        if (c8593n == null) {
            return;
        }
        List listC = c8593n.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C8604y) listC.get(i10)).i()) {
                List listC2 = c8593n.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    C8604y c8604y = (C8604y) listC2.get(i11);
                    arrayList.add(new C8604y(c8604y.f(), c8604y.o(), c8604y.h(), false, c8604y.j(), c8604y.o(), c8604y.h(), c8604y.i(), c8604y.i(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                C8593n c8593n2 = new C8593n(arrayList);
                this.f66247s = c8593n2;
                G2(c8593n2, EnumC8595p.Initial);
                G2(c8593n2, EnumC8595p.Main);
                G2(c8593n2, EnumC8595p.Final);
                this.f66250v = null;
                return;
            }
        }
    }

    public InterfaceC6839p H2() {
        return this.f66245q;
    }

    public final void I2(Object obj, Object obj2, Object[] objArr, InterfaceC6839p interfaceC6839p) {
        boolean z10 = !AbstractC6492s.d(this.f66242n, obj);
        this.f66242n = obj;
        if (!AbstractC6492s.d(this.f66243o, obj2)) {
            z10 = true;
        }
        this.f66243o = obj2;
        Object[] objArr2 = this.f66244p;
        if (objArr2 != null && objArr == null) {
            z10 = true;
        }
        if (objArr2 == null && objArr != null) {
            z10 = true;
        }
        boolean z11 = (objArr2 == null || objArr == null || Arrays.equals(objArr, objArr2)) ? z10 : true;
        this.f66244p = objArr;
        if (z11) {
            Z1();
        }
        this.f66245q = interfaceC6839p;
    }

    @Override // E0.s0
    public void M1() {
        Z1();
    }

    @Override // y0.InterfaceC8567G
    public Object P(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        a aVar = new a(c3073p);
        synchronized (this.f66248t) {
            this.f66248t.b(aVar);
            InterfaceC5380e interfaceC5380eA = AbstractC5382g.a(interfaceC6839p, aVar, aVar);
            u.a aVar2 = Yg.u.f25017b;
            interfaceC5380eA.resumeWith(Yg.u.c(Yg.J.f24997a));
        }
        c3073p.B(new c(aVar));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    @Override // E0.s0
    public void T0() {
        Z1();
    }

    @Override // y0.InterfaceC8567G
    public void V1(boolean z10) {
        this.f66252x = z10;
    }

    @Override // y0.InterfaceC8578S
    public void Z1() {
        InterfaceC3091y0 interfaceC3091y0 = this.f66246r;
        if (interfaceC3091y0 != null) {
            interfaceC3091y0.cancel((CancellationException) new PointerInputResetException());
            this.f66246r = null;
        }
    }

    @Override // Y0.d
    public float getDensity() {
        return AbstractC2633k.m(this).K().getDensity();
    }

    @Override // y0.InterfaceC8567G
    public w1 getViewConfiguration() {
        return AbstractC2633k.m(this).s0();
    }

    public long h() {
        return this.f66251w;
    }

    public long n1() {
        long jK1 = K1(getViewConfiguration().e());
        long jH = h();
        return AbstractC6538n.a(Math.max(0.0f, C6537m.i(jK1) - Y0.r.g(jH)) / 2.0f, Math.max(0.0f, C6537m.g(jK1) - Y0.r.f(jH)) / 2.0f);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        Z1();
        super.o2();
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        this.f66251w = j10;
        if (enumC8595p == EnumC8595p.Initial) {
            this.f66247s = c8593n;
        }
        if (this.f66246r == null) {
            this.f66246r = AbstractC3063k.d(d2(), null, Ii.P.UNDISPATCHED, new d(null), 1, null);
        }
        G2(c8593n, enumC8595p);
        List listC = c8593n.c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!AbstractC8594o.d((C8604y) listC.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            c8593n = null;
        }
        this.f66250v = c8593n;
    }

    @Override // Y0.l
    public float y() {
        return AbstractC2633k.m(this).K().y();
    }
}
