package com.bytedance.sdk.component.utils;

import a0.g;
import android.text.TextUtils;
import android.util.Log;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ko {

    /* renamed from: lh, reason: collision with root package name */
    private static com.bytedance.sdk.component.ouw f7632lh = null;
    private static boolean ouw = false;
    private static int vt = 4;
    private static String yu = "";

    public static void fkw(String str, String str2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw && str2 != null && vt <= 6) {
            Log.e(fkw(str), str2);
        }
    }

    public static void lh() {
        ouw = false;
        vt = 7;
    }

    public static void ouw(String str) {
        yu = str;
    }

    public static void vt() {
        ouw = true;
        vt = 3;
    }

    public static boolean yu() {
        return ouw;
    }

    public static boolean ouw() {
        return vt <= 3;
    }

    public static void yu(String str, String str2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw && str2 != null && vt <= 5) {
            Log.w(fkw(str), str2);
        }
    }

    public static void lh(String str, String str2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw && str2 != null && vt <= 4) {
            Log.i(fkw(str), str2);
        }
    }

    public static void ouw(String str, String str2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw && str2 != null && vt <= 2) {
            Log.v(fkw(str), str2);
        }
    }

    public static void vt(String str) {
        if (ouw) {
            vt("Logger", str);
        }
    }

    public static void vt(String str, String str2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw && str2 != null && vt <= 3) {
            Log.d(fkw(str), str2);
        }
    }

    public static String fkw(String str) {
        return TextUtils.isEmpty(yu) ? str : ouw(g.p(new StringBuilder("["), yu, "]-[", str, "]"));
    }

    public static void yu(String str) {
        if (ouw) {
            fkw("Logger", str);
        }
    }

    public static void lh(String str) {
        if (ouw) {
            yu("Logger", str);
        }
    }

    public static void ouw(String str, String str2, Throwable th2) {
        if (f7632lh != null) {
            fkw(str);
            Log.getStackTraceString(th2);
        }
        if (ouw) {
            if (!(str2 == null && th2 == null) && vt <= 3) {
                Log.d(fkw(str), str2, th2);
            }
        }
    }

    public static void yu(String str, Object... objArr) {
        if (f7632lh != null) {
            fkw(str);
            ouw(objArr);
        }
        if (ouw && vt <= 6) {
            Log.e(fkw(str), ouw(objArr));
        }
    }

    public static void lh(String str, Object... objArr) {
        if (f7632lh != null) {
            fkw(str);
            ouw(objArr);
        }
        if (ouw && vt <= 5) {
            Log.w(fkw(str), ouw(objArr));
        }
    }

    public static void vt(String str, Object... objArr) {
        if (f7632lh != null) {
            fkw(str);
            ouw(objArr);
        }
        if (ouw && vt <= 4) {
            Log.i(fkw(str), ouw(objArr));
        }
    }

    public static void ouw(String str, Object... objArr) {
        if (f7632lh != null) {
            fkw(str);
            ouw(objArr);
        }
        if (ouw && vt <= 3) {
            Log.d(fkw(str), ouw(objArr));
        }
    }

    public static void lh(String str, String str2, Throwable th2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw) {
            if (!(str2 == null && th2 == null) && vt <= 6) {
                Log.e(fkw(str), str2, th2);
            }
        }
    }

    public static void vt(String str, String str2, Throwable th2) {
        if (f7632lh != null) {
            fkw(str);
        }
        if (ouw) {
            if (!(str2 == null && th2 == null) && vt <= 5) {
                Log.w(fkw(str), str2, th2);
            }
        }
    }

    public static void ouw(String str, String str2, String str3, Throwable th2) {
        if (ouw) {
            if (!TextUtils.isEmpty(yu)) {
                str = ouw(h.E(str2, "]-[", str));
            }
            vt(str, str3, th2);
        }
    }

    private static String ouw(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(" ");
            }
            return sb2.toString();
        }
        return "";
    }
}
