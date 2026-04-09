package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.a3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final y2 f6508a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6509b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6510c;

    /* renamed from: d, reason: collision with root package name */
    private final List f6511d;

    /* renamed from: e, reason: collision with root package name */
    private final long f6512e;

    /* renamed from: f, reason: collision with root package name */
    private final a3 f6513f;

    /* renamed from: g, reason: collision with root package name */
    private final List f6514g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6515h;

    /* renamed from: i, reason: collision with root package name */
    private final String f6516i;

    public MaxAdWaterfallInfoImpl(y2 y2Var, long j10, List<MaxNetworkResponseInfo> list, String str) {
        this(y2Var, y2Var.U(), y2Var.V(), j10, list, y2Var.N(), y2Var.T(), str, y2Var.Q());
    }

    public String getEventId() {
        return this.f6516i;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f6512e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f6508a;
    }

    public String getMCode() {
        return this.f6515h;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f6509b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f6511d;
    }

    public List<String> getPostbackUrls() {
        return this.f6514g;
    }

    public a3 getRequestParameters() {
        return this.f6513f;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f6510c;
    }

    @NonNull
    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f6509b + ", testName=" + this.f6510c + ", networkResponses=" + this.f6511d + ", latencyMillis=" + this.f6512e + '}';
    }

    public MaxAdWaterfallInfoImpl(@Nullable y2 y2Var, String str, String str2, long j10, List<MaxNetworkResponseInfo> list, a3 a3Var, List<String> list2, String str3, String str4) {
        this.f6508a = y2Var;
        this.f6509b = str;
        this.f6510c = str2;
        this.f6512e = j10;
        this.f6511d = list;
        this.f6513f = a3Var;
        this.f6514g = list2;
        this.f6515h = str3;
        this.f6516i = str4;
    }
}
