package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class hr extends zl0 {
    public EditText x0;
    public CharSequence y0;
    public final a9 z0 = new a9(6, this);
    public long A0 = -1;

    @Override // defpackage.zl0
    public final void S(View view) {
        super.S(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.x0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.x0.setText(this.y0);
        EditText editText2 = this.x0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) R()).getClass();
    }

    @Override // defpackage.zl0
    public final void T(boolean z) {
        if (z) {
            String string = this.x0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) R();
            editTextPreference.a(string);
            editTextPreference.y(string);
        }
    }

    public final void V() {
        long j = this.A0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.x0;
        if (editText == null || !editText.isFocused()) {
            this.A0 = -1L;
            return;
        }
        if (((InputMethodManager) this.x0.getContext().getSystemService("input_method")).showSoftInput(this.x0, 0)) {
            this.A0 = -1L;
            return;
        }
        EditText editText2 = this.x0;
        a9 a9Var = this.z0;
        editText2.removeCallbacks(a9Var);
        this.x0.postDelayed(a9Var, 50L);
    }

    @Override // defpackage.zl0, defpackage.xo, defpackage.iw
    public final void u(Bundle bundle) {
        super.u(bundle);
        if (bundle == null) {
            this.y0 = ((EditTextPreference) R()).Y;
        } else {
            this.y0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.zl0, defpackage.xo, defpackage.iw
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.y0);
    }
}
