package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class ml {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f30427a;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final Bitmap f30428b;

        /* renamed from: c, reason: collision with root package name */
        private final b f30429c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f30430d;

        /* renamed from: e, reason: collision with root package name */
        private final sl f30431e;

        public a(Bitmap originalBitmap, zo1 listener, Handler handler, sl blurredBitmapProvider) {
            kotlin.jvm.internal.l.f(originalBitmap, "originalBitmap");
            kotlin.jvm.internal.l.f(listener, "listener");
            kotlin.jvm.internal.l.f(handler, "handler");
            kotlin.jvm.internal.l.f(blurredBitmapProvider, "blurredBitmapProvider");
            this.f30428b = originalBitmap;
            this.f30429c = listener;
            this.f30430d = handler;
            this.f30431e = blurredBitmapProvider;
        }

        private final void a(Bitmap bitmap) {
            this.f30430d.post(new I2(0, this, bitmap));
        }

        @Override // java.lang.Runnable
        public final void run() {
            sl slVar = this.f30431e;
            Bitmap bitmap = this.f30428b;
            slVar.getClass();
            a(sl.a(bitmap, 0.1d));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a this$0, Bitmap blurredBitmap) {
            kotlin.jvm.internal.l.f(this$0, "this$0");
            kotlin.jvm.internal.l.f(blurredBitmap, "$blurredBitmap");
            this$0.f30429c.a(blurredBitmap);
        }
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public ml() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.l.e(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f30427a = executorServiceNewSingleThreadExecutor;
    }

    public final void a(Bitmap bitmap, zo1 listener) {
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f30427a.execute(new a(bitmap, listener, new Handler(Looper.getMainLooper()), new sl()));
    }
}
