package androidx.work;

import android.app.Notification;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4378b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f4379c;

    public e(int i10, Notification notification, int i11) {
        this.f4377a = i10;
        this.f4379c = notification;
        this.f4378b = i11;
    }

    public int a() {
        return this.f4378b;
    }

    public Notification b() {
        return this.f4379c;
    }

    public int c() {
        return this.f4377a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4377a == eVar.f4377a && this.f4378b == eVar.f4378b) {
            return this.f4379c.equals(eVar.f4379c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f4377a * 31) + this.f4378b) * 31) + this.f4379c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4377a + ", mForegroundServiceType=" + this.f4378b + ", mNotification=" + this.f4379c + '}';
    }
}
