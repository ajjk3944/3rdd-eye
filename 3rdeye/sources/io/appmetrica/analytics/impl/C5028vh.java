package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5028vh extends C4631g6 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f41861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41862e;

    /* renamed from: f, reason: collision with root package name */
    public int f41863f;

    /* renamed from: g, reason: collision with root package name */
    public int f41864g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41865h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f41866j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC4952sh f41867k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC5003uh f41868l;

    /* renamed from: m, reason: collision with root package name */
    public String f41869m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41870n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41871o;

    /* renamed from: p, reason: collision with root package name */
    public String f41872p;

    /* renamed from: q, reason: collision with root package name */
    public List f41873q;

    /* renamed from: r, reason: collision with root package name */
    public int f41874r;

    /* renamed from: s, reason: collision with root package name */
    public long f41875s;

    /* renamed from: t, reason: collision with root package name */
    public long f41876t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41877u;

    /* renamed from: v, reason: collision with root package name */
    public long f41878v;

    /* renamed from: w, reason: collision with root package name */
    public List f41879w;

    public C5028vh(C4940s5 c4940s5) {
        this.f41868l = c4940s5;
    }

    public final void a(int i) {
        this.f41874r = i;
    }

    public final void b(List<String> list) {
        this.f41873q = list;
    }

    public final String c() {
        return this.f41869m;
    }

    public final void d(boolean z10) {
        this.f41861d = z10;
    }

    public final void e(boolean z10) {
        this.f41865h = z10;
    }

    public final void f(boolean z10) {
        this.f41870n = z10;
    }

    public final String g() {
        return (String) WrapUtils.getOrDefault(this.f41872p, "");
    }

    public final boolean h() {
        return this.f41867k.a(this.f41866j);
    }

    public final int i() {
        return this.f41864g;
    }

    public final long j() {
        return this.f41878v;
    }

    public final int k() {
        return this.i;
    }

    public final long l() {
        return this.f41875s;
    }

    public final long m() {
        return this.f41876t;
    }

    public final List<String> n() {
        return this.f41873q;
    }

    public final int o() {
        return this.f41863f;
    }

    public final boolean p() {
        return this.f41871o;
    }

    public final boolean q() {
        return this.f41862e;
    }

    public final boolean r() {
        return this.f41861d;
    }

    public final boolean s() {
        return this.f41870n;
    }

    public final boolean t() {
        return isIdentifiersValid() && !AbstractC4623fo.a((Collection) this.f41873q) && this.f41877u;
    }

    @Override // io.appmetrica.analytics.impl.C4631g6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f41861d + ", mFirstActivationAsUpdate=" + this.f41862e + ", mSessionTimeout=" + this.f41863f + ", mDispatchPeriod=" + this.f41864g + ", mLogEnabled=" + this.f41865h + ", mMaxReportsCount=" + this.i + ", dataSendingEnabledFromArguments=" + this.f41866j + ", dataSendingStrategy=" + this.f41867k + ", mPreloadInfoSendingStrategy=" + this.f41868l + ", mApiKey='" + this.f41869m + "', mPermissionsCollectingEnabled=" + this.f41870n + ", mFeaturesCollectingEnabled=" + this.f41871o + ", mClidsFromStartupResponse='" + this.f41872p + "', mReportHosts=" + this.f41873q + ", mAttributionId=" + this.f41874r + ", mPermissionsCollectingIntervalSeconds=" + this.f41875s + ", mPermissionsForceSendIntervalSeconds=" + this.f41876t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f41877u + ", mMaxReportsInDbCount=" + this.f41878v + ", mCertificates=" + this.f41879w + "} " + super.toString();
    }

    public final boolean u() {
        return ((C4940s5) this.f41868l).A();
    }

    public final void a(long j4) {
        this.f41878v = j4;
    }

    public final void b(long j4) {
        this.f41875s = j4;
    }

    public final void c(long j4) {
        this.f41876t = j4;
    }

    public final void d(int i) {
        this.f41863f = i;
    }

    public final List<String> e() {
        return this.f41879w;
    }

    public final boolean f() {
        return this.f41877u;
    }

    public final void a(List<String> list) {
        this.f41879w = list;
    }

    public final void b(boolean z10) {
        this.f41871o = z10;
    }

    public final void c(boolean z10) {
        this.f41862e = z10;
    }

    public final int d() {
        return this.f41874r;
    }

    public final void a(Boolean bool, InterfaceC4952sh interfaceC4952sh) {
        this.f41866j = bool;
        this.f41867k = interfaceC4952sh;
    }

    public final void b(int i) {
        this.f41864g = i;
    }

    public final void c(int i) {
        this.i = i;
    }

    public final void a(boolean z10) {
        this.f41877u = z10;
    }
}
