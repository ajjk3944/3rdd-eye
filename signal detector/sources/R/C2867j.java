package r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: r.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2867j {

    /* renamed from: a, reason: collision with root package name */
    public final b.d f23316a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f23317b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23318c;

    public C2867j(b.d dVar, ComponentName componentName, Context context) {
        this.f23316a = dVar;
        this.f23317b = componentName;
        this.f23318c = context;
    }

    public static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final c1.g b(AbstractC2858a abstractC2858a) {
        b.d dVar = this.f23316a;
        BinderC2862e binderC2862e = new BinderC2862e(abstractC2858a);
        try {
            if (((b.b) dVar).g0(binderC2862e)) {
                return new c1.g(dVar, binderC2862e, this.f23317b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
