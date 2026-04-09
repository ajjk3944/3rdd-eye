package q;

import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.z1;
import Yg.J;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.C6486l;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.H;
import r.o0;
import r.p0;
import r.s0;
import r.u0;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7391j {

    /* renamed from: q.j$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f58284a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58285b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f58286c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f58287d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f58288e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f58289f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f58290g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, androidx.compose.ui.e eVar, H h10, String str, mh.q qVar, int i10, int i11) {
            super(2);
            this.f58284a = obj;
            this.f58285b = eVar;
            this.f58286c = h10;
            this.f58287d = str;
            this.f58288e = qVar;
            this.f58289f = i10;
            this.f58290g = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7391j.a(this.f58284a, this.f58285b, this.f58286c, this.f58287d, this.f58288e, interfaceC3540l, L0.a(this.f58289f | 1), this.f58290g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: q.j$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f58291a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* renamed from: q.j$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f58292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var) {
            super(1);
            this.f58292a = o0Var;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!AbstractC6492s.d(obj, this.f58292a.p()));
        }
    }

    /* renamed from: q.j$d */
    static final class d extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f58293a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f58294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f58295c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f58296d;

        /* renamed from: q.j$d$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f58297a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1 z1Var) {
                super(1);
                this.f58297a = z1Var;
            }

            public final void a(androidx.compose.ui.graphics.c cVar) {
                cVar.a(d.h(this.f58297a));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.compose.ui.graphics.c) obj);
                return J.f24997a;
            }
        }

        /* renamed from: q.j$d$b */
        static final class b extends AbstractC6494u implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ H f58298a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(H h10) {
                super(3);
                this.f58298a = h10;
            }

            public final H a(o0.b bVar, InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(438406499);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(438406499, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:128)");
                }
                H h10 = this.f58298a;
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return h10;
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                return a((o0.b) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(o0 o0Var, H h10, Object obj, mh.q qVar) {
            super(2);
            this.f58293a = o0Var;
            this.f58294b = h10;
            this.f58295c = obj;
            this.f58296d = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float h(z1 z1Var) {
            return ((Number) z1Var.getValue()).floatValue();
        }

        public final void c(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1426421288, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            o0 o0Var = this.f58293a;
            b bVar = new b(this.f58294b);
            Object obj = this.f58295c;
            s0 s0VarF = u0.f(C6486l.f51726a);
            Object objI = o0Var.i();
            interfaceC3540l.U(-438678252);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f10 = AbstractC6492s.d(objI, obj) ? 1.0f : 0.0f;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            Float fValueOf = Float.valueOf(f10);
            Object objP = o0Var.p();
            interfaceC3540l.U(-438678252);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
            }
            float f11 = AbstractC6492s.d(objP, obj) ? 1.0f : 0.0f;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            z1 z1VarD = p0.d(o0Var, fValueOf, Float.valueOf(f11), (H) bVar.s(o0Var.n(), interfaceC3540l, 0), s0VarF, "FloatAnimation", interfaceC3540l, 0);
            e.a aVar = androidx.compose.ui.e.f28771b0;
            boolean zT = interfaceC3540l.T(z1VarD);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(z1VarD);
                interfaceC3540l.K(objF);
            }
            androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.b.a(aVar, (InterfaceC6835l) objF);
            mh.q qVar = this.f58296d;
            Object obj2 = this.f58295c;
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarA);
            InterfaceC2629g.a aVar2 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar2.a();
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
            E1.c(interfaceC3540lA, cH, aVar2.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar2.g());
            InterfaceC6839p interfaceC6839pB = aVar2.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar2.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            qVar.s(obj2, interfaceC3540l, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: q.j$e */
    static final class e extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o0 f58299a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f58300b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ H f58301c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f58302d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ mh.q f58303e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f58304f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f58305g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(o0 o0Var, androidx.compose.ui.e eVar, H h10, InterfaceC6835l interfaceC6835l, mh.q qVar, int i10, int i11) {
            super(2);
            this.f58299a = o0Var;
            this.f58300b = eVar;
            this.f58301c = h10;
            this.f58302d = interfaceC6835l;
            this.f58303e = qVar;
            this.f58304f = i10;
            this.f58305g = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC7391j.b(this.f58299a, this.f58300b, this.f58301c, this.f58302d, this.f58303e, interfaceC3540l, L0.a(this.f58304f | 1), this.f58305g);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.Object r17, androidx.compose.ui.e r18, r.H r19, java.lang.String r20, mh.q r21, T.InterfaceC3540l r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC7391j.a(java.lang.Object, androidx.compose.ui.e, r.H, java.lang.String, mh.q, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(r.o0 r17, androidx.compose.ui.e r18, r.H r19, mh.InterfaceC6835l r20, mh.q r21, T.InterfaceC3540l r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.AbstractC7391j.b(r.o0, androidx.compose.ui.e, r.H, mh.l, mh.q, T.l, int, int):void");
    }
}
