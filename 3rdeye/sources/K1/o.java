package K1;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.os.Build;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3030a;

    /* compiled from: TransitionUtils.java */
    public static class a {
        public static Bitmap a(Picture picture) {
            return Bitmap.createBitmap(picture);
        }
    }

    static {
        f3030a = Build.VERSION.SDK_INT >= 28;
    }
}
