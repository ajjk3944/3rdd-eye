package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import f0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2463a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f2464b;

    /* renamed from: c, reason: collision with root package name */
    public final NotificationCompat.l f2465c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteViews f2466d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteViews f2467e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2468f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2469g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public int f2470h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f2471i;

    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    public static class C0015a {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        public static Notification.Action.Builder c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        @DoNotInline
        public static String f(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        @DoNotInline
        public static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        @DoNotInline
        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @DoNotInline
        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    public static class c {
        @DoNotInline
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        @DoNotInline
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class e {
        @DoNotInline
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        @DoNotInline
        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @DoNotInline
        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @DoNotInline
        public static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    public static class f {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        @DoNotInline
        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    public static class g {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @DoNotInline
        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class h {
        @DoNotInline
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    public a(NotificationCompat.l lVar) {
        int i10;
        this.f2465c = lVar;
        Context context = lVar.f2415a;
        this.f2463a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2464b = e.a(context, lVar.K);
        } else {
            this.f2464b = new Notification.Builder(lVar.f2415a);
        }
        Notification notification = lVar.T;
        int i11 = 0;
        this.f2464b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, lVar.f2423i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(lVar.f2419e).setContentText(lVar.f2420f).setContentInfo(lVar.f2425k).setContentIntent(lVar.f2421g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(lVar.f2422h, (notification.flags & 128) != 0).setNumber(lVar.f2426l).setProgress(lVar.f2434t, lVar.f2435u, lVar.f2436v);
        Notification.Builder builder = this.f2464b;
        IconCompat iconCompat = lVar.f2424j;
        c.b(builder, iconCompat == null ? null : iconCompat.s(context));
        this.f2464b.setSubText(lVar.f2431q).setUsesChronometer(lVar.f2429o).setPriority(lVar.f2427m);
        ArrayList arrayList = lVar.f2416b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            b((NotificationCompat.Action) obj);
        }
        Bundle bundle = lVar.D;
        if (bundle != null) {
            this.f2469g.putAll(bundle);
        }
        int i13 = Build.VERSION.SDK_INT;
        this.f2466d = lVar.H;
        this.f2467e = lVar.I;
        this.f2464b.setShowWhen(lVar.f2428n);
        C0015a.i(this.f2464b, lVar.f2440z);
        C0015a.g(this.f2464b, lVar.f2437w);
        C0015a.j(this.f2464b, lVar.f2439y);
        C0015a.h(this.f2464b, lVar.f2438x);
        this.f2470h = lVar.P;
        b.b(this.f2464b, lVar.C);
        b.c(this.f2464b, lVar.E);
        b.f(this.f2464b, lVar.F);
        b.d(this.f2464b, lVar.G);
        b.e(this.f2464b, notification.sound, notification.audioAttributes);
        List listE = i13 < 28 ? e(g(lVar.f2417c), lVar.W) : lVar.W;
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                b.a(this.f2464b, (String) it.next());
            }
        }
        this.f2471i = lVar.J;
        if (lVar.f2418d.size() > 0) {
            Bundle bundle2 = lVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i14 = 0; i14 < lVar.f2418d.size(); i14++) {
                bundle4.putBundle(Integer.toString(i14), androidx.core.app.b.e((NotificationCompat.Action) lVar.f2418d.get(i14)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            lVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f2469g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i15 = Build.VERSION.SDK_INT;
        Object obj2 = lVar.V;
        if (obj2 != null) {
            c.c(this.f2464b, obj2);
        }
        if (i15 >= 24) {
            this.f2464b.setExtras(lVar.D);
            d.e(this.f2464b, lVar.f2433s);
            RemoteViews remoteViews = lVar.H;
            if (remoteViews != null) {
                d.c(this.f2464b, remoteViews);
            }
            RemoteViews remoteViews2 = lVar.I;
            if (remoteViews2 != null) {
                d.b(this.f2464b, remoteViews2);
            }
            RemoteViews remoteViews3 = lVar.J;
            if (remoteViews3 != null) {
                d.d(this.f2464b, remoteViews3);
            }
        }
        if (i15 >= 26) {
            e.b(this.f2464b, lVar.L);
            e.e(this.f2464b, lVar.f2432r);
            e.f(this.f2464b, lVar.M);
            e.g(this.f2464b, lVar.O);
            e.d(this.f2464b, lVar.P);
            if (lVar.B) {
                e.c(this.f2464b, lVar.A);
            }
            if (!TextUtils.isEmpty(lVar.K)) {
                this.f2464b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            ArrayList arrayList2 = lVar.f2417c;
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                f.a(this.f2464b, ((androidx.core.app.c) obj3).i());
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 29) {
            g.a(this.f2464b, lVar.R);
            g.b(this.f2464b, NotificationCompat.k.k(lVar.S));
            h0.a aVar = lVar.N;
            if (aVar != null) {
                g.d(this.f2464b, aVar.b());
            }
        }
        if (i16 >= 31 && (i10 = lVar.Q) != 0) {
            h.b(this.f2464b, i10);
        }
        if (lVar.U) {
            if (this.f2465c.f2438x) {
                this.f2470h = 2;
            } else {
                this.f2470h = 1;
            }
            this.f2464b.setVibrate(null);
            this.f2464b.setSound(null);
            int i17 = notification.defaults & (-4);
            notification.defaults = i17;
            this.f2464b.setDefaults(i17);
            if (i16 >= 26) {
                if (TextUtils.isEmpty(this.f2465c.f2437w)) {
                    C0015a.g(this.f2464b, NotificationCompat.GROUP_KEY_SILENT);
                }
                e.d(this.f2464b, this.f2470h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        r.b bVar = new r.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.core.app.c) it.next()).h());
        }
        return arrayList;
    }

    @Override // f0.o
    public Notification.Builder a() {
        return this.f2464b;
    }

    public final void b(NotificationCompat.Action action) {
        IconCompat iconCompatD = action.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.r() : null, action.h(), action.a());
        if (action.e() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.b(action.e())) {
                C0015a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = action.c() != null ? new Bundle(action.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", action.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            d.a(builderA, action.b());
        }
        bundle.putInt("android.support.action.semanticAction", action.f());
        if (i10 >= 28) {
            f.b(builderA, action.f());
        }
        if (i10 >= 29) {
            g.c(builderA, action.j());
        }
        if (i10 >= 31) {
            h.a(builderA, action.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.g());
        C0015a.b(builderA, bundle);
        C0015a.a(this.f2464b, C0015a.d(builderA));
    }

    public Notification c() {
        Bundle extras;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        NotificationCompat.m mVar = this.f2465c.f2430p;
        if (mVar != null) {
            mVar.b(this);
        }
        RemoteViews remoteViewsE = mVar != null ? mVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f2465c.H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (mVar != null && (remoteViewsD = mVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (mVar != null && (remoteViewsF = this.f2465c.f2430p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (mVar != null && (extras = NotificationCompat.getExtras(notificationD)) != null) {
            mVar.a(extras);
        }
        return notificationD;
    }

    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f2464b.build();
        }
        if (i10 >= 24) {
            Notification notificationBuild = this.f2464b.build();
            if (this.f2470h != 0) {
                if (C0015a.f(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.f2470h == 2) {
                    h(notificationBuild);
                }
                if (C0015a.f(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.f2470h == 1) {
                    h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f2464b.setExtras(this.f2469g);
        Notification notificationBuild2 = this.f2464b.build();
        RemoteViews remoteViews = this.f2466d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f2467e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f2471i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f2470h != 0) {
            if (C0015a.f(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && this.f2470h == 2) {
                h(notificationBuild2);
            }
            if (C0015a.f(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && this.f2470h == 1) {
                h(notificationBuild2);
            }
        }
        return notificationBuild2;
    }

    public Context f() {
        return this.f2463a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
