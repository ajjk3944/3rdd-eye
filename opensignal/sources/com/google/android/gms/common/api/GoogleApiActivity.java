package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import bc.d;
import cc.s;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import h0.b;
import io.sentry.android.core.e0;
import yh.a;
import zb.c;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4815d = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f4816a = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4816a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                d dVarD = d.d(this);
                if (i11 == -1) {
                    a aVar = dVarD.J;
                    aVar.sendMessage(aVar.obtainMessage(3));
                } else if (i11 == 0) {
                    dVarD.h(new ConnectionResult(13, null, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f4816a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4816a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        GoogleApiActivity googleApiActivity;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4816a = bundle.getInt("resolution");
        }
        if (this.f4816a != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                e0.d("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                e0.d("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                s.h(num);
                AlertDialog alertDialogC = c.f26814e.c(this, num.intValue(), 2, this);
                if (alertDialogC != null) {
                    c.h(this, alertDialogC, "GooglePlayServicesErrorDialog", this);
                }
                this.f4816a = 1;
                return;
            }
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e4) {
                e = e4;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f4816a = 1;
            } catch (ActivityNotFoundException e11) {
                e = e11;
                if (extras.getBoolean("notify_manager", true)) {
                    d.d(this).h(new ConnectionResult(22, null, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    String strS = b.s(new StringBuilder(string.length() + 36), "Activity not found while launching ", string, ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strS = strS.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    e0.c("GoogleApiActivity", strS, e);
                }
                googleApiActivity.f4816a = 1;
                finish();
            } catch (IntentSender.SendIntentException e12) {
                e = e12;
                e0.c("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4816a);
        super.onSaveInstanceState(bundle);
    }
}
