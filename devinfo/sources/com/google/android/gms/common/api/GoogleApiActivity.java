package com.google.android.gms.common.api;

import ac.k;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.d;
import d.h;
import nb.b;
import nb.e;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@KeepName
/* loaded from: classes3.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9056b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f9057a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i10, Intent intent) {
        super.onActivityResult(i4, i10, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f9057a = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                d dVarE = d.e(this);
                if (i10 == -1) {
                    k kVar = dVarE.f9092m;
                    kVar.sendMessage(kVar.obtainMessage(3));
                } else if (i10 == 0) {
                    dVarE.f(new b(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i4 == 2) {
            this.f9057a = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f9057a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f9057a = bundle.getInt("resolution");
        }
        if (this.f9057a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                y.h(num);
                e.f29897d.d(this, num.intValue(), this);
                this.f9057a = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e2) {
                e = e2;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f9057a = 1;
            } catch (ActivityNotFoundException e11) {
                e = e11;
                if (extras.getBoolean("notify_manager", true)) {
                    d.e(this).f(new b(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strT = h.t("Activity not found while launching ", pendingIntent.toString(), ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strT = strT.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strT, e);
                }
                googleApiActivity.f9057a = 1;
                finish();
            } catch (IntentSender.SendIntentException e12) {
                e = e12;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f9057a);
        super.onSaveInstanceState(bundle);
    }
}
