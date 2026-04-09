package androidx.work;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f16896a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16897b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f16898c;

    public h(int i, Notification notification, int i10) {
        this.f16896a = i;
        this.f16898c = notification;
        this.f16897b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16896a == hVar.f16896a && this.f16897b == hVar.f16897b) {
            return this.f16898c.equals(hVar.f16898c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16898c.hashCode() + (((this.f16896a * 31) + this.f16897b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f16896a + ", mForegroundServiceType=" + this.f16897b + ", mNotification=" + this.f16898c + '}';
    }
}
