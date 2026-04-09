package g5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f21192a;

    public c(float f10) {
        this.f21192a = f10;
    }

    public static float b(RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // g5.d
    public float a(RectF rectF) {
        return m0.a.a(this.f21192a, 0.0f, b(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f21192a == ((c) obj).f21192a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21192a)});
    }
}
