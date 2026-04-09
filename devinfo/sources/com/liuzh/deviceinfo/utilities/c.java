package com.liuzh.deviceinfo.utilities;

import android.os.Environment;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21248a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f21249b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f21250c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f21251d;

    static {
        boolean z3 = d.f21252a;
        Locale locale = Locale.getDefault();
        f21248a = ("cn".equalsIgnoreCase(locale.getCountry()) || "zh".equalsIgnoreCase(locale.getLanguage())) ? "yyyy-MM-dd a hh:mm" : "dd/MM/yy hh:mm a";
        f21249b = h.b(Environment.getExternalStorageDirectory().getPath());
        f21250c = "https://sites.google.com/view/alphagroup-privacy";
        f21251d = "https://sites.google.com/view/alphagroup-service";
    }
}
