package com.vungle.ads.internal.bidding;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.a;
import com.vungle.ads.internal.util.m;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.y;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.t;
import kotlinx.serialization.f;
import l9.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.d;
import q7.j;
import y8.h;
import y8.s;
import z9.c;
import z9.k;

/* loaded from: classes3.dex */
public final class BidTokenEncoder {

    @NotNull
    public static final c Companion = new c(null);

    @NotNull
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;

    @NotNull
    private y bidTokenRequestedMetric;

    @NotNull
    private final Context context;
    private long enterBackgroundTime;

    @NotNull
    private final z9.a json;
    private int ordinalView;

    public static final class a extends a.b {
        public a() {
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onBackground() {
            BidTokenEncoder.this.onPause$vungle_ads_release();
        }

        @Override // com.vungle.ads.internal.util.a.b
        public void onForeground() {
            BidTokenEncoder.this.onResume$vungle_ads_release();
        }
    }

    public static final class b {

        @NotNull
        private final String bidToken;

        @NotNull
        private final String errorMessage;

        public b(@NotNull String bidToken, @NotNull String errorMessage) {
            p.e(bidToken, "bidToken");
            p.e(errorMessage, "errorMessage");
            this.bidToken = bidToken;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ b copy$default(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.bidToken;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.errorMessage;
            }
            return bVar.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.bidToken;
        }

        @NotNull
        public final String component2() {
            return this.errorMessage;
        }

        @NotNull
        public final b copy(@NotNull String bidToken, @NotNull String errorMessage) {
            p.e(bidToken, "bidToken");
            p.e(errorMessage, "errorMessage");
            return new b(bidToken, errorMessage);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.a(this.bidToken, bVar.bidToken) && p.a(this.errorMessage, bVar.errorMessage);
        }

        @NotNull
        public final String getBidToken() {
            return this.bidToken;
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return (this.bidToken.hashCode() * 31) + this.errorMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return "BiddingTokenInfo(bidToken=" + this.bidToken + ", errorMessage=" + this.errorMessage + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(i iVar) {
            this();
        }

        private c() {
        }
    }

    public BidTokenEncoder(@NotNull Context context) {
        p.e(context, "context");
        this.context = context;
        this.bidTokenRequestedMetric = new y(Sdk$SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.json = k.b(null, new l() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$json$1
            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((c) obj);
                return s.f25199a;
            }

            public final void invoke(@NotNull c Json) {
                p.e(Json, "$this$Json");
                Json.f(true);
                Json.d(true);
                Json.e(false);
            }
        }, 1, null);
        com.vungle.ads.internal.util.a.Companion.addLifecycleListener(new a());
    }

    /* renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final VungleApiClient m307constructV6Token$lambda0(h hVar) {
        return (VungleApiClient) hVar.getValue();
    }

    private final b generateBidToken() throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.bidTokenRequestedMetric, (o) null, (String) null, 6, (Object) null);
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            p.a aVar = com.vungle.ads.internal.util.p.Companion;
            aVar.d(TAG, "BidToken: " + strConstructV6Token$vungle_ads_release);
            try {
                String str = "6:" + m.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
                aVar.d(TAG, "After conversion: " + str);
                return new b(str, "");
            } catch (Throwable th) {
                String str2 = "Fail to gzip token data. " + th.getLocalizedMessage();
                new GzipEncodeError(str2).logErrorNoReturnValue$vungle_ads_release();
                return new b("", str2);
            }
        } catch (Throwable th2) {
            String str3 = "Failed to encode TokenParameters. " + th2.getLocalizedMessage();
            new JsonEncodeError(str3).logErrorNoReturnValue$vungle_ads_release();
            return new b("", str3);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    @NotNull
    public final String constructV6Token$vungle_ads_release() throws IllegalStateException {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        d dVarRequestBody = m307constructV6Token$lambda0(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$constructV6Token$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final VungleApiClient invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(VungleApiClient.class);
            }
        })).requestBody(!r1.signalsDisabled(), ConfigManager.INSTANCE.fpdEnabled());
        j jVar = new j(dVarRequestBody.getDevice(), dVarRequestBody.getUser(), dVarRequestBody.getExt(), new q7.i(com.vungle.ads.internal.network.j.INSTANCE.getHeaderUa()), this.ordinalView);
        z9.a aVar = this.json;
        kotlinx.serialization.b bVarB = f.b(aVar.a(), t.m(j.class));
        kotlin.jvm.internal.p.c(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return aVar.c(bVarB, jVar);
    }

    @NotNull
    public final b encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    public final long getEnterBackgroundTime$vungle_ads_release() {
        return this.enterBackgroundTime;
    }

    public final int getOrdinalView$vungle_ads_release() {
        return this.ordinalView;
    }

    @VisibleForTesting(otherwise = 2)
    public final void onPause$vungle_ads_release() {
        com.vungle.ads.internal.util.p.Companion.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    @VisibleForTesting(otherwise = 2)
    public final void onResume$vungle_ads_release() {
        com.vungle.ads.internal.util.p.Companion.d(TAG, "BidTokenEncoder#onForeground()");
        if (System.currentTimeMillis() > this.enterBackgroundTime + ConfigManager.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setOrdinalView$vungle_ads_release(int i10) {
        this.ordinalView = i10;
    }
}
