package com.bytedance.sdk.openadsdk.xq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.openadsdk.core.ycc.msw {
    private int dg;
    private Paint emc;
    private boolean xq;
    private float ypw;

    public emc(Context context) {
        super(context);
        emc();
    }

    private void emc() {
        this.ypw = vw.emc(getContext(), 8.0f);
        this.emc = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        emc(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.msw, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.dg = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.dg);
        } else {
            layoutParams.height = this.dg;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ycc.msw, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.dg;
        if (i10 == 0 || layoutParams == null) {
            return;
        }
        layoutParams.height = i10;
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.ypw = f10;
    }

    private void emc(String str, int i10) {
        if (!this.xq && i10 > 0) {
            float textSize = getTextSize();
            this.emc.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float fEmc = emc(textSize, str);
            while (fEmc > paddingLeft) {
                textSize -= 1.0f;
                this.emc.setTextSize(textSize);
                if (textSize <= this.ypw) {
                    break;
                } else {
                    fEmc = emc(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.xq = true;
        }
    }

    private float emc(float f10, String str) {
        this.emc.setTextSize(f10);
        return this.emc.measureText(str);
    }
}
