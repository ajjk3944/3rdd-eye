package iq;

import android.text.Editable;
import android.text.TextWatcher;
import ar.k;
import br.n;

/* loaded from: classes.dex */
public final class a implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final n f12922a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(k kVar) {
        this.f12922a = (n) kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ar.k, br.n] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = "";
        }
        this.f12922a.a(string);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
