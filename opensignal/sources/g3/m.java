package g3;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class m extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public IconCompat f9301g;

    /* renamed from: r, reason: collision with root package name */
    public IconCompat f9302r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9303x;

    @Override // androidx.lifecycle.o
    public final void X0(kg.r rVar) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) rVar.f14396d;
        Context context = (Context) rVar.f14395a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.f9301g;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                l.a(bigContentTitle, iconCompat.g(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.f9301g;
                int i10 = iconCompat2.f1222a;
                if (i10 == -1) {
                    Object obj = iconCompat2.f1223b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i10 == 1) {
                    bitmapA = (Bitmap) iconCompat2.f1223b;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.f1223b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.f9303x) {
            IconCompat iconCompat3 = this.f9302r;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                k.a(bigContentTitle, iconCompat3.g(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            l.c(bigContentTitle, false);
            l.b(bigContentTitle, null);
        }
    }

    @Override // androidx.lifecycle.o
    public final String d1() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
