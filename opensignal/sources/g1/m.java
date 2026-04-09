package g1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f9257a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9258b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9259c;

    public m(int i10, long j) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            n.g();
            porterDuffColorFilter = n.d(f0.q(j), f0.o(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(f0.q(j), f0.t(i10));
        }
        this.f9257a = porterDuffColorFilter;
        this.f9258b = j;
        this.f9259c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return r.c(this.f9258b, mVar.f9258b) && this.f9259c == mVar.f9259c;
    }

    public final int hashCode() {
        int i10 = r.f9270h;
        return Integer.hashCode(this.f9259c) + (Long.hashCode(this.f9258b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        h0.b.A(this.f9258b, ", blendMode=", sb2);
        sb2.append((Object) f0.u(this.f9259c));
        sb2.append(')');
        return sb2.toString();
    }
}
