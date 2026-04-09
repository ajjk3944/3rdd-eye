package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class an {

    /* renamed from: a, reason: collision with root package name */
    public static int f21470a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static String f21471b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f21472c = "api16-access-ttp.tiktokpangle.us";

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f21473d = {"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};

    /* renamed from: e, reason: collision with root package name */
    private static int f21474e = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public static String f21475f = "";

    public static String a() {
        return f21470a == 1 ? "VA" : "SG";
    }

    public static String b() {
        return f21475f;
    }

    public static void a(int i4) {
        f21470a = i4;
    }

    public static void b(String str) {
        f21475f = str;
    }

    public static void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f21471b = str;
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(f21471b)) {
            au.a("updateIndex");
            int i4 = f21474e;
            if (i4 < Integer.MAX_VALUE) {
                int i10 = i4 + 1;
                f21474e = i10;
                ax.b(context, "domain_index", i10);
                return;
            }
            f21474e = 0;
        }
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f21471b)) {
            return f21471b;
        }
        try {
            if (f21474e == Integer.MIN_VALUE) {
                f21474e = ax.a(context, "domain_index", 0);
            }
            String[] strArr = f21473d;
            return strArr[f21474e % strArr.length];
        } catch (Throwable unused) {
            return f21472c;
        }
    }
}
