package h0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: h0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2356f implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f20452a;

    /* renamed from: b, reason: collision with root package name */
    public C2355e f20453b;

    public C2356f(TextView textView) {
        this.f20452a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i3, Spanned spanned, int i6, int i7) {
        TextView textView = this.f20452a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = f0.j.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i3);
                }
                return f0.j.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        f0.j jVarA = f0.j.a();
        if (this.f20453b == null) {
            this.f20453b = new C2355e(textView, this);
        }
        jVarA.f(this.f20453b);
        return charSequence;
    }
}
