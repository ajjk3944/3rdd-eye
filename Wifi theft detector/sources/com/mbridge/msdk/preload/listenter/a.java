package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a implements PreloadListener {

    /* renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f16488a;

    /* renamed from: b, reason: collision with root package name */
    private int f16489b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16490c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f16488a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f16490c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f16488a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f16488a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f16488a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f16488a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f16490c = z10;
    }
}
