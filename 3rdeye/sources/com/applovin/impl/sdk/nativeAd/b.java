package com.applovin.impl.sdk.nativeAd;

import N7.C1154e9;
import N7.G8;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.a7;
import com.applovin.impl.b7;
import com.applovin.impl.l4;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v5;
import com.applovin.impl.w4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends w4 implements a.InterfaceC0319a, AppLovinAdLoadListener {

    /* renamed from: A, reason: collision with root package name */
    private final List f21302A;

    /* renamed from: B, reason: collision with root package name */
    private final List f21303B;

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f21304g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f21305h;
    private final AppLovinNativeAdLoadListener i;

    /* renamed from: j, reason: collision with root package name */
    private String f21306j;

    /* renamed from: k, reason: collision with root package name */
    private String f21307k;

    /* renamed from: l, reason: collision with root package name */
    private String f21308l;

    /* renamed from: m, reason: collision with root package name */
    private Double f21309m;

    /* renamed from: n, reason: collision with root package name */
    private String f21310n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f21311o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f21312p;

    /* renamed from: q, reason: collision with root package name */
    private b7 f21313q;

    /* renamed from: r, reason: collision with root package name */
    private Uri f21314r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f21315s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f21316t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f21317u;

    /* renamed from: v, reason: collision with root package name */
    private final List f21318v;

    /* renamed from: w, reason: collision with root package name */
    private final List f21319w;

    /* renamed from: x, reason: collision with root package name */
    private final List f21320x;

    /* renamed from: y, reason: collision with root package name */
    private final List f21321y;

    /* renamed from: z, reason: collision with root package name */
    private final List f21322z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f21306j = "";
        this.f21307k = "";
        this.f21308l = "";
        this.f21309m = null;
        this.f21310n = "";
        this.f21311o = null;
        this.f21312p = null;
        this.f21314r = null;
        this.f21315s = null;
        this.f21316t = null;
        this.f21317u = null;
        this.f21318v = new ArrayList();
        this.f21319w = new ArrayList();
        this.f21320x = new ArrayList();
        this.f21321y = new ArrayList();
        this.f21322z = new ArrayList();
        this.f21302A = new ArrayList();
        this.f21303B = new ArrayList();
        this.f21304g = jSONObject;
        this.f21305h = jSONObject2;
        this.i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, ImagesContract.URL, null);
        if (StringUtils.isValidString(string)) {
            this.f21316t = Uri.parse(string);
            if (o.a()) {
                this.f21694c.a(this.f21693b, "Processed click destination URL: " + this.f21316t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f21317u = Uri.parse(string2);
            if (o.a()) {
                this.f21694c.a(this.f21693b, "Processed click destination backup URL: " + this.f21317u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f21304g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f21692a.a(l4.f19759I2)).booleanValue()) {
                try {
                    this.f21318v.addAll(JsonUtils.toList(jSONArray));
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed click tracking URLs: " + this.f21318v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f21320x.add(new e.a(this.f21692a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (o.a()) {
                this.f21694c.a(this.f21693b, "Processed click tracking requests: " + this.f21320x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (o.a()) {
                this.f21694c.a(this.f21693b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (o.a()) {
                this.f21694c.a(this.f21693b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f21692a.E().a(this.f21693b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new B.c(22, this, appLovinNativeAdImpl));
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f21304g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f21692a.a(l4.f19751H2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (o.a()) {
            this.f21694c.a(this.f21693b, "VAST ad rendered successfully");
        }
        this.f21313q = (b7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        if (o.a()) {
            this.f21694c.b(this.f21693b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f21304g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f21314r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f21304g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f21315s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f21304g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (o.a()) {
                this.f21694c.b(this.f21693b, "No oRtb response provided: " + this.f21304g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
        if (o.a()) {
            C1154e9.m("Rendering native ad for oRTB version: ", string3, this.f21694c, this.f21693b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (o.a()) {
                this.f21694c.b(this.f21693b, "Unable to retrieve assets - failing ad load: " + this.f21304g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject4.has(AppIntroBaseFragmentKt.ARG_TITLE)) {
                this.f21306j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, AppIntroBaseFragmentKt.ARG_TITLE, (JSONObject) null), "text", null);
                if (o.a()) {
                    this.f21694c.a(this.f21693b, "Processed title: " + this.f21306j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has("img")) {
                int i10 = JsonUtils.getInt(jSONObject4, FacebookMediationAdapter.KEY_ID, -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                int i11 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, ImagesContract.URL, null);
                if (i11 == 1 || 3 == i10) {
                    this.f21311o = Uri.parse(string4);
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed icon URL: " + this.f21311o);
                    }
                } else if (i11 == 3 || 2 == i10) {
                    this.f21312p = Uri.parse(string4);
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed main image URL: " + this.f21312p);
                    }
                } else {
                    if (o.a()) {
                        this.f21694c.k(this.f21693b, "Unrecognized image: " + jSONObject4);
                    }
                    int i12 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i13 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i12 <= 0 || i13 <= 0) {
                        if (o.a()) {
                            this.f21694c.k(this.f21693b, "Skipping...");
                        }
                    } else if (i12 / i13 > 1.0d) {
                        if (o.a()) {
                            this.f21694c.a(this.f21693b, G8.r("Inferring main image from ", i12, "x", i13, "..."));
                        }
                        this.f21312p = Uri.parse(string4);
                    } else {
                        if (o.a()) {
                            this.f21694c.a(this.f21693b, G8.r("Inferring icon image from ", i12, "x", i13, "..."));
                        }
                        this.f21311o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed VAST video");
                    }
                } else if (o.a()) {
                    this.f21694c.k(this.f21693b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i14 = JsonUtils.getInt(jSONObject4, FacebookMediationAdapter.KEY_ID, -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i15 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
                if (i15 == 1 || i14 == 8) {
                    this.f21307k = string6;
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed advertiser: " + this.f21307k);
                    }
                } else if (i15 == 2 || i14 == 4) {
                    this.f21308l = string6;
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed body: " + this.f21308l);
                    }
                } else if (i15 == 12 || i14 == 5) {
                    this.f21310n = string6;
                    if (o.a()) {
                        this.f21694c.a(this.f21693b, "Processed cta: " + this.f21310n);
                    }
                } else if (i15 == 3 || i14 == 6) {
                    double dA = a7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f21309m = Double.valueOf(dA);
                        if (o.a()) {
                            this.f21694c.a(this.f21693b, "Processed star rating: " + this.f21309m);
                        }
                    } else if (o.a()) {
                        C1154e9.m("Received invalid star rating: ", string6, this.f21694c, this.f21693b);
                    }
                } else if (o.a()) {
                    this.f21694c.k(this.f21693b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (o.a()) {
                this.f21694c.b(this.f21693b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f21319w.add(string7);
            if (o.a()) {
                C1154e9.m("Processed jstracker: ", string7, this.f21694c, this.f21693b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i16, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f21321y.add(new e.a(this.f21692a).b(str2).b(false).a(false).h(f()).a());
                        if (o.a()) {
                            C1154e9.m("Processed imptracker URL: ", str2, this.f21694c, this.f21693b);
                        }
                    }
                }
            }
        }
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i17 = 0;
            while (i17 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i17, (JSONObject) r32);
                int i18 = JsonUtils.getInt(jSONObject7, "event", -1);
                int i19 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, ImagesContract.URL, r32);
                if (!TextUtils.isEmpty(string8)) {
                    if (i19 == 1 || i19 == 2) {
                        if (i19 == 2 && string8.startsWith("<script")) {
                            this.f21319w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarB = new e.a(this.f21692a).b(string8).b(false).a(false).h(f() || i19 == 2).a();
                            if (i18 == 1) {
                                this.f21321y.add(eVarB);
                                if (o.a()) {
                                    C1154e9.m("Processed impression URL: ", string8, this.f21694c, this.f21693b);
                                }
                            } else if (i18 == 2) {
                                this.f21322z.add(eVarB);
                                if (o.a()) {
                                    C1154e9.m("Processed viewable MRC50 URL: ", string8, this.f21694c, this.f21693b);
                                }
                            } else if (i18 == 3) {
                                this.f21302A.add(eVarB);
                                if (o.a()) {
                                    C1154e9.m("Processed viewable MRC100 URL: ", string8, this.f21694c, this.f21693b);
                                }
                            } else if (i18 == 4) {
                                this.f21303B.add(eVarB);
                                if (o.a()) {
                                    C1154e9.m("Processed viewable video 50 URL: ", string8, this.f21694c, this.f21693b);
                                }
                            } else if (i18 == 555) {
                                if (o.a()) {
                                    C1154e9.m("Ignoring processing of OMID URL: ", string8, this.f21694c, this.f21693b);
                                }
                            } else if (o.a()) {
                                this.f21694c.b(this.f21693b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (o.a()) {
                        this.f21694c.b(this.f21693b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i17++;
                r32 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Processing VAST video...");
        }
        this.f21692a.q0().a(v5.a(str, JsonUtils.shallowCopy(this.f21304g), JsonUtils.shallowCopy(this.f21305h), this, this.f21692a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f21304g), JsonUtils.shallowCopy(this.f21305h), this.f21692a).setTitle(this.f21306j).setAdvertiser(this.f21307k).setBody(this.f21308l).setCallToAction(this.f21310n).setStarRating(this.f21309m).setIconUri(this.f21311o).setMainImageUri(this.f21312p).setPrivacyIconUri(this.f21314r).setVastAd(this.f21313q).setPrivacyDestinationUri(this.f21315s).setClickDestinationUri(this.f21316t).setClickDestinationBackupUri(this.f21317u).setClickTrackingUrls(this.f21318v).setJsTrackers(this.f21319w).setClickTrackingRequests(this.f21320x).setImpressionRequests(this.f21321y).setViewableMRC50Requests(this.f21322z).setViewableMRC100Requests(this.f21302A).setViewableVideo50Requests(this.f21303B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f21692a.q0().a((w4) new a(appLovinNativeAdImplBuild, this.f21692a, this), r5.b.CORE);
    }

    private void b(String str) {
        this.i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0319a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f21694c.a(this.f21693b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
