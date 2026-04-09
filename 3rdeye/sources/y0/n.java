package y0;

import android.app.Notification;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f47884b;

    @Override // y0.q
    public final void b(r rVar) {
        new Notification.BigTextStyle(rVar.f47906b).setBigContentTitle(null).bigText(this.f47884b);
    }

    @Override // y0.q
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
