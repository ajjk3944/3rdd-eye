package d1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.c;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4264d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f37329a;

    /* renamed from: b, reason: collision with root package name */
    public a f37330b;

    /* compiled from: EmojiInputFilter.java */
    /* renamed from: d1.d$a */
    public static class a extends c.e {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f37331a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f37332b;

        public a(TextView textView, C4264d c4264d) {
            this.f37331a = new WeakReference(textView);
            this.f37332b = new WeakReference(c4264d);
        }

        @Override // androidx.emoji2.text.c.e
        public final void b() throws Throwable {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f37331a.get();
            InputFilter inputFilter = (InputFilter) this.f37332b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            cVarA.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceE = cVarA.e(text, 0, length);
                        if (text == charSequenceE) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceE);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                        textView.setText(charSequenceE);
                        if (charSequenceE instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceE;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public C4264d(TextView textView) {
        this.f37329a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f37329a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = androidx.emoji2.text.c.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i10);
                }
                return androidx.emoji2.text.c.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.c cVarA = androidx.emoji2.text.c.a();
        if (this.f37330b == null) {
            this.f37330b = new a(textView, this);
        }
        cVarA.f(this.f37330b);
        return charSequence;
    }
}
