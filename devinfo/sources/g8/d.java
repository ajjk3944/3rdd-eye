package g8;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d implements x7.l {
    @Override // x7.l
    public final z7.y a(Context context, z7.y yVar, int i4, int i10) {
        if (!t8.m.i(i4, i10)) {
            throw new IllegalArgumentException(r5.c.i(i4, "Cannot apply transformation on width: ", " or height: ", i10, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        a8.b bVar = com.bumptech.glide.b.a(context).f6470a;
        Bitmap bitmap = (Bitmap) yVar.get();
        if (i4 == Integer.MIN_VALUE) {
            i4 = bitmap.getWidth();
        }
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(bVar, bitmap, i4, i10);
        return bitmap.equals(bitmapC) ? yVar : c.c(bVar, bitmapC);
    }

    public abstract Bitmap c(a8.b bVar, Bitmap bitmap, int i4, int i10);
}
