package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class E7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39340c;

    /* renamed from: d, reason: collision with root package name */
    public final String f39341d;

    /* renamed from: e, reason: collision with root package name */
    public final String f39342e;

    /* renamed from: f, reason: collision with root package name */
    public final String f39343f;

    /* renamed from: g, reason: collision with root package name */
    public final String f39344g;

    /* renamed from: h, reason: collision with root package name */
    public final String f39345h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f39346j;

    /* renamed from: k, reason: collision with root package name */
    public final String f39347k;

    /* renamed from: l, reason: collision with root package name */
    public final String f39348l;

    /* renamed from: m, reason: collision with root package name */
    public final String f39349m;

    /* renamed from: n, reason: collision with root package name */
    public final String f39350n;

    public E7(C5097yb c5097yb) {
        this.f39338a = c5097yb.b("dId");
        this.f39339b = c5097yb.b("uId");
        this.f39340c = c5097yb.b("analyticsSdkVersionName");
        this.f39341d = c5097yb.b("kitBuildNumber");
        this.f39342e = c5097yb.b("kitBuildType");
        this.f39343f = c5097yb.b("appVer");
        this.f39344g = c5097yb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f39345h = c5097yb.b("appBuild");
        this.i = c5097yb.b("osVer");
        this.f39347k = c5097yb.b("lang");
        this.f39348l = c5097yb.b("root");
        this.f39349m = c5097yb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int iOptInt = c5097yb.optInt("osApiLev", -1);
        this.f39346j = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = c5097yb.optInt("attribution_id", 0);
        this.f39350n = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f39338a);
        sb.append("', uuid='");
        sb.append(this.f39339b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f39340c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f39341d);
        sb.append("', kitBuildType='");
        sb.append(this.f39342e);
        sb.append("', appVersion='");
        sb.append(this.f39343f);
        sb.append("', appDebuggable='");
        sb.append(this.f39344g);
        sb.append("', appBuildNumber='");
        sb.append(this.f39345h);
        sb.append("', osVersion='");
        sb.append(this.i);
        sb.append("', osApiLevel='");
        sb.append(this.f39346j);
        sb.append("', locale='");
        sb.append(this.f39347k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f39348l);
        sb.append("', appFramework='");
        sb.append(this.f39349m);
        sb.append("', attributionId='");
        return B4.f.c(sb, this.f39350n, "'}");
    }

    public E7() {
        this.f39338a = null;
        this.f39339b = null;
        this.f39340c = null;
        this.f39341d = null;
        this.f39342e = null;
        this.f39343f = null;
        this.f39344g = null;
        this.f39345h = null;
        this.i = null;
        this.f39346j = null;
        this.f39347k = null;
        this.f39348l = null;
        this.f39349m = null;
        this.f39350n = null;
    }
}
