package B2;

import android.view.View;
import android.widget.RadioButton;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: RecordingSettingsFragment.java */
/* loaded from: classes.dex */
public final class u implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f437b;

    public u(v vVar) {
        this.f437b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v vVar = this.f437b;
        vVar.f441e.dismiss();
        RadioButton radioButton = (RadioButton) vVar.f441e.findViewById(vVar.f444h.getCheckedRadioButtonId());
        vVar.f449n = radioButton;
        vVar.f445j.setText(radioButton.getText().toString());
        if (vVar.f449n.getText().equals(vVar.getResources().getString(R.string.front_camera))) {
            vVar.f438b.f2429a.edit().putInt("CAMERA_FRONT", 1).apply();
        } else {
            vVar.f438b.f2429a.edit().putInt("CAMERA_FRONT", 0).apply();
        }
    }
}
