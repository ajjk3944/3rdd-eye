package M5;

import C0.C;
import C0.w;
import E0.InterfaceC2629g;
import E6.e;
import Ii.AbstractC3063k;
import Ii.N;
import T.A;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.O;
import T.X0;
import T.Z0;
import T.o1;
import T.t1;
import T.z1;
import Y0.t;
import Yg.J;
import Yg.v;
import Zg.AbstractC3689v;
import android.graphics.RectF;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.w1;
import dh.C5385j;
import dh.InterfaceC5380e;
import e6.AbstractC5423b;
import e6.AbstractC5424c;
import e6.InterfaceC5422a;
import eh.AbstractC5467b;
import f6.AbstractC5537a;
import i6.EnumC6077a;
import j6.InterfaceC6255b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import l0.C6537m;
import m0.AbstractC6670H;
import m0.AbstractC6737x0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import s.AbstractC7848i;
import w.u;
import y.AbstractC8557l;
import y.C8548c;
import y.InterfaceC8558m;
import y6.AbstractC8620i;
import z.InterfaceC8681d;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: M5.a$a, reason: collision with other inner class name */
    static final class C0494a extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b6.b f12556a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x6.b f12557b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y5.d f12558c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y5.d f12559d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y5.d f12560e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y5.d f12561f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ O5.a f12562g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12563h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x6.b f12564i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC6077a f12565j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ O5.c f12566k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12567l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12568m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0494a(b6.b bVar, x6.b bVar2, Y5.d dVar, Y5.d dVar2, Y5.d dVar3, Y5.d dVar4, C6.a aVar, C6.b bVar3, B6.a aVar2, O5.a aVar3, boolean z10, x6.b bVar4, AbstractC5537a abstractC5537a, EnumC6077a enumC6077a, O5.c cVar, int i10, int i11) {
            super(3);
            this.f12556a = bVar;
            this.f12557b = bVar2;
            this.f12558c = dVar;
            this.f12559d = dVar2;
            this.f12560e = dVar3;
            this.f12561f = dVar4;
            this.f12562g = aVar3;
            this.f12563h = z10;
            this.f12564i = bVar4;
            this.f12565j = enumC6077a;
            this.f12566k = cVar;
            this.f12567l = i10;
            this.f12568m = i11;
        }

        public final void a(InterfaceC8681d ChartBox, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(ChartBox, "$this$ChartBox");
            if ((i10 & 81) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-272349750, i10, -1, "com.patrykandpatrick.vico.compose.chart.Chart.<anonymous> (Charts.kt:261)");
            }
            b6.b bVar = this.f12556a;
            x6.b bVar2 = this.f12557b;
            Y5.d dVar = this.f12558c;
            Y5.d dVar2 = this.f12559d;
            Y5.d dVar3 = this.f12560e;
            Y5.d dVar4 = this.f12561f;
            O5.a aVar = this.f12562g;
            boolean z10 = this.f12563h;
            x6.b bVar3 = this.f12564i;
            EnumC6077a enumC6077a = this.f12565j;
            O5.c cVar = this.f12566k;
            int i11 = this.f12567l;
            int i12 = this.f12568m;
            a.c(bVar, bVar2, dVar, dVar2, dVar3, dVar4, null, null, null, aVar, z10, bVar3, null, enumC6077a, cVar, interfaceC3540l, (((i11 >> 3) & 8) << 3) | 153391624 | (i11 & 112) | ((i12 << 27) & 1879048192), (((i11 >> 3) & 8) << 3) | ((i12 >> 3) & 14) | 33280 | ((i12 >> 3) & 112) | ((i12 >> 3) & 7168), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8681d) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b6.b f12569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x6.b f12570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y5.d f12572d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y5.d f12573e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y5.d f12574f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Y5.d f12575g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ O5.a f12576h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f12577i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ x6.b f12578j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ EnumC6077a f12579k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ O5.c f12580l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12581m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f12582n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f12583o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b6.b bVar, x6.b bVar2, androidx.compose.ui.e eVar, Y5.d dVar, Y5.d dVar2, Y5.d dVar3, Y5.d dVar4, C6.a aVar, C6.b bVar3, B6.a aVar2, O5.a aVar3, boolean z10, x6.b bVar4, AbstractC5537a abstractC5537a, EnumC6077a enumC6077a, O5.c cVar, int i10, int i11, int i12) {
            super(2);
            this.f12569a = bVar;
            this.f12570b = bVar2;
            this.f12571c = eVar;
            this.f12572d = dVar;
            this.f12573e = dVar2;
            this.f12574f = dVar3;
            this.f12575g = dVar4;
            this.f12576h = aVar3;
            this.f12577i = z10;
            this.f12578j = bVar4;
            this.f12579k = enumC6077a;
            this.f12580l = cVar;
            this.f12581m = i10;
            this.f12582n = i11;
            this.f12583o = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.a(this.f12569a, this.f12570b, this.f12571c, this.f12572d, this.f12573e, this.f12574f, this.f12575g, null, null, null, this.f12576h, this.f12577i, this.f12578j, null, this.f12579k, this.f12580l, interfaceC3540l, this.f12581m | 1, this.f12582n, this.f12583o);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f12584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f12585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, q qVar, int i10) {
            super(2);
            this.f12584a = eVar;
            this.f12585b = qVar;
            this.f12586c = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.b(this.f12584a, this.f12585b, interfaceC3540l, this.f12586c | 1);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f12587a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O5.a f12588b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x6.b f12589c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x6.b f12590d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ O5.c f12591e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(O5.a aVar, x6.b bVar, x6.b bVar2, O5.c cVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f12588b = aVar;
            this.f12589c = bVar;
            this.f12590d = bVar2;
            this.f12591e = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f12588b, this.f12589c, this.f12590d, this.f12591e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f12587a;
            if (i10 == 0) {
                v.b(obj);
                O5.a aVar = this.f12588b;
                x6.b bVar = this.f12589c;
                x6.b bVar2 = this.f12590d;
                O5.c cVar = this.f12591e;
                this.f12587a = 1;
                if (aVar.c(bVar, bVar2, cVar, this) == objG) {
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
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f12592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b6.b f12593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u6.f f12594c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x6.b f12595d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ A6.a f12596e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O5.c f12597f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ O5.a f12598g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f12599h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f12600i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC6077a f12601j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Y5.b f12602k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f12603l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f12604m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f12605n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(RectF rectF, b6.b bVar, u6.f fVar, x6.b bVar2, A6.a aVar, B6.a aVar2, C6.a aVar3, O5.c cVar, O5.a aVar4, int i10, InterfaceC3551q0 interfaceC3551q0, EnumC6077a enumC6077a, AbstractC5537a abstractC5537a, Y5.b bVar3, C6.b bVar4, boolean z10, InterfaceC6835l interfaceC6835l, InterfaceC3551q0 interfaceC3551q02) {
            super(1);
            this.f12592a = rectF;
            this.f12593b = bVar;
            this.f12594c = fVar;
            this.f12595d = bVar2;
            this.f12596e = aVar;
            this.f12597f = cVar;
            this.f12598g = aVar4;
            this.f12599h = i10;
            this.f12600i = interfaceC3551q0;
            this.f12601j = enumC6077a;
            this.f12602k = bVar3;
            this.f12603l = z10;
            this.f12604m = interfaceC6835l;
            this.f12605n = interfaceC3551q02;
        }

        public final void a(InterfaceC7039f Canvas) {
            AbstractC6492s.i(Canvas, "$this$Canvas");
            AbstractC8620i.e(this.f12592a, 0, 0, Float.valueOf(C6537m.i(Canvas.c())), Float.valueOf(C6537m.g(Canvas.c())));
            this.f12593b.k(this.f12594c.c(), this.f12595d);
            InterfaceC6255b interfaceC6255bF = this.f12593b.f(this.f12594c, this.f12595d);
            if (this.f12596e.a(this.f12594c, this.f12592a, this.f12593b, null, interfaceC6255bF, null).isEmpty()) {
                return;
            }
            this.f12597f.l(AbstractC5424c.a(this.f12594c, this.f12593b.getBounds().width(), interfaceC6255bF));
            this.f12597f.j(this.f12598g.a());
            InterfaceC5422a interfaceC5422aA = AbstractC5423b.a(AbstractC6670H.d(Canvas.k1().d()), this.f12599h, this.f12594c, (D6.a) this.f12600i.getValue(), interfaceC6255bF, this.f12593b.getBounds(), this.f12597f.i(), this.f12601j);
            this.f12602k.c(interfaceC5422aA);
            this.f12593b.a(interfaceC5422aA, this.f12595d);
            this.f12602k.b(interfaceC5422aA);
            this.f12593b.d(interfaceC5422aA, this.f12595d);
            this.f12594c.t();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b6.b f12606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ x6.b f12607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Y5.d f12608c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y5.d f12609d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y5.d f12610e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y5.d f12611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ O5.a f12612g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f12613h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ x6.b f12614i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC6077a f12615j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ O5.c f12616k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f12617l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12618m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f12619n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b6.b bVar, x6.b bVar2, Y5.d dVar, Y5.d dVar2, Y5.d dVar3, Y5.d dVar4, C6.a aVar, C6.b bVar3, B6.a aVar2, O5.a aVar3, boolean z10, x6.b bVar4, AbstractC5537a abstractC5537a, EnumC6077a enumC6077a, O5.c cVar, int i10, int i11, int i12) {
            super(2);
            this.f12606a = bVar;
            this.f12607b = bVar2;
            this.f12608c = dVar;
            this.f12609d = dVar2;
            this.f12610e = dVar3;
            this.f12611f = dVar4;
            this.f12612g = aVar3;
            this.f12613h = z10;
            this.f12614i = bVar4;
            this.f12615j = enumC6077a;
            this.f12616k = cVar;
            this.f12617l = i10;
            this.f12618m = i11;
            this.f12619n = i12;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            a.c(this.f12606a, this.f12607b, this.f12608c, this.f12609d, this.f12610e, this.f12611f, null, null, null, this.f12612g, this.f12613h, this.f12614i, null, this.f12615j, this.f12616k, interfaceC3540l, this.f12617l | 1, this.f12618m, this.f12619n);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O5.c f12620a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(O5.c cVar) {
            super(0);
            this.f12620a = cVar;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f12620a.i());
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f12621a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O5.c f12622b;

        /* renamed from: M5.a$h$a, reason: collision with other inner class name */
        static final class C0495a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f12623a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O5.c f12624b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f12625c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0495a(O5.c cVar, float f10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f12624b = cVar;
                this.f12625c = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0495a(this.f12624b, this.f12625c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f12623a;
                if (i10 == 0) {
                    v.b(obj);
                    O5.c cVar = this.f12624b;
                    float f10 = this.f12625c;
                    this.f12623a = 1;
                    if (u.b(cVar, f10, this) == objG) {
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
                return ((C0495a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N n10, O5.c cVar) {
            super(1);
            this.f12621a = n10;
            this.f12622b = cVar;
        }

        public final void a(float f10) {
            AbstractC3063k.d(this.f12621a, null, null, new C0495a(this.f12622b, f10, null), 3, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return J.f24997a;
        }
    }

    public static final class i implements E6.e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12626a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f12627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1 f12628c;

        i(InterfaceC3551q0 interfaceC3551q0, z1 z1Var) {
            this.f12627b = interfaceC3551q0;
            this.f12628c = z1Var;
        }

        @Override // E6.e
        public void a(float f10, float f11) {
            e.a.a(this, f10, f11);
        }

        @Override // E6.e
        public void b(float f10, float f11) {
            D6.a aVar = (D6.a) this.f12627b.getValue();
            if (aVar != null) {
                z1 z1Var = this.f12628c;
                InterfaceC3551q0 interfaceC3551q0 = this.f12627b;
                long jK = aVar.k();
                if ((z1Var.getValue() instanceof C8548c) && this.f12626a) {
                    interfaceC3551q0.setValue(null);
                    this.f12626a = false;
                } else {
                    interfaceC3551q0.setValue(D6.a.a(D6.a.d(jK, (D6.a.g(jK) + f10) - f11, 0.0f, 2, null)));
                    this.f12626a = true;
                }
            }
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f12629a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f12630b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RectF f12631c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f12632d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC3551q0 interfaceC3551q0, InterfaceC6824a interfaceC6824a, RectF rectF, InterfaceC6835l interfaceC6835l) {
            super(2);
            this.f12629a = interfaceC3551q0;
            this.f12630b = interfaceC6824a;
            this.f12631c = rectF;
            this.f12632d = interfaceC6835l;
        }

        public final void a(long j10, float f10) {
            float fFloatValue = ((Number) this.f12629a.getValue()).floatValue() * f10;
            if (0.1f > fFloatValue || fFloatValue > 10.0f) {
                return;
            }
            float fFloatValue2 = (((Number) this.f12630b.invoke()).floatValue() + C6531g.m(j10)) - this.f12631c.left;
            this.f12629a.setValue(Float.valueOf(fFloatValue));
            this.f12632d.invoke(Float.valueOf((f10 * fFloatValue2) - fFloatValue2));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((C6531g) obj).v(), ((Number) obj2).floatValue());
            return J.f24997a;
        }
    }

    public static final void a(b6.b chart, x6.b model, androidx.compose.ui.e eVar, Y5.d dVar, Y5.d dVar2, Y5.d dVar3, Y5.d dVar4, C6.a aVar, C6.b bVar, B6.a aVar2, O5.a aVar3, boolean z10, x6.b bVar2, AbstractC5537a abstractC5537a, EnumC6077a enumC6077a, O5.c cVar, InterfaceC3540l interfaceC3540l, int i10, int i11, int i12) {
        O5.a aVarA;
        int i13;
        O5.c cVarA;
        int i14;
        AbstractC6492s.i(chart, "chart");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1680694780);
        androidx.compose.ui.e eVar2 = (i12 & 4) != 0 ? androidx.compose.ui.e.f28771b0 : eVar;
        Y5.d dVar5 = (i12 & 8) != 0 ? null : dVar;
        Y5.d dVar6 = (i12 & 16) != 0 ? null : dVar2;
        Y5.d dVar7 = (i12 & 32) != 0 ? null : dVar3;
        Y5.d dVar8 = (i12 & 64) != 0 ? null : dVar4;
        C6.a aVar4 = (i12 & 128) != 0 ? null : aVar;
        C6.b bVar3 = (i12 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : bVar;
        B6.a aVar5 = (i12 & 512) != 0 ? null : aVar2;
        if ((i12 & 1024) != 0) {
            i13 = i11 & (-15);
            aVarA = O5.b.a(false, null, null, null, interfaceC3540lR, 0, 15);
        } else {
            aVarA = aVar3;
            i13 = i11;
        }
        boolean z11 = (i12 & 2048) != 0 ? true : z10;
        x6.b bVar4 = (i12 & 4096) != 0 ? null : bVar2;
        AbstractC5537a abstractC5537a2 = (i12 & 8192) != 0 ? null : abstractC5537a;
        EnumC6077a enumC6077a2 = (i12 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? EnumC6077a.Full : enumC6077a;
        if ((32768 & i12) != 0) {
            cVarA = O5.d.a(interfaceC3540lR, 0);
            i14 = (-458753) & i13;
        } else {
            cVarA = cVar;
            i14 = i13;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1680694780, i10, i14, "com.patrykandpatrick.vico.compose.chart.Chart (Charts.kt:243)");
        }
        androidx.compose.ui.e eVar3 = eVar2;
        b(eVar3, b0.c.b(interfaceC3540lR, -272349750, true, new C0494a(chart, model, dVar5, dVar6, dVar7, dVar8, aVar4, bVar3, aVar5, aVarA, z11, bVar4, abstractC5537a2, enumC6077a2, cVarA, i10, i14)), interfaceC3540lR, ((i10 >> 6) & 14) | 48);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z == null) {
            return;
        }
        x0Z.a(new b(chart, model, eVar3, dVar5, dVar6, dVar7, dVar8, aVar4, bVar3, aVar5, aVarA, z11, bVar4, abstractC5537a2, enumC6077a2, cVarA, i10, i11, i12));
    }

    public static final void b(androidx.compose.ui.e modifier, q content, InterfaceC3540l interfaceC3540l, int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2084770796);
        if ((i10 & 14) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= interfaceC3540lR.T(content) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2084770796, i11, -1, "com.patrykandpatrick.vico.compose.chart.ChartBox (Charts.kt:412)");
            }
            androidx.compose.ui.e eVarI = r.i(modifier, Y0.h.j(200.0f));
            int i12 = (i11 << 6) & 7168;
            interfaceC3540lR.e(733328855);
            C cJ = androidx.compose.foundation.layout.d.j(f0.c.f46573a.o(), false, interfaceC3540lR, 0);
            interfaceC3540lR.e(-1323940314);
            Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
            t tVar = (t) interfaceC3540lR.t(AbstractC3932k0.m());
            w1 w1Var = (w1) interfaceC3540lR.t(AbstractC3932k0.t());
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            q qVarC = w.c(eVarI);
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            interfaceC3540lR.w();
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cJ, aVar.e());
            E1.c(interfaceC3540lA, dVar, aVar.c());
            E1.c(interfaceC3540lA, tVar, aVar.d());
            E1.c(interfaceC3540lA, w1Var, aVar.h());
            interfaceC3540lR.h();
            qVarC.s(Z0.a(Z0.b(interfaceC3540lR)), interfaceC3540lR, 0);
            interfaceC3540lR.e(2058660585);
            interfaceC3540lR.e(-2137368960);
            content.s(androidx.compose.foundation.layout.f.f28130a, interfaceC3540lR, Integer.valueOf(((i12 >> 6) & 112) | 6));
            interfaceC3540lR.P();
            interfaceC3540lR.P();
            interfaceC3540lR.R();
            interfaceC3540lR.P();
            interfaceC3540lR.P();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z == null) {
            return;
        }
        x0Z.a(new c(modifier, content, i10));
    }

    public static final void c(b6.b chart, x6.b model, Y5.d dVar, Y5.d dVar2, Y5.d dVar3, Y5.d dVar4, C6.a aVar, C6.b bVar, B6.a aVar2, O5.a chartScrollSpec, boolean z10, x6.b bVar2, AbstractC5537a abstractC5537a, EnumC6077a autoScaleUp, O5.c cVar, InterfaceC3540l interfaceC3540l, int i10, int i11, int i12) {
        Y5.b bVar3;
        AbstractC6492s.i(chart, "chart");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(chartScrollSpec, "chartScrollSpec");
        AbstractC6492s.i(autoScaleUp, "autoScaleUp");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1876288383);
        x6.b bVar4 = (i12 & 2048) != 0 ? null : bVar2;
        O5.c cVarA = (i12 & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0 ? O5.d.a(interfaceC3540lR, 0) : cVar;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1876288383, i10, i11, "com.patrykandpatrick.vico.compose.chart.ChartImpl (Charts.kt:284)");
        }
        interfaceC3540lR.e(-492369756);
        Object objF = interfaceC3540lR.f();
        InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
        if (objF == aVar3.a()) {
            objF = new Y5.b();
            interfaceC3540lR.K(objF);
        }
        interfaceC3540lR.P();
        Y5.b bVar5 = (Y5.b) objF;
        interfaceC3540lR.e(-492369756);
        Object objF2 = interfaceC3540lR.f();
        if (objF2 == aVar3.a()) {
            objF2 = new RectF();
            interfaceC3540lR.K(objF2);
        }
        interfaceC3540lR.P();
        RectF rectF = (RectF) objF2;
        interfaceC3540lR.e(-492369756);
        Object objF3 = interfaceC3540lR.f();
        O5.c cVar2 = cVarA;
        if (objF3 == aVar3.a()) {
            objF3 = t1.d(null, null, 2, null);
            interfaceC3540lR.K(objF3);
        }
        interfaceC3540lR.P();
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF3;
        interfaceC3540lR.e(-492369756);
        Object objF4 = interfaceC3540lR.f();
        if (objF4 == aVar3.a()) {
            objF4 = t1.d(Float.valueOf(1.0f), null, 2, null);
            interfaceC3540lR.K(objF4);
        }
        interfaceC3540lR.P();
        InterfaceC3551q0 interfaceC3551q02 = (InterfaceC3551q0) objF4;
        u6.f fVarA = V5.a.a(chartScrollSpec.b(), ((Number) interfaceC3551q02.getValue()).floatValue(), rectF, interfaceC3540lR, 512);
        interfaceC3540lR.e(-492369756);
        Object objF5 = interfaceC3540lR.f();
        if (objF5 == aVar3.a()) {
            objF5 = AbstractC8557l.a();
            interfaceC3540lR.K(objF5);
        }
        interfaceC3540lR.P();
        InterfaceC8558m interfaceC8558m = (InterfaceC8558m) objF5;
        E6.e eVarD = d(interfaceC3551q0, o1.a(interfaceC8558m.b(), null, null, interfaceC3540lR, 56, 2), interfaceC3540lR, 6);
        interfaceC3540lR.e(-492369756);
        Object objF6 = interfaceC3540lR.f();
        if (objF6 == aVar3.a()) {
            objF6 = t1.d(AbstractC3689v.l(), null, 2, null);
            interfaceC3540lR.K(objF6);
        }
        interfaceC3540lR.P();
        InterfaceC3551q0 interfaceC3551q03 = (InterfaceC3551q0) objF6;
        bVar5.i(dVar, dVar2, dVar3, dVar4);
        cVar2.k(eVarD);
        interfaceC3540lR.e(-492369756);
        Object objF7 = interfaceC3540lR.f();
        if (objF7 == aVar3.a()) {
            objF7 = new A6.a(bVar5);
            interfaceC3540lR.K(objF7);
        }
        interfaceC3540lR.P();
        A6.a aVar4 = (A6.a) objF7;
        int iJ = AbstractC6737x0.j(W5.b.a(interfaceC3540lR, 0).b());
        interfaceC3540lR.e(-492369756);
        Object objF8 = interfaceC3540lR.f();
        if (objF8 == aVar3.a()) {
            bVar3 = bVar5;
            objF8 = t1.d(Boolean.FALSE, null, 2, null);
            interfaceC3540lR.K(objF8);
        } else {
            bVar3 = bVar5;
        }
        interfaceC3540lR.P();
        InterfaceC3551q0 interfaceC3551q04 = (InterfaceC3551q0) objF8;
        boolean zBooleanValue = ((Boolean) interfaceC3551q04.f()).booleanValue();
        InterfaceC6835l interfaceC6835lB = interfaceC3551q04.b();
        interfaceC3540lR.e(773894976);
        interfaceC3540lR.e(-492369756);
        Object objF9 = interfaceC3540lR.f();
        if (objF9 == aVar3.a()) {
            A a10 = new A(O.i(C5385j.f46088a, interfaceC3540lR));
            interfaceC3540lR.K(a10);
            objF9 = a10;
        }
        interfaceC3540lR.P();
        N nA = ((A) objF9).a();
        interfaceC3540lR.P();
        Y5.b bVar6 = bVar3;
        InterfaceC6839p interfaceC6839pE = e(interfaceC3551q02, new g(cVar2), new h(nA, cVar2), chart.getBounds(), interfaceC3540lR, 4102);
        O.f(Integer.valueOf(model.getId()), new d(chartScrollSpec, model, bVar4, cVar2, null), interfaceC3540lR, 64);
        androidx.compose.ui.e eVarF = r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
        InterfaceC6835l interfaceC6835lB2 = interfaceC3551q0.b();
        if (aVar == null) {
            interfaceC6835lB2 = null;
        }
        AbstractC7848i.a(T5.a.b(eVarF, interfaceC6835lB2, chartScrollSpec.b() ? cVar2 : null, z10 ? interfaceC6839pE : null, interfaceC8558m), new e(rectF, chart, fVarA, model, aVar4, aVar2, aVar, cVar2, chartScrollSpec, iJ, interfaceC3551q0, autoScaleUp, abstractC5537a, bVar6, bVar, zBooleanValue, interfaceC6835lB, interfaceC3551q03), interfaceC3540lR, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z == null) {
            return;
        }
        x0Z.a(new f(chart, model, dVar, dVar2, dVar3, dVar4, aVar, bVar, aVar2, chartScrollSpec, z10, bVar4, abstractC5537a, autoScaleUp, cVar2, i10, i11, i12));
    }

    public static final E6.e d(InterfaceC3551q0 touchPoint, z1 interaction, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(touchPoint, "touchPoint");
        AbstractC6492s.i(interaction, "interaction");
        interfaceC3540l.e(1555182682);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1555182682, i10, -1, "com.patrykandpatrick.vico.compose.chart.rememberScrollListener (Charts.kt:423)");
        }
        interfaceC3540l.e(-492369756);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new i(touchPoint, interaction);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        i iVar = (i) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return iVar;
    }

    public static final InterfaceC6839p e(InterfaceC3551q0 zoom, InterfaceC6824a getScroll, InterfaceC6835l scrollBy, RectF chartBounds, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(zoom, "zoom");
        AbstractC6492s.i(getScroll, "getScroll");
        AbstractC6492s.i(scrollBy, "scrollBy");
        AbstractC6492s.i(chartBounds, "chartBounds");
        interfaceC3540l.e(1797423512);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1797423512, i10, -1, "com.patrykandpatrick.vico.compose.chart.rememberZoomState (Charts.kt:445)");
        }
        interfaceC3540l.e(-492369756);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new j(zoom, getScroll, chartBounds, scrollBy);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        InterfaceC6839p interfaceC6839p = (InterfaceC6839p) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return interfaceC6839p;
    }
}
