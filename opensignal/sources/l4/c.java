package l4;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends j4.f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f14661a;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f14662d;

    public c(TextView textView, d dVar) {
        this.f14661a = new WeakReference(textView);
        this.f14662d = new WeakReference(dVar);
    }

    @Override // j4.f
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f14661a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f14661a.get();
        InputFilter inputFilter = (InputFilter) this.f14662d.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j4.h hVarA = j4.h.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        hVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceF = hVarA.f(0, length, 0, text);
                    if (text == charSequenceF) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceF);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                    textView.setText(charSequenceF);
                    if (charSequenceF instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceF;
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
