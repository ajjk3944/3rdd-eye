package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class xa0 extends ig2<ImageView, ua0> {

    /* renamed from: c, reason: collision with root package name */
    private final vi0 f35228c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa0(ImageView view, vi0 imageProvider) {
        super(view);
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        this.f35228c = imageProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, ua0 ua0Var) {
        ImageView view2 = (ImageView) view;
        ua0 feedbackValue = ua0Var;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(feedbackValue, "feedbackValue");
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, ua0 ua0Var) {
        ImageView view2 = (ImageView) view;
        ua0 feedbackValue = ua0Var;
        kotlin.jvm.internal.l.f(view2, "view");
        kotlin.jvm.internal.l.f(feedbackValue, "feedbackValue");
        jj0 jj0VarA = feedbackValue.a();
        if (jj0VarA == null) {
            return;
        }
        view2.setForeground(null);
        view2.setBackground(null);
        a(jj0VarA);
    }

    private final void a(jj0 jj0Var) {
        this.f35228c.a(jj0Var, new X1(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(xa0 this$0, Bitmap bitmap) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        if (bitmap != null) {
            ImageView imageViewB = this$0.b();
            if (imageViewB != null) {
                imageViewB.setImageBitmap(bitmap);
                return;
            }
            return;
        }
        ImageView imageViewB2 = this$0.b();
        if (imageViewB2 != null) {
            imageViewB2.setImageDrawable(C5848a.getDrawable(imageViewB2.getContext(), R.drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }
}
