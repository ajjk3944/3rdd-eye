package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.InterfaceC1809b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1809b f45883a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f45884b;

    public f(InterfaceC1809b interfaceC1809b, ComponentName componentName) {
        this.f45883a = interfaceC1809b;
        this.f45884b = componentName;
    }

    public static boolean a(Context context, String str, h hVar) {
        hVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, hVar, 33);
    }

    public static String b(Context context, List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final i c(C5537a c5537a) {
        BinderC5541e binderC5541e = new BinderC5541e(c5537a);
        InterfaceC1809b interfaceC1809b = this.f45883a;
        try {
            if (interfaceC1809b.j(binderC5541e)) {
                return new i(interfaceC1809b, binderC5541e, this.f45884b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
