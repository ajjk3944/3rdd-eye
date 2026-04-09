package u7;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23384a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23385b;

    public e(wd.a aVar) {
        this.f23385b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f23384a) {
            case 0:
                return ((Drawable.ConstantState) this.f23385b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f23384a) {
            case 0:
                return ((Drawable.ConstantState) this.f23385b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f23384a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f23385b).newDrawable();
                fVar.f23391a = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f23390y);
                return fVar;
            default:
                return (wd.a) this.f23385b;
        }
    }

    public e(Drawable.ConstantState constantState) {
        this.f23385b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f23384a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f23385b).newDrawable(resources);
                fVar.f23391a = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f23390y);
                return fVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f23384a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f23385b).newDrawable(resources, theme);
                fVar.f23391a = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f23390y);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
