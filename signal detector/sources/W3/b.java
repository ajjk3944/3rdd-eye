package W3;

import android.app.PendingIntent;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f4023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4024b;

    public b(PendingIntent pendingIntent, boolean z6) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f4023a = pendingIntent;
        this.f4024b = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4023a.equals(((b) aVar).f4023a)) {
                if (this.f4024b == ((b) aVar).f4024b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4023a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f4024b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f4023a.toString() + ", isNoOp=" + this.f4024b + "}";
    }
}
