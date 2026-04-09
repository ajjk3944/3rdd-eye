package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzgj;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class f extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener f18649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f18650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.f18649b = alternativeBillingOnlyInformationDialogListener;
        this.f18650c = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener = this.f18649b;
        if (i != 0) {
            a aVar = this.f18650c;
            if (bundle == null) {
                BillingResult billingResult = r.f18691j;
                aVar.f(zzcb.zza(73, 16, billingResult));
                alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(billingResult);
                return;
            } else {
                builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zzb.zzg(bundle, "BillingClient"));
                int i10 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                aVar.f(zzcb.zzb(i10 != 0 ? zzgj.zza(i10) : 23, 16, builderNewBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
