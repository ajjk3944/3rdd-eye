package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import b9.C1992A;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
public final class q80 implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final vi0 f32099a;

    /* renamed from: b, reason: collision with root package name */
    private final ag<jj0> f32100b;

    /* renamed from: c, reason: collision with root package name */
    private final eg f32101c;

    public static final class a implements vi0.b {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f32102b = {fa.a(a.class, "faviconView", "getFaviconView()Landroid/widget/ImageView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f32103a;

        public a(ImageView faviconView) {
            kotlin.jvm.internal.l.f(faviconView, "faviconView");
            this.f32103a = bo1.a(faviconView);
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        public final void a(Bitmap bitmap) {
            C1992A c1992a;
            ImageView imageView;
            ImageView imageView2;
            if (bitmap == null || (imageView2 = (ImageView) this.f32103a.getValue(this, f32102b[0])) == null) {
                c1992a = null;
            } else {
                imageView2.setImageBitmap(bitmap);
                imageView2.setVisibility(0);
                c1992a = C1992A.f18074a;
            }
            if (c1992a != null || (imageView = (ImageView) this.f32103a.getValue(this, f32102b[0])) == null) {
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public q80(vi0 imageProvider, ag<jj0> agVar, eg clickConfigurator) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(clickConfigurator, "clickConfigurator");
        this.f32099a = imageProvider;
        this.f32100b = agVar;
        this.f32101c = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        ImageView imageViewG = uiElements.g();
        if (imageViewG != null) {
            ag<jj0> agVar = this.f32100b;
            C1992A c1992a = null;
            jj0 jj0VarD = agVar != null ? agVar.d() : null;
            if (jj0VarD != null) {
                this.f32099a.a(jj0VarD, new a(imageViewG));
                c1992a = C1992A.f18074a;
            }
            if (c1992a == null) {
                imageViewG.setVisibility(8);
            }
            this.f32101c.a(imageViewG, this.f32100b);
        }
    }
}
