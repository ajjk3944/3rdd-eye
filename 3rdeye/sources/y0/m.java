package y0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class m extends q {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f47881b;

    /* renamed from: c, reason: collision with root package name */
    public IconCompat f47882c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47883d;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // y0.q
    public final void b(r rVar) {
        Bitmap bitmapA;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(rVar.f47906b).setBigContentTitle(null);
        IconCompat iconCompat = this.f47881b;
        Context context = rVar.f47905a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat, context));
            } else {
                int iC = iconCompat.f15492a;
                if (iC == -1) {
                    iC = IconCompat.a.c(iconCompat.f15493b);
                }
                if (iC == 1) {
                    IconCompat iconCompat2 = this.f47881b;
                    int i = iconCompat2.f15492a;
                    if (i == -1) {
                        Object obj = iconCompat2.f15493b;
                        bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i == 1) {
                        bitmapA = (Bitmap) iconCompat2.f15493b;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapA = IconCompat.a((Bitmap) iconCompat2.f15493b, true);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmapA);
                }
            }
        }
        if (this.f47883d) {
            IconCompat iconCompat3 = this.f47882c;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a.a(bigContentTitle, IconCompat.a.f(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(bigContentTitle, false);
            b.b(bigContentTitle, null);
        }
    }

    @Override // y0.q
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
