package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.im0;
import defpackage.lq;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter d0;
    public Spinner e0;
    public final lq f0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f0 = new lq(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.d0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.Y;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void h() {
        super.h();
        ArrayAdapter arrayAdapter = this.d0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void l(im0 im0Var) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) im0Var.a.findViewById(R.id.spinner);
        this.e0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.d0);
        this.e0.setOnItemSelectedListener(this.f0);
        Spinner spinner2 = this.e0;
        String str = this.a0;
        if (str == null || (charSequenceArr = this.Z) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    break;
                } else {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.l(im0Var);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        this.e0.performClick();
    }
}
