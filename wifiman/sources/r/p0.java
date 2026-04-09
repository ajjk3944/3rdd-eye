package r;

import Ii.InterfaceC3069n;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.o0;
import r.o0.a;
import r.o0.d;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6835l f59831a = b.f59835a;

    /* renamed from: b, reason: collision with root package name */
    private static final Yg.m f59832b = Yg.n.a(Yg.q.NONE, a.f59833a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f59833a = new a();

        /* renamed from: r.p0$a$a, reason: collision with other inner class name */
        static final class C2087a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C2087a f59834a = new C2087a();

            C2087a() {
                super(1);
            }

            public final void a(InterfaceC6824a interfaceC6824a) {
                interfaceC6824a.invoke();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC6824a) obj);
                return Yg.J.f24997a;
            }
        }

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.snapshots.l invoke() {
            androidx.compose.runtime.snapshots.l lVar = new androidx.compose.runtime.snapshots.l(C2087a.f59834a);
            lVar.s();
            return lVar;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f59835a = new b();

        b() {
            super(1);
        }

        public final void a(C7522c0 c7522c0) {
            c7522c0.M();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7522c0) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f59836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f59837b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f59838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f59839b;

            public a(o0 o0Var, o0 o0Var2) {
                this.f59838a = o0Var;
                this.f59839b = o0Var2;
            }

            @Override // T.K
            public void dispose() {
                this.f59838a.D(this.f59839b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var, o0 o0Var2) {
            super(1);
            this.f59836a = o0Var;
            this.f59837b = o0Var2;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            this.f59836a.d(this.f59837b);
            return new a(this.f59836a, this.f59837b);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f59840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0.a f59841b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f59842a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0.a f59843b;

            public a(o0 o0Var, o0.a aVar) {
                this.f59842a = o0Var;
                this.f59843b = aVar;
            }

            @Override // T.K
            public void dispose() {
                this.f59842a.B(this.f59843b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o0 o0Var, o0.a aVar) {
            super(1);
            this.f59840a = o0Var;
            this.f59841b = aVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            return new a(this.f59840a, this.f59841b);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f59844a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0.d f59845b;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f59846a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0.d f59847b;

            public a(o0 o0Var, o0.d dVar) {
                this.f59846a = o0Var;
                this.f59847b = dVar;
            }

            @Override // T.K
            public void dispose() {
                this.f59846a.C(this.f59847b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0 o0Var, o0.d dVar) {
            super(1);
            this.f59844a = o0Var;
            this.f59845b = dVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            this.f59844a.c(this.f59845b);
            return new a(this.f59844a, this.f59845b);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f59848a;

        /* renamed from: b, reason: collision with root package name */
        Object f59849b;

        /* renamed from: c, reason: collision with root package name */
        int f59850c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0 f59851d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(q0 q0Var, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f59851d = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new f(this.f59851d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ti.a aVarH;
            q0 q0Var;
            Object objG = AbstractC5467b.g();
            int i10 = this.f59850c;
            if (i10 == 0) {
                Yg.v.b(obj);
                ((C7522c0) this.f59851d).L();
                aVarH = ((C7522c0) this.f59851d).H();
                q0 q0Var2 = this.f59851d;
                this.f59848a = aVarH;
                this.f59849b = q0Var2;
                this.f59850c = 1;
                if (aVarH.a(null, this) == objG) {
                    return objG;
                }
                q0Var = q0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q0Var = (q0) this.f59849b;
                aVarH = (Ti.a) this.f59848a;
                Yg.v.b(obj);
            }
            try {
                ((C7522c0) q0Var).S(q0Var.b());
                InterfaceC3069n interfaceC3069nG = ((C7522c0) q0Var).G();
                if (interfaceC3069nG != null) {
                    u.a aVar = Yg.u.f25017b;
                    interfaceC3069nG.resumeWith(Yg.u.c(q0Var.b()));
                }
                ((C7522c0) q0Var).T(null);
                Yg.J j10 = Yg.J.f24997a;
                aVarH.d(null);
                return Yg.J.f24997a;
            } catch (Throwable th2) {
                aVarH.d(null);
                throw th2;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((f) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f59852a;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f59853a;

            public a(o0 o0Var) {
                this.f59853a = o0Var;
            }

            @Override // T.K
            public void dispose() {
                this.f59853a.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(o0 o0Var) {
            super(1);
            this.f59852a = o0Var;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            return new a(this.f59852a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f59854a;

        public static final class a implements T.K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f59855a;

            public a(o0 o0Var) {
                this.f59855a = o0Var;
            }

            @Override // T.K
            public void dispose() {
                this.f59855a.w();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o0 o0Var) {
            super(1);
            this.f59854a = o0Var;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.K invoke(T.L l10) {
            return new a(this.f59854a);
        }
    }

    public static final o0 b(o0 o0Var, Object obj, Object obj2, String str, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-198307638, i10, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && interfaceC3540l.T(o0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new o0(new W(obj), o0Var, o0Var.k() + " > " + str);
            interfaceC3540l.K(objF);
        }
        o0 o0Var2 = (o0) objF;
        if ((i11 <= 4 || !interfaceC3540l.T(o0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zT = interfaceC3540l.T(o0Var2) | z10;
        Object objF2 = interfaceC3540l.f();
        if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new c(o0Var, o0Var2);
            interfaceC3540l.K(objF2);
        }
        T.O.c(o0Var2, (InterfaceC6835l) objF2, interfaceC3540l, 0);
        if (o0Var.u()) {
            o0Var2.G(obj, obj2, o0Var.l());
        } else {
            o0Var2.R(obj2);
            o0Var2.K(false);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return o0Var2;
    }

    public static final o0.a c(o0 o0Var, s0 s0Var, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1714122528, i10, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && interfaceC3540l.T(o0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            objF = o0Var.new a(s0Var, str);
            interfaceC3540l.K(objF);
        }
        o0.a aVar = (o0.a) objF;
        if ((i12 <= 4 || !interfaceC3540l.T(o0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zL = interfaceC3540l.l(aVar) | z10;
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new d(o0Var, aVar);
            interfaceC3540l.K(objF2);
        }
        T.O.c(aVar, (InterfaceC6835l) objF2, interfaceC3540l, 0);
        if (o0Var.u()) {
            aVar.d();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return aVar;
    }

    public static final z1 d(o0 o0Var, Object obj, Object obj2, H h10, s0 s0Var, String str, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-304821198, i10, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)");
        }
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && interfaceC3540l.T(o0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            Object dVar = o0Var.new d(obj, AbstractC7537l.i(s0Var, obj2), s0Var, str);
            interfaceC3540l.K(dVar);
            objF = dVar;
        }
        o0.d dVar2 = (o0.d) objF;
        if (o0Var.u()) {
            dVar2.I(obj, obj2, h10);
        } else {
            dVar2.K(obj2, h10);
        }
        if ((i11 <= 4 || !interfaceC3540l.T(o0Var)) && (i10 & 6) != 4) {
            z10 = false;
        }
        boolean zT = interfaceC3540l.T(dVar2) | z10;
        Object objF2 = interfaceC3540l.f();
        if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new e(o0Var, dVar2);
            interfaceC3540l.K(objF2);
        }
        T.O.c(dVar2, (InterfaceC6835l) objF2, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return dVar2;
    }

    public static final androidx.compose.runtime.snapshots.l e() {
        return (androidx.compose.runtime.snapshots.l) f59832b.getValue();
    }

    public static final o0 f(q0 q0Var, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1643203617, i10, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)");
        }
        int i12 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i12 > 4 && interfaceC3540l.T(q0Var)) || (i10 & 6) == 4;
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new o0(q0Var, str);
            interfaceC3540l.K(objF);
        }
        o0 o0Var = (o0) objF;
        if (q0Var instanceof C7522c0) {
            interfaceC3540l.U(1030413636);
            Object objA = q0Var.a();
            Object objB = q0Var.b();
            if ((i12 <= 4 || !interfaceC3540l.T(q0Var)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objF2 = interfaceC3540l.f();
            if (z10 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new f(q0Var, null);
                interfaceC3540l.K(objF2);
            }
            T.O.e(objA, objB, (InterfaceC6839p) objF2, interfaceC3540l, 0);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(1030875195);
            o0Var.e(q0Var.b(), interfaceC3540l, 0);
            interfaceC3540l.J();
        }
        boolean zT = interfaceC3540l.T(o0Var);
        Object objF3 = interfaceC3540l.f();
        if (zT || objF3 == InterfaceC3540l.f21100a.a()) {
            objF3 = new g(o0Var);
            interfaceC3540l.K(objF3);
        }
        T.O.c(o0Var, (InterfaceC6835l) objF3, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return o0Var;
    }

    public static final o0 g(Object obj, String str, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(2029166765, i10, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:91)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = new o0(obj, str);
            interfaceC3540l.K(objF);
        }
        o0 o0Var = (o0) objF;
        o0Var.e(obj, interfaceC3540l, (i10 & 8) | 48 | (i10 & 14));
        Object objF2 = interfaceC3540l.f();
        if (objF2 == aVar.a()) {
            objF2 = new h(o0Var);
            interfaceC3540l.K(objF2);
        }
        T.O.c(o0Var, (InterfaceC6835l) objF2, interfaceC3540l, 54);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return o0Var;
    }
}
