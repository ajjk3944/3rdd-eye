package n1;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class a extends androidx.preference.a {

    /* renamed from: j, reason: collision with root package name */
    public EditText f44194j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f44195k;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0499a f44196l = new RunnableC0499a();

    /* renamed from: m, reason: collision with root package name */
    public long f44197m = -1;

    /* compiled from: EditTextPreferenceDialogFragmentCompat.java */
    /* renamed from: n1.a$a, reason: collision with other inner class name */
    public class RunnableC0499a implements Runnable {
        public RunnableC0499a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.g();
        }
    }

    @Override // androidx.preference.a
    public final void d(View view) {
        super.d(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f44194j = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f44194j.setText(this.f44195k);
        EditText editText2 = this.f44194j;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) c()).getClass();
    }

    @Override // androidx.preference.a
    public final void e(boolean z10) {
        if (z10) {
            String string = this.f44194j.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) c();
            editTextPreference.getClass();
            editTextPreference.A(string);
        }
    }

    public final void g() {
        long j4 = this.f44197m;
        if (j4 == -1 || j4 + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f44194j;
        if (editText == null || !editText.isFocused()) {
            this.f44197m = -1L;
            return;
        }
        if (((InputMethodManager) this.f44194j.getContext().getSystemService("input_method")).showSoftInput(this.f44194j, 0)) {
            this.f44197m = -1L;
            return;
        }
        EditText editText2 = this.f44194j;
        RunnableC0499a runnableC0499a = this.f44196l;
        editText2.removeCallbacks(runnableC0499a);
        this.f44194j.postDelayed(runnableC0499a, 50L);
    }

    @Override // androidx.preference.a, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f44195k = ((EditTextPreference) c()).f16221T;
        } else {
            this.f44195k = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.DialogInterfaceOnCancelListenerC1758k, androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f44195k);
    }
}
