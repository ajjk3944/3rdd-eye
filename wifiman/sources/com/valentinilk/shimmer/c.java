package com.valentinilk.shimmer;

import Ii.N;
import Li.InterfaceC3221h;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import Vf.f;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import com.valentinilk.shimmer.a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class c {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f45581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Vf.b f45582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Vf.c f45583c;

        /* renamed from: com.valentinilk.shimmer.c$a$a, reason: collision with other inner class name */
        static final class C1687a implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Vf.c f45584a;

            C1687a(Vf.c cVar) {
                this.f45584a = cVar;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(C6533i c6533i, InterfaceC5380e interfaceC5380e) {
                this.f45584a.j(c6533i);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Vf.b bVar, Vf.c cVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45582b = bVar;
            this.f45583c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f45582b, this.f45583c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f45581a;
            if (i10 == 0) {
                v.b(obj);
                z zVarA = this.f45582b.a();
                C1687a c1687a = new C1687a(this.f45583c);
                this.f45581a = 1;
                if (zVarA.b(c1687a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static final e a(e eVar, Vf.b bVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(eVar, "<this>");
        interfaceC3540l.U(-1865284449);
        if ((i11 & 1) != 0) {
            bVar = f.a(a.b.f45578a, null, interfaceC3540l, 6, 2);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1865284449, i10, -1, "com.valentinilk.shimmer.shimmer (ShimmerModifier.kt:16)");
        }
        float fD1 = ((Y0.d) interfaceC3540l.t(AbstractC3932k0.g())).d1(bVar.c().h());
        float fE = bVar.c().e();
        interfaceC3540l.U(1172884448);
        boolean zG = interfaceC3540l.g(fE) | interfaceC3540l.g(fD1);
        Object objF = interfaceC3540l.f();
        if (zG || objF == InterfaceC3540l.f21100a.a()) {
            objF = new Vf.c(fD1, bVar.c().e());
            interfaceC3540l.K(objF);
        }
        Vf.c cVar = (Vf.c) objF;
        interfaceC3540l.J();
        interfaceC3540l.U(1172889264);
        boolean zL = interfaceC3540l.l(bVar) | interfaceC3540l.l(cVar);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new a(bVar, cVar, null);
            interfaceC3540l.K(objF2);
        }
        interfaceC3540l.J();
        O.e(cVar, bVar, (InterfaceC6839p) objF2, interfaceC3540l, i10 & 112);
        e eVarB0 = eVar.b0(new ShimmerElement(cVar, bVar.b()));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return eVarB0;
    }
}
