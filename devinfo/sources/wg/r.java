package wg;

import android.widget.RadioGroup;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.MonitorActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements RadioGroup.OnCheckedChangeListener {
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int i10 = MonitorActivity.B;
        com.liuzh.deviceinfo.utilities.f.k("monitor_text_style", i4 == R.id.radio_text_light);
    }
}
