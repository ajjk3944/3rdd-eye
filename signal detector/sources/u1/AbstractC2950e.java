package u1;

import android.content.Context;
import android.graphics.Bitmap;
import o1.InterfaceC2753a;

/* renamed from: u1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2950e implements l1.l {
    @Override // l1.l
    public final n1.z b(Context context, n1.z zVar, int i, int i3) {
        if (!H1.p.i(i, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC2753a interfaceC2753a = com.bumptech.glide.b.a(context).f6484a;
        Bitmap bitmap = (Bitmap) zVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(interfaceC2753a, bitmap, i, i3);
        return bitmap.equals(bitmapC) ? zVar : C2949d.d(bitmapC, interfaceC2753a);
    }

    public abstract Bitmap c(InterfaceC2753a interfaceC2753a, Bitmap bitmap, int i, int i3);
}
