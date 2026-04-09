package g3;

import android.app.Notification;

/* loaded from: classes.dex */
public final class n extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f9304g;

    @Override // androidx.lifecycle.o
    public final void X0(kg.r rVar) {
        new Notification.BigTextStyle((Notification.Builder) rVar.f14396d).setBigContentTitle(null).bigText(this.f9304g);
    }

    @Override // androidx.lifecycle.o
    public final String d1() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
