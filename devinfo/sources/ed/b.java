package ed;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f23264a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23265b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f23264a;
            f10 += ((b) dVar).f23265b;
        }
        this.f23264a = dVar;
        this.f23265b = f10;
    }

    @Override // ed.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f23264a.a(rectF) + this.f23265b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23264a.equals(bVar.f23264a) && this.f23265b == bVar.f23265b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23264a, Float.valueOf(this.f23265b)});
    }
}
