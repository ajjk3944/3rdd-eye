package Z2;

import Ii.N;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import Yg.J;
import Yg.v;
import Yg.z;
import Z2.d;
import Zg.U;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import c0.AbstractC4173b;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import d.AbstractC5263a;
import dh.C5385j;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import org.conscrypt.PSKKeyManager;
import z.InterfaceC8683f;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4182k f25095a = AbstractC4173b.a(new a("pagetitle", "lastloaded", "bundle"), new b("pagetitle", "lastloaded", "bundle"));

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25096a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25097b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, String str3) {
            super(2);
            this.f25096a = str;
            this.f25097b = str2;
            this.f25098c = str3;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke(InterfaceC4184m mapSaver, Z2.h it) {
            AbstractC6492s.i(mapSaver, "$this$mapSaver");
            AbstractC6492s.i(it, "it");
            Bundle bundle = new Bundle();
            WebView webViewG = it.g();
            if (webViewG != null) {
                webViewG.saveState(bundle);
            }
            return U.k(z.a(this.f25096a, it.e()), z.a(this.f25097b, it.c()), z.a(this.f25098c, bundle));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25099a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f25100b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25101c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, String str3) {
            super(1);
            this.f25099a = str;
            this.f25100b = str2;
            this.f25101c = str3;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z2.h invoke(Map it) {
            AbstractC6492s.i(it, "it");
            Z2.h hVar = new Z2.h(d.a.f25090a);
            String str = this.f25099a;
            String str2 = this.f25100b;
            String str3 = this.f25101c;
            hVar.l((String) it.get(str));
            hVar.i((String) it.get(str2));
            hVar.m((Bundle) it.get(str3));
            return hVar;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f25102a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(WebView webView) {
            super(0);
            this.f25102a = webView;
        }

        public final void a() {
            WebView webView = this.f25102a;
            if (webView != null) {
                webView.goBack();
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f25103a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z2.g f25104b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f25105c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Z2.g gVar, WebView webView, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f25104b = gVar;
            this.f25105c = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new d(this.f25104b, this.f25105c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f25103a;
            if (i10 == 0) {
                v.b(obj);
                Z2.g gVar = this.f25104b;
                WebView webView = this.f25105c;
                this.f25103a = 1;
                if (gVar.c(webView, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f25106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Z2.h f25107b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f25108c;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Z2.h f25109a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z2.h hVar) {
                super(0);
                this.f25109a = hVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Z2.d invoke() {
                return this.f25109a.a();
            }
        }

        static final class b implements InterfaceC3221h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f25110a;

            b(WebView webView) {
                this.f25110a = webView;
            }

            @Override // Li.InterfaceC3221h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(Z2.d dVar, InterfaceC5380e interfaceC5380e) {
                if (dVar instanceof d.b) {
                    d.b bVar = (d.b) dVar;
                    this.f25110a.loadUrl(bVar.b(), bVar.a());
                } else {
                    boolean z10 = dVar instanceof d.a;
                }
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Z2.h hVar, WebView webView, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f25107b = hVar;
            this.f25108c = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f25107b, this.f25108c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f25106a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC3220g interfaceC3220gO = o1.o(new a(this.f25107b));
                b bVar = new b(this.f25108c);
                this.f25106a = 1;
                if (interfaceC3220gO.b(bVar, this) == objG) {
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
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: Z2.f$f, reason: collision with other inner class name */
    static final class C0963f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25112b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f25113c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Z2.h f25114d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Z2.a f25115e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z2.b f25116f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0963f(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, FrameLayout.LayoutParams layoutParams, Z2.h hVar, Z2.a aVar, Z2.b bVar) {
            super(1);
            this.f25111a = interfaceC6835l;
            this.f25112b = interfaceC6835l2;
            this.f25113c = layoutParams;
            this.f25114d = hVar;
            this.f25115e = aVar;
            this.f25116f = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView invoke(Context context) {
            WebView webView;
            AbstractC6492s.i(context, "context");
            InterfaceC6835l interfaceC6835l = this.f25111a;
            if (interfaceC6835l == null || (webView = (WebView) interfaceC6835l.invoke(context)) == null) {
                webView = new WebView(context);
            }
            InterfaceC6835l interfaceC6835l2 = this.f25112b;
            FrameLayout.LayoutParams layoutParams = this.f25113c;
            Z2.h hVar = this.f25114d;
            Z2.a aVar = this.f25115e;
            Z2.b bVar = this.f25116f;
            interfaceC6835l2.invoke(webView);
            webView.setLayoutParams(layoutParams);
            Bundle bundleF = hVar.f();
            if (bundleF != null) {
                webView.restoreState(bundleF);
            }
            webView.setWebChromeClient(aVar);
            webView.setWebViewClient(bVar);
            this.f25114d.n(webView);
            return webView;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC6835l interfaceC6835l) {
            super(1);
            this.f25117a = interfaceC6835l;
        }

        public final void a(WebView it) {
            AbstractC6492s.i(it, "it");
            this.f25117a.invoke(it);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z2.h f25118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f25119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f25120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f25121d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Z2.g f25122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25123f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25124g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Z2.b f25125h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Z2.a f25126i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25127j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f25128k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f25129l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Z2.h hVar, FrameLayout.LayoutParams layoutParams, androidx.compose.ui.e eVar, boolean z10, Z2.g gVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, Z2.b bVar, Z2.a aVar, InterfaceC6835l interfaceC6835l3, int i10, int i11) {
            super(2);
            this.f25118a = hVar;
            this.f25119b = layoutParams;
            this.f25120c = eVar;
            this.f25121d = z10;
            this.f25122e = gVar;
            this.f25123f = interfaceC6835l;
            this.f25124g = interfaceC6835l2;
            this.f25125h = bVar;
            this.f25126i = aVar;
            this.f25127j = interfaceC6835l3;
            this.f25128k = i10;
            this.f25129l = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            f.a(this.f25118a, this.f25119b, this.f25120c, this.f25121d, this.f25122e, this.f25123f, this.f25124g, this.f25125h, this.f25126i, this.f25127j, interfaceC3540l, L0.a(this.f25128k | 1), this.f25129l);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final i f25130a = new i();

        i() {
            super(1);
        }

        public final void a(WebView it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return J.f24997a;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final j f25131a = new j();

        j() {
            super(1);
        }

        public final void a(WebView it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return J.f24997a;
        }
    }

    static final class k extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z2.h f25132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f25133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Z2.g f25134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25135d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25136e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z2.b f25137f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Z2.a f25138g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25139h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Z2.h hVar, boolean z10, Z2.g gVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, Z2.b bVar, Z2.a aVar, InterfaceC6835l interfaceC6835l3) {
            super(3);
            this.f25132a = hVar;
            this.f25133b = z10;
            this.f25134c = gVar;
            this.f25135d = interfaceC6835l;
            this.f25136e = interfaceC6835l2;
            this.f25137f = bVar;
            this.f25138g = aVar;
            this.f25139h = interfaceC6835l3;
        }

        public final void a(InterfaceC8683f BoxWithConstraints, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 14) == 0) {
                i11 = i10 | (interfaceC3540l.T(BoxWithConstraints) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1606035789, i11, -1, "com.google.accompanist.web.WebView.<anonymous> (WebView.kt:105)");
            }
            f.a(this.f25132a, new FrameLayout.LayoutParams(Y0.b.j(BoxWithConstraints.d()) ? -1 : -2, Y0.b.i(BoxWithConstraints.d()) ? -1 : -2), androidx.compose.ui.e.f28771b0, this.f25133b, this.f25134c, this.f25135d, this.f25136e, this.f25137f, this.f25138g, this.f25139h, interfaceC3540l, 150995392, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC8683f) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class l extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Z2.h f25140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f25141b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f25142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Z2.g f25143d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25144e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Z2.b f25146g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Z2.a f25147h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f25148i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f25149j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f25150k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Z2.h hVar, androidx.compose.ui.e eVar, boolean z10, Z2.g gVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, Z2.b bVar, Z2.a aVar, InterfaceC6835l interfaceC6835l3, int i10, int i11) {
            super(2);
            this.f25140a = hVar;
            this.f25141b = eVar;
            this.f25142c = z10;
            this.f25143d = gVar;
            this.f25144e = interfaceC6835l;
            this.f25145f = interfaceC6835l2;
            this.f25146g = bVar;
            this.f25147h = aVar;
            this.f25148i = interfaceC6835l3;
            this.f25149j = i10;
            this.f25150k = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            f.b(this.f25140a, this.f25141b, this.f25142c, this.f25143d, this.f25144e, this.f25145f, this.f25146g, this.f25147h, this.f25148i, interfaceC3540l, L0.a(this.f25149j | 1), this.f25150k);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class m extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final m f25151a = new m();

        m() {
            super(1);
        }

        public final void a(WebView it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return J.f24997a;
        }
    }

    static final class n extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final n f25152a = new n();

        n() {
            super(1);
        }

        public final void a(WebView it) {
            AbstractC6492s.i(it, "it");
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((WebView) obj);
            return J.f24997a;
        }
    }

    public static final void a(Z2.h state, FrameLayout.LayoutParams layoutParams, androidx.compose.ui.e eVar, boolean z10, Z2.g gVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, Z2.b bVar, Z2.a aVar, InterfaceC6835l interfaceC6835l3, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        Z2.g gVarC;
        int i12;
        Z2.b bVar2;
        int i13;
        Z2.a aVar2;
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(layoutParams, "layoutParams");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1401343589);
        androidx.compose.ui.e eVar2 = (i11 & 4) != 0 ? androidx.compose.ui.e.f28771b0 : eVar;
        boolean z11 = (i11 & 8) != 0 ? true : z10;
        if ((i11 & 16) != 0) {
            gVarC = c(null, interfaceC3540lR, 0, 1);
            i12 = i10 & (-57345);
        } else {
            gVarC = gVar;
            i12 = i10;
        }
        InterfaceC6835l interfaceC6835l4 = (i11 & 32) != 0 ? m.f25151a : interfaceC6835l;
        InterfaceC6835l interfaceC6835l5 = (i11 & 64) != 0 ? n.f25152a : interfaceC6835l2;
        if ((i11 & 128) != 0) {
            interfaceC3540lR.e(1370705963);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new Z2.b();
                interfaceC3540lR.K(objF);
            }
            bVar2 = (Z2.b) objF;
            interfaceC3540lR.P();
            i12 &= -29360129;
        } else {
            bVar2 = bVar;
        }
        if ((i11 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            interfaceC3540lR.e(1370706051);
            Object objF2 = interfaceC3540lR.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new Z2.a();
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.P();
            int i14 = i12 & (-234881025);
            aVar2 = (Z2.a) objF2;
            i13 = i14;
        } else {
            i13 = i12;
            aVar2 = aVar;
        }
        InterfaceC6835l interfaceC6835l6 = (i11 & 512) != 0 ? null : interfaceC6835l3;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1401343589, i13, -1, "com.google.accompanist.web.WebView (WebView.kt:180)");
        }
        WebView webViewG = state.g();
        AbstractC5263a.a(z11 && gVarC.b(), new c(webViewG), interfaceC3540lR, 0, 0);
        interfaceC3540lR.e(1370706283);
        if (webViewG != null) {
            O.e(webViewG, gVarC, new d(gVarC, webViewG, null), interfaceC3540lR, ((i13 >> 9) & 112) | 520);
            O.e(webViewG, state, new e(state, webViewG, null), interfaceC3540lR, ((i13 << 3) & 112) | 520);
            J j10 = J.f24997a;
        }
        interfaceC3540lR.P();
        bVar2.d(state);
        bVar2.c(gVarC);
        aVar2.b(state);
        C0963f c0963f = new C0963f(interfaceC6835l6, interfaceC6835l4, layoutParams, state, aVar2, bVar2);
        interfaceC3540lR.e(1370708191);
        boolean z12 = (((i10 & 3670016) ^ 1572864) > 1048576 && interfaceC3540lR.l(interfaceC6835l5)) || (i10 & 1572864) == 1048576;
        Object objF3 = interfaceC3540lR.f();
        if (z12 || objF3 == InterfaceC3540l.f21100a.a()) {
            objF3 = new g(interfaceC6835l5);
            interfaceC3540lR.K(objF3);
        }
        interfaceC3540lR.P();
        androidx.compose.ui.viewinterop.e.b(c0963f, eVar2, null, (InterfaceC6835l) objF3, null, interfaceC3540lR, (i13 >> 3) & 112, 20);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new h(state, layoutParams, eVar2, z11, gVarC, interfaceC6835l4, interfaceC6835l5, bVar2, aVar2, interfaceC6835l6, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Z2.h r19, androidx.compose.ui.e r20, boolean r21, Z2.g r22, mh.InterfaceC6835l r23, mh.InterfaceC6835l r24, Z2.b r25, Z2.a r26, mh.InterfaceC6835l r27, T.InterfaceC3540l r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.f.b(Z2.h, androidx.compose.ui.e, boolean, Z2.g, mh.l, mh.l, Z2.b, Z2.a, mh.l, T.l, int, int):void");
    }

    public static final Z2.g c(N n10, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.e(1602323198);
        if ((i11 & 1) != 0) {
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                A a10 = new A(O.i(C5385j.f46088a, interfaceC3540l));
                interfaceC3540l.K(a10);
                objF = a10;
            }
            n10 = ((A) objF).a();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1602323198, i10, -1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:691)");
        }
        interfaceC3540l.e(948350619);
        boolean zT = interfaceC3540l.T(n10);
        Object objF2 = interfaceC3540l.f();
        if (zT || objF2 == InterfaceC3540l.f21100a.a()) {
            objF2 = new Z2.g(n10);
            interfaceC3540l.K(objF2);
        }
        Z2.g gVar = (Z2.g) objF2;
        interfaceC3540l.P();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return gVar;
    }

    public static final Z2.h d(String url, Map map, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        AbstractC6492s.i(url, "url");
        interfaceC3540l.e(1238013775);
        if ((i11 & 2) != 0) {
            map = U.h();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1238013775, i10, -1, "com.google.accompanist.web.rememberWebViewState (WebView.kt:736)");
        }
        interfaceC3540l.e(400020825);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new Z2.h(new d.b(url, map));
            interfaceC3540l.K(objF);
        }
        Z2.h hVar = (Z2.h) objF;
        interfaceC3540l.P();
        hVar.h(new d.b(url, map));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return hVar;
    }
}
