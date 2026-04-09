package W2;

import N2.r;
import N2.u;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import t4.C5606d;

/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class c<T extends Drawable> implements u<T>, r {

    /* renamed from: b, reason: collision with root package name */
    public final T f13335b;

    public c(T t10) {
        C5606d.l(t10, "Argument must not be null");
        this.f13335b = t10;
    }

    @Override // N2.u
    public final Object get() {
        T t10 = this.f13335b;
        Drawable.ConstantState constantState = t10.getConstantState();
        return constantState == null ? t10 : constantState.newDrawable();
    }

    @Override // N2.r
    public void initialize() {
        T t10 = this.f13335b;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof Y2.c) {
            ((Y2.c) t10).f13728b.f13737a.f13749l.prepareToDraw();
        }
    }
}
