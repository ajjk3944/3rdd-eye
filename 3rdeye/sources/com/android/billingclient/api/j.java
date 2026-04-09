package com.android.billingclient.api;

import Q9.C1553s;
import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class j extends com.google.android.gms.internal.play_billing.zze {

    /* renamed from: b, reason: collision with root package name */
    public final ExternalOfferReportingDetailsListener f18660b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553s f18661c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18662d;

    public /* synthetic */ j(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, C1553s c1553s, int i) {
        this.f18660b = externalOfferReportingDetailsListener;
        this.f18661c = c1553s;
        this.f18662d = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzf
    public final void zza(Bundle bundle) throws RemoteException {
        int i = this.f18662d;
        C1553s c1553s = this.f18661c;
        ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener = this.f18660b;
        if (bundle == null) {
            BillingResult billingResult = r.f18691j;
            c1553s.g(zzcb.zza(95, 24, billingResult), i);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = r.a(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            c1553s.g(zzcb.zza(23, 24, billingResultA), i);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA, null);
            return;
        }
        try {
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e4) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e4);
            BillingResult billingResult2 = r.f18691j;
            c1553s.g(zzcb.zza(104, 24, billingResult2), i);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
