package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class a0 extends U {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f27323b;

    public a0(Context context, Resources resources) {
        super(resources);
        this.f27323b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) {
        Drawable drawableA = a(i10);
        Context context = (Context) this.f27323b.get();
        if (drawableA != null && context != null) {
            T.g().w(context, i10, drawableA);
        }
        return drawableA;
    }
}
