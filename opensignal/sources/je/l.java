package je;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f13641a;

    public l(m mVar) {
        this.f13641a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.f13641a;
        k kVar = mVar.R;
        if (mVar.O == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.O;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.O.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.O.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.O = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().l(mVar.O);
        mVar.j(mVar.b());
    }
}
