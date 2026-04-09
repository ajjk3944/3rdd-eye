package com.applovin.impl.mediation;

import com.applovin.impl.q2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final q2 f20174a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20175b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20176c;

    /* renamed from: d, reason: collision with root package name */
    private final List f20177d;

    /* renamed from: e, reason: collision with root package name */
    private final long f20178e;

    /* renamed from: f, reason: collision with root package name */
    private final List f20179f;

    /* renamed from: g, reason: collision with root package name */
    private final String f20180g;

    public MaxAdWaterfallInfoImpl(q2 q2Var, long j4, List<MaxNetworkResponseInfo> list, String str) {
        this(q2Var, q2Var.R(), q2Var.S(), j4, list, q2Var.Q(), str);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f20178e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f20174a;
    }

    public String getMCode() {
        return this.f20180g;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f20175b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f20177d;
    }

    public List<String> getPostbackUrls() {
        return this.f20179f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f20176c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdWaterfallInfo{name=");
        sb.append(this.f20175b);
        sb.append(", testName=");
        sb.append(this.f20176c);
        sb.append(", networkResponses=");
        sb.append(this.f20177d);
        sb.append(", latencyMillis=");
        return androidx.work.s.f(sb, this.f20178e, '}');
    }

    public MaxAdWaterfallInfoImpl(q2 q2Var, String str, String str2, long j4, List<MaxNetworkResponseInfo> list, List<String> list2, String str3) {
        this.f20174a = q2Var;
        this.f20175b = str;
        this.f20176c = str2;
        this.f20177d = list;
        this.f20178e = j4;
        this.f20179f = list2;
        this.f20180g = str3;
    }
}
