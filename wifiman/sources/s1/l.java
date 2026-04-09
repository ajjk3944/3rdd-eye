package s1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C7011b;
import s1.k;

/* loaded from: classes.dex */
class l implements j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f61102a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f61103b;

    /* renamed from: c, reason: collision with root package name */
    private final k.d f61104c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f61105d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f61106e;

    /* renamed from: f, reason: collision with root package name */
    private final List f61107f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f61108g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f61109h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f61110i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    static class f {
        static Notification.Action.Builder a(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    l(k.d dVar) {
        int i10;
        this.f61104c = dVar;
        Context context = dVar.f61072a;
        this.f61102a = context;
        Notification.Builder builderA = e.a(context, dVar.f61061K);
        this.f61103b = builderA;
        Notification notification = dVar.f61068R;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f61080i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f61076e).setContentText(dVar.f61077f).setContentInfo(dVar.f61082k).setContentIntent(dVar.f61078g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f61079h, (notification.flags & 128) != 0).setNumber(dVar.f61083l).setProgress(dVar.f61091t, dVar.f61092u, dVar.f61093v);
        IconCompat iconCompat = dVar.f61081j;
        c.b(builderA, iconCompat == null ? null : iconCompat.j(context));
        builderA.setSubText(dVar.f61088q).setUsesChronometer(dVar.f61086o).setPriority(dVar.f61084m);
        Iterator it = dVar.f61073b.iterator();
        while (it.hasNext()) {
            b((k.a) it.next());
        }
        Bundle bundle = dVar.f61054D;
        if (bundle != null) {
            this.f61108g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f61105d = dVar.f61058H;
        this.f61106e = dVar.f61059I;
        this.f61103b.setShowWhen(dVar.f61085n);
        a.g(this.f61103b, dVar.f61097z);
        a.e(this.f61103b, dVar.f61094w);
        a.h(this.f61103b, dVar.f61096y);
        a.f(this.f61103b, dVar.f61095x);
        this.f61109h = dVar.f61065O;
        b.b(this.f61103b, dVar.f61053C);
        b.c(this.f61103b, dVar.f61055E);
        b.f(this.f61103b, dVar.f61056F);
        b.d(this.f61103b, dVar.f61057G);
        b.e(this.f61103b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(f(dVar.f61074c), dVar.f61071U) : dVar.f61071U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                b.a(this.f61103b, (String) it2.next());
            }
        }
        this.f61110i = dVar.f61060J;
        if (dVar.f61075d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < dVar.f61075d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), m.a((k.a) dVar.f61075d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f61108g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = dVar.f61070T;
        if (obj != null) {
            c.c(this.f61103b, obj);
        }
        this.f61103b.setExtras(dVar.f61054D);
        d.e(this.f61103b, dVar.f61090s);
        RemoteViews remoteViews = dVar.f61058H;
        if (remoteViews != null) {
            d.c(this.f61103b, remoteViews);
        }
        RemoteViews remoteViews2 = dVar.f61059I;
        if (remoteViews2 != null) {
            d.b(this.f61103b, remoteViews2);
        }
        RemoteViews remoteViews3 = dVar.f61060J;
        if (remoteViews3 != null) {
            d.d(this.f61103b, remoteViews3);
        }
        e.b(this.f61103b, dVar.f61062L);
        e.e(this.f61103b, dVar.f61089r);
        e.f(this.f61103b, dVar.f61063M);
        e.g(this.f61103b, dVar.f61064N);
        e.d(this.f61103b, dVar.f61065O);
        if (dVar.f61052B) {
            e.c(this.f61103b, dVar.f61051A);
        }
        if (!TextUtils.isEmpty(dVar.f61061K)) {
            this.f61103b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i13 >= 28) {
            Iterator it3 = dVar.f61074c.iterator();
            if (it3.hasNext()) {
                AbstractC5487d.a(it3.next());
                throw null;
            }
        }
        if (i13 >= 29) {
            g.a(this.f61103b, dVar.f61067Q);
            g.b(this.f61103b, k.c.a(null));
        }
        if (i13 >= 31 && (i10 = dVar.f61066P) != 0) {
            h.b(this.f61103b, i10);
        }
        if (dVar.f61069S) {
            if (this.f61104c.f61095x) {
                this.f61109h = 2;
            } else {
                this.f61109h = 1;
            }
            this.f61103b.setVibrate(null);
            this.f61103b.setSound(null);
            int i14 = notification.defaults & (-4);
            notification.defaults = i14;
            this.f61103b.setDefaults(i14);
            if (TextUtils.isEmpty(this.f61104c.f61094w)) {
                a.e(this.f61103b, "silent");
            }
            e.d(this.f61103b, this.f61109h);
        }
    }

    private void b(k.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.i() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : s.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.a(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f61103b, a.d(builderA));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C7011b c7011b = new C7011b(list.size() + list2.size());
        c7011b.addAll(list);
        c7011b.addAll(list2);
        return new ArrayList(c7011b);
    }

    private static List f(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC5487d.a(it.next());
        throw null;
    }

    @Override // s1.j
    public Notification.Builder a() {
        return this.f61103b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        k.e eVar = this.f61104c.f61087p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews remoteViewsE = eVar != null ? eVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f61104c.f61058H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (eVar != null && (remoteViewsD = eVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (eVar != null && (remoteViewsF = this.f61104c.f61087p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (eVar != null && (bundleA = k.a(notificationD)) != null) {
            eVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.f61103b.build();
    }
}
