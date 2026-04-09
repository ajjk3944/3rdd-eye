package g8;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24573b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(x7.e.f36998a);

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f24573b);
    }

    @Override // g8.d
    public final Bitmap c(a8.b bVar, Bitmap bitmap, int i4, int i10) {
        Paint paint = a0.f24550a;
        if (bitmap.getWidth() > i4 || bitmap.getHeight() > i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return a0.b(bVar, bitmap, i4, i10);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // x7.e
    public final int hashCode() {
        return -670243078;
    }
}
