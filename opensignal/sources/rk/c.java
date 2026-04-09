package rk;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.utils.q;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21620a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21621d;

    public /* synthetic */ c(MainActivity mainActivity, int i10) {
        this.f21620a = i10;
        this.f21621d = mainActivity;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, lq.h] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f21620a;
        MainActivity mainActivity = this.f21621d;
        switch (i10) {
            case 0:
                Context applicationContext = mainActivity.getApplicationContext();
                q.a(applicationContext).putBoolean("network_type_2G_3G_selected", true).apply();
                q.a(applicationContext).putBoolean("network_type_4G_selected", true).apply();
                boolean z10 = MainActivity.f5997x0;
                q.a(applicationContext).putBoolean("network_type_5G_selected", mainActivity.y().f8210h).apply();
                q.a(applicationContext).putInt("filtered_network_id", 0).apply();
                q.a(applicationContext).putString("filtered_network_name", mainActivity.getString(qk.l.all_operators)).apply();
                SharedPreferences sharedPreferencesC = q.c(applicationContext);
                int i11 = sharedPreferencesC.getInt("session_nr", 0) + 1;
                SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                editorEdit.putInt("session_nr", i11);
                editorEdit.apply();
                SharedPreferences sharedPreferencesC2 = q.c(applicationContext);
                try {
                    MainActivity.C0 = ((vl.a) mainActivity.f6007h0.getValue()).f23928a.getBoolean("first_use", true);
                    MainActivity.f5999z0 = Boolean.valueOf(sharedPreferencesC2.getBoolean("send_data", true));
                    sharedPreferencesC2.getBoolean("send_data_background", true);
                    MainActivity.A0 = Boolean.valueOf(sharedPreferencesC2.getBoolean("send_data_bg_faster", MainActivity.A0.booleanValue()));
                    MainActivity.B0 = Boolean.valueOf(sharedPreferencesC2.getBoolean("send_data_bg_fastest", false));
                    xu.d.f25539e = sharedPreferencesC2.getInt("min_rssi_notification_threshold", 1);
                    MainActivity.f5997x0 = sharedPreferencesC2.getBoolean("notify_me_at_deadcells", false);
                    MainActivity.f5998y0 = sharedPreferencesC2.getBoolean("notify_me_at_dataloss", false);
                    xu.d.f25540f = sharedPreferencesC2.getInt("note_type", 1);
                    if (q.c(mainActivity).getLong("first_use_time", 0L) == 0 || MainActivity.C0) {
                        q.a(mainActivity).putLong("first_use_time", System.currentTimeMillis()).commit();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                fj.o oVar = mainActivity.f6002c0;
                ((RelativeLayout) oVar.f8943b).setVisibility(0);
                ((ViewGroup) oVar.f8942a).setVisibility(0);
                ((RelativeLayout) oVar.f8943b).bringToFront();
                ((ViewGroup) oVar.f8942a).bringToFront();
                break;
        }
    }
}
