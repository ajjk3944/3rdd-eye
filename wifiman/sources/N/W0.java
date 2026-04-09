package N;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class W0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f14133a = Y0.h.j(20);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14134b = Y0.h.j(10);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14135c = Y0.h.j(2);

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f14136a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14137b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14138c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f14139d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14140e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14141f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f14142g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f14143h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z.N f14144i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f14145j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, mh.q qVar, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, boolean z10, float f10, z.N n10, int i10) {
            super(2);
            this.f14136a = eVar;
            this.f14137b = interfaceC6839p;
            this.f14138c = interfaceC6839p2;
            this.f14139d = qVar;
            this.f14140e = interfaceC6839p3;
            this.f14141f = interfaceC6839p4;
            this.f14142g = z10;
            this.f14143h = f10;
            this.f14144i = n10;
            this.f14145j = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            W0.a(this.f14136a, this.f14137b, this.f14138c, this.f14139d, this.f14140e, this.f14141f, this.f14142g, this.f14143h, this.f14144i, interfaceC3540l, T.L0.a(this.f14145j | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, mh.q qVar, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, boolean z10, float f10, z.N n10, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2112507061);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.l(qVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p3) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6839p4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 1048576 : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC3540lR.T(n10) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2112507061, i11, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:488)");
            }
            boolean z11 = ((3670016 & i11) == 1048576) | ((29360128 & i11) == 8388608) | ((234881024 & i11) == 67108864);
            Object objF = interfaceC3540lR.f();
            if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new X0(z10, f10, n10);
                interfaceC3540lR.K(objF);
            }
            X0 x02 = (X0) objF;
            Y0.t tVar = (Y0.t) interfaceC3540lR.t(AbstractC3932k0.m());
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, x02, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            if (interfaceC6839p3 != null) {
                interfaceC3540lR.U(69542167);
                androidx.compose.ui.e eVarB0 = androidx.compose.ui.layout.f.b(androidx.compose.ui.e.f28771b0, "Leading").b0(V0.e());
                C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
                int iA2 = AbstractC3536j.a(interfaceC3540lR, 0);
                InterfaceC3563x interfaceC3563xG2 = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE2 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB0);
                InterfaceC6824a interfaceC6824aA2 = aVar.a();
                if (interfaceC3540lR.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540lR.u();
                if (interfaceC3540lR.o()) {
                    interfaceC3540lR.D(interfaceC6824aA2);
                } else {
                    interfaceC3540lR.I();
                }
                InterfaceC3540l interfaceC3540lA2 = E1.a(interfaceC3540lR);
                E1.c(interfaceC3540lA2, cH, aVar.e());
                E1.c(interfaceC3540lA2, interfaceC3563xG2, aVar.g());
                InterfaceC6839p interfaceC6839pB2 = aVar.b();
                if (interfaceC3540lA2.o() || !AbstractC6492s.d(interfaceC3540lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC3540lA2.K(Integer.valueOf(iA2));
                    interfaceC3540lA2.Q(Integer.valueOf(iA2), interfaceC6839pB2);
                }
                E1.c(interfaceC3540lA2, eVarE2, aVar.f());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
                interfaceC6839p3.invoke(interfaceC3540lR, Integer.valueOf((i11 >> 12) & 14));
                interfaceC3540lR.R();
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(69783378);
                interfaceC3540lR.J();
            }
            if (interfaceC6839p4 != null) {
                interfaceC3540lR.U(69825941);
                androidx.compose.ui.e eVarB02 = androidx.compose.ui.layout.f.b(androidx.compose.ui.e.f28771b0, "Trailing").b0(V0.e());
                C0.C cH2 = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
                int iA3 = AbstractC3536j.a(interfaceC3540lR, 0);
                InterfaceC3563x interfaceC3563xG3 = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE3 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB02);
                InterfaceC6824a interfaceC6824aA3 = aVar.a();
                if (interfaceC3540lR.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540lR.u();
                if (interfaceC3540lR.o()) {
                    interfaceC3540lR.D(interfaceC6824aA3);
                } else {
                    interfaceC3540lR.I();
                }
                InterfaceC3540l interfaceC3540lA3 = E1.a(interfaceC3540lR);
                E1.c(interfaceC3540lA3, cH2, aVar.e());
                E1.c(interfaceC3540lA3, interfaceC3563xG3, aVar.g());
                InterfaceC6839p interfaceC6839pB3 = aVar.b();
                if (interfaceC3540lA3.o() || !AbstractC6492s.d(interfaceC3540lA3.f(), Integer.valueOf(iA3))) {
                    interfaceC3540lA3.K(Integer.valueOf(iA3));
                    interfaceC3540lA3.Q(Integer.valueOf(iA3), interfaceC6839pB3);
                }
                E1.c(interfaceC3540lA3, eVarE3, aVar.f());
                androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f28130a;
                interfaceC6839p4.invoke(interfaceC3540lR, Integer.valueOf((i11 >> 15) & 14));
                interfaceC3540lR.R();
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(70069074);
                interfaceC3540lR.J();
            }
            float fG = androidx.compose.foundation.layout.o.g(n10, tVar);
            float f11 = androidx.compose.foundation.layout.o.f(n10, tVar);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            if (interfaceC6839p3 != null) {
                i12 = 0;
                fG = Y0.h.j(AbstractC7978m.c(Y0.h.j(fG - V0.d()), Y0.h.j(0)));
            } else {
                i12 = 0;
            }
            float f12 = fG;
            if (interfaceC6839p4 != null) {
                f11 = Y0.h.j(AbstractC7978m.c(Y0.h.j(f11 - V0.d()), Y0.h.j(i12)));
            }
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(aVar2, f12, 0.0f, f11, 0.0f, 10, null);
            if (qVar != null) {
                interfaceC3540lR.U(70826807);
                qVar.s(androidx.compose.ui.layout.f.b(aVar2, "Hint").b0(eVarM), interfaceC3540lR, Integer.valueOf((i11 >> 6) & 112));
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(70914258);
                interfaceC3540lR.J();
            }
            if (interfaceC6839p2 != null) {
                interfaceC3540lR.U(70948761);
                androidx.compose.ui.e eVarB03 = androidx.compose.ui.layout.f.b(aVar2, "Label").b0(eVarM);
                C0.C cH3 = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
                int iA4 = AbstractC3536j.a(interfaceC3540lR, 0);
                InterfaceC3563x interfaceC3563xG4 = interfaceC3540lR.G();
                androidx.compose.ui.e eVarE4 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB03);
                InterfaceC6824a interfaceC6824aA4 = aVar.a();
                if (interfaceC3540lR.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540lR.u();
                if (interfaceC3540lR.o()) {
                    interfaceC3540lR.D(interfaceC6824aA4);
                } else {
                    interfaceC3540lR.I();
                }
                InterfaceC3540l interfaceC3540lA4 = E1.a(interfaceC3540lR);
                E1.c(interfaceC3540lA4, cH3, aVar.e());
                E1.c(interfaceC3540lA4, interfaceC3563xG4, aVar.g());
                InterfaceC6839p interfaceC6839pB4 = aVar.b();
                if (interfaceC3540lA4.o() || !AbstractC6492s.d(interfaceC3540lA4.f(), Integer.valueOf(iA4))) {
                    interfaceC3540lA4.K(Integer.valueOf(iA4));
                    interfaceC3540lA4.Q(Integer.valueOf(iA4), interfaceC6839pB4);
                }
                E1.c(interfaceC3540lA4, eVarE4, aVar.f());
                androidx.compose.foundation.layout.f fVar3 = androidx.compose.foundation.layout.f.f28130a;
                interfaceC6839p2.invoke(interfaceC3540lR, Integer.valueOf((i11 >> 6) & 14));
                interfaceC3540lR.R();
                interfaceC3540lR.J();
            } else {
                interfaceC3540lR.U(71034290);
                interfaceC3540lR.J();
            }
            androidx.compose.ui.e eVarB04 = androidx.compose.ui.layout.f.b(aVar2, "TextField").b0(eVarM);
            C0.C cH4 = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), true);
            int iA5 = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG5 = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE5 = androidx.compose.ui.c.e(interfaceC3540lR, eVarB04);
            InterfaceC6824a interfaceC6824aA5 = aVar.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA5);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA5 = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA5, cH4, aVar.e());
            E1.c(interfaceC3540lA5, interfaceC3563xG5, aVar.g());
            InterfaceC6839p interfaceC6839pB5 = aVar.b();
            if (interfaceC3540lA5.o() || !AbstractC6492s.d(interfaceC3540lA5.f(), Integer.valueOf(iA5))) {
                interfaceC3540lA5.K(Integer.valueOf(iA5));
                interfaceC3540lA5.Q(Integer.valueOf(iA5), interfaceC6839pB5);
            }
            E1.c(interfaceC3540lA5, eVarE5, aVar.f());
            androidx.compose.foundation.layout.f fVar4 = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540lR, Integer.valueOf((i11 >> 3) & 14));
            interfaceC3540lR.R();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new a(eVar, interfaceC6839p, interfaceC6839p2, qVar, interfaceC6839p3, interfaceC6839p4, z10, f10, n10, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10, boolean z10, int i11, int i12, int i13, int i14, long j10, float f10, z.N n10) {
        float f11 = f14135c * f10;
        float fD = n10.d() * f10;
        float fC = n10.c() * f10;
        int iMax = Math.max(i10, i14);
        return Math.max(AbstractC7137b.e(z10 ? i11 + f11 + iMax + fC : fD + iMax + fC), Math.max(Math.max(i12, i13), Y0.b.m(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, long j10) {
        return Math.max(i10 + Math.max(i12, Math.max(i13, i14)) + i11, Y0.b.n(j10));
    }

    public static final float i() {
        return f14135c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(t.a aVar, int i10, int i11, androidx.compose.ui.layout.t tVar, androidx.compose.ui.layout.t tVar2, androidx.compose.ui.layout.t tVar3, androidx.compose.ui.layout.t tVar4, androidx.compose.ui.layout.t tVar5, boolean z10, int i12, int i13, float f10, float f11) {
        if (tVar4 != null) {
            t.a.l(aVar, tVar4, 0, f0.c.f46573a.i().a(tVar4.C0(), i11), 0.0f, 4, null);
        }
        if (tVar5 != null) {
            t.a.l(aVar, tVar5, i10 - tVar5.I0(), f0.c.f46573a.i().a(tVar5.C0(), i11), 0.0f, 4, null);
        }
        if (tVar2 != null) {
            t.a.l(aVar, tVar2, V0.j(tVar4), (z10 ? f0.c.f46573a.i().a(tVar2.C0(), i11) : AbstractC7137b.e(V0.g() * f11)) - AbstractC7137b.e((r0 - i12) * f10), 0.0f, 4, null);
        }
        t.a.l(aVar, tVar, V0.j(tVar4), i13, 0.0f, 4, null);
        if (tVar3 != null) {
            t.a.l(aVar, tVar3, V0.j(tVar4), i13, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(t.a aVar, int i10, int i11, androidx.compose.ui.layout.t tVar, androidx.compose.ui.layout.t tVar2, androidx.compose.ui.layout.t tVar3, androidx.compose.ui.layout.t tVar4, boolean z10, float f10, z.N n10) {
        int iE = AbstractC7137b.e(n10.d() * f10);
        if (tVar3 != null) {
            t.a.l(aVar, tVar3, 0, f0.c.f46573a.i().a(tVar3.C0(), i11), 0.0f, 4, null);
        }
        if (tVar4 != null) {
            t.a.l(aVar, tVar4, i10 - tVar4.I0(), f0.c.f46573a.i().a(tVar4.C0(), i11), 0.0f, 4, null);
        }
        t.a.l(aVar, tVar, V0.j(tVar3), z10 ? f0.c.f46573a.i().a(tVar.C0(), i11) : iE, 0.0f, 4, null);
        if (tVar2 != null) {
            if (z10) {
                iE = f0.c.f46573a.i().a(tVar2.C0(), i11);
            }
            t.a.l(aVar, tVar2, V0.j(tVar3), iE, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : i10 - i11;
    }
}
