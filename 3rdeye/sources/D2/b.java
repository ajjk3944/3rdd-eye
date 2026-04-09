package D2;

import android.graphics.Matrix;
import kotlin.KotlinVersion;

/* compiled from: ImageUtils.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1033a = new c();

    public static int a(int i, int i10, int i11) {
        int i12 = i - 16;
        int i13 = 0;
        if (i12 < 0) {
            i12 = 0;
        }
        int i14 = i10 - 128;
        int i15 = i11 - 128;
        int i16 = i12 * 1192;
        int i17 = (i15 * 1634) + i16;
        int i18 = (i16 - (i15 * 833)) - (i14 * 400);
        int i19 = (i14 * 2066) + i16;
        if (i17 > 262143) {
            i17 = 262143;
        } else if (i17 < 0) {
            i17 = 0;
        }
        if (i18 > 262143) {
            i18 = 262143;
        } else if (i18 < 0) {
            i18 = 0;
        }
        if (i19 > 262143) {
            i13 = 262143;
        } else if (i19 >= 0) {
            i13 = i19;
        }
        return ((i17 << 6) & 16711680) | (-16777216) | ((i18 >> 2) & 65280) | ((i13 >> 10) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static Matrix b(int i, int i10, int i11, int i12, int i13) {
        Matrix matrix = new Matrix();
        if (i13 != 0) {
            if (i13 % 90 != 0) {
                f1033a.f("Rotation of %d % 90 != 0", Integer.valueOf(i13));
            }
            matrix.postTranslate((-i) / 2.0f, (-i10) / 2.0f);
            matrix.postRotate(i13);
        }
        boolean z10 = (Math.abs(i13) + 90) % 180 == 0;
        int i14 = z10 ? i10 : i;
        if (!z10) {
            i = i10;
        }
        if (i14 != i11 || i != i12) {
            matrix.postScale(i11 / i14, i12 / i);
        }
        if (i13 != 0) {
            matrix.postTranslate(i11 / 2.0f, i12 / 2.0f);
        }
        return matrix;
    }
}
