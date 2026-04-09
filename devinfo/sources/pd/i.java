package pd;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import cl.u;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import qd.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final u f31732e = new u("AppUpdateService", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final Intent f31733f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    public final n f31734a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31735b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f31736c;

    /* renamed from: d, reason: collision with root package name */
    public final j f31737d;

    public i(Context context, j jVar) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f31735b = context.getPackageName();
        this.f31736c = context;
        this.f31737d = jVar;
        u uVar = qd.a.f32240a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    u uVar2 = qd.a.f32240a;
                    Object[] objArr = new Object[0];
                    uVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.w("PlayCore", u.e(uVar2.f2942b, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
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
                    this.f31734a = new n(applicationContext != null ? applicationContext : context, f31732e, f31733f);
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
        HashMap map2 = qd.h.f32247a;
        synchronized (qd.h.class) {
            try {
                HashMap map3 = qd.h.f32247a;
                if (!map3.containsKey("app_update")) {
                    HashMap map4 = new HashMap();
                    map4.put("java", 11004);
                    map3.put("app_update", map4);
                }
                map = (Map) map3.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle3.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle3.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle3.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle2.putAll(bundle3);
        bundle2.putInt("playcore.version.code", 11004);
        bundle.putAll(bundle2);
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(iVar.f31736c.getPackageManager().getPackageInfo(iVar.f31736c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            u uVar = f31732e;
            Object[] objArr = new Object[0];
            uVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", u.e(uVar.f2942b, "The current version of the app could not be retrieved", objArr));
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }
}
