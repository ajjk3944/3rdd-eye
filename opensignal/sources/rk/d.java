package rk;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;

/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21622a;

    /* renamed from: d, reason: collision with root package name */
    public int f21623d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i.j f21624g;

    public /* synthetic */ d(i.j jVar, int i10) {
        this.f21622a = i10;
        this.f21624g = jVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f21622a;
        i.j jVar = this.f21624g;
        switch (i10) {
            case 0:
                MainActivity mainActivity = (MainActivity) jVar;
                if (!((xm.a) mainActivity.f6016q0.getValue()).a()) {
                    int i11 = this.f21623d + 1;
                    this.f21623d = i11;
                    if (7 == i11) {
                        Context applicationContext = mainActivity.getApplicationContext();
                        q.a(applicationContext).putBoolean("prefs_connectivity_assistant_settings_visible", true).commit();
                        q.a(applicationContext).putBoolean("prefs_connectivity_assistant_enabled", true).commit();
                        androidx.fragment.app.b bVarE = mainActivity.o().E("TestsFragment");
                        if (bVarE instanceof TestsFragment) {
                            TestsFragment testsFragment = (TestsFragment) bVarE;
                            ah.e.c(testsFragment.X(), testsFragment.G0);
                        }
                        Toast.makeText(mainActivity.T, "Connectivity Assistant enabled!", 0).show();
                        break;
                    }
                }
                break;
            default:
                SettingsActivity settingsActivity = (SettingsActivity) jVar;
                int i12 = this.f21623d + 1;
                this.f21623d = i12;
                if (7 == i12) {
                    q.a(settingsActivity.getApplicationContext()).putBoolean("prefs_connectivity_assistant_settings_visible", true).commit();
                    int i13 = SettingsActivity.f6023n0;
                    settingsActivity.f6035l0.setVisibility(0);
                    settingsActivity.f6036m0.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
