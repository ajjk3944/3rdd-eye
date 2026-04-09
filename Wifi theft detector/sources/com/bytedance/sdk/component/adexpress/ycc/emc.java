package com.bytedance.sdk.component.adexpress.ycc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.sf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class emc extends TextSwitcher implements ViewSwitcher.ViewFactory, sf.emc {
    private Context bw;
    private final int dg;
    Animation.AnimationListener emc;
    private int gbl;
    private int msw;
    private Handler qh;
    private int ru;
    private int sup;
    private int sz;
    private int uym;
    private int xq;
    private TextView ycc;
    private List<String> ypw;
    private float zz;

    public emc(Context context, int i10, float f10, int i11, int i12) {
        super(context);
        this.ypw = new ArrayList();
        this.xq = 0;
        this.dg = 1;
        this.qh = new sf(Looper.getMainLooper(), this);
        this.emc = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.ycc.emc.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (emc.this.ycc != null) {
                    emc.this.ycc.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.bw = context;
        this.msw = i10;
        this.zz = f10;
        this.ru = i11;
        this.sz = i12;
        xq();
    }

    private void xq() {
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public View makeView() {
        TextView textView = new TextView(getContext());
        this.ycc = textView;
        textView.setTextColor(this.msw);
        this.ycc.setTextSize(this.zz);
        this.ycc.setMaxLines(this.ru);
        this.ycc.setTextAlignment(this.sz);
        return this.ycc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.qh.sendEmptyMessageDelayed(1, this.uym);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.qh.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw(this.ypw.get(this.gbl), this.zz, false)[0], 1073741824), i10);
        } catch (Exception unused) {
            super.onMeasure(i10, i11);
        }
    }

    public void setAnimationDuration(int i10) {
        this.uym = i10;
    }

    public void setAnimationText(List<String> list) {
        this.ypw = list;
    }

    public void setAnimationType(int i10) {
        this.sup = i10;
    }

    public void setMaxLines(int i10) {
        this.ru = i10;
    }

    public void setTextColor(int i10) {
        this.msw = i10;
    }

    public void setTextSize(float f10) {
        this.zz = f10;
    }

    public void ypw() {
        List<String> list = this.ypw;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i10 = this.xq;
        this.xq = i10 + 1;
        this.gbl = i10;
        setText(this.ypw.get(i10));
        if (this.xq > this.ypw.size() - 1) {
            this.xq = 0;
        }
    }

    public void emc() {
        int i10 = this.sup;
        if (i10 == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.rie.zz(this.bw, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.rie.zz(this.bw, "tt_text_animation_y_out"));
        } else if (i10 == 0) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.rie.zz(this.bw, "tt_text_animation_x_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.rie.zz(this.bw, "tt_text_animation_x_in"));
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.emc);
            getOutAnimation().setAnimationListener(this.emc);
        }
        this.qh.sendEmptyMessage(1);
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        if (message.what != 1) {
            return;
        }
        ypw();
        this.qh.sendEmptyMessageDelayed(1, this.uym);
    }
}
