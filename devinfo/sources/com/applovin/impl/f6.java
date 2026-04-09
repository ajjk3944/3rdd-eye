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
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f6 extends i5 {

    /* renamed from: o, reason: collision with root package name */
    private static final AtomicBoolean f4114o = new AtomicBoolean();
    private final a3 g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f4115h;

    /* renamed from: i, reason: collision with root package name */
    private final List f4116i;
    private final a.InterfaceC0014a j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f4117k;

    /* renamed from: l, reason: collision with root package name */
    private final String f4118l;

    /* renamed from: m, reason: collision with root package name */
    private long f4119m;

    /* renamed from: n, reason: collision with root package name */
    private final List f4120n;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b extends i5 {
        private final long g;

        /* renamed from: h, reason: collision with root package name */
        private final int f4121h;

        /* renamed from: i, reason: collision with root package name */
        private final y2 f4122i;
        private final List j;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public class a extends i3 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MaxAdFormat f4124b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f4125c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a.InterfaceC0014a interfaceC0014a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0014a);
                this.f4124b = maxAdFormat;
                this.f4125c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.g;
                com.applovin.impl.sdk.o unused = b.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f4289c;
                    String str2 = b.this.f4288b;
                    StringBuilder sbY = d.h.y(jElapsedRealtime, "Ad failed to load in ", " ms for ");
                    sbY.append(this.f4124b.getLabel());
                    sbY.append(" ad unit ");
                    sbY.append(str);
                    sbY.append(" with error: ");
                    sbY.append(maxError);
                    oVar.a(str2, sbY.toString());
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.f4122i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, jElapsedRealtime, maxError);
                if (b.this.f4121h >= b.this.j.size() - 1) {
                    f6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.f4287a.q0().a((i5) new b(bVar2.f4121h + 1, b.this.j), d6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long jElapsedRealtime = SystemClock.elapsedRealtime() - b.this.g;
                com.applovin.impl.sdk.o unused = b.this.f4289c;
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar = b.this.f4289c;
                    String str = b.this.f4288b;
                    StringBuilder sbY = d.h.y(jElapsedRealtime, "Ad loaded in ", "ms for ");
                    sbY.append(this.f4124b.getLabel());
                    sbY.append(" ad unit ");
                    a0.g.B(sbY, this.f4125c, oVar, str);
                }
                y2 y2Var = (y2) maxAd;
                b.this.a(y2Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, jElapsedRealtime, null);
                int i4 = b.this.f4121h;
                while (true) {
                    i4++;
                    if (i4 >= b.this.j.size()) {
                        f6.this.b(y2Var);
                        return;
                    } else {
                        b bVar = b.this;
                        bVar.a((y2) bVar.j.get(i4), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = f6.this.g.b();
            MaxAdFormat maxAdFormatA = f6.this.g.a();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f4289c;
                String str = this.f4288b;
                StringBuilder sb2 = new StringBuilder("Loading ad ");
                sb2.append(this.f4121h + 1);
                sb2.append(" of ");
                sb2.append(this.j.size());
                sb2.append(" from ");
                sb2.append(this.f4122i.c());
                sb2.append(" for ");
                sb2.append(maxAdFormatA.getLabel());
                sb2.append(" ad unit ");
                a0.g.B(sb2, strB, oVar, str);
            }
            b("started to load ad");
            Context context = (Context) f6.this.f4117k.get();
            Activity activityU0 = context instanceof Activity ? (Activity) context : this.f4287a.u0();
            this.f4287a.a0().b(this.f4122i);
            this.f4287a.X().loadThirdPartyMediatedAd(strB, this.f4122i, activityU0, new a(f6.this.j, maxAdFormatA, strB));
        }

        private b(int i4, List list) {
            super(f6.this.f4288b, f6.this.f4287a, f6.this.g.b());
            this.g = SystemClock.elapsedRealtime();
            this.f4121h = i4;
            this.f4122i = (y2) list.get(i4);
            this.j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y2 y2Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            f6.this.f4120n.add(new MaxNetworkResponseInfoImpl(adLoadState, w3.a(y2Var.b()), y2Var.E(), y2Var.W(), j, y2Var.B(), maxError));
        }
    }

    public f6(a3 a3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0014a interfaceC0014a) {
        super("TaskProcessMediationWaterfall", kVar, a3Var.b());
        this.g = a3Var;
        this.f4115h = jSONObject;
        this.j = interfaceC0014a;
        this.f4117k = new WeakReference(context);
        this.f4118l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArrayS = a0.g.s("ads", jSONObject);
        this.f4116i = new ArrayList(jSONArrayS.length());
        for (int i4 = 0; i4 < jSONArrayS.length(); i4++) {
            this.f4116i.add(y2.a(a3Var, JsonUtils.getJSONObject(jSONArrayS, i4, (JSONObject) null), jSONObject, kVar));
        }
        this.f4120n = new ArrayList(this.f4116i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        MaxErrorImpl maxErrorImpl;
        this.f4119m = SystemClock.elapsedRealtime();
        int i4 = 0;
        if (this.f4115h.optBoolean("is_testing", false) && !this.f4287a.s0().c() && f4114o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new v9(9, this));
        }
        String strB = this.g.b();
        MaxAdFormat maxAdFormatA = this.g.a();
        if (this.f4116i.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4289c.a(this.f4288b, "Starting waterfall for " + maxAdFormatA.getLabel() + " ad unit " + strB + " with " + this.f4116i.size() + " ad(s)...");
            }
            this.f4287a.q0().a(new b(i4, this.f4116i));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4289c.k(this.f4288b, "No ads were returned from the server for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        n7.a(strB, maxAdFormatA, this.f4115h, this.f4287a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f4115h, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (w3.a(this.f4115h, strB, this.f4287a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, d.h.t("Ad Unit ID ", strB, " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created"));
            if (n7.c(this.f4287a) && ((Boolean) this.f4287a.a(x4.A6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        w8 w8Var = new w8(7, this, maxErrorImpl);
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            g0.a(millis, this.f4287a, w8Var);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(w8Var, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        this.f4287a.a0().c(y2Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4119m;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f4289c;
            String str = this.f4288b;
            StringBuilder sbY = d.h.y(jElapsedRealtime, "Waterfall loaded in ", "ms from ");
            sbY.append(y2Var.c());
            sbY.append(" for ");
            sbY.append(this.g.a().getLabel());
            sbY.append(" ad unit ");
            sbY.append(this.g.b());
            oVar.d(str, sbY.toString());
        }
        y2Var.a(new MaxAdWaterfallInfoImpl(y2Var, jElapsedRealtime, this.f4120n, this.f4118l));
        t2.f(this.j, y2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        n7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.f4287a.u0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.f4120n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.f4120n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb2 = new StringBuilder("======FAILED AD LOADS======\n");
            int i4 = 0;
            while (i4 < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i4);
                i4++;
                sb2.append(i4);
                sb2.append(") ");
                sb2.append(maxNetworkResponseInfo2.getMediatedNetwork().getName());
                sb2.append("\n..code: ");
                sb2.append(maxNetworkResponseInfo2.getError().getCode());
                sb2.append("\n..message: ");
                sb2.append(maxNetworkResponseInfo2.getError().getMessage());
                sb2.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb2.toString());
        }
        String strB = this.g.b();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f4119m;
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f4289c;
            String str = this.f4288b;
            StringBuilder sbY = d.h.y(jElapsedRealtime, "Waterfall failed in ", "ms for ");
            sbY.append(this.g.a().getLabel());
            sbY.append(" ad unit ");
            sbY.append(strB);
            sbY.append(" with error: ");
            sbY.append(maxError);
            oVar.d(str, sbY.toString());
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.f4115h, "waterfall_name", ""), JsonUtils.getString(this.f4115h, "waterfall_test_name", ""), jElapsedRealtime, this.f4120n, this.g, JsonUtils.optList(JsonUtils.getJSONArray(this.f4115h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.f4118l, JsonUtils.getString(this.f4115h, "event_id", "")));
        t2.a(this.j, strB, maxError);
    }
}
