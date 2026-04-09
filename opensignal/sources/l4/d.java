package l4;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f14663a;

    /* renamed from: b, reason: collision with root package name */
    public c f14664b;

    public d(TextView textView) {
        this.f14663a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f14663a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = j4.h.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return j4.h.a().f(0, charSequence.length(), 0, charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        j4.h hVarA = j4.h.a();
        if (this.f14664b == null) {
            this.f14664b = new c(textView, this);
        }
        hVarA.g(this.f14664b);
        return charSequence;
    }
}
