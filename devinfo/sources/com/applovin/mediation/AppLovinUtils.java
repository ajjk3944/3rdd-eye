package com.applovin.mediation;

import android.os.Bundle;
import com.applovin.mediation.AppLovinExtras;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import je.u;
import pa.a;
import va.h2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinUtils {
    private static final String DEFAULT_ZONE = "";
    public static final String ERROR_MSG_CHILD_USER = "MobileAds.getRequestConfiguration() indicates the user is a child. AppLovin SDK 13.0.0 or higher does not support child users.";
    public static final String ERROR_MSG_REASON_PREFIX = "AppLovin SDK returned a load failure callback with reason: ";

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ServerParameterKeys {
        public static final String AD_UNIT_ID = "ad_unit_id";
        public static final String SDK_KEY = "sdkKey";
        public static final String ZONE_ID = "zone_id";

        private ServerParameterKeys() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.sdk.AppLovinAdSize appLovinAdSizeFromAdMobAdSize(android.content.Context r13, pa.h r14) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            pa.h r1 = pa.h.f31527i
            r0.add(r1)
            pa.h r1 = pa.h.j
            r0.add(r1)
            r1 = 0
            if (r14 != 0) goto L15
            r3 = r1
            goto Lb5
        L15:
            boolean r2 = r14.f31534e
            if (r2 != 0) goto L40
            boolean r2 = r14.g
            if (r2 != 0) goto L40
            android.content.res.Resources r2 = r13.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r3 = r14.d(r13)
            float r3 = (float) r3
            float r3 = r3 / r2
            int r3 = java.lang.Math.round(r3)
            int r13 = r14.b(r13)
            float r13 = (float) r13
            float r13 = r13 / r2
            int r13 = java.lang.Math.round(r13)
            pa.h r14 = new pa.h
            r14.<init>(r3, r13)
        L40:
            int r13 = r0.size()
            r2 = 0
            r3 = r1
        L46:
            if (r2 >= r13) goto Lb5
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            pa.h r4 = (pa.h) r4
            if (r4 == 0) goto L46
            int r5 = r4.f31531b
            int r6 = r4.f31530a
            int r7 = r14.f31530a
            int r8 = r14.f31531b
            double r9 = (double) r7
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 * r11
            double r11 = (double) r6
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L46
            if (r7 < r6) goto L46
            boolean r7 = r14.g
            if (r7 == 0) goto L90
            int r7 = r14.f31536h
            com.google.android.gms.internal.ads.pk r8 = com.google.android.gms.internal.ads.sk.W8
            va.s r9 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r10 = r9.f36166c
            java.lang.Object r8 = r10.a(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 > r6) goto L46
            com.google.android.gms.internal.ads.pk r8 = com.google.android.gms.internal.ads.sk.X8
            com.google.android.gms.internal.ads.rk r9 = r9.f36166c
            java.lang.Object r8 = r9.a(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 > r5) goto L46
            if (r7 < r5) goto L46
            goto La8
        L90:
            boolean r7 = r14.f31534e
            if (r7 == 0) goto L99
            int r7 = r14.f31535f
            if (r7 < r5) goto L46
            goto La8
        L99:
            double r9 = (double) r8
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r9 = r9 * r11
            double r11 = (double) r5
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 > 0) goto L46
            if (r8 >= r5) goto La8
            goto L46
        La8:
            if (r3 != 0) goto Lab
            goto Lb3
        Lab:
            int r7 = r3.f31530a
            int r8 = r3.f31531b
            int r7 = r7 * r8
            int r6 = r6 * r5
            if (r7 > r6) goto L46
        Lb3:
            r3 = r4
            goto L46
        Lb5:
            pa.h r13 = pa.h.f31527i
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto Lc0
            com.applovin.sdk.AppLovinAdSize r13 = com.applovin.sdk.AppLovinAdSize.BANNER
            return r13
        Lc0:
            pa.h r13 = pa.h.j
            boolean r13 = r13.equals(r3)
            if (r13 == 0) goto Lcb
            com.applovin.sdk.AppLovinAdSize r13 = com.applovin.sdk.AppLovinAdSize.LEADER
            return r13
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.AppLovinUtils.appLovinAdSizeFromAdMobAdSize(android.content.Context, pa.h):com.applovin.sdk.AppLovinAdSize");
    }

    public static a getAdError(int i4) {
        String strR = u.r(i4, "AppLovin error code ");
        if (i4 == -8) {
            strR = "INVALID_AD_TOKEN";
        } else if (i4 == -7) {
            strR = "INVALID_ZONE";
        } else if (i4 != -6) {
            switch (i4) {
                case -1009:
                    strR = "NO_NETWORK";
                    break;
                case -1001:
                    strR = "FETCH_AD_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INVALID_URL /* -900 */:
                    strR = "INVALID_URL";
                    break;
                case AppLovinErrorCodes.INVALID_RESPONSE /* -800 */:
                    strR = "INVALID_RESPONSE";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO /* -600 */:
                    strR = "INCENTIVIZED_USER_CLOSED_VIDEO";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT /* -500 */:
                    strR = "INCENTIVIZED_SERVER_TIMEOUT";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR /* -400 */:
                    strR = "INCENTIVIZED_UNKNOWN_SERVER_ERROR";
                    break;
                case AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED /* -300 */:
                    strR = "INCENTIVIZED_NO_AD_PRELOADED";
                    break;
                case AppLovinErrorCodes.SDK_DISABLED /* -22 */:
                    strR = "SDK_DISABLED";
                    break;
                case -1:
                    strR = "UNSPECIFIED_ERROR";
                    break;
                case 204:
                    strR = "NO_FILL";
                    break;
                default:
                    switch (i4) {
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                            strR = "UNABLE_TO_PRECACHE_VIDEO_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                            strR = "UNABLE_TO_PRECACHE_IMAGE_RESOURCES";
                            break;
                        case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                            strR = "UNABLE_TO_PRECACHE_RESOURCES";
                            break;
                    }
            }
        } else {
            strR = "UNABLE_TO_RENDER_AD";
        }
        return new a(i4, u.t(ERROR_MSG_REASON_PREFIX, strR), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN, null);
    }

    public static a getChildUserError() {
        return new a(AppLovinMediationAdapter.ERROR_CHILD_USER, ERROR_MSG_CHILD_USER, AppLovinMediationAdapter.ERROR_DOMAIN, null);
    }

    public static boolean isChildUser() {
        h2.d().j.getClass();
        return false;
    }

    public static boolean isMultiAdsEnabled() {
        return true;
    }

    public static String retrieveZoneId(Bundle bundle) {
        return bundle.containsKey(ServerParameterKeys.ZONE_ID) ? bundle.getString(ServerParameterKeys.ZONE_ID) : "";
    }

    public static boolean shouldMuteAudio(Bundle bundle) {
        return bundle != null && bundle.getBoolean(AppLovinExtras.Keys.MUTE_AUDIO);
    }
}
