package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.u;
import n3.f;
import t7.c;
import t7.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f2987a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2988b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2989c;

    /* renamed from: d, reason: collision with root package name */
    public int f2990d;

    /* renamed from: e, reason: collision with root package name */
    public long f2991e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2992f;

    public final Intent a(int i4, long j) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        f fVarA = c.a();
        fVarA.f29626a = 6;
        fVarA.f29628c = "An internal error occurred.";
        c cVarB = fVarA.b();
        int i10 = p.f34476a;
        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", p.b(i4, 2, cVarB, null, e3.BROADCAST_ACTION_UNSPECIFIED).a());
        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentB.putExtra("billingClientTransactionId", j);
        intentB.putExtra("wasServiceAutoReconnected", this.f2992f);
        return intentB;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            u.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2988b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f2987a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f2989c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f2990d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f2991e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f2992f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        u.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f2990d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f2989c = true;
                this.f2990d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f2987a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f2990d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f2991e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f2992f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f2988b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f2990d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e2) {
            u.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e2);
            ResultReceiver resultReceiver = this.f2987a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(137, this.f2991e);
                if (this.f2989c) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.f2988b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2988b) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f2989c) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i4 = this.f2990d;
            if (i4 == 110 || i4 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.f2991e);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f2987a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2988b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f2989c);
        bundle.putInt("activity_code", this.f2990d);
        bundle.putLong("billingClientTransactionId", this.f2991e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f2992f);
    }
}
