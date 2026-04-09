package M0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import v3.C2961a;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2634b;

    public /* synthetic */ e(int i, Object obj) {
        this.f2633a = i;
        this.f2634b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f2633a) {
            case 0:
                return ((Drawable.ConstantState) this.f2634b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f2633a) {
            case 0:
                return ((Drawable.ConstantState) this.f2634b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f2633a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2634b).newDrawable();
                fVar.f2644a = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f2640f);
                return fVar;
            case 1:
                return (C2961a) this.f2634b;
            default:
                return new y1.b(this);
        }
    }

    public e(C2961a c2961a) {
        this.f2633a = 1;
        this.f2634b = c2961a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f2633a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2634b).newDrawable(resources);
                fVar.f2644a = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f2640f);
                return fVar;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new y1.b(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f2633a) {
            case 0:
                f fVar = new f(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f2634b).newDrawable(resources, theme);
                fVar.f2644a = drawableNewDrawable;
                drawableNewDrawable.setCallback(fVar.f2640f);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
