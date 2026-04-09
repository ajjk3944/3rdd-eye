package V0;

import android.app.Notification;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f3822a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3823b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f3824c;

    public g(int i, Notification notification, int i3) {
        this.f3822a = i;
        this.f3824c = notification;
        this.f3823b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3822a == gVar.f3822a && this.f3823b == gVar.f3823b) {
            return this.f3824c.equals(gVar.f3824c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3824c.hashCode() + (((this.f3822a * 31) + this.f3823b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3822a + ", mForegroundServiceType=" + this.f3823b + ", mNotification=" + this.f3824c + '}';
    }
}
