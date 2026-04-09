package H0;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6679O;
import m0.J0;

/* loaded from: classes.dex */
public abstract class a {
    public static final J0 a(J0.a aVar, Resources resources, int i10) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i10, null);
        AbstractC6492s.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AbstractC6679O.c(((BitmapDrawable) drawable).getBitmap());
    }
}
