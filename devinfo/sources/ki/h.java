package ki;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.view.SettingsItemView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f28320b;

    public /* synthetic */ h(SwitchCompat switchCompat, int i4) {
        this.f28319a = i4;
        this.f28320b = switchCompat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        int i4 = this.f28319a;
        SwitchCompat switchCompat = this.f28320b;
        switch (i4) {
            case 0:
                int i10 = SettingsItemView.f21349v;
                switchCompat.setChecked(!switchCompat.isChecked());
                break;
            default:
                int i11 = MonitorActivity.B;
                switchCompat.toggle();
                break;
        }
    }
}
