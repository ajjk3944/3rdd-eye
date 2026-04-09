package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ut0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ SeekBarPreference a;

    public ut0(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.a;
        if (!z || (!seekBarPreference.b0 && seekBarPreference.W)) {
            int i2 = i + seekBarPreference.T;
            TextView textView = seekBarPreference.Y;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.T;
        if (progress != seekBarPreference.S) {
            seekBarPreference.a(Integer.valueOf(progress));
            seekBarPreference.y(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a.W = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.a;
        seekBarPreference.W = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.T;
        if (progress2 + i == seekBarPreference.S || (progress = seekBar.getProgress() + i) == seekBarPreference.S) {
            return;
        }
        seekBarPreference.a(Integer.valueOf(progress));
        seekBarPreference.y(progress, false);
    }
}
