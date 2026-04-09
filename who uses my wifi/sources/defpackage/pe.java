package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pe implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ pe(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.b;
                checkBoxPreference.a(Boolean.valueOf(z));
                checkBoxPreference.y(z);
                break;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) this.b;
                switchPreference.a(Boolean.valueOf(z));
                switchPreference.y(z);
                break;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.b;
                switchPreferenceCompat.a(Boolean.valueOf(z));
                switchPreferenceCompat.y(z);
                break;
        }
    }
}
