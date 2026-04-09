package y4;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends w4.g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f37330a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f37331b;

    public d(TextView textView, e eVar) {
        this.f37330a = new WeakReference(textView);
        this.f37331b = new WeakReference(eVar);
    }

    @Override // w4.g
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f37330a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f37330a.get();
        InputFilter inputFilter = (InputFilter) this.f37331b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    w4.i iVarA = w4.i.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        iVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceF = iVarA.f(0, length, 0, text);
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
