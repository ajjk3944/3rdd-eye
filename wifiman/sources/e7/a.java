package E7;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC6492s;
import oh.AbstractC7137b;

/* loaded from: classes3.dex */
public final class a {
    public final Bitmap a(Bitmap bitmap, int i10) {
        int iD;
        AbstractC6492s.i(bitmap, "bitmap");
        if (bitmap.getHeight() <= i10 && bitmap.getWidth() <= i10) {
            return bitmap;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (bitmap.getHeight() > bitmap.getWidth()) {
            iD = i10;
            i10 = AbstractC7137b.d(i10 * (bitmap.getWidth() / bitmap.getHeight()));
        } else {
            iD = AbstractC7137b.d(i10 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, iD, false);
        AbstractC6492s.h(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        Z7.b.h("AR input bitmap downscale took " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", prev: " + Math.max(bitmap.getHeight(), bitmap.getWidth()) + " now: " + Math.max(bitmapCreateScaledBitmap.getHeight(), bitmapCreateScaledBitmap.getWidth()), null, 2, null);
        return bitmapCreateScaledBitmap;
    }
}
