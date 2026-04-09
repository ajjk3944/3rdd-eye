package M3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2867a;

    public m(p pVar) {
        this.f2867a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f2867a;
        l lVar = pVar.f2881J;
        if (pVar.f2878G == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f2878G;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f2878G.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f2878G.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f2878G = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f2878G);
        pVar.j(pVar.b());
    }
}
