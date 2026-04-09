package r;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import T.z1;
import com.google.ar.core.ImageMetadata;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import l0.C6531g;
import l0.C6533i;
import l0.C6537m;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7521c {

    /* renamed from: a, reason: collision with root package name */
    private static final C7532h0 f59596a = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    private static final C7532h0 f59597b = AbstractC7535j.j(0.0f, 0.0f, Y0.h.d(I0.a(Y0.h.f24523b)), 3, null);

    /* renamed from: c, reason: collision with root package name */
    private static final C7532h0 f59598c = AbstractC7535j.j(0.0f, 0.0f, C6537m.c(I0.f(C6537m.f52356b)), 3, null);

    /* renamed from: d, reason: collision with root package name */
    private static final C7532h0 f59599d = AbstractC7535j.j(0.0f, 0.0f, C6531g.d(I0.e(C6531g.f52335b)), 3, null);

    /* renamed from: e, reason: collision with root package name */
    private static final C7532h0 f59600e = AbstractC7535j.j(0.0f, 0.0f, I0.g(C6533i.f52340e), 3, null);

    /* renamed from: f, reason: collision with root package name */
    private static final C7532h0 f59601f = AbstractC7535j.j(0.0f, 0.0f, Integer.valueOf(I0.b(kotlin.jvm.internal.r.f51727a)), 3, null);

    /* renamed from: g, reason: collision with root package name */
    private static final C7532h0 f59602g = AbstractC7535j.j(0.0f, 0.0f, Y0.n.b(I0.c(Y0.n.f24536b)), 3, null);

    /* renamed from: h, reason: collision with root package name */
    private static final C7532h0 f59603h = AbstractC7535j.j(0.0f, 0.0f, Y0.r.b(I0.d(Y0.r.f24545b)), 3, null);

    /* renamed from: r.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ki.g f59604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f59605b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ki.g gVar, Object obj) {
            super(0);
            this.f59604a = gVar;
            this.f59605b = obj;
        }

        public final void a() {
            this.f59604a.k(this.f59605b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: r.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f59606a;

        /* renamed from: b, reason: collision with root package name */
        int f59607b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f59608c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ki.g f59609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7517a f59610e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1 f59611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1 f59612g;

        /* renamed from: r.c$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f59613a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f59614b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7517a f59615c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1 f59616d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1 f59617e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C7517a c7517a, z1 z1Var, z1 z1Var2, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f59614b = obj;
                this.f59615c = c7517a;
                this.f59616d = z1Var;
                this.f59617e = z1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f59614b, this.f59615c, this.f59616d, this.f59617e, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f59613a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    if (!AbstractC6492s.d(this.f59614b, this.f59615c.k())) {
                        C7517a c7517a = this.f59615c;
                        Object obj2 = this.f59614b;
                        InterfaceC7533i interfaceC7533iH = AbstractC7521c.h(this.f59616d);
                        this.f59613a = 1;
                        if (C7517a.f(c7517a, obj2, interfaceC7533iH, null, null, this, 12, null) == objG) {
                            return objG;
                        }
                    }
                    return Yg.J.f24997a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                InterfaceC6835l interfaceC6835lG = AbstractC7521c.g(this.f59617e);
                if (interfaceC6835lG != null) {
                    interfaceC6835lG.invoke(this.f59615c.m());
                }
                return Yg.J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ki.g gVar, C7517a c7517a, z1 z1Var, z1 z1Var2, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f59609d = gVar;
            this.f59610e = c7517a;
            this.f59611f = z1Var;
            this.f59612g = z1Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f59609d, this.f59610e, this.f59611f, this.f59612g, interfaceC5380e);
            bVar.f59608c = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:12:0x003d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r13.f59607b
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r13.f59606a
                Ki.i r1 = (Ki.i) r1
                java.lang.Object r3 = r13.f59608c
                Ii.N r3 = (Ii.N) r3
                Yg.v.b(r14)
                r4 = r14
                goto L3d
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                Yg.v.b(r14)
                java.lang.Object r1 = r13.f59608c
                Ii.N r1 = (Ii.N) r1
                Ki.g r3 = r13.f59609d
                Ki.i r3 = r3.iterator()
                r12 = r3
                r3 = r1
                r1 = r12
            L30:
                r13.f59608c = r3
                r13.f59606a = r1
                r13.f59607b = r2
                java.lang.Object r4 = r1.a(r13)
                if (r4 != r0) goto L3d
                return r0
            L3d:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L6f
                java.lang.Object r4 = r1.next()
                Ki.g r5 = r13.f59609d
                java.lang.Object r5 = r5.d()
                java.lang.Object r5 = Ki.k.f(r5)
                if (r5 != 0) goto L57
                r7 = r4
                goto L58
            L57:
                r7 = r5
            L58:
                r.c$b$a r4 = new r.c$b$a
                r.a r8 = r13.f59610e
                T.z1 r9 = r13.f59611f
                T.z1 r10 = r13.f59612g
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                r5 = r3
                r8 = r4
                Ii.AbstractC3059i.d(r5, r6, r7, r8, r9, r10)
                goto L30
            L6f:
                Yg.J r0 = Yg.J.f24997a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: r.AbstractC7521c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static final z1 c(float f10, InterfaceC7533i interfaceC7533i, String str, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC7533i = f59597b;
        }
        InterfaceC7533i interfaceC7533i2 = interfaceC7533i;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            interfaceC6835l = null;
        }
        InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i12 = i10 << 6;
        z1 z1VarF = f(Y0.h.d(f10), u0.b(Y0.h.f24523b), interfaceC7533i2, null, str2, interfaceC6835l2, interfaceC3540l, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarF;
    }

    public static final z1 d(float f10, InterfaceC7533i interfaceC7533i, float f11, String str, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        InterfaceC7533i interfaceC7533i2;
        InterfaceC7533i interfaceC7533i3 = (i11 & 2) != 0 ? f59596a : interfaceC7533i;
        float f12 = (i11 & 4) != 0 ? 0.01f : f11;
        String str2 = (i11 & 8) != 0 ? "FloatAnimation" : str;
        InterfaceC6835l interfaceC6835l2 = (i11 & 16) != 0 ? null : interfaceC6835l;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (interfaceC7533i3 == f59596a) {
            interfaceC3540l.U(1125598679);
            boolean z10 = (((i10 & 896) ^ 384) > 256 && interfaceC3540l.g(f12)) || (i10 & 384) == 256;
            Object objF = interfaceC3540l.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC7535j.j(0.0f, 0.0f, Float.valueOf(f12), 3, null);
                interfaceC3540l.K(objF);
            }
            interfaceC7533i2 = (C7532h0) objF;
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1125708605);
            interfaceC3540l.J();
            interfaceC7533i2 = interfaceC7533i3;
        }
        int i12 = i10 << 3;
        z1 z1VarF = f(Float.valueOf(f10), u0.f(C6486l.f51726a), interfaceC7533i2, Float.valueOf(f12), str2, interfaceC6835l2, interfaceC3540l, (i10 & 14) | (i12 & 7168) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarF;
    }

    public static final z1 e(int i10, InterfaceC7533i interfaceC7533i, String str, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i11, int i12) {
        if ((i12 & 2) != 0) {
            interfaceC7533i = f59601f;
        }
        InterfaceC7533i interfaceC7533i2 = interfaceC7533i;
        if ((i12 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            interfaceC6835l = null;
        }
        InterfaceC6835l interfaceC6835l2 = interfaceC6835l;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(428074472, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i13 = i11 << 6;
        z1 z1VarF = f(Integer.valueOf(i10), u0.g(kotlin.jvm.internal.r.f51727a), interfaceC7533i2, null, str2, interfaceC6835l2, interfaceC3540l, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & ImageMetadata.JPEG_GPS_COORDINATES), 8);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarF;
    }

    public static final z1 f(Object obj, s0 s0Var, InterfaceC7533i interfaceC7533i, Object obj2, String str, InterfaceC6835l interfaceC6835l, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        InterfaceC7533i interfaceC7533iI;
        if ((i11 & 4) != 0) {
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC7535j.j(0.0f, 0.0f, null, 7, null);
                interfaceC3540l.K(objF);
            }
            interfaceC7533iI = (C7532h0) objF;
        } else {
            interfaceC7533iI = interfaceC7533i;
        }
        Object obj3 = (i11 & 8) != 0 ? null : obj2;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        InterfaceC6835l interfaceC6835l2 = (i11 & 32) != 0 ? null : interfaceC6835l;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object objF2 = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF2 == aVar.a()) {
            objF2 = t1.d(null, null, 2, null);
            interfaceC3540l.K(objF2);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF2;
        Object objF3 = interfaceC3540l.f();
        if (objF3 == aVar.a()) {
            objF3 = new C7517a(obj, s0Var, obj3, str2);
            interfaceC3540l.K(objF3);
        }
        C7517a c7517a = (C7517a) objF3;
        z1 z1VarN = o1.n(interfaceC6835l2, interfaceC3540l, (i10 >> 15) & 14);
        if (obj3 != null && (interfaceC7533iI instanceof C7532h0)) {
            C7532h0 c7532h0 = (C7532h0) interfaceC7533iI;
            if (!AbstractC6492s.d(c7532h0.h(), obj3)) {
                interfaceC7533iI = AbstractC7535j.i(c7532h0.f(), c7532h0.g(), obj3);
            }
        }
        z1 z1VarN2 = o1.n(interfaceC7533iI, interfaceC3540l, 0);
        Object objF4 = interfaceC3540l.f();
        if (objF4 == aVar.a()) {
            objF4 = Ki.j.b(-1, null, null, 6, null);
            interfaceC3540l.K(objF4);
        }
        Ki.g gVar = (Ki.g) objF4;
        boolean zL = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.l(obj)) || (i10 & 6) == 4) | interfaceC3540l.l(gVar);
        Object objF5 = interfaceC3540l.f();
        if (zL || objF5 == aVar.a()) {
            objF5 = new a(gVar, obj);
            interfaceC3540l.K(objF5);
        }
        T.O.g((InterfaceC6824a) objF5, interfaceC3540l, 0);
        boolean zL2 = interfaceC3540l.l(gVar) | interfaceC3540l.l(c7517a) | interfaceC3540l.T(z1VarN2) | interfaceC3540l.T(z1VarN);
        Object objF6 = interfaceC3540l.f();
        if (zL2 || objF6 == aVar.a()) {
            objF6 = new b(gVar, c7517a, z1VarN2, z1VarN, null);
            interfaceC3540l.K(objF6);
        }
        T.O.f(gVar, (InterfaceC6839p) objF6, interfaceC3540l, 0);
        z1 z1VarG = (z1) interfaceC3551q0.getValue();
        if (z1VarG == null) {
            z1VarG = c7517a.g();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6835l g(z1 z1Var) {
        return (InterfaceC6835l) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7533i h(z1 z1Var) {
        return (InterfaceC7533i) z1Var.getValue();
    }
}
