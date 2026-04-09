package O9;

import C0.InterfaceC2528h;
import O9.d;
import S6.k;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import V6.f;
import V6.v;
import Yg.J;
import androidx.compose.ui.e;
import b0.InterfaceC4038a;
import com.bumptech.glide.i;
import com.bumptech.glide.request.f;
import com.google.ar.core.ImageMetadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.AbstractC6735w0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.r;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import r0.AbstractC7554d;
import s9.InterfaceC7929a;
import ta.AbstractC8049c;
import ta.InterfaceC8050d;
import ta.g;
import z.InterfaceC8681d;

/* loaded from: classes3.dex */
public final class d implements InterfaceC8050d {

    /* renamed from: a, reason: collision with root package name */
    private final i f17663a;

    /* renamed from: b, reason: collision with root package name */
    private final f f17664b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6824a f17665c;

    /* renamed from: d, reason: collision with root package name */
    private final g f17666d;

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0.c f17667a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17668b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2528h f17669c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6735w0 f17670d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f17671e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f17672f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC7929a.b f17673g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC7929a.b f17674h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f17675i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f17676j;

        /* renamed from: O9.d$a$a, reason: collision with other inner class name */
        static final class C0609a implements r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC7929a.b f17677a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6735w0 f17678b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f0.c f17679c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2528h f17680d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17681e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f17682f;

            C0609a(InterfaceC7929a.b bVar, AbstractC6735w0 abstractC6735w0, f0.c cVar, InterfaceC2528h interfaceC2528h, String str, float f10) {
                this.f17677a = bVar;
                this.f17678b = abstractC6735w0;
                this.f17679c = cVar;
                this.f17680d = interfaceC2528h;
                this.f17681e = str;
                this.f17682f = f10;
            }

            public final void a(InterfaceC8681d let, f.b unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(let, "$this$let");
                AbstractC6492s.i(unused$var$, "$unused$var$");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(let) ? 4 : 2;
                }
                if ((i10 & 131) == 130 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-472502921, i10, -1, "com.ui.core.ui.img.UiGlideImageLoader.GlideImage.<anonymous>.<anonymous>.<anonymous> (UiGlideImageLoader.kt:112)");
                }
                AbstractC7554d abstractC7554dI = AbstractC8049c.i(this.f17677a, interfaceC3540l, 0);
                e eVarA = let.a(e.f28771b0);
                AbstractC6735w0 abstractC6735w0H = this.f17678b;
                interfaceC3540l.U(699336464);
                if (abstractC6735w0H == null) {
                    abstractC6735w0H = AbstractC8049c.h(this.f17677a, interfaceC3540l, 0);
                }
                interfaceC3540l.J();
                S6.g.b(abstractC7554dI, eVarA, this.f17679c, this.f17680d, this.f17681e, abstractC6735w0H, this.f17682f, interfaceC3540l, 0, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a((InterfaceC8681d) obj, (f.b) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        static final class b implements r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC7929a.b f17683a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6735w0 f17684b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f0.c f17685c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2528h f17686d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f17687e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f17688f;

            b(InterfaceC7929a.b bVar, AbstractC6735w0 abstractC6735w0, f0.c cVar, InterfaceC2528h interfaceC2528h, String str, float f10) {
                this.f17683a = bVar;
                this.f17684b = abstractC6735w0;
                this.f17685c = cVar;
                this.f17686d = interfaceC2528h;
                this.f17687e = str;
                this.f17688f = f10;
            }

            public final void a(InterfaceC8681d let, f.a unused$var$, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(let, "$this$let");
                AbstractC6492s.i(unused$var$, "$unused$var$");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(let) ? 4 : 2;
                }
                if ((i10 & 131) == 130 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(2010703702, i10, -1, "com.ui.core.ui.img.UiGlideImageLoader.GlideImage.<anonymous>.<anonymous>.<anonymous> (UiGlideImageLoader.kt:125)");
                }
                AbstractC7554d abstractC7554dI = AbstractC8049c.i(this.f17683a, interfaceC3540l, 0);
                e eVarA = let.a(e.f28771b0);
                AbstractC6735w0 abstractC6735w0H = this.f17684b;
                interfaceC3540l.U(699356274);
                if (abstractC6735w0H == null) {
                    abstractC6735w0H = AbstractC8049c.h(this.f17683a, interfaceC3540l, 0);
                }
                interfaceC3540l.J();
                S6.g.b(abstractC7554dI, eVarA, this.f17685c, this.f17686d, this.f17687e, abstractC6735w0H, this.f17688f, interfaceC3540l, 0, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.r
            public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
                a((InterfaceC8681d) obj, (f.a) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
                return J.f24997a;
            }
        }

        a(f0.c cVar, String str, InterfaceC2528h interfaceC2528h, AbstractC6735w0 abstractC6735w0, float f10, d dVar, InterfaceC7929a.b bVar, InterfaceC7929a.b bVar2, String str2, e eVar) {
            this.f17667a = cVar;
            this.f17668b = str;
            this.f17669c = interfaceC2528h;
            this.f17670d = abstractC6735w0;
            this.f17671e = f10;
            this.f17672f = dVar;
            this.f17673g = bVar;
            this.f17674h = bVar2;
            this.f17675i = str2;
            this.f17676j = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object c(String str) {
            return str;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1496727227, i10, -1, "com.ui.core.ui.img.UiGlideImageLoader.GlideImage.<anonymous> (UiGlideImageLoader.kt:99)");
            }
            k kVar = new k(this.f17667a, this.f17668b, this.f17669c, this.f17670d, this.f17671e, 0L, null, 96, null);
            InterfaceC6824a interfaceC6824a = this.f17672f.f17665c;
            InterfaceC7929a.b bVar = this.f17673g;
            interfaceC3540l.U(1772990561);
            InterfaceC4038a interfaceC4038aE = bVar == null ? null : b0.c.e(-472502921, true, new C0609a(this.f17673g, this.f17670d, this.f17667a, this.f17669c, this.f17668b, this.f17671e), interfaceC3540l, 54);
            interfaceC3540l.J();
            InterfaceC7929a.b bVar2 = this.f17674h;
            interfaceC3540l.U(1773010309);
            InterfaceC4038a interfaceC4038aE2 = bVar2 == null ? null : b0.c.e(2010703702, true, new b(this.f17674h, this.f17670d, this.f17667a, this.f17669c, this.f17668b, this.f17671e), interfaceC3540l, 54);
            interfaceC3540l.J();
            interfaceC3540l.U(1772976074);
            boolean zT = interfaceC3540l.T(this.f17675i);
            final String str = this.f17675i;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: O9.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return d.a.c(str);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            V6.e.a((InterfaceC6824a) objF, this.f17676j, null, null, null, interfaceC6824a, null, kVar, false, null, null, interfaceC4038aE, null, interfaceC4038aE2, interfaceC3540l, 0, 0, 5980);
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

    public d(i iVar, com.bumptech.glide.request.f fVar, InterfaceC6824a interfaceC6824a) {
        this.f17663a = iVar;
        this.f17664b = fVar;
        this.f17665c = interfaceC6824a;
        this.f17666d = new g();
    }

    private final void d(final String str, final e eVar, final InterfaceC7929a.b bVar, final InterfaceC7929a.b bVar2, final String str2, final f0.c cVar, final InterfaceC2528h interfaceC2528h, final float f10, final AbstractC6735w0 abstractC6735w0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(208117253);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(bVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(str2) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.T(cVar) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC3540lR.T(interfaceC2528h) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC3540lR.T(abstractC6735w0) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= interfaceC3540lR.T(this) ? 536870912 : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((306783379 & i11) == 306783378 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(208117253, i11, -1, "com.ui.core.ui.img.UiGlideImageLoader.GlideImage (UiGlideImageLoader.kt:94)");
            }
            H0 h0G = v.g();
            i iVar = this.f17663a;
            interfaceC3540lR.U(702292150);
            if (iVar == null) {
                iVar = (i) interfaceC3540lR.t(v.g());
            }
            interfaceC3540lR.J();
            I0 i0D = h0G.d(iVar);
            H0 h0I = v.i();
            com.bumptech.glide.request.f fVar = this.f17664b;
            interfaceC3540lR.U(702295350);
            if (fVar == null) {
                fVar = (com.bumptech.glide.request.f) interfaceC3540lR.t(v.i());
            }
            interfaceC3540lR.J();
            AbstractC3561w.b(new I0[]{i0D, h0I.d(fVar)}, b0.c.e(-1496727227, true, new a(cVar, str2, interfaceC2528h, abstractC6735w0, f10, this, bVar, bVar2, str, eVar), interfaceC3540lR, 54), interfaceC3540lR, I0.f20869i | 48);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: O9.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.e(this.f17651a, str, eVar, bVar, bVar2, str2, cVar, interfaceC2528h, f10, abstractC6735w0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(d dVar, String str, e eVar, InterfaceC7929a.b bVar, InterfaceC7929a.b bVar2, String str2, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        dVar.d(str, eVar, bVar, bVar2, str2, cVar, interfaceC2528h, f10, abstractC6735w0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(d dVar, InterfaceC7929a interfaceC7929a, e eVar, InterfaceC7929a.b bVar, InterfaceC7929a.b bVar2, String str, f0.c cVar, InterfaceC2528h interfaceC2528h, float f10, AbstractC6735w0 abstractC6735w0, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        dVar.a(interfaceC7929a, eVar, bVar, bVar2, str, cVar, interfaceC2528h, f10, abstractC6735w0, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    @Override // ta.InterfaceC8050d
    public void a(final InterfaceC7929a img, final e modifier, final InterfaceC7929a.b bVar, final InterfaceC7929a.b bVar2, final String str, final f0.c alignment, final InterfaceC2528h contentScale, final float f10, final AbstractC6735w0 abstractC6735w0, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(img, "img");
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(alignment, "alignment");
        AbstractC6492s.i(contentScale, "contentScale");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(584925814);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(img) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(bVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(bVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC3540lR.T(str) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC3540lR.T(alignment) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC3540lR.T(contentScale) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i10) == 0) {
            i11 |= interfaceC3540lR.g(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= interfaceC3540lR.T(abstractC6735w0) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= interfaceC3540lR.T(this) ? 536870912 : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if ((306783379 & i11) == 306783378 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(584925814, i11, -1, "com.ui.core.ui.img.UiGlideImageLoader.Image (UiGlideImageLoader.kt:45)");
            }
            if (img instanceof InterfaceC7929a.b) {
                interfaceC3540lR.U(-1223547663);
                interfaceC3540l2 = interfaceC3540lR;
                this.f17666d.a((InterfaceC7929a.b) img, modifier, bVar, bVar2, str, alignment, contentScale, f10, abstractC6735w0, interfaceC3540l2, (i11 & 268435440) | (g.f61911a << 27));
                interfaceC3540l2.J();
            } else {
                if (!(img instanceof InterfaceC7929a.InterfaceC2142a)) {
                    interfaceC3540lR.U(514756002);
                    interfaceC3540lR.J();
                    throw new IllegalStateException("Unsupported drawable source type " + img.getClass().getName());
                }
                interfaceC3540lR.U(514736458);
                InterfaceC7929a.InterfaceC2142a interfaceC2142a = (InterfaceC7929a.InterfaceC2142a) img;
                if (!(interfaceC2142a instanceof InterfaceC7929a.InterfaceC2142a.InterfaceC2143a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String string = ((InterfaceC7929a.InterfaceC2142a.InterfaceC2143a) img).b().toString();
                AbstractC6492s.f(string);
                interfaceC3540l2 = interfaceC3540lR;
                d(string, modifier, bVar == null ? interfaceC2142a.c() : bVar, bVar2 == null ? interfaceC2142a.a() : bVar2, str, alignment, contentScale, f10, abstractC6735w0, interfaceC3540lR, i11 & 2147475568);
                interfaceC3540l2.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: O9.a
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(this.f17640a, img, modifier, bVar, bVar2, str, alignment, contentScale, f10, abstractC6735w0, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public /* synthetic */ d(i iVar, com.bumptech.glide.request.f fVar, InterfaceC6824a interfaceC6824a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : iVar, (i10 & 2) != 0 ? null : fVar, (i10 & 4) != 0 ? null : interfaceC6824a);
    }
}
