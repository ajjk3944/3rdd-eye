package u1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import l1.InterfaceC2639e;
import o1.InterfaceC2753a;

/* loaded from: classes.dex */
public final class h extends AbstractC2950e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23739b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC2639e.f21817a);

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f23739b);
    }

    @Override // u1.AbstractC2950e
    public final Bitmap c(InterfaceC2753a interfaceC2753a, Bitmap bitmap, int i, int i3) {
        float width;
        float height;
        Paint paint = AbstractC2943A.f23711a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i) {
            width = i3 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i3 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapM = interfaceC2753a.m(i, i3, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapM.setHasAlpha(bitmap.hasAlpha());
        AbstractC2943A.a(bitmap, bitmapM, matrix);
        return bitmapM;
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return -599754482;
    }
}
