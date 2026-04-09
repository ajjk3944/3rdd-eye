package io.appmetrica.analytics.coreapi.internal.model;

import B4.g;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class SdkEnvironment {

    /* renamed from: a, reason: collision with root package name */
    private final AppVersionInfo f38890a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38891b;

    /* renamed from: c, reason: collision with root package name */
    private final ScreenInfo f38892c;

    /* renamed from: d, reason: collision with root package name */
    private final SdkInfo f38893d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38894e;

    /* renamed from: f, reason: collision with root package name */
    private final List f38895f;

    public SdkEnvironment(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        this.f38890a = appVersionInfo;
        this.f38891b = str;
        this.f38892c = screenInfo;
        this.f38893d = sdkInfo;
        this.f38894e = str2;
        this.f38895f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            appVersionInfo = sdkEnvironment.f38890a;
        }
        if ((i & 2) != 0) {
            str = sdkEnvironment.f38891b;
        }
        if ((i & 4) != 0) {
            screenInfo = sdkEnvironment.f38892c;
        }
        if ((i & 8) != 0) {
            sdkInfo = sdkEnvironment.f38893d;
        }
        if ((i & 16) != 0) {
            str2 = sdkEnvironment.f38894e;
        }
        if ((i & 32) != 0) {
            list = sdkEnvironment.f38895f;
        }
        String str3 = str2;
        List list2 = list;
        return sdkEnvironment.copy(appVersionInfo, str, screenInfo, sdkInfo, str3, list2);
    }

    public final AppVersionInfo component1() {
        return this.f38890a;
    }

    public final String component2() {
        return this.f38891b;
    }

    public final ScreenInfo component3() {
        return this.f38892c;
    }

    public final SdkInfo component4() {
        return this.f38893d;
    }

    public final String component5() {
        return this.f38894e;
    }

    public final List<String> component6() {
        return this.f38895f;
    }

    public final SdkEnvironment copy(AppVersionInfo appVersionInfo, String str, ScreenInfo screenInfo, SdkInfo sdkInfo, String str2, List<String> list) {
        return new SdkEnvironment(appVersionInfo, str, screenInfo, sdkInfo, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkEnvironment)) {
            return false;
        }
        SdkEnvironment sdkEnvironment = (SdkEnvironment) obj;
        return l.b(this.f38890a, sdkEnvironment.f38890a) && l.b(this.f38891b, sdkEnvironment.f38891b) && l.b(this.f38892c, sdkEnvironment.f38892c) && l.b(this.f38893d, sdkEnvironment.f38893d) && l.b(this.f38894e, sdkEnvironment.f38894e) && l.b(this.f38895f, sdkEnvironment.f38895f);
    }

    public final String getAppFramework() {
        return this.f38891b;
    }

    public final AppVersionInfo getAppVersionInfo() {
        return this.f38890a;
    }

    public final String getDeviceType() {
        return this.f38894e;
    }

    public final List<String> getLocales() {
        return this.f38895f;
    }

    public final ScreenInfo getScreenInfo() {
        return this.f38892c;
    }

    public final SdkInfo getSdkInfo() {
        return this.f38893d;
    }

    public int hashCode() {
        return this.f38895f.hashCode() + g.n((this.f38893d.hashCode() + ((this.f38892c.hashCode() + g.n(this.f38890a.hashCode() * 31, 31, this.f38891b)) * 31)) * 31, 31, this.f38894e);
    }

    public String toString() {
        return "SdkEnvironment(appVersionInfo=" + this.f38890a + ", appFramework=" + this.f38891b + ", screenInfo=" + this.f38892c + ", sdkInfo=" + this.f38893d + ", deviceType=" + this.f38894e + ", locales=" + this.f38895f + ')';
    }
}
