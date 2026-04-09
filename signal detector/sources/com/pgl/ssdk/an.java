package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class an {

    /* renamed from: a, reason: collision with root package name */
    public static int f19598a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static String f19599b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f19600c = "api16-access-ttp.tiktokpangle.us";

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f19601d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* renamed from: e, reason: collision with root package name */
    private static int f19602e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public static String f19603f = "";

    public static String a() {
        return f19598a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f19603f;
    }

    public static void a(int i) {
        f19598a = i;
    }

    public static void b(String str) {
        f19603f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f19599b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f19599b)) {
            au.a("updateIndex");
            int i = f19602e;
            if (i < Integer.MAX_VALUE) {
                int i3 = i + 1;
                f19602e = i3;
                ax.b(context, "domain_index", i3);
                return;
            }
            f19602e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f19599b)) {
            return f19599b;
        }
        try {
            if (f19602e == Integer.MIN_VALUE) {
                f19602e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f19601d;
            return strArr[f19602e % strArr.length];
        } catch (Throwable unused) {
            return f19600c;
        }
    }
}
