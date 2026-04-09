package t6;

import android.app.Notification;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f34381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34382b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f34383c;

    public m(int i4, Notification notification, int i10) {
        this.f34381a = i4;
        this.f34383c = notification;
        this.f34382b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f34381a == mVar.f34381a && this.f34382b == mVar.f34382b) {
            return this.f34383c.equals(mVar.f34383c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34383c.hashCode() + (((this.f34381a * 31) + this.f34382b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f34381a + ", mForegroundServiceType=" + this.f34382b + ", mNotification=" + this.f34383c + '}';
    }
}
