package m0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import n0.AbstractC6858c;
import n0.C6862g;

/* renamed from: m0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6693b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C6693b0 f52878a = new C6693b0();

    private C6693b0() {
    }

    public static final AbstractC6858c a(Bitmap bitmap) {
        AbstractC6858c abstractC6858cB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC6858cB = AbstractC6674J.b(colorSpace)) == null) ? C6862g.f54113a.w() : abstractC6858cB;
    }

    public static final Bitmap b(int i10, int i11, int i12, boolean z10, AbstractC6858c abstractC6858c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, AbstractC6679O.d(i12), z10, AbstractC6674J.a(abstractC6858c));
    }
}
