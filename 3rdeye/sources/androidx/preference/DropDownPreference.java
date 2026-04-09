package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.h;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: Y, reason: collision with root package name */
    public final ArrayAdapter f16217Y;

    /* renamed from: Z, reason: collision with root package name */
    public Spinner f16218Z;

    /* renamed from: a0, reason: collision with root package name */
    public final a f16219a0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f16219a0 = new a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f16217Y = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f16224T;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void h() {
        super.h();
        ArrayAdapter arrayAdapter = this.f16217Y;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void l(h hVar) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) hVar.itemView.findViewById(R.id.spinner);
        this.f16218Z = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f16217Y);
        this.f16218Z.setOnItemSelectedListener(this.f16219a0);
        Spinner spinner2 = this.f16218Z;
        String str = this.f16226V;
        if (str == null || (charSequenceArr = this.f16225U) == null) {
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
        super.l(hVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        this.f16218Z.performClick();
    }

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j4) {
            if (i >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String string = dropDownPreference.f16225U[i].toString();
                if (string.equals(dropDownPreference.f16226V)) {
                    return;
                }
                dropDownPreference.getClass();
                dropDownPreference.C(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
