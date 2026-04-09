package ee;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8086a;

    public a(float f10) {
        this.f8086a = f10;
    }

    @Override // ee.d
    public final float a(RectF rectF) {
        return this.f8086a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f8086a == ((a) obj).f8086a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8086a)});
    }

    public final String toString() {
        return this.f8086a + "px";
    }
}
