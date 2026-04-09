package s3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC4279h;

/* loaded from: classes.dex */
public abstract class D implements DialogInterface.OnClickListener {
    public static D b(Activity activity, Intent intent, int i10) {
        return new C7885B(intent, activity, i10);
    }

    public static D c(InterfaceC4279h interfaceC4279h, Intent intent, int i10) {
        return new C(intent, interfaceC4279h, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
