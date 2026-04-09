package io.appmetrica.analytics.coreapi.internal.model;

import N7.B8;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AppVersionInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f38884a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38885b;

    public AppVersionInfo(String str, String str2) {
        this.f38884a = str;
        this.f38885b = str2;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appVersionInfo.f38884a;
        }
        if ((i & 2) != 0) {
            str2 = appVersionInfo.f38885b;
        }
        return appVersionInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f38884a;
    }

    public final String component2() {
        return this.f38885b;
    }

    public final AppVersionInfo copy(String str, String str2) {
        return new AppVersionInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersionInfo)) {
            return false;
        }
        AppVersionInfo appVersionInfo = (AppVersionInfo) obj;
        return l.b(this.f38884a, appVersionInfo.f38884a) && l.b(this.f38885b, appVersionInfo.f38885b);
    }

    public final String getAppBuildNumber() {
        return this.f38885b;
    }

    public final String getAppVersionName() {
        return this.f38884a;
    }

    public int hashCode() {
        return this.f38885b.hashCode() + (this.f38884a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppVersionInfo(appVersionName=");
        sb.append(this.f38884a);
        sb.append(", appBuildNumber=");
        return B8.j(sb, this.f38885b, ')');
    }
}
