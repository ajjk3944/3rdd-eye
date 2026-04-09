package B2;

import android.view.View;
import android.widget.RadioButton;

/* compiled from: SettingsFragment.java */
/* loaded from: classes.dex */
public final class z implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f459b;

    public z(B b10) {
        this.f459b = b10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        B b10 = this.f459b;
        b10.f386d.dismiss();
        b10.f389g.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) b10.f386d.findViewById(b10.f389g.getCheckedRadioButtonId());
        I2.m mVar = b10.f390h;
        mVar.f2429a.edit().putInt("ATTEMPTS", Integer.parseInt(radioButton.getText().toString())).apply();
    }
}
