package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.d6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f6 extends i5 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f5997o = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final a3 f5998g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f5999h;

    /* renamed from: i, reason: collision with root package name */
    private final List f6000i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0078a f6001j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f6002k;

    /* renamed from: l, reason: collision with root package name */
    private final String f6003l;

    /* renamed from: m, reason: collision with root package name */
    private long f6004m;

    /* renamed from: n, reason: collision with root package name */
    private final List f6005n;

    public class b extends i5 {

        /* renamed from: g, reason: collision with root package name */
        private final long f6006g;

        /* renamed from: h, reason: collision with root package name */
        private final int f6007h;

        /* renamed from: i, reason: collision with root package name */
        private final y2 f6008i;

        /* renamed from: j, reason: collision with root package name */
        private final List f6009j;

        public class a extends i3 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f6011b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f6012c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.InterfaceC0078a interfaceC0078a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0078a);
                this.f6011b = maxAdFormat;
                this.f6012c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f6006g;
                com.applovin.impl.sdk.o unused = b.this.f6220c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f6220c.a(b.this.f6219b, "Ad failed to load in " + jElapsedRealtime + " ms for " + this.f6011b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f6008i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f6007h >= b.this.f6009j.size() - 1) {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f6218a.q0().a((i5) new b(bVar2.f6007h + 1, b.this.f6009j), d6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f6006g;
                com.applovin.impl.sdk.o unused = b.this.f6220c;
                if (com.applovin.impl.sdk.o.a()) {
                    b.this.f6220c.a(b.this.f6219b, "Ad loaded in " + jElapsedRealtime + "ms for " + this.f6011b.getLabel() + " ad unit " + this.f6012c);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i10 = b.this.f6007h;
                while (true) {
                    i10++;
                    if (i10 >= b.this.f6009j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.f6009j.get(i10), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = f6.this.f5998g.b();
            MaxAdFormat maxAdFormatA = f6.this.f5998g.a();
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Loading ad " + (this.f6007h + 1) + " of " + this.f6009j.size() + " from " + this.f6008i.c() + " for " + maxAdFormatA.getLabel() + " ad unit " + strB);
            }
            b("started to load ad");
            Context context = (Context) f6.this.f6002k.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f6218a.u0();
            this.f6218a.a0().b(this.f6008i);
            this.f6218a.X().loadThirdPartyMediatedAd(strB, this.f6008i, activityU0, new a(f6.this.f6001j, maxAdFormatA, strB));
        }

        private b(int i10, List list) {
            super(f6.this.f6219b, f6.this.f6218a, f6.this.f5998g.b());
            this.f6006g = SystemClock.elapsedRealtime();
            this.f6007h = i10;
            this.f6008i = (y2) list.get(i10);
            this.f6009j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j10, MaxError maxError) {
            f6.this.f6005n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j10, y2Var.B(), maxError));
        }
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0078a interfaceC0078a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.f5998g = a3Var;
        this.f5999h = jSONObject;
        this.f6001j = interfaceC0078a;
        this.f6002k = new WeakReference(context);
        this.f6003l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        this.f6000i = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f6000i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), jSONObject, kVar));
        }
        this.f6005n = new ArrayList(this.f6000i.size());
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        final MaxErrorImpl maxErrorImpl;
        this.f6004m = SystemClock.elapsedRealtime();
        int i10 = 0;
        if (this.f5999h.optBoolean("is_testing", false) && !this.f6218a.s0().c() && f5997o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ra
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7510a.e();
                }
            });
        }
        String strB = this.f5998g.b();
        MaxAdFormat maxAdFormatA = this.f5998g.a();
        if (this.f6000i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6220c.a(this.f6219b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f6000i.size() + " ad(s)...");
            }
            this.f6218a.q0().a(new b(i10, this.f6000i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.k(this.f6219b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        n7.a(strB, maxAdFormatA, this.f5999h, this.f6218a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f5999h, "settings", new JSONObject());
        long j10 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f5999h, strB, this.f6218a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + strB + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (n7.c(this.f6218a) && ((Boolean) this.f6218a.a(x4.A6)).booleanValue()) {
                j10 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j10 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j10);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sa
            @Override // java.lang.Runnable
            public final void run() {
                this.f7571a.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.f6218a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f6218a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6004m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.d(this.f6219b, "Waterfall loaded in " + jElapsedRealtime + "ms from " + y2Var.c() + " for " + this.f5998g.a().getLabel() + " ad unit " + this.f5998g.b());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f6005n, this.f6003l));
        t2.f(this.f6001j, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f6218a.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f6005n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f6005n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i10 = 0;
            while (i10 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i10);
                i10++;
                sb.append(i10);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String strB = this.f5998g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6004m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f6220c.d(this.f6219b, "Waterfall failed in " + jElapsedRealtime + "ms for " + this.f5998g.a().getLabel() + " ad unit " + strB + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f5999h, "waterfall_name", ""), JsonUtils.getString(this.f5999h, "waterfall_test_name", ""), jElapsedRealtime, this.f6005n, this.f5998g, JsonUtils.optList(JsonUtils.getJSONArray(this.f5999h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f6003l, JsonUtils.getString(this.f5999h, "event_id", "")));
        t2.a(this.f6001j, strB, maxError);
    }
}
