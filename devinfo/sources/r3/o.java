package r3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32756a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f32760e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f32761f;
    public PendingIntent g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f32762h;

    /* renamed from: i, reason: collision with root package name */
    public int f32763i;

    /* renamed from: k, reason: collision with root package name */
    public a8.a f32764k;

    /* renamed from: l, reason: collision with root package name */
    public String f32765l;

    /* renamed from: n, reason: collision with root package name */
    public String f32767n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f32768o;

    /* renamed from: p, reason: collision with root package name */
    public RemoteViews f32769p;

    /* renamed from: q, reason: collision with root package name */
    public RemoteViews f32770q;

    /* renamed from: r, reason: collision with root package name */
    public String f32771r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f32772s;

    /* renamed from: t, reason: collision with root package name */
    public final Notification f32773t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f32774u;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32757b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f32758c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f32759d = new ArrayList();
    public final boolean j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32766m = false;

    public o(Context context, String str) {
        Notification notification = new Notification();
        this.f32773t = notification;
        this.f32756a = context;
        this.f32771r = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f32763i = 0;
        this.f32774u = new ArrayList();
        this.f32772s = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        va.o oVar = new va.o(this);
        o oVar2 = (o) oVar.f36148d;
        a8.a aVar = oVar2.f32764k;
        if (aVar != null) {
            aVar.o(oVar);
        }
        Notification.Builder builder = (Notification.Builder) oVar.f36147c;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26 && i4 < 24) {
            builder.setExtras((Bundle) oVar.g);
            Notification notificationBuild2 = builder.build();
            RemoteViews remoteViews = (RemoteViews) oVar.f36149e;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = (RemoteViews) oVar.f36150f;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            notificationBuild = notificationBuild2;
        } else {
            notificationBuild = builder.build();
        }
        RemoteViews remoteViews3 = oVar2.f32769p;
        if (remoteViews3 != null) {
            notificationBuild.contentView = remoteViews3;
        }
        if (aVar != null) {
            oVar2.f32764k.getClass();
        }
        if (aVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", aVar.r());
        }
        return notificationBuild;
    }

    public final void c() {
        this.f32773t.defaults = 8;
    }

    public final void d(int i4, boolean z3) {
        Notification notification = this.f32773t;
        if (z3) {
            notification.flags = i4 | notification.flags;
        } else {
            notification.flags = (~i4) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f32756a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.f899k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f901b = bitmap;
        this.f32762h = iconCompat;
    }

    public final void f() {
        Notification notification = this.f32773t;
        notification.sound = null;
        notification.audioStreamType = -1;
        notification.audioAttributes = n.a(n.d(n.c(n.b(), 4), 5));
    }

    public final void g(a8.a aVar) {
        if (this.f32764k != aVar) {
            this.f32764k = aVar;
            if (((o) aVar.f218b) != this) {
                aVar.f218b = this;
                g(aVar);
            }
        }
    }
}
