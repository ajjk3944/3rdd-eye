package r3;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f32752c;

    /* renamed from: d, reason: collision with root package name */
    public IconCompat f32753d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32754e;

    @Override // a8.a
    public final void o(va.o oVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) oVar.f36147c;
        Context context = (Context) oVar.f36146b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f32752c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                k.a(bigContentTitle, iconCompat.g(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f32752c;
                int i4 = iconCompat2.f900a;
                if (i4 == -1) {
                    Object obj = iconCompat2.f901b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i4 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f901b;
                } else {
                    if (i4 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f901b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f32754e) {
            IconCompat iconCompat3 = this.f32753d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                j.a(bigContentTitle, iconCompat3.g(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            k.c(bigContentTitle, false);
            k.b(bigContentTitle, null);
        }
    }

    @Override // a8.a
    public final String r() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
