package o;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class N0 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f22417a;

    public N0(SearchView searchView) {
        this.f22417a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        SearchView searchView = this.f22417a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f4920d0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z6);
        }
    }
}
