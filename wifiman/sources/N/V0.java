package N;

import C0.InterfaceC2534n;
import C0.InterfaceC2540u;
import E0.InterfaceC2629g;
import L0.C3174d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.t1;
import b0.InterfaceC4038a;
import com.google.ar.core.ImageMetadata;
import j0.AbstractC6230a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6538n;
import l0.C6537m;
import m0.C6733v0;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import y.AbstractC8551f;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public abstract class V0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f14043a = Y0.c.a(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final float f14044b = Y0.h.j(16);

    /* renamed from: c, reason: collision with root package name */
    private static final float f14045c = Y0.h.j(12);

    /* renamed from: d, reason: collision with root package name */
    private static final androidx.compose.ui.e f14046d;

    static final class a extends AbstractC6494u implements mh.t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14047a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14048b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f14049c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ S0 f14050d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14051e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f14052f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14053g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14054h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14055i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ i1 f14056j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Z0 f14057k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14058l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14059m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z.N f14060n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f14061o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14062p;

        /* renamed from: N.V0$a$a, reason: collision with other inner class name */
        static final class C0548a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f14063a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f14064b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0548a(float f10, InterfaceC3551q0 interfaceC3551q0) {
                super(1);
                this.f14063a = f10;
                this.f14064b = interfaceC3551q0;
            }

            public final void a(long j10) {
                float fI = C6537m.i(j10) * this.f14063a;
                float fG = C6537m.g(j10) * this.f14063a;
                if (C6537m.i(((C6537m) this.f14064b.getValue()).m()) == fI && C6537m.g(((C6537m) this.f14064b.getValue()).m()) == fG) {
                    return;
                }
                this.f14064b.setValue(C6537m.c(AbstractC6538n.a(fI, fG)));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6537m) obj).m());
                return Yg.J.f24997a;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14065a;

            static {
                int[] iArr = new int[Z0.values().length];
                try {
                    iArr[Z0.Filled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Z0.Outlined.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14065a = iArr;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f14066a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f14067b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14068c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f14069d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f14070e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(float f10, long j10, InterfaceC6839p interfaceC6839p, boolean z10, long j11) {
                super(2);
                this.f14066a = f10;
                this.f14067b = j10;
                this.f14068c = interfaceC6839p;
                this.f14069d = z10;
                this.f14070e = j11;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1865025495, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:124)");
                }
                C3319f0 c3319f0 = C3319f0.f14419a;
                L0.U uC = L0.V.c(c3319f0.c(interfaceC3540l, 6).e(), c3319f0.c(interfaceC3540l, 6).d(), this.f14066a);
                V0.b(this.f14067b, this.f14069d ? uC.b((15204351 & 1) != 0 ? uC.f11108a.g() : this.f14070e, (15204351 & 2) != 0 ? uC.f11108a.k() : 0L, (15204351 & 4) != 0 ? uC.f11108a.n() : null, (15204351 & 8) != 0 ? uC.f11108a.l() : null, (15204351 & 16) != 0 ? uC.f11108a.m() : null, (15204351 & 32) != 0 ? uC.f11108a.i() : null, (15204351 & 64) != 0 ? uC.f11108a.j() : null, (15204351 & 128) != 0 ? uC.f11108a.o() : 0L, (15204351 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? uC.f11108a.e() : null, (15204351 & 512) != 0 ? uC.f11108a.u() : null, (15204351 & 1024) != 0 ? uC.f11108a.p() : null, (15204351 & 2048) != 0 ? uC.f11108a.d() : 0L, (15204351 & 4096) != 0 ? uC.f11108a.s() : null, (15204351 & 8192) != 0 ? uC.f11108a.r() : null, (15204351 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? uC.f11108a.h() : null, (15204351 & 32768) != 0 ? uC.f11109b.h() : 0, (15204351 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? uC.f11109b.i() : 0, (15204351 & 131072) != 0 ? uC.f11109b.e() : 0L, (15204351 & 262144) != 0 ? uC.f11109b.j() : null, (15204351 & ImageMetadata.LENS_APERTURE) != 0 ? uC.f11110c : null, (15204351 & ImageMetadata.SHADING_MODE) != 0 ? uC.f11109b.f() : null, (15204351 & 2097152) != 0 ? uC.f11109b.d() : 0, (15204351 & 4194304) != 0 ? uC.f11109b.c() : 0, (15204351 & 8388608) != 0 ? uC.f11109b.k() : null) : uC, null, this.f14068c, interfaceC3540l, 384, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f14071a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14072b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(long j10, InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f14071a = j10;
                this.f14072b = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1165144581, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:153)");
                }
                V0.b(this.f14071a, null, null, this.f14072b, interfaceC3540l, 0, 6);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class e extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f14073a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S0 f14074b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f14075c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14076d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(float f10, S0 s02, boolean z10, InterfaceC6839p interfaceC6839p) {
                super(3);
                this.f14073a = f10;
                this.f14074b = s02;
                this.f14075c = z10;
                this.f14076d = interfaceC6839p;
            }

            public final void a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(eVar) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-413527723, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:140)");
                }
                androidx.compose.ui.e eVarA = AbstractC6230a.a(eVar, this.f14073a);
                S0 s02 = this.f14074b;
                boolean z10 = this.f14075c;
                InterfaceC6839p interfaceC6839p = this.f14076d;
                C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
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
                V0.b(((C6733v0) s02.b(z10, interfaceC3540l, 0).getValue()).u(), C3319f0.f14419a.c(interfaceC3540l, 6).e(), null, interfaceC6839p, interfaceC3540l, 0, 4);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class f extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f14077a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14078b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(long j10, InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f14077a = j10;
                this.f14078b = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1694126319, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:160)");
                }
                V0.b(this.f14077a, null, null, this.f14078b, interfaceC3540l, 0, 6);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        static final class g extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f14079a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z.N f14080b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14081c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(InterfaceC3551q0 interfaceC3551q0, z.N n10, InterfaceC6839p interfaceC6839p) {
                super(2);
                this.f14079a = interfaceC3551q0;
                this.f14080b = n10;
                this.f14081c = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1212965554, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:185)");
                }
                androidx.compose.ui.e eVarJ = AbstractC3341q0.j(androidx.compose.ui.layout.f.b(androidx.compose.ui.e.f28771b0, "border"), ((C6537m) this.f14079a.getValue()).m(), this.f14080b);
                InterfaceC6839p interfaceC6839p = this.f14081c;
                C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), true);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarJ);
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
                if (interfaceC6839p == null) {
                    interfaceC3540l.U(719996434);
                } else {
                    interfaceC3540l.U(-392416305);
                    interfaceC6839p.invoke(interfaceC3540l, 0);
                }
                interfaceC3540l.J();
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, String str, S0 s02, boolean z10, boolean z11, InterfaceC8556k interfaceC8556k, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, i1 i1Var, Z0 z02, InterfaceC6839p interfaceC6839p5, boolean z12, z.N n10, boolean z13, InterfaceC6839p interfaceC6839p6) {
            super(6);
            this.f14047a = interfaceC6839p;
            this.f14048b = interfaceC6839p2;
            this.f14049c = str;
            this.f14050d = s02;
            this.f14051e = z10;
            this.f14052f = z11;
            this.f14053g = interfaceC8556k;
            this.f14054h = interfaceC6839p3;
            this.f14055i = interfaceC6839p4;
            this.f14056j = i1Var;
            this.f14057k = z02;
            this.f14058l = interfaceC6839p5;
            this.f14059m = z12;
            this.f14060n = n10;
            this.f14061o = z13;
            this.f14062p = interfaceC6839p6;
        }

        @Override // mh.t
        public /* bridge */ /* synthetic */ Object F(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            a(((Number) obj).floatValue(), ((C6733v0) obj2).u(), ((C6733v0) obj3).u(), ((Number) obj4).floatValue(), (InterfaceC3540l) obj5, ((Number) obj6).intValue());
            return Yg.J.f24997a;
        }

        public final void a(float f10, long j10, long j11, float f11, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            boolean z10;
            InterfaceC4038a interfaceC4038a;
            InterfaceC4038a interfaceC4038a2;
            InterfaceC4038a interfaceC4038a3;
            InterfaceC4038a interfaceC4038a4;
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.g(f10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.j(j10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= interfaceC3540l.j(j11) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= interfaceC3540l.g(f11) ? 2048 : 1024;
            }
            int i12 = i11;
            if ((i12 & 9363) == 9362 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(225557475, i12, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:122)");
            }
            InterfaceC6839p interfaceC6839p = this.f14047a;
            if (interfaceC6839p == null) {
                interfaceC3540l.U(-1572365903);
                interfaceC3540l.J();
                z10 = true;
                interfaceC4038a = null;
            } else {
                interfaceC3540l.U(-1572365902);
                z10 = true;
                InterfaceC4038a interfaceC4038aE = b0.c.e(-1865025495, true, new c(f10, j11, interfaceC6839p, this.f14061o, j10), interfaceC3540l, 54);
                interfaceC3540l.J();
                interfaceC4038a = interfaceC4038aE;
            }
            if (this.f14048b == null || this.f14049c.length() != 0 || f11 <= 0.0f) {
                interfaceC3540l.U(-1571160716);
                interfaceC3540l.J();
                interfaceC4038a2 = null;
            } else {
                interfaceC3540l.U(-1571586748);
                InterfaceC4038a interfaceC4038aE2 = b0.c.e(-413527723, z10, new e(f11, this.f14050d, this.f14051e, this.f14048b), interfaceC3540l, 54);
                interfaceC3540l.J();
                interfaceC4038a2 = interfaceC4038aE2;
            }
            long jU = ((C6733v0) this.f14050d.h(this.f14051e, this.f14052f, this.f14053g, interfaceC3540l, 0).getValue()).u();
            InterfaceC6839p interfaceC6839p2 = this.f14054h;
            if (interfaceC6839p2 == null) {
                interfaceC3540l.U(-1570983241);
                interfaceC3540l.J();
                interfaceC4038a3 = null;
            } else {
                interfaceC3540l.U(-1570983240);
                InterfaceC4038a interfaceC4038aE3 = b0.c.e(-1165144581, z10, new d(jU, interfaceC6839p2), interfaceC3540l, 54);
                interfaceC3540l.J();
                interfaceC4038a3 = interfaceC4038aE3;
            }
            long jU2 = ((C6733v0) this.f14050d.c(this.f14051e, this.f14052f, this.f14053g, interfaceC3540l, 0).getValue()).u();
            InterfaceC6839p interfaceC6839p3 = this.f14055i;
            if (interfaceC6839p3 == null) {
                interfaceC3540l.U(-1570681642);
                interfaceC3540l.J();
                interfaceC4038a4 = null;
            } else {
                interfaceC3540l.U(-1570681641);
                InterfaceC4038a interfaceC4038aE4 = b0.c.e(1694126319, z10, new f(jU2, interfaceC6839p3), interfaceC3540l, 54);
                interfaceC3540l.J();
                interfaceC4038a4 = interfaceC4038aE4;
            }
            androidx.compose.ui.e eVarC = androidx.compose.foundation.b.c(androidx.compose.ui.e.f28771b0, ((C6733v0) this.f14050d.a(this.f14051e, interfaceC3540l, 0).getValue()).u(), this.f14056j);
            int i13 = b.f14065a[this.f14057k.ordinal()];
            if (i13 == z10) {
                interfaceC3540l.U(-1570370153);
                W0.a(eVarC, this.f14058l, interfaceC4038a, interfaceC4038a2, interfaceC4038a3, interfaceC4038a4, this.f14059m, f10, this.f14060n, interfaceC3540l, (i12 << 21) & 29360128);
                interfaceC3540l.J();
            } else if (i13 != 2) {
                interfaceC3540l.U(-1568365383);
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-1569791817);
                Object objF = interfaceC3540l.f();
                InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                if (objF == aVar.a()) {
                    objF = t1.d(C6537m.c(C6537m.f52356b.b()), null, 2, null);
                    interfaceC3540l.K(objF);
                }
                InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
                InterfaceC4038a interfaceC4038aE5 = b0.c.e(-1212965554, z10, new g(interfaceC3551q0, this.f14060n, this.f14062p), interfaceC3540l, 54);
                InterfaceC6839p interfaceC6839p4 = this.f14058l;
                boolean z11 = this.f14059m;
                boolean z12 = (i12 & 14) == 4;
                Object objF2 = interfaceC3540l.f();
                if (z12 || objF2 == aVar.a()) {
                    objF2 = new C0548a(f10, interfaceC3551q0);
                    interfaceC3540l.K(objF2);
                }
                AbstractC3341q0.b(eVarC, interfaceC6839p4, interfaceC4038a2, interfaceC4038a, interfaceC4038a3, interfaceC4038a4, z11, f10, (InterfaceC6835l) objF2, interfaceC4038aE5, this.f14060n, interfaceC3540l, ((i12 << 21) & 29360128) | 805306368, 0);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z0 f14082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14084c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ R0.c0 f14085d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14086e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14087f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14088g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14089h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f14090i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f14091j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f14092k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14093l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z.N f14094m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ i1 f14095n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ S0 f14096o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14097p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f14098q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f14099r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Z0 z02, String str, InterfaceC6839p interfaceC6839p, R0.c0 c0Var, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, InterfaceC6839p interfaceC6839p5, boolean z10, boolean z11, boolean z12, InterfaceC8556k interfaceC8556k, z.N n10, i1 i1Var, S0 s02, InterfaceC6839p interfaceC6839p6, int i10, int i11) {
            super(2);
            this.f14082a = z02;
            this.f14083b = str;
            this.f14084c = interfaceC6839p;
            this.f14085d = c0Var;
            this.f14086e = interfaceC6839p2;
            this.f14087f = interfaceC6839p3;
            this.f14088g = interfaceC6839p4;
            this.f14089h = interfaceC6839p5;
            this.f14090i = z10;
            this.f14091j = z11;
            this.f14092k = z12;
            this.f14093l = interfaceC8556k;
            this.f14094m = n10;
            this.f14095n = i1Var;
            this.f14096o = s02;
            this.f14097p = interfaceC6839p6;
            this.f14098q = i10;
            this.f14099r = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            V0.a(this.f14082a, this.f14083b, this.f14084c, this.f14085d, this.f14086e, this.f14087f, this.f14088g, this.f14089h, this.f14090i, this.f14091j, this.f14092k, this.f14093l, this.f14094m, this.f14095n, this.f14096o, this.f14097p, interfaceC3540l, T.L0.a(this.f14098q | 1), T.L0.a(this.f14099r));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S0 f14100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f14101b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14102c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f14103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(S0 s02, boolean z10, boolean z11, InterfaceC8556k interfaceC8556k) {
            super(3);
            this.f14100a = s02;
            this.f14101b = z10;
            this.f14102c = z11;
            this.f14103d = interfaceC8556k;
        }

        public final long a(EnumC3311b0 enumC3311b0, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-1272940975);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1272940975, i10, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:94)");
            }
            long jU = ((C6733v0) this.f14100a.d(this.f14101b, enumC3311b0 == EnumC3311b0.UnfocusedEmpty ? false : this.f14102c, this.f14103d, interfaceC3540l, 0).getValue()).u();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return jU;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return C6733v0.g(a((EnumC3311b0) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue()));
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14104a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L0.U f14105b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Float f14106c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14107d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14108e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14109f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, L0.U u10, Float f10, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f14104a = j10;
            this.f14105b = u10;
            this.f14106c = f10;
            this.f14107d = interfaceC6839p;
            this.f14108e = i10;
            this.f14109f = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            V0.b(this.f14104a, this.f14105b, this.f14106c, this.f14107d, interfaceC3540l, T.L0.a(this.f14108e | 1), this.f14109f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f14110a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Float f14111b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f14112c;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Float f14113a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f14114b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14115c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Float f10, InterfaceC6839p interfaceC6839p, long j10) {
                super(2);
                this.f14113a = f10;
                this.f14114b = interfaceC6839p;
                this.f14115c = j10;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1132188434, i10, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:232)");
                }
                if (this.f14113a != null) {
                    interfaceC3540l.U(-1178229056);
                    AbstractC3561w.a(AbstractC3343s.a().d(this.f14113a), this.f14114b, interfaceC3540l, T.I0.f20869i);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(-1178050310);
                    AbstractC3561w.a(AbstractC3343s.a().d(Float.valueOf(C6733v0.n(this.f14115c))), this.f14114b, interfaceC3540l, T.I0.f20869i);
                    interfaceC3540l.J();
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return Yg.J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Float f10, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f14110a = j10;
            this.f14111b = f10;
            this.f14112c = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(494684590, i10, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:231)");
            }
            AbstractC3561w.a(AbstractC3345t.a().d(C6733v0.g(this.f14110a)), b0.c.e(-1132188434, true, new a(this.f14111b, this.f14112c, this.f14110a), interfaceC3540l, 54), interfaceC3540l, T.I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f14116a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f14116a = str;
        }

        public final void a(J0.w wVar) {
            J0.t.o(wVar, this.f14116a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    static {
        float f10 = 48;
        f14046d = androidx.compose.foundation.layout.r.a(androidx.compose.ui.e.f28771b0, Y0.h.j(f10), Y0.h.j(f10));
    }

    public static final void a(Z0 z02, String str, InterfaceC6839p interfaceC6839p, R0.c0 c0Var, InterfaceC6839p interfaceC6839p2, InterfaceC6839p interfaceC6839p3, InterfaceC6839p interfaceC6839p4, InterfaceC6839p interfaceC6839p5, boolean z10, boolean z11, boolean z12, InterfaceC8556k interfaceC8556k, z.N n10, i1 i1Var, S0 s02, InterfaceC6839p interfaceC6839p6, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(341783750);
        if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(z02) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.T(c0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p2) ? 16384 : 8192;
        }
        int i14 = i10 & ImageMetadata.EDGE_MODE;
        int i15 = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        if (i14 == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p3) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p5) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= interfaceC3540lR.c(z11) ? 536870912 : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (interfaceC3540lR.c(z12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= interfaceC3540lR.T(interfaceC8556k) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= interfaceC3540lR.T(n10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= interfaceC3540lR.T(i1Var) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= interfaceC3540lR.T(s02) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            if (interfaceC3540lR.l(interfaceC6839p6)) {
                i15 = 131072;
            }
            i13 |= i15;
        }
        int i16 = i13;
        if ((i12 & 306783379) == 306783378 && (74899 & i16) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(341783750, i12, i16, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:81)");
            }
            boolean z13 = ((i12 & 7168) == 2048) | ((i12 & 112) == 32);
            Object objF = interfaceC3540lR.f();
            if (z13 || objF == InterfaceC3540l.f21100a.a()) {
                objF = c0Var.a(new C3174d(str, null, null, 6, null));
                interfaceC3540lR.K(objF);
            }
            String strK = ((R0.a0) objF).b().k();
            EnumC3311b0 enumC3311b0 = ((Boolean) AbstractC8551f.a(interfaceC8556k, interfaceC3540lR, (i16 >> 3) & 14).getValue()).booleanValue() ? EnumC3311b0.Focused : strK.length() == 0 ? EnumC3311b0.UnfocusedEmpty : EnumC3311b0.UnfocusedNotEmpty;
            c cVar = new c(s02, z11, z12, interfaceC8556k);
            C3319f0 c3319f0 = C3319f0.f14419a;
            c1 c1VarC = c3319f0.c(interfaceC3540lR, 6);
            L0.U uE = c1VarC.e();
            L0.U uD = c1VarC.d();
            long jH = uE.h();
            C6733v0.a aVar = C6733v0.f52951b;
            boolean z14 = (C6733v0.m(jH, aVar.e()) && !C6733v0.m(uD.h(), aVar.e())) || (!C6733v0.m(uE.h(), aVar.e()) && C6733v0.m(uD.h(), aVar.e()));
            Y0 y02 = Y0.f14199a;
            interfaceC3540lR.U(1578865765);
            long jH2 = c3319f0.c(interfaceC3540lR, 6).d().h();
            if (z14) {
                interfaceC3540lR.U(-1572851052);
                if (jH2 == 16) {
                    jH2 = ((C6733v0) cVar.s(enumC3311b0, interfaceC3540lR, 0)).u();
                }
            } else {
                interfaceC3540lR.U(780548205);
            }
            interfaceC3540lR.J();
            long j10 = jH2;
            interfaceC3540lR.J();
            interfaceC3540lR.U(1578871879);
            long jH3 = c3319f0.c(interfaceC3540lR, 6).e().h();
            if (z14) {
                interfaceC3540lR.U(-1572659596);
                if (jH3 == 16) {
                    jH3 = ((C6733v0) cVar.s(enumC3311b0, interfaceC3540lR, 0)).u();
                }
            } else {
                interfaceC3540lR.U(780554381);
            }
            interfaceC3540lR.J();
            long j11 = jH3;
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            y02.a(enumC3311b0, j10, j11, cVar, interfaceC6839p2 != null, b0.c.e(225557475, true, new a(interfaceC6839p2, interfaceC6839p3, strK, s02, z11, z12, interfaceC8556k, interfaceC6839p4, interfaceC6839p5, i1Var, z02, interfaceC6839p, z10, n10, z14, interfaceC6839p6), interfaceC3540l2, 54), interfaceC3540l2, 1769472);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        T.X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new b(z02, str, interfaceC6839p, c0Var, interfaceC6839p2, interfaceC6839p3, interfaceC6839p4, interfaceC6839p5, z10, z11, z12, interfaceC8556k, n10, i1Var, s02, interfaceC6839p6, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(long r13, L0.U r15, java.lang.Float r16, mh.InterfaceC6839p r17, T.InterfaceC3540l r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N.V0.b(long, L0.U, java.lang.Float, mh.p, T.l, int, int):void");
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, String str) {
        return z10 ? J0.m.c(eVar, false, new f(str), 1, null) : eVar;
    }

    public static final float d() {
        return f14045c;
    }

    public static final androidx.compose.ui.e e() {
        return f14046d;
    }

    public static final Object f(InterfaceC2534n interfaceC2534n) {
        Object objB = interfaceC2534n.b();
        InterfaceC2540u interfaceC2540u = objB instanceof InterfaceC2540u ? (InterfaceC2540u) objB : null;
        if (interfaceC2540u != null) {
            return interfaceC2540u.g0();
        }
        return null;
    }

    public static final float g() {
        return f14044b;
    }

    public static final long h() {
        return f14043a;
    }

    public static final int i(androidx.compose.ui.layout.t tVar) {
        if (tVar != null) {
            return tVar.C0();
        }
        return 0;
    }

    public static final int j(androidx.compose.ui.layout.t tVar) {
        if (tVar != null) {
            return tVar.I0();
        }
        return 0;
    }
}
