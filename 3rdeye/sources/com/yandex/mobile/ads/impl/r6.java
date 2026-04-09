package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;

/* loaded from: classes3.dex */
public final class r6 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32534a;

        static {
            int[] iArr = new int[AdQualityVerificationMode.values().length];
            try {
                iArr[AdQualityVerificationMode.FAST_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdQualityVerificationMode.LONG_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32534a = iArr;
        }
    }

    private static String a(AdQualityVerificationState adQualityVerificationState) {
        String strD;
        if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
            strD = "Blocked: " + ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason().getBlockReasons();
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.Error) {
            strD = androidx.work.s.d("Error occurred during verification: ", ((AdQualityVerificationState.Error) adQualityVerificationState).getError().getDescription());
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.NotStarted) {
            strD = "Not verification started for the ad object";
        } else if (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay) {
            strD = "Should be blocked on display: " + ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason().getBlockReasons();
        } else {
            if (!(adQualityVerificationState instanceof AdQualityVerificationState.Verified)) {
                throw new b9.j();
            }
            strD = "Verified";
        }
        return androidx.work.s.d("Verification Completed. With result: ", strD);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.jp1 b(com.monetization.ads.quality.base.result.AdQualityVerificationResult r5) {
        /*
            java.lang.String r0 = "verificationResult"
            kotlin.jvm.internal.l.f(r5, r0)
            com.yandex.mobile.ads.impl.jp1 r0 = new com.yandex.mobile.ads.impl.jp1
            c9.u r1 = c9.C2100u.f18582b
            r2 = 2
            r0.<init>(r1, r2)
            java.lang.String r1 = a(r5)
            java.lang.String r3 = "verification_status"
            r0.b(r1, r3)
            boolean r1 = r5 instanceof com.monetization.ads.quality.base.result.AdQualityVerificationResult.Verified
            if (r1 == 0) goto L3e
            r3 = r5
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$Verified r3 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult.Verified) r3
            com.monetization.ads.quality.base.AdQualityVerificationStateFlow r3 = r3.getVerifiedAd()
            com.monetization.ads.quality.base.model.AdQualityVerificationMode r3 = r3.getVerificationMode()
            int[] r4 = com.yandex.mobile.ads.impl.r6.a.f32534a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            if (r3 == r4) goto L3b
            if (r3 != r2) goto L35
            java.lang.String r2 = "longVerification"
            goto L3f
        L35:
            b9.j r5 = new b9.j
            r5.<init>()
            throw r5
        L3b:
            java.lang.String r2 = "fastVerification"
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.String r3 = "verification_flow"
            r0.b(r2, r3)
            if (r1 == 0) goto L66
            r1 = r5
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$Verified r1 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult.Verified) r1
            com.monetization.ads.quality.base.AdQualityVerificationStateFlow r1 = r1.getVerifiedAd()
            D9.I r1 = r1.getVerificationResultStateFlow()
            java.lang.Object r1 = r1.getValue()
            com.monetization.ads.quality.base.state.AdQualityVerificationState r1 = (com.monetization.ads.quality.base.state.AdQualityVerificationState) r1
            boolean r2 = r1 instanceof com.monetization.ads.quality.base.state.AdQualityVerificationState.Verified
            if (r2 != 0) goto L63
            boolean r2 = r1 instanceof com.monetization.ads.quality.base.state.AdQualityVerificationState.Blocked
            if (r2 != 0) goto L63
            boolean r1 = r1 instanceof com.monetization.ads.quality.base.state.AdQualityVerificationState.ShouldBeBlockedOnDisplay
            if (r1 == 0) goto L66
        L63:
            java.lang.String r5 = "success"
            goto L81
        L66:
            boolean r1 = r5 instanceof com.monetization.ads.quality.base.result.AdQualityVerificationResult.NotVerified
            if (r1 == 0) goto L7f
            com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotVerified r5 = (com.monetization.ads.quality.base.result.AdQualityVerificationResult.NotVerified) r5
            com.monetization.ads.quality.base.model.AdQualityVerificationError r5 = r5.getReason()
            boolean r1 = r5 instanceof com.monetization.ads.quality.base.model.AdQualityVerificationError.DisabledError
            if (r1 != 0) goto L7c
            boolean r1 = r5 instanceof com.monetization.ads.quality.base.model.AdQualityVerificationError.LowUsagePercent
            if (r1 != 0) goto L7c
            boolean r5 = r5 instanceof com.monetization.ads.quality.base.model.AdQualityVerificationError.UnsupportedNetwork
            if (r5 == 0) goto L7f
        L7c:
            java.lang.String r5 = "verification not enabled"
            goto L81
        L7f:
            java.lang.String r5 = "error"
        L81:
            java.lang.String r1 = "status"
            r0.b(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.r6.b(com.monetization.ads.quality.base.result.AdQualityVerificationResult):com.yandex.mobile.ads.impl.jp1");
    }

    private static String a(AdQualityVerificationResult adQualityVerificationResult) {
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotImplemented) {
            return "Not implemented by design";
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) {
            return "Verification not started";
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified) {
            return androidx.work.s.d("Not verified by reason: ", ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason().getDescription());
        }
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
            return a(((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue());
        }
        throw new b9.j();
    }
}
