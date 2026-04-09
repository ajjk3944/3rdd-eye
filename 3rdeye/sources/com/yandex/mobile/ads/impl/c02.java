package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public final class c02 implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final li f25479a;

    /* renamed from: b, reason: collision with root package name */
    private final vk f25480b;

    /* renamed from: c, reason: collision with root package name */
    private final d02 f25481c;

    /* renamed from: d, reason: collision with root package name */
    private final jj0 f25482d;

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f25483e;

    public c02(li axisBackgroundColorProvider, vk bestSmartCenterProvider, d02 smartCenterMatrixScaler, jj0 imageValue, Bitmap bitmap) {
        kotlin.jvm.internal.l.f(axisBackgroundColorProvider, "axisBackgroundColorProvider");
        kotlin.jvm.internal.l.f(bestSmartCenterProvider, "bestSmartCenterProvider");
        kotlin.jvm.internal.l.f(smartCenterMatrixScaler, "smartCenterMatrixScaler");
        kotlin.jvm.internal.l.f(imageValue, "imageValue");
        kotlin.jvm.internal.l.f(bitmap, "bitmap");
        this.f25479a = axisBackgroundColorProvider;
        this.f25480b = bestSmartCenterProvider;
        this.f25481c = smartCenterMatrixScaler;
        this.f25482d = imageValue;
        this.f25483e = bitmap;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ni niVarA;
        xz1 xz1VarB;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        boolean z10 = (i11 - i == i15 - i13 && i12 - i10 == i16 - i14) ? false : true;
        boolean z11 = (i12 == i10 || i == i11) ? false : true;
        if (z10 && z11) {
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == 0.0f) {
                return;
            }
            li liVar = this.f25479a;
            jj0 imageValue = this.f25482d;
            liVar.getClass();
            kotlin.jvm.internal.l.f(imageValue, "imageValue");
            f02 f02VarE = imageValue.e();
            if (f02VarE != null && (niVarA = f02VarE.a()) != null) {
                boolean z12 = (niVarA.a() == null || niVarA.d() == null || !kotlin.jvm.internal.l.b(niVarA.a(), niVarA.d())) ? false : true;
                boolean z13 = (niVarA.b() == null || niVarA.c() == null || !kotlin.jvm.internal.l.b(niVarA.b(), niVarA.c())) ? false : true;
                if (z12 || z13) {
                    li liVar2 = this.f25479a;
                    jj0 jj0Var = this.f25482d;
                    liVar2.getClass();
                    String strA = li.a(rectF, jj0Var);
                    f02 f02VarE2 = this.f25482d.e();
                    if (f02VarE2 == null || (xz1VarB = f02VarE2.b()) == null) {
                        return;
                    }
                    if (strA != null) {
                        this.f25481c.a(imageView, this.f25483e, xz1VarB, strA);
                        return;
                    } else {
                        this.f25481c.a(imageView, this.f25483e, xz1VarB);
                        return;
                    }
                }
            }
            xz1 xz1VarA = this.f25480b.a(rectF, this.f25482d);
            if (xz1VarA != null) {
                this.f25481c.a(imageView, this.f25483e, xz1VarA);
            }
        }
    }
}
