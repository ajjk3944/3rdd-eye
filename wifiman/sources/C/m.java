package C;

import Ii.AbstractC3063k;
import T.InterfaceC3540l;
import T.L0;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import w.InterfaceC8236C;
import x.InterfaceC8409j;
import x0.InterfaceC8412a;
import z.N;

/* loaded from: classes.dex */
public abstract class m {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f2006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f2008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f2009d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f2010e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f2011f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC1752c f2012g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC8236C f2013h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f2014i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f2015j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f2016k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC8412a f2017l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC8409j f2018m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ mh.r f2019n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f2020o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f2021p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f2022q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C c10, androidx.compose.ui.e eVar, N n10, g gVar, int i10, float f10, c.InterfaceC1752c interfaceC1752c, InterfaceC8236C interfaceC8236C, boolean z10, boolean z11, InterfaceC6835l interfaceC6835l, InterfaceC8412a interfaceC8412a, InterfaceC8409j interfaceC8409j, mh.r rVar, int i11, int i12, int i13) {
            super(2);
            this.f2006a = c10;
            this.f2007b = eVar;
            this.f2008c = n10;
            this.f2009d = gVar;
            this.f2010e = i10;
            this.f2011f = f10;
            this.f2012g = interfaceC1752c;
            this.f2013h = interfaceC8236C;
            this.f2014i = z10;
            this.f2015j = z11;
            this.f2016k = interfaceC6835l;
            this.f2017l = interfaceC8412a;
            this.f2018m = interfaceC8409j;
            this.f2019n = rVar;
            this.f2020o = i11;
            this.f2021p = i12;
            this.f2022q = i13;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            m.a(this.f2006a, this.f2007b, this.f2008c, this.f2009d, this.f2010e, this.f2011f, this.f2012g, this.f2013h, this.f2014i, this.f2015j, this.f2016k, this.f2017l, this.f2018m, this.f2019n, interfaceC3540l, L0.a(this.f2020o | 1), L0.a(this.f2021p), this.f2022q);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f2024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ii.N f2025c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f2026a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f2027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C c10, Ii.N n10) {
                super(0);
                this.f2026a = c10;
                this.f2027b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.f(this.f2026a, this.f2027b));
            }
        }

        /* renamed from: C.m$b$b, reason: collision with other inner class name */
        static final class C0075b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f2028a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f2029b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0075b(C c10, Ii.N n10) {
                super(0);
                this.f2028a = c10;
                this.f2029b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.g(this.f2028a, this.f2029b));
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f2030a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f2031b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C c10, Ii.N n10) {
                super(0);
                this.f2030a = c10;
                this.f2031b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.f(this.f2030a, this.f2031b));
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C f2032a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Ii.N f2033b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C c10, Ii.N n10) {
                super(0);
                this.f2032a = c10;
                this.f2033b = n10;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(m.g(this.f2032a, this.f2033b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, C c10, Ii.N n10) {
            super(1);
            this.f2023a = z10;
            this.f2024b = c10;
            this.f2025c = n10;
        }

        public final void a(J0.w wVar) {
            if (this.f2023a) {
                J0.t.M(wVar, null, new a(this.f2024b, this.f2025c), 1, null);
                J0.t.G(wVar, null, new C0075b(this.f2024b, this.f2025c), 1, null);
            } else {
                J0.t.I(wVar, null, new c(this.f2024b, this.f2025c), 1, null);
                J0.t.K(wVar, null, new d(this.f2024b, this.f2025c), 1, null);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return J.f24997a;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f2034a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f2035b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C c10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f2035b = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new c(this.f2035b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f2034a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C c10 = this.f2035b;
                this.f2034a = 1;
                if (D.f(c10, this) == objG) {
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
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f2036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f2037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C c10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f2037b = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f2037b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f2036a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C c10 = this.f2037b;
                this.f2036a = 1;
                if (D.e(c10, this) == objG) {
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
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(C.C r35, androidx.compose.ui.e r36, z.N r37, C.g r38, int r39, float r40, f0.c.InterfaceC1752c r41, w.InterfaceC8236C r42, boolean r43, boolean r44, mh.InterfaceC6835l r45, x0.InterfaceC8412a r46, x.InterfaceC8409j r47, mh.r r48, T.InterfaceC3540l r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.m.a(C.C, androidx.compose.ui.e, z.N, C.g, int, float, f0.c$c, w.C, boolean, boolean, mh.l, x0.a, x.j, mh.r, T.l, int, int, int):void");
    }

    public static final int d(InterfaceC8409j interfaceC8409j, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16) {
        return AbstractC7137b.e(interfaceC8409j.a(i10, i11, i13, i14, i15, i16) - (f10 * (i11 + i12)));
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, C c10, boolean z10, Ii.N n10, boolean z11) {
        return z11 ? eVar.b0(J0.m.c(androidx.compose.ui.e.f28771b0, false, new b(z10, c10, n10), 1, null)) : eVar.b0(androidx.compose.ui.e.f28771b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(C c10, Ii.N n10) {
        if (!c10.d()) {
            return false;
        }
        AbstractC3063k.d(n10, null, null, new c(c10, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(C c10, Ii.N n10) {
        if (!c10.e()) {
            return false;
        }
        AbstractC3063k.d(n10, null, null, new d(c10, null), 3, null);
        return true;
    }
}
