package q;

import C0.D;
import E0.InterfaceC2629g;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.F0;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import T.t1;
import T.z1;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import com.google.ar.core.ImageMetadata;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import r.o0;
import r.p0;
import z.InterfaceC8687j;
import z.Y;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7385d {

    /* renamed from: q.d$a */
    static final class a extends AbstractC6494u implements mh.q {

        /* renamed from: q.d$a$a, reason: collision with other inner class name */
        static final class C2049a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f58212a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2049a(androidx.compose.ui.layout.t tVar) {
                super(1);
                this.f58212a = tVar;
            }

            public final void a(t.a aVar) {
                t.a.h(aVar, this.f58212a, 0, 0, 0.0f, 4, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        a(InterfaceC7400s interfaceC7400s) {
            super(3);
        }

        public final D a(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
            androidx.compose.ui.layout.t tVarT = b10.T(j10);
            if (!mVar.a1()) {
                return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new C2049a(tVarT), 4, null);
            }
            Y0.s.a(tVarT.I0(), tVarT.C0());
            throw null;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.layout.m) obj, (C0.B) obj2, ((Y0.b) obj3).r());
        }
    }

    /* renamed from: q.d$b */
    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f58213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f58214b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58215c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f58216d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f58217e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f58218f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f58219g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f58220h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f58221i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, InterfaceC6839p interfaceC6839p, InterfaceC7400s interfaceC7400s, mh.q qVar, int i10, int i11) {
            super(2);
            this.f58213a = o0Var;
            this.f58214b = interfaceC6835l;
            this.f58215c = eVar;
            this.f58216d = iVar;
            this.f58217e = kVar;
            this.f58218f = interfaceC6839p;
            this.f58219g = qVar;
            this.f58220h = i10;
            this.f58221i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7385d.a(this.f58213a, this.f58214b, this.f58215c, this.f58216d, this.f58217e, this.f58218f, null, this.f58219g, interfaceC3540l, L0.a(this.f58220h | 1), this.f58221i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: q.d$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f58222a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f58223b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f58224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1 f58225d;

        /* renamed from: q.d$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o0 f58226a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var) {
                super(0);
                this.f58226a = o0Var;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AbstractC7385d.j(this.f58226a));
            }
        }

        /* renamed from: q.d$c$b */
        static final class b implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ F0 f58227a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f58228b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1 f58229c;

            b(F0 f02, o0 o0Var, z1 z1Var) {
                this.f58227a = f02;
                this.f58228b = o0Var;
                this.f58229c = z1Var;
            }

            @Override // Li.InterfaceC3221h
            public /* bridge */ /* synthetic */ Object a(Object obj, InterfaceC5380e interfaceC5380e) {
                return b(((Boolean) obj).booleanValue(), interfaceC5380e);
            }

            public final Object b(boolean z10, InterfaceC5380e interfaceC5380e) {
                this.f58227a.setValue(kotlin.coroutines.jvm.internal.b.a(z10 ? ((Boolean) AbstractC7385d.b(this.f58229c).invoke(this.f58228b.i(), this.f58228b.p())).booleanValue() : false));
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var, z1 z1Var, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f58224c = o0Var;
            this.f58225d = z1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f58224c, this.f58225d, interfaceC5380e);
            cVar.f58223b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f58222a;
            if (i10 == 0) {
                Yg.v.b(obj);
                F0 f02 = (F0) this.f58223b;
                InterfaceC3220g interfaceC3220gO = o1.o(new a(this.f58224c));
                b bVar = new b(f02, this.f58224c, this.f58225d);
                this.f58222a = 1;
                if (interfaceC3220gO.b(bVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(F0 f02, InterfaceC5380e interfaceC5380e) {
            return ((c) create(f02, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: q.d$d, reason: collision with other inner class name */
    static final class C2050d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final C2050d f58230a = new C2050d();

        C2050d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: q.d$e */
    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f58231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58232b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f58233c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f58234d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f58235e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.q f58236f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f58237g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f58238h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, mh.q qVar, int i10, int i11) {
            super(2);
            this.f58231a = z10;
            this.f58232b = eVar;
            this.f58233c = iVar;
            this.f58234d = kVar;
            this.f58235e = str;
            this.f58236f = qVar;
            this.f58237g = i10;
            this.f58238h = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7385d.f(this.f58231a, this.f58232b, this.f58233c, this.f58234d, this.f58235e, this.f58236f, interfaceC3540l, L0.a(this.f58237g | 1), this.f58238h);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: q.d$f */
    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f58239a = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: q.d$g */
    static final class g extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y f58240a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f58241b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58242c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f58243d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f58244e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f58245f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f58246g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f58247h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f58248i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Y y10, boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, mh.q qVar, int i10, int i11) {
            super(2);
            this.f58240a = y10;
            this.f58241b = z10;
            this.f58242c = eVar;
            this.f58243d = iVar;
            this.f58244e = kVar;
            this.f58245f = str;
            this.f58246g = qVar;
            this.f58247h = i10;
            this.f58248i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7385d.e(this.f58240a, this.f58241b, this.f58242c, this.f58243d, this.f58244e, this.f58245f, this.f58246g, interfaceC3540l, L0.a(this.f58247h | 1), this.f58248i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: q.d$h */
    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final h f58249a = new h();

        h() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: q.d$i */
    static final class i extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8687j f58250a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f58251b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58252c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f58253d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f58254e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f58255f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.q f58256g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f58257h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f58258i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(InterfaceC8687j interfaceC8687j, boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, String str, mh.q qVar, int i10, int i11) {
            super(2);
            this.f58250a = interfaceC8687j;
            this.f58251b = z10;
            this.f58252c = eVar;
            this.f58253d = iVar;
            this.f58254e = kVar;
            this.f58255f = str;
            this.f58256g = qVar;
            this.f58257h = i10;
            this.f58258i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7385d.d(this.f58250a, this.f58251b, this.f58252c, this.f58253d, this.f58254e, this.f58255f, this.f58256g, interfaceC3540l, L0.a(this.f58257h | 1), this.f58258i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: q.d$j */
    static final class j extends AbstractC6494u implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f58259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f58260b;

        /* renamed from: q.d$j$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.t f58261a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.t tVar) {
                super(1);
                this.f58261a = tVar;
            }

            public final void a(t.a aVar) {
                t.a.h(aVar, this.f58261a, 0, 0, 0.0f, 4, null);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC6835l interfaceC6835l, o0 o0Var) {
            super(3);
            this.f58259a = interfaceC6835l;
            this.f58260b = o0Var;
        }

        public final D a(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
            androidx.compose.ui.layout.t tVarT = b10.T(j10);
            long jA = (!mVar.a1() || ((Boolean) this.f58259a.invoke(this.f58260b.p())).booleanValue()) ? Y0.s.a(tVarT.I0(), tVarT.C0()) : Y0.r.f24545b.a();
            return androidx.compose.ui.layout.m.x0(mVar, Y0.r.g(jA), Y0.r.f(jA), null, new a(tVarT), 4, null);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.layout.m) obj, (C0.B) obj2, ((Y0.b) obj3).r());
        }
    }

    /* renamed from: q.d$k */
    static final class k extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final k f58262a = new k();

        k() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC7392k enumC7392k, EnumC7392k enumC7392k2) {
            return Boolean.valueOf(enumC7392k == enumC7392k2 && enumC7392k2 == EnumC7392k.PostExit);
        }
    }

    /* renamed from: q.d$l */
    static final class l extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f58263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f58264b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58265c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.i f58266d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.k f58267e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ mh.q f58268f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f58269g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(o0 o0Var, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, mh.q qVar, int i10) {
            super(2);
            this.f58263a = o0Var;
            this.f58264b = interfaceC6835l;
            this.f58265c = eVar;
            this.f58266d = iVar;
            this.f58267e = kVar;
            this.f58268f = qVar;
            this.f58269g = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7385d.g(this.f58263a, this.f58264b, this.f58265c, this.f58266d, this.f58267e, this.f58268f, interfaceC3540l, L0.a(this.f58269g | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void a(o0 o0Var, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, InterfaceC6839p interfaceC6839p, InterfaceC7400s interfaceC7400s, mh.q qVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC7400s interfaceC7400s2;
        int i14;
        InterfaceC7400s interfaceC7400s3;
        InterfaceC3540l interfaceC3540l2;
        androidx.compose.ui.e eVarA;
        InterfaceC7400s interfaceC7400s4;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-891967166);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC3540lR.T(o0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6835l) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.T(eVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.T(iVar) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.T(kVar) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i11 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
        } else if ((i10 & ImageMetadata.EDGE_MODE) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6839p) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i15 = i11 & 64;
        int i16 = 1572864;
        if (i15 != 0) {
            i12 |= i16;
        } else if ((i10 & 1572864) == 0) {
            i16 = (i10 & 2097152) == 0 ? interfaceC3540lR.T(interfaceC7400s) : interfaceC3540lR.l(interfaceC7400s) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
            i12 |= i16;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? 8388608 : 4194304;
        }
        int i17 = i12;
        if ((4793491 & i17) == 4793490 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC7400s4 = interfaceC7400s;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            InterfaceC7400s interfaceC7400s5 = i15 != 0 ? null : interfaceC7400s;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-891967166, i17, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (((Boolean) interfaceC6835l.invoke(o0Var.p())).booleanValue() || ((Boolean) interfaceC6835l.invoke(o0Var.i())).booleanValue() || o0Var.u() || o0Var.j()) {
                interfaceC3540lR.U(1787977937);
                int i18 = i17 & 14;
                int i19 = i18 | 48;
                int i20 = i19 & 14;
                boolean z10 = true;
                boolean z11 = ((i20 ^ 6) > 4 && interfaceC3540lR.T(o0Var)) || (i19 & 6) == 4;
                Object objF = interfaceC3540lR.f();
                if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = o0Var.i();
                    interfaceC3540lR.K(objF);
                }
                if (o0Var.u()) {
                    objF = o0Var.i();
                }
                interfaceC3540lR.U(-466616829);
                if (AbstractC3546o.H()) {
                    i13 = i18;
                    interfaceC7400s2 = interfaceC7400s5;
                    AbstractC3546o.Q(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    i13 = i18;
                    interfaceC7400s2 = interfaceC7400s5;
                }
                int i21 = i17 & 126;
                EnumC7392k enumC7392kK = k(o0Var, interfaceC6835l, objF, interfaceC3540lR, i21);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540lR.J();
                Object objP = o0Var.p();
                interfaceC3540lR.U(-466616829);
                if (AbstractC3546o.H()) {
                    i14 = i17;
                    AbstractC3546o.Q(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    i14 = i17;
                }
                EnumC7392k enumC7392kK2 = k(o0Var, interfaceC6835l, objP, interfaceC3540lR, i21);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540lR.J();
                int i22 = i20 | 3072;
                int i23 = i13;
                InterfaceC7400s interfaceC7400s6 = interfaceC7400s2;
                int i24 = i14;
                o0 o0VarB = p0.b(o0Var, enumC7392kK, enumC7392kK2, "EnterExitTransition", interfaceC3540lR, i22);
                z1 z1VarN = o1.n(interfaceC6839p, interfaceC3540lR, (i24 >> 15) & 14);
                Object objInvoke = interfaceC6839p.invoke(o0VarB.i(), o0VarB.p());
                boolean zT = interfaceC3540lR.T(o0VarB) | interfaceC3540lR.T(z1VarN);
                Object objF2 = interfaceC3540lR.f();
                if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new c(o0VarB, z1VarN, null);
                    interfaceC3540lR.K(objF2);
                }
                z1 z1VarL = o1.l(objInvoke, (InterfaceC6839p) objF2, interfaceC3540lR, 0);
                if (j(o0VarB) && c(z1VarL)) {
                    interfaceC3540lR.U(1790256282);
                    interfaceC3540lR.J();
                    interfaceC7400s3 = interfaceC7400s6;
                    interfaceC3540l2 = interfaceC3540lR;
                } else {
                    interfaceC3540lR.U(1788869559);
                    boolean z12 = i23 == 4;
                    Object objF3 = interfaceC3540lR.f();
                    if (z12 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new C7387f(o0VarB);
                        interfaceC3540lR.K(objF3);
                    }
                    C7387f c7387f = (C7387f) objF3;
                    int i25 = i24 >> 6;
                    int i26 = (i25 & 112) | 24576 | (i25 & 896);
                    interfaceC7400s3 = interfaceC7400s6;
                    interfaceC3540l2 = interfaceC3540lR;
                    androidx.compose.ui.e eVarG = androidx.compose.animation.g.g(o0VarB, iVar, kVar, null, "Built-in", interfaceC3540l2, i26, 4);
                    if (interfaceC7400s3 != null) {
                        interfaceC3540l2.U(1789227361);
                        e.a aVar = androidx.compose.ui.e.f28771b0;
                        if ((i24 & 3670016) != 1048576 && ((i24 & 2097152) == 0 || !interfaceC3540l2.l(interfaceC7400s3))) {
                            z10 = false;
                        }
                        Object objF4 = interfaceC3540l2.f();
                        if (z10 || objF4 == InterfaceC3540l.f21100a.a()) {
                            objF4 = new a(interfaceC7400s3);
                            interfaceC3540l2.K(objF4);
                        }
                        eVarA = androidx.compose.ui.layout.g.a(aVar, (mh.q) objF4);
                        interfaceC3540l2.J();
                    } else {
                        interfaceC3540l2.U(1581766416);
                        interfaceC3540l2.J();
                        eVarA = androidx.compose.ui.e.f28771b0;
                    }
                    androidx.compose.ui.e eVarB0 = eVar.b0(eVarG.b0(eVarA));
                    Object objF5 = interfaceC3540l2.f();
                    if (objF5 == InterfaceC3540l.f21100a.a()) {
                        objF5 = new C7384c(c7387f);
                        interfaceC3540l2.K(objF5);
                    }
                    C7384c c7384c = (C7384c) objF5;
                    int iA = AbstractC3536j.a(interfaceC3540l2, 0);
                    InterfaceC3563x interfaceC3563xG = interfaceC3540l2.G();
                    androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l2, eVarB0);
                    InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
                    InterfaceC6824a interfaceC6824aA = aVar2.a();
                    if (interfaceC3540l2.x() == null) {
                        AbstractC3536j.c();
                    }
                    interfaceC3540l2.u();
                    if (interfaceC3540l2.o()) {
                        interfaceC3540l2.D(interfaceC6824aA);
                    } else {
                        interfaceC3540l2.I();
                    }
                    InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l2);
                    E1.c(interfaceC3540lA, c7384c, aVar2.e());
                    E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
                    InterfaceC6839p interfaceC6839pB = aVar2.b();
                    if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                        interfaceC3540lA.K(Integer.valueOf(iA));
                        interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                    }
                    E1.c(interfaceC3540lA, eVarE, aVar2.f());
                    qVar.s(c7387f, interfaceC3540l2, Integer.valueOf((i24 >> 18) & 112));
                    interfaceC3540l2.R();
                    interfaceC3540l2.J();
                }
                interfaceC3540l2.J();
            } else {
                interfaceC3540lR.U(1790262234);
                interfaceC3540lR.J();
                interfaceC7400s3 = interfaceC7400s5;
                interfaceC3540l2 = interfaceC3540lR;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC7400s4 = interfaceC7400s3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new b(o0Var, interfaceC6835l, eVar, iVar, kVar, interfaceC6839p, interfaceC7400s4, qVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6839p b(z1 z1Var) {
        return (InterfaceC6839p) z1Var.getValue();
    }

    private static final boolean c(z1 z1Var) {
        return ((Boolean) z1Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(z.InterfaceC8687j r22, boolean r23, androidx.compose.ui.e r24, androidx.compose.animation.i r25, androidx.compose.animation.k r26, java.lang.String r27, mh.q r28, T.InterfaceC3540l r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC7385d.d(z.j, boolean, androidx.compose.ui.e, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(z.Y r22, boolean r23, androidx.compose.ui.e r24, androidx.compose.animation.i r25, androidx.compose.animation.k r26, java.lang.String r27, mh.q r28, T.InterfaceC3540l r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC7385d.e(z.Y, boolean, androidx.compose.ui.e, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(boolean r22, androidx.compose.ui.e r23, androidx.compose.animation.i r24, androidx.compose.animation.k r25, java.lang.String r26, mh.q r27, T.InterfaceC3540l r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC7385d.f(boolean, androidx.compose.ui.e, androidx.compose.animation.i, androidx.compose.animation.k, java.lang.String, mh.q, T.l, int, int):void");
    }

    public static final void g(o0 o0Var, InterfaceC6835l interfaceC6835l, androidx.compose.ui.e eVar, androidx.compose.animation.i iVar, androidx.compose.animation.k kVar, mh.q qVar, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(429978603);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(interfaceC6835l) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(iVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(kVar) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i10 & ImageMetadata.EDGE_MODE) == 0) {
            i11 |= interfaceC3540lR.l(qVar) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) == 74898 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(429978603, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new j(interfaceC6835l, o0Var);
                interfaceC3540lR.K(objF);
            }
            a(o0Var, interfaceC6835l, androidx.compose.ui.layout.g.a(eVar, (mh.q) objF), iVar, kVar, k.f58262a, null, qVar, interfaceC3540lR, i12 | 196608 | i13 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new l(o0Var, interfaceC6835l, eVar, iVar, kVar, qVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(o0 o0Var) {
        Object objI = o0Var.i();
        EnumC7392k enumC7392k = EnumC7392k.PostExit;
        return objI == enumC7392k && o0Var.p() == enumC7392k;
    }

    private static final EnumC7392k k(o0 o0Var, InterfaceC6835l interfaceC6835l, Object obj, InterfaceC3540l interfaceC3540l, int i10) {
        EnumC7392k enumC7392k;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        interfaceC3540l.s(-902048200, o0Var);
        if (o0Var.u()) {
            interfaceC3540l.U(2101296683);
            interfaceC3540l.J();
            enumC7392k = ((Boolean) interfaceC6835l.invoke(obj)).booleanValue() ? EnumC7392k.Visible : ((Boolean) interfaceC6835l.invoke(o0Var.i())).booleanValue() ? EnumC7392k.PostExit : EnumC7392k.PreEnter;
        } else {
            interfaceC3540l.U(2101530516);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = t1.d(Boolean.FALSE, null, 2, null);
                interfaceC3540l.K(objF);
            }
            InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            if (((Boolean) interfaceC6835l.invoke(o0Var.i())).booleanValue()) {
                interfaceC3551q0.setValue(Boolean.TRUE);
            }
            enumC7392k = ((Boolean) interfaceC6835l.invoke(obj)).booleanValue() ? EnumC7392k.Visible : ((Boolean) interfaceC3551q0.getValue()).booleanValue() ? EnumC7392k.PostExit : EnumC7392k.PreEnter;
            interfaceC3540l.J();
        }
        interfaceC3540l.N();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return enumC7392k;
    }
}
