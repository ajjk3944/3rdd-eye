package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.a3;
import com.applovin.impl.q2;
import com.applovin.impl.r4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f20181a;

    /* renamed from: b, reason: collision with root package name */
    private Map f20182b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f20183c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f20184d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f20185e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f20186f;

    /* renamed from: g, reason: collision with root package name */
    private String f20187g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20188h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f20189j;

    /* renamed from: k, reason: collision with root package name */
    private long f20190k;

    /* renamed from: l, reason: collision with root package name */
    private MaxAdFormat f20191l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(q2 q2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((a3) q2Var);
        maxAdapterParametersImplA.i = q2Var.P();
        maxAdapterParametersImplA.f20189j = q2Var.E();
        maxAdapterParametersImplA.f20190k = q2Var.D();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f20191l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f20181a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f20190k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f20189j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f20187g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f20184d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f20182b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f20183c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f20185e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f20186f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f20188h;
    }

    public static MaxAdapterParametersImpl a(r4 r4Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(r4Var);
        maxAdapterParametersImplA.f20181a = str;
        maxAdapterParametersImplA.f20191l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(a3 a3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f20181a = a3Var.getAdUnitId();
        maxAdapterParametersImpl.f20185e = a3Var.n();
        maxAdapterParametersImpl.f20186f = a3Var.o();
        maxAdapterParametersImpl.f20187g = a3Var.d();
        maxAdapterParametersImpl.f20182b = a3Var.i();
        maxAdapterParametersImpl.f20183c = a3Var.l();
        maxAdapterParametersImpl.f20184d = a3Var.f();
        maxAdapterParametersImpl.f20188h = a3Var.p();
        return maxAdapterParametersImpl;
    }
}
