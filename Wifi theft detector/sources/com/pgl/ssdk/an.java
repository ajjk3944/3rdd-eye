package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public class an {

    /* renamed from: a, reason: collision with root package name */
    public static int f19856a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static String f19857b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f19858c = "api16-access-ttp.tiktokpangle.us";

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f19859d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* renamed from: e, reason: collision with root package name */
    private static int f19860e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public static String f19861f = "";

    public static String a() {
        return f19856a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f19861f;
    }

    public static void a(int i10) {
        f19856a = i10;
    }

    public static void b(String str) {
        f19861f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f19857b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f19857b)) {
            au.a("updateIndex");
            int i10 = f19860e;
            if (i10 < Integer.MAX_VALUE) {
                int i11 = i10 + 1;
                f19860e = i11;
                ax.b(context, "domain_index", i11);
                return;
            }
            f19860e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f19857b)) {
            return f19857b;
        }
        try {
            if (f19860e == Integer.MIN_VALUE) {
                f19860e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f19859d;
            return strArr[f19860e % strArr.length];
        } catch (Throwable unused) {
            return f19858c;
        }
    }
}
