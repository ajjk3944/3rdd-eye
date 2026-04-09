package C6;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: SafePopupWindow.kt */
/* loaded from: classes.dex */
public class k extends PopupWindow {
    @Override // android.widget.PopupWindow
    public final void setContentView(View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
