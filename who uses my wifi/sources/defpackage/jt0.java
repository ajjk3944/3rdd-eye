package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jt0 implements TextWatcher {
    public final /* synthetic */ SearchView f;

    public jt0(SearchView searchView) {
        this.f = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.f;
        Editable text = searchView.u.getText();
        searchView.f0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.v(!zIsEmpty);
        int i4 = 8;
        if (searchView.d0 && !searchView.T && zIsEmpty) {
            searchView.z.setVisibility(8);
            i4 = 0;
        }
        searchView.B.setVisibility(i4);
        searchView.r();
        searchView.u();
        if (searchView.P != null && !TextUtils.equals(charSequence, searchView.e0)) {
            pt0 pt0Var = searchView.P;
            String string = charSequence.toString();
            jr0 jr0Var = ((RouterPasswordActivity) pt0Var).D;
            if (jr0Var == null) {
                i30.S("routerAdapter");
                throw null;
            }
            new cl(jr0Var).filter(string);
        }
        searchView.e0 = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
