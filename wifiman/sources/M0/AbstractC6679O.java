package m0;

import android.graphics.Bitmap;
import m0.K0;
import n0.AbstractC6858c;

/* renamed from: m0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6679O {
    public static final J0 a(int i10, int i11, int i12, boolean z10, AbstractC6858c abstractC6858c) {
        d(i12);
        return new C6678N(C6693b0.b(i10, i11, i12, z10, abstractC6858c));
    }

    public static final Bitmap b(J0 j02) {
        if (j02 instanceof C6678N) {
            return ((C6678N) j02).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final J0 c(Bitmap bitmap) {
        return new C6678N(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        K0.a aVar = K0.f52822b;
        return K0.i(i10, aVar.b()) ? Bitmap.Config.ARGB_8888 : K0.i(i10, aVar.a()) ? Bitmap.Config.ALPHA_8 : K0.i(i10, aVar.e()) ? Bitmap.Config.RGB_565 : K0.i(i10, aVar.c()) ? Bitmap.Config.RGBA_F16 : K0.i(i10, aVar.d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int e(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? K0.f52822b.a() : config == Bitmap.Config.RGB_565 ? K0.f52822b.e() : config == Bitmap.Config.ARGB_4444 ? K0.f52822b.b() : config == Bitmap.Config.RGBA_F16 ? K0.f52822b.c() : config == Bitmap.Config.HARDWARE ? K0.f52822b.d() : K0.f52822b.b();
    }
}
