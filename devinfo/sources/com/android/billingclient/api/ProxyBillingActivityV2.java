package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import b5.o0;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.u;
import d.j;
import f.h;
import km.i;
import km.y;
import nk.k;
import o.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends j {

    /* renamed from: u, reason: collision with root package name */
    public h f2993u;

    /* renamed from: v, reason: collision with root package name */
    public h f2994v;

    /* renamed from: w, reason: collision with root package name */
    public h f2995w;

    /* renamed from: x, reason: collision with root package name */
    public ResultReceiver f2996x;

    /* renamed from: y, reason: collision with root package name */
    public ResultReceiver f2997y;

    /* renamed from: z, reason: collision with root package name */
    public ResultReceiver f2998z;

    @Override // d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2993u = (h) h(new o0(6), new e(17, this));
        this.f2994v = (h) h(new o0(6), new y(21, this));
        this.f2995w = (h) h(new o0(6), new i(21, this));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f2996x = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f2997y = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f2998z = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        u.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f2996x = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            h hVar = this.f2993u;
            k.e(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            k.d(intentSender, "getIntentSender(...)");
            hVar.a(new f.i(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f2997y = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            h hVar2 = this.f2994v;
            k.e(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            k.d(intentSender2, "getIntentSender(...)");
            hVar2.a(new f.i(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f2998z = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            h hVar3 = this.f2995w;
            k.e(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            k.d(intentSender3, "getIntentSender(...)");
            hVar3.a(new f.i(intentSender3, null, 0, 0));
        }
    }

    @Override // d.j, r3.g, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2996x;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f2997y;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f2998z;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
