package com.android.billingclient.api;

import Q9.C1553s;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class l extends com.google.android.gms.internal.play_billing.zzi {

    /* renamed from: b, reason: collision with root package name */
    public final BillingConfigResponseListener f18665b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553s f18666c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18667d;

    public /* synthetic */ l(BillingConfigResponseListener billingConfigResponseListener, C1553s c1553s, int i) {
        this.f18665b = billingConfigResponseListener;
        this.f18666c = c1553s;
        this.f18667d = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzj
    public final void zza(Bundle bundle) throws RemoteException {
        int i = this.f18667d;
        C1553s c1553s = this.f18666c;
        BillingConfigResponseListener billingConfigResponseListener = this.f18665b;
        if (bundle == null) {
            BillingResult billingResult = r.f18691j;
            c1553s.g(zzcb.zza(63, 13, billingResult), i);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        String strZzg = com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzg);
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            BillingResult billingResultBuild = builderNewBuilder.build();
            c1553s.g(zzcb.zza(23, 13, billingResultBuild), i);
            billingConfigResponseListener.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            c1553s.g(zzcb.zza(64, 13, billingResultBuild2), i);
            billingConfigResponseListener.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            billingConfigResponseListener.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e4) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e4);
            BillingResult billingResult2 = r.f18691j;
            c1553s.g(zzcb.zza(65, 13, billingResult2), i);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
        }
    }
}
