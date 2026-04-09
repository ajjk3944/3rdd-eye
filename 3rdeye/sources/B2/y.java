package B2;

import android.view.View;
import android.widget.RadioButton;

/* compiled from: SettingsFragment.java */
/* loaded from: classes.dex */
public final class y implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f458b;

    public y(B b10) {
        this.f458b = b10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        B b10 = this.f458b;
        b10.f384b.dismiss();
        b10.f387e.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) b10.f384b.findViewById(b10.f387e.getCheckedRadioButtonId());
        I2.m mVar = b10.f390h;
        mVar.f2429a.edit().putInt("NUMBER_OF_PICTURE", Integer.parseInt(radioButton.getText().toString())).apply();
    }
}
