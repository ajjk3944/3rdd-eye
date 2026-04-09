package j4;

import android.app.PendingIntent;

/* renamed from: j4.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6249d extends AbstractC6246a {

    /* renamed from: a, reason: collision with root package name */
    private final PendingIntent f50116a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50117b;

    C6249d(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f50116a = pendingIntent;
        this.f50117b = z10;
    }

    @Override // j4.AbstractC6246a
    final PendingIntent a() {
        return this.f50116a;
    }

    @Override // j4.AbstractC6246a
    final boolean b() {
        return this.f50117b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6246a) {
            AbstractC6246a abstractC6246a = (AbstractC6246a) obj;
            if (this.f50116a.equals(abstractC6246a.a()) && this.f50117b == abstractC6246a.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50116a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f50117b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f50116a.toString() + ", isNoOp=" + this.f50117b + "}";
    }
}
