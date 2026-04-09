package y0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47885a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f47889e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f47890f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f47891g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f47892h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f47893j;

    /* renamed from: l, reason: collision with root package name */
    public q f47895l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f47897n;

    /* renamed from: q, reason: collision with root package name */
    public String f47900q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f47901r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f47902s;

    /* renamed from: t, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f47903t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<l> f47886b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<v> f47887c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<l> f47888d = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    public boolean f47894k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f47896m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f47898o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f47899p = 0;

    /* compiled from: NotificationCompat.java */
    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i) {
            return builder.setLegacyStreamType(i);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    public o(Context context, String str) {
        Notification notification = new Notification();
        this.f47902s = notification;
        this.f47885a = context;
        this.f47900q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f47893j = 0;
        this.f47903t = new ArrayList<>();
        this.f47901r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        r rVar = new r(this);
        o oVar = rVar.f47907c;
        q qVar = oVar.f47895l;
        if (qVar != null) {
            qVar.b(rVar);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = rVar.f47906b;
        if (i < 26 && i < 24) {
            builder.setExtras(rVar.f47908d);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (qVar != null) {
            oVar.f47895l.getClass();
        }
        if (qVar != null && (bundle = notificationBuild.extras) != null) {
            qVar.a(bundle);
        }
        return notificationBuild;
    }

    public final void c(boolean z10) {
        Notification notification = this.f47902s;
        if (z10) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) throws Resources.NotFoundException {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f47885a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f15491k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f15493b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f47892h = iconCompat;
    }

    public final void e(q qVar) {
        if (this.f47895l != qVar) {
            this.f47895l = qVar;
            if (qVar == null || qVar.f47904a == this) {
                return;
            }
            qVar.f47904a = this;
            e(qVar);
        }
    }
}
