package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.util.BlackScreenDetector;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.TTL;

/* loaded from: classes3.dex */
public final class BlackScreenDetector {
    private static final int BLACK_PIXEL_THRESHOLD = 10;
    private static final double BLACK_SCREEN_MARGIN_PERCENTAGE = 0.1d;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "BlackScreenDetector";

    @Nullable
    private volatile l9.p callback;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly8/s;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25701 extends Lambda implements l9.a {
        final /* synthetic */ y8.h $executors$delegate;
        final /* synthetic */ l9.l $onComplete;
        final /* synthetic */ View $view;
        final /* synthetic */ Window $window;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25701(View view, y8.h hVar, BlackScreenDetector blackScreenDetector, Window window, l9.l lVar) {
            super(0);
            this.$view = view;
            this.$executors$delegate = hVar;
            this.this$0 = blackScreenDetector;
            this.$window = window;
            this.$onComplete = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m379invoke$lambda0(int i10, int i11, BlackScreenDetector this$0, Window window, Rect rect, l9.l onComplete) {
            Bitmap bitmapCreateBitmap;
            kotlin.jvm.internal.p.e(this$0, "this$0");
            kotlin.jvm.internal.p.e(rect, "$rect");
            kotlin.jvm.internal.p.e(onComplete, "$onComplete");
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            } catch (Throwable th) {
                th = th;
                bitmapCreateBitmap = null;
            }
            try {
                this$0.executePixelCopyRequest(window, rect, bitmapCreateBitmap, onComplete);
            } catch (Throwable th2) {
                th = th2;
                p.Companion.e(BlackScreenDetector.TAG, "Bitmap creation failed", th);
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                onComplete.invoke(null);
            }
        }

        @Override // l9.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m380invoke();
            return y8.s.f25199a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m380invoke() {
            final int width = this.$view.getWidth();
            final int height = this.$view.getHeight();
            int[] iArr = new int[2];
            this.$view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            final Rect rect = new Rect(i10, i11, i10 + width, i11 + height);
            VungleThreadPoolExecutor jobExecutor = BlackScreenDetector.m376captureViewWithPixelCopy$lambda0(this.$executors$delegate).getJobExecutor();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final Window window = this.$window;
            final l9.l lVar = this.$onComplete;
            jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C25701.m379invoke$lambda0(width, height, blackScreenDetector, window, rect, lVar);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Ly8/s;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.vungle.ads.internal.util.BlackScreenDetector$start$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25711 extends Lambda implements l9.l {
        final /* synthetic */ int $samplingFactor;
        final /* synthetic */ View $view;
        final /* synthetic */ BlackScreenDetector this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25711(View view, BlackScreenDetector blackScreenDetector, int i10) {
            super(1);
            this.$view = view;
            this.this$0 = blackScreenDetector;
            this.$samplingFactor = i10;
        }

        /* renamed from: invoke$lambda-0, reason: not valid java name */
        private static final com.vungle.ads.internal.executor.a m381invoke$lambda0(y8.h hVar) {
            return (com.vungle.ads.internal.executor.a) hVar.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-1, reason: not valid java name */
        public static final void m382invoke$lambda1(BlackScreenDetector this$0, Bitmap bitmap, int i10) {
            kotlin.jvm.internal.p.e(this$0, "this$0");
            try {
                Pair<Integer, String> pairProcessBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i10);
                int iIntValue = ((Number) pairProcessBitmapForBlackScreen$vungle_ads_release.getFirst()).intValue();
                String str = (String) pairProcessBitmapForBlackScreen$vungle_ads_release.getSecond();
                l9.p pVar = this$0.callback;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(iIntValue), str);
                }
            } catch (Throwable th) {
                try {
                    p.Companion.e(BlackScreenDetector.TAG, "Black screen detection failed", th);
                    l9.p pVar2 = this$0.callback;
                    if (pVar2 != null) {
                        pVar2.invoke(-1, "Internal calculation error: " + th.getMessage());
                    }
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                } finally {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this$0.callback = null;
                }
            }
        }

        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Bitmap) obj);
            return y8.s.f25199a;
        }

        public final void invoke(@Nullable final Bitmap bitmap) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            final Context context = this.$view.getContext();
            kotlin.jvm.internal.p.d(context, "view.context");
            VungleThreadPoolExecutor jobExecutor = m381invoke$lambda0(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$invoke$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.executor.a invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.executor.a.class);
                }
            })).getJobExecutor();
            final BlackScreenDetector blackScreenDetector = this.this$0;
            final int i10 = this.$samplingFactor;
            jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    BlackScreenDetector.C25711.m382invoke$lambda1(blackScreenDetector, bitmap, i10);
                }
            });
        }
    }

    private final int calculateBlackScreenPercentageWithMargin(Bitmap bitmap, double d10, int i10, double d11) {
        int i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = (int) (width * d10);
        int i13 = (int) (height * d10);
        int i14 = width - (i12 * 2);
        int i15 = height - (i13 * 2);
        if (i14 <= 0 || i15 <= 0) {
            return -1;
        }
        long j10 = i14 * i15;
        if (j10 > TTL.MAX_VALUE) {
            if (d10 >= d11) {
                return -1;
            }
            return calculateBlackScreenPercentageWithMargin(bitmap, d10 * 2, i10, d11);
        }
        int i16 = (int) j10;
        int[] iArr = new int[i16];
        bitmap.getPixels(iArr, 0, i14, i12, i13, i14, i15);
        int i17 = i16 - 1;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i10 + '.');
        }
        int iB = f9.c.b(0, i17, i10);
        int i18 = 0;
        if (iB >= 0) {
            int i19 = 0;
            i11 = 0;
            while (true) {
                i18++;
                int i20 = iArr[i19];
                int i21 = (i20 >> 24) & 255;
                int i22 = (i20 >> 16) & 255;
                int i23 = (i20 >> 8) & 255;
                int i24 = i20 & 255;
                if (i21 > 0 && i22 < 10 && i23 < 10 && i24 < 10) {
                    i11++;
                }
                if (i19 == iB) {
                    break;
                }
                i19 += i10;
            }
        } else {
            i11 = 0;
        }
        if (i18 > 0) {
            return (int) ((i11 * 100) / i18);
        }
        return 0;
    }

    public static /* synthetic */ int calculateBlackScreenPercentageWithMargin$default(BlackScreenDetector blackScreenDetector, Bitmap bitmap, double d10, int i10, double d11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 100;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            d11 = 0.5d;
        }
        return blackScreenDetector.calculateBlackScreenPercentageWithMargin(bitmap, d10, i12, d11);
    }

    private final void captureViewWithCanvas(final View view, final l9.l lVar) {
        v.INSTANCE.runOnUiThread(new l9.a() { // from class: com.vungle.ads.internal.util.BlackScreenDetector.captureViewWithCanvas.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m378invoke();
                return y8.s.f25199a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m378invoke() {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    view.draw(new Canvas(bitmapCreateBitmap));
                    lVar.invoke(bitmapCreateBitmap);
                } catch (Throwable th) {
                    p.Companion.e(BlackScreenDetector.TAG, "Bitmap capture failed", th);
                    lVar.invoke(null);
                }
            }
        });
    }

    @RequiresApi(26)
    private final void captureViewWithPixelCopy(View view, l9.l lVar) {
        Activity activity = getActivity(view.getContext());
        Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            p.Companion.w(TAG, "Activity/Window not found for PixelCopy");
            lVar.invoke(null);
        } else {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            final Context context = view.getContext();
            kotlin.jvm.internal.p.d(context, "view.context");
            v.INSTANCE.runOnUiThread(new C25701(view, kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.a, java.lang.Object] */
                @Override // l9.a
                @NotNull
                public final com.vungle.ads.internal.executor.a invoke() {
                    return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.executor.a.class);
                }
            }), this, window, lVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: captureViewWithPixelCopy$lambda-0, reason: not valid java name */
    public static final com.vungle.ads.internal.executor.a m376captureViewWithPixelCopy$lambda0(y8.h hVar) {
        return (com.vungle.ads.internal.executor.a) hVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(26)
    public final void executePixelCopyRequest(Window window, Rect rect, final Bitmap bitmap, final l9.l lVar) {
        try {
            PixelCopy.request(window, rect, bitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.b
                public final void onPixelCopyFinished(int i10) {
                    BlackScreenDetector.m377executePixelCopyRequest$lambda1(lVar, bitmap, i10);
                }
            }, new Handler(Looper.getMainLooper()));
        } catch (Throwable th) {
            p.Companion.e(TAG, "PixelCopy request failed", th);
            bitmap.recycle();
            lVar.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: executePixelCopyRequest$lambda-1, reason: not valid java name */
    public static final void m377executePixelCopyRequest$lambda1(l9.l onComplete, Bitmap bitmap, int i10) {
        kotlin.jvm.internal.p.e(onComplete, "$onComplete");
        kotlin.jvm.internal.p.e(bitmap, "$bitmap");
        if (i10 == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        p.Companion.w(TAG, "PixelCopy failed: " + i10);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    private final Activity getActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    @VisibleForTesting
    public final void captureViewBitmapAsync$vungle_ads_release(@NotNull View view, @NotNull l9.l onComplete) {
        kotlin.jvm.internal.p.e(view, "view");
        kotlin.jvm.internal.p.e(onComplete, "onComplete");
        if (this.callback == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            captureViewWithPixelCopy(view, onComplete);
        } else {
            captureViewWithCanvas(view, onComplete);
        }
    }

    @VisibleForTesting
    @NotNull
    public final Pair<Integer, String> processBitmapForBlackScreen$vungle_ads_release(@Nullable Bitmap bitmap, int i10) {
        if (bitmap != null) {
            int iCalculateBlackScreenPercentageWithMargin$default = calculateBlackScreenPercentageWithMargin$default(this, bitmap, 0.1d, i10, 0.0d, 8, null);
            return new Pair<>(Integer.valueOf(iCalculateBlackScreenPercentageWithMargin$default), iCalculateBlackScreenPercentageWithMargin$default == -1 ? "Internal calculation error" : "");
        }
        p.Companion.w(TAG, "Black screen detection failed: Snapshot capture failure");
        return new Pair<>(-1, "Snapshot capture failure");
    }

    public final void start(@Nullable View view, int i10, @NotNull l9.p callback) {
        kotlin.jvm.internal.p.e(callback, "callback");
        this.callback = callback;
        if (view != null) {
            captureViewBitmapAsync$vungle_ads_release(view, new C25711(view, this, i10));
            return;
        }
        p.Companion.w(TAG, "Black screen detection failed: View not available");
        l9.p pVar = this.callback;
        if (pVar != null) {
            pVar.invoke(-1, "View not available");
        }
        this.callback = null;
    }

    public final void stop() {
        this.callback = null;
    }
}
