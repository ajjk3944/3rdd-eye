package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.sdk.component.utils.jae;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends TextSwitcher implements ViewSwitcher.ViewFactory, jae.ouw {
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private float f7338cf;
    private List<String> fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f7339jg;

    /* renamed from: le, reason: collision with root package name */
    private int f7340le;

    /* renamed from: lh, reason: collision with root package name */
    public Handler f7341lh;
    private int mwh;
    public Context ouw;
    private TextView pno;
    private final int ra;
    private int ryl;
    private int tlj;
    public int vt;
    public Animation.AnimationListener yu;

    public ouw(Context context, int i4, float f10, int i10) {
        super(context);
        this.fkw = new ArrayList();
        this.f7340le = 0;
        this.ra = 1;
        this.f7341lh = new jae(Looper.getMainLooper(), this);
        this.yu = new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.le.ouw.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (ouw.this.pno != null) {
                    ouw.this.pno.setText("");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        };
        this.ouw = context;
        this.tlj = i4;
        this.f7338cf = f10;
        this.ryl = 1;
        this.f7339jg = i10;
        setFactory(this);
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        TextView textView = new TextView(getContext());
        this.pno = textView;
        textView.setTextColor(this.tlj);
        this.pno.setTextSize(this.f7338cf);
        this.pno.setMaxLines(this.ryl);
        this.pno.setTextAlignment(this.f7339jg);
        return this.pno;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7341lh.sendEmptyMessageDelayed(1, this.bly);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7341lh.removeMessages(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(com.bytedance.sdk.component.adexpress.dynamic.fkw.cf.ouw(this.fkw.get(this.mwh), this.f7338cf, false)[0], 1073741824), i4);
        } catch (Exception unused) {
            super.onMeasure(i4, i10);
        }
    }

    public final void setAnimationDuration(int i4) {
        this.bly = i4;
    }

    public final void setAnimationText(List<String> list) {
        this.fkw = list;
    }

    public final void setAnimationType(int i4) {
        this.vt = i4;
    }

    public final void setMaxLines(int i4) {
        this.ryl = i4;
    }

    public final void setTextColor(int i4) {
        this.tlj = i4;
    }

    public final void setTextSize(float f10) {
        this.f7338cf = f10;
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what != 1) {
            return;
        }
        List<String> list = this.fkw;
        if (list != null && list.size() > 0) {
            int i4 = this.f7340le;
            this.f7340le = i4 + 1;
            this.mwh = i4;
            setText(this.fkw.get(i4));
            if (this.f7340le > this.fkw.size() - 1) {
                this.f7340le = 0;
            }
        }
        this.f7341lh.sendEmptyMessageDelayed(1, this.bly);
    }
}
