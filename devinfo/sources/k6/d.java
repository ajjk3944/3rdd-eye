package k6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27974a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27975b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f27974a = i4;
        this.f27975b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f27974a) {
            case 0:
                return ((Drawable.ConstantState) this.f27975b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f27974a) {
            case 0:
                return ((Drawable.ConstantState) this.f27975b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f27974a) {
            case 0:
                e eVar = new e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f27975b).newDrawable();
                eVar.f27984a = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f27980f);
                return eVar;
            case 1:
                return new k8.b(this);
            default:
                return (yc.a) this.f27975b;
        }
    }

    public d(yc.a aVar) {
        this.f27974a = 2;
        this.f27975b = aVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f27974a) {
            case 0:
                e eVar = new e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f27975b).newDrawable(resources);
                eVar.f27984a = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f27980f);
                return eVar;
            case 1:
                return new k8.b(this);
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f27974a) {
            case 0:
                e eVar = new e(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f27975b).newDrawable(resources, theme);
                eVar.f27984a = drawableNewDrawable;
                drawableNewDrawable.setCallback(eVar.f27980f);
                return eVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
