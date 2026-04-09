package com.staircase3.opensignal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f6191a = new HashMap();

    public static SharedPreferences.Editor a(Context context) {
        return c(context).edit();
    }

    public static int b(Context context) {
        return c(context).getInt("filtered_network_id", 0);
    }

    public static SharedPreferences c(Context context) {
        HashMap map = f6191a;
        WeakReference weakReference = (WeakReference) map.get("default");
        if (weakReference != null && weakReference.get() != null) {
            return (SharedPreferences) weakReference.get();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("default", 0);
        map.put("default", new WeakReference(sharedPreferences));
        return sharedPreferences;
    }

    public static boolean d(Context context) {
        return c(context).getBoolean("network_type_2G_3G_selected", true);
    }

    public static boolean e(Context context) {
        return c(context).getBoolean("network_type_4G_selected", true);
    }

    public static boolean f(Context context) {
        return c(context).getBoolean("network_type_5G_selected", true);
    }

    public static void g(Context context, String str) {
        a(context).putString("network_name", str).apply();
    }

    public static void h(Context context, String str) {
        a(context).putString("network_opensignal_id", str).commit();
    }
}
