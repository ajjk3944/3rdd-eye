package G3;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes.dex */
public final class D extends A {
    public D(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new B(1, this));
    }

    @Override // G3.A
    public final void a(NavigationView navigationView) {
        navigationView.setClipToOutline(!this.f1519a);
        if (this.f1519a) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // G3.A
    public final boolean b() {
        return this.f1519a;
    }
}
