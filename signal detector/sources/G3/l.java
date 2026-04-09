package G3;

import android.graphics.RectF;
import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class l implements InterfaceC0150d {

    /* renamed from: a, reason: collision with root package name */
    public final float f1611a;

    public l(float f2) {
        this.f1611a = f2;
    }

    @Override // G3.InterfaceC0150d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1611a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f1611a == ((l) obj).f1611a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1611a)});
    }

    public final String toString() {
        return AbstractC2763b.d((int) (this.f1611a * 100.0f), "%", new StringBuilder());
    }
}
