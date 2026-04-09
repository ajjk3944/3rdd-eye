package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements ConsentInformation.OnConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d3 f19362a;

    public /* synthetic */ g2(d3 d3Var) {
        this.f19362a = d3Var;
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        d3 d3Var = this.f19362a;
        synchronized (d3Var.f19312e) {
            d3Var.f19314h = false;
        }
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        d3 d3Var = this.f19362a;
        synchronized (d3Var.f19312e) {
            d3Var.f19314h = false;
        }
    }
}
