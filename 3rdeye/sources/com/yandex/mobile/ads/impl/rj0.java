package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class rj0 extends ig2<ImageView, jj0> {

    /* renamed from: c, reason: collision with root package name */
    private final ej0 f32668c;

    /* renamed from: d, reason: collision with root package name */
    private final vi0 f32669d;

    /* renamed from: e, reason: collision with root package name */
    private final nj0 f32670e;

    /* renamed from: f, reason: collision with root package name */
    private final a02 f32671f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rj0(ImageView imageView, ej0 ej0Var, a8 a8Var) {
        Context context = imageView.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        this(imageView, ej0Var, a8Var, new vi0(context, new t81(a8Var), ej0Var), new nj0(ej0Var), new a02());
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(View view) {
        ImageView view2 = (ImageView) view;
        kotlin.jvm.internal.l.f(view2, "view");
        view2.setImageDrawable(null);
        this.f32671f.a(view2);
        super.a((rj0) view2);
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, jj0 jj0Var) {
        ImageView view2 = (ImageView) view;
        jj0 imageValue = jj0Var;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        a(imageValue);
    }

    public final void a(ImageView view) {
        kotlin.jvm.internal.l.f(view, "view");
        view.setImageDrawable(null);
        this.f32671f.a(view);
        super.a((rj0) view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(ImageView view, ej0 imageProvider, a8<?> adResponse, vi0 imageForPresentProvider, nj0 imageValueValidator, a02 smartCenterImageRenderer) {
        super(view);
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(imageForPresentProvider, "imageForPresentProvider");
        kotlin.jvm.internal.l.f(imageValueValidator, "imageValueValidator");
        kotlin.jvm.internal.l.f(smartCenterImageRenderer, "smartCenterImageRenderer");
        this.f32668c = imageProvider;
        this.f32669d = imageForPresentProvider;
        this.f32670e = imageValueValidator;
        this.f32671f = smartCenterImageRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, jj0 jj0Var) {
        ImageView imageView = (ImageView) view;
        jj0 imageValue = jj0Var;
        kotlin.jvm.internal.l.f(imageView, "imageView");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        return this.f32670e.a(imageView.getDrawable(), imageValue);
    }

    public final void a(ImageView view, jj0 imageValue) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        a(imageValue);
    }

    private final void a(jj0 jj0Var) {
        this.f32669d.a(jj0Var, new C.e0(12, this, jj0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rj0 this$0, jj0 imageValue, Bitmap bitmap) {
        ImageView imageViewB;
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(imageValue, "$imageValue");
        if (bitmap == null || (imageViewB = this$0.b()) == null) {
            return;
        }
        if (imageValue.e() != null) {
            this$0.f32671f.a(bitmap, imageViewB, imageValue);
        } else {
            imageViewB.setImageBitmap(bitmap);
        }
    }
}
