package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f6517a;

    /* renamed from: b, reason: collision with root package name */
    private Map f6518b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f6519c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f6520d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f6521e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f6522f;

    /* renamed from: g, reason: collision with root package name */
    private String f6523g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6524h;

    /* renamed from: i, reason: collision with root package name */
    private String f6525i;

    /* renamed from: j, reason: collision with root package name */
    private String f6526j;

    /* renamed from: k, reason: collision with root package name */
    private long f6527k;

    /* renamed from: l, reason: collision with root package name */
    private MaxAdFormat f6528l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f6525i = y2Var.R();
        maxAdapterParametersImplA.f6526j = y2Var.D();
        maxAdapterParametersImplA.f6527k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f6528l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f6517a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f6527k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f6526j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f6523g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f6520d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f6518b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f6519c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f6525i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.f6521e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f6522f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f6524h;
    }

    public static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(d5Var);
        maxAdapterParametersImplA.f6517a = str;
        maxAdapterParametersImplA.f6528l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f6517a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f6521e = k3Var.n();
        maxAdapterParametersImpl.f6522f = k3Var.o();
        maxAdapterParametersImpl.f6523g = k3Var.d();
        maxAdapterParametersImpl.f6518b = k3Var.i();
        maxAdapterParametersImpl.f6519c = k3Var.l();
        maxAdapterParametersImpl.f6520d = k3Var.f();
        maxAdapterParametersImpl.f6524h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
