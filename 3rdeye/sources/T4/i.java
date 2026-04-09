package t4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import u4.C5632a;
import u4.l;
import u4.u;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final l f46416e = new l("AppUpdateService");

    /* renamed from: f, reason: collision with root package name */
    public static final Intent f46417f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final u f46418a;

    /* renamed from: b, reason: collision with root package name */
    public final String f46419b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f46420c;

    /* renamed from: d, reason: collision with root package name */
    public final j f46421d;

    public i(Context context, j jVar) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f46419b = context.getPackageName();
        this.f46420c = context;
        this.f46421d = jVar;
        l lVar = C5632a.f46564a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    l lVar2 = C5632a.f46564a;
                    lVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", l.b(lVar2.f46572a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.f46418a = new u(applicationContext != null ? applicationContext : context, f46416e, f46417f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(i iVar, String str) {
        Map map;
        Integer numValueOf;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = new Bundle();
        HashMap map2 = u4.j.f46571a;
        synchronized (u4.j.class) {
            try {
                HashMap map3 = u4.j.f46571a;
                if (!map3.containsKey("app_update")) {
                    HashMap map4 = new HashMap();
                    map4.put("java", 11004);
                    map3.put("app_update", map4);
                }
                map = (Map) map3.get("app_update");
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey(PluginErrorDetails.Platform.UNITY)) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get(PluginErrorDetails.Platform.UNITY)).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(iVar.f46420c.getPackageManager().getPackageInfo(iVar.f46420c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            l lVar = f46416e;
            Object[] objArr = new Object[0];
            lVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", l.b(lVar.f46572a, "The current version of the app could not be retrieved", objArr));
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }
}
