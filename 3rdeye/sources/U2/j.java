package U2;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12402b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(L2.f.f4027a);

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12402b);
    }

    @Override // U2.f
    public final Bitmap c(O2.b bVar, Bitmap bitmap, int i, int i10) {
        Paint paint = z.f12462a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return z.b(bVar, bitmap, i, i10);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // L2.f
    public final int hashCode() {
        return -670243078;
    }
}
