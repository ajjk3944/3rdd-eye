package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzbg extends com.google.android.gms.internal.play_billing.zzah {
    final AlternativeBillingOnlyAvailabilityListener zza;
    final zzch zzb;
    final int zzc;

    public /* synthetic */ zzbg(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, zzch zzchVar, int i10, zzbl zzblVar) {
        this.zza = alternativeBillingOnlyAvailabilityListener;
        this.zzb = zzchVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            zzch zzchVar = this.zzb;
            BillingResult billingResult = zzcj.zzk;
            zzchVar.zzb(zzcg.zzb(67, 14, billingResult), this.zzc);
            this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultZza = zzcj.zza(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            this.zzb.zzb(zzcg.zzb(23, 14, billingResultZza), this.zzc);
        }
        this.zza.onAlternativeBillingOnlyAvailabilityResponse(billingResultZza);
    }
}
