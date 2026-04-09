package B2;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.ComponentCallbacksC1759l;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import io.appmetrica.analytics.impl.Oo;

/* compiled from: RecordingSettingsFragment.java */
/* loaded from: classes.dex */
public class v extends ComponentCallbacksC1759l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public I2.m f438b;

    /* renamed from: c, reason: collision with root package name */
    public Context f439c;

    /* renamed from: d, reason: collision with root package name */
    public Dialog f440d;

    /* renamed from: e, reason: collision with root package name */
    public Dialog f441e;

    /* renamed from: f, reason: collision with root package name */
    public Dialog f442f;

    /* renamed from: g, reason: collision with root package name */
    public RadioGroup f443g;

    /* renamed from: h, reason: collision with root package name */
    public RadioGroup f444h;
    public RadioGroup i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f445j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f446k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f447l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f448m;

    /* renamed from: n, reason: collision with root package name */
    public RadioButton f449n;

    /* renamed from: o, reason: collision with root package name */
    public RadioButton f450o;

    /* renamed from: p, reason: collision with root package name */
    public SwitchCompat f451p;

    /* renamed from: q, reason: collision with root package name */
    public SwitchCompat f452q;

    /* renamed from: r, reason: collision with root package name */
    public SwitchCompat f453r;

    /* renamed from: s, reason: collision with root package name */
    public Dialog f454s;

    /* renamed from: t, reason: collision with root package name */
    public RadioGroup f455t;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.select_camera) {
            this.f441e.show();
            return;
        }
        if (id == R.id.video_resolution) {
            this.f440d.show();
        } else if (id == R.id.video_duration) {
            this.f454s.show();
        } else if (id == R.id.preview_size) {
            this.f442f.show();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recording_settings, viewGroup, false);
        Context context = getContext();
        this.f439c = context;
        this.f438b = new I2.m(context);
        this.f445j = (TextView) viewInflate.findViewById(R.id.front_back);
        this.f447l = (TextView) viewInflate.findViewById(R.id.preview_size_text);
        this.f446k = (TextView) viewInflate.findViewById(R.id.resolution_text);
        this.f451p = (SwitchCompat) viewInflate.findViewById(R.id.camera_preview);
        this.f452q = (SwitchCompat) viewInflate.findViewById(R.id.audioSwitch);
        this.f448m = (TextView) viewInflate.findViewById(R.id.duration_text);
        this.f453r = (SwitchCompat) viewInflate.findViewById(R.id.vibrateSwitch);
        viewInflate.findViewById(R.id.select_camera).setOnClickListener(this);
        viewInflate.findViewById(R.id.video_resolution).setOnClickListener(this);
        viewInflate.findViewById(R.id.video_duration).setOnClickListener(this);
        viewInflate.findViewById(R.id.preview_size).setOnClickListener(this);
        this.f451p.setChecked(this.f438b.f2429a.getBoolean("PREVIEW", true));
        this.f452q.setChecked(this.f438b.f2429a.getBoolean("AUDIO", false));
        this.f453r.setChecked(this.f438b.f2429a.getBoolean("VIBRATION", false));
        this.f451p.setOnCheckedChangeListener(new o(this, 0));
        this.f452q.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: B2.p
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Oo.j(this.f430b.f438b.f2429a, "AUDIO", z10);
            }
        });
        this.f453r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: B2.q
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Oo.j(this.f431b.f438b.f2429a, "VIBRATION", z10);
            }
        });
        Dialog dialog = new Dialog(this.f439c, R.style.Theme_Dialog);
        this.f454s = dialog;
        dialog.setContentView(R.layout.duration_dialog);
        this.f455t = (RadioGroup) this.f454s.findViewById(R.id.video_group);
        try {
            RadioButton radioButton = (RadioButton) this.f455t.getChildAt(this.f438b.f2429a.getInt("DURATION", 0));
            this.f448m.setText(radioButton.getText().toString());
            radioButton.setChecked(true);
        } catch (Exception e4) {
            e4.printStackTrace();
            this.f438b.e(0);
            RadioButton radioButton2 = (RadioButton) this.f455t.getChildAt(0);
            this.f448m.setText(radioButton2.getText().toString());
            radioButton2.setChecked(true);
        }
        this.f454s.findViewById(R.id.ok).setOnClickListener(new r(this, 0));
        Dialog dialog2 = new Dialog(this.f439c, R.style.Theme_Dialog);
        this.f440d = dialog2;
        dialog2.setContentView(R.layout.resolution_dialog);
        this.f443g = (RadioGroup) this.f440d.findViewById(R.id.pic_group);
        try {
            RadioButton radioButton3 = (RadioButton) this.f443g.getChildAt(this.f438b.f2429a.getInt("RESOLUTION", 3));
            this.f446k.setText(radioButton3.getText().toString());
            radioButton3.setChecked(true);
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f438b.g(3);
            RadioButton radioButton4 = (RadioButton) this.f443g.getChildAt(3);
            this.f446k.setText(radioButton4.getText().toString());
            radioButton4.setChecked(true);
        }
        this.f440d.findViewById(R.id.ok).setOnClickListener(new s(this, 0));
        Dialog dialog3 = new Dialog(this.f439c, R.style.Theme_Dialog);
        this.f441e = dialog3;
        dialog3.setContentView(R.layout.camera_dialog);
        this.f444h = (RadioGroup) this.f441e.findViewById(R.id.camera_group);
        try {
            RadioButton radioButton5 = (RadioButton) this.f444h.getChildAt(this.f438b.f2429a.getInt("CAMERA_FRONT", 0));
            this.f445j.setText(radioButton5.getText().toString());
            radioButton5.setChecked(true);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f438b.f2429a.edit().putInt("CAMERA_FRONT", 0).apply();
            RadioButton radioButton6 = (RadioButton) this.f444h.getChildAt(0);
            this.f445j.setText(radioButton6.getText().toString());
            radioButton6.setChecked(true);
        }
        this.f441e.findViewById(R.id.ok).setOnClickListener(new u(this));
        Dialog dialog4 = new Dialog(this.f439c, R.style.Theme_Dialog);
        this.f442f = dialog4;
        dialog4.setContentView(R.layout.camera_size_dialog);
        this.i = (RadioGroup) this.f442f.findViewById(R.id.camera_preview_group);
        try {
            RadioButton radioButton7 = (RadioButton) this.i.getChildAt(this.f438b.f2429a.getInt("CAMERA_SIZE", 0));
            this.f447l.setText(radioButton7.getText().toString());
            radioButton7.setChecked(true);
        } catch (Exception e12) {
            e12.printStackTrace();
            this.f438b.c(0);
            RadioButton radioButton8 = (RadioButton) this.i.getChildAt(0);
            this.f447l.setText(radioButton8.getText().toString());
            radioButton8.setChecked(true);
        }
        this.f442f.findViewById(R.id.ok).setOnClickListener(new t(this));
        return viewInflate;
    }
}
