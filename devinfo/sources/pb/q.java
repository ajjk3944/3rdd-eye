package pb;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f31657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31658c;

    public /* synthetic */ q(Intent intent, Object obj, int i4) {
        this.f31656a = i4;
        this.f31657b = intent;
        this.f31658c = obj;
    }

    public final void a() {
        switch (this.f31656a) {
            case 0:
                Intent intent = this.f31657b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f31658c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f31657b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.g) this.f31658c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e2) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e2);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
