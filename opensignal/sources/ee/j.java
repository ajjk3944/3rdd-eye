package ee;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8122a;

    public j(float f10) {
        this.f8122a = f10;
    }

    @Override // ee.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f8122a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f8122a == ((j) obj).f8122a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8122a)});
    }

    public final String toString() {
        return h0.b.i((int) (this.f8122a * 100.0f), "%", new StringBuilder());
    }
}
