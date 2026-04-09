package ed;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f23255a;

    public a(float f10) {
        this.f23255a = f10;
    }

    @Override // ed.d
    public final float a(RectF rectF) {
        return this.f23255a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23255a == ((a) obj).f23255a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23255a)});
    }

    public final String toString() {
        return this.f23255a + "px";
    }
}
