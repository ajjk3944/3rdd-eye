package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.b0;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.w;
import com.vungle.ads.z;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class VungleInternal {
    /* renamed from: getAvailableBidTokensAsync$lambda-0, reason: not valid java name */
    private static final BidTokenEncoder m304getAvailableBidTokensAsync$lambda0(y8.h hVar) {
        return (BidTokenEncoder) hVar.getValue();
    }

    /* renamed from: getAvailableBidTokensAsync$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.d m305getAvailableBidTokensAsync$lambda1(y8.h hVar) {
        return (com.vungle.ads.internal.executor.d) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getAvailableBidTokensAsync$lambda-2, reason: not valid java name */
    public static final void m306getAvailableBidTokensAsync$lambda2(com.vungle.ads.h callback, y8.h bidTokenEncoder$delegate) throws Throwable {
        p.e(callback, "$callback");
        p.e(bidTokenEncoder$delegate, "$bidTokenEncoder$delegate");
        z zVar = new z(Sdk$SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        zVar.markStart();
        BidTokenEncoder.b bVarEncode = m304getAvailableBidTokensAsync$lambda0(bidTokenEncoder$delegate).encode();
        zVar.markEnd();
        if (bVarEncode.getBidToken().length() > 0) {
            callback.onBidTokenCollected(bVarEncode.getBidToken());
        } else {
            zVar.setMetricType(Sdk$SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            zVar.setMeta(bVarEncode.getErrorMessage());
            callback.onBidTokenError(bVarEncode.getErrorMessage());
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, zVar, (o) null, (String) null, 6, (Object) null);
    }

    public final void getAvailableBidTokensAsync(@NotNull final Context context, @NotNull final com.vungle.ads.h callback) {
        p.e(context, "context");
        p.e(callback, "callback");
        if (w.INSTANCE.isOSVersionInvalid()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            callback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!b0.Companion.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            p.d(applicationContext, "context.applicationContext");
            privacyManager.init(applicationContext);
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f21907a;
        final y8.h hVarA = kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.BidTokenEncoder, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final BidTokenEncoder invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(BidTokenEncoder.class);
            }
        });
        m305getAvailableBidTokensAsync$lambda1(kotlin.b.a(lazyThreadSafetyMode, new l9.a() { // from class: com.vungle.ads.internal.VungleInternal$getAvailableBidTokensAsync$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.d, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.executor.d invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.executor.d.class);
            }
        })).getApiExecutor().execute(new Runnable() { // from class: com.vungle.ads.internal.k
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                VungleInternal.m306getAvailableBidTokensAsync$lambda2(callback, hVarA);
            }
        });
    }

    @NotNull
    public final String getSdkVersion() {
        return "7.6.3";
    }
}
