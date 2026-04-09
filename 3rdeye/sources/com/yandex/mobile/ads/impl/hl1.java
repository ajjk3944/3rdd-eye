package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
public final class hl1 {

    /* renamed from: a, reason: collision with root package name */
    private final ya2 f28256a;

    /* renamed from: b, reason: collision with root package name */
    private final vi0 f28257b;

    public static final class a implements vi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f28258c = {fa.a(a.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), fa.a(a.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f28259a;

        /* renamed from: b, reason: collision with root package name */
        private final ao1 f28260b;

        public a(ImageView preview, ProgressBar progressBar) {
            kotlin.jvm.internal.l.f(preview, "preview");
            kotlin.jvm.internal.l.f(progressBar, "progressBar");
            this.f28259a = bo1.a(preview);
            this.f28260b = bo1.a(progressBar);
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        public final void a(Bitmap bitmap) {
            if (bitmap == null) {
                ProgressBar progressBar = (ProgressBar) this.f28260b.getValue(this, f28258c[1]);
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                }
                return;
            }
            ao1 ao1Var = this.f28259a;
            w9.i<?>[] iVarArr = f28258c;
            ImageView imageView = (ImageView) ao1Var.getValue(this, iVarArr[0]);
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
            } else {
                ProgressBar progressBar2 = (ProgressBar) this.f28260b.getValue(this, iVarArr[1]);
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
            }
        }
    }

    public hl1(ya2 video, vi0 imageForPresentProvider) {
        kotlin.jvm.internal.l.f(video, "video");
        kotlin.jvm.internal.l.f(imageForPresentProvider, "imageForPresentProvider");
        this.f28256a = video;
        this.f28257b = imageForPresentProvider;
    }

    public final void a(ne2 placeholderView) {
        kotlin.jvm.internal.l.f(placeholderView, "placeholderView");
        ImageView imageViewA = placeholderView.a();
        ProgressBar progressBarB = placeholderView.b();
        if (imageViewA == null || this.f28256a.a() == null) {
            progressBarB.setVisibility(0);
        } else {
            this.f28257b.a(this.f28256a.a(), new a(imageViewA, progressBarB));
        }
    }
}
