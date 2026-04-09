package rk;

import android.content.DialogInterface;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.utils.q;

/* loaded from: classes.dex */
public final class g implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f21629a;

    public g(SettingsActivity settingsActivity) {
        this.f21629a = settingsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        SettingsActivity settingsActivity = this.f21629a;
        q.a(settingsActivity.f6026c0).putString("settings.notification_type", settingsActivity.f6025b0.name()).commit();
        settingsActivity.B();
        int i11 = i.f21633a[settingsActivity.f6025b0.ordinal()];
        if (i11 == 1) {
            xu.d.f25540f = 4;
        } else if (i11 == 2) {
            xu.d.f25540f = 2;
        } else if (i11 == 3) {
            xu.d.f25540f = 1;
        } else if (i11 == 4) {
            xu.d.f25540f = -1;
        }
        q.c(settingsActivity.f6026c0).edit().putInt("note_type", xu.d.f25540f).commit();
        dialogInterface.dismiss();
    }
}
