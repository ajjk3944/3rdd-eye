package G;

import android.app.Notification;

/* loaded from: classes.dex */
public final class k extends m {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1488b;

    @Override // G.m
    public final void c(c1.g gVar) {
        new Notification.BigTextStyle((Notification.Builder) gVar.f5897c).setBigContentTitle(null).bigText(this.f1488b);
    }

    @Override // G.m
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
