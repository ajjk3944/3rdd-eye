package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mc1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Intent g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mc1(Intent intent, Object obj, int i) {
        this.f = i;
        this.g = intent;
        this.h = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, z50] */
    public final void a() {
        switch (this.f) {
            case 0:
                Intent intent = this.g;
                if (intent != null) {
                    ((GoogleApiActivity) this.h).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.g;
                if (intent2 != null) {
                    this.h.a(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
