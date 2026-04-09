package V6;

import Li.AbstractC3222i;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import V6.f;
import V6.m;
import Yg.J;
import Zg.AbstractC3689v;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.o1;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m0.J0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import r0.AbstractC7554d;
import z.InterfaceC8683f;

/* loaded from: classes3.dex */
abstract /* synthetic */ class m {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23046a = new a();

        a() {
        }

        public final com.bumptech.glide.i a(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(368119336);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(368119336, i10, -1, "com.skydoves.landscapist.glide.GlideImage.<anonymous> (GlideImage.kt:103)");
            }
            com.bumptech.glide.i iVarA = r.f23082a.a(interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return iVarA;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC3540l) obj, ((Number) obj2).intValue());
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23047a = new b();

        b() {
        }

        public final com.bumptech.glide.request.f a(InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(1066034696);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1066034696, i10, -1, "com.skydoves.landscapist.glide.GlideImage.<anonymous> (GlideImage.kt:106)");
            }
            com.bumptech.glide.request.f fVarC = r.f23082a.c(interfaceC3540l, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return fVarC;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC3540l) obj, ((Number) obj2).intValue());
        }
    }

    static final class c implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f23048a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T6.a f23049b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S6.k f23050c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.r f23051d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.r f23052e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f23053f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ mh.s f23054g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f23055h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f23056i;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6824a f23057a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ S6.k f23058b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f23059c;

            a(InterfaceC6824a interfaceC6824a, S6.k kVar, InterfaceC6839p interfaceC6839p) {
                this.f23057a = interfaceC6824a;
                this.f23058b = kVar;
                this.f23059c = interfaceC6839p;
            }

            public final void a(long j10, InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.j(j10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1135138400, i10, -1, "com.skydoves.landscapist.glide.GlideImage.<anonymous>.<anonymous> (GlideImage.kt:163)");
                }
                S6.r rVar = new S6.r(this.f23057a.invoke());
                S6.k kVar = this.f23058b;
                com.bumptech.glide.i iVarP0 = ((com.bumptech.glide.i) this.f23059c.invoke(interfaceC3540l, 0)).p0(this.f23057a.invoke());
                AbstractC6492s.g(iVarP0, "null cannot be cast to non-null type com.bumptech.glide.RequestBuilder<kotlin.Any>");
                m.l(j10, rVar, kVar, new S6.r(iVarP0), interfaceC3540l, i10 & 14);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a(((Y0.r) obj).j(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        c(p pVar, T6.a aVar, S6.k kVar, mh.r rVar, mh.r rVar2, InterfaceC6824a interfaceC6824a, mh.s sVar, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p) {
            this.f23048a = pVar;
            this.f23049b = aVar;
            this.f23050c = kVar;
            this.f23051d = rVar;
            this.f23052e = rVar2;
            this.f23053f = interfaceC6824a;
            this.f23054g = sVar;
            this.f23055h = interfaceC6835l;
            this.f23056i = interfaceC6839p;
        }

        public final void a(InterfaceC8683f ImageRequest, S6.j imageState, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC7554d abstractC7554dA;
            AbstractC6492s.i(ImageRequest, "$this$ImageRequest");
            AbstractC6492s.i(imageState, "imageState");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(ImageRequest) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= interfaceC3540l.T(imageState) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-804168495, i11, -1, "com.skydoves.landscapist.glide.GlideImage.<anonymous> (GlideImage.kt:151)");
            }
            V6.f fVarA = g.a(imageState, this.f23048a);
            this.f23055h.invoke(fVarA);
            if (fVarA instanceof f.c) {
                interfaceC3540l.U(-493380295);
                interfaceC3540l.J();
            } else if (fVarA instanceof f.b) {
                interfaceC3540l.U(1885139282);
                T6.a aVar = this.f23049b;
                androidx.compose.ui.e eVarA = U6.b.a(androidx.compose.ui.e.f28771b0, ImageRequest);
                S6.k kVar = this.f23050c;
                T6.e.f(aVar, eVarA, kVar, b0.c.e(-1135138400, true, new a(this.f23053f, kVar, this.f23056i), interfaceC3540l, 54), interfaceC3540l, 3072);
                mh.r rVar = this.f23051d;
                if (rVar != null) {
                    rVar.y(ImageRequest, fVarA, interfaceC3540l, Integer.valueOf(i11 & 14));
                    J j10 = J.f24997a;
                }
                interfaceC3540l.J();
            } else if (fVarA instanceof f.a) {
                interfaceC3540l.U(1885733211);
                T6.e.d(this.f23049b, U6.b.a(androidx.compose.ui.e.f28771b0, ImageRequest), this.f23050c, ((f.a) fVarA).a(), interfaceC3540l, 0);
                mh.r rVar2 = this.f23052e;
                if (rVar2 != null) {
                    rVar2.y(ImageRequest, fVarA, interfaceC3540l, Integer.valueOf(i11 & 14));
                    J j11 = J.f24997a;
                }
                interfaceC3540l.J();
            } else {
                if (!(fVarA instanceof f.d)) {
                    interfaceC3540l.U(-493384566);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(1886036267);
                T6.a aVar2 = this.f23049b;
                e.a aVar3 = androidx.compose.ui.e.f28771b0;
                f.d dVar = (f.d) fVarA;
                T6.e.h(aVar2, U6.b.a(aVar3, ImageRequest), this.f23053f, this.f23050c, q.a(dVar.a(), this.f23048a), interfaceC3540l, 0);
                Object objA = dVar.a();
                if (objA == null) {
                    interfaceC3540l.J();
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                        return;
                    }
                    return;
                }
                if (objA instanceof Drawable) {
                    interfaceC3540l.U(1886414467);
                    Drawable drawable = (Drawable) objA;
                    T6.a aVar4 = this.f23049b;
                    abstractC7554dA = S6.p.a(drawable, aVar4 instanceof T6.f ? ((T6.f) aVar4).a() : AbstractC3689v.l(), interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(1886558927);
                    J0 j0A = q.a(objA, this.f23048a);
                    T6.a aVar5 = this.f23049b;
                    abstractC7554dA = S6.q.a(aVar5 instanceof T6.f ? ((T6.f) aVar5).a() : AbstractC3689v.l(), j0A, interfaceC3540l, 0);
                    interfaceC3540l.J();
                }
                AbstractC7554d abstractC7554d = abstractC7554dA;
                if (this.f23054g != null) {
                    interfaceC3540l.U(1886774377);
                    this.f23054g.K(ImageRequest, fVarA, abstractC7554d, interfaceC3540l, Integer.valueOf(i11 & 14));
                    interfaceC3540l.J();
                } else {
                    interfaceC3540l.U(1886851908);
                    S6.o.b(this.f23050c, o1.a(U6.b.a(aVar3, ImageRequest), this.f23050c.i()), abstractC7554d, interfaceC3540l, 0);
                    interfaceC3540l.J();
                }
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC8683f) obj, (S6.j) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        int f23060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V6.b f23061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.j f23062c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f23063d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S6.r f23064e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S6.r f23065f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S6.r f23066g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ S6.k f23067h;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f23068a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f23069b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ V6.b f23070c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.bumptech.glide.j f23071d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ p f23072e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ S6.r f23073f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ S6.r f23074g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ S6.r f23075h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ S6.k f23076i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V6.b bVar, com.bumptech.glide.j jVar, p pVar, S6.r rVar, S6.r rVar2, S6.r rVar3, S6.k kVar, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f23070c = bVar;
                this.f23071d = jVar;
                this.f23072e = pVar;
                this.f23073f = rVar;
                this.f23074g = rVar2;
                this.f23075h = rVar3;
                this.f23076i = kVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J E() {
                return J.f24997a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final J v(V6.b bVar, Throwable th2) {
                bVar.p(th2);
                return J.f24997a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f23070c, this.f23071d, this.f23072e, this.f23073f, this.f23074g, this.f23075h, this.f23076i, interfaceC5380e);
                aVar.f23069b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f23068a;
                if (i10 == 0) {
                    Yg.v.b(obj);
                    Ki.t tVar = (Ki.t) this.f23069b;
                    this.f23070c.o(tVar);
                    final V6.b bVar = this.f23070c;
                    com.bumptech.glide.i iVarP = m.p(this.f23071d, this.f23072e, this.f23073f, new V6.c(tVar, new InterfaceC6835l() { // from class: V6.n
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj2) {
                            return m.d.a.v(bVar, (Throwable) obj2);
                        }
                    }), this.f23074g, this.f23075h);
                    S6.k kVar = this.f23076i;
                    if (Y0.r.g(kVar.h()) > 0 && Y0.r.f(kVar.h()) > 0) {
                        com.bumptech.glide.request.a aVarQ = iVarP.Q(Y0.r.g(this.f23076i.h()), Y0.r.f(this.f23076i.h()));
                        AbstractC6492s.f(aVarQ);
                        iVarP = (com.bumptech.glide.i) aVarQ;
                    }
                    iVarP.l0(this.f23070c);
                    InterfaceC6824a interfaceC6824a = new InterfaceC6824a() { // from class: V6.o
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.d.a.E();
                        }
                    };
                    this.f23068a = 1;
                    if (Ki.r.a(tVar, interfaceC6824a, this) == objG) {
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
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Ki.t tVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(V6.b bVar, com.bumptech.glide.j jVar, p pVar, S6.r rVar, S6.r rVar2, S6.r rVar3, S6.k kVar, InterfaceC5380e interfaceC5380e) {
            super(1, interfaceC5380e);
            this.f23061b = bVar;
            this.f23062c = jVar;
            this.f23063d = pVar;
            this.f23064e = rVar;
            this.f23065f = rVar2;
            this.f23066g = rVar3;
            this.f23067h = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(InterfaceC5380e interfaceC5380e) {
            return new d(this.f23061b, this.f23062c, this.f23063d, this.f23064e, this.f23065f, this.f23066g, this.f23067h, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f23060a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return AbstractC3222i.e(new a(this.f23061b, this.f23062c, this.f23063d, this.f23064e, this.f23065f, this.f23066g, this.f23067h, null));
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC5380e interfaceC5380e) {
            return ((d) create(interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f23077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S6.k f23078b;

        e(p pVar, S6.k kVar) {
            this.f23077a = pVar;
            this.f23078b = kVar;
        }

        public final void a(InterfaceC8683f ImageRequest, S6.j imageState, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ImageRequest, "$this$ImageRequest");
            AbstractC6492s.i(imageState, "imageState");
            if ((i10 & 48) == 0) {
                i10 |= interfaceC3540l.T(imageState) ? 32 : 16;
            }
            if ((i10 & 145) == 144 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-877462407, i10, -1, "com.skydoves.landscapist.glide.GlideThumbnail.<anonymous> (GlideImage.kt:327)");
            }
            V6.f fVarA = g.a(imageState, this.f23077a);
            if (fVarA instanceof f.d) {
                Object objA = ((f.d) fVarA).a();
                if (objA == null) {
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                        return;
                    }
                    return;
                }
                S6.o.b(this.f23078b, androidx.compose.ui.e.f28771b0, S6.p.a((Drawable) objA, AbstractC3689v.l(), interfaceC3540l, 48), interfaceC3540l, 48);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((InterfaceC8683f) obj, (S6.j) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23079a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.DRAWABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.BITMAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23079a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(final mh.InterfaceC6824a r43, androidx.compose.ui.e r44, V6.p r45, mh.InterfaceC6839p r46, mh.InterfaceC6839p r47, mh.InterfaceC6824a r48, T6.a r49, S6.k r50, boolean r51, mh.InterfaceC6835l r52, r0.AbstractC7554d r53, mh.r r54, mh.s r55, mh.r r56, T.InterfaceC3540l r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.m.f(mh.a, androidx.compose.ui.e, V6.p, mh.p, mh.p, mh.a, T6.a, S6.k, boolean, mh.l, r0.d, mh.r, mh.s, mh.r, T.l, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void g(final S6.r r25, androidx.compose.ui.e r26, final S6.k r27, final V6.p r28, boolean r29, final S6.r r30, S6.r r31, final mh.r r32, T.InterfaceC3540l r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V6.m.g(S6.r, androidx.compose.ui.e, S6.k, V6.p, boolean, S6.r, S6.r, mh.r, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(V6.f it) {
        AbstractC6492s.i(it, "it");
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, p pVar, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6824a interfaceC6824a2, T6.a aVar, S6.k kVar, boolean z10, InterfaceC6835l interfaceC6835l, AbstractC7554d abstractC7554d, mh.r rVar, mh.s sVar, mh.r rVar2, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        V6.e.a(interfaceC6824a, eVar, pVar, interfaceC6839p, interfaceC6839p2, interfaceC6824a2, aVar, kVar, z10, interfaceC6835l, abstractC7554d, rVar, sVar, rVar2, interfaceC3540l, L0.a(i10 | 1), L0.a(i11), i12);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(InterfaceC6824a interfaceC6824a, androidx.compose.ui.e eVar, p pVar, InterfaceC6839p interfaceC6839p, InterfaceC6839p interfaceC6839p2, InterfaceC6824a interfaceC6824a2, T6.a aVar, S6.k kVar, boolean z10, InterfaceC6835l interfaceC6835l, AbstractC7554d abstractC7554d, mh.r rVar, mh.s sVar, mh.r rVar2, int i10, int i11, int i12, InterfaceC3540l interfaceC3540l, int i13) {
        V6.e.a(interfaceC6824a, eVar, pVar, interfaceC6839p, interfaceC6839p2, interfaceC6824a2, aVar, kVar, z10, interfaceC6835l, abstractC7554d, rVar, sVar, rVar2, interfaceC3540l, L0.a(i10 | 1), L0.a(i11), i12);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k(S6.r rVar, androidx.compose.ui.e eVar, S6.k kVar, p pVar, boolean z10, S6.r rVar2, S6.r rVar3, mh.r rVar4, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        g(rVar, eVar, kVar, pVar, z10, rVar2, rVar3, rVar4, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final long j10, final S6.r rVar, final S6.k kVar, final S6.r rVar2, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2015723796);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.j(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(kVar) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC3540lR.T(rVar2) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2015723796, i12, -1, "com.skydoves.landscapist.glide.GlideThumbnail (GlideImage.kt:318)");
            }
            p pVar = p.DRAWABLE;
            interfaceC3540l2 = interfaceC3540lR;
            g(rVar, null, kVar.a((95 & 1) != 0 ? kVar.f20337a : null, (95 & 2) != 0 ? kVar.f20338b : null, (95 & 4) != 0 ? kVar.f20339c : null, (95 & 8) != 0 ? kVar.f20340d : null, (95 & 16) != 0 ? kVar.f20341e : 0.0f, (95 & 32) != 0 ? kVar.f20342f : j10, (95 & 64) != 0 ? kVar.f20343g : null), pVar, false, rVar2, new S6.r(null), b0.c.e(-877462407, true, new e(pVar, kVar), interfaceC3540lR, 54), interfaceC3540l2, ((i12 >> 3) & 14) | 14158848 | (458752 & (i12 << 6)), 18);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: V6.i
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.m(j10, rVar, kVar, rVar2, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m(long j10, S6.r rVar, S6.k kVar, S6.r rVar2, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        l(j10, rVar, kVar, rVar2, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.bumptech.glide.i p(com.bumptech.glide.j jVar, p pVar, S6.r rVar, V6.c cVar, S6.r rVar2, S6.r rVar3) {
        int i10 = f.f23079a[pVar.ordinal()];
        if (i10 == 1) {
            com.bumptech.glide.i iVarB = jVar.n().p0(rVar.a()).b((com.bumptech.glide.request.a) rVar2.a());
            AbstractC6492s.g(cVar, "null cannot be cast to non-null type com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable>");
            com.bumptech.glide.i iVarD0 = iVarB.d0(cVar).d0((com.bumptech.glide.request.e) rVar3.a());
            AbstractC6492s.h(iVarD0, "addListener(...)");
            return iVarD0;
        }
        if (i10 == 2) {
            com.bumptech.glide.i iVarB2 = jVar.o().p0(rVar.a()).b((com.bumptech.glide.request.a) rVar2.a());
            AbstractC6492s.g(cVar, "null cannot be cast to non-null type com.bumptech.glide.request.RequestListener<com.bumptech.glide.load.resource.gif.GifDrawable>");
            com.bumptech.glide.i iVarD02 = iVarB2.d0(cVar).d0((com.bumptech.glide.request.e) rVar3.a());
            AbstractC6492s.h(iVarD02, "addListener(...)");
            return iVarD02;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        com.bumptech.glide.i iVarB3 = jVar.m().p0(rVar.a()).b((com.bumptech.glide.request.a) rVar2.a());
        AbstractC6492s.g(cVar, "null cannot be cast to non-null type com.bumptech.glide.request.RequestListener<android.graphics.Bitmap>");
        com.bumptech.glide.i iVarD03 = iVarB3.d0(cVar).d0((com.bumptech.glide.request.e) rVar3.a());
        AbstractC6492s.h(iVarD03, "addListener(...)");
        return iVarD03;
    }
}
