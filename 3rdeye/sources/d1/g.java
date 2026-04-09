package d1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f37340b;

    /* renamed from: c, reason: collision with root package name */
    public a f37341c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37342d = true;

    /* compiled from: EmojiTextWatcher.java */
    public static class a extends c.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f37343a;

        public a(EditText editText) {
            this.f37343a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() throws Throwable {
            g.a((EditText) this.f37343a.get(), 1);
        }
    }

    public g(EditText editText) {
        this.f37340b = editText;
    }

    public static void a(EditText editText, int i) throws Throwable {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
            if (editableText == null) {
                length = 0;
            } else {
                cVarA.getClass();
                length = editableText.length();
            }
            cVarA.e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) throws Throwable {
        EditText editText = this.f37340b;
        if (editText.isInEditMode() || !this.f37342d || androidx.emoji2.text.c.f15714k == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = androidx.emoji2.text.c.a().b();
        if (iB != 0) {
            if (iB == 1) {
                androidx.emoji2.text.c.a().e((Spannable) charSequence, i, i11 + i);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
        if (this.f37341c == null) {
            this.f37341c = new a(editText);
        }
        cVarA.f(this.f37341c);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
