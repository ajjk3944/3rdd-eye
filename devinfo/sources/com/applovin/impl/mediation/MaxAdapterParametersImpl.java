package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f4527a;

    /* renamed from: b, reason: collision with root package name */
    private Map f4528b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f4529c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f4530d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f4531e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f4532f;
    private String g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f4533h;

    /* renamed from: i, reason: collision with root package name */
    private String f4534i;
    private String j;

    /* renamed from: k, reason: collision with root package name */
    private long f4535k;

    /* renamed from: l, reason: collision with root package name */
    private MaxAdFormat f4536l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f4534i = y2Var.R();
        maxAdapterParametersImplA.j = y2Var.D();
        maxAdapterParametersImplA.f4535k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f4536l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f4527a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f4535k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f4530d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f4528b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f4529c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f4534i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f4531e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f4532f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f4533h;
    }

    public static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(d5Var);
        maxAdapterParametersImplA.f4527a = str;
        maxAdapterParametersImplA.f4536l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f4527a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f4531e = k3Var.n();
        maxAdapterParametersImpl.f4532f = k3Var.o();
        maxAdapterParametersImpl.g = k3Var.d();
        maxAdapterParametersImpl.f4528b = k3Var.i();
        maxAdapterParametersImpl.f4529c = k3Var.l();
        maxAdapterParametersImpl.f4530d = k3Var.f();
        maxAdapterParametersImpl.f4533h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
