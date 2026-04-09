package V6;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6679O;
import m0.J0;
import x1.AbstractC8417b;

/* loaded from: classes3.dex */
public abstract class q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23081a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.DRAWABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.BITMAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.GIF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23081a = iArr;
        }
    }

    public static final J0 a(Object obj, p glideRequestType) {
        AbstractC6492s.i(glideRequestType, "glideRequestType");
        int i10 = a.f23081a[glideRequestType.ordinal()];
        if (i10 == 1) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
            return AbstractC6679O.c(AbstractC8417b.b((Drawable) obj, 0, 0, null, 7, null));
        }
        if (i10 == 2) {
            AbstractC6492s.g(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
            return AbstractC6679O.c((Bitmap) obj);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC6492s.g(obj, "null cannot be cast to non-null type com.bumptech.glide.load.resource.gif.GifDrawable");
        O2.c cVar = (O2.c) obj;
        cVar.start();
        return AbstractC6679O.c(AbstractC8417b.b(cVar, 0, 0, null, 7, null));
    }
}
