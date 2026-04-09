package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly extends FrameLayout implements pno {
    private int bly;

    /* renamed from: cf, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.tlj f7247cf;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkw;

    /* renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.ra f7248le;

    /* renamed from: lh, reason: collision with root package name */
    public String f7249lh;
    public View ouw;
    private View.OnTouchListener pno;
    private com.bytedance.sdk.component.adexpress.le.vm ra;
    private com.bytedance.sdk.component.adexpress.vt.mwh ryl;
    private boolean tlj;
    public ra vt;
    private Context yu;

    public bly(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        super(context);
        this.yu = context;
        this.fkw = fkwVar;
        this.f7248le = raVar;
        lh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fkw() {
        if (this.pno != null) {
            setOnClickListener((View.OnClickListener) this.fkw.getDynamicClickListener());
            performClick();
            if (this.f7248le.yu.qld) {
                return;
            }
            setVisibility(8);
        }
    }

    private void lh() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.f7248le;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        this.f7249lh = leVar.tc;
        this.bly = leVar.an;
        this.tlj = leVar.f7288lh;
        ra raVarOuw = tlj.ouw(this.yu, this.fkw, raVar, this.f7247cf, this.ryl);
        this.vt = raVarOuw;
        if (raVarOuw != null) {
            this.ouw = raVarOuw.lh();
            if (this.f7248le.yu.smu) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.f7249lh, "6")) {
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar2 = this.f7248le.yu;
                if (!leVar2.qbp || TextUtils.isEmpty(leVar2.f7293th)) {
                    this.ra = new com.bytedance.sdk.component.adexpress.le.vm(this.yu, Color.parseColor("#99000000"));
                } else {
                    this.ra = new com.bytedance.sdk.component.adexpress.le.vm(this.yu, com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(this.f7248le.yu.f7293th));
                }
                FrameLayout frameLayout = new FrameLayout(this.yu);
                frameLayout.addView(this.ra, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bytedance.sdk.component.adexpress.le.vm vmVar = bly.this.ra;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, vmVar.yu);
                        vmVar.ouw = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.setDuration(vmVar.f7359lh);
                        vmVar.ouw.setInterpolator(new LinearInterpolator());
                        vmVar.ouw.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.vm.1
                            public AnonymousClass1() {
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                vm.this.bly = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                vm.this.invalidate();
                            }
                        });
                        vmVar.ouw.start();
                    }
                });
            }
            if (ouw(this.f7249lh) && com.bytedance.sdk.component.adexpress.yu.vt()) {
                int color = Color.parseColor("#99000000");
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar3 = this.f7248le.yu;
                if (leVar3.qbp && !TextUtils.isEmpty(leVar3.f7293th)) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(this.f7248le.yu.f7293th);
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.yu);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.vt.lh());
            ouw(this.vt.lh());
            setVisibility(0);
        }
    }

    private boolean yu() {
        return (this.f7248le.yu.f7288lh || TextUtils.equals("9", this.f7249lh) || TextUtils.equals("16", this.f7249lh) || TextUtils.equals("17", this.f7249lh) || TextUtils.equals("18", this.f7249lh) || TextUtils.equals("20", this.f7249lh) || TextUtils.equals("29", this.f7249lh) || TextUtils.equals("10", this.f7249lh)) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            ra raVar = this.vt;
            if (raVar != null) {
                raVar.vt();
            }
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.ko.yu(e2.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.pno instanceof com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.lh) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private static boolean ouw(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.pno
    public final void vt() {
        if (yu()) {
            setOnClickListener((View.OnClickListener) this.fkw.getDynamicClickListener());
            performClick();
            if (this.f7248le.yu.qld) {
                return;
            }
            setVisibility(8);
        }
    }

    public bly(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar) {
        super(context);
        this.yu = context;
        this.fkw = fkwVar;
        this.f7248le = raVar;
        this.f7247cf = tljVar;
        this.ryl = mwhVar;
        lh();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.ouw(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.pno
    public final void ouw() {
        if (TextUtils.equals(this.f7249lh, "6")) {
            com.bytedance.sdk.component.adexpress.le.vm vmVar = this.ra;
            if (vmVar != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(vmVar.yu, 0.0f);
                vmVar.vt = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(vmVar.f7359lh);
                vmVar.vt.setInterpolator(new LinearInterpolator());
                vmVar.vt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.le.vm.2
                    public AnonymousClass2() {
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        vm.this.bly = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        vm.this.invalidate();
                    }
                });
                Animator.AnimatorListener animatorListener = vmVar.fkw;
                if (animatorListener != null) {
                    vmVar.vt.addListener(animatorListener);
                }
                vmVar.vt.start();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        bly.this.fkw();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.f7249lh, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.bly.3
                @Override // java.lang.Runnable
                public final void run() {
                    bly.this.fkw();
                }
            }, 400L);
        } else {
            fkw();
        }
    }
}
