package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class lb2 {
    public static String a(long j4, mc2 adPodInfo, za2 videoAd) {
        kotlin.jvm.internal.l.f(adPodInfo, "adPodInfo");
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        int iA = adPodInfo.a();
        String strG = videoAd.g();
        if (strG == null) {
            strG = String.valueOf(hi0.a());
        }
        StringBuilder sb = new StringBuilder("ad_break_#");
        sb.append(j4);
        sb.append("|position_");
        sb.append(iA);
        return B4.f.c(sb, "|video_ad_#", strG);
    }
}
