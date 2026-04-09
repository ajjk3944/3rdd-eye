package O6;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;

/* compiled from: TextView.kt */
/* loaded from: classes.dex */
public final class o implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f10436b;

    public o(p pVar) {
        this.f10436b = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Iterator it = this.f10436b.f10440p.iterator();
        while (it.hasNext()) {
            ((p9.l) it.next()).invoke(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
    }
}
