package u1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import l1.InterfaceC2639e;
import o1.InterfaceC2753a;

/* loaded from: classes.dex */
public final class i extends AbstractC2950e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23740b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC2639e.f21817a);

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f23740b);
    }

    @Override // u1.AbstractC2950e
    public final Bitmap c(InterfaceC2753a interfaceC2753a, Bitmap bitmap, int i, int i3) {
        Paint paint = AbstractC2943A.f23711a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC2943A.b(interfaceC2753a, bitmap, i, i3);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return -670243078;
    }
}
