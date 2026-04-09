package h0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class k implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f20462a;

    /* renamed from: b, reason: collision with root package name */
    public C2360j f20463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20464c = true;

    public k(EditText editText) {
        this.f20462a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f0.j jVarA = f0.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) throws Throwable {
        EditText editText = this.f20462a;
        if (editText.isInEditMode() || !this.f20464c || f0.j.f19988k == null || i3 > i6 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = f0.j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                f0.j.a().e((Spannable) charSequence, i, i6 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        f0.j jVarA = f0.j.a();
        if (this.f20463b == null) {
            this.f20463b = new C2360j(editText);
        }
        jVarA.f(this.f20463b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }
}
