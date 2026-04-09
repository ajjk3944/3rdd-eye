package A8;

import J8.C0689d;
import T1.B;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import androidx.fragment.app.ActivityC1762o;
import b9.C1992A;
import com.zipoapps.premium.relaunch.RelaunchActivity;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.rate.f;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import j8.C5201c;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;

/* compiled from: RelaunchCoordinator.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final a f132j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f133k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f134l;

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f135a;

    /* renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f136b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.b f137c;

    /* renamed from: d, reason: collision with root package name */
    public final C5201c f138d;

    /* renamed from: e, reason: collision with root package name */
    public final r8.d f139e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f140f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f141g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f142h;
    public final u i;

    /* compiled from: RelaunchCoordinator.kt */
    public static final class a {
    }

    /* compiled from: RelaunchCoordinator.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f143a;

        static {
            int[] iArr = new int[f.c.values().length];
            try {
                iArr[f.c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f143a = iArr;
        }
    }

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(k.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        f133k = new w9.i[]{qVar};
        f132j = new a();
    }

    public k(com.zipoapps.premiumhelper.d dVar, com.zipoapps.premiumhelper.c cVar, l8.b bVar, U7.f interstitialsApi, PremiumHelperConfiguration premiumHelperConfiguration, C5201c c5201c) {
        kotlin.jvm.internal.l.f(interstitialsApi, "interstitialsApi");
        this.f135a = dVar;
        this.f136b = cVar;
        this.f137c = bVar;
        this.f138d = c5201c;
        this.f139e = new r8.d("PremiumHelper");
        this.i = new u(dVar, interstitialsApi, new q(1, this, k.class, "handleInterstitialAfterSplash", "handleInterstitialAfterSplash(Landroidx/appcompat/app/AppCompatActivity;)V", 0, 0), premiumHelperConfiguration);
    }

    public static /* synthetic */ void f(k kVar, Activity activity, int i) {
        if ((i & 1) != 0) {
            activity = null;
        }
        kVar.e((i & 2) == 0, activity);
    }

    public final r8.c a() {
        return this.f139e.a(this, f133k[0]);
    }

    public final boolean b() {
        com.zipoapps.premiumhelper.c cVar = this.f136b;
        int i = cVar.i();
        l8.d<Integer> PH_ONETIME_START_SESSION = i8.d.f38530J;
        kotlin.jvm.internal.l.e(PH_ONETIME_START_SESSION, "PH_ONETIME_START_SESSION");
        l8.b bVar = this.f137c;
        boolean z10 = false;
        if (i >= ((Number) bVar.h(PH_ONETIME_START_SESSION)).intValue()) {
            l8.d<String> PH_ONETIME_OFFER_SKU = i8.d.f38528H;
            kotlin.jvm.internal.l.e(PH_ONETIME_OFFER_SKU, "PH_ONETIME_OFFER_SKU");
            Object objH = bVar.h(PH_ONETIME_OFFER_SKU);
            kotlin.jvm.internal.l.e(objH, "get(...)");
            if (((CharSequence) objH).length() > 0) {
                long j4 = cVar.f37004a.getLong("one_time_offer_start_time", 0L);
                if (j4 > 0 && j4 + com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS < System.currentTimeMillis()) {
                    z10 = true;
                }
                return !z10;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.app.Activity r10) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A8.k.c(android.app.Activity):boolean");
    }

    public final void d(ActivityC1762o activityC1762o) {
        Intent intent = activityC1762o.getIntent();
        if (intent != null && intent.hasExtra("show_relaunch") && !intent.getBooleanExtra("show_relaunch", true)) {
            f(this, activityC1762o, 2);
            return;
        }
        a().a("Starting Relaunch", new Object[0]);
        if (c(activityC1762o)) {
            f132j.getClass();
            Intent intent2 = new Intent(activityC1762o, (Class<?>) RelaunchActivity.class);
            intent2.putExtra(AdRevenueConstants.SOURCE_KEY, "relaunch");
            activityC1762o.startActivity(intent2);
            this.f140f = true;
            return;
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        int i = b.f143a[e.a.a().f37025o.c().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new b9.j();
            }
            g(activityC1762o, new j(0, this, activityC1762o));
            return;
        }
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        eVarA.f37025o.g(activityC1762o, B.j(activityC1762o), new A2.k(1, this, activityC1762o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(final boolean z10, Activity activity) {
        if (f134l) {
            return;
        }
        f134l = true;
        final r rVar = new r(this.f140f, this.f141g, this.f142h, z10);
        boolean z11 = activity instanceof A8.a;
        com.zipoapps.premiumhelper.d dVar = this.f135a;
        if (z11) {
            ((A8.a) activity).a();
        } else {
            dVar.registerActivityLifecycleCallbacks(new l(new p9.p(rVar, this, z10) { // from class: A8.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f114b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f115c;

                {
                    this.f114b = this;
                    this.f115c = z10;
                }

                @Override // p9.p
                public final Object invoke(Object obj, Object obj2) {
                    ComponentCallbacks2 act = (Activity) obj;
                    Application.ActivityLifecycleCallbacks callbacks = (Application.ActivityLifecycleCallbacks) obj2;
                    kotlin.jvm.internal.l.f(act, "act");
                    kotlin.jvm.internal.l.f(callbacks, "callbacks");
                    boolean z12 = act instanceof a;
                    k kVar = this.f114b;
                    if (z12) {
                        ((a) act).a();
                        kVar.f135a.unregisterActivityLifecycleCallbacks(callbacks);
                    }
                    if (this.f115c) {
                        kVar.getClass();
                        k.f134l = true;
                    }
                    return C1992A.f18074a;
                }
            }));
        }
        if (activity != 0) {
            f134l = true;
        }
        if (activity != 0) {
            I8.b.a(activity);
        } else {
            dVar.registerActivityLifecycleCallbacks(new C0689d(dVar, new d(0)));
        }
    }

    public final void g(Activity activity, InterfaceC5480a interfaceC5480a) {
        if (this.f136b.j()) {
            interfaceC5480a.invoke();
            return;
        }
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        boolean zA = ((U7.f) e.a.a().f37035y.f1156b).f12514h.a();
        if (!zA) {
            a().l("Interstitial not ready when expected.", new Object[0]);
            f(this, activity, 2);
        }
        ((U7.f) e.a.a().f37035y.f1156b).f(activity, new p(!zA ? 1000L : 0L, this, interfaceC5480a));
    }
}
