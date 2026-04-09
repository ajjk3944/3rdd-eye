package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fa {
    public a4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ fa(View view, int i) {
        this.b = i;
        this.c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.b) {
            case 0:
                ga gaVar = (ga) this.c;
                gaVar.setIndeterminate(false);
                gaVar.a(gaVar.g);
                break;
            case 1:
                ga gaVar2 = (ga) this.c;
                if (!gaVar2.k) {
                    gaVar2.setVisibility(gaVar2.l);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((hc0) this.c).t;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    public void b(Drawable drawable) {
        switch (this.b) {
            case 2:
                hc0 hc0Var = (hc0) this.c;
                ColorStateList colorStateList = hc0Var.t;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(hc0Var.x, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }

    public final void c(Drawable drawable) {
    }
}
