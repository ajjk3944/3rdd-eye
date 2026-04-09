package V9;

import C0.C;
import C0.InterfaceC2528h;
import E0.InterfaceC2629g;
import Ii.AbstractC3063k;
import Ii.N;
import L0.C3174d;
import L0.U;
import L9.AbstractC3198d;
import L9.E;
import L9.w;
import N.a1;
import T.A;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import W0.j;
import Y0.h;
import Yg.J;
import Yg.v;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import com.google.ar.core.ImageMetadata;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.j0;

/* loaded from: classes3.dex */
public abstract class e {

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23282a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f23283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23283b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f23283b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23282a;
            if (i10 == 0) {
                v.b(obj);
                f fVar = this.f23283b;
                this.f23282a = 1;
                if (fVar.H(this) == objG) {
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

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f23285b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23285b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new b(this.f23285b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23284a;
            if (i10 == 0) {
                v.b(obj);
                f fVar = this.f23285b;
                this.f23284a = 1;
                if (fVar.f0(this) == objG) {
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

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f23286a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f23287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f23287b = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f23287b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f23286a;
            if (i10 == 0) {
                v.b(obj);
                f fVar = this.f23287b;
                this.f23286a = 1;
                if (fVar.e0(this) == objG) {
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

    public static final void e(f fVar, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        final f vm = fVar;
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(735906879);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(vm) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(735906879, i11, -1, "com.ui.core.ui.sso.mfa.accesslost.LostAccountAccessLayout (LostAccountAccessLayout.kt:39)");
            }
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
                interfaceC3540lR.K(a10);
                objF = a10;
            }
            final N nA = ((A) objF).a();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarA = j0.a(j0.b(r.h(aVar2, 0.0f, 1, null)));
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarM = o.m(eVarA, 0.0f, 0.0f, 0.0f, c6562a.d(interfaceC3540lR, i12).a().b().a(h.j(20)), 7, null);
            C cA = AbstractC8685h.a(C8680c.f66832a.a(), f0.c.f46573a.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarM);
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
            String strA = H0.f.a(P9.b.f18398L, interfaceC3540lR, 0);
            float fC = w.f11485a.c();
            AbstractC3198d.b bVar = AbstractC3198d.b.f11404b;
            interfaceC3540lR.U(1888324810);
            int i13 = i11 & 14;
            boolean zL = (i13 == 4) | interfaceC3540lR.l(nA);
            Object objF2 = interfaceC3540lR.f();
            if (zL || objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: V9.a
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.f(nA, vm);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            E.i(null, strA, bVar, (InterfaceC6824a) objF2, null, 0L, 0L, 0L, fC, null, 0.0f, interfaceC3540lR, AbstractC3198d.b.f11405c << 6, 0, 1777);
            float f10 = 200;
            AbstractC8049c.e(new c.a(P9.a.f18370g, null, 2, null), r.z(r.i(aVar2, h.j(f10)), h.j(f10)), null, null, null, null, InterfaceC2528h.f2145a.b(), 0.0f, null, interfaceC3540lR, 1572912, 222);
            androidx.compose.ui.e eVarM2 = o.m(r.h(aVar2, 0.0f, 1, null), c6562a.d(interfaceC3540lR, i12).a().a().d(), h.j(24), c6562a.d(interfaceC3540lR, i12).a().a().d(), 0.0f, 8, null);
            int iA2 = j.f23523b.a();
            C3174d c3174dA = AbstractC7930a.a(new d.b(P9.b.f18400M), interfaceC3540lR, 0);
            long jC = c6562a.a(interfaceC3540lR, i12).f().c();
            U uA = c6562a.c(interfaceC3540lR, i12).b().a();
            a1.c(c3174dA, eVarM2, jC, 0L, null, null, null, 0L, null, j.h(iA2), 0L, 0, false, 0, 0, null, null, uA.b((15204351 & 1) != 0 ? uA.f11108a.g() : 0L, (15204351 & 2) != 0 ? uA.f11108a.k() : Y0.w.g(16), (15204351 & 4) != 0 ? uA.f11108a.n() : null, (15204351 & 8) != 0 ? uA.f11108a.l() : null, (15204351 & 16) != 0 ? uA.f11108a.m() : null, (15204351 & 32) != 0 ? uA.f11108a.i() : null, (15204351 & 64) != 0 ? uA.f11108a.j() : null, (15204351 & 128) != 0 ? uA.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uA.f11108a.e() : null, (15204351 & 512) != 0 ? uA.f11108a.u() : null, (15204351 & 1024) != 0 ? uA.f11108a.p() : null, (15204351 & 2048) != 0 ? uA.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uA.f11108a.s() : null, (15204351 & 8192) != 0 ? uA.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uA.f11108a.h() : null, (15204351 & 32768) != 0 ? uA.f11109b.h() : 0, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uA.f11109b.i() : 0, (15204351 & 131072) != 0 ? uA.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uA.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uA.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uA.f11109b.f() : null, (15204351 & 2097152) != 0 ? uA.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uA.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uA.f11109b.k() : null), interfaceC3540lR, 0, 0, 130552);
            androidx.compose.ui.e eVarM3 = o.m(r.h(aVar2, 0.0f, 1, null), c6562a.d(interfaceC3540lR, i12).a().a().d(), h.j(40), c6562a.d(interfaceC3540lR, i12).a().a().d(), 0.0f, 8, null);
            String strA2 = H0.f.a(P9.b.f18396K, interfaceC3540lR, 0);
            interfaceC3540lR.U(1888368454);
            boolean zL2 = interfaceC3540lR.l(nA) | (i13 == 4);
            Object objF3 = interfaceC3540lR.f();
            if (zL2 || objF3 == aVar.a()) {
                objF3 = new InterfaceC6824a() { // from class: V9.b
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.g(nA, vm);
                    }
                };
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            w9.r.b(eVarM3, (InterfaceC6824a) objF3, false, false, null, null, strA2, null, interfaceC3540lR, 0, 188);
            interfaceC3540l2 = interfaceC3540lR;
            androidx.compose.ui.e eVarK = o.k(r.h(aVar2, 0.0f, 1, null), c6562a.d(interfaceC3540l2, i12).a().a().d(), 0.0f, 2, null);
            String strA3 = H0.f.a(P9.b.f18394J, interfaceC3540l2, 0);
            interfaceC3540l2.U(1888380959);
            boolean zL3 = interfaceC3540l2.l(nA) | (i13 == 4);
            Object objF4 = interfaceC3540l2.f();
            if (zL3 || objF4 == aVar.a()) {
                vm = fVar;
                objF4 = new InterfaceC6824a() { // from class: V9.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return e.h(nA, vm);
                    }
                };
                interfaceC3540l2.K(objF4);
            } else {
                vm = fVar;
            }
            interfaceC3540l2.J();
            w9.o.c(eVarK, (InterfaceC6824a) objF4, false, false, null, strA3, interfaceC3540l2, 0, 28);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: V9.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.i(vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(N n10, f fVar) {
        AbstractC3063k.d(n10, null, null, new a(fVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(N n10, f fVar) {
        AbstractC3063k.d(n10, null, null, new b(fVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(N n10, f fVar) {
        AbstractC3063k.d(n10, null, null, new c(fVar, null), 3, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(f fVar, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        e(fVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
