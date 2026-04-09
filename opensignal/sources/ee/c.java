package ee;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8093a;

    public c(float f10) {
        this.f8093a = f10;
    }

    @Override // ee.d
    public final float a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f10 = this.f8093a;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10 > fMin ? fMin : f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f8093a == ((c) obj).f8093a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8093a)});
    }
}
