package D0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.PictureDrawable;

/* compiled from: Drawable.kt */
/* loaded from: classes.dex */
public final class b {
    public static Bitmap a(PictureDrawable pictureDrawable) {
        int intrinsicWidth = pictureDrawable.getIntrinsicWidth();
        int intrinsicHeight = pictureDrawable.getIntrinsicHeight();
        Rect bounds = pictureDrawable.getBounds();
        int i = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        pictureDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        pictureDrawable.draw(new Canvas(bitmapCreateBitmap));
        pictureDrawable.setBounds(i, i10, i11, i12);
        return bitmapCreateBitmap;
    }
}
