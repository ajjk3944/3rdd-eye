package U2;

import N7.G8;
import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class f implements L2.l<Bitmap> {
    @Override // L2.l
    public final N2.u<Bitmap> a(Context context, N2.u<Bitmap> uVar, int i, int i10) {
        if (!h3.l.i(i, i10)) {
            throw new IllegalArgumentException(G8.r("Cannot apply transformation on width: ", i, " or height: ", i10, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        O2.b bVar = com.bumptech.glide.b.a(context).f22237b;
        Bitmap bitmap = uVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(bVar, bitmap, i, i10);
        return bitmap.equals(bitmapC) ? uVar : e.b(bVar, bitmapC);
    }

    public abstract Bitmap c(O2.b bVar, Bitmap bitmap, int i, int i10);
}
