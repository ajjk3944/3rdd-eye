package ed;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f23341a;

    public l(float f10) {
        this.f23341a = f10;
    }

    @Override // ed.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f23341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f23341a == ((l) obj).f23341a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23341a)});
    }

    public final String toString() {
        return r5.c.j((int) (this.f23341a * 100.0f), "%", new StringBuilder());
    }
}
