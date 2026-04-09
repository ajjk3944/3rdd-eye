package com.applovin.impl.sdk;

import C.RunnableC0615b;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.AbstractC2135n0;
import com.applovin.impl.C2115e;
import com.applovin.impl.C2125j;
import com.applovin.impl.C2145t;
import com.applovin.impl.a7;
import com.applovin.impl.g2;
import com.applovin.impl.l2;
import com.applovin.impl.l4;
import com.applovin.impl.m5;
import com.applovin.impl.n4;
import com.applovin.impl.o1;
import com.applovin.impl.o5;
import com.applovin.impl.r1;
import com.applovin.impl.r5;
import com.applovin.impl.r7;
import com.applovin.impl.s5;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w4;
import com.applovin.impl.x6;
import com.applovin.impl.y1;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.InterfaceC0316a {

    /* renamed from: a, reason: collision with root package name */
    private final k f20950a;

    /* renamed from: b, reason: collision with root package name */
    private final o f20951b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f20952c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f20953d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f20954e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f20955f = new AtomicReference();

    public class a implements ArrayService.DirectDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r1 f20956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f20957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f20958c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f20959d;

        public a(r1 r1Var, com.applovin.impl.sdk.ad.b bVar, Uri uri, Context context) {
            this.f20956a = r1Var;
            this.f20957b = bVar;
            this.f20958c = uri;
            this.f20959d = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f20950a.m0().pauseForClick();
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
                AppLovinAdServiceImpl.this.f20950a.m0().resumeForClick();
            }
            if (this.f20956a != null) {
                this.f20956a.e(AppLovinAdServiceImpl.this.f20950a.p().getJavaScript(str, bundle));
            }
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            o unused = AppLovinAdServiceImpl.this.f20951b;
            if (o.a()) {
                AppLovinAdServiceImpl.this.f20951b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f20957b, this.f20958c, this.f20959d);
        }
    }

    public class b implements ArrayService.DirectDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f20961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f20962b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppLovinAdView f20963c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f20964d;

        public b(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri) {
            this.f20961a = aVar;
            this.f20962b = bVar;
            this.f20963c = appLovinAdView;
            this.f20964d = uri;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
            com.applovin.impl.adview.b bVarF;
            if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN.equals(str)) {
                AppLovinAdServiceImpl.this.f20950a.m0().pauseForClick();
                com.applovin.impl.adview.a aVar = this.f20961a;
                if (aVar != null) {
                    aVar.w();
                    l2.c(this.f20961a.e(), this.f20962b, this.f20963c);
                }
            } else if (ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str) && this.f20961a != null) {
                AppLovinAdServiceImpl.this.f20950a.m0().resumeForClick();
                l2.a(this.f20961a.e(), this.f20962b, this.f20963c);
            }
            com.applovin.impl.adview.a aVar2 = this.f20961a;
            if (aVar2 == null || (bVarF = aVar2.f()) == null) {
                return;
            }
            bVarF.a(AppLovinAdServiceImpl.this.f20950a.p().getJavaScript(str, bundle));
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            o unused = AppLovinAdServiceImpl.this.f20951b;
            if (o.a()) {
                AppLovinAdServiceImpl.this.f20951b.a("AppLovinAdService", "Could not execute Direct Install/Direct Download - falling back to normal click logic");
            }
            AppLovinAdServiceImpl.this.a(this.f20962b, this.f20963c, this.f20961a, this.f20964d);
        }
    }

    public class c implements g2 {

        /* renamed from: a, reason: collision with root package name */
        private final d f20966a;

        public /* synthetic */ c(AppLovinAdServiceImpl appLovinAdServiceImpl, d dVar, a aVar) {
            this(dVar);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.this.f20950a.i().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.this.f20950a.f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.this.f20950a);
            }
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f20966a.f20968a) {
                try {
                    if (!this.f20966a.f20970c) {
                        hashSet = new HashSet(this.f20966a.f20971d);
                        this.f20966a.f20971d.clear();
                    }
                    d dVar = this.f20966a;
                    dVar.f20969b = false;
                    dVar.f20970c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.a(appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        @Override // com.applovin.impl.g2
        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            Collection hashSet = Collections.EMPTY_SET;
            synchronized (this.f20966a.f20968a) {
                try {
                    if (!this.f20966a.f20970c) {
                        hashSet = new HashSet(this.f20966a.f20971d);
                        this.f20966a.f20971d.clear();
                    }
                    d dVar = this.f20966a;
                    dVar.f20969b = false;
                    dVar.f20970c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.this.b(appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private c(d dVar) {
            this.f20966a = dVar;
        }
    }

    public AppLovinAdServiceImpl(k kVar) {
        this.f20950a = kVar;
        this.f20951b = kVar.O();
        HashMap map = new HashMap(6);
        this.f20952c = map;
        a aVar = null;
        map.put(C2145t.c(), new d(aVar));
        map.put(C2145t.k(), new d(aVar));
        map.put(C2145t.j(), new d(aVar));
        map.put(C2145t.m(), new d(aVar));
        map.put(C2145t.b(), new d(aVar));
        map.put(C2145t.h(), new d(aVar));
    }

    public void addCustomQueryParams(Map<String, String> map) {
        this.f20954e.putAll(map);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.f20950a.B().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(C2145t c2145t) {
        AppLovinAdImpl appLovinAdImplA = this.f20950a.i().a(c2145t);
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Dequeued ad: " + appLovinAdImplA + " for zone: " + c2145t + "...");
        }
        return appLovinAdImplA;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f20955f.getAndSet(null);
    }

    public Map<String, String> getAndResetCustomQueryParams() {
        Map<String, String> map;
        synchronized (this.f20954e) {
            map = CollectionUtils.map(this.f20954e);
            this.f20954e.clear();
        }
        return map;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public String getBidToken() {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String strF = this.f20950a.B().F();
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        if (StringUtils.isValidString(strF) && o.a()) {
            this.f20951b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return strF;
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(C2145t.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String strTrim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(strTrim)) {
            o.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        C2125j c2125j = new C2125j(strTrim, this.f20950a);
        if (c2125j.c() == C2125j.a.REGULAR) {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Loading next ad for token: " + c2125j);
            }
            a(new o5(c2125j, appLovinAdLoadListener, this.f20950a));
            return;
        }
        if (c2125j.c() != C2125j.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject jSONObjectA = c2125j.a();
        if (jSONObjectA == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + c2125j.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        AbstractC2135n0.c(jSONObjectA, this.f20950a);
        AbstractC2135n0.b(jSONObjectA, this.f20950a);
        AbstractC2135n0.a(jSONObjectA, this.f20950a);
        this.f20950a.m().a();
        if (JsonUtils.getJSONArray(jSONObjectA, "ads", new JSONArray()).length() <= 0) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "No ad returned from the server for token: " + c2125j);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Rendering ad for token: " + c2125j);
        }
        C2145t c2145tA = a7.a(jSONObjectA, this.f20950a);
        MaxAdFormat maxAdFormatD = c2145tA.d();
        if (((Boolean) this.f20950a.a(l4.f19833T0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f20950a.h().a(c2145tA, new V6.j(this, appLovinAdLoadListener, jSONObjectA, c2145tA));
        } else {
            a(new s5(jSONObjectA, c2145tA, appLovinAdLoadListener, this.f20950a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdService
    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(C2145t.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(C2145t.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l5;
        if (((Boolean) this.f20950a.a(l4.f19862X1)).booleanValue() && (l5 = (Long) this.f20950a.b(n4.f20565J)) != null && System.currentTimeMillis() - l5.longValue() <= ((Long) this.f20950a.a(l4.f19889b2)).longValue()) {
            if (((Boolean) this.f20950a.a(l4.f19882a2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List<C2115e> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C2115e> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0316a
    public void onAdExpired(o1 o1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) o1Var;
        C2145t adZone = appLovinAdImpl.getAdZone();
        if (o.a()) {
            this.f20951b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.f20950a.i().b(appLovinAdImpl);
        if (this.f20950a.G0() || !((Boolean) this.f20950a.a(l4.f19874Z0)).booleanValue()) {
            return;
        }
        d dVarA = a(adZone);
        synchronized (dVarA.f20968a) {
            try {
                if (!dVarA.f20969b) {
                    this.f20950a.O();
                    if (o.a()) {
                        this.f20950a.O().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    dVarA.f20969b = true;
                    dVarA.f20970c = true;
                    a(adZone, new c(this, dVarA, null));
                } else if (o.a()) {
                    this.f20951b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f20955f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.f20952c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent, Bundle bundle) {
        if (bVar == null) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Tracking click on an ad...");
            }
            boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.a(motionEvent, z10));
            if (this.f20950a.g0() != null) {
                this.f20950a.g0().b(bVar.d(motionEvent, false, z10), motionEvent);
            }
        } else if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Skipping tracking for click on an ad...");
        }
        if (appLovinAdView == null || uri == null) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
            }
        } else if (bVar.isDirectDownloadEnabled()) {
            this.f20950a.p().startDirectInstallOrDownloadProcess(bVar, bundle, new b(aVar, bVar, appLovinAdView, uri));
        } else {
            a(bVar, appLovinAdView, aVar, uri);
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, Bundle bundle, r1 r1Var, Context context) {
        if (bVar == null) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Unable to track video click. No ad specified");
                return;
            }
            return;
        }
        if (bundle == null || !Boolean.parseBoolean(bundle.getString("skip_click_tracking"))) {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            boolean z10 = bundle != null && Boolean.parseBoolean(bundle.getString("install_click"));
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent, z10));
            if (this.f20950a.g0() != null) {
                this.f20950a.g0().b(bVar.d(motionEvent, true, z10), motionEvent);
            }
        } else if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Skipping tracking for VIDEO click on an ad...");
        }
        if (bVar.isDirectDownloadEnabled()) {
            this.f20950a.p().startDirectInstallOrDownloadProcess(bVar, bundle, new a(r1Var, bVar, uri, context));
        } else {
            a(bVar, uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.w());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.x());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.y());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.z());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.B());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.C());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j4, List<Long> list, long j10, boolean z10, int i) {
        if (bVar == null) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<C2115e> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            if (o.a()) {
                this.f20951b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (C2115e c2115e : listE) {
            String strA = a(c2115e.c(), j4, j10, list, bVar.F(), z10, i);
            String strA2 = a(c2115e.a(), j4, j10, list, bVar.F(), z10, i);
            if (StringUtils.isValidString(strA)) {
                a(new C2115e(strA, strA2));
            } else if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Failed to parse url: " + c2115e.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.J());
            if (this.f20950a.g0() != null) {
                this.f20950a.g0().b(bVar.getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j4, int i, boolean z10) {
        if (bVar == null) {
            if (o.a()) {
                this.f20951b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<C2115e> listR0 = bVar.r0();
        if (listR0 == null || listR0.isEmpty()) {
            if (o.a()) {
                this.f20951b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String string = Long.toString(System.currentTimeMillis());
        for (C2115e c2115e : listR0) {
            if (StringUtils.isValidString(c2115e.c())) {
                String strA = a(c2115e.c(), j4, i, string, z10);
                String strA2 = a(c2115e.a(), j4, i, string, z10);
                if (strA != null) {
                    a(new C2115e(strA, strA2));
                } else if (o.a()) {
                    this.f20951b.b("AppLovinAdService", "Failed to parse url: " + c2115e.c());
                }
            } else if (o.a()) {
                this.f20951b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof g2) {
            ((g2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(C2145t.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final Object f20968a;

        /* renamed from: b, reason: collision with root package name */
        boolean f20969b;

        /* renamed from: c, reason: collision with root package name */
        boolean f20970c;

        /* renamed from: d, reason: collision with root package name */
        final Collection f20971d;

        private d() {
            this.f20968a = new Object();
            this.f20971d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.f20969b + ", isReloadingExpiredAd=" + this.f20970c + ", pendingAdListeners=" + this.f20971d + '}';
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new J4.f(this, appLovinError, appLovinAdLoadListener, 5));
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.f20950a.O();
            if (o.a()) {
                this.f20950a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.f20950a.E().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    private boolean b() {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        Context contextO = k.o();
        ApplicationExitInfo applicationExitInfoC = I0.m.c(((ActivityManager) contextO.getSystemService("activity")).getHistoricalProcessExitReasons(contextO.getPackageName(), 0, 1).get(0));
        return applicationExitInfoC.getReason() == 10 || applicationExitInfoC.getReason() == 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, C2145t c2145t, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new RunnableC0615b(15, appLovinAdLoadListener, bVar));
        } else {
            a(new s5(jSONObject, c2145t, appLovinAdLoadListener, this.f20950a));
        }
    }

    private void a(C2145t c2145t, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (c2145t == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.f20950a.O();
            if (o.a()) {
                this.f20950a.O().a("AppLovinAdService", "Loading next ad of zone {" + c2145t + "}...");
            }
            d dVarA = a(c2145t);
            synchronized (dVarA.f20968a) {
                try {
                    dVarA.f20971d.add(appLovinAdLoadListener);
                    if (!dVarA.f20969b) {
                        dVarA.f20969b = true;
                        a(c2145t, new c(this, dVarA, null));
                    } else if (o.a()) {
                        this.f20951b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(w4 w4Var) {
        if (!this.f20950a.B0()) {
            o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.f20950a.c();
        this.f20950a.q0().a(w4Var, r5.b.CORE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new N.d(this, appLovinAdLoadListener, appLovinAd, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            o.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.f20950a.E().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            o.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            this.f20950a.E().a("AppLovinAdService", "notifyAdLoadFailedCallback".concat(appLovinAdLoadListener instanceof g2 ? "V2" : ""), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, Uri uri, Context context) {
        if (x6.b(uri)) {
            a(uri, bVar, null, null, context, this.f20950a);
        } else {
            x6.b(uri, bVar, context, this.f20950a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (!((Boolean) this.f20950a.a(l4.f20058x)).booleanValue() || (context = r7.b(appLovinAdView, this.f20950a)) == null) {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (x6.b(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.f20950a);
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j4, int i, String str2, boolean z10) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j4)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z10)).build().toString();
        } catch (Throwable th) {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.f20950a.E().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (x6.b(uri, bVar, context, this.f20950a)) {
            l2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri uriB = b(uri, "primaryUrl");
            List listA = a(uri, "primaryTrackingUrl");
            Uri uriB2 = b(uri, "fallbackUrl");
            List listA2 = a(uri, "fallbackTrackingUrl");
            if (uriB == null && uriB2 == null) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(uriB, "primary", listA, bVar, appLovinAdView, aVar, context, kVar)) {
                a(uriB2, "backup", listA2, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean zB = x6.b(uri, bVar, context, kVar);
        if (zB) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.f0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                l2.b(aVar.e(), bVar, appLovinAdView);
                return zB;
            }
        } else {
            kVar.O();
            if (o.a()) {
                kVar.O().b("AppLovinAdService", "URL failed to open");
            }
        }
        return zB;
    }

    private List a(Uri uri, String str) {
        List<String> queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator<String> it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse(it.next()));
            } catch (Throwable th) {
                this.f20950a.O();
                if (o.a()) {
                    this.f20950a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.f20950a.E().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j4, long j10, List list, String str2, boolean z10, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j4)).appendQueryParameter("vs_ms", Long.toString(j10));
        if (list != null && list.size() > 0) {
            builderAppendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            builderAppendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i != i.f21151h) {
            builderAppendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z10));
            builderAppendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(i.a(i)));
        }
        return builderAppendQueryParameter.build().toString();
    }

    private void a() {
        Map<String, String> mapTryToStringMap;
        if (o.a()) {
            this.f20951b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.f20950a.b(n4.f20568M);
        if (TextUtils.isEmpty(str)) {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            mapTryToStringMap = null;
        } else {
            mapTryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.f20950a.E().d(y1.f21810o0, mapTryToStringMap);
        String str2 = (String) this.f20950a.b(n4.f20567L);
        if (str2 != null) {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jSONObjectJsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l5 = (Long) this.f20950a.b(n4.f20566K);
            if (l5 != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l5));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l5));
            }
            a(new C2115e(string, string2));
            return;
        }
        if (o.a()) {
            this.f20951b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(C2115e c2115e) {
        if (StringUtils.isValidString(c2115e.c())) {
            this.f20950a.e0().e(com.applovin.impl.sdk.network.d.b().d(c2115e.c()).a(StringUtils.isValidString(c2115e.a()) ? c2115e.a() : null).a(c2115e.b()).a(false).b(c2115e.d()).a());
        } else if (o.a()) {
            this.f20951b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(final C2145t c2145t, final c cVar) {
        AppLovinAdImpl appLovinAdImplE = this.f20950a.i().e(c2145t);
        if (appLovinAdImplE != null && !appLovinAdImplE.isExpired()) {
            if (o.a()) {
                this.f20951b.a("AppLovinAdService", "Using pre-loaded ad: " + appLovinAdImplE + " for " + c2145t);
            }
            cVar.adReceived(appLovinAdImplE);
            return;
        }
        MaxAdFormat maxAdFormatD = c2145t.d();
        if (((Boolean) this.f20950a.a(l4.f19833T0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f20950a.h().a(c2145t, new d.a() { // from class: com.applovin.impl.sdk.s
                @Override // com.applovin.impl.sdk.d.a
                public final void a(com.applovin.impl.sdk.ad.b bVar) {
                    this.f21427a.a(cVar, c2145t, bVar);
                }
            });
        } else {
            a(new m5(c2145t, cVar, this.f20950a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final c cVar, C2145t c2145t, final com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.t
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.adReceived(bVar);
                }
            });
        } else {
            a(new m5(c2145t, cVar, this.f20950a));
        }
    }

    private d a(C2145t c2145t) {
        d dVar;
        synchronized (this.f20953d) {
            try {
                dVar = (d) this.f20952c.get(c2145t);
                if (dVar == null) {
                    dVar = new d(null);
                    this.f20952c.put(c2145t, dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
