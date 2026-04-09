package M3;

import android.text.Editable;
import x3.AbstractC2992A;

/* loaded from: classes.dex */
public final class l extends AbstractC2992A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2866a;

    public l(p pVar) {
        this.f2866a = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f2866a.b().a();
    }

    @Override // x3.AbstractC2992A, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        this.f2866a.b().b();
    }
}
