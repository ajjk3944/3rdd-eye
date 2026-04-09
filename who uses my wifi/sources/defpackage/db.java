package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ View g;

    public /* synthetic */ db(View view, int i) {
        this.f = i;
        this.g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        View view = this.g;
        switch (i) {
            case 0:
                int i2 = BottomAppBar.z0;
                view.requestLayout();
                break;
            default:
                ((InputMethodManager) kj.b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
