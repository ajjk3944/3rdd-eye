package x4;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class c extends AbstractC5767b {

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f47759b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47760c;

    public c(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f47759b = pendingIntent;
        this.f47760c = z10;
    }

    @Override // x4.AbstractC5767b
    public final PendingIntent c() {
        return this.f47759b;
    }

    @Override // x4.AbstractC5767b
    public final boolean e() {
        return this.f47760c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5767b)) {
            return false;
        }
        AbstractC5767b abstractC5767b = (AbstractC5767b) obj;
        return this.f47759b.equals(abstractC5767b.c()) && this.f47760c == abstractC5767b.e();
    }

    public final int hashCode() {
        return ((this.f47759b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f47760c ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f47759b.toString() + ", isNoOp=" + this.f47760c + "}";
    }
}
