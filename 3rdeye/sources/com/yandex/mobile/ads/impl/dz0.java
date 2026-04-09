package com.yandex.mobile.ads.impl;

import N7.G8;
import android.content.Context;
import android.os.SystemClock;
import com.monetization.ads.mediation.banner.MediatedBannerSize;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener;
import com.monetization.ads.mediation.base.MediatedBidderTokenLoader;
import com.yandex.mobile.ads.impl.zr0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dz0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f26556a;

    /* renamed from: b, reason: collision with root package name */
    private final qx0<com.monetization.ads.mediation.base.a> f26557b;

    /* renamed from: c, reason: collision with root package name */
    private final cz0 f26558c;

    /* renamed from: d, reason: collision with root package name */
    private final bz0 f26559d;

    /* renamed from: e, reason: collision with root package name */
    private final ix0 f26560e;

    public interface a {
        void a(JSONObject jSONObject);
    }

    public static final class b implements MediatedBidderTokenLoadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ zy0 f26561a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ dz0 f26562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26563c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ hx0 f26564d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f26565e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ yk f26566f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f26567g;

        public b(zy0 zy0Var, dz0 dz0Var, Context context, hx0 hx0Var, a aVar, yk ykVar, long j4) {
            this.f26561a = zy0Var;
            this.f26562b = dz0Var;
            this.f26563c = context;
            this.f26564d = hx0Var;
            this.f26565e = aVar;
            this.f26566f = ykVar;
            this.f26567g = j4;
        }

        @Override // com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenFailedToLoad(String failureReason) {
            kotlin.jvm.internal.l.f(failureReason, "failureReason");
            dz0.a(this.f26562b, this.f26563c, this.f26561a, this.f26564d, failureReason, null, this.f26565e);
        }

        @Override // com.monetization.ads.mediation.base.MediatedBidderTokenLoadListener
        public final void onBidderTokenLoaded(String bidderToken, MediatedBannerSize mediatedBannerSize) throws JSONException {
            kotlin.jvm.internal.l.f(bidderToken, "bidderToken");
            if (bidderToken.length() == 0) {
                dz0.a(this.f26562b, this.f26563c, this.f26561a, this.f26564d, G8.s(this.f26561a.e(), " provided empty token"), null, this.f26565e);
                return;
            }
            if (this.f26566f.a()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f26567g;
                dz0.a(this.f26562b, this.f26563c, this.f26561a, this.f26564d, G8.s(this.f26561a.e(), " didn't provide bidder token after timeout"), Long.valueOf(jElapsedRealtime), this.f26565e);
                return;
            }
            cz0 cz0Var = this.f26562b.f26558c;
            zy0 zy0Var = this.f26561a;
            cz0Var.getClass();
            JSONObject jSONObjectA = cz0.a(zy0Var, bidderToken, mediatedBannerSize);
            if (jSONObjectA == null) {
                dz0.a(this.f26562b, this.f26563c, this.f26561a, this.f26564d, "Can't create bidding data json object for network.", null, this.f26565e);
            } else {
                dz0.a(this.f26562b, this.f26563c, this.f26561a, this.f26564d, jSONObjectA, this.f26565e);
            }
        }
    }

    public /* synthetic */ dz0(ux0 ux0Var) {
        this(ux0Var, zr0.a.a().c(), new qx0(ux0Var), new cz0(), new bz0(ux0Var), new ix0());
    }

    public static final void a(dz0 dz0Var, Context context, zy0 zy0Var, hx0 hx0Var, String str, Long l5, a aVar) {
        dz0Var.f26559d.a(context, zy0Var, hx0Var, str, l5);
        aVar.a(null);
    }

    public static final void a(dz0 dz0Var, Context context, zy0 zy0Var, hx0 hx0Var, JSONObject jSONObject, a aVar) {
        dz0Var.f26559d.a(context, zy0Var, hx0Var);
        aVar.a(jSONObject);
    }

    public dz0(ux0 mediatedAdapterReporter, Executor loadingExecutor, qx0<com.monetization.ads.mediation.base.a> mediatedAdapterCreator, cz0 mediationNetworkBiddingDataJsonCreator, bz0 bidderTokenLoadingReporter, ix0 mediatedAdDataFactory) {
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(loadingExecutor, "loadingExecutor");
        kotlin.jvm.internal.l.f(mediatedAdapterCreator, "mediatedAdapterCreator");
        kotlin.jvm.internal.l.f(mediationNetworkBiddingDataJsonCreator, "mediationNetworkBiddingDataJsonCreator");
        kotlin.jvm.internal.l.f(bidderTokenLoadingReporter, "bidderTokenLoadingReporter");
        kotlin.jvm.internal.l.f(mediatedAdDataFactory, "mediatedAdDataFactory");
        this.f26556a = loadingExecutor;
        this.f26557b = mediatedAdapterCreator;
        this.f26558c = mediationNetworkBiddingDataJsonCreator;
        this.f26559d = bidderTokenLoadingReporter;
        this.f26560e = mediatedAdDataFactory;
    }

    public final void a(final Context context, vy1 vy1Var, final zy0 mediationNetwork, final yk timeoutHolder, final a listener) {
        hx0 hx0Var;
        Throwable th;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediationNetwork, "mediationNetwork");
        kotlin.jvm.internal.l.f(timeoutHolder, "timeoutHolder");
        kotlin.jvm.internal.l.f(listener, "listener");
        final com.monetization.ads.mediation.base.a aVarA = this.f26557b.a(context, mediationNetwork, (Class<com.monetization.ads.mediation.base.a>) com.monetization.ads.mediation.base.a.class);
        if (aVarA != null) {
            this.f26560e.getClass();
            hx0Var = new hx0(aVarA);
        } else {
            hx0Var = null;
        }
        if (!(aVarA instanceof MediatedBidderTokenLoader)) {
            if (aVarA == null) {
                listener.a(null);
                return;
            } else {
                this.f26559d.a(context, mediationNetwork, hx0Var, "Can't create bidder token loader.", null);
                listener.a(null);
                return;
            }
        }
        try {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            final hx0 hx0Var2 = hx0Var;
            try {
                final HashMap map = new HashMap(mediationNetwork.i());
                if (vy1Var != null) {
                    try {
                        map.put("width", String.valueOf(vy1Var.getWidth()));
                        map.put("height", String.valueOf(vy1Var.getHeight()));
                    } catch (Throwable th2) {
                        th = th2;
                        hx0Var = hx0Var2;
                        this.f26559d.a(context, mediationNetwork, hx0Var, th.toString(), null);
                        listener.a(null);
                    }
                }
                Executor executor = this.f26556a;
                Runnable runnable = new Runnable() { // from class: com.yandex.mobile.ads.impl.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        yk ykVar = timeoutHolder;
                        dz0.a(aVarA, context, map, mediationNetwork, this, hx0Var2, listener, ykVar, jElapsedRealtime);
                    }
                };
                hx0Var = hx0Var2;
                executor.execute(runnable);
            } catch (Throwable th3) {
                th = th3;
                hx0Var = hx0Var2;
                th = th;
                this.f26559d.a(context, mediationNetwork, hx0Var, th.toString(), null);
                listener.a(null);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.monetization.ads.mediation.base.a aVar, Context context, HashMap extras, zy0 mediationNetwork, dz0 this$0, hx0 hx0Var, a listener, yk timeoutHolder, long j4) {
        kotlin.jvm.internal.l.f(context, "$context");
        kotlin.jvm.internal.l.f(extras, "$extras");
        kotlin.jvm.internal.l.f(mediationNetwork, "$mediationNetwork");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(listener, "$listener");
        kotlin.jvm.internal.l.f(timeoutHolder, "$timeoutHolder");
        ((MediatedBidderTokenLoader) aVar).loadBidderToken(context, extras, new b(mediationNetwork, this$0, context, hx0Var, listener, timeoutHolder, j4));
    }
}
