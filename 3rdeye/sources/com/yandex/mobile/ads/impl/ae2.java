package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.y60;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class ae2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile t30 f24630a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f24631b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24632c = 0;

    private static t30 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        y12 y12Var = new y12(applicationContext);
        y60 y60VarA = y60.a.a();
        kotlin.jvm.internal.l.c(applicationContext);
        mm cache = y60VarA.a(applicationContext);
        jz.a aVar = new jz.a(applicationContext, new wu1(xs1.a()).a(applicationContext));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        kotlin.jvm.internal.l.c(executorServiceNewFixedThreadPool);
        kotlin.jvm.internal.l.f(cache, "cache");
        return new t30(applicationContext, new kz(y12Var, 0), new lz(new qm.a().a(cache).a(aVar), executorServiceNewFixedThreadPool));
    }

    public static t30 b(Context context) {
        t30 t30VarA;
        kotlin.jvm.internal.l.f(context, "context");
        t30 t30Var = f24630a;
        if (t30Var != null) {
            return t30Var;
        }
        synchronized (f24631b) {
            t30 t30Var2 = f24630a;
            if (t30Var2 != null) {
                return t30Var2;
            }
            try {
                t30VarA = a(context);
                f24630a = t30VarA;
            } catch (Throwable th) {
                th.toString();
                fp0.b(new Object[0]);
                t30VarA = null;
            }
            return t30VarA;
        }
    }
}
