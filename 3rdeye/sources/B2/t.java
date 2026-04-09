package B2;

import android.view.View;
import android.widget.RadioButton;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: RecordingSettingsFragment.java */
/* loaded from: classes.dex */
public final class t implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f436b;

    public t(v vVar) {
        this.f436b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        v vVar = this.f436b;
        vVar.f442f.dismiss();
        vVar.f450o = (RadioButton) vVar.f442f.findViewById(vVar.i.getCheckedRadioButtonId());
        vVar.f447l.setText(vVar.f450o.getText().toString());
        if (vVar.f450o.getText().equals(vVar.f439c.getResources().getString(R.string.small))) {
            vVar.f438b.c(0);
        } else if (vVar.f450o.getText().equals(vVar.f439c.getResources().getString(R.string.medium))) {
            vVar.f438b.c(1);
        } else {
            vVar.f438b.c(2);
        }
    }
}
