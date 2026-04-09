package com.yandex.mobile.ads.common;

import B4.f;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f23951a;

    /* renamed from: b, reason: collision with root package name */
    private final AdSize f23952b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23953c;

    public AdInfo(String adUnitId, AdSize adSize, String str) {
        l.f(adUnitId, "adUnitId");
        this.f23951a = adUnitId;
        this.f23952b = adSize;
        this.f23953c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AdInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) obj;
        return l.b(this.f23951a, adInfo.f23951a) && l.b(this.f23952b, adInfo.f23952b) && l.b(this.f23953c, adInfo.f23953c);
    }

    public final AdSize getAdSize() {
        return this.f23952b;
    }

    public final String getAdUnitId() {
        return this.f23951a;
    }

    public final String getData() {
        return this.f23953c;
    }

    public int hashCode() {
        int iHashCode = this.f23951a.hashCode() * 31;
        AdSize adSize = this.f23952b;
        int iHashCode2 = (iHashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.f23953c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.f23951a;
        AdSize adSize = this.f23952b;
        String string = adSize != null ? adSize.toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = this.f23953c;
        return f.c(j6.l.d("AdSize (adUnitId: ", str, ", adSize: ", string, ", data: "), str2 != null ? str2 : "", ")");
    }

    public /* synthetic */ AdInfo(String str, AdSize adSize, String str2, int i, g gVar) {
        this(str, adSize, (i & 4) != 0 ? null : str2);
    }
}
