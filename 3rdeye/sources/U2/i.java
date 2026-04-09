package U2;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12401b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(L2.f.f4027a);

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12401b);
    }

    @Override // U2.f
    public final Bitmap c(O2.b bVar, Bitmap bitmap, int i, int i10) {
        float width;
        float height;
        Paint paint = z.f12462a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i) {
            width = i10 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i10 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapC = bVar.c(i, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapC.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, bitmapC, matrix);
        return bitmapC;
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // L2.f
    public final int hashCode() {
        return -599754482;
    }
}
