package ln;

import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.widget.SeekBar;
import com.staircase3.opensignal.activities.SettingsActivity;
import com.staircase3.opensignal.ui.views.CustomSeekBar;
import com.staircase3.opensignal.utils.q;
import xu.d;

/* loaded from: classes.dex */
public final class a implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f15556b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f15555a = i10;
        this.f15556b = callback;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        switch (this.f15555a) {
            case 0:
                if (z10) {
                    ((CustomSeekBar) this.f15556b).f6164x++;
                    break;
                }
                break;
            default:
                d.f25539e = i10;
                ((SettingsActivity) this.f15556b).Z.setText(i10 + "%");
                break;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.f15555a) {
            case 0:
                ((CustomSeekBar) this.f15556b).f6163r = seekBar.getProgress();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lq.h] */
    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        switch (this.f15555a) {
            case 0:
                CustomSeekBar customSeekBar = (CustomSeekBar) this.f15556b;
                if (customSeekBar.f6162g != 0.0f) {
                    int progress = seekBar.getProgress();
                    float f10 = customSeekBar.f6162g;
                    int i10 = (int) ((((float) progress) % f10 >= f10 / 2.0f ? (progress / ((int) f10)) + 1 : progress / ((int) f10)) * f10);
                    if (customSeekBar.f6164x > 1) {
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(seekBar, "progress", progress, i10);
                        objectAnimatorOfInt.setDuration(customSeekBar.f6165y);
                        objectAnimatorOfInt.setInterpolator(customSeekBar.B);
                        objectAnimatorOfInt.start();
                    } else {
                        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(seekBar, "progress", customSeekBar.f6163r, i10);
                        objectAnimatorOfInt2.setDuration(customSeekBar.f6165y);
                        objectAnimatorOfInt2.setInterpolator(customSeekBar.B);
                        objectAnimatorOfInt2.start();
                    }
                    customSeekBar.f6164x = 0;
                    customSeekBar.getClass();
                    break;
                }
                break;
            default:
                SettingsActivity settingsActivity = (SettingsActivity) this.f15556b;
                SharedPreferences.Editor editorEdit = q.c(settingsActivity.f6026c0).edit();
                editorEdit.putInt("min_rssi_notification_threshold", d.f25539e);
                editorEdit.apply();
                ((com.staircase3.opensignal.utils.a) settingsActivity.f6033j0.getValue()).b(seekBar.getProgress(), "settings_signal_seek_bar", "changed", "signal_notification_level");
                break;
        }
    }

    private final void a(SeekBar seekBar) {
    }
}
