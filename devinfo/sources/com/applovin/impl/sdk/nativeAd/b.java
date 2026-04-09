package com.applovin.impl.sdk.nativeAd;

import a0.g;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b extends i5 implements a.InterfaceC0021a, AppLovinAdLoadListener {
    private final List A;
    private final List B;
    private final JSONObject g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f5621h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f5622i;
    private String j;

    /* renamed from: k, reason: collision with root package name */
    private String f5623k;

    /* renamed from: l, reason: collision with root package name */
    private String f5624l;

    /* renamed from: m, reason: collision with root package name */
    private Double f5625m;

    /* renamed from: n, reason: collision with root package name */
    private String f5626n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f5627o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f5628p;

    /* renamed from: q, reason: collision with root package name */
    private o7 f5629q;

    /* renamed from: r, reason: collision with root package name */
    private Uri f5630r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f5631s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f5632t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f5633u;

    /* renamed from: v, reason: collision with root package name */
    private final List f5634v;

    /* renamed from: w, reason: collision with root package name */
    private final List f5635w;

    /* renamed from: x, reason: collision with root package name */
    private final List f5636x;

    /* renamed from: y, reason: collision with root package name */
    private final List f5637y;

    /* renamed from: z, reason: collision with root package name */
    private final List f5638z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.j = "";
        this.f5623k = "";
        this.f5624l = "";
        this.f5625m = null;
        this.f5626n = "";
        this.f5627o = null;
        this.f5628p = null;
        this.f5630r = null;
        this.f5631s = null;
        this.f5632t = null;
        this.f5633u = null;
        this.f5634v = new ArrayList();
        this.f5635w = new ArrayList();
        this.f5636x = new ArrayList();
        this.f5637y = new ArrayList();
        this.f5638z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.g = jSONObject;
        this.f5621h = jSONObject2;
        this.f5622i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f5632t = Uri.parse(string);
            if (o.a()) {
                this.f4289c.a(this.f4288b, "Processed click destination URL: " + this.f5632t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f5633u = Uri.parse(string2);
            if (o.a()) {
                this.f4289c.a(this.f4288b, "Processed click destination backup URL: " + this.f5633u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f4287a.a(x4.O2)).booleanValue()) {
                try {
                    this.f5634v.addAll(JsonUtils.toList(jSONArray));
                    if (o.a()) {
                        this.f4289c.a(this.f4288b, "Processed click tracking URLs: " + this.f5634v);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (o.a()) {
                        this.f4289c.a(this.f4288b, "Failed to render click tracking URLs", th2);
                        return;
                    }
                    return;
                }
            }
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i4, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f5636x.add(new e.a(this.f4287a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (o.a()) {
                this.f4289c.a(this.f4288b, "Processed click tracking requests: " + this.f5636x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f4289c.a(this.f4288b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (o.a()) {
                this.f4289c.a(this.f4288b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f5622i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f4289c.a(this.f4288b, "Failed to prepare native ad view components", th2);
            }
            b(th2.getMessage());
            this.f4287a.D().a(this.f4288b, "prepareNativeComponents", th2);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new aj.d(8, this, appLovinNativeAdImpl));
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f4287a.a(x4.N2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (o.a()) {
            this.f4289c.a(this.f4288b, "VAST ad rendered successfully");
        }
        this.f5629q = (o7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i4) {
        if (o.a()) {
            this.f4289c.b(this.f4288b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f5630r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.f5631s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (o.a()) {
                this.f4289c.b(this.f4288b, "No oRtb response provided: " + this.g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "value", (JSONObject) null);
        if (o.a()) {
            g.x("Rendering native ad for oRTB version: ", string3, this.f4289c, this.f4288b);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (o.a()) {
                this.f4289c.b(this.f4288b, "Unable to retrieve assets - failing ad load: " + this.g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i4, (JSONObject) null);
            if (jSONObject4.has("title")) {
                this.j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "title", (JSONObject) null), "text", null);
                if (o.a()) {
                    g.B(new StringBuilder("Processed title: "), this.j, this.f4289c, this.f4288b);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
            } else if (jSONObject4.has("img")) {
                int i10 = JsonUtils.getInt(jSONObject4, FacebookMediationAdapter.KEY_ID, -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) null);
                int i11 = JsonUtils.getInt(jSONObject5, "type", -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", null);
                if (i11 == 1 || 3 == i10) {
                    this.f5627o = Uri.parse(string4);
                    if (o.a()) {
                        this.f4289c.a(this.f4288b, "Processed icon URL: " + this.f5627o);
                    }
                } else if (i11 == 3 || 2 == i10) {
                    this.f5628p = Uri.parse(string4);
                    if (o.a()) {
                        this.f4289c.a(this.f4288b, "Processed main image URL: " + this.f5628p);
                    }
                } else {
                    if (o.a()) {
                        this.f4289c.k(this.f4288b, "Unrecognized image: " + jSONObject4);
                    }
                    int i12 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i13 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i12 <= 0 || i13 <= 0) {
                        if (o.a()) {
                            this.f4289c.k(this.f4288b, "Skipping...");
                        }
                    } else if (i12 / i13 > 1.0d) {
                        if (o.a()) {
                            this.f4289c.a(this.f4288b, r5.c.i(i12, "Inferring main image from ", "x", i13, "..."));
                        }
                        this.f5628p = Uri.parse(string4);
                    } else {
                        if (o.a()) {
                            this.f4289c.a(this.f4288b, r5.c.i(i12, "Inferring icon image from ", "x", i13, "..."));
                        }
                        this.f5627o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (o.a()) {
                        this.f4289c.a(this.f4288b, "Processed VAST video");
                    }
                } else if (o.a()) {
                    this.f4289c.k(this.f4288b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i14 = JsonUtils.getInt(jSONObject4, FacebookMediationAdapter.KEY_ID, -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i15 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string6 = JsonUtils.getString(jSONObject6, "value", null);
                if (i15 == 1 || i14 == 8) {
                    this.f5623k = string6;
                    if (o.a()) {
                        g.B(new StringBuilder("Processed advertiser: "), this.f5623k, this.f4289c, this.f4288b);
                    }
                } else if (i15 == 2 || i14 == 4) {
                    this.f5624l = string6;
                    if (o.a()) {
                        g.B(new StringBuilder("Processed body: "), this.f5624l, this.f4289c, this.f4288b);
                    }
                } else if (i15 == 12 || i14 == 5) {
                    this.f5626n = string6;
                    if (o.a()) {
                        g.B(new StringBuilder("Processed cta: "), this.f5626n, this.f4289c, this.f4288b);
                    }
                } else if (i15 == 3 || i14 == 6) {
                    double dA = n7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f5625m = Double.valueOf(dA);
                        if (o.a()) {
                            this.f4289c.a(this.f4288b, "Processed star rating: " + this.f5625m);
                        }
                    } else if (o.a()) {
                        g.x("Received invalid star rating: ", string6, this.f4289c, this.f4288b);
                    }
                } else if (o.a()) {
                    this.f4289c.k(this.f4288b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (o.a()) {
                this.f4289c.b(this.f4288b, "Unsupported asset object: " + jSONObject4);
            }
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f5635w.add(string7);
            if (o.a()) {
                g.x("Processed jstracker: ", string7, this.f4289c, this.f4288b);
            }
        }
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            for (int i16 = 0; i16 < jSONArray2.length(); i16++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i16, null);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f5637y.add(new e.a(this.f4287a).b(str2).b(false).a(false).h(f()).a());
                        if (o.a()) {
                            this.f4289c.a(this.f4288b, "Processed imptracker URL: ".concat(str2));
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
                String string8 = JsonUtils.getString(jSONObject7, "url", r32);
                if (!TextUtils.isEmpty(string8)) {
                    if (i19 == 1 || i19 == 2) {
                        if (i19 == 2 && string8.startsWith("<script")) {
                            this.f5635w.add(string8);
                        } else {
                            e eVarB = new e.a(this.f4287a).b(string8).b(false).a(false).h(f() || i19 == 2).a();
                            if (i18 == 1) {
                                this.f5637y.add(eVarB);
                                if (o.a()) {
                                    g.x("Processed impression URL: ", string8, this.f4289c, this.f4288b);
                                }
                            } else if (i18 == 2) {
                                this.f5638z.add(eVarB);
                                if (o.a()) {
                                    g.x("Processed viewable MRC50 URL: ", string8, this.f4289c, this.f4288b);
                                }
                            } else if (i18 == 3) {
                                this.A.add(eVarB);
                                if (o.a()) {
                                    g.x("Processed viewable MRC100 URL: ", string8, this.f4289c, this.f4288b);
                                }
                            } else if (i18 == 4) {
                                this.B.add(eVarB);
                                if (o.a()) {
                                    g.x("Processed viewable video 50 URL: ", string8, this.f4289c, this.f4288b);
                                }
                            } else if (i18 == 555) {
                                if (o.a()) {
                                    g.x("Ignoring processing of OMID URL: ", string8, this.f4289c, this.f4288b);
                                }
                            } else if (o.a()) {
                                this.f4289c.b(this.f4288b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (o.a()) {
                        this.f4289c.b(this.f4288b, "Unsupported method for event tracker: " + jSONObject7);
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
            this.f4289c.a(this.f4288b, "Processing VAST video...");
        }
        this.f4287a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.g), JsonUtils.shallowCopy(this.f5621h), this, this.f4287a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.g), JsonUtils.shallowCopy(this.f5621h), this.f4287a).setTitle(this.j).setAdvertiser(this.f5623k).setBody(this.f5624l).setCallToAction(this.f5626n).setStarRating(this.f5625m).setIconUri(this.f5627o).setMainImageUri(this.f5628p).setPrivacyIconUri(this.f5630r).setVastAd(this.f5629q).setPrivacyDestinationUri(this.f5631s).setClickDestinationUri(this.f5632t).setClickDestinationBackupUri(this.f5633u).setClickTrackingUrls(this.f5634v).setJsTrackers(this.f5635w).setClickTrackingRequests(this.f5636x).setImpressionRequests(this.f5637y).setViewableMRC50Requests(this.f5638z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (o.a()) {
            this.f4289c.a(this.f4288b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f4287a.q0().a((i5) new a(appLovinNativeAdImplBuild, this.f4287a, this), d6.b.CORE);
    }

    private void b(String str) {
        this.f5622i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0021a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.f4289c.a(this.f4288b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
