package U5;

import D0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.l;

/* compiled from: DrawableExtension.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ Drawable a(Drawable drawable, Context context, Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return drawable;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
        l.e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, num.intValue(), num2.intValue());
        drawable.draw(canvas);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    public static final void b(Drawable drawable, Integer num) {
        if (num != null) {
            a.C0009a.h(drawable, ColorStateList.valueOf(num.intValue()));
        }
    }
}
