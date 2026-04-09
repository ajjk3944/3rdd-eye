package y4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f37332a;

    /* renamed from: b, reason: collision with root package name */
    public d f37333b;

    public e(TextView textView) {
        this.f37332a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i4, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f37332a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = w4.i.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i4 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i4, i10);
                }
                return w4.i.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        w4.i iVarA = w4.i.a();
        if (this.f37333b == null) {
            this.f37333b = new d(textView, this);
        }
        iVarA.g(this.f37333b);
        return charSequence;
    }
}
