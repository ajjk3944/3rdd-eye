package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r00 {

    /* renamed from: a, reason: collision with root package name */
    public final o00 f15493a;

    /* renamed from: b, reason: collision with root package name */
    public final qd0 f15494b;

    public r00(o00 o00Var, qd0 qd0Var) {
        this.f15493a = o00Var;
        this.f15494b = qd0Var;
    }

    public final void a(Context context, za.a aVar) {
        pk pkVar = sk.f16160hf;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
            AbstractExecutorService threadPoolExecutor = fx.f11274a;
            if (((Boolean) rkVar2.a(sk.f16202kf)).booleanValue()) {
                q00 q00Var = new q00(((Integer) rkVar2.a(sk.f16233mf)).intValue());
                int iIntValue = ((Integer) rkVar2.a(sk.f16218lf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), q00Var);
            }
            threadPoolExecutor.execute(new d1(this, context, aVar, 5));
        }
    }
}
