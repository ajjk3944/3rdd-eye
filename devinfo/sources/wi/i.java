package wi;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import b5.d0;
import b5.z;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f36764a;

    static {
        n0 n0Var = new n0(8);
        f36764a = n0Var;
        n0Var.put("android.permission.USE_SIP", 9);
        n0Var.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        n0Var.put("android.permission.READ_CALL_LOG", 16);
        n0Var.put("android.permission.WRITE_CALL_LOG", 16);
        n0Var.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        n0Var.put("android.permission.BODY_SENSORS", 20);
        n0Var.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        n0Var.put("android.permission.WRITE_SETTINGS", 23);
    }

    public static boolean a(Context context, String str) {
        int iNoteOp;
        Integer num = (Integer) f36764a.get(str);
        if (num != null && Build.VERSION.SDK_INT < num.intValue()) {
            return true;
        }
        if (!"Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
            return a.a.a(context, str) == 0;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return true;
        }
        try {
            iNoteOp = ((AppOpsManager) context.getSystemService("appops")).noteOp(strPermissionToOp, Process.myUid(), context.getPackageName());
        } catch (SecurityException unused) {
            iNoteOp = 2;
        }
        return iNoteOp == 0 && a.a.a(context, str) == 0;
    }

    public static boolean b(Context context, String... strArr) {
        for (String str : strArr) {
            if (!a(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static void c(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:com.liuzh.deviceinfo"));
        intent.setFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            intent.setData(null);
            try {
                context.startActivity(intent);
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean d(z zVar, String... strArr) {
        for (String str : strArr) {
            d0 d0Var = zVar.f1948v;
            if (d0Var != null ? r3.b.V(d0Var.f1769e, str) : false) {
                return true;
            }
        }
        return false;
    }
}
