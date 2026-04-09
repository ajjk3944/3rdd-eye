package M2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class j implements E2.c, E2.b {

    /* renamed from: a, reason: collision with root package name */
    protected final Drawable f12466a;

    public j(Drawable drawable) {
        this.f12466a = (Drawable) W2.k.d(drawable);
    }

    @Override // E2.b
    public void b() {
        Drawable drawable = this.f12466a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof O2.c) {
            ((O2.c) drawable).e().prepareToDraw();
        }
    }

    @Override // E2.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f12466a.getConstantState();
        return constantState == null ? this.f12466a : constantState.newDrawable();
    }
}
