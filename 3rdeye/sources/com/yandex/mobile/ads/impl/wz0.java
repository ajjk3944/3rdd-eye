package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2099t;
import java.util.List;

/* loaded from: classes3.dex */
public final class wz0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f35132a = C2099t.f18581b;

    public static boolean a(Context context, String adapterName) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adapterName, "adapterName");
        return !f35132a.contains(adapterName) || s80.a(context, r80.f32550d);
    }
}
