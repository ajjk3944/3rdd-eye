package rk;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.widget.CompoundButton;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.utils.q;

/* loaded from: classes.dex */
public final class e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f21626b;

    public /* synthetic */ e(SettingsActivity settingsActivity, int i10) {
        this.f21625a = i10;
        this.f21626b = settingsActivity;
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, lq.h] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) throws Resources.NotFoundException {
        int i10 = this.f21625a;
        SettingsActivity settingsActivity = this.f21626b;
        switch (i10) {
            case 0:
                MainActivity.f5997x0 = z10;
                SharedPreferences.Editor editorEdit = q.c(settingsActivity.f6026c0).edit();
                editorEdit.putBoolean("notify_me_at_deadcells", MainActivity.f5997x0);
                editorEdit.apply();
                settingsActivity.x(z10);
                ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_signal_checkbox", "changed", z10 ? "checked" : "unchecked");
                break;
            case 1:
                if (z10) {
                    settingsActivity.f6025b0 = com.staircase3.opensignal.utils.p.STATUSBAR_ONLY;
                    ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_notification_type", "changed", "status_bar_only");
                    break;
                }
                break;
            case 2:
                if (z10) {
                    settingsActivity.f6025b0 = com.staircase3.opensignal.utils.p.VIBRATE;
                    ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_notification_type", "changed", "vibrate");
                    break;
                }
                break;
            case 3:
                if (z10) {
                    settingsActivity.f6025b0 = com.staircase3.opensignal.utils.p.SOUND;
                    ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_notification_type", "changed", "sound");
                    break;
                }
                break;
            case 4:
                if (z10) {
                    settingsActivity.f6025b0 = com.staircase3.opensignal.utils.p.ALL;
                    ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_notification_type", "changed", "everything");
                    break;
                }
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                q.a(settingsActivity.getApplicationContext()).putBoolean("prefs_connectivity_assistant_enabled", z10).commit();
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_color_blind", "color_blind_changed", z10 ? "on" : "off");
                q.a(settingsActivity.f6026c0).putBoolean("settings.color_blind_mode", z10).commit();
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i11 = SettingsActivity.f6023n0;
                settingsActivity.A(z10);
                if (settingsActivity.f6028e0) {
                    SharedPreferences.Editor editorEdit2 = ((nl.a) settingsActivity.f6030g0.getValue()).f18456a.edit();
                    editorEdit2.putBoolean("gdpr_pre_accept_toggle_state", z10);
                    editorEdit2.apply();
                    settingsActivity.z(z10);
                } else if (z10) {
                    ql.c cVar = new ql.c();
                    cVar.P0 = settingsActivity;
                    cVar.j0(settingsActivity.o(), "GDPR_DIALOG_TAG");
                } else {
                    ((cm.a) settingsActivity.f6029f0.getValue()).b(false);
                    ((jn.b) settingsActivity.f6032i0.getValue()).a(false);
                    settingsActivity.z(false);
                }
                ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("selection_made", "changed", "checked");
                break;
            default:
                MainActivity.f5998y0 = z10;
                SharedPreferences.Editor editorEdit3 = q.c(settingsActivity.f6026c0).edit();
                editorEdit3.putBoolean("notify_me_at_dataloss", MainActivity.f5998y0);
                editorEdit3.apply();
                ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).c("settings_no_data_checkbox", "changed", z10 ? "checked" : "unchecked");
                break;
        }
    }
}
