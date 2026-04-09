package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2188yh {

    /* renamed from: a, reason: collision with root package name */
    public final C1972uh f17739a;

    /* renamed from: b, reason: collision with root package name */
    public final C0784Vn f17740b;

    public C2188yh(C1972uh c1972uh, C0784Vn c0784Vn) {
        this.f17739a = c1972uh;
        this.f17740b = c0784Vn;
    }

    public final void a(Context context, C2951a c2951a) {
        E9 e9 = H9.ff;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        if (((Boolean) g9.a(e9)).booleanValue()) {
            AbstractExecutorService threadPoolExecutor = AbstractC0640Nf.f10005a;
            if (((Boolean) g92.a(H9.hf)).booleanValue()) {
                ThreadFactoryC2134xh threadFactoryC2134xh = new ThreadFactoryC2134xh(((Integer) g92.a(H9.kf)).intValue());
                int iIntValue = ((Integer) g92.a(H9.jf)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryC2134xh);
            }
            threadPoolExecutor.execute(new RunnableC0912b0(this, context, c2951a, 5));
        }
    }
}
