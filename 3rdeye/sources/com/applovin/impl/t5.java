package com.applovin.impl;

import N7.H7;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.r5;
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
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t5 extends w4 {

    /* renamed from: p, reason: collision with root package name */
    private static final AtomicBoolean f21451p = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final String f21452g;

    /* renamed from: h, reason: collision with root package name */
    private final MaxAdFormat f21453h;
    private final JSONObject i;

    /* renamed from: j, reason: collision with root package name */
    private final List f21454j;

    /* renamed from: k, reason: collision with root package name */
    private final a.InterfaceC0312a f21455k;

    /* renamed from: l, reason: collision with root package name */
    private final WeakReference f21456l;

    /* renamed from: m, reason: collision with root package name */
    private final String f21457m;

    /* renamed from: n, reason: collision with root package name */
    private long f21458n;

    /* renamed from: o, reason: collision with root package name */
    private final List f21459o;

    public class b extends w4 {

        /* renamed from: g, reason: collision with root package name */
        private final long f21460g;

        /* renamed from: h, reason: collision with root package name */
        private final int f21461h;
        private final q2 i;

        /* renamed from: j, reason: collision with root package name */
        private final List f21462j;

        public class a extends z2 {
            public a(a.InterfaceC0312a interfaceC0312a) {
                super(interfaceC0312a);
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f21460g;
                com.applovin.impl.sdk.o unused = b.this.f21694c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f21694c;
                    String str2 = b.this.f21693b;
                    StringBuilder sbJ = androidx.work.s.j("Ad failed to load in ", " ms for ", jElapsedRealtime);
                    sbJ.append(t5.this.f21453h.getLabel());
                    sbJ.append(" ad unit ");
                    sbJ.append(t5.this.f21452g);
                    sbJ.append(" with error: ");
                    sbJ.append(maxError);
                    oVar.a(str2, sbJ.toString());
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f21461h >= b.this.f21462j.size() - 1) {
                    t5.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f21692a.q0().a((w4) new b(bVar2.f21461h + 1, b.this.f21462j), r5.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.f21460g;
                com.applovin.impl.sdk.o unused = b.this.f21694c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f21694c;
                    String str = b.this.f21693b;
                    StringBuilder sbJ = androidx.work.s.j("Ad loaded in ", "ms for ", jElapsedRealtime);
                    sbJ.append(t5.this.f21453h.getLabel());
                    sbJ.append(" ad unit ");
                    sbJ.append(t5.this.f21452g);
                    oVar.a(str, sbJ.toString());
                }
                q2 q2Var = (q2) maxAd;
                b.this.a(q2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i = b.this.f21461h;
                while (true) {
                    i++;
                    if (i >= b.this.f21462j.size()) {
                        t5.this.b(q2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((q2) bVar.f21462j.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Loading ad " + (this.f21461h + 1) + " of " + this.f21462j.size() + " from " + this.i.c() + " for " + t5.this.f21453h.getLabel() + " ad unit " + t5.this.f21452g);
            }
            b("started to load ad");
            Context context = (Context) t5.this.f21456l.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f21692a.u0();
            this.f21692a.a0().b(this.i);
            this.f21692a.X().loadThirdPartyMediatedAd(t5.this.f21452g, this.i, activityU0, new a(t5.this.f21455k));
        }

        private b(int i, List list) {
            super(t5.this.f21693b, t5.this.f21692a, t5.this.f21452g);
            this.f21460g = SystemClock.elapsedRealtime();
            this.f21461h = i;
            this.i = (q2) list.get(i);
            this.f21462j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(q2 q2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j4, MaxError maxError) {
            t5.this.f21459o.add(new MaxNetworkResponseInfoImpl(adLoadState, l3.a(q2Var.b()), q2Var.F(), q2Var.T(), j4, q2Var.C(), maxError));
        }
    }

    public t5(String str, MaxAdFormat maxAdFormat, Map map, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0312a interfaceC0312a) {
        super("TaskProcessMediationWaterfall", kVar, str);
        this.f21452g = str;
        this.f21453h = maxAdFormat;
        this.i = jSONObject;
        this.f21455k = interfaceC0312a;
        this.f21456l = new WeakReference(context);
        this.f21457m = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArrayQ = H7.q("ads", jSONObject);
        this.f21454j = new ArrayList(jSONArrayQ.length());
        for (int i = 0; i < jSONArrayQ.length(); i++) {
            this.f21454j.add(q2.a(map, JsonUtils.getJSONObject(jSONArrayQ, i, (JSONObject) null), jSONObject, kVar));
        }
        this.f21459o = new ArrayList(this.f21454j.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f21458n = SystemClock.elapsedRealtime();
        int i = 0;
        if (this.i.optBoolean("is_testing", false) && !this.f21692a.s0().c() && f21451p.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new B.b(this, 22));
        }
        if (this.f21454j.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21694c.a(this.f21693b, "Starting waterfall for " + this.f21453h.getLabel() + " ad unit " + this.f21452g + " with " + this.f21454j.size() + " ad(s)...");
            }
            this.f21692a.q0().a(new b(i, this.f21454j));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21694c.k(this.f21693b, "No ads were returned from the server for " + this.f21453h.getLabel() + " ad unit " + this.f21452g);
        }
        a7.a(this.f21452g, this.f21453h, this.i, this.f21692a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.i, "settings", new JSONObject());
        long j4 = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (l3.a(this.i, this.f21452g, this.f21692a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, B4.f.c(new StringBuilder("Ad Unit ID "), this.f21452g, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://developers.applovin.com/en/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (a7.c(this.f21692a) && ((Boolean) this.f21692a.a(l4.f19859W5)).booleanValue()) {
                j4 = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j4 <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j4);
        B.c cVar = new B.c(25, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            C2112c0.a(millis, this.f21692a, cVar);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(cVar, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        a7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f21692a.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(q2 q2Var) {
        this.f21692a.a0().c(q2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21458n;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f21694c;
            String str = this.f21693b;
            StringBuilder sbJ = androidx.work.s.j("Waterfall loaded in ", "ms from ", jElapsedRealtime);
            sbJ.append(q2Var.c());
            sbJ.append(" for ");
            sbJ.append(this.f21453h.getLabel());
            sbJ.append(" ad unit ");
            sbJ.append(this.f21452g);
            oVar.d(str, sbJ.toString());
        }
        q2Var.a(new MaxAdWaterfallInfoImpl(q2Var, jElapsedRealtime, this.f21459o, this.f21457m));
        l2.f(this.f21455k, q2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f21459o.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f21459o) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb.append("\n..code: ");
                sb.append(maxNetworkResponseInfo2.getError().getCode());
                sb.append("\n..message: ");
                sb.append(maxNetworkResponseInfo2.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f21458n;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f21694c;
            String str = this.f21693b;
            StringBuilder sbJ = androidx.work.s.j("Waterfall failed in ", "ms for ", jElapsedRealtime);
            sbJ.append(this.f21453h.getLabel());
            sbJ.append(" ad unit ");
            sbJ.append(this.f21452g);
            sbJ.append(" with error: ");
            sbJ.append(maxError);
            oVar.d(str, sbJ.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.i, "waterfall_name", ""), JsonUtils.getString(this.i, "waterfall_test_name", ""), jElapsedRealtime, this.f21459o, JsonUtils.optList(JsonUtils.getJSONArray(this.i, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f21457m));
        l2.a(this.f21455k, this.f21452g, maxError);
    }
}
