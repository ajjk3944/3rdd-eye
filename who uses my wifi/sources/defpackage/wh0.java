package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wh0 extends f74 {
    public CharSequence i;

    @Override // defpackage.f74
    public final void j1(p21 p21Var) {
        new Notification.BigTextStyle((Notification.Builder) p21Var.g).setBigContentTitle(null).bigText(this.i);
    }

    @Override // defpackage.f74
    public final String k1() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
