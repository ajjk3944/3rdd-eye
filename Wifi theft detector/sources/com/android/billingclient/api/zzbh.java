package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzbh extends com.google.android.gms.internal.play_billing.zzaj {
    final ExternalOfferAvailabilityListener zza;
    final zzch zzb;
    final int zzc;

    public /* synthetic */ zzbh(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, zzch zzchVar, int i10, zzbl zzblVar) {
        this.zza = externalOfferAvailabilityListener;
        this.zzb = zzchVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzch zzchVar = this.zzb;
            BillingResult billingResult = zzcj.zzk;
            zzchVar.zzb(zzcg.zzb(92, 23, billingResult), this.zzc);
            this.zza.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzcj.zza(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            this.zzb.zzb(zzcg.zzb(23, 23, billingResultZza), this.zzc);
        }
        this.zza.onExternalOfferAvailabilityResponse(billingResultZza);
    }
}
