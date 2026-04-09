package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h implements y61 {
    public boolean f;
    public int g;
    public final View h;

    public h(FloatingActionButton floatingActionButton) {
        this.f = false;
        this.g = 0;
        this.h = floatingActionButton;
    }

    @Override // defpackage.y61
    public void b() {
        if (this.f) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.h;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.g);
    }

    @Override // defpackage.y61
    public void c() {
        this.f = true;
    }

    @Override // defpackage.y61
    public void e() {
        super/*android.view.View*/.setVisibility(0);
        this.f = false;
    }

    public h(ActionBarContextView actionBarContextView) {
        this.h = actionBarContextView;
        this.f = false;
    }
}
