package d;

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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC4017o;
import c.AbstractC4137F;
import c.C4138G;
import c.InterfaceC4141J;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5263a {

    /* renamed from: d.a$a, reason: collision with other inner class name */
    static final class C1690a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f45659a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f45660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1690a(d dVar, boolean z10) {
            super(0);
            this.f45659a = dVar;
            this.f45660b = z10;
        }

        public final void a() {
            this.f45659a.j(this.f45660b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* renamed from: d.a$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4138G f45661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC4017o f45662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f45663c;

        /* renamed from: d.a$b$a, reason: collision with other inner class name */
        public static final class C1691a implements K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f45664a;

            public C1691a(d dVar) {
                this.f45664a = dVar;
            }

            @Override // T.K
            public void dispose() {
                this.f45664a.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4138G c4138g, InterfaceC4017o interfaceC4017o, d dVar) {
            super(1);
            this.f45661a = c4138g;
            this.f45662b = interfaceC4017o;
            this.f45663c = dVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            this.f45661a.h(this.f45662b, this.f45663c);
            return new C1691a(this.f45663c);
        }
    }

    /* renamed from: d.a$c */
    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f45665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f45666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f45667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f45668d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, InterfaceC6824a interfaceC6824a, int i10, int i11) {
            super(2);
            this.f45665a = z10;
            this.f45666b = interfaceC6824a;
            this.f45667c = i10;
            this.f45668d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC5263a.a(this.f45665a, this.f45666b, interfaceC3540l, L0.a(this.f45667c | 1), this.f45668d);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: d.a$d */
    public static final class d extends AbstractC4137F {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1 f45669d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, z1 z1Var) {
            super(z10);
            this.f45669d = z1Var;
        }

        @Override // c.AbstractC4137F
        public void d() {
            AbstractC5263a.b(this.f45669d).invoke();
        }
    }

    public static final void a(boolean z10, InterfaceC6824a interfaceC6824a, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-361453782);
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
            i12 |= interfaceC3540lR.l(interfaceC6824a) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (i13 != 0) {
                z10 = true;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-361453782, i12, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            z1 z1VarN = o1.n(interfaceC6824a, interfaceC3540lR, (i12 >> 3) & 14);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = new d(z10, z1VarN);
                interfaceC3540lR.K(objF);
            }
            d dVar = (d) objF;
            boolean z11 = (i12 & 14) == 4;
            Object objF2 = interfaceC3540lR.f();
            if (z11 || objF2 == aVar.a()) {
                objF2 = new C1690a(dVar, z10);
                interfaceC3540lR.K(objF2);
            }
            O.g((InterfaceC6824a) objF2, interfaceC3540lR, 0);
            InterfaceC4141J interfaceC4141JA = C5266d.f45673a.a(interfaceC3540lR, 6);
            if (interfaceC4141JA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C4138G c4138gB = interfaceC4141JA.b();
            InterfaceC4017o interfaceC4017o = (InterfaceC4017o) interfaceC3540lR.t(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zL = interfaceC3540lR.l(c4138gB) | interfaceC3540lR.l(interfaceC4017o);
            Object objF3 = interfaceC3540lR.f();
            if (zL || objF3 == aVar.a()) {
                objF3 = new b(c4138gB, interfaceC4017o, dVar);
                interfaceC3540lR.K(objF3);
            }
            O.b(interfaceC4017o, c4138gB, (InterfaceC6835l) objF3, interfaceC3540lR, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new c(z10, interfaceC6824a, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6824a b(z1 z1Var) {
        return (InterfaceC6824a) z1Var.getValue();
    }
}
