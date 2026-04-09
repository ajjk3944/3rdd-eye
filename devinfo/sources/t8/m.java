package t8;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f34520a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f34521b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    public static volatile Handler f34522c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = l.f34519a[config.ordinal()];
        int i10 = 1;
        if (i4 != 1) {
            i10 = 2;
            if (i4 != 2 && i4 != 3) {
                return i4 != 4 ? 4 : 8;
            }
        }
        return i10;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f34522c == null) {
            synchronized (m.class) {
                try {
                    if (f34522c == null) {
                        f34522c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f34522c;
    }

    public static int g(int i4, int i10) {
        return (i10 * 31) + i4;
    }

    public static int h(int i4, Object obj) {
        return g(obj == null ? 0 : obj.hashCode(), i4);
    }

    public static boolean i(int i4, int i10) {
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }
        return false;
    }
}
