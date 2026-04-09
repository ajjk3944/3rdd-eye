package g5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f21190a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21191b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f21190a;
            f10 += ((b) dVar).f21191b;
        }
        this.f21190a = dVar;
        this.f21191b = f10;
    }

    @Override // g5.d
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f21190a.a(rectF) + this.f21191b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21190a.equals(bVar.f21190a) && this.f21191b == bVar.f21191b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21190a, Float.valueOf(this.f21191b)});
    }
}
