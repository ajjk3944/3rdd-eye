package com.android.billingclient.api;

import Q9.C1553s;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.play_billing.zzo;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class o extends zzo {

    /* renamed from: b, reason: collision with root package name */
    public final ExternalOfferAvailabilityListener f18673b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553s f18674c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18675d;

    public /* synthetic */ o(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, C1553s c1553s, int i) {
        this.f18673b = externalOfferAvailabilityListener;
        this.f18674c = c1553s;
        this.f18675d = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzp
    public final void zza(Bundle bundle) throws RemoteException {
        ExternalOfferAvailabilityListener externalOfferAvailabilityListener = this.f18673b;
        int i = this.f18675d;
        C1553s c1553s = this.f18674c;
        if (bundle == null) {
            BillingResult billingResult = r.f18691j;
            c1553s.g(zzcb.zza(92, 23, billingResult), i);
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = r.a(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            c1553s.g(zzcb.zza(23, 23, billingResultA), i);
        }
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultA);
    }
}
