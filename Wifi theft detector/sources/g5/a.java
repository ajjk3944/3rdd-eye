package g5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f21189a;

    public a(float f10) {
        this.f21189a = f10;
    }

    @Override // g5.d
    public float a(RectF rectF) {
        return this.f21189a;
    }

    public float b() {
        return this.f21189a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f21189a == ((a) obj).f21189a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f21189a)});
    }

    public String toString() {
        return b() + "px";
    }
}
