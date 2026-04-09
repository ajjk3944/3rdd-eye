package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ss {
    public final /* synthetic */ us a;

    public ss(us usVar) {
        this.a = usVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        us usVar = this.a;
        rs rsVar = usVar.A;
        if (usVar.x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = usVar.x;
        if (editText != null) {
            editText.removeTextChangedListener(rsVar);
            if (usVar.x.getOnFocusChangeListener() == usVar.b().e()) {
                usVar.x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        usVar.x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(rsVar);
        }
        usVar.b().l(usVar.x);
        usVar.j(usVar.b());
    }
}
