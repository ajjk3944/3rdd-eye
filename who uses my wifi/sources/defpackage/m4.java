package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m4 extends Drawable.ConstantState {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public m4(cb cbVar) {
        this.b = cbVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                n4 n4Var = new n4(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                n4Var.f = drawableNewDrawable;
                drawableNewDrawable.setCallback(n4Var.k);
                return n4Var;
            default:
                return (cb) this.b;
        }
    }

    public m4(Drawable.ConstantState constantState) {
        this.b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                n4 n4Var = new n4(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                n4Var.f = drawableNewDrawable;
                drawableNewDrawable.setCallback(n4Var.k);
                return n4Var;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                n4 n4Var = new n4(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                n4Var.f = drawableNewDrawable;
                drawableNewDrawable.setCallback(n4Var.k);
                return n4Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
