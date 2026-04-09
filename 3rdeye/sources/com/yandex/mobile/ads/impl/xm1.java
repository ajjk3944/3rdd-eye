package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
public final class xm1 implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ud2 f35352a;

    /* renamed from: b, reason: collision with root package name */
    private final ag<jj0> f35353b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f35354c;

    /* renamed from: d, reason: collision with root package name */
    private final ym1 f35355d;

    /* renamed from: e, reason: collision with root package name */
    private final ew1 f35356e;

    public static final class a implements vi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ w9.i<Object>[] f35357c = {fa.a(a.class, "weekQrcodeContainer", "getWeekQrcodeContainer()Landroid/view/ViewGroup;", 0), fa.a(a.class, "weekQrcodeImageView", "getWeekQrcodeImageView()Landroid/widget/ImageView;", 0)};

        /* renamed from: a, reason: collision with root package name */
        private final ao1 f35358a;

        /* renamed from: b, reason: collision with root package name */
        private final ao1 f35359b;

        public a(bb2 uiElements) {
            kotlin.jvm.internal.l.f(uiElements, "uiElements");
            this.f35358a = bo1.a(uiElements.k());
            this.f35359b = bo1.a(uiElements.l());
        }

        @Override // com.yandex.mobile.ads.impl.vi0.b
        public final void a(Bitmap bitmap) {
            if (bitmap == null) {
                ao1 ao1Var = this.f35358a;
                w9.i<?>[] iVarArr = f35357c;
                ViewGroup viewGroup = (ViewGroup) ao1Var.getValue(this, iVarArr[0]);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                ImageView imageView = (ImageView) this.f35359b.getValue(this, iVarArr[1]);
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(8);
                return;
            }
            ao1 ao1Var2 = this.f35359b;
            w9.i<?>[] iVarArr2 = f35357c;
            ImageView imageView2 = (ImageView) ao1Var2.getValue(this, iVarArr2[1]);
            if (imageView2 != null) {
                imageView2.setImageBitmap(bitmap);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f35358a.getValue(this, iVarArr2[0]);
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ImageView imageView3 = (ImageView) this.f35359b.getValue(this, iVarArr2[1]);
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(0);
        }
    }

    public xm1(Context context, ej0 imageProvider, ud2 videoClicks, ag<jj0> agVar, Context applicationContext, ym1 qrcodeLoader, ew1 settings) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(videoClicks, "videoClicks");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(qrcodeLoader, "qrcodeLoader");
        kotlin.jvm.internal.l.f(settings, "settings");
        this.f35352a = videoClicks;
        this.f35353b = agVar;
        this.f35354c = applicationContext;
        this.f35355d = qrcodeLoader;
        this.f35356e = settings;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        Integer numC;
        jj0 jj0VarD;
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        du1 du1VarA = this.f35356e.a(this.f35354c);
        String strF = null;
        if (du1VarA == null || (numC = du1VarA.C()) == null || numC.intValue() == 0) {
            numC = null;
        }
        if (numC == null) {
            ViewGroup viewGroupK = uiElements.k();
            if (viewGroupK != null) {
                viewGroupK.setVisibility(8);
            }
            ImageView imageViewL = uiElements.l();
            if (imageViewL == null) {
                return;
            }
            imageViewL.setVisibility(8);
            return;
        }
        int iIntValue = numC.intValue();
        String strA = this.f35352a.a();
        if (strA != null) {
            if (strA.length() <= 0) {
                strA = null;
            }
            if (strA != null) {
                ag<jj0> agVar = this.f35353b;
                if (agVar != null && (jj0VarD = agVar.d()) != null) {
                    strF = jj0VarD.f();
                }
                this.f35355d.a(strA, iIntValue, strF, new a(uiElements));
                return;
            }
        }
        ViewGroup viewGroupK2 = uiElements.k();
        if (viewGroupK2 != null) {
            viewGroupK2.setVisibility(8);
        }
        ImageView imageViewL2 = uiElements.l();
        if (imageViewL2 == null) {
            return;
        }
        imageViewL2.setVisibility(8);
    }
}
