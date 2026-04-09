package H6;

import android.graphics.Paint;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: ShadowCache.kt */
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f2108a = new Paint();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2109b = new LinkedHashMap();

    /* compiled from: ShadowCache.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float[] f2110a;

        /* renamed from: b, reason: collision with root package name */
        public final float f2111b;

        public a(float[] fArr, float f10) {
            this.f2110a = fArr;
            this.f2111b = f10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2111b == aVar.f2111b && Arrays.equals(this.f2110a, aVar.f2110a);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f2111b) + (Arrays.hashCode(this.f2110a) * 31);
        }
    }
}
