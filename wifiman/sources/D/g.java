package d;

import Ii.N;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.z1;
import Yg.J;
import Yg.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import c.C4138G;
import c.InterfaceC4141J;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class g {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f45690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5268f f45691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f45692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5268f c5268f, boolean z10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45691b = c5268f;
            this.f45692c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f45691b, this.f45692c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f45690a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f45691b.m(this.f45692c);
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4138G f45693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4017o f45694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5268f f45695c;

        public static final class a implements K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5268f f45696a;

            public a(C5268f c5268f) {
                this.f45696a = c5268f;
            }

            @Override // T.K
            public void dispose() {
                this.f45696a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4138G c4138g, InterfaceC4017o interfaceC4017o, C5268f c5268f) {
            super(1);
            this.f45693a = c4138g;
            this.f45694b = interfaceC4017o;
            this.f45695c = c5268f;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            this.f45693a.h(this.f45694b, this.f45695c);
            return new a(this.f45695c);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f45697a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f45698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45700d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f45697a = z10;
            this.f45698b = interfaceC6839p;
            this.f45699c = i10;
            this.f45700d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            g.a(this.f45697a, this.f45698b, interfaceC3540l, L0.a(this.f45699c | 1), this.f45700d);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void a(boolean z10, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-642000585);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-642000585, i12, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            z1 z1VarN = o1.n(interfaceC6839p, interfaceC3540lR, (i12 >> 3) & 14);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            N nA = ((A) objF).a();
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == aVar.a()) {
                objF2 = new C5268f(z10, nA, b(z1VarN));
                interfaceC3540lR.K(objF2);
            }
            C5268f c5268f = (C5268f) objF2;
            boolean zT = interfaceC3540lR.T(b(z1VarN)) | interfaceC3540lR.T(nA);
            Object objF3 = interfaceC3540lR.f();
            if (zT || objF3 == aVar.a()) {
                c5268f.l(b(z1VarN));
                c5268f.n(nA);
                interfaceC3540lR.K(J.f24997a);
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            int i14 = i12 & 14;
            boolean zL = interfaceC3540lR.l(c5268f) | (i14 == 4);
            Object objF4 = interfaceC3540lR.f();
            if (zL || objF4 == aVar.a()) {
                objF4 = new a(c5268f, z10, null);
                interfaceC3540lR.K(objF4);
            }
            O.f(boolValueOf, (InterfaceC6839p) objF4, interfaceC3540lR, i14);
            InterfaceC4141J interfaceC4141JA = C5266d.f45673a.a(interfaceC3540lR, 6);
            if (interfaceC4141JA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C4138G c4138gB = interfaceC4141JA.b();
            InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zL2 = interfaceC3540lR.l(c4138gB) | interfaceC3540lR.l(interfaceC4017o) | interfaceC3540lR.l(c5268f);
            Object objF5 = interfaceC3540lR.f();
            if (zL2 || objF5 == aVar.a()) {
                objF5 = new b(c4138gB, interfaceC4017o, c5268f);
                interfaceC3540lR.K(objF5);
            }
            O.b(interfaceC4017o, c4138gB, (InterfaceC6835l) objF5, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(z10, interfaceC6839p, i10, i11));
        }
    }

    private static final InterfaceC6839p b(z1 z1Var) {
        return (InterfaceC6839p) z1Var.getValue();
    }
}
