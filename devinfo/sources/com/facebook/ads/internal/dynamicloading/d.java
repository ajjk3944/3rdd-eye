package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultithreadedBundleWrapper f8918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f8919d;

    public d(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z3) {
        this.f8916a = context;
        this.f8917b = z3;
        this.f8918c = multithreadedBundleWrapper;
        this.f8919d = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2;
        DynamicLoader dynamicLoader;
        int i4;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f8916a);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoaderDoMakeLoader = null;
            th2 = null;
            int i10 = 0;
            while (i10 < 3) {
                try {
                    dynamicLoaderDoMakeLoader = DynamicLoaderFactory.doMakeLoader(this.f8916a, false);
                    break;
                } finally {
                    if (i10 == i4) {
                        try {
                        } catch (Throwable th3) {
                        }
                    }
                }
            }
            dynamicLoader = dynamicLoaderDoMakeLoader;
        }
        DynamicLoaderFactory.doCallInitialize(this.f8916a, dynamicLoader, th2, this.f8917b, this.f8918c, this.f8919d);
        DynamicLoaderFactory.sInitializing.set(false);
    }
}
