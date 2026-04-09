package qf;

import Ii.N;
import L9.AbstractC3198d;
import L9.E;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.O;
import Yg.J;
import Yg.s;
import Yg.v;
import Z2.h;
import android.content.res.Resources;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import qf.AbstractC7474a;
import qf.AbstractC7477d;
import xe.InterfaceC8511f;
import z.j0;

/* renamed from: qf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7477d {

    /* renamed from: qf.d$a */
    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8511f.b f58666a;

        a(InterfaceC8511f.b bVar) {
            this.f58666a = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC8511f.b bVar) {
            bVar.a();
            return J.f24997a;
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(372288726, i10, -1, "com.ui.wifiman.ui.sso.settings.SSOAccountSettingsUi.<anonymous> (SSOAccountSettingsUi.kt:29)");
            }
            androidx.compose.ui.e eVarC = j0.c(r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null));
            AbstractC3198d.a aVar = AbstractC3198d.a.f11402b;
            String strA = H0.f.a(AbstractC6780c.f53411U1, interfaceC3540l, 0);
            interfaceC3540l.U(2025729724);
            boolean zT = interfaceC3540l.T(this.f58666a);
            final InterfaceC8511f.b bVar = this.f58666a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: qf.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC7477d.a.c(bVar);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            E.i(eVarC, strA, aVar, (InterfaceC6824a) objF, null, 0L, 0L, 0L, 0.0f, null, 0.0f, interfaceC3540l, AbstractC3198d.a.f11403c << 6, 0, 2032);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
            b((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    /* renamed from: qf.d$b */
    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC7474a.C2066a f58667a;

        /* renamed from: qf.d$b$a */
        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f58668a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC7474a.C2066a f58669b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC7474a.C2066a c2066a, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f58669b = c2066a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void E(Boolean bool) {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void v(Boolean bool) {
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f58669b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f58668a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                CookieManager cookieManager = CookieManager.getInstance();
                AbstractC7474a.C2066a c2066a = this.f58669b;
                cookieManager.removeAllCookies(new ValueCallback() { // from class: qf.f
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        AbstractC7477d.b.a.v((Boolean) obj2);
                    }
                });
                cookieManager.flush();
                for (s sVar : c2066a.a()) {
                    cookieManager.setCookie((String) sVar.a(), (String) sVar.c(), new ValueCallback() { // from class: qf.g
                        @Override // android.webkit.ValueCallback
                        public final void onReceiveValue(Object obj2) {
                            AbstractC7477d.b.a.E((Boolean) obj2);
                        }
                    });
                }
                cookieManager.flush();
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        b(AbstractC7474a.C2066a c2066a) {
            this.f58667a = c2066a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(AbstractC7474a.C2066a c2066a, WebView webView) {
            AbstractC6492s.i(webView, "webView");
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            webView.loadUrl(c2066a.b());
            return J.f24997a;
        }

        public final void b(z.N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(scaffoldPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(27194301, i11, -1, "com.ui.wifiman.ui.sso.settings.SSOAccountSettingsUi.<anonymous> (SSOAccountSettingsUi.kt:39)");
            }
            AbstractC7474a.C2066a c2066a = this.f58667a;
            if (c2066a != null) {
                h hVarD = Z2.f.d(c2066a.b(), null, interfaceC3540l, 0, 2);
                AbstractC7474a.C2066a c2066a2 = this.f58667a;
                interfaceC3540l.U(2025737463);
                boolean zT = interfaceC3540l.T(this.f58667a);
                AbstractC7474a.C2066a c2066a3 = this.f58667a;
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new a(c2066a3, null);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                O.f(c2066a2, (InterfaceC6839p) objF, interfaceC3540l, 0);
                androidx.compose.ui.e eVarH = o.h(androidx.compose.ui.e.f28771b0, scaffoldPadding);
                interfaceC3540l.U(2025757006);
                boolean zT2 = interfaceC3540l.T(this.f58667a);
                final AbstractC7474a.C2066a c2066a4 = this.f58667a;
                Object objF2 = interfaceC3540l.f();
                if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new InterfaceC6835l() { // from class: qf.e
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return AbstractC7477d.b.c(c2066a4, (WebView) obj);
                        }
                    };
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                Z2.f.b(hVarD, eVarH, false, null, (InterfaceC6835l) objF2, null, null, null, null, interfaceC3540l, 0, 492);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((z.N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(qf.AbstractC7474a r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.AbstractC7477d.b(qf.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(AbstractC7474a abstractC7474a, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(abstractC7474a, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
