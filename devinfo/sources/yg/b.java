package yg;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.liuzh.deviceinfo.utilities.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        SharedPreferences sharedPreferences = f.f21257c;
        sharedPreferences.edit().putLong("show_notification_permission_guide_dialog_time", System.currentTimeMillis()).putInt("show_notification_permission_guide_dialog_count", sharedPreferences.getInt("show_notification_permission_guide_dialog_count", 0) + 1).apply();
    }
}
