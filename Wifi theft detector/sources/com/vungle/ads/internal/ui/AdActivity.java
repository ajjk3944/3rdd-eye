package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.g0;
import androidx.core.view.k1;
import androidx.core.view.t2;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.internal.util.a;
import com.vungle.ads.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s7.c;
import y8.s;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001G\b&\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010)\u001a\u00020\u000fH\u0011¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020\u0006H\u0014¢\u0006\u0004\b*\u0010\u0003R(\u0010+\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\bR*\u00102\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u0010\u0003\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010:\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010\u0003\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006W²\u0006\f\u0010P\u001a\u00020O8\nX\u008a\u0084\u0002²\u0006\f\u0010R\u001a\u00020Q8\nX\u008a\u0084\u0002²\u0006\f\u0010T\u001a\u00020S8\nX\u008a\u0084\u0002²\u0006\f\u0010V\u001a\u00020U8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ui/AdActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "placement", "Ly8/s;", "onConcurrentPlaybackError", "(Ljava/lang/String;)V", "hideSystemUi", "clearStaticFields", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onPause", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onBackPressed", "requestedOrientation", "setRequestedOrientation", "(I)V", "canRotate$vungle_ads_release", "()Z", "canRotate", "onDestroy", "placementRefId", "Ljava/lang/String;", "getPlacementRefId$vungle_ads_release", "()Ljava/lang/String;", "setPlacementRefId$vungle_ads_release", "getPlacementRefId$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "mraidPresenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "getMraidPresenter$vungle_ads_release", "()Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "setMraidPresenter$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/MRAIDPresenter;)V", "getMraidPresenter$vungle_ads_release$annotations", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "mraidAdWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "getMraidAdWidget$vungle_ads_release", "()Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "setMraidAdWidget$vungle_ads_release", "(Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;)V", "getMraidAdWidget$vungle_ads_release$annotations", "Lq7/k;", "unclosedAd", "Lq7/k;", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "com/vungle/ads/internal/ui/AdActivity$b", "lifeCycleCallback", "Lcom/vungle/ads/internal/ui/AdActivity$b;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "willPresentInlineInstall", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "a", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "Lcom/vungle/ads/internal/executor/a;", "executors", "Lcom/vungle/ads/internal/platform/d;", "platform", "Ls7/c$b;", "omTrackerFactory", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AdActivity extends Activity {

    @NotNull
    public static final String AD_INVISIBLE_LOGGED_KEY = "ad_invisible_logged";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";

    @NotNull
    public static final String REQUEST_KEY_EXTRA = "request";

    @NotNull
    private static final String TAG = "AdActivity";

    @Nullable
    private static q7.a advertisement;

    @Nullable
    private static BidPayload bidPayload;

    @Nullable
    private static com.vungle.ads.internal.presenter.a eventListener;

    @Nullable
    private static com.vungle.ads.internal.presenter.l presenterDelegate;

    @Nullable
    private MRAIDAdWidget mraidAdWidget;

    @Nullable
    private MRAIDPresenter mraidPresenter;

    @Nullable
    private q7.k unclosedAd;

    @NotNull
    private String placementRefId = "";

    @NotNull
    private final RingerModeReceiver ringerModeReceiver = new RingerModeReceiver();

    @NotNull
    private final b lifeCycleCallback = new b();

    @NotNull
    private final AtomicBoolean willPresentInlineInstall = new AtomicBoolean(false);

    /* renamed from: com.vungle.ads.internal.ui.AdActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        @VisibleForTesting
        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }

        @NotNull
        public final Intent createIntent(@Nullable Context context, @NotNull String placement, @Nullable String str) {
            p.e(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString(AdActivity.REQUEST_KEY_EXTRA, placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        @Nullable
        public final q7.a getAdvertisement$vungle_ads_release() {
            return AdActivity.advertisement;
        }

        @Nullable
        public final BidPayload getBidPayload$vungle_ads_release() {
            return AdActivity.bidPayload;
        }

        @VisibleForTesting
        @Nullable
        public final com.vungle.ads.internal.presenter.a getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        @Nullable
        public final com.vungle.ads.internal.presenter.l getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(@Nullable q7.a aVar) {
            AdActivity.advertisement = aVar;
        }

        public final void setBidPayload$vungle_ads_release(@Nullable BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener$vungle_ads_release(@Nullable com.vungle.ads.internal.presenter.a aVar) {
            AdActivity.eventListener = aVar;
        }

        public final void setPresenterDelegate$vungle_ads_release(@Nullable com.vungle.ads.internal.presenter.l lVar) {
            AdActivity.presenterDelegate = lVar;
        }

        private Companion() {
        }
    }

    public static final class b extends a.b {
        public b() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onBackground() throws Throwable {
            MRAIDPresenter mraidPresenter = AdActivity.this.getMraidPresenter();
            Long viewStatus = mraidPresenter != null ? mraidPresenter.getViewStatus() : null;
            com.vungle.ads.internal.util.p.Companion.d(AdActivity.TAG, "App is in background, status: " + viewStatus);
            if (viewStatus != null) {
                long jLongValue = viewStatus.longValue();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk$SDKMetric.SDKMetricType sDKMetricType = Sdk$SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION;
                q7.a advertisement$vungle_ads_release = AdActivity.INSTANCE.getAdvertisement$vungle_ads_release();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry$vungle_ads_release() : null, null, 8, null);
            }
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onForeground() {
        }
    }

    public static final class c implements MRAIDAdWidget.a {
        final /* synthetic */ y8.h $signalManager$delegate;

        public c(y8.h hVar) {
            this.$signalManager$delegate = hVar;
        }

        @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.a
        public void close() throws Throwable {
            MRAIDPresenter mraidPresenter = AdActivity.this.getMraidPresenter();
            Long viewStatus = mraidPresenter != null ? mraidPresenter.getViewStatus() : null;
            if (viewStatus != null) {
                long jLongValue = viewStatus.longValue();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk$SDKMetric.SDKMetricType sDKMetricType = Sdk$SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION;
                q7.a advertisement$vungle_ads_release = AdActivity.INSTANCE.getAdvertisement$vungle_ads_release();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry$vungle_ads_release() : null, null, 8, null);
            }
            q7.k kVar = AdActivity.this.unclosedAd;
            if (kVar != null) {
                AdActivity.m355onCreate$lambda1(this.$signalManager$delegate).removeUnclosedAd(kVar);
            }
            AdActivity.this.finish();
        }
    }

    public static final class d implements MRAIDAdWidget.d {
        public d() {
        }

        @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.d
        public boolean onTouch(@Nullable MotionEvent motionEvent) {
            MRAIDPresenter mraidPresenter = AdActivity.this.getMraidPresenter();
            if (mraidPresenter == null) {
                return false;
            }
            mraidPresenter.onViewTouched(motionEvent);
            return false;
        }
    }

    public static final class e implements MRAIDAdWidget.e {
        public e() {
        }

        @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.e
        public void setOrientation(int i10) {
            AdActivity.this.setRequestedOrientation(i10);
        }
    }

    public static final class f implements com.vungle.ads.internal.presenter.j {
        public f() {
        }

        @Override // com.vungle.ads.internal.presenter.j
        @NotNull
        public Pair<Boolean, String> openInlineInstall(@NotNull Intent intent) {
            Object objB;
            p.e(intent, "intent");
            AdActivity adActivity = AdActivity.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                adActivity.willPresentInlineInstall.set(true);
                adActivity.startActivityForResult(intent, 10001);
                objB = Result.b(s.f25199a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(kotlin.c.a(th));
            }
            AdActivity adActivity2 = AdActivity.this;
            Throwable thE = Result.e(objB);
            if (thE == null) {
                return new Pair<>(Boolean.TRUE, null);
            }
            adActivity2.willPresentInlineInstall.set(false);
            return new Pair<>(Boolean.FALSE, thE.getLocalizedMessage());
        }
    }

    private final void clearStaticFields() {
        eventListener = null;
        presenterDelegate = null;
        advertisement = null;
        bidPayload = null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        t2 t2VarA = k1.a(getWindow(), getWindow().getDecorView());
        p.d(t2VarA, "getInsetsController(window, window.decorView)");
        t2VarA.d(2);
        t2VarA.a(WindowInsetsCompat.Type.e());
    }

    private final void onConcurrentPlaybackError(String placement) {
        ConcurrentPlaybackUnsupported concurrentPlaybackUnsupported = new ConcurrentPlaybackUnsupported("Trying to show " + placement + " but " + this.placementRefId + " is already showing");
        q7.a aVar = advertisement;
        VungleError vungleErrorLogError$vungle_ads_release = concurrentPlaybackUnsupported.setLogEntry$vungle_ads_release(aVar != null ? aVar.getLogEntry$vungle_ads_release() : null).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar2 = eventListener;
        if (aVar2 != null) {
            aVar2.onError(vungleErrorLogError$vungle_ads_release, placement);
        }
        com.vungle.ads.internal.util.p.Companion.e(TAG, "onConcurrentPlaybackError: " + vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final SignalManager m355onCreate$lambda1(y8.h hVar) {
        return (SignalManager) hVar.getValue();
    }

    /* renamed from: onCreate$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.a m356onCreate$lambda5(y8.h hVar) {
        return (com.vungle.ads.internal.executor.a) hVar.getValue();
    }

    /* renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final com.vungle.ads.internal.platform.d m357onCreate$lambda6(y8.h hVar) {
        return (com.vungle.ads.internal.platform.d) hVar.getValue();
    }

    /* renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final c.b m358onCreate$lambda7(y8.h hVar) {
        return (c.b) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-9, reason: not valid java name */
    public static final WindowInsetsCompat m359onCreate$lambda9(AdActivity this$0, View v10, WindowInsetsCompat insets) {
        p.e(this$0, "this$0");
        p.e(v10, "v");
        p.e(insets, "insets");
        if (!this$0.willPresentInlineInstall.get()) {
            j0.b bVarF = insets.f(WindowInsetsCompat.Type.e() | WindowInsetsCompat.Type.a());
            p.d(bVarF, "insets.getInsets(\n      …t()\n                    )");
            v10.setPadding(bVarF.f21686a, bVarF.f21687b, bVarF.f21688c, bVarF.f21689d);
        }
        return insets;
    }

    @VisibleForTesting(otherwise = 4)
    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    @Nullable
    /* renamed from: getMraidAdWidget$vungle_ads_release, reason: from getter */
    public final MRAIDAdWidget getMraidAdWidget() {
        return this.mraidAdWidget;
    }

    @Nullable
    /* renamed from: getMraidPresenter$vungle_ads_release, reason: from getter */
    public final MRAIDPresenter getMraidPresenter() {
        return this.mraidPresenter;
    }

    @NotNull
    /* renamed from: getPlacementRefId$vungle_ads_release, reason: from getter */
    public final String getPlacementRefId() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onActivityResult(final int requestCode, final int resultCode, @Nullable final Intent data) throws Throwable {
        super.onActivityResult(requestCode, resultCode, data);
        com.vungle.ads.internal.util.p.Companion.w(TAG, new l9.a() { // from class: com.vungle.ads.internal.ui.AdActivity.onActivityResult.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            @NotNull
            public final String invoke() {
                return "onActivityResult: " + requestCode + ", " + resultCode + ", " + data;
            }
        });
        if (requestCode == 10001) {
            this.willPresentInlineInstall.set(false);
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.logInlineInstallSuccess$vungle_ads_release("onActivityResultCode=" + resultCode);
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        p.e(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i10 = newConfig.orientation;
            if (i10 == 2) {
                com.vungle.ads.internal.util.p.Companion.d(TAG, "landscape");
            } else if (i10 == 1) {
                com.vungle.ads.internal.util.p.Companion.d(TAG, "portrait");
            }
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.onViewConfigurationChanged();
            }
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "onConfigurationChanged: " + e10.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String, kotlin.jvm.internal.i] */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        p.d(intent, "intent");
        String placement = companion.getPlacement(intent);
        if (placement == null) {
            placement = "";
        }
        this.placementRefId = placement;
        q7.a aVar = advertisement;
        q7.h placement2 = ConfigManager.INSTANCE.getPlacement(placement);
        frameLayout = null;
        FrameLayout frameLayout = null;
        if (placement2 == null || aVar == null) {
            com.vungle.ads.internal.presenter.a aVar2 = eventListener;
            if (aVar2 != null) {
                aVar2.onError(new AdNotLoadedCantPlay("Can not play fullscreen ad. placement=" + placement2 + " adv=" + aVar).setLogEntry$vungle_ads_release(aVar != null ? aVar.getLogEntry$vungle_ads_release() : 0).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
            return;
        }
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this, aVar.eventId());
            k1.b(getWindow(), false);
            long j10 = getIntent().getBooleanExtra(AD_INVISIBLE_LOGGED_KEY, false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            y yVar = new y(Sdk$SDKMetric.SDKMetricType.AD_VISIBILITY);
            yVar.setValue(Long.valueOf(j10));
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, yVar, aVar.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            com.vungle.ads.internal.util.p.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
            ServiceLocator.Companion companion2 = ServiceLocator.Companion;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
            y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final SignalManager invoke() {
                    return ServiceLocator.Companion.getInstance(this).getService(SignalManager.class);
                }
            });
            Intent intent2 = getIntent();
            p.d(intent2, "intent");
            String eventId = companion.getEventId(intent2);
            q7.k kVar = eventId != null ? new q7.k(eventId, (String) oVar, 2, (kotlin.jvm.internal.i) oVar) : null;
            this.unclosedAd = kVar;
            if (kVar != null) {
                m355onCreate$lambda1(hVarA).recordUnclosedAd(kVar);
            }
            mRAIDAdWidget.setCloseDelegate(new c(hVarA));
            mRAIDAdWidget.setOnViewTouchListener(new d());
            mRAIDAdWidget.setOrientationDelegate(new e());
            y8.h hVarA2 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.executor.a invoke() {
                    return ServiceLocator.Companion.getInstance(this).getService(com.vungle.ads.internal.executor.a.class);
                }
            });
            y8.h hVarA3 = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.d, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.platform.d invoke() {
                    return ServiceLocator.Companion.getInstance(this).getService(com.vungle.ads.internal.platform.d.class);
                }
            });
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(aVar, placement2, m356onCreate$lambda5(hVarA2).getOffloadExecutor(), m357onCreate$lambda6(hVarA3));
            s7.c cVarMake = m358onCreate$lambda7(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$$inlined$inject$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s7.c$b] */
                @Override // l9.a
                @NotNull
                public final c.b invoke() {
                    return ServiceLocator.Companion.getInstance(this).getService(c.b.class);
                }
            })).make(aVar.omEnabled());
            VungleThreadPoolExecutor jobExecutor = m356onCreate$lambda5(hVarA2).getJobExecutor();
            orCreateWebViewClient.setWebViewObserver(cVarMake);
            this.ringerModeReceiver.setWebClient(orCreateWebViewClient);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, aVar, placement2, orCreateWebViewClient, jobExecutor, cVarMake, m357onCreate$lambda6(hVarA3));
            mRAIDPresenter.setEventListener(eventListener);
            mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            mRAIDPresenter.setOpenActivityDelegate$vungle_ads_release(new f());
            mRAIDPresenter.prepare();
            setContentView(mRAIDAdWidget, mRAIDAdWidget.getLayoutParams());
            try {
                Result.Companion companion3 = Result.INSTANCE;
                getWindow().getDecorView().setBackgroundColor(-16777216);
                Result.b(s.f25199a);
            } catch (Throwable th) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.b(kotlin.c.a(th));
            }
            ViewCompat.t0(mRAIDAdWidget, new g0() { // from class: com.vungle.ads.internal.ui.a
                @Override // androidx.core.view.g0
                public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                    return AdActivity.m359onCreate$lambda9(this.f20206a, view, windowInsetsCompat);
                }
            });
            hideSystemUi();
            AdConfig adConfig = aVar.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    o oVar = new o(this, watermark$vungle_ads_release);
                    frameLayout.addView(oVar);
                    oVar.bringToFront();
                }
            }
            this.mraidAdWidget = mRAIDAdWidget;
            this.mraidPresenter = mRAIDPresenter;
            com.vungle.ads.internal.util.a.Companion.addLifecycleListener(this.lifeCycleCallback);
            try {
                Result.b(registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th2) {
                Result.Companion companion5 = Result.INSTANCE;
                Result.b(kotlin.c.a(th2));
            }
        } catch (InstantiationException e10) {
            com.vungle.ads.internal.presenter.a aVar3 = eventListener;
            if (aVar3 != null) {
                aVar3.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(aVar.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        MRAIDPresenter mRAIDPresenter2 = this.mraidPresenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.setOpenActivityDelegate$vungle_ads_release(null);
        }
        com.vungle.ads.internal.util.a.Companion.removeLifecycleListener(this.lifeCycleCallback);
        try {
            Result.Companion companion = Result.INSTANCE;
            unregisterReceiver(this.ringerModeReceiver);
            Result.b(s.f25199a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(kotlin.c.a(th));
        }
        clearStaticFields();
        this.mraidPresenter = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        p.e(intent, "intent");
        super.onNewIntent(intent);
        Companion companion = INSTANCE;
        Intent intent2 = getIntent();
        p.d(intent2, "getIntent()");
        Pair pairA = y8.i.a(companion.getPlacement(intent2), companion.getPlacement(intent));
        String str = (String) pairA.getFirst();
        String str2 = (String) pairA.getSecond();
        Intent intent3 = getIntent();
        p.d(intent3, "getIntent()");
        Pair pairA2 = y8.i.a(companion.getEventId(intent3), companion.getEventId(intent));
        String str3 = (String) pairA2.getFirst();
        String str4 = (String) pairA2.getSecond();
        if ((str == null || str2 == null || p.a(str, str2)) && (str3 == null || str4 == null || p.a(str3, str4))) {
            return;
        }
        com.vungle.ads.internal.util.p.Companion.d(TAG, "Tried to play another placement " + str2 + " while playing " + str);
        onConcurrentPlaybackError(str2);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUi();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(@Nullable MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(@Nullable MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(@NotNull String str) {
        p.e(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(requestedOrientation);
        }
    }
}
