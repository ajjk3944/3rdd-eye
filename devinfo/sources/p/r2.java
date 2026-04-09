package p;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r2 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2 f30843a;

    public r2(z2 z2Var) {
        this.f30843a = z2Var;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i4, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        z2 z2Var = this.f30843a;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = z2Var.f30931p;
        if (z2Var.f30926e0 != null) {
            if (!searchView$SearchAutoComplete.isPopupShowing() || searchView$SearchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchView$SearchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i4 == 66) {
                    view.cancelLongPress();
                    z2Var.getContext().startActivity(z2Var.j("android.intent.action.SEARCH", null, null, searchView$SearchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (z2Var.f30926e0 != null && z2Var.Q != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i4 == 66 || i4 == 84 || i4 == 61) {
                    z2Var.n(searchView$SearchAutoComplete.getListSelection());
                    return true;
                }
                if (i4 == 21 || i4 == 22) {
                    searchView$SearchAutoComplete.setSelection(i4 == 21 ? 0 : searchView$SearchAutoComplete.length());
                    searchView$SearchAutoComplete.setListSelection(0);
                    searchView$SearchAutoComplete.clearListSelection();
                    searchView$SearchAutoComplete.a();
                    return true;
                }
                if (i4 == 19) {
                    searchView$SearchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
