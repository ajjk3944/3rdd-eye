package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class m extends com.google.android.gms.internal.play_billing.zzk {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f18668b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f18669c;

    public /* synthetic */ m(WeakReference weakReference, ResultReceiver resultReceiver) {
        this.f18668b = weakReference;
        this.f18669c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzl
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f18669c;
        if (bundle == null) {
            resultReceiver.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Response bundle doesn't contain a response code");
            resultReceiver.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zzb.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unable to launch intent for external offer dialog" + iZzb);
            resultReceiver.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            resultReceiver.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f18668b.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", resultReceiver);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e4) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Runtime error while launching intent for the external offer dialog.", e4);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", e4.getClass().getName() + ": " + com.google.android.gms.internal.play_billing.zzab.zzb(e4.getMessage()));
            resultReceiver.send(6, bundle3);
        }
    }
}
