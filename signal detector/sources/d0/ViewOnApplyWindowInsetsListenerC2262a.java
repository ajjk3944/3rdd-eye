package d0;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2262a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z6 = false;
        boolean z7 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f5148L = windowInsets;
        drawerLayout.M = z7;
        if (!z7 && drawerLayout.getBackground() == null) {
            z6 = true;
        }
        drawerLayout.setWillNotDraw(z6);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
