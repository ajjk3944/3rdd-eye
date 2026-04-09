package I;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6680P;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    private final o1 f7995a;

    /* renamed from: b, reason: collision with root package name */
    private final l1 f7996b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2952q f7997c;

    /* renamed from: d, reason: collision with root package name */
    private final Ii.N f7998d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7999e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8000f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC3091y0 f8001g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8002h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8003i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8004j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8005k;

    /* renamed from: l, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f8006l = new CursorAnchorInfo.Builder();

    /* renamed from: m, reason: collision with root package name */
    private final float[] f8007m = m0.O0.c(null, 1, null);

    /* renamed from: n, reason: collision with root package name */
    private final Matrix f8008n = new Matrix();

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f8009a;

        /* renamed from: I.F$a$a, reason: collision with other inner class name */
        static final class C0329a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F f8011a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0329a(F f10) {
                super(0);
                this.f8011a = f10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CursorAnchorInfo invoke() {
                return this.f8011a.c();
            }
        }

        static final class b implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F f8012a;

            b(F f10) {
                this.f8012a = f10;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(CursorAnchorInfo cursorAnchorInfo, InterfaceC5380e interfaceC5380e) {
                this.f8012a.f7997c.c(cursorAnchorInfo);
                return Yg.J.f24997a;
            }
        }

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return F.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f8009a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC3220g interfaceC3220gW = AbstractC3222i.w(AbstractC3222i.q(T.o1.o(new C0329a(F.this)), 1));
                b bVar = new b(F.this);
                this.f8009a = 1;
                if (interfaceC3220gW.b(bVar, this) == objG) {
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
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public F(o1 o1Var, l1 l1Var, InterfaceC2952q interfaceC2952q, Ii.N n10) {
        this.f7995a = o1Var;
        this.f7996b = l1Var;
        this.f7997c = interfaceC2952q;
        this.f7998d = n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo c() {
        C0.r rVarD;
        C0.r rVarE;
        L0.M mF;
        C0.r rVarJ = this.f7996b.j();
        if (rVarJ != null) {
            if (!rVarJ.M()) {
                rVarJ = null;
            }
            if (rVarJ != null && (rVarD = this.f7996b.d()) != null) {
                if (!rVarD.M()) {
                    rVarD = null;
                }
                if (rVarD != null && (rVarE = this.f7996b.e()) != null) {
                    if (!rVarE.M()) {
                        rVarE = null;
                    }
                    if (rVarE == null || (mF = this.f7996b.f()) == null) {
                        return null;
                    }
                    H.h hVarL = this.f7995a.l();
                    m0.O0.h(this.f8007m);
                    rVarJ.O(this.f8007m);
                    AbstractC6680P.a(this.f8008n, this.f8007m);
                    C6533i c6533iB = M.A.b(rVarD);
                    C6531g.a aVar = C6531g.f52335b;
                    return E.b(this.f8006l, hVarL, hVarL.f(), hVarL.c(), mF, this.f8008n, c6533iB.x(rVarJ.b0(rVarD, aVar.c())), M.A.b(rVarE).x(rVarJ.b0(rVarE, aVar.c())), this.f8002h, this.f8003i, this.f8004j, this.f8005k);
                }
            }
        }
        return null;
    }

    private final void e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f8002h = z12;
        this.f8003i = z13;
        this.f8004j = z14;
        this.f8005k = z15;
        if (z10) {
            this.f8000f = true;
            CursorAnchorInfo cursorAnchorInfoC = c();
            if (cursorAnchorInfoC != null) {
                this.f7997c.c(cursorAnchorInfoC);
            }
        }
        this.f7999e = z11;
        f();
    }

    private final void f() {
        if (!this.f7999e) {
            InterfaceC3091y0 interfaceC3091y0 = this.f8001g;
            if (interfaceC3091y0 != null) {
                InterfaceC3091y0.a.b(interfaceC3091y0, null, 1, null);
            }
            this.f8001g = null;
            return;
        }
        InterfaceC3091y0 interfaceC3091y02 = this.f8001g;
        if (interfaceC3091y02 == null || !interfaceC3091y02.isActive()) {
            this.f8001g = AbstractC3063k.d(this.f7998d, null, Ii.P.UNDISPATCHED, new a(null), 1, null);
        }
    }

    public final void d(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z17 = (i10 & 16) != 0;
            boolean z18 = (i10 & 8) != 0;
            boolean z19 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z17 || z18 || z19 || z14) {
                z11 = z14;
                z10 = z19;
                z13 = z18;
                z12 = z17;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z14;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        e(z15, z16, z12, z13, z10, z11);
    }
}
