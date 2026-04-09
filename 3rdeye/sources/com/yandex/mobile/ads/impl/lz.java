package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.xv0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class lz implements x30 {

    /* renamed from: c, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends w30>> f30132c;

    /* renamed from: a, reason: collision with root package name */
    private final qm.a f30133a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f30134b;

    static {
        SparseArray<Constructor<? extends w30>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, a(Class.forName("com.monetization.ads.exo.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f30132c = sparseArray;
    }

    public lz(qm.a aVar, ExecutorService executorService) {
        this.f30133a = (qm.a) zf.a(aVar);
        this.f30134b = (Executor) zf.a(executorService);
    }

    public final w30 a(v30 v30Var) {
        int iA = s82.a(v30Var.f34314c, v30Var.f34315d);
        if (iA != 0 && iA != 1 && iA != 2) {
            if (iA == 4) {
                return new wl1(new xv0.a().a(v30Var.f34314c).a(v30Var.f34318g).a(), this.f30133a, this.f30134b);
            }
            throw new IllegalArgumentException(fe.a("Unsupported type: ", iA));
        }
        Constructor<? extends w30> constructor = f30132c.get(iA);
        if (constructor == null) {
            throw new IllegalStateException(fe.a("Module missing for content type ", iA));
        }
        try {
            return constructor.newInstance(new xv0.a().a(v30Var.f34314c).a(v30Var.f34316e).a(v30Var.f34318g).a(), this.f30133a, this.f30134b);
        } catch (Exception unused) {
            throw new IllegalStateException(fe.a("Failed to instantiate downloader for content type ", iA));
        }
    }

    private static Constructor<? extends w30> a(Class<?> cls) {
        try {
            return cls.asSubclass(w30.class).getConstructor(xv0.class, qm.a.class, Executor.class);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("Downloader constructor missing", e4);
        }
    }
}
