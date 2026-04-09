package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import b9.C1992A;
import com.vungle.ads.internal.util.k;
import java.util.concurrent.Executor;

/* compiled from: ImageLoader.kt */
/* loaded from: classes2.dex */
public final class h {
    private static final String FILE_SCHEME = "file://";
    private Executor ioExecutor;
    private final LruCache<String, Bitmap> lruCache = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
    public static final b Companion = new b(null);
    private static final String TAG = h.class.getSimpleName();
    private static final h instance = new h();

    /* compiled from: ImageLoader.kt */
    public static final class a extends LruCache<String, Bitmap> {
        public a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap value) {
            kotlin.jvm.internal.l.f(value, "value");
            return value.getByteCount() / 1024;
        }
    }

    /* compiled from: ImageLoader.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final h getInstance() {
            return h.instance;
        }

        private b() {
        }
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m113displayImage$lambda0(String str, h this$0, p9.l onImageLoaded) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(onImageLoaded, "$onImageLoaded");
        if (y9.n.a0(str, "file://", false)) {
            Bitmap bitmap = this$0.lruCache.get(str);
            if (bitmap != null && !bitmap.isRecycled()) {
                onImageLoaded.invoke(bitmap);
                return;
            }
            String strSubstring = str.substring(7);
            kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                this$0.lruCache.put(str, bitmapDecodeFile);
                onImageLoaded.invoke(bitmapDecodeFile);
            } else {
                k.a aVar = k.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.l.e(TAG2, "TAG");
                aVar.w(TAG2, "decode bitmap failed.");
            }
        }
    }

    public final void displayImage(String str, p9.l<? super Bitmap, C1992A> onImageLoaded) {
        kotlin.jvm.internal.l.f(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.l.e(TAG2, "TAG");
            aVar.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            k.a aVar2 = k.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.l.e(TAG3, "TAG");
            aVar2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new J4.e(str, this, onImageLoaded, 13));
        }
    }

    public final void init(Executor ioExecutor) {
        kotlin.jvm.internal.l.f(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
