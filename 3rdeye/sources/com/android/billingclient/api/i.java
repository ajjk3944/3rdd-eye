package com.android.billingclient.api;

import Q9.C1553s;
import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class i extends com.google.android.gms.internal.play_billing.zzc {

    /* renamed from: b, reason: collision with root package name */
    public final AlternativeBillingOnlyReportingDetailsListener f18657b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553s f18658c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18659d;

    public /* synthetic */ i(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, C1553s c1553s, int i) {
        this.f18657b = alternativeBillingOnlyReportingDetailsListener;
        this.f18658c = c1553s;
        this.f18659d = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(Bundle bundle) throws RemoteException {
        int i = this.f18659d;
        C1553s c1553s = this.f18658c;
        AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = this.f18657b;
        if (bundle == null) {
            BillingResult billingResult = r.f18691j;
            c1553s.g(zzcb.zza(71, 15, billingResult), i);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        BillingResult billingResultA = r.a(iZzb, com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iZzb);
            c1553s.g(zzcb.zza(23, 15, billingResultA), i);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, null);
            return;
        }
        try {
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e4) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e4);
            BillingResult billingResult2 = r.f18691j;
            c1553s.g(zzcb.zza(72, 15, billingResult2), i);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
