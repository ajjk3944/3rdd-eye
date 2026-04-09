package androidx.compose.ui.window;

import C0.C;
import C0.D;
import E0.InterfaceC2629g;
import Ii.N;
import J0.w;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.H0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.K;
import T.L;
import T.L0;
import T.z1;
import Yg.J;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.layout.t;
import b0.InterfaceC4038a;
import dh.InterfaceC5380e;
import j0.AbstractC6230a;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f29888a = AbstractC3561w.d(null, a.f29889a, 1, null);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29889a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    static final class C1086b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f29890a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f29891b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f29892c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29893d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y0.t f29894e;

        /* renamed from: androidx.compose.ui.window.b$b$a */
        public static final class a implements K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f29895a;

            public a(k kVar) {
                this.f29895a = kVar;
            }

            @Override // T.K
            public void dispose() {
                this.f29895a.e();
                this.f29895a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1086b(k kVar, InterfaceC6824a interfaceC6824a, r rVar, String str, Y0.t tVar) {
            super(1);
            this.f29890a = kVar;
            this.f29891b = interfaceC6824a;
            this.f29892c = rVar;
            this.f29893d = str;
            this.f29894e = tVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            this.f29890a.r();
            this.f29890a.t(this.f29891b, this.f29892c, this.f29893d, this.f29894e);
            return new a(this.f29890a);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f29896a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f29897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f29898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29899d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y0.t f29900e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar, InterfaceC6824a interfaceC6824a, r rVar, String str, Y0.t tVar) {
            super(0);
            this.f29896a = kVar;
            this.f29897b = interfaceC6824a;
            this.f29898c = rVar;
            this.f29899d = str;
            this.f29900e = tVar;
        }

        public final void a() {
            this.f29896a.t(this.f29897b, this.f29898c, this.f29899d, this.f29900e);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f29901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f29902b;

        public static final class a implements K {
            @Override // T.K
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k kVar, q qVar) {
            super(1);
            this.f29901a = kVar;
            this.f29902b = qVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final K invoke(L l10) {
            this.f29901a.setPositionProvider(this.f29902b);
            this.f29901a.x();
            return new a();
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f29903a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f29904b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f29905c;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29906a = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k kVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f29905c = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            e eVar = new e(this.f29905c, interfaceC5380e);
            eVar.f29904b = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = eh.AbstractC5467b.g()
                int r1 = r3.f29903a
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f29904b
                Ii.N r1 = (Ii.N) r1
                Yg.v.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                Yg.v.b(r4)
                java.lang.Object r4 = r3.f29904b
                Ii.N r4 = (Ii.N) r4
                r1 = r4
            L23:
                boolean r4 = Ii.O.i(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.b$e$a r4 = androidx.compose.ui.window.b.e.a.f29906a
                r3.f29904b = r1
                r3.f29903a = r2
                java.lang.Object r4 = androidx.compose.ui.platform.AbstractC3958w0.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.k r4 = r3.f29905c
                r4.p()
                goto L23
            L3c:
                Yg.J r4 = Yg.J.f24997a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f29907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k kVar) {
            super(1);
            this.f29907a = kVar;
        }

        public final void a(C0.r rVar) {
            C0.r rVarA0 = rVar.a0();
            AbstractC6492s.f(rVarA0);
            this.f29907a.v(rVarA0);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C0.r) obj);
            return J.f24997a;
        }
    }

    static final class g implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f29908a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y0.t f29909b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29910a = new a();

            a() {
                super(1);
            }

            public final void a(t.a aVar) {
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((t.a) obj);
                return J.f24997a;
            }
        }

        g(k kVar, Y0.t tVar) {
            this.f29908a = kVar;
            this.f29909b = tVar;
        }

        @Override // C0.C
        public final D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
            this.f29908a.setParentLayoutDirection(this.f29909b);
            return androidx.compose.ui.layout.m.x0(mVar, 0, 0, null, a.f29910a, 4, null);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f29911a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f29912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f29913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29914d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29915e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29916f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(q qVar, InterfaceC6824a interfaceC6824a, r rVar, InterfaceC6839p interfaceC6839p, int i10, int i11) {
            super(2);
            this.f29911a = qVar;
            this.f29912b = interfaceC6824a;
            this.f29913c = rVar;
            this.f29914d = interfaceC6839p;
            this.f29915e = i10;
            this.f29916f = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            b.a(this.f29911a, this.f29912b, this.f29913c, this.f29914d, interfaceC3540l, L0.a(this.f29915e | 1), this.f29916f);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f29917a = new i();

        i() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f29918a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1 f29919b;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29920a = new a();

            a() {
                super(1);
            }

            public final void a(w wVar) {
                J0.t.Q(wVar);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((w) obj);
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.ui.window.b$j$b, reason: collision with other inner class name */
        static final class C1087b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f29921a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1087b(k kVar) {
                super(1);
                this.f29921a = kVar;
            }

            public final void a(long j10) {
                this.f29921a.m5setPopupContentSizefhxjrPA(Y0.r.b(j10));
                this.f29921a.x();
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Y0.r) obj).j());
                return J.f24997a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z1 f29922a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(z1 z1Var) {
                super(2);
                this.f29922a = z1Var;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(606497925, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                }
                b.b(this.f29922a).invoke(interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k kVar, z1 z1Var) {
            super(2);
            this.f29918a = kVar;
            this.f29919b = z1Var;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
            }
            androidx.compose.ui.e eVarC = J0.m.c(androidx.compose.ui.e.f28771b0, false, a.f29920a, 1, null);
            boolean zL = interfaceC3540l.l(this.f29918a);
            k kVar = this.f29918a;
            Object objF = interfaceC3540l.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C1087b(kVar);
                interfaceC3540l.K(objF);
            }
            androidx.compose.ui.e eVarA = AbstractC6230a.a(androidx.compose.ui.layout.q.a(eVarC, (InterfaceC6835l) objF), this.f29918a.getCanCalculatePosition() ? 1.0f : 0.0f);
            InterfaceC4038a interfaceC4038aE = b0.c.e(606497925, true, new c(this.f29919b), interfaceC3540l, 54);
            androidx.compose.ui.window.c cVar = androidx.compose.ui.window.c.f29923a;
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
            E1.c(interfaceC3540lA, cVar, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            interfaceC4038aE.invoke(interfaceC3540l, 6);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.window.q r35, mh.InterfaceC6824a r36, androidx.compose.ui.window.r r37, mh.InterfaceC6839p r38, T.InterfaceC3540l r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(androidx.compose.ui.window.q, mh.a, androidx.compose.ui.window.r, mh.p, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6839p b(z1 z1Var) {
        return (InterfaceC6839p) z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(boolean z10, s sVar, boolean z11) {
        int i10 = !z10 ? 262152 : 262144;
        if (sVar == s.SecureOn) {
            i10 |= 8192;
        }
        return !z11 ? i10 | 512 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(r rVar, boolean z10) {
        return (rVar.e() && z10) ? rVar.d() | 8192 : (!rVar.e() || z10) ? rVar.d() : rVar.d() & (-8193);
    }

    public static final boolean i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y0.p j(Rect rect) {
        return new Y0.p(rect.left, rect.top, rect.right, rect.bottom);
    }
}
