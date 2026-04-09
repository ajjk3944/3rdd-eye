package sf;

import F.AbstractC2718h;
import L0.C3174d;
import L0.U;
import L9.L;
import L9.z;
import N.a1;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.InterfaceC7386e;
import s9.b;
import sa.AbstractC7930a;
import sf.i;
import xe.InterfaceC8511f;
import z.Y;

/* loaded from: classes4.dex */
public abstract class i {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f61488a;

        /* renamed from: sf.i$a$a, reason: collision with other inner class name */
        static final class C2153a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC8511f.b f61489a;

            /* renamed from: sf.i$a$a$a, reason: collision with other inner class name */
            static final class C2154a implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                public static final C2154a f61490a = new C2154a();

                C2154a() {
                }

                public final long a(InterfaceC3540l interfaceC3540l, int i10) {
                    interfaceC3540l.U(-1236515263);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1236515263, i10, -1, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationUi.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeleportInvitationUi.kt:78)");
                    }
                    long jI = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                    interfaceC3540l.J();
                    return jI;
                }

                @Override // mh.InterfaceC6839p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
                }
            }

            C2153a(InterfaceC8511f.b bVar) {
                this.f61489a = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J c(InterfaceC8511f.b bVar) {
                bVar.a();
                return J.f24997a;
            }

            public final void b(Y UiToolbarSideContainer, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiToolbarSideContainer, "$this$UiToolbarSideContainer");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1584735674, i10, -1, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TeleportInvitationUi.kt:77)");
                }
                s9.b bVarF = N9.b.f16117a.t().f(new b.C2145b("neutral", C2154a.f61490a));
                interfaceC3540l.U(-659932982);
                boolean zT = interfaceC3540l.T(this.f61489a);
                final InterfaceC8511f.b bVar = this.f61489a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: sf.h
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return i.a.C2153a.c(bVar);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                z.c(bVarF, null, 0L, false, (InterfaceC6824a) objF, interfaceC3540l, 0, 14);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(InterfaceC8511f.b bVar) {
            this.f61488a = bVar;
        }

        public final void a(Y UiToolbar, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiToolbar, "$this$UiToolbar");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1405412205, i10, -1, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationUi.<anonymous>.<anonymous>.<anonymous> (TeleportInvitationUi.kt:76)");
            }
            L.b(null, b0.c.e(-1584735674, true, new C2153a(this.f61488a), interfaceC3540l, 54), interfaceC3540l, 48, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.d f61491a;

        b(s9.d dVar) {
            this.f61491a = dVar;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1853030863, i10, -1, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationUi.<anonymous>.<anonymous> (TeleportInvitationUi.kt:101)");
            }
            s9.d dVar = this.f61491a;
            if (dVar != null) {
                androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.ui.e eVarK = o.k(eVarH, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
                a1.c(AbstractC7930a.a(dVar, interfaceC3540l, 0), eVarK, c6562a.a(interfaceC3540l, i11).f().c(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l, i11).b().f(), interfaceC3540l, 0, 0, 130552);
            }
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

    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3174d f61492a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7952c f61493b;

        c(C3174d c3174d, AbstractC7952c abstractC7952c) {
            this.f61492a = c3174d;
            this.f61493b = abstractC7952c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(C3174d c3174d, AbstractC7952c abstractC7952c, int i10) {
            if (((C3174d.c) AbstractC3689v.s0(c3174d.j("report", i10, i10))) != null) {
                abstractC7952c.t0();
            }
            return J.f24997a;
        }

        public final void b(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1376996666, i10, -1, "com.ui.wifiman.ui.teleport.invitation.TeleportInvitationUi.<anonymous>.<anonymous> (TeleportInvitationUi.kt:118)");
            }
            final C3174d c3174d = this.f61492a;
            if (c3174d != null) {
                final AbstractC7952c abstractC7952c = this.f61493b;
                androidx.compose.ui.e eVarH = r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                C6562a c6562a = C6562a.f52458a;
                int i11 = C6562a.f52459b;
                androidx.compose.ui.e eVarK = o.k(eVarH, c6562a.d(interfaceC3540l, i11).a().a().d(), 0.0f, 2, null);
                U uF = c6562a.c(interfaceC3540l, i11).b().f();
                U uB = uF.b((15204351 & 1) != 0 ? uF.f11108a.g() : c6562a.a(interfaceC3540l, i11).f().a(), (15204351 & 2) != 0 ? uF.f11108a.k() : 0L, (15204351 & 4) != 0 ? uF.f11108a.n() : null, (15204351 & 8) != 0 ? uF.f11108a.l() : null, (15204351 & 16) != 0 ? uF.f11108a.m() : null, (15204351 & 32) != 0 ? uF.f11108a.i() : null, (15204351 & 64) != 0 ? uF.f11108a.j() : null, (15204351 & 128) != 0 ? uF.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uF.f11108a.e() : null, (15204351 & 512) != 0 ? uF.f11108a.u() : null, (15204351 & 1024) != 0 ? uF.f11108a.p() : null, (15204351 & 2048) != 0 ? uF.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uF.f11108a.s() : null, (15204351 & 8192) != 0 ? uF.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uF.f11108a.h() : null, (15204351 & 32768) != 0 ? uF.f11109b.h() : W0.j.f23523b.a(), (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uF.f11109b.i() : 0, (15204351 & 131072) != 0 ? uF.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uF.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uF.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uF.f11109b.f() : null, (15204351 & 2097152) != 0 ? uF.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uF.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uF.f11109b.k() : null);
                interfaceC3540l.U(1553818157);
                boolean zT = interfaceC3540l.T(c3174d) | interfaceC3540l.T(abstractC7952c);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6835l() { // from class: sf.j
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return i.c.c(c3174d, abstractC7952c, ((Integer) obj).intValue());
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                AbstractC2718h.a(c3174d, eVarK, uB, false, 0, 0, null, (InterfaceC6835l) objF, interfaceC3540l, 0, 120);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* synthetic */ class d extends C6490p implements InterfaceC6824a {
        d(Object obj) {
            super(0, obj, AbstractC7952c.class, "onConnectClicked", "onConnectClicked()V", 0);
        }

        public final void a() {
            ((AbstractC7952c) this.receiver).s0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(sf.AbstractC7952c r38, T.InterfaceC3540l r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.i.c(sf.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(InterfaceC8511f.b bVar) {
        bVar.a();
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(AbstractC7952c abstractC7952c, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(abstractC7952c, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
