package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C4276e;
import r3.C7564b;
import r3.C7567e;
import s3.AbstractC7901p;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected int f34711a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i10, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i10);
        intent.putExtra("notify_manager", z10);
        return intent;
    }

    private final void b() throws Resources.NotFoundException, IntentSender.SendIntentException {
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
            C7567e.n().o(this, ((Integer) AbstractC7901p.l(num)).intValue(), 2, this);
            this.f34711a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f34711a = 1;
        } catch (ActivityNotFoundException e10) {
            if (extras.getBoolean("notify_manager", true)) {
                C4276e.t(this).B(new C7564b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                if (Build.FINGERPRINT.contains("generic")) {
                    strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strConcat, e10);
            }
            this.f34711a = 1;
            finish();
        } catch (IntentSender.SendIntentException e11) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) throws Resources.NotFoundException {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f34711a = 0;
            setResult(i11, intent);
            if (booleanExtra) {
                C4276e c4276eT = C4276e.t(this);
                if (i11 == -1) {
                    c4276eT.C();
                } else if (i11 == 0) {
                    c4276eT.B(new C7564b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i10 == 2) {
            this.f34711a = 0;
            setResult(i11, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f34711a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException, IntentSender.SendIntentException {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f34711a = bundle.getInt("resolution");
        }
        if (this.f34711a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f34711a);
        super.onSaveInstanceState(bundle);
    }
}
