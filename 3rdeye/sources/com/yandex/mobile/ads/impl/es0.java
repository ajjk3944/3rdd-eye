package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class es0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, cs0> f26996a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26997b = 0;

    public static final cs0 a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return a(context, "YadPreferenceFile");
    }

    public static final cs0 a(Context context, String filename) {
        cs0 cs0VarPutIfAbsent;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(filename, "filename");
        ConcurrentHashMap<String, cs0> concurrentHashMap = f26996a;
        cs0 ds0Var = concurrentHashMap.get(filename);
        if (ds0Var == null && (cs0VarPutIfAbsent = concurrentHashMap.putIfAbsent(filename, (ds0Var = new ds0(context, filename, new qx1())))) != null) {
            ds0Var = cs0VarPutIfAbsent;
        }
        return ds0Var;
    }
}
