package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
public final class p62 implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final vi0 f31616a;

    /* renamed from: b, reason: collision with root package name */
    private final ag<?> f31617b;

    /* renamed from: c, reason: collision with root package name */
    private final eg f31618c;

    public static final class a implements vi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f31619c = {fa.a(a.class, "trademarkView", "getTrademarkView()Landroid/widget/ImageView;", 0), fa.a(a.class, "delimiterView", "getDelimiterView()Landroid/widget/TextView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f31620a;

        /* renamed from: b, reason: collision with root package name */
        private final ao1 f31621b;

        public a(ImageView trademarkView, TextView textView) {
            kotlin.jvm.internal.l.f(trademarkView, "trademarkView");
            this.f31620a = bo1.a(trademarkView);
            this.f31621b = bo1.a(textView);
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                ao1 ao1Var = this.f31620a;
                w9.i<?>[] iVarArr = f31619c;
                ImageView imageView = (ImageView) ao1Var.getValue(this, iVarArr[0]);
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(0);
                }
                TextView textView = (TextView) this.f31621b.getValue(this, iVarArr[1]);
                if (textView == null) {
                    return;
                }
                textView.setVisibility(0);
            }
        }
    }

    public p62(vi0 imageProvider, ag<?> agVar, eg assetClickConfigurator) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(assetClickConfigurator, "assetClickConfigurator");
        this.f31616a = imageProvider;
        this.f31617b = agVar;
        this.f31618c = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        ImageView imageViewR = uiElements.r();
        TextView textViewQ = uiElements.q();
        if (imageViewR != null) {
            ag<?> agVar = this.f31617b;
            Object objD = agVar != null ? agVar.d() : null;
            jj0 jj0Var = objD instanceof jj0 ? (jj0) objD : null;
            if (jj0Var != null) {
                this.f31616a.a(jj0Var, new a(imageViewR, textViewQ));
            }
            this.f31618c.a(imageViewR, this.f31617b);
        }
    }
}
