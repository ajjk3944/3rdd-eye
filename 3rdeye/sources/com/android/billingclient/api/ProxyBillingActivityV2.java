package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c.ActivityC2008f;
import com.google.android.apps.common.proguard.UsedByReflection;
import e.AbstractC4292c;
import e.C4290a;
import e.C4299j;
import e.InterfaceC4291b;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ActivityC2008f {
    private AbstractC4292c zza;
    private AbstractC4292c zzb;
    private ResultReceiver zzc;
    private ResultReceiver zzd;

    @Override // c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new f.e(), new InterfaceC4291b() { // from class: com.android.billingclient.api.zzcw
            @Override // e.InterfaceC4291b
            public final void onActivityResult(Object obj) {
                this.zza.zza((C4290a) obj);
            }
        });
        this.zzb = registerForActivityResult(new f.e(), new InterfaceC4291b() { // from class: com.android.billingclient.api.zzcx
            @Override // e.InterfaceC4291b
            public final void onActivityResult(Object obj) {
                this.zza.zzb((C4290a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            AbstractC4292c abstractC4292c = this.zza;
            kotlin.jvm.internal.l.f(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.l.e(intentSender, "pendingIntent.intentSender");
            abstractC4292c.b(new C4299j(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            AbstractC4292c abstractC4292c2 = this.zzb;
            kotlin.jvm.internal.l.f(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            kotlin.jvm.internal.l.e(intentSender2, "pendingIntent.intentSender");
            abstractC4292c2.b(new C4299j(intentSender2, null, 0, 0));
        }
    }

    @Override // c.ActivityC2008f, y0.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    public final void zza(C4290a c4290a) {
        Intent intent = c4290a.f37603c;
        int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = c4290a.f37602b;
        if (i != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    public final void zzb(C4290a c4290a) {
        Intent intent = c4290a.f37603c;
        int responseCode = com.google.android.gms.internal.play_billing.zzb.zze(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = c4290a.f37602b;
        if (i != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zzb.zzk("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i + " and billing's responseCode: " + responseCode);
        }
        finish();
    }
}
