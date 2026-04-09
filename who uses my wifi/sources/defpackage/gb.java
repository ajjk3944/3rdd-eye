package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gb extends wl2 {
    public final /* synthetic */ int K;
    public final /* synthetic */ BottomAppBar L;

    public gb(BottomAppBar bottomAppBar, int i) {
        this.L = bottomAppBar;
        this.K = i;
    }

    @Override // defpackage.wl2
    public final void r(FloatingActionButton floatingActionButton) {
        int i = BottomAppBar.z0;
        floatingActionButton.setTranslationX(this.L.D(this.K));
        floatingActionButton.l(new fb(), true);
    }
}
