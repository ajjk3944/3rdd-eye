package E7;

import Yg.s;
import Yg.z;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4039a = new b();

    private b() {
    }

    public final Bitmap a(Bitmap bitmap, int i10) {
        AbstractC6492s.i(bitmap, "bitmap");
        if (i10 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        AbstractC6492s.h(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public final s b(s sVar, int i10, int i11, int i12) {
        AbstractC6492s.i(sVar, "<this>");
        int iIntValue = ((Number) sVar.a()).intValue();
        int iIntValue2 = ((Number) sVar.c()).intValue();
        if (i12 == 0) {
            return z.a(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
        if (i12 == 90) {
            return z.a(Integer.valueOf(iIntValue2), Integer.valueOf(i10 - iIntValue));
        }
        if (i12 == 180) {
            return z.a(Integer.valueOf(i10 - iIntValue), Integer.valueOf(i11 - iIntValue2));
        }
        if (i12 == 270) {
            return z.a(Integer.valueOf(i11 - iIntValue2), Integer.valueOf(iIntValue));
        }
        throw new IllegalStateException(("Invalid imageRotation " + i12).toString());
    }
}
