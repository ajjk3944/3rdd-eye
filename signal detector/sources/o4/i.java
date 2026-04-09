package O4;

import android.text.Editable;
import android.text.TextWatcher;
import com.apm.insight.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3085b;

    public i(TextInputLayout textInputLayout, l lVar) {
        this.f3084a = textInputLayout;
        this.f3085b = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable != null ? editable.toString() : null;
        boolean zMatches = (string == null || string.length() == 0) ? false : Pattern.matches("(https?://(w{3}\\.)?)?[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+(\\.[a-zA-Z]+)*(:\\d{1,5})?(/[a-zA-Z0-9-]*)*(\\??(.+=.*)?(&.+=.*)?)?", string);
        l lVar = this.f3085b;
        TextInputLayout textInputLayout = this.f3084a;
        if (!zMatches) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError(lVar.r(R.string.please_input_correct_url));
        } else {
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
            lVar.f3099J0.setUrl(string);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
    }
}
