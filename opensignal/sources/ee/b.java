package ee;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f8087a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8088b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f8087a;
            f10 += ((b) dVar).f8088b;
        }
        this.f8087a = dVar;
        this.f8088b = f10;
    }

    @Override // ee.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f8087a.a(rectF) + this.f8088b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8087a.equals(bVar.f8087a) && this.f8088b == bVar.f8088b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8087a, Float.valueOf(this.f8088b)});
    }
}
