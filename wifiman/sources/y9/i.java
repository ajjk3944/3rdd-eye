package Y9;

import C0.C;
import C0.InterfaceC2528h;
import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import Ii.N;
import L9.AbstractC3198d;
import L9.E;
import L9.w;
import N.AbstractC3346t0;
import T.A;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import Y9.i;
import Y9.k;
import Yg.J;
import Yg.v;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import q.AbstractC7385d;
import q.AbstractC7391j;
import q.InterfaceC7386e;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* loaded from: classes3.dex */
public abstract class i {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f24787a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f24788b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f24788b = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f24788b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f24787a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = this.f24788b;
                this.f24787a = 1;
                if (kVar.k(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f24789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f24790b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f24790b = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f24790b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f24789a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = this.f24790b;
                this.f24789a = 1;
                if (kVar.R(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f24791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f24792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f24792b = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f24792b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f24791a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = this.f24792b;
                this.f24791a = 1;
                if (kVar.k(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f24793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f24794b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f24794b = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f24794b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f24793a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = this.f24794b;
                this.f24793a = 1;
                if (kVar.A(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f24795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f24796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f24796b = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f24796b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f24795a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = this.f24796b;
                this.f24795a = 1;
                if (kVar.R(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f24797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f24798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24799c;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f24800a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f24801b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k kVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f24801b = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f24801b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f24800a;
                if (i10 == 0) {
                    v.b(obj);
                    k kVar = this.f24801b;
                    this.f24800a = 1;
                    if (kVar.H(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        f(N n10, k kVar, boolean z10) {
            this.f24797a = n10;
            this.f24798b = kVar;
            this.f24799c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(N n10, k kVar) {
            AbstractC3063k.d(n10, null, null, new a(kVar, null), 3, null);
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1979994469, i10, -1, "com.ui.core.ui.sso.mfa.auth.push.PushAuthLayout.<anonymous> (PushAuthLayout.kt:54)");
            }
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            interfaceC3540l.U(-465453117);
            boolean zL = interfaceC3540l.l(this.f24797a) | interfaceC3540l.l(this.f24798b);
            final N n10 = this.f24797a;
            final k kVar = this.f24798b;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Y9.j
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.f.c(n10, kVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            E.i(null, null, aVar, interfaceC6824a, null, 0L, 0L, 0L, this.f24799c ? w.f11485a.c() : w.f11485a.d(), null, 0.0f, interfaceC3540l, AbstractC3198d.a.f11403c << 6, 0, 1779);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class g implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f24802a;

        static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f24803a;

            /* renamed from: Y9.i$g$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0941a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f24804a;

                static {
                    int[] iArr = new int[k.a.values().length];
                    try {
                        iArr[k.a.AUTH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k.a.DENIED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f24804a = iArr;
                }
            }

            a(k kVar) {
                this.f24803a = kVar;
            }

            public final void a(k.a scene, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                AbstractC6492s.i(scene, "scene");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(scene) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(257952049, i10, -1, "com.ui.core.ui.sso.mfa.auth.push.PushAuthLayout.<anonymous>.<anonymous> (PushAuthLayout.kt:72)");
                }
                int i11 = C0941a.f24804a[scene.ordinal()];
                if (i11 == 1) {
                    interfaceC3540l.U(1105837058);
                    i.m(this.f24803a, interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    if (i11 != 2) {
                        interfaceC3540l.U(1105835245);
                        interfaceC3540l.J();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC3540l.U(1105839044);
                    i.i(this.f24803a, interfaceC3540l, 0);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                a((k.a) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        static final class b implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z.N f24805a;

            b(z.N n10) {
                this.f24805a = n10;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1252845974, i10, -1, "com.ui.core.ui.sso.mfa.auth.push.PushAuthLayout.<anonymous>.<anonymous> (PushAuthLayout.kt:86)");
                }
                androidx.compose.ui.e eVarH = o.h(androidx.compose.foundation.b.d(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).d(), null, 2, null), this.f24805a);
                C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
                InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA, cH, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
                AbstractC3346t0.b(null, 0L, 0.0f, 0L, 0, interfaceC3540l, 0, 31);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        g(k kVar) {
            this.f24802a = kVar;
        }

        public final void a(z.N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(scaffoldPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1524427842, i11, -1, "com.ui.core.ui.sso.mfa.auth.push.PushAuthLayout.<anonymous> (PushAuthLayout.kt:71)");
            }
            AbstractC7391j.a(o1.b(this.f24802a.K(), null, interfaceC3540l, 0, 1).getValue(), null, null, null, b0.c.e(257952049, true, new a(this.f24802a), interfaceC3540l, 54), interfaceC3540l, 24576, 14);
            AbstractC7385d.f(((Boolean) o1.b(this.f24802a.F(), null, interfaceC3540l, 0, 1).getValue()).booleanValue(), null, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-1252845974, true, new b(scaffoldPadding), interfaceC3540l, 54), interfaceC3540l, 200064, 18);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:73:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(final Y9.k r42, T.InterfaceC3540l r43, final int r44) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y9.i.i(Y9.k, T.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(N n10, k kVar) {
        AbstractC3063k.d(n10, null, null, new a(kVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(N n10, k kVar) {
        AbstractC3063k.d(n10, null, null, new b(kVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(k kVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        i(kVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(final k kVar, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        int i11;
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2028364790);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC3540lR.T(kVar) : interfaceC3540lR.l(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2028364790, i11, -1, "com.ui.core.ui.sso.mfa.auth.push.Push (PushAuthLayout.kt:102)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((A) objF).a();
            C6562a c6562a = C6562a.f52458a;
            int i13 = C6562a.f52459b;
            float fC = c6562a.d(interfaceC3540lR, i13).a().a().c();
            float f10 = 32;
            float fA = c6562a.d(interfaceC3540lR, i13).a().a().a(Y0.h.j(f10));
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarF = r.f(aVar2, 0.0f, 1, null);
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarF);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cA, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            C8688k c8688k = C8688k.f66923a;
            int i14 = i11;
            Z9.h.c(AbstractC7930a.a(new d.b(P9.b.f18422X), interfaceC3540lR, 0).toString(), o.m(r.h(aVar2, 0.0f, 1, null), fC, c6562a.d(interfaceC3540lR, i13).a().b().d(), fC, 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC3540lR, 0, 0, 65532);
            float f11 = 16;
            Z9.k.c(AbstractC7930a.a(new d.b(P9.b.f18420W), interfaceC3540lR, 0).toString(), o.m(r.h(aVar2, 0.0f, 1, null), fC, Y0.h.j(f11), fC, 0.0f, 8, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC3540lR, 0, 0, 65532);
            interfaceC3540lR = interfaceC3540lR;
            AbstractC6784a abstractC6784aA = c6562a.a(interfaceC3540lR, i13);
            if (AbstractC6492s.d(abstractC6784aA, AbstractC6784a.b.f53648a)) {
                i12 = P9.a.f18374k;
            } else {
                if (!AbstractC6492s.d(abstractC6784aA, AbstractC6784a.d.f53661a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = P9.a.f18373j;
            }
            AbstractC8049c.e(new c.a(i12, null, 2, null), o.j(r.h(c8688k.a(r.n(aVar2, 0.0f, Y0.h.j(296), 1, null), 1.0f, true), 0.0f, 1, null), fC, Y0.h.j(f11)), null, null, null, null, InterfaceC2528h.f2145a.b(), 0.0f, null, interfaceC3540lR, 1572864, 222);
            boolean zBooleanValue = ((Boolean) o1.b(kVar.D(), null, interfaceC3540lR, 0, 1).getValue()).booleanValue();
            androidx.compose.ui.e eVarH = r.h(aVar2, 0.0f, 1, null);
            float f12 = 8;
            androidx.compose.ui.e eVarM = o.m(eVarH, fA, 0.0f, fA, Y0.h.j(f12), 2, null);
            String strB = AbstractC7930a.b((s9.d) o1.b(kVar.M(), null, interfaceC3540lR, 0, 1).getValue(), interfaceC3540lR, 0);
            boolean zBooleanValue2 = ((Boolean) o1.b(kVar.v(), null, interfaceC3540lR, 0, 1).getValue()).booleanValue();
            interfaceC3540lR.U(616259094);
            int i15 = i14 & 14;
            boolean zL = interfaceC3540lR.l(nA) | (i15 == 4 || ((i14 & 8) != 0 && interfaceC3540lR.l(kVar)));
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: Y9.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.n(nA, kVar);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            w9.o.c(eVarM, (InterfaceC6824a) objF2, zBooleanValue2, false, null, strB, interfaceC3540lR, 0, 24);
            androidx.compose.ui.e eVarM2 = o.m(r.h(aVar2, 0.0f, 1, null), fA, 0.0f, fA, Y0.h.j(f12), 2, null);
            String strA = H0.f.a(P9.b.f18410R, interfaceC3540lR, 0);
            interfaceC3540lR.U(616274401);
            boolean zL2 = interfaceC3540lR.l(nA) | (i15 == 4 || ((i14 & 8) != 0 && interfaceC3540lR.l(kVar)));
            Object objF3 = interfaceC3540lR.f();
            if (zL2 || objF3 == aVar.a()) {
                objF3 = new InterfaceC6824a() { // from class: Y9.f
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.o(nA, kVar);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            w9.o.c(eVarM2, (InterfaceC6824a) objF3, false, false, null, strA, interfaceC3540lR, 0, 28);
            interfaceC3540lR.U(616279531);
            if (zBooleanValue) {
                androidx.compose.ui.e eVarM3 = o.m(r.h(aVar2, 0.0f, 1, null), fA, 0.0f, fA, c6562a.d(interfaceC3540lR, i13).a().b().a(Y0.h.j(f10)), 2, null);
                String strA2 = H0.f.a(P9.b.f18461r, interfaceC3540lR, 0);
                interfaceC3540lR.U(616293581);
                boolean zL3 = interfaceC3540lR.l(nA) | (i15 == 4 || ((i14 & 8) != 0 && interfaceC3540lR.l(kVar)));
                Object objF4 = interfaceC3540lR.f();
                if (zL3 || objF4 == aVar.a()) {
                    objF4 = new InterfaceC6824a() { // from class: Y9.g
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return i.p(nA, kVar);
                        }
                    };
                    interfaceC3540lR.K(objF4);
                }
                interfaceC3540lR.J();
                w9.o.c(eVarM3, (InterfaceC6824a) objF4, false, false, null, strA2, interfaceC3540lR, 0, 28);
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Y9.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.q(kVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(N n10, k kVar) {
        AbstractC3063k.d(n10, null, null, new c(kVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(N n10, k kVar) {
        AbstractC3063k.d(n10, null, null, new d(kVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(N n10, k kVar) {
        AbstractC3063k.d(n10, null, null, new e(kVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(k kVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        m(kVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r(final Y9.k r33, boolean r34, T.InterfaceC3540l r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y9.i.r(Y9.k, boolean, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J s(k kVar, boolean z10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        r(kVar, z10, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
