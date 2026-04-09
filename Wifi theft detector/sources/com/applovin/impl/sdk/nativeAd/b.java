package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends i5 implements a.InterfaceC0085a, AppLovinAdLoadListener {
    private final List A;
    private final List B;

    /* renamed from: g, reason: collision with root package name */
    private final JSONObject f7937g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f7938h;

    /* renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f7939i;

    /* renamed from: j, reason: collision with root package name */
    private String f7940j;

    /* renamed from: k, reason: collision with root package name */
    private String f7941k;

    /* renamed from: l, reason: collision with root package name */
    private String f7942l;

    /* renamed from: m, reason: collision with root package name */
    private Double f7943m;

    /* renamed from: n, reason: collision with root package name */
    private String f7944n;

    /* renamed from: o, reason: collision with root package name */
    private Uri f7945o;

    /* renamed from: p, reason: collision with root package name */
    private Uri f7946p;

    /* renamed from: q, reason: collision with root package name */
    private o7 f7947q;

    /* renamed from: r, reason: collision with root package name */
    private Uri f7948r;

    /* renamed from: s, reason: collision with root package name */
    private Uri f7949s;

    /* renamed from: t, reason: collision with root package name */
    private Uri f7950t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f7951u;

    /* renamed from: v, reason: collision with root package name */
    private final List f7952v;

    /* renamed from: w, reason: collision with root package name */
    private final List f7953w;

    /* renamed from: x, reason: collision with root package name */
    private final List f7954x;

    /* renamed from: y, reason: collision with root package name */
    private final List f7955y;

    /* renamed from: z, reason: collision with root package name */
    private final List f7956z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.f7940j = "";
        this.f7941k = "";
        this.f7942l = "";
        this.f7943m = null;
        this.f7944n = "";
        this.f7945o = null;
        this.f7946p = null;
        this.f7948r = null;
        this.f7949s = null;
        this.f7950t = null;
        this.f7951u = null;
        this.f7952v = new ArrayList();
        this.f7953w = new ArrayList();
        this.f7954x = new ArrayList();
        this.f7955y = new ArrayList();
        this.f7956z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.f7937g = jSONObject;
        this.f7938h = jSONObject2;
        this.f7939i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.f7950t = Uri.parse(string);
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processed click destination URL: " + this.f7950t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.f7951u = Uri.parse(string2);
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processed click destination backup URL: " + this.f7951u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.f7937g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.f6218a.a(x4.O2)).booleanValue()) {
                try {
                    this.f7952v.addAll(JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed click tracking URLs: " + this.f7952v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.f7954x.add(new e.a(this.f6218a).b(str).b(false).a(false).h(f()).a());
                    }
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processed click tracking requests: " + this.f7954x);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.f7939i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.f6218a.D().a(this.f6219b, "prepareNativeComponents", th);
        }
    }

    private void c(final AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f7970a.b(appLovinNativeAdImpl);
            }
        });
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.f7937g, "fire_native_ad_postbacks_from_webview", (Boolean) this.f6218a.a(x4.N2)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "VAST ad rendered successfully");
        }
        this.f7947q = (o7) appLovinAd;
        e();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.b(this.f6219b, "VAST ad failed to render");
        }
        e();
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r32 = 0;
        String string = JsonUtils.getString(this.f7937g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.f7948r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.f7937g, CampaignEx.JSON_KEY_PRIVACY_URL, null);
        if (URLUtil.isValidUrl(string2)) {
            this.f7949s = Uri.parse(string2);
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f7937g, "ortb_response", (JSONObject) null);
        if (jSONObject == null || jSONObject.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "No oRtb response provided: " + this.f7937g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject, "version", null);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, (JSONObject) null);
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "native", jSONObject2);
        a(JsonUtils.getJSONObject(jSONObject3, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject3, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unable to retrieve assets - failing ad load: " + this.f7937g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) r32);
            if (jSONObject4.has(CampaignEx.JSON_KEY_TITLE)) {
                this.f7940j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, CampaignEx.JSON_KEY_TITLE, (JSONObject) r32), MimeTypes.BASE_TYPE_TEXT, r32);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.a(this.f6219b, "Processed title: " + this.f7940j);
                }
            } else if (jSONObject4.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) r32));
            } else if (jSONObject4.has("img")) {
                int i11 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "img", (JSONObject) r32);
                int i12 = JsonUtils.getInt(jSONObject5, HandleInvocationsFromAdViewer.KEY_AD_TYPE, -1);
                String string4 = JsonUtils.getString(jSONObject5, "url", r32);
                if (i12 == 1 || 3 == i11) {
                    this.f7945o = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed icon URL: " + this.f7945o);
                    }
                } else if (i12 == 3 || 2 == i11) {
                    this.f7946p = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed main image URL: " + this.f7946p);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.k(this.f6219b, "Unrecognized image: " + jSONObject4);
                    }
                    int i13 = JsonUtils.getInt(jSONObject5, "w", -1);
                    int i14 = JsonUtils.getInt(jSONObject5, "h", -1);
                    if (i13 <= 0 || i14 <= 0) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6220c.k(this.f6219b, "Skipping...");
                        }
                    } else if (i13 / i14 > 1.0d) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6220c.a(this.f6219b, "Inferring main image from " + i13 + "x" + i14 + "...");
                        }
                        this.f7946p = Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6220c.a(this.f6219b, "Inferring icon image from " + i13 + "x" + i14 + "...");
                        }
                        this.f7945o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject4.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject4, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.k(this.f6219b, "Ignoring invalid \"vasttag\" for video: " + jSONObject4);
                }
                str = string5;
            } else if (jSONObject4.has("data")) {
                int i15 = JsonUtils.getInt(jSONObject4, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject4, "data", (JSONObject) null);
                int i16 = JsonUtils.getInt(jSONObject6, HandleInvocationsFromAdViewer.KEY_AD_TYPE, -1);
                String string6 = JsonUtils.getString(jSONObject6, AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
                if (i16 == 1 || i15 == 8) {
                    this.f7941k = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed advertiser: " + this.f7941k);
                    }
                } else if (i16 == 2 || i15 == 4) {
                    this.f7942l = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed body: " + this.f7942l);
                    }
                } else if (i16 == 12 || i15 == 5) {
                    this.f7944n = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Processed cta: " + this.f7944n);
                    }
                } else if (i16 == 3 || i15 == 6) {
                    double dA = n7.a(string6, -1.0d);
                    if (dA != -1.0d) {
                        this.f7943m = Double.valueOf(dA);
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6220c.a(this.f6219b, "Processed star rating: " + this.f7943m);
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.a(this.f6219b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f6220c.k(this.f6219b, "Skipping unsupported data: " + jSONObject4);
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.b(this.f6219b, "Unsupported asset object: " + jSONObject4);
            }
            i10++;
            r32 = 0;
        }
        String string7 = JsonUtils.getString(jSONObject3, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.f7953w.add(string7);
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject3, "imptrackers", null);
        if (jSONArray2 != null) {
            int i17 = 0;
            while (i17 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i17, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f7955y.add(new e.a(this.f6218a).b(str2).b(false).a(false).h(f()).a());
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f6220c.a(this.f6219b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i17++;
                obj = null;
            }
        }
        ?? r62 = 0;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject3, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i18 = 0;
            while (i18 < jSONArray3.length()) {
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONArray3, i18, (JSONObject) r62);
                int i19 = JsonUtils.getInt(jSONObject7, NotificationCompat.CATEGORY_EVENT, -1);
                int i20 = JsonUtils.getInt(jSONObject7, "method", -1);
                String string8 = JsonUtils.getString(jSONObject7, "url", r62);
                if (!TextUtils.isEmpty(string8)) {
                    if (i20 == 1 || i20 == 2) {
                        if (i20 == 2 && string8.startsWith("<script")) {
                            this.f7953w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e eVarA = new e.a(this.f6218a).b(string8).b(false).a(false).h(f() || i20 == 2).a();
                            if (i19 == 1) {
                                this.f7955y.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6220c.a(this.f6219b, "Processed impression URL: " + string8);
                                }
                            } else if (i19 == 2) {
                                this.f7956z.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6220c.a(this.f6219b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i19 == 3) {
                                this.A.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6220c.a(this.f6219b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i19 == 4) {
                                this.B.add(eVarA);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6220c.a(this.f6219b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i19 == 555) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f6220c.a(this.f6219b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f6220c.b(this.f6219b, "Unsupported event tracker: " + jSONObject7);
                            }
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f6220c.b(this.f6219b, "Unsupported method for event tracker: " + jSONObject7);
                    }
                }
                i18++;
                r62 = 0;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Processing VAST video...");
        }
        this.f6218a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.f7937g), JsonUtils.shallowCopy(this.f7938h), this, this.f6218a));
    }

    private void e() {
        AppLovinNativeAdImpl appLovinNativeAdImplBuild = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.f7937g), JsonUtils.shallowCopy(this.f7938h), this.f6218a).setTitle(this.f7940j).setAdvertiser(this.f7941k).setBody(this.f7942l).setCallToAction(this.f7944n).setStarRating(this.f7943m).setIconUri(this.f7945o).setMainImageUri(this.f7946p).setPrivacyIconUri(this.f7948r).setVastAd(this.f7947q).setPrivacyDestinationUri(this.f7949s).setClickDestinationUri(this.f7950t).setClickDestinationBackupUri(this.f7951u).setClickTrackingUrls(this.f7952v).setJsTrackers(this.f7953w).setClickTrackingRequests(this.f7954x).setImpressionRequests(this.f7955y).setViewableMRC50Requests(this.f7956z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        appLovinNativeAdImplBuild.getAdEventTracker().e();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Starting cache task for type: " + appLovinNativeAdImplBuild.getType() + "...");
        }
        this.f6218a.q0().a((i5) new a(appLovinNativeAdImplBuild, this.f6218a, this), d6.b.CORE);
    }

    private void b(String str) {
        this.f7939i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    @Override // com.applovin.impl.sdk.nativeAd.a.InterfaceC0085a
    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.a(this.f6219b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
