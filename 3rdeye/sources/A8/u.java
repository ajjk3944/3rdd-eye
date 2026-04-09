package A8;

import A9.C0575f;
import A9.F;
import A9.U;
import F9.C0663f;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.ui.splash.WarmSplashActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.x;

/* compiled from: WarmSplashCoordinator.kt */
/* loaded from: classes3.dex */
public final class u {
    public static final /* synthetic */ w9.i<Object>[] i;

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f166a;

    /* renamed from: b, reason: collision with root package name */
    public final U7.f f167b;

    /* renamed from: c, reason: collision with root package name */
    public final q f168c;

    /* renamed from: d, reason: collision with root package name */
    public final PremiumHelperConfiguration f169d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f170e;

    /* renamed from: f, reason: collision with root package name */
    public final r8.d f171f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference<WarmSplashActivity> f172g;

    /* renamed from: h, reason: collision with root package name */
    public final C0663f f173h;

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(u.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        i = new w9.i[]{qVar};
    }

    public u(com.zipoapps.premiumhelper.d dVar, U7.f interstitialsApi, q qVar, PremiumHelperConfiguration premiumHelperConfiguration) {
        kotlin.jvm.internal.l.f(interstitialsApi, "interstitialsApi");
        this.f166a = dVar;
        this.f167b = interstitialsApi;
        this.f168c = qVar;
        this.f169d = premiumHelperConfiguration;
        this.f171f = new r8.d("PremiumHelper");
        I9.c cVar = U.f211a;
        this.f173h = F.a(F9.q.f1782a.plus(C0575f.a()));
    }
}
