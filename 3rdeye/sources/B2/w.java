package B2;

import android.view.View;
import android.widget.RadioButton;

/* compiled from: SettingsFragment.java */
/* loaded from: classes.dex */
public final class w implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f456b;

    public w(B b10) {
        this.f456b = b10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        B b10 = this.f456b;
        b10.f385c.dismiss();
        b10.f388f.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) b10.f385c.findViewById(b10.f388f.getCheckedRadioButtonId());
        I2.m mVar = b10.f390h;
        mVar.f2429a.edit().putInt("DELAY", Integer.parseInt(radioButton.getText().toString())).apply();
    }
}
