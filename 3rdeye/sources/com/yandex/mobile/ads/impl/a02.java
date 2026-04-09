package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class a02 {

    /* renamed from: a, reason: collision with root package name */
    private final d02 f24356a = new d02();

    /* renamed from: b, reason: collision with root package name */
    private final li f24357b = new li();

    /* renamed from: c, reason: collision with root package name */
    private final vk f24358c = new vk();

    /* renamed from: d, reason: collision with root package name */
    private c02 f24359d;

    public final void a(ImageView view) {
        kotlin.jvm.internal.l.f(view, "view");
        view.removeOnLayoutChangeListener(this.f24359d);
    }

    public final void a(Bitmap originalBitmap, ImageView view, jj0 imageValue) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        kotlin.jvm.internal.l.f(originalBitmap, "originalBitmap");
        c02 c02Var = new c02(this.f24357b, this.f24358c, this.f24356a, imageValue, originalBitmap);
        this.f24359d = c02Var;
        view.addOnLayoutChangeListener(c02Var);
        if (view.getLayoutParams().width == -1 || view.getLayoutParams().height == -1 || view.getLayoutParams().width == -2 || view.getLayoutParams().height == -2) {
            view.setImageBitmap(originalBitmap);
        }
    }
}
