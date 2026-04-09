package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class zz extends FrameLayout implements msw {
    private uym bw;
    private View dg;
    private Context emc;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.ru gbl;
    private View.OnTouchListener msw;
    private boolean ru;
    private com.bytedance.sdk.component.adexpress.ypw.sz sup;
    private com.bytedance.sdk.component.adexpress.ycc.sba uym;
    private com.bytedance.sdk.component.adexpress.dynamic.dg.uym xq;
    private String ycc;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw ypw;
    private int zz;

    public zz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar) {
        super(context);
        this.emc = context;
        this.ypw = bwVar;
        this.xq = uymVar;
        uym();
    }

    private boolean msw() {
        return (this.xq.ndl() || TextUtils.equals("9", this.ycc) || TextUtils.equals("16", this.ycc) || TextUtils.equals("17", this.ycc) || TextUtils.equals("18", this.ycc) || TextUtils.equals("20", this.ycc) || TextUtils.equals("29", this.ycc) || TextUtils.equals("10", this.ycc)) ? false : true;
    }

    private void uym() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.ycc = this.xq.wo();
        this.zz = this.xq.wpn();
        this.ru = this.xq.ndl();
        uym uymVarEmc = ru.emc(this.emc, this.ypw, this.xq, this.gbl, this.sup);
        this.bw = uymVarEmc;
        if (uymVarEmc != null) {
            this.dg = uymVarEmc.xq();
            if (this.xq.xxg()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.ycc, "6")) {
                if (!this.xq.hj() || TextUtils.isEmpty(this.xq.xhi())) {
                    this.uym = new com.bytedance.sdk.component.adexpress.ycc.sba(this.emc, Color.parseColor("#99000000"));
                } else {
                    this.uym = new com.bytedance.sdk.component.adexpress.ycc.sba(this.emc, com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(this.xq.xhi()));
                }
                FrameLayout frameLayout = new FrameLayout(this.emc);
                frameLayout.addView(this.uym, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.zz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zz.this.uym.ypw();
                    }
                });
            }
            if (emc(this.ycc) && com.bytedance.sdk.component.adexpress.dg.ypw()) {
                int color = Color.parseColor("#99000000");
                if (this.xq.hj() && !TextUtils.isEmpty(this.xq.xhi())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(this.xq.xhi());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.emc);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.bw.xq());
            emc(this.bw.xq());
            setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zz() {
        if (this.msw != null) {
            setOnClickListener((View.OnClickListener) this.ypw.getDynamicClickListener());
            performClick();
            if (this.xq.ipv()) {
                return;
            }
            setVisibility(8);
        }
    }

    public void bw() {
        if (this.dg != null && TextUtils.equals(this.ycc, "2")) {
            View view = this.dg;
            if (view instanceof com.bytedance.sdk.component.adexpress.ycc.xq) {
                ((com.bytedance.sdk.component.adexpress.ycc.xq) view).xq();
            }
        }
    }

    public void dg() {
        uym uymVar = this.bw;
        if (uymVar != null) {
            uymVar.ypw();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            uym uymVar = this.bw;
            if (uymVar != null) {
                uymVar.ypw();
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.msw instanceof com.bytedance.sdk.component.adexpress.dynamic.xq.emc.xq) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void xq() {
        uym uymVar = this.bw;
        if (uymVar != null) {
            uymVar.emc();
        }
    }

    public void ycc() {
        if (this.dg != null && TextUtils.equals(this.ycc, "2")) {
            View view = this.dg;
            if (view instanceof com.bytedance.sdk.component.adexpress.ycc.xq) {
                ((com.bytedance.sdk.component.adexpress.ycc.xq) view).dg();
            }
        }
    }

    private boolean emc(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.msw
    public void ypw() {
        if (msw()) {
            setOnClickListener((View.OnClickListener) this.ypw.getDynamicClickListener());
            performClick();
            if (this.xq.ipv()) {
                return;
            }
            setVisibility(8);
        }
    }

    public zz(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, com.bytedance.sdk.component.adexpress.dynamic.dg.ru ruVar, com.bytedance.sdk.component.adexpress.ypw.sz szVar) {
        super(context);
        this.emc = context;
        this.ypw = bwVar;
        this.xq = uymVar;
        this.gbl = ruVar;
        this.sup = szVar;
        uym();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.xq.zz.emc(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.xq.msw
    public void emc() {
        if (TextUtils.equals(this.ycc, "6")) {
            com.bytedance.sdk.component.adexpress.ycc.sba sbaVar = this.uym;
            if (sbaVar != null) {
                sbaVar.xq();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.zz.2
                    @Override // java.lang.Runnable
                    public void run() {
                        zz.this.zz();
                    }
                }, 300L);
                return;
            }
            return;
        }
        if (TextUtils.equals(this.ycc, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.xq.zz.3
                @Override // java.lang.Runnable
                public void run() {
                    zz.this.zz();
                }
            }, 400L);
        } else {
            zz();
        }
    }
}
