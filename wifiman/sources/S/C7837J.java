package s;

import C0.AbstractC2538s;
import E0.AbstractC2633k;
import E0.AbstractC2634l;
import E0.InterfaceC2641t;
import E0.h0;
import E0.i0;
import E0.v0;
import Ii.AbstractC3063k;
import T.InterfaceC3551q0;
import T.o1;
import T.z1;
import android.view.View;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.InterfaceC7036c;
import org.conscrypt.PSKKeyManager;

/* renamed from: s.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7837J extends e.c implements InterfaceC2641t, E0.r, v0, h0 {

    /* renamed from: A, reason: collision with root package name */
    private final InterfaceC3551q0 f60640A;

    /* renamed from: B, reason: collision with root package name */
    private z1 f60641B;

    /* renamed from: C, reason: collision with root package name */
    private long f60642C;

    /* renamed from: D, reason: collision with root package name */
    private Y0.r f60643D;

    /* renamed from: E, reason: collision with root package name */
    private Ki.g f60644E;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f60645n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6835l f60646o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC6835l f60647p;

    /* renamed from: q, reason: collision with root package name */
    private float f60648q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f60649r;

    /* renamed from: s, reason: collision with root package name */
    private long f60650s;

    /* renamed from: t, reason: collision with root package name */
    private float f60651t;

    /* renamed from: u, reason: collision with root package name */
    private float f60652u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f60653v;

    /* renamed from: w, reason: collision with root package name */
    private V f60654w;

    /* renamed from: x, reason: collision with root package name */
    private View f60655x;

    /* renamed from: y, reason: collision with root package name */
    private Y0.d f60656y;

    /* renamed from: z, reason: collision with root package name */
    private U f60657z;

    /* renamed from: s.J$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final long a() {
            C0.r rVarO1 = C7837J.this.o1();
            return rVarO1 != null ? AbstractC2538s.e(rVarO1) : C6531g.f52335b.b();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C6531g.d(a());
        }
    }

    /* renamed from: s.J$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        public final long a() {
            return C7837J.this.f60642C;
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C6531g.d(a());
        }
    }

    /* renamed from: s.J$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60660a;

        /* renamed from: s.J$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60662a = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return Yg.J.f24997a;
            }
        }

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C7837J.this.new c(interfaceC5380e);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r4.f60660a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yg.v.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                Yg.v.b(r5)
                goto L32
            L1e:
                Yg.v.b(r5)
            L21:
                s.J r5 = s.C7837J.this
                Ki.g r5 = s.C7837J.D2(r5)
                if (r5 == 0) goto L32
                r4.f60660a = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L32
                return r0
            L32:
                s.J r5 = s.C7837J.this
                s.U r5 = s.C7837J.F2(r5)
                if (r5 == 0) goto L21
                s.J$c$a r5 = s.C7837J.c.a.f60662a
                r4.f60660a = r2
                java.lang.Object r5 = T.AbstractC3535i0.b(r5, r4)
                if (r5 != r0) goto L45
                return r0
            L45:
                s.J r5 = s.C7837J.this
                s.U r5 = s.C7837J.F2(r5)
                if (r5 == 0) goto L21
                r5.b()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: s.C7837J.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: s.J$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {
        d() {
            super(0);
        }

        public final void a() {
            C7837J.this.M2();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ C7837J(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, V v10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6835l, interfaceC6835l2, interfaceC6835l3, f10, z10, j10, f11, f12, z11, v10);
    }

    private final long I2() {
        if (this.f60641B == null) {
            this.f60641B = o1.e(new a());
        }
        z1 z1Var = this.f60641B;
        return z1Var != null ? ((C6531g) z1Var.getValue()).v() : C6531g.f52335b.b();
    }

    private final void J2() {
        U u10 = this.f60657z;
        if (u10 != null) {
            u10.dismiss();
        }
        View viewA = this.f60655x;
        if (viewA == null) {
            viewA = AbstractC2634l.a(this);
        }
        View view = viewA;
        this.f60655x = view;
        Y0.d dVarI = this.f60656y;
        if (dVarI == null) {
            dVarI = AbstractC2633k.i(this);
        }
        Y0.d dVar = dVarI;
        this.f60656y = dVar;
        this.f60657z = this.f60654w.b(view, this.f60649r, this.f60650s, this.f60651t, this.f60652u, this.f60653v, dVar, this.f60648q);
        N2();
    }

    private final void K2(C0.r rVar) {
        this.f60640A.setValue(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M2() {
        /*
            r8 = this;
            Y0.d r0 = r8.f60656y
            if (r0 != 0) goto La
            Y0.d r0 = E0.AbstractC2633k.i(r8)
            r8.f60656y = r0
        La:
            mh.l r1 = r8.f60645n
            java.lang.Object r1 = r1.invoke(r0)
            l0.g r1 = (l0.C6531g) r1
            long r1 = r1.v()
            boolean r3 = l0.AbstractC6532h.c(r1)
            if (r3 == 0) goto L7b
            long r3 = r8.I2()
            boolean r3 = l0.AbstractC6532h.c(r3)
            if (r3 == 0) goto L7b
            long r3 = r8.I2()
            long r1 = l0.C6531g.r(r3, r1)
            r8.f60642C = r1
            mh.l r1 = r8.f60646o
            if (r1 == 0) goto L5e
            java.lang.Object r0 = r1.invoke(r0)
            l0.g r0 = (l0.C6531g) r0
            long r0 = r0.v()
            l0.g r0 = l0.C6531g.d(r0)
            long r1 = r0.v()
            boolean r1 = l0.AbstractC6532h.c(r1)
            if (r1 == 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L5e
            long r0 = r0.v()
            long r2 = r8.I2()
            long r0 = l0.C6531g.r(r2, r0)
        L5c:
            r5 = r0
            goto L65
        L5e:
            l0.g$a r0 = l0.C6531g.f52335b
            long r0 = r0.b()
            goto L5c
        L65:
            s.U r0 = r8.f60657z
            if (r0 != 0) goto L6c
            r8.J2()
        L6c:
            s.U r2 = r8.f60657z
            if (r2 == 0) goto L77
            long r3 = r8.f60642C
            float r7 = r8.f60648q
            r2.a(r3, r5, r7)
        L77:
            r8.N2()
            return
        L7b:
            l0.g$a r0 = l0.C6531g.f52335b
            long r0 = r0.b()
            r8.f60642C = r0
            s.U r0 = r8.f60657z
            if (r0 == 0) goto L8a
            r0.dismiss()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C7837J.M2():void");
    }

    private final void N2() {
        Y0.d dVar;
        U u10 = this.f60657z;
        if (u10 == null || (dVar = this.f60656y) == null || Y0.r.d(u10.h(), this.f60643D)) {
            return;
        }
        InterfaceC6835l interfaceC6835l = this.f60647p;
        if (interfaceC6835l != null) {
            interfaceC6835l.invoke(Y0.k.c(dVar.f0(Y0.s.d(u10.h()))));
        }
        this.f60643D = Y0.r.b(u10.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0.r o1() {
        return (C0.r) this.f60640A.getValue();
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        K2(rVar);
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        interfaceC7036c.X1();
        Ki.g gVar = this.f60644E;
        if (gVar != null) {
            Ki.k.b(gVar.k(Yg.J.f24997a));
        }
    }

    public final void L2(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, InterfaceC6835l interfaceC6835l3, V v10) {
        float f13 = this.f60648q;
        long j11 = this.f60650s;
        float f14 = this.f60651t;
        boolean z12 = this.f60649r;
        float f15 = this.f60652u;
        boolean z13 = this.f60653v;
        V v11 = this.f60654w;
        View view = this.f60655x;
        Y0.d dVar = this.f60656y;
        this.f60645n = interfaceC6835l;
        this.f60646o = interfaceC6835l2;
        this.f60648q = f10;
        this.f60649r = z10;
        this.f60650s = j10;
        this.f60651t = f11;
        this.f60652u = f12;
        this.f60653v = z11;
        this.f60647p = interfaceC6835l3;
        this.f60654w = v10;
        View viewA = AbstractC2634l.a(this);
        Y0.d dVarI = AbstractC2633k.i(this);
        if (this.f60657z != null && ((!AbstractC7838K.a(f10, f13) && !v10.a()) || !Y0.k.f(j10, j11) || !Y0.h.n(f11, f14) || !Y0.h.n(f12, f15) || z10 != z12 || z11 != z13 || !AbstractC6492s.d(v10, v11) || !AbstractC6492s.d(viewA, view) || !AbstractC6492s.d(dVarI, dVar))) {
            J2();
        }
        M2();
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        q1();
        this.f60644E = Ki.j.b(0, null, null, 7, null);
        AbstractC3063k.d(d2(), null, null, new c(null), 3, null);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        U u10 = this.f60657z;
        if (u10 != null) {
            u10.dismiss();
        }
        this.f60657z = null;
    }

    @Override // E0.v0
    public void q(J0.w wVar) {
        wVar.b(AbstractC7838K.b(), new b());
    }

    @Override // E0.h0
    public void q1() {
        i0.a(this, new d());
    }

    public /* synthetic */ C7837J(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, V v10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6835l, (i10 & 2) != 0 ? null : interfaceC6835l2, (i10 & 4) != 0 ? null : interfaceC6835l3, (i10 & 8) != 0 ? Float.NaN : f10, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? Y0.k.f24532b.a() : j10, (i10 & 64) != 0 ? Y0.h.f24523b.c() : f11, (i10 & 128) != 0 ? Y0.h.f24523b.c() : f12, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? true : z11, (i10 & 512) != 0 ? V.f60693a.a() : v10, null);
    }

    private C7837J(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, V v10) {
        this.f60645n = interfaceC6835l;
        this.f60646o = interfaceC6835l2;
        this.f60647p = interfaceC6835l3;
        this.f60648q = f10;
        this.f60649r = z10;
        this.f60650s = j10;
        this.f60651t = f11;
        this.f60652u = f12;
        this.f60653v = z11;
        this.f60654w = v10;
        this.f60640A = o1.h(null, o1.j());
        this.f60642C = C6531g.f52335b.b();
    }
}
