package B2;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import io.appmetrica.analytics.impl.Oo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import y0.C5788a;

/* compiled from: SettingsFragment.java */
/* loaded from: classes.dex */
public class B extends ComponentCallbacksC1759l implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public Dialog f384b;

    /* renamed from: c, reason: collision with root package name */
    public Dialog f385c;

    /* renamed from: d, reason: collision with root package name */
    public Dialog f386d;

    /* renamed from: e, reason: collision with root package name */
    public RadioGroup f387e;

    /* renamed from: f, reason: collision with root package name */
    public RadioGroup f388f;

    /* renamed from: g, reason: collision with root package name */
    public RadioGroup f389g;

    /* renamed from: h, reason: collision with root package name */
    public I2.m f390h;
    public CheckBox i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f391j;

    /* renamed from: k, reason: collision with root package name */
    public CheckBox f392k;

    /* renamed from: l, reason: collision with root package name */
    public Context f393l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f394m;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int id = compoundButton.getId();
        if (id == R.id.check) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (I2.a.a(this.f393l)) {
                    Oo.j(this.f390h.f2429a, "NOTIFICATION", z10);
                    return;
                } else {
                    C5788a.a((Activity) this.f393l, new String[]{"android.permission.POST_NOTIFICATIONS"}, 345);
                    return;
                }
            }
            return;
        }
        if (id == R.id.gallery) {
            Oo.j(this.f390h.f2429a, "GALLERY", z10);
        } else {
            if (id != R.id.intruder_check) {
                return;
            }
            this.f390h.f2429a.edit().putBoolean("INTRUDER", z10).apply();
            Log.i("TAG", "intruder : " + z10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (view.getId()) {
            case R.id.intruder /* 2131362327 */:
                this.f392k.setChecked(!r3.isChecked());
                Oo.j(this.f390h.f2429a, "INTRUDER", this.f392k.isChecked());
                break;
            case R.id.last_seen /* 2131362364 */:
                Toast.makeText(this.f393l, getResources().getString(R.string.check_history), 0).show();
                break;
            case R.id.max_attempt /* 2131362437 */:
                this.f386d.show();
                break;
            case R.id.number_of_pictures /* 2131362526 */:
                this.f384b.show();
                break;
            case R.id.picture_delay /* 2131362582 */:
                this.f385c.show();
                break;
            case R.id.saved_to_gallery /* 2131362663 */:
                this.f391j.setChecked(!r3.isChecked());
                Oo.j(this.f390h.f2429a, "GALLERY", this.f391j.isChecked());
                break;
            case R.id.show_notification /* 2131362701 */:
                this.i.setChecked(!r3.isChecked());
                Oo.j(this.f390h.f2429a, "NOTIFICATION", this.i.isChecked());
                break;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        Context context = getContext();
        this.f393l = context;
        this.f390h = new I2.m(context);
        viewInflate.findViewById(R.id.number_of_pictures).setOnClickListener(this);
        viewInflate.findViewById(R.id.picture_delay).setOnClickListener(this);
        viewInflate.findViewById(R.id.max_attempt).setOnClickListener(this);
        viewInflate.findViewById(R.id.show_notification).setOnClickListener(this);
        viewInflate.findViewById(R.id.saved_to_gallery).setOnClickListener(this);
        viewInflate.findViewById(R.id.intruder).setOnClickListener(this);
        viewInflate.findViewById(R.id.last_seen).setOnClickListener(this);
        this.i = (CheckBox) viewInflate.findViewById(R.id.check);
        this.f392k = (CheckBox) viewInflate.findViewById(R.id.intruder_check);
        this.f391j = (CheckBox) viewInflate.findViewById(R.id.gallery);
        this.f394m = (TextView) viewInflate.findViewById(R.id.last_seen_time);
        this.i.setChecked(this.f390h.f2429a.getBoolean("NOTIFICATION", true));
        this.f392k.setChecked(this.f390h.f2429a.getBoolean("INTRUDER", true));
        this.f391j.setChecked(this.f390h.f2429a.getBoolean("GALLERY", false));
        TextView textView = this.f394m;
        I2.m mVar = this.f390h;
        textView.setText(mVar.f2429a.getString("LAST_SEEN", mVar.f2430b.getResources().getString(R.string.last_seen_not_detected)));
        this.f392k.setOnCheckedChangeListener(this);
        this.i.setOnCheckedChangeListener(this);
        this.f391j.setOnCheckedChangeListener(this);
        Dialog dialog = new Dialog(this.f393l, R.style.Theme_Dialog);
        this.f384b = dialog;
        dialog.setContentView(R.layout.pic_dialog);
        RadioGroup radioGroup = (RadioGroup) this.f384b.findViewById(R.id.pic_group);
        this.f387e = radioGroup;
        ((RadioButton) radioGroup.getChildAt(this.f390h.f2429a.getInt("NUMBER_OF_PICTURE", 1) - 1)).setChecked(true);
        this.f384b.findViewById(R.id.ok).setOnClickListener(new y(this));
        Dialog dialog2 = new Dialog(this.f393l, R.style.Theme_Dialog);
        this.f386d = dialog2;
        dialog2.setContentView(R.layout.max_dialog);
        RadioGroup radioGroup2 = (RadioGroup) this.f386d.findViewById(R.id.pic_group);
        this.f389g = radioGroup2;
        ((RadioButton) radioGroup2.getChildAt(this.f390h.f2429a.getInt("ATTEMPTS", 1) - 1)).setChecked(true);
        this.f386d.findViewById(R.id.ok).setOnClickListener(new z(this));
        this.f386d.findViewById(R.id.cancel).setOnClickListener(new A(this));
        Dialog dialog3 = new Dialog(this.f393l, R.style.Theme_Dialog);
        this.f385c = dialog3;
        dialog3.setContentView(R.layout.delay_dialog);
        this.f388f = (RadioGroup) this.f385c.findViewById(R.id.pic_group);
        ((RadioButton) this.f388f.getChildAt(Integer.parseInt((this.f390h.f2429a.getInt("DELAY", 2000) + "").replace(CommonUrlParts.Values.FALSE_INTEGER, "")) - 1)).setChecked(true);
        this.f385c.findViewById(R.id.ok).setOnClickListener(new w(this));
        this.f385c.findViewById(R.id.cancel).setOnClickListener(new x(this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 345 && I2.a.a(this.f393l)) {
            Oo.j(this.f390h.f2429a, "NOTIFICATION", true);
        }
    }
}
