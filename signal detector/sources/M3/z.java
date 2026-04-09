package M3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class z implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f2956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f2958c;

    public z(TextInputLayout textInputLayout, EditText editText) {
        this.f2958c = textInputLayout;
        this.f2957b = editText;
        this.f2956a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f2958c;
        textInputLayout.w(!textInputLayout.f18520P0, false);
        if (textInputLayout.f18549l) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.f18504H) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f2957b;
        int lineCount = editText.getLineCount();
        int i = this.f2956a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f18507I0;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f2956a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }
}
