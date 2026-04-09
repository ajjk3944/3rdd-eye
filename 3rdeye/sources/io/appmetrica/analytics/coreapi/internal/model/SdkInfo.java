package io.appmetrica.analytics.coreapi.internal.model;

import B4.g;
import N7.B8;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class SdkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f38896a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38897b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38898c;

    public SdkInfo(String str, String str2, String str3) {
        this.f38896a = str;
        this.f38897b = str2;
        this.f38898c = str3;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sdkInfo.f38896a;
        }
        if ((i & 2) != 0) {
            str2 = sdkInfo.f38897b;
        }
        if ((i & 4) != 0) {
            str3 = sdkInfo.f38898c;
        }
        return sdkInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f38896a;
    }

    public final String component2() {
        return this.f38897b;
    }

    public final String component3() {
        return this.f38898c;
    }

    public final SdkInfo copy(String str, String str2, String str3) {
        return new SdkInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkInfo)) {
            return false;
        }
        SdkInfo sdkInfo = (SdkInfo) obj;
        return l.b(this.f38896a, sdkInfo.f38896a) && l.b(this.f38897b, sdkInfo.f38897b) && l.b(this.f38898c, sdkInfo.f38898c);
    }

    public final String getSdkBuildNumber() {
        return this.f38897b;
    }

    public final String getSdkBuildType() {
        return this.f38898c;
    }

    public final String getSdkVersionName() {
        return this.f38896a;
    }

    public int hashCode() {
        return this.f38898c.hashCode() + g.n(this.f38896a.hashCode() * 31, 31, this.f38897b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SdkInfo(sdkVersionName=");
        sb.append(this.f38896a);
        sb.append(", sdkBuildNumber=");
        sb.append(this.f38897b);
        sb.append(", sdkBuildType=");
        return B8.j(sb, this.f38898c, ')');
    }
}
