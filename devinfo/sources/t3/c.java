package t3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.liuzh.deviceinfo.DeviceInfoApp;
import j$.util.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile b f34162a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile ArrayList f34163b;

    public static void a(DeviceInfoApp deviceInfoApp, List list) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat;
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT <= 32) {
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).getClass();
            }
            list = arrayList;
        }
        if (Build.VERSION.SDK_INT <= 29) {
            ArrayList arrayList2 = new ArrayList(list);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                a aVar = (a) obj;
                IconCompat iconCompat2 = aVar.f34161f;
                if (iconCompat2 != null) {
                    int i10 = iconCompat2.f900a;
                    if (i10 == 6 || i10 == 4) {
                        InputStream inputStreamF = iconCompat2.f(deviceInfoApp);
                        if (inputStreamF != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamF)) != null) {
                            if (i10 == 6) {
                                iconCompat = new IconCompat(5);
                                iconCompat.f901b = bitmapDecodeStream;
                            } else {
                                iconCompat = new IconCompat(1);
                                iconCompat.f901b = bitmapDecodeStream;
                            }
                            aVar.f34161f = iconCompat;
                        }
                    }
                }
                list.remove(aVar);
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((a) it2.next()).a());
            }
            if (!((ShortcutManager) deviceInfoApp.getSystemService(ShortcutManager.class)).addDynamicShortcuts(arrayList3)) {
                return;
            }
        }
        c(deviceInfoApp).getClass();
        Iterator it3 = ((ArrayList) b(deviceInfoApp)).iterator();
        if (it3.hasNext()) {
            throw u.o(it3);
        }
    }

    public static List b(Context context) {
        Bundle bundle;
        String string;
        if (f34163b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, c.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (f34163b == null) {
                f34163b = arrayList;
            }
        }
        return f34163b;
    }

    public static b c(Context context) {
        if (f34162a == null) {
            try {
                f34162a = (b) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, c.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f34162a == null) {
                f34162a = new b();
            }
        }
        return f34162a;
    }

    public static void d(DeviceInfoApp deviceInfoApp) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) deviceInfoApp.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        c(deviceInfoApp).getClass();
        Iterator it = ((ArrayList) b(deviceInfoApp)).iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
    }
}
