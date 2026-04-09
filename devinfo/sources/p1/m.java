package p1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import c0.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f31003a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31005c;

    public m(int i4, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            f1.f();
            porterDuffColorFilter = f1.a(z.u(j), b.d(i4));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(z.u(j), b.e(i4));
        }
        this.f31003a = porterDuffColorFilter;
        this.f31004b = j;
        this.f31005c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.c(this.f31004b, mVar.f31004b) && this.f31005c == mVar.f31005c;
    }

    public final int hashCode() {
        int i4 = s.f31019i;
        return (yj.q.a(this.f31004b) * 31) + this.f31005c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        a0.g.w(this.f31004b, ", blendMode=", sb2);
        sb2.append((Object) z.w(this.f31005c));
        sb2.append(')');
        return sb2.toString();
    }
}
