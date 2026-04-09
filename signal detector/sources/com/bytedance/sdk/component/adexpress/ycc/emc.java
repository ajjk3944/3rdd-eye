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

    public emc(Context context, int i, float f2, int i3, int i6) {
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
        this.msw = i;
        this.zz = f2;
        this.ru = i3;
        this.sz = i6;
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
    public void onMeasure(int i, int i3) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.bw.gbl.ypw(this.ypw.get(this.gbl), this.zz, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i3);
        }
    }

    public void setAnimationDuration(int i) {
        this.uym = i;
    }

    public void setAnimationText(List<String> list) {
        this.ypw = list;
    }

    public void setAnimationType(int i) {
        this.sup = i;
    }

    public void setMaxLines(int i) {
        this.ru = i;
    }

    public void setTextColor(int i) {
        this.msw = i;
    }

    public void setTextSize(float f2) {
        this.zz = f2;
    }

    public void ypw() {
        List<String> list = this.ypw;
        if (list == null || list.size() <= 0) {
            return;
        }
        int i = this.xq;
        this.xq = i + 1;
        this.gbl = i;
        setText(this.ypw.get(i));
        if (this.xq > this.ypw.size() - 1) {
            this.xq = 0;
        }
    }

    public void emc() {
        int i = this.sup;
        if (i == 1) {
            setInAnimation(getContext(), com.bytedance.sdk.component.utils.rie.zz(this.bw, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), com.bytedance.sdk.component.utils.rie.zz(this.bw, "tt_text_animation_y_out"));
        } else if (i == 0) {
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
