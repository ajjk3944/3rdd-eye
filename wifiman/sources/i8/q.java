package i8;

import Ye.e;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
import com.ubnt.usurvey.a;
import com.ui.core.ui.sso.UiSSO;
import com.ui.wifiman.model.speedtest.Speedtest;
import dc.C5341a;
import e7.EnumC5426b;
import ec.AbstractC5452a;
import ff.EnumC5821b;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hc.C5973a;
import i8.InterfaceC6084a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C6323f;
import kg.InterfaceC6466c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import nc.InterfaceC6924a;
import nf.e;
import p000if.C6148a;
import sf.C7951b;
import xe.AbstractC8464F;
import xe.C8465G;
import xe.C8466H;

/* loaded from: classes3.dex */
public final class q implements InterfaceC6084a {

    /* renamed from: h, reason: collision with root package name */
    public static final C6097a f48971h = new C6097a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f48972i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final P8.f f48973a;

    /* renamed from: b, reason: collision with root package name */
    private final nc.j f48974b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6924a f48975c;

    /* renamed from: d, reason: collision with root package name */
    private final a.b f48976d;

    /* renamed from: e, reason: collision with root package name */
    private final String f48977e;

    /* renamed from: f, reason: collision with root package name */
    private final Hg.d f48978f;

    /* renamed from: g, reason: collision with root package name */
    private final gg.s f48979g;

    public static final class A implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.j.a.f65698a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class A0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.f.b.f65683a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class B implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.e(e.c.f54652a)));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class B0 implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48980a;

        public B0(InterfaceC6084a.b bVar) {
            this.f48980a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.b.C2327b(((InterfaceC6084a.b.C6090h) this.f48980a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class C implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.l.a.f65706a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class C0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.c.b.f65678a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class D implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48981a;

        public D(InterfaceC6084a.b bVar) {
            this.f48981a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.e(new e.a(((InterfaceC6084a.b.B.c.C1817a) this.f48981a).a().a(), ((InterfaceC6084a.b.B.c.C1817a) this.f48981a).a().d(), ((InterfaceC6084a.b.B.c.C1817a) this.f48981a).a().c(), ((InterfaceC6084a.b.B.c.C1817a) this.f48981a).a().b()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class D0 implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48983b;

        D0(InterfaceC6084a.b bVar) {
            this.f48983b = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6084a.AbstractC1811a invoke(Context it) {
            AbstractC6492s.i(it, "it");
            InterfaceC6835l interfaceC6835lB = InterfaceC6924a.C1986a.b(q.this.f48975c, null, ((InterfaceC6084a.b.x) this.f48983b).a(), 1, null);
            return q.this.f48974b.a(interfaceC6835lB) ? new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, interfaceC6835lB, 15, null) : new InterfaceC6084a.AbstractC1811a.g(new C5973a(new AbstractC5452a.C1741a(com.ubnt.usurvey.R.string.third_party_app_unavailable_share_image, new Object[0]), false, 2, null));
        }
    }

    public static final class E implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48984a;

        public E(InterfaceC6084a.b bVar) {
            this.f48984a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.e(new e.d(((InterfaceC6084a.b.B.c.d) this.f48984a).a().a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class E0 implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final E0 f48985a = new E0();

        E0() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context context) {
            AbstractC6492s.i(context, "context");
            OssLicensesMenuActivity.V0(context.getString(com.ubnt.usurvey.R.string.settings_acknowledgements));
            return new Intent(context, (Class<?>) OssLicensesMenuActivity.class);
        }
    }

    public static final class F implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48986a;

        public F(InterfaceC6084a.b bVar) {
            this.f48986a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.e(new e.b(((InterfaceC6084a.b.B.c.C1818b) this.f48986a).b(), ((InterfaceC6084a.b.B.c.C1818b) this.f48986a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class F0 implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48988b;

        F0(InterfaceC6084a.b bVar) {
            this.f48988b = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6084a.AbstractC1811a invoke(Context it) {
            AbstractC6492s.i(it, "it");
            InterfaceC6835l interfaceC6835lA = InterfaceC6924a.C1986a.a(q.this.f48975c, null, ((InterfaceC6084a.b.y) this.f48988b).a(), ((InterfaceC6084a.b.y) this.f48988b).b(), 1, null);
            return q.this.f48974b.a(interfaceC6835lA) ? new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, interfaceC6835lA, 15, null) : new InterfaceC6084a.AbstractC1811a.g(new C5973a(new AbstractC5452a.C1741a(com.ubnt.usurvey.R.string.third_party_app_unavailable_file_share, new Object[0]), false, 2, null));
        }
    }

    public static final class G implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48989a;

        public G(InterfaceC6084a.b bVar) {
            this.f48989a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.b(new C6323f(((InterfaceC6084a.b.B.AbstractC1814b.C1815a) this.f48989a).b(), ((InterfaceC6084a.b.B.AbstractC1814b.C1815a) this.f48989a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class G0 implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48990a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f48991b;

        G0(InterfaceC6084a.b bVar, q qVar) {
            this.f48990a = bVar;
            this.f48991b = qVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context context) {
            AbstractC6492s.i(context, "context");
            return UiSSO.c(UiSSO.f41376a, context, null, ((InterfaceC6084a.b.t) this.f48990a).a(), null, true, null, this.f48991b.f48976d.getConfig().m() ? new UiSSO.e(null, null, 3, null) : null, 42, null);
        }
    }

    public static final class H implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.d.f65679a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class H0 implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48993b;

        H0(InterfaceC6084a.b bVar) {
            this.f48993b = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6084a.AbstractC1811a invoke(Context it) {
            AbstractC6492s.i(it, "it");
            InterfaceC6835l interfaceC6835lG = q.this.f48975c.g(null, ((InterfaceC6084a.b.D.d) this.f48993b).c(), ((InterfaceC6084a.b.D.d) this.f48993b).d(), ((InterfaceC6084a.b.D.d) this.f48993b).b(), ((InterfaceC6084a.b.D.d) this.f48993b).a());
            return q.this.f48974b.a(interfaceC6835lG) ? new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, interfaceC6835lG, 15, null) : new InterfaceC6084a.AbstractC1811a.g(new C5973a(new AbstractC5452a.C1741a(com.ubnt.usurvey.R.string.third_party_app_unavailable_email, new Object[0]), false, 2, null));
        }
    }

    public static final class I implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48994a;

        public I(InterfaceC6084a.b bVar) {
            this.f48994a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            EnumC5821b enumC5821b;
            try {
                Speedtest.Error errorA = ((InterfaceC6084a.b.B.AbstractC1814b.C1816b) this.f48994a).a();
                if (errorA instanceof Speedtest.Error.Internal) {
                    enumC5821b = EnumC5821b.INTERNAL;
                } else if (errorA instanceof Speedtest.Error.NetworkConnection) {
                    enumC5821b = EnumC5821b.SERVER_UNREACHABLE;
                } else {
                    if (!(errorA instanceof Speedtest.Error.Unexpected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC5821b = EnumC5821b.UNEXPECTED;
                }
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.f(new C6148a(enumC5821b))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class I0 implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48996b;

        I0(InterfaceC6084a.b bVar) {
            this.f48996b = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6084a.AbstractC1811a invoke(Context it) {
            AbstractC6492s.i(it, "it");
            InterfaceC6835l interfaceC6835lE = q.this.f48975c.e(new AbstractC5452a.b(((InterfaceC6084a.b.D.c) this.f48996b).a()));
            return q.this.f48974b.a(interfaceC6835lE) ? new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, interfaceC6835lE, 15, null) : new InterfaceC6084a.AbstractC1811a.g(new C5973a(new AbstractC5452a.C1741a(com.ubnt.usurvey.R.string.third_party_app_unavailable_dial, new Object[0]), false, 2, null));
        }
    }

    public static final class J implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48997a;

        public J(InterfaceC6084a.b bVar) {
            this.f48997a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.l.c(new com.ui.wifiman.ui.speedtest.feedback.c(((InterfaceC6084a.b.B.AbstractC1814b.c) this.f48997a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class J0 implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f48998a;

        J0(InterfaceC6084a.b bVar) {
            this.f48998a = bVar;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context context) {
            AbstractC6492s.i(context, "<unused var>");
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", ((InterfaceC6084a.b.D.f) this.f48998a).a());
            Intent intentCreateChooser = Intent.createChooser(intent, ((InterfaceC6084a.b.D.f) this.f48998a).b());
            AbstractC6492s.h(intentCreateChooser, "createChooser(...)");
            return intentCreateChooser;
        }
    }

    public static final class K implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.l.d.f65709a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class K0 implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final K0 f48999a = new K0();

        K0() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context it) {
            AbstractC6492s.i(it, "it");
            return new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
        }
    }

    public static final class L implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49000a;

        public L(InterfaceC6084a.b bVar) {
            this.f49000a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.m.c(new C7951b(((InterfaceC6084a.b.E.d) this.f49000a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class L0 implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final L0 f49001a = new L0();

        L0() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context it) {
            AbstractC6492s.i(it, "it");
            return Build.VERSION.SDK_INT >= 29 ? new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY") : new Intent("android.settings.WIFI_SETTINGS");
        }
    }

    public static final class M implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.m.d.f65715a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class M0 implements InterfaceC6835l {
        M0() {
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context it) {
            AbstractC6492s.i(it, "it");
            if (Build.VERSION.SDK_INT < 33) {
                throw new IllegalStateException("AppLanguageSettings intent is available since Android 13. Invoking it before that is a bug!!!");
            }
            Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
            intent.setData(Uri.fromParts("package", q.this.f48977e, null));
            return intent;
        }
    }

    public static final class N implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49003a;

        public N(InterfaceC6084a.b bVar) {
            this.f49003a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.m.e(new com.ui.wifiman.ui.teleport.L(((InterfaceC6084a.b.E.e) this.f49003a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    static final class N0 implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final N0 f49004a = new N0();

        N0() {
        }

        public final void a(Activity context) {
            AbstractC6492s.i(context, "context");
            EnumC5426b.Companion.f(context);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Activity) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class O implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49005a;

        public O(InterfaceC6084a.b bVar) {
            this.f49005a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.m.a(new com.ui.wifiman.ui.teleport.consoles.b(((InterfaceC6084a.b.E.C1822a) this.f49005a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class O0 implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b[] f49006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f49007b;

        public O0(InterfaceC6084a.b[] bVarArr, q qVar) {
            this.f49006a = bVarArr;
            this.f49007b = qVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("ROUTING - request '" + this.f49006a + "'", null, 2, null);
                this.f49007b.f48978f.h(AbstractC3682n.d1(this.f49006a));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public static final class P implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49008a;

        public P(InterfaceC6084a.b bVar) {
            this.f49008a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.m.b(new com.ui.wifiman.ui.teleport.consoles.v(((InterfaceC6084a.b.E.C1823b) this.f49008a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class Q implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.e.f65694a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class R implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.b.f65691a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class S implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.e.b.f65681a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class T implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.h.f65697a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class U implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.d.f65693a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class V implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.f.f65695a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class W implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.g.f65696a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class X implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.c.f65692a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class Y implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.i.a.f65690a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class Z implements gg.q {
        public Z() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse("https://www.ui.com/legal/privacypolicy/");
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$a, reason: case insensitive filesystem */
    public static final class C6097a {
        public /* synthetic */ C6097a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6097a() {
        }
    }

    /* renamed from: i8.q$a0, reason: case insensitive filesystem */
    public static final class C6098a0 implements gg.q {
        public C6098a0() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse("https://www.ui.com/legal/termsofservice/");
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$b, reason: case insensitive filesystem */
    private static final class C6099b {

        /* renamed from: a, reason: collision with root package name */
        private final long f49011a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC6084a.b f49012b;

        public C6099b(long j10, InterfaceC6084a.b request) {
            AbstractC6492s.i(request, "request");
            this.f49011a = j10;
            this.f49012b = request;
        }

        public final InterfaceC6084a.b a() {
            return this.f49012b;
        }

        public final long b() {
            return this.f49011a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6099b) {
                C6099b c6099b = (C6099b) obj;
                if (AbstractC6492s.d(this.f49012b.getClass(), c6099b.f49012b.getClass()) && c6099b.f49011a == this.f49011a) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f49012b.hashCode();
        }
    }

    /* renamed from: i8.q$b0, reason: case insensitive filesystem */
    public static final class C6100b0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, E0.f48985a, 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$c, reason: case insensitive filesystem */
    static final class C6101c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C6101c f49013a = new C6101c();

        C6101c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.v apply(List list) {
            AbstractC6492s.f(list);
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C6099b(System.currentTimeMillis(), (InterfaceC6084a.b) it.next()));
            }
            return Ag.d.a(arrayList);
        }
    }

    /* renamed from: i8.q$c0, reason: case insensitive filesystem */
    public static final class C6102c0 implements gg.q {
        public C6102c0() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse("https://play.google.com/store/apps/dev?id=7059424641738398829");
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$d, reason: case insensitive filesystem */
    static final class C6103d implements InterfaceC6466c {

        /* renamed from: a, reason: collision with root package name */
        public static final C6103d f49015a = new C6103d();

        C6103d() {
        }

        @Override // kg.InterfaceC6466c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final boolean a(C6099b prev, C6099b current) {
            AbstractC6492s.i(prev, "prev");
            AbstractC6492s.i(current, "current");
            return AbstractC6492s.d(current.a(), prev.a()) && current.b() < prev.b() + 1000;
        }
    }

    /* renamed from: i8.q$d0, reason: case insensitive filesystem */
    public static final class C6104d0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.e.a.f65680a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$e, reason: case insensitive filesystem */
    static final class C6105e implements kg.n {
        C6105e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6099b it) {
            AbstractC6492s.i(it, "it");
            return q.this.m(it.a());
        }
    }

    /* renamed from: i8.q$e0, reason: case insensitive filesystem */
    public static final class C6106e0 implements gg.q {
        public C6106e0() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse("https://community.ui.com");
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$f, reason: case insensitive filesystem */
    public static final class C6107f implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.c.a.f65677a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$f0, reason: case insensitive filesystem */
    public static final class C6108f0 implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49019b;

        public C6108f0(InterfaceC6084a.b bVar) {
            this.f49019b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.C1812a(q.this.new F0(this.f49019b)));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$g, reason: case insensitive filesystem */
    public static final class C6109g implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(C8466H.f65722a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$g0, reason: case insensitive filesystem */
    public static final class C6110g0 implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f49021b;

        public C6110g0(InterfaceC6084a.b bVar, q qVar) {
            this.f49020a = bVar;
            this.f49021b = qVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(Integer.valueOf(android.R.anim.fade_in), Integer.valueOf(android.R.anim.fade_out), Integer.valueOf(O7.a.SSO_ACCOUNT_DONE.getCode()), false, new G0(this.f49020a, this.f49021b), 8, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$h, reason: case insensitive filesystem */
    public static final class C6111h implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(C8465G.f65721a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$h0, reason: case insensitive filesystem */
    public static final class C6112h0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.h.c.f65689a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$i, reason: case insensitive filesystem */
    public static final class C6113i implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49022a;

        public C6113i(InterfaceC6084a.b bVar) {
            this.f49022a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.p.a(((InterfaceC6084a.b.J.C1824a) this.f49022a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$i0, reason: case insensitive filesystem */
    public static final class C6114i0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.h.b.f65688a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$j, reason: case insensitive filesystem */
    public static final class C6115j implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.p.b.f65720a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$j0, reason: case insensitive filesystem */
    public static final class C6116j0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.h.a.f65687a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$k, reason: case insensitive filesystem */
    public static final class C6117k implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49023a;

        public C6117k(InterfaceC6084a.b bVar) {
            this.f49023a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.n(((InterfaceC6084a.b.K) this.f49023a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$k0, reason: case insensitive filesystem */
    public static final class C6118k0 implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49025b;

        public C6118k0(InterfaceC6084a.b bVar) {
            this.f49025b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.C1812a(q.this.new H0(this.f49025b)));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$l, reason: case insensitive filesystem */
    public static final class C6119l implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49026a;

        public C6119l(InterfaceC6084a.b bVar) {
            this.f49026a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.o(((InterfaceC6084a.b.I) this.f49026a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$l0, reason: case insensitive filesystem */
    public static final class C6120l0 implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49028b;

        public C6120l0(InterfaceC6084a.b bVar) {
            this.f49028b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.C1812a(q.this.new I0(this.f49028b)));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$m, reason: case insensitive filesystem */
    public static final class C6121m implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49030b;

        public C6121m(InterfaceC6084a.b bVar) {
            this.f49030b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, q.this.f48975c.c(((InterfaceC6084a.b.C) this.f49030b).a()), 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$m0, reason: case insensitive filesystem */
    public static final class C6122m0 implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49031a;

        public C6122m0(InterfaceC6084a.b bVar) {
            this.f49031a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, new J0(this.f49031a), 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$n, reason: case insensitive filesystem */
    public static final class C6123n implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49033b;

        public C6123n(InterfaceC6084a.b bVar) {
            this.f49033b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.C1812a(q.this.new D0(this.f49033b)));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$n0, reason: case insensitive filesystem */
    public static final class C6124n0 implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49034a;

        public C6124n0(InterfaceC6084a.b bVar) {
            this.f49034a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.k(((InterfaceC6084a.b.A) this.f49034a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$o, reason: case insensitive filesystem */
    public static final class C6125o implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49035a;

        public C6125o(InterfaceC6084a.b bVar) {
            this.f49035a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.g(((InterfaceC6084a.b.C6085c) this.f49035a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$o0, reason: case insensitive filesystem */
    public static final class C6126o0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                InterfaceC6084a.AbstractC1811a.d dVar = InterfaceC6084a.AbstractC1811a.d.f48871a;
                if (dVar != null) {
                    oVar.onSuccess(dVar);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$p, reason: case insensitive filesystem */
    public static final class C6127p implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.e());
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class p0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, K0.f48999a, 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$q, reason: collision with other inner class name */
    public static final class C1841q implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49036a;

        public C1841q(InterfaceC6084a.b bVar) {
            this.f49036a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, ((InterfaceC6084a.b.AbstractC6087e.C1831a) this.f49036a).a().a(), 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class q0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, L0.f49001a, 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$r, reason: case insensitive filesystem */
    public static final class C6128r implements gg.q {
        public C6128r() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse("https://help.ui.com/hc/en-us/articles/5246403561495-UniFi-Gateway-Teleport-VPN");
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class r0 implements gg.q {
        public r0() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, q.this.new M0(), 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$s, reason: case insensitive filesystem */
    public static final class C6129s implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49039a;

        public C6129s(InterfaceC6084a.b bVar) {
            this.f49039a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.j.e(new e.b(((h) this.f49039a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class s0 implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49041b;

        public s0(InterfaceC6084a.b bVar) {
            this.f49041b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                InterfaceC6835l interfaceC6835lA = q.this.f48975c.a(((InterfaceC6084a.b.m) this.f49041b).a());
                if (interfaceC6835lA == null) {
                    interfaceC6835lA = q.this.f48975c.c(((InterfaceC6084a.b.m) this.f49041b).a());
                }
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, interfaceC6835lA, 15, null));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$t, reason: case insensitive filesystem */
    public static final class C6130t implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49042a;

        public C6130t(InterfaceC6084a.b bVar) {
            this.f49042a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.j.e(new e.a(((g) this.f49042a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class t0 implements gg.q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49044b;

        public t0(InterfaceC6084a.b bVar) {
            this.f49044b = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse(((InterfaceC6084a.b.o) this.f49044b).a());
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$u, reason: case insensitive filesystem */
    public static final class C6131u implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49045a;

        public C6131u(InterfaceC6084a.b bVar) {
            this.f49045a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.j.c(new We.a(((InterfaceC6084a.b.AbstractC6093k.C1836b) this.f49045a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class u0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.b(N0.f49004a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$v, reason: case insensitive filesystem */
    public static final class C6132v implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49046a;

        public C6132v(InterfaceC6084a.b bVar) {
            this.f49046a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.j.d(new Xe.a(((InterfaceC6084a.b.AbstractC6093k.c) this.f49046a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class v0 implements gg.q {
        public v0() {
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                q qVar = q.this;
                Uri uri = Uri.parse("https://developers.google.com/ar/devices#google_play_devices");
                AbstractC6492s.h(uri, "parse(...)");
                InterfaceC6084a.AbstractC1811a abstractC1811aK = qVar.k(uri);
                if (abstractC1811aK != null) {
                    oVar.onSuccess(abstractC1811aK);
                } else {
                    oVar.a();
                }
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$w, reason: case insensitive filesystem */
    public static final class C6133w implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49048a;

        public C6133w(InterfaceC6084a.b bVar) {
            this.f49048a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.b.a(((InterfaceC6084a.b.C6091i) this.f49048a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class w0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.f.c.f65684a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$x, reason: case insensitive filesystem */
    public static final class C6134x implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49049a;

        public C6134x(InterfaceC6084a.b bVar) {
            this.f49049a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.j.b(new Ve.a(((InterfaceC6084a.b.AbstractC6093k.C1835a) this.f49049a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class x0 implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49050a;

        public x0(InterfaceC6084a.b bVar) {
            this.f49050a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.b.a(((InterfaceC6084a.b.C6089g) this.f49050a).a())));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$y, reason: case insensitive filesystem */
    public static final class C6135y implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.j.f.f65703a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class y0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.f.d.f65685a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    /* renamed from: i8.q$z, reason: case insensitive filesystem */
    public static final class C6136z implements gg.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6084a.b f49051a;

        public C6136z(InterfaceC6084a.b bVar) {
            this.f49051a = bVar;
        }

        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(new AbstractC8464F.j.g(new com.ui.wifiman.ui.signal.D(((InterfaceC6084a.b.p.C1838b) this.f49051a).a()))));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public static final class z0 implements gg.q {
        @Override // gg.q
        public final void a(gg.o oVar) {
            try {
                oVar.onSuccess(new InterfaceC6084a.AbstractC1811a.f(AbstractC8464F.f.a.f65682a));
            } catch (Throwable th2) {
                oVar.onError(th2);
            }
        }
    }

    public q(P8.f wmwPopupController, nc.j intentService, InterfaceC6924a intentFactory, a.b appConfigurationManager, C5341a buildConfig) {
        AbstractC6492s.i(wmwPopupController, "wmwPopupController");
        AbstractC6492s.i(intentService, "intentService");
        AbstractC6492s.i(intentFactory, "intentFactory");
        AbstractC6492s.i(appConfigurationManager, "appConfigurationManager");
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f48973a = wmwPopupController;
        this.f48974b = intentService;
        this.f48975c = intentFactory;
        this.f48976d = appConfigurationManager;
        this.f48977e = buildConfig.a();
        Hg.d dVarI1 = Hg.b.k1().i1();
        AbstractC6492s.h(dVarI1, "toSerialized(...)");
        this.f48978f = dVarI1;
        gg.s sVarL1 = dVarI1.o0(Gg.a.a()).Q(C6101c.f49013a).w(C6103d.f49015a).W(new C6105e()).r0().l1();
        AbstractC6492s.h(sVarL1, "refCount(...)");
        this.f48979g = sVarL1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC6084a.AbstractC1811a k(final Uri uri) {
        return new InterfaceC6084a.AbstractC1811a.C1812a(new InterfaceC6835l() { // from class: i8.p
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return q.l(this.f48969a, uri, (Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6084a.AbstractC1811a l(q qVar, Uri uri, Context it) {
        AbstractC6492s.i(it, "it");
        InterfaceC6835l interfaceC6835lF = qVar.f48975c.f(uri);
        return qVar.f48974b.a(interfaceC6835lF) ? new InterfaceC6084a.AbstractC1811a.h(null, null, null, false, interfaceC6835lF, 15, null) : new InterfaceC6084a.AbstractC1811a.g(new C5973a(new AbstractC5452a.C1741a(com.ubnt.usurvey.R.string.third_party_app_unavailable_internet_browser, new Object[0]), false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.n m(InterfaceC6084a.b bVar) {
        if (bVar instanceof InterfaceC6084a.b.C6085c) {
            gg.n nVarC = gg.n.c(new C6125o(bVar));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
        if (bVar instanceof InterfaceC6084a.b.C6091i) {
            gg.n nVarC2 = gg.n.c(new C6133w(bVar));
            AbstractC6492s.h(nVarC2, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC2;
        }
        if (bVar instanceof InterfaceC6084a.b.C6094l) {
            gg.n nVarC3 = gg.n.c(new H());
            AbstractC6492s.h(nVarC3, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC3;
        }
        if (bVar instanceof j) {
            gg.n nVarC4 = gg.n.c(new S());
            AbstractC6492s.h(nVarC4, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC4;
        }
        if (bVar instanceof i) {
            gg.n nVarC5 = gg.n.c(new C6104d0());
            AbstractC6492s.h(nVarC5, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC5;
        }
        if (bVar instanceof InterfaceC6084a.b.A) {
            gg.n nVarC6 = gg.n.c(new C6124n0(bVar));
            AbstractC6492s.h(nVarC6, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC6;
        }
        if (bVar instanceof InterfaceC6084a.b.C6089g) {
            gg.n nVarC7 = gg.n.c(new x0(bVar));
            AbstractC6492s.h(nVarC7, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC7;
        }
        if (bVar instanceof InterfaceC6084a.b.C6090h) {
            gg.n nVarC8 = gg.n.c(new B0(bVar));
            AbstractC6492s.h(nVarC8, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC8;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6092j.C1834b) {
            gg.n nVarC9 = gg.n.c(new C0());
            AbstractC6492s.h(nVarC9, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC9;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6092j.C1833a) {
            gg.n nVarC10 = gg.n.c(new C6107f());
            AbstractC6492s.h(nVarC10, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC10;
        }
        if (bVar instanceof InterfaceC6084a.b.v.C1840b) {
            gg.n nVarC11 = gg.n.c(new C6109g());
            AbstractC6492s.h(nVarC11, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC11;
        }
        if (bVar instanceof InterfaceC6084a.b.v.C1839a) {
            gg.n nVarC12 = gg.n.c(new C6111h());
            AbstractC6492s.h(nVarC12, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC12;
        }
        if (bVar instanceof InterfaceC6084a.b.J.C1824a) {
            gg.n nVarC13 = gg.n.c(new C6113i(bVar));
            AbstractC6492s.h(nVarC13, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC13;
        }
        if (bVar instanceof InterfaceC6084a.b.J.C1825b) {
            gg.n nVarC14 = gg.n.c(new C6115j());
            AbstractC6492s.h(nVarC14, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC14;
        }
        if (bVar instanceof InterfaceC6084a.b.K) {
            gg.n nVarC15 = gg.n.c(new C6117k(bVar));
            AbstractC6492s.h(nVarC15, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC15;
        }
        if (bVar instanceof InterfaceC6084a.b.I) {
            gg.n nVarC16 = gg.n.c(new C6119l(bVar));
            AbstractC6492s.h(nVarC16, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC16;
        }
        if (bVar instanceof InterfaceC6084a.b.L.C1826a) {
            gg.n nVarD0 = this.f48973a.c().d0();
            AbstractC6492s.h(nVarD0, "toMaybe(...)");
            return nVarD0;
        }
        if (bVar instanceof InterfaceC6084a.b.C) {
            gg.n nVarC17 = gg.n.c(new C6121m(bVar));
            AbstractC6492s.h(nVarC17, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC17;
        }
        if (bVar instanceof InterfaceC6084a.b.x) {
            gg.n nVarC18 = gg.n.c(new C6123n(bVar));
            AbstractC6492s.h(nVarC18, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC18;
        }
        if (bVar instanceof InterfaceC6084a.b.n) {
            gg.n nVarC19 = gg.n.c(new C6127p());
            AbstractC6492s.h(nVarC19, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC19;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6087e.C1831a) {
            gg.n nVarC20 = gg.n.c(new C1841q(bVar));
            AbstractC6492s.h(nVarC20, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC20;
        }
        if (bVar instanceof o) {
            gg.n nVarC21 = gg.n.c(new C6128r());
            AbstractC6492s.h(nVarC21, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC21;
        }
        if (bVar instanceof h) {
            gg.n nVarC22 = gg.n.c(new C6129s(bVar));
            AbstractC6492s.h(nVarC22, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC22;
        }
        if (bVar instanceof g) {
            gg.n nVarC23 = gg.n.c(new C6130t(bVar));
            AbstractC6492s.h(nVarC23, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC23;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6093k.C1836b) {
            gg.n nVarC24 = gg.n.c(new C6131u(bVar));
            AbstractC6492s.h(nVarC24, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC24;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6093k.c) {
            gg.n nVarC25 = gg.n.c(new C6132v(bVar));
            AbstractC6492s.h(nVarC25, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC25;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6093k.C1835a) {
            gg.n nVarC26 = gg.n.c(new C6134x(bVar));
            AbstractC6492s.h(nVarC26, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC26;
        }
        if (bVar instanceof InterfaceC6084a.b.p.C1837a) {
            gg.n nVarC27 = gg.n.c(new C6135y());
            AbstractC6492s.h(nVarC27, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC27;
        }
        if (bVar instanceof InterfaceC6084a.b.p.C1838b) {
            gg.n nVarC28 = gg.n.c(new C6136z(bVar));
            AbstractC6492s.h(nVarC28, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC28;
        }
        if (bVar instanceof InterfaceC6084a.b.z) {
            gg.n nVarC29 = gg.n.c(new A());
            AbstractC6492s.h(nVarC29, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC29;
        }
        if (bVar instanceof InterfaceC6084a.b.B.c.C1819c) {
            gg.n nVarC30 = gg.n.c(new B());
            AbstractC6492s.h(nVarC30, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC30;
        }
        if (bVar instanceof InterfaceC6084a.b.B.C1813a) {
            gg.n nVarC31 = gg.n.c(new C());
            AbstractC6492s.h(nVarC31, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC31;
        }
        if (bVar instanceof InterfaceC6084a.b.B.c.C1817a) {
            gg.n nVarC32 = gg.n.c(new D(bVar));
            AbstractC6492s.h(nVarC32, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC32;
        }
        if (bVar instanceof InterfaceC6084a.b.B.c.d) {
            gg.n nVarC33 = gg.n.c(new E(bVar));
            AbstractC6492s.h(nVarC33, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC33;
        }
        if (bVar instanceof InterfaceC6084a.b.B.c.C1818b) {
            gg.n nVarC34 = gg.n.c(new F(bVar));
            AbstractC6492s.h(nVarC34, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC34;
        }
        if (bVar instanceof InterfaceC6084a.b.B.AbstractC1814b.C1815a) {
            gg.n nVarC35 = gg.n.c(new G(bVar));
            AbstractC6492s.h(nVarC35, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC35;
        }
        if (bVar instanceof InterfaceC6084a.b.B.AbstractC1814b.C1816b) {
            gg.n nVarC36 = gg.n.c(new I(bVar));
            AbstractC6492s.h(nVarC36, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC36;
        }
        if (bVar instanceof InterfaceC6084a.b.B.AbstractC1814b.c) {
            gg.n nVarC37 = gg.n.c(new J(bVar));
            AbstractC6492s.h(nVarC37, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC37;
        }
        if (bVar instanceof InterfaceC6084a.b.B.AbstractC1814b.d) {
            gg.n nVarC38 = gg.n.c(new K());
            AbstractC6492s.h(nVarC38, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC38;
        }
        if (bVar instanceof InterfaceC6084a.b.E.d) {
            gg.n nVarC39 = gg.n.c(new L(bVar));
            AbstractC6492s.h(nVarC39, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC39;
        }
        if (bVar instanceof InterfaceC6084a.b.E.c) {
            gg.n nVarC40 = gg.n.c(new M());
            AbstractC6492s.h(nVarC40, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC40;
        }
        if (bVar instanceof InterfaceC6084a.b.E.e) {
            gg.n nVarC41 = gg.n.c(new N(bVar));
            AbstractC6492s.h(nVarC41, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC41;
        }
        if (bVar instanceof InterfaceC6084a.b.E.C1822a) {
            gg.n nVarC42 = gg.n.c(new O(bVar));
            AbstractC6492s.h(nVarC42, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC42;
        }
        if (bVar instanceof InterfaceC6084a.b.E.C1823b) {
            gg.n nVarC43 = gg.n.c(new P(bVar));
            AbstractC6492s.h(nVarC43, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC43;
        }
        if (bVar instanceof InterfaceC6084a.b.w) {
            gg.n nVarC44 = gg.n.c(new Q());
            AbstractC6492s.h(nVarC44, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC44;
        }
        if (bVar instanceof C6096c) {
            gg.n nVarC45 = gg.n.c(new R());
            AbstractC6492s.h(nVarC45, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC45;
        }
        if (bVar instanceof f) {
            gg.n nVarC46 = gg.n.c(new T());
            AbstractC6492s.h(nVarC46, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC46;
        }
        if (bVar instanceof C6095b) {
            gg.n nVarC47 = gg.n.c(new U());
            AbstractC6492s.h(nVarC47, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC47;
        }
        if (bVar instanceof d) {
            gg.n nVarC48 = gg.n.c(new V());
            AbstractC6492s.h(nVarC48, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC48;
        }
        if (bVar instanceof e) {
            gg.n nVarC49 = gg.n.c(new W());
            AbstractC6492s.h(nVarC49, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC49;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6088f.C1832a) {
            gg.n nVarC50 = gg.n.c(new X());
            AbstractC6492s.h(nVarC50, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC50;
        }
        if (bVar instanceof InterfaceC6084a.b.C1828b) {
            gg.n nVarC51 = gg.n.c(new Y());
            AbstractC6492s.h(nVarC51, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC51;
        }
        if (bVar instanceof InterfaceC6084a.b.q) {
            gg.n nVarC52 = gg.n.c(new Z());
            AbstractC6492s.h(nVarC52, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC52;
        }
        if (bVar instanceof InterfaceC6084a.b.F) {
            gg.n nVarC53 = gg.n.c(new C6098a0());
            AbstractC6492s.h(nVarC53, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC53;
        }
        if (bVar instanceof InterfaceC6084a.b.C1827a) {
            gg.n nVarC54 = gg.n.c(new C6100b0());
            AbstractC6492s.h(nVarC54, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC54;
        }
        if (bVar instanceof InterfaceC6084a.b.G) {
            gg.n nVarC55 = gg.n.c(new C6102c0());
            AbstractC6492s.h(nVarC55, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC55;
        }
        if (bVar instanceof InterfaceC6084a.b.H) {
            gg.n nVarC56 = gg.n.c(new C6106e0());
            AbstractC6492s.h(nVarC56, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC56;
        }
        if (bVar instanceof InterfaceC6084a.b.y) {
            gg.n nVarC57 = gg.n.c(new C6108f0(bVar));
            AbstractC6492s.h(nVarC57, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC57;
        }
        if (bVar instanceof InterfaceC6084a.b.t) {
            gg.n nVarC58 = gg.n.c(new C6110g0(bVar, this));
            AbstractC6492s.h(nVarC58, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC58;
        }
        if (bVar instanceof InterfaceC6084a.b.u) {
            gg.n nVarC59 = gg.n.c(new C6112h0());
            AbstractC6492s.h(nVarC59, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC59;
        }
        if (bVar instanceof InterfaceC6084a.b.s) {
            gg.n nVarC60 = gg.n.c(new C6114i0());
            AbstractC6492s.h(nVarC60, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC60;
        }
        if (bVar instanceof InterfaceC6084a.b.r) {
            gg.n nVarC61 = gg.n.c(new C6116j0());
            AbstractC6492s.h(nVarC61, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC61;
        }
        if (bVar instanceof InterfaceC6084a.b.D.d) {
            gg.n nVarC62 = gg.n.c(new C6118k0(bVar));
            AbstractC6492s.h(nVarC62, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC62;
        }
        if (bVar instanceof InterfaceC6084a.b.D.c) {
            gg.n nVarC63 = gg.n.c(new C6120l0(bVar));
            AbstractC6492s.h(nVarC63, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC63;
        }
        if (bVar instanceof InterfaceC6084a.b.D.f) {
            gg.n nVarC64 = gg.n.c(new C6122m0(bVar));
            AbstractC6492s.h(nVarC64, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC64;
        }
        if (bVar instanceof InterfaceC6084a.b.D.e) {
            gg.n nVarC65 = gg.n.c(new C6126o0());
            AbstractC6492s.h(nVarC65, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC65;
        }
        if (bVar instanceof InterfaceC6084a.b.D.C1821b) {
            gg.n nVarC66 = gg.n.c(new p0());
            AbstractC6492s.h(nVarC66, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC66;
        }
        if (bVar instanceof InterfaceC6084a.b.D.g) {
            gg.n nVarC67 = gg.n.c(new q0());
            AbstractC6492s.h(nVarC67, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC67;
        }
        if (bVar instanceof InterfaceC6084a.b.D.C1820a) {
            gg.n nVarC68 = gg.n.c(new r0());
            AbstractC6492s.h(nVarC68, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC68;
        }
        if (bVar instanceof InterfaceC6084a.b.m) {
            gg.n nVarC69 = gg.n.c(new s0(bVar));
            AbstractC6492s.h(nVarC69, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC69;
        }
        if (bVar instanceof InterfaceC6084a.b.o) {
            gg.n nVarC70 = gg.n.c(new t0(bVar));
            AbstractC6492s.h(nVarC70, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC70;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6086d.C1829a) {
            gg.n nVarC71 = gg.n.c(new u0());
            AbstractC6492s.h(nVarC71, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC71;
        }
        if (bVar instanceof InterfaceC6084a.b.AbstractC6086d.C1830b) {
            gg.n nVarC72 = gg.n.c(new v0());
            AbstractC6492s.h(nVarC72, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC72;
        }
        if (bVar instanceof l) {
            gg.n nVarC73 = gg.n.c(new w0());
            AbstractC6492s.h(nVarC73, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC73;
        }
        if (bVar instanceof m) {
            gg.n nVarC74 = gg.n.c(new y0());
            AbstractC6492s.h(nVarC74, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC74;
        }
        if (bVar instanceof k) {
            gg.n nVarC75 = gg.n.c(new z0());
            AbstractC6492s.h(nVarC75, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC75;
        }
        if (!(bVar instanceof n)) {
            throw new NoWhenBranchMatchedException();
        }
        gg.n nVarC76 = gg.n.c(new A0());
        AbstractC6492s.h(nVarC76, "crossinline action: () -…or(error)\n        }\n    }");
        return nVarC76;
    }

    @Override // i8.InterfaceC6084a
    public AbstractC5912b a(InterfaceC6084a.b... request) {
        AbstractC6492s.i(request, "request");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new O0(request, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // i8.InterfaceC6084a
    public gg.s b() {
        return this.f48979g;
    }
}
