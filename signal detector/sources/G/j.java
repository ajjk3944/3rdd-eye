package G;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f1485b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f1486c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1487d;

    @Override // G.m
    public final void c(c1.g gVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) gVar.f5897c;
        Context context = (Context) gVar.f5896b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f1485b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f1485b;
                int i = iconCompat2.f5092a;
                if (i == -1) {
                    Object obj = iconCompat2.f5093b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.f5093b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f5093b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f1487d) {
            IconCompat iconCompat3 = this.f1486c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                h.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            i.c(bigContentTitle, false);
            i.b(bigContentTitle, null);
        }
    }

    @Override // G.m
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
