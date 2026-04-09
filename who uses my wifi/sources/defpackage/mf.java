package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ mf(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f) {
            case 0:
                qf qfVar = (qf) this.g;
                EditText editText = qfVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                qfVar.p();
                return;
            case 1:
                ((tq) this.g).t();
                return;
            case 2:
                ((jc0) this.g).R();
                throw null;
            default:
                jk0 jk0Var = (jk0) this.g;
                EditText editText2 = jk0Var.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = jk0Var.f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    jk0Var.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    jk0Var.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    jk0Var.f.setSelection(selectionEnd);
                }
                jk0Var.p();
                return;
        }
    }
}
