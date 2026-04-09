package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private int fkw;

    /* renamed from: le, reason: collision with root package name */
    private int f7224le;
    Paint ouw;
    private int yu;
    Path vt = new Path();

    /* renamed from: lh, reason: collision with root package name */
    Path f7225lh = new Path();

    public lh() {
        Paint paint = new Paint();
        this.ouw = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ouw(android.graphics.Canvas r21, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh.ouw(android.graphics.Canvas, com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation, android.view.View):void");
    }

    public final void ouw(View view, float f10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) (this.f7224le * f10);
        view.setTranslationX((r1 - r6) / 2);
        if (view instanceof cf) {
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i4 >= viewGroup.getChildCount()) {
                    break;
                }
                viewGroup.getChildAt(i4).setTranslationX((-(this.f7224le - layoutParams.width)) / 2);
                i4++;
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public final void ouw(View view, int i4, int i10) {
        String str;
        this.yu = i4 / 2;
        this.fkw = i10 / 2;
        if (this.f7224le == 0 && view.getLayoutParams().width > 0) {
            this.f7224le = view.getLayoutParams().width;
        }
        try {
            str = (String) view.getTag(2097610710);
            try {
                this.f7225lh.addRoundRect(new RectF(0.0f, 0.0f, i4, i10), i10 / 2, i10 / 2, Path.Direction.CW);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "";
        }
        if ("right".equals(str)) {
            view.setPivotX(this.yu * 2);
            view.setPivotY(this.fkw);
        } else if ("left".equals(str)) {
            view.setPivotX(0.0f);
            view.setPivotY(this.fkw);
        } else {
            view.setPivotX(this.yu);
            view.setPivotY(this.fkw);
        }
    }
}
