package com.liuzh.deviceinfo.utilities;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f21261a = {"B", "KB", "MB", "GB"};

    static {
        new SimpleDateFormat(c.f21248a, Locale.getDefault());
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        int iLastIndexOf = str.lastIndexOf("/");
        return iLastIndexOf < 0 ? str : str.substring(iLastIndexOf + 1);
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
    }

    public static String c(String str) {
        if (str == null) {
            str = null;
        } else {
            while (str.startsWith("/")) {
                str = str.substring(1);
            }
        }
        return b(str);
    }
}
