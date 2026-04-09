package defpackage;

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
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xh0 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public f74 k;
    public Bundle m;
    public String n;
    public final boolean o;
    public final Notification p;
    public final ArrayList q;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final boolean j = true;
    public boolean l = false;

    public xh0(Context context, String str) {
        Notification notification = new Notification();
        this.p = notification;
        this.a = context;
        this.n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.q = new ArrayList();
        this.o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        p21 p21Var = new p21();
        new ArrayList();
        p21Var.i = new Bundle();
        p21Var.h = this;
        Context context = this.a;
        p21Var.f = context;
        Notification.Builder builderA = ci0.a(context, this.n);
        p21Var.g = builderA;
        Notification notification = this.p;
        Context context2 = null;
        int i3 = 0;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        IconCompat iconCompat = this.h;
        ai0.b(builderA, iconCompat == null ? null : b20.c(iconCompat, context));
        builderA.setSubText(null).setUsesChronometer(false).setPriority(this.i);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            sh0 sh0Var = (sh0) obj;
            if (sh0Var.b == null && (i2 = sh0Var.e) != 0) {
                sh0Var.b = IconCompat.a(i2);
            }
            IconCompat iconCompat2 = sh0Var.b;
            boolean z = sh0Var.c;
            Bundle bundle2 = sh0Var.a;
            Notification.Action.Builder builderA2 = ai0.a(iconCompat2 != null ? b20.c(iconCompat2, context2) : context2, sh0Var.f, sh0Var.g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            bi0.a(builderA2, z);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                di0.b(builderA2, 0);
            }
            if (i5 >= 29) {
                ei0.c(builderA2, false);
            }
            if (i5 >= 31) {
                fi0.a(builderA2, false);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", sh0Var.d);
            yh0.b(builderA2, bundle3);
            yh0.a((Notification.Builder) p21Var.g, yh0.d(builderA2));
            context2 = null;
        }
        Bundle bundle4 = this.m;
        if (bundle4 != null) {
            ((Bundle) p21Var.i).putAll(bundle4);
        }
        int i6 = Build.VERSION.SDK_INT;
        ((Notification.Builder) p21Var.g).setShowWhen(this.j);
        yh0.i((Notification.Builder) p21Var.g, this.l);
        yh0.g((Notification.Builder) p21Var.g, null);
        yh0.j((Notification.Builder) p21Var.g, null);
        yh0.h((Notification.Builder) p21Var.g, false);
        zh0.b((Notification.Builder) p21Var.g, null);
        zh0.c((Notification.Builder) p21Var.g, 0);
        zh0.f((Notification.Builder) p21Var.g, 0);
        zh0.d((Notification.Builder) p21Var.g, null);
        zh0.e((Notification.Builder) p21Var.g, notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.q;
        ArrayList arrayList4 = this.c;
        if (i6 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw ex0.e(it);
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    u8 u8Var = new u8(arrayList3.size() + arrayList.size());
                    u8Var.addAll(arrayList);
                    u8Var.addAll(arrayList3);
                    arrayList3 = new ArrayList(u8Var);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                zh0.a((Notification.Builder) p21Var.g, (String) obj2);
            }
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5.size() > 0) {
            if (this.m == null) {
                this.m = new Bundle();
            }
            Bundle bundle5 = this.m.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList5.size()) {
                String string = Integer.toString(i8);
                sh0 sh0Var2 = (sh0) arrayList5.get(i8);
                Bundle bundle8 = new Bundle();
                if (sh0Var2.b == null && (i = sh0Var2.e) != 0) {
                    sh0Var2.b = IconCompat.a(i);
                }
                IconCompat iconCompat3 = sh0Var2.b;
                Bundle bundle9 = sh0Var2.a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.b() : i3);
                bundle8.putCharSequence("title", sh0Var2.f);
                bundle8.putParcelable("actionIntent", sh0Var2.g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", sh0Var2.c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", sh0Var2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i8++;
                i3 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.m == null) {
                this.m = new Bundle();
            }
            this.m.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) p21Var.i).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i9 = Build.VERSION.SDK_INT;
        ((Notification.Builder) p21Var.g).setExtras(this.m);
        bi0.e((Notification.Builder) p21Var.g, null);
        ci0.b((Notification.Builder) p21Var.g, 0);
        ci0.e((Notification.Builder) p21Var.g, null);
        ci0.f((Notification.Builder) p21Var.g, null);
        ci0.g((Notification.Builder) p21Var.g, 0L);
        ci0.d((Notification.Builder) p21Var.g, 0);
        if (!TextUtils.isEmpty(this.n)) {
            ((Notification.Builder) p21Var.g).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i9 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                throw ex0.e(it2);
            }
        }
        if (i9 >= 29) {
            ei0.a((Notification.Builder) p21Var.g, this.o);
            ei0.b((Notification.Builder) p21Var.g, null);
        }
        xh0 xh0Var = (xh0) p21Var.h;
        f74 f74Var = xh0Var.k;
        if (f74Var != null) {
            f74Var.j1(p21Var);
        }
        Notification notificationBuild = ((Notification.Builder) p21Var.g).build();
        if (f74Var != null) {
            xh0Var.k.getClass();
        }
        if (f74Var != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", f74Var.k1());
        }
        return notificationBuild;
    }

    public final void c(Bitmap bitmap) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
            }
        }
        PorterDuff.Mode mode = IconCompat.k;
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        this.h = iconCompat;
    }

    public final void d(f74 f74Var) {
        if (this.k != f74Var) {
            this.k = f74Var;
            if (((xh0) f74Var.g) != this) {
                f74Var.g = this;
                d(f74Var);
            }
        }
    }
}
