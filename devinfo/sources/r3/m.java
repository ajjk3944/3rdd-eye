package r3;

import android.app.Notification;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f32755c;

    @Override // a8.a
    public final void o(va.o oVar) {
        new Notification.BigTextStyle((Notification.Builder) oVar.f36147c).setBigContentTitle(null).bigText(this.f32755c);
    }

    @Override // a8.a
    public final String r() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
