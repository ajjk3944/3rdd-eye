package y0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.util.ArrayList;
import java.util.Iterator;
import m0.C5309b;
import y0.v;
import y0.x;
import z0.C5848a;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47905a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f47906b;

    /* renamed from: c, reason: collision with root package name */
    public final o f47907c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f47908d;

    /* compiled from: NotificationCompatBuilder.java */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j4) {
            return builder.setTimeoutAfter(j4);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r7v38 */
    public r(o oVar) {
        ArrayList<v> arrayList;
        ?? r72;
        Bundle[] bundleArr;
        ArrayList<l> arrayList2;
        ArrayList<v> arrayList3;
        int i;
        ArrayList<String> arrayList4;
        boolean z10 = true;
        new ArrayList();
        this.f47908d = new Bundle();
        this.f47907c = oVar;
        Context context = oVar.f47885a;
        this.f47905a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f47906b = e.a(context, oVar.f47900q);
        } else {
            this.f47906b = new Notification.Builder(oVar.f47885a);
        }
        Notification notification = oVar.f47902s;
        Resources resources = null;
        int i10 = 2;
        int i11 = 0;
        this.f47906b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(oVar.f47889e).setContentText(oVar.f47890f).setContentInfo(null).setContentIntent(oVar.f47891g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(oVar.i).setProgress(0, 0, false);
        Notification.Builder builder = this.f47906b;
        IconCompat iconCompat = oVar.f47892h;
        c.b(builder, iconCompat == null ? null : IconCompat.a.f(iconCompat, context));
        this.f47906b.setSubText(null).setUsesChronometer(false).setPriority(oVar.f47893j);
        q qVar = oVar.f47895l;
        if (qVar instanceof p) {
            p pVar = (p) qVar;
            int color = C5848a.getColor(pVar.f47904a.f47885a, R.color.call_notification_decline_color);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) pVar.f47904a.f47885a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), 0, spannableStringBuilder.length(), 18);
            Context context2 = pVar.f47904a.f47885a;
            PorterDuff.Mode mode = IconCompat.f15491k;
            context2.getClass();
            IconCompat iconCompatB = IconCompat.b(context2.getResources(), context2.getPackageName(), com.yandex.mobile.ads.R.drawable.ic_call_decline);
            Bundle bundle = new Bundle();
            CharSequence charSequenceB = o.b(spannableStringBuilder);
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            l lVar = new l(iconCompatB, charSequenceB, null, bundle, arrayList6.isEmpty() ? null : (x[]) arrayList6.toArray(new x[arrayList6.size()]), arrayList5.isEmpty() ? null : (x[]) arrayList5.toArray(new x[arrayList5.size()]));
            lVar.f47873a.putBoolean("key_action_priority", true);
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(lVar);
            ArrayList<l> arrayList8 = pVar.f47904a.f47886b;
            if (arrayList8 != null) {
                Iterator<l> it = arrayList8.iterator();
                while (it.hasNext()) {
                    l next = it.next();
                    next.getClass();
                    if (!next.f47873a.getBoolean("key_action_priority") && i10 > 1) {
                        arrayList7.add(next);
                        i10--;
                    }
                }
            }
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                a((l) it2.next());
            }
        } else {
            Iterator<l> it3 = oVar.f47886b.iterator();
            while (it3.hasNext()) {
                a(it3.next());
            }
        }
        Bundle bundle2 = oVar.f47897n;
        if (bundle2 != null) {
            this.f47908d.putAll(bundle2);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f47906b.setShowWhen(oVar.f47894k);
        a.i(this.f47906b, oVar.f47896m);
        a.g(this.f47906b, null);
        a.j(this.f47906b, null);
        a.h(this.f47906b, false);
        b.b(this.f47906b, null);
        b.c(this.f47906b, oVar.f47898o);
        b.f(this.f47906b, oVar.f47899p);
        b.d(this.f47906b, null);
        b.e(this.f47906b, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList9 = oVar.f47903t;
        ArrayList<v> arrayList10 = oVar.f47887c;
        String str = "";
        if (i12 < 28) {
            if (arrayList10 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList<>(arrayList10.size());
                Iterator<v> it4 = arrayList10.iterator();
                while (it4.hasNext()) {
                    v next2 = it4.next();
                    String str2 = next2.f47913c;
                    if (str2 == null) {
                        CharSequence charSequence = next2.f47911a;
                        if (charSequence != null) {
                            str2 = "name:" + ((Object) charSequence);
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList4.add(str2);
                }
            }
            if (arrayList4 != null) {
                if (arrayList9 == null) {
                    arrayList9 = arrayList4;
                } else {
                    C5309b c5309b = new C5309b(arrayList9.size() + arrayList4.size());
                    c5309b.addAll(arrayList4);
                    c5309b.addAll(arrayList9);
                    arrayList9 = new ArrayList<>(c5309b);
                }
            }
        }
        if (arrayList9 != null && !arrayList9.isEmpty()) {
            Iterator<String> it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                b.a(this.f47906b, it5.next());
            }
        }
        ArrayList<l> arrayList11 = oVar.f47888d;
        if (arrayList11.size() > 0) {
            if (oVar.f47897n == null) {
                oVar.f47897n = new Bundle();
            }
            Bundle bundle3 = oVar.f47897n.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i13 = 0;
            while (i13 < arrayList11.size()) {
                String string = Integer.toString(i13);
                boolean z11 = z10;
                l lVar2 = arrayList11.get(i13);
                Bundle bundle6 = new Bundle();
                if (lVar2.f47874b == null && (i = lVar2.f47878f) != 0) {
                    lVar2.f47874b = IconCompat.b(resources, str, i);
                }
                IconCompat iconCompat2 = lVar2.f47874b;
                bundle6.putInt("icon", iconCompat2 != null ? iconCompat2.c() : i11);
                bundle6.putCharSequence(AppIntroBaseFragmentKt.ARG_TITLE, lVar2.f47879g);
                bundle6.putParcelable("actionIntent", lVar2.f47880h);
                Bundle bundle7 = lVar2.f47873a;
                Bundle bundle8 = bundle7 != null ? new Bundle(bundle7) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", lVar2.f47876d);
                bundle6.putBundle("extras", bundle8);
                x[] xVarArr = lVar2.f47875c;
                if (xVarArr == null) {
                    arrayList2 = arrayList11;
                    arrayList3 = arrayList10;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[xVarArr.length];
                    arrayList2 = arrayList11;
                    arrayList3 = arrayList10;
                    int i14 = 0;
                    while (i14 < xVarArr.length) {
                        x xVar = xVarArr[i14];
                        int i15 = i14;
                        Bundle bundle9 = new Bundle();
                        xVar.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        bundleArr[i15] = bundle9;
                        i14 = i15 + 1;
                        str = str;
                        xVarArr = xVarArr;
                    }
                }
                String str3 = str;
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", lVar2.f47877e);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(string, bundle6);
                i13++;
                z10 = z11;
                arrayList11 = arrayList2;
                arrayList10 = arrayList3;
                str = str3;
                resources = null;
                i11 = 0;
            }
            arrayList = arrayList10;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (oVar.f47897n == null) {
                oVar.f47897n = new Bundle();
            }
            oVar.f47897n.putBundle("android.car.EXTENSIONS", bundle3);
            this.f47908d.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList10;
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            this.f47906b.setExtras(oVar.f47897n);
            r72 = 0;
            d.e(this.f47906b, null);
        } else {
            r72 = 0;
        }
        if (i16 >= 26) {
            e.b(this.f47906b, 0);
            e.e(this.f47906b, r72);
            e.f(this.f47906b, r72);
            e.g(this.f47906b, 0L);
            e.d(this.f47906b, 0);
            if (!TextUtils.isEmpty(oVar.f47900q)) {
                this.f47906b.setSound(r72).setDefaults(0).setLights(0, 0, 0).setVibrate(r72);
            }
        }
        if (i16 >= 28) {
            Iterator<v> it6 = arrayList.iterator();
            while (it6.hasNext()) {
                v next3 = it6.next();
                Notification.Builder builder2 = this.f47906b;
                next3.getClass();
                f.a(builder2, v.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            g.a(this.f47906b, oVar.f47901r);
            g.b(this.f47906b, null);
        }
    }

    public final void a(l lVar) {
        int i;
        if (lVar.f47874b == null && (i = lVar.f47878f) != 0) {
            lVar.f47874b = IconCompat.b(null, "", i);
        }
        IconCompat iconCompat = lVar.f47874b;
        Notification.Action.Builder builderA = c.a(iconCompat != null ? IconCompat.a.f(iconCompat, null) : null, lVar.f47879g, lVar.f47880h);
        x[] xVarArr = lVar.f47875c;
        if (xVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[xVarArr.length];
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                xVarArr[i10].getClass();
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    x.a.b(builderAddExtras, 0);
                }
                remoteInputArr[i10] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = lVar.f47873a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z10 = lVar.f47876d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            d.a(builderA, z10);
        }
        bundle2.putInt("android.support.action.semanticAction", 0);
        if (i11 >= 28) {
            f.b(builderA, 0);
        }
        if (i11 >= 29) {
            g.c(builderA, false);
        }
        if (i11 >= 31) {
            h.a(builderA, false);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", lVar.f47877e);
        a.b(builderA, bundle2);
        a.a(this.f47906b, a.d(builderA));
    }
}
