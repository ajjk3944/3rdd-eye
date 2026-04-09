package g8;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24572b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(x7.e.f36998a);

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f24572b);
    }

    @Override // g8.d
    public final Bitmap c(a8.b bVar, Bitmap bitmap, int i4, int i10) {
        float width;
        float height;
        Paint paint = a0.f24550a;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i4) {
            width = i10 / bitmap.getHeight();
            width2 = (i4 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i4 / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = bVar.e(i4, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        a0.a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // x7.e
    public final int hashCode() {
        return -599754482;
    }
}
