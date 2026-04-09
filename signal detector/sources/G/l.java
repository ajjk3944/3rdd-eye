package G;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.apm.insight.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1489a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1493e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1494f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f1495g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f1496h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public m f1498k;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f1500m;

    /* renamed from: n, reason: collision with root package name */
    public String f1501n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1502o;

    /* renamed from: p, reason: collision with root package name */
    public final Notification f1503p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1504q;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1490b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1491c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1492d = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1497j = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1499l = false;

    public l(Context context, String str) {
        Notification notification = new Notification();
        this.f1503p = notification;
        this.f1489a = context;
        this.f1501n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.f1504q = new ArrayList();
        this.f1502o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Notification notificationBuild;
        Bundle bundle;
        c1.g gVar = new c1.g(this);
        l lVar = (l) gVar.f5898d;
        m mVar = lVar.f1498k;
        if (mVar != null) {
            mVar.c(gVar);
        }
        Notification.Builder builder = (Notification.Builder) gVar.f5897c;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            builder.setExtras((Bundle) gVar.f5899e);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (mVar != null) {
            lVar.f1498k.getClass();
        }
        if (mVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mVar.e());
        }
        return notificationBuild;
    }

    public final void c(Bitmap bitmap) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f1489a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.f5091k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f5093b = bitmap;
        this.f1496h = iconCompat;
    }

    public final void d(m mVar) {
        if (this.f1498k != mVar) {
            this.f1498k = mVar;
            if (((l) mVar.f1505a) != this) {
                mVar.f1505a = this;
                d(mVar);
            }
        }
    }
}
