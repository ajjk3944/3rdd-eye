package com.yandex.mobile.ads.video.playback.model;

import N7.C1154e9;
import com.google.android.gms.measurement.internal.a;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class VideoAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f36938a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36939b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36940c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36941d;

    /* renamed from: e, reason: collision with root package name */
    private final String f36942e;

    /* renamed from: f, reason: collision with root package name */
    private final String f36943f;

    public VideoAdInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f36938a = str;
        this.f36939b = str2;
        this.f36940c = str3;
        this.f36941d = str4;
        this.f36942e = str5;
        this.f36943f = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VideoAdInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.video.playback.model.VideoAdInfo");
        VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
        return l.b(this.f36938a, videoAdInfo.f36938a) && l.b(this.f36939b, videoAdInfo.f36939b) && l.b(this.f36940c, videoAdInfo.f36940c) && l.b(this.f36941d, videoAdInfo.f36941d) && l.b(this.f36942e, videoAdInfo.f36942e) && l.b(this.f36943f, videoAdInfo.f36943f);
    }

    public final String getAdId() {
        return this.f36938a;
    }

    public final String getAdParameters() {
        return this.f36943f;
    }

    public final String getAdvertiserInfo() {
        return this.f36942e;
    }

    public final String getBannerId() {
        return this.f36940c;
    }

    public final String getCreativeId() {
        return this.f36939b;
    }

    public final String getData() {
        return this.f36941d;
    }

    public int hashCode() {
        String str = this.f36938a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f36939b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f36940c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f36941d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f36942e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f36943f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.f36938a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f36939b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f36940c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.f36941d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = this.f36942e;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = this.f36943f;
        String str7 = str6 != null ? str6 : "";
        StringBuilder sbD = j6.l.d("VideoAdInfo (adId: ", str, ", creativeId: ", str2, ", bannerId: ");
        a.l(sbD, str3, ", data: ", str4, ", advertiserInfo: ");
        return C1154e9.j(sbD, str5, ", adParameters: ", str7, ")");
    }
}
