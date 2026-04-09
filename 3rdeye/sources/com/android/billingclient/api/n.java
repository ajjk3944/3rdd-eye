package com.android.billingclient.api;

import Q9.C1553s;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class n extends com.google.android.gms.internal.play_billing.zzm {

    /* renamed from: b, reason: collision with root package name */
    public final AlternativeBillingOnlyAvailabilityListener f18670b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553s f18671c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18672d;

    public /* synthetic */ n(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, C1553s c1553s, int i) {
        this.f18670b = alternativeBillingOnlyAvailabilityListener;
        this.f18671c = c1553s;
        this.f18672d = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzn
    public final void zza(Bundle bundle) throws RemoteException {
        AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener = this.f18670b;
        int i = this.f18672d;
        C1553s c1553s = this.f18671c;
        if (bundle == null) {
            BillingResult billingResult = r.f18691j;
            c1553s.g(zzcb.zza(67, 14, billingResult), i);
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = r.a(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            c1553s.g(zzcb.zza(23, 14, billingResultA), i);
        }
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultA);
    }
}
