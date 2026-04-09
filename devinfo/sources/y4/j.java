package y4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f37341a;

    /* renamed from: b, reason: collision with root package name */
    public i f37342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37343c = true;

    public j(EditText editText) {
        this.f37341a = editText;
    }

    public static void a(EditText editText, int i4) {
        int length;
        if (i4 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            w4.i iVarA = w4.i.a();
            if (editableText == null) {
                length = 0;
            } else {
                iVarA.getClass();
                length = editableText.length();
            }
            iVarA.f(0, length, 0, editableText);
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
    public final void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) throws Throwable {
        EditText editText = this.f37341a;
        if (!editText.isInEditMode() && this.f37343c && w4.i.c() && i10 <= i11 && (charSequence instanceof Spannable)) {
            int iB = w4.i.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    w4.i.a().f(i4, i11 + i4, 0, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            w4.i iVarA = w4.i.a();
            if (this.f37342b == null) {
                this.f37342b = new i(editText);
            }
            iVarA.g(this.f37342b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
    }
}
