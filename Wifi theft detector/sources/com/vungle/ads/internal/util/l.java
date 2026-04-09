package com.vungle.ads.internal.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l {

    @NotNull
    private static final String FILE_SCHEME = "file://";

    @Nullable
    private Executor ioExecutor;

    @NotNull
    public static final a Companion = new a(null);
    private static final String TAG = l.class.getSimpleName();

    @NotNull
    private static final l instance = new l();

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final l getInstance() {
            return l.instance;
        }

        private a() {
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: displayImage$lambda-0, reason: not valid java name */
    public static final void m385displayImage$lambda0(String str, l9.l onImageLoaded) {
        kotlin.jvm.internal.p.e(onImageLoaded, "$onImageLoaded");
        if (s9.r.J(str, "file://", false, 2, null)) {
            String strSubstring = str.substring(7);
            kotlin.jvm.internal.p.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strSubstring);
            if (bitmapDecodeFile != null) {
                onImageLoaded.invoke(bitmapDecodeFile);
                return;
            }
            p.a aVar = p.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.p.d(TAG2, "TAG");
            aVar.w(TAG2, "decode bitmap failed.");
        }
    }

    public final void displayImage(@Nullable final String str, @NotNull final l9.l onImageLoaded) {
        kotlin.jvm.internal.p.e(onImageLoaded, "onImageLoaded");
        if (this.ioExecutor == null) {
            p.a aVar = p.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.p.d(TAG2, "TAG");
            aVar.w(TAG2, "ImageLoader not initialized.");
            return;
        }
        if (str == null || str.length() == 0) {
            p.a aVar2 = p.Companion;
            String TAG3 = TAG;
            kotlin.jvm.internal.p.d(TAG3, "TAG");
            aVar2.w(TAG3, "the uri is required.");
            return;
        }
        Executor executor = this.ioExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.m385displayImage$lambda0(str, onImageLoaded);
                }
            });
        }
    }

    public final void getImageSize(@Nullable String str, @NotNull l9.p onImageSizeLoaded) {
        kotlin.jvm.internal.p.e(onImageSizeLoaded, "onImageSizeLoaded");
        if (str == null || str.length() == 0 || !s9.r.J(str, "file://", false, 2, null)) {
            p.a aVar = p.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.p.d(TAG2, "TAG");
            aVar.w(TAG2, "the valid uri is required.");
            return;
        }
        String strSubstring = str.substring(7);
        kotlin.jvm.internal.p.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strSubstring, options);
        onImageSizeLoaded.invoke(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final void init(@NotNull Executor ioExecutor) {
        kotlin.jvm.internal.p.e(ioExecutor, "ioExecutor");
        this.ioExecutor = ioExecutor;
    }
}
