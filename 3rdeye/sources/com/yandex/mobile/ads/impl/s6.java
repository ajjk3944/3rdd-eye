package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;

/* loaded from: classes3.dex */
public final class s6 implements AdQualityVerificationStateFlow {

    /* renamed from: a, reason: collision with root package name */
    private final AdQualityVerificationStateFlow f32879a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32880b;

    /* renamed from: c, reason: collision with root package name */
    private final AdQualityVerificationMode f32881c;

    /* renamed from: d, reason: collision with root package name */
    private final D9.I<AdQualityVerificationState> f32882d;

    public s6(AdQualityVerificationStateFlow verificationStateFlow, String errorDescription) {
        kotlin.jvm.internal.l.f(verificationStateFlow, "verificationStateFlow");
        kotlin.jvm.internal.l.f(errorDescription, "errorDescription");
        this.f32879a = verificationStateFlow;
        this.f32880b = errorDescription;
        this.f32881c = verificationStateFlow.getVerificationMode();
        this.f32882d = D9.H.a(D9.E.c(new AdQualityVerificationState.Blocked(new AdQualityVerificationBlockingReasons(C2092m.W("Ad is blocked by validation policy", errorDescription), C2092m.W("Ad is blocked by validation policy", errorDescription)))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return kotlin.jvm.internal.l.b(this.f32879a, s6Var.f32879a) && kotlin.jvm.internal.l.b(this.f32880b, s6Var.f32880b);
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final AdQualityVerificationMode getVerificationMode() {
        return this.f32881c;
    }

    @Override // com.monetization.ads.quality.base.AdQualityVerificationStateFlow
    public final D9.I<AdQualityVerificationState> getVerificationResultStateFlow() {
        return this.f32882d;
    }

    public final int hashCode() {
        return this.f32880b.hashCode() + (this.f32879a.hashCode() * 31);
    }

    public final String toString() {
        return "AdQualityVerificationStateFlowByPolicy(verificationStateFlow=" + this.f32879a + ", errorDescription=" + this.f32880b + ")";
    }
}
