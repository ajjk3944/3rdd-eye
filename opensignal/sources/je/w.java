package je;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class w implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f13698a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EditText f13699d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f13700g;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.f13700g = textInputLayout;
        this.f13699d = editText;
        this.f13698a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f13700g;
        textInputLayout.w(!textInputLayout.X0, false);
        if (textInputLayout.H) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.P) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f13699d;
        int lineCount = editText.getLineCount();
        int i10 = this.f13698a;
        if (lineCount != i10) {
            if (lineCount < i10) {
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.Q0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f13698a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
