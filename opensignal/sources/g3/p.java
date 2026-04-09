package g3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9305a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9309e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f9310f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f9311g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f9312h;

    /* renamed from: i, reason: collision with root package name */
    public int f9313i;
    public int j;

    /* renamed from: l, reason: collision with root package name */
    public androidx.lifecycle.o f9314l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f9316n;

    /* renamed from: q, reason: collision with root package name */
    public String f9319q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9320r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f9321s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f9322t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9306b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9307c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9308d = new ArrayList();
    public boolean k = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9315m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f9317o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f9318p = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f9321s = notification;
        this.f9305a = context;
        this.f9319q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f9322t = new ArrayList();
        this.f9320r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        int i11;
        kg.r rVar = new kg.r();
        new ArrayList();
        rVar.f14398r = new Bundle();
        rVar.f14397g = this;
        Context context = this.f9305a;
        rVar.f14395a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            rVar.f14396d = q.a(context, this.f9319q);
        } else {
            rVar.f14396d = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) rVar.f14396d;
        Notification notification = this.f9321s;
        Resources resources = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f9309e).setContentText(this.f9310f).setContentInfo(null).setContentIntent(this.f9311g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.f9313i).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) rVar.f14396d;
        IconCompat iconCompat = this.f9312h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.g(context));
        ((Notification.Builder) rVar.f14396d).setSubText(null).setUsesChronometer(false).setPriority(this.j);
        Iterator it = this.f9306b.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.f9295b == null && (i11 = jVar.f9298e) != 0) {
                jVar.f9295b = IconCompat.b(null, "", i11);
            }
            IconCompat iconCompat2 = jVar.f9295b;
            boolean z10 = jVar.f9296c;
            Bundle bundle2 = jVar.f9294a;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.g(null) : null, jVar.f9299f, jVar.f9300g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z10);
            int i12 = Build.VERSION.SDK_INT;
            builder3.setAllowGeneratedReplies(z10);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i12 >= 28) {
                r.a(builder3);
            }
            if (i12 >= 29) {
                f.d(builder3);
            }
            if (i12 >= 31) {
                s.a(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", jVar.f9297d);
            builder3.addExtras(bundle3);
            ((Notification.Builder) rVar.f14396d).addAction(builder3.build());
        }
        Bundle bundle4 = this.f9316n;
        if (bundle4 != null) {
            ((Bundle) rVar.f14398r).putAll(bundle4);
        }
        int i13 = Build.VERSION.SDK_INT;
        ((Notification.Builder) rVar.f14396d).setShowWhen(this.k);
        ((Notification.Builder) rVar.f14396d).setLocalOnly(this.f9315m);
        ((Notification.Builder) rVar.f14396d).setGroup(null);
        ((Notification.Builder) rVar.f14396d).setSortKey(null);
        ((Notification.Builder) rVar.f14396d).setGroupSummary(false);
        ((Notification.Builder) rVar.f14396d).setCategory(null);
        ((Notification.Builder) rVar.f14396d).setColor(this.f9317o);
        ((Notification.Builder) rVar.f14396d).setVisibility(this.f9318p);
        ((Notification.Builder) rVar.f14396d).setPublicVersion(null);
        ((Notification.Builder) rVar.f14396d).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f9322t;
        ArrayList arrayList3 = this.f9307c;
        if (i13 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw w.g.d(it2);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    u.f fVar = new u.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) rVar.f14396d).addPerson((String) it3.next());
            }
        }
        ArrayList arrayList4 = this.f9308d;
        if (arrayList4.size() > 0) {
            if (this.f9316n == null) {
                this.f9316n = new Bundle();
            }
            Bundle bundle5 = this.f9316n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList4.size()) {
                String string = Integer.toString(i14);
                j jVar2 = (j) arrayList4.get(i14);
                Bundle bundle8 = new Bundle();
                if (jVar2.f9295b == null && (i10 = jVar2.f9298e) != 0) {
                    jVar2.f9295b = IconCompat.b(resources, "", i10);
                }
                IconCompat iconCompat3 = jVar2.f9295b;
                Bundle bundle9 = jVar2.f9294a;
                ArrayList arrayList5 = arrayList4;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", jVar2.f9299f);
                bundle8.putParcelable("actionIntent", jVar2.f9300g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", jVar2.f9296c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", jVar2.f9297d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i14++;
                arrayList4 = arrayList5;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f9316n == null) {
                this.f9316n = new Bundle();
            }
            this.f9316n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) rVar.f14398r).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) rVar.f14396d).setExtras(this.f9316n);
        ((Notification.Builder) rVar.f14396d).setRemoteInputHistory(null);
        if (i15 >= 26) {
            q.b((Notification.Builder) rVar.f14396d);
            q.d((Notification.Builder) rVar.f14396d);
            q.e((Notification.Builder) rVar.f14396d);
            q.f((Notification.Builder) rVar.f14396d);
            q.c((Notification.Builder) rVar.f14396d);
            if (!TextUtils.isEmpty(this.f9319q)) {
                ((Notification.Builder) rVar.f14396d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator it4 = arrayList3.iterator();
            if (it4.hasNext()) {
                throw w.g.d(it4);
            }
        }
        if (i15 >= 29) {
            f.b((Notification.Builder) rVar.f14396d, this.f9320r);
            f.c((Notification.Builder) rVar.f14396d);
        }
        p pVar = (p) rVar.f14397g;
        androidx.lifecycle.o oVar = pVar.f9314l;
        if (oVar != null) {
            oVar.X0(rVar);
        }
        Notification.Builder builder4 = (Notification.Builder) rVar.f14396d;
        Notification notificationBuild = Build.VERSION.SDK_INT >= 26 ? builder4.build() : builder4.build();
        if (oVar != null) {
            pVar.f9314l.getClass();
        }
        if (oVar != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", oVar.d1());
        }
        return notificationBuild;
    }

    public final void c(boolean z10) {
        Notification notification = this.f9321s;
        if (z10) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f9305a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(f3.b.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(f3.b.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1223b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f9312h = iconCompat;
    }

    public final void e(androidx.lifecycle.o oVar) {
        if (this.f9314l != oVar) {
            this.f9314l = oVar;
            if (((p) oVar.f1504d) != this) {
                oVar.f1504d = this;
                e(oVar);
            }
        }
    }
}
