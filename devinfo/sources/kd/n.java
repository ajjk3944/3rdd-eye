package kd;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f28174a;

    public n(o oVar) {
        this.f28174a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f28174a;
        m mVar = oVar.f28194v;
        if (oVar.f28191s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f28191s;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (oVar.f28191s.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f28191s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f28191s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        oVar.b().l(oVar.f28191s);
        oVar.j(oVar.b());
    }
}
