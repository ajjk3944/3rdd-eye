package com.applovin.impl.mediation;

import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final y2 f4519a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4520b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4521c;

    /* renamed from: d, reason: collision with root package name */
    private final List f4522d;

    /* renamed from: e, reason: collision with root package name */
    private final long f4523e;

    /* renamed from: f, reason: collision with root package name */
    private final a3 f4524f;
    private final List g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4525h;

    /* renamed from: i, reason: collision with root package name */
    private final String f4526i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.f4526i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f4523e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f4519a;
    }

    public String getMCode() {
        return this.f4525h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f4520b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f4522d;
    }

    public List<String> getPostbackUrls() {
        return this.g;
    }

    public a3 getRequestParameters() {
        return this.f4524f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f4521c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f4520b + ", testName=" + this.f4521c + ", networkResponses=" + this.f4522d + ", latencyMillis=" + this.f4523e + '}';
    }

    public MaxAdWaterfallInfoImpl(y2 y2Var, String str, String str2, long j, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f4519a = y2Var;
        this.f4520b = str;
        this.f4521c = str2;
        this.f4523e = j;
        this.f4522d = list;
        this.f4524f = a3Var;
        this.g = list2;
        this.f4525h = str3;
        this.f4526i = str4;
    }
}
