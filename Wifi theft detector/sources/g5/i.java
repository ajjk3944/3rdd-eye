package g5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f21194a;

    public i(float f10) {
        this.f21194a = f10;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override // g5.d
    public float a(RectF rectF) {
        return this.f21194a * b(rectF);
    }

    public float c() {
        return this.f21194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f21194a == ((i) obj).f21194a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21194a)});
    }

    public String toString() {
        return ((int) (c() * 100.0f)) + "%";
    }
}
