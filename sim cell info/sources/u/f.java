package u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
final class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f3350a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f3351b;

    /* renamed from: c, reason: collision with root package name */
    ColorStateList f3352c;

    /* renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f3353d;

    f(f fVar) {
        this.f3352c = null;
        this.f3353d = d.f3342h;
        if (fVar != null) {
            this.f3350a = fVar.f3350a;
            this.f3351b = fVar.f3351b;
            this.f3352c = fVar.f3352c;
            this.f3353d = fVar.f3353d;
        }
    }

    boolean a() {
        return this.f3351b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.f3350a;
        Drawable.ConstantState constantState = this.f3351b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
