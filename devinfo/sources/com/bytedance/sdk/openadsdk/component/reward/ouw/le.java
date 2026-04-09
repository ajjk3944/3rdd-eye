package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b9.e;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class le {
    public ouw ouw;
    public boolean vt;

    public le(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void ouw(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar;
        this.vt = true;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFExpressM", "initExpressView() called with: size = [" + Arrays.toString(fArr) + "]");
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.ouw.vt.fqk())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        ouw ouwVar = this.ouw;
        ouwVar.jae.ouw(adSlotBuild, ouwVar.ey.rn);
        ouw ouwVar2 = this.ouw;
        ryl rylVar = ouwVar2.uoy;
        if (rylVar != null && (tljVar = ouwVar2.jae) != null) {
            rylVar.yu = tljVar.ouw;
        }
        ouwVar2.jae.ouw(new com.bytedance.sdk.openadsdk.core.bly.ko() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final long fkw() {
                return le.this.ouw.ex.ryl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final boolean l_() {
                return com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(le.this.ouw);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final int le() {
                ouw ouwVar3 = le.this.ouw;
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar2 = ouwVar3.jae;
                if (tljVar2.yu) {
                    return 4;
                }
                if (tljVar2.fkw) {
                    return 5;
                }
                e eVar = ouwVar3.ex.ra;
                if (eVar != null && eVar.ex()) {
                    return 1;
                }
                if (le.this.ouw.ex.ouw()) {
                    return 2;
                }
                le.this.ouw.ex.yu();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void lh() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = le.this.ouw.ey;
                if (rylVar2 == null || rylVar2.tlj() == null) {
                    return;
                }
                le.this.ouw.ey.tlj().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(boolean z3, String str) {
                com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3.f7958cj == z3 || (lhVar = ouwVar3.uoy.f7989lh) == null) {
                    return;
                }
                lhVar.clickSound(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ra() {
                ouw ouwVar3 = le.this.ouw;
                ouwVar3.f7965pd.ouw(ouwVar3.coz);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void vt(int i4) {
                le.this.ouw.wp = i4;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final long yu() {
                return le.this.ouw.ex.pno;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw() {
                le.this.ouw.uoy.lh();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(String str, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3 == null || (vtVar = ouwVar3.fqk) == null) {
                    return;
                }
                vtVar.ouw(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final boolean ouw(JSONObject jSONObject) {
                ko koVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3 == null || (koVar = ouwVar3.ex) == null) {
                    return false;
                }
                return koVar.ouw(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(int i4) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        le.this.ouw.ex.th();
                        return;
                    }
                    if (i4 == 3) {
                        ouw ouwVar3 = le.this.ouw;
                        ouwVar3.ex.ouw(ouwVar3.fqk);
                        return;
                    } else if (i4 == 4) {
                        le.this.ouw.ex.bly();
                        return;
                    } else if (i4 != 5) {
                        return;
                    }
                }
                if (le.this.ouw.ex.ouw() || le.this.ouw.ex.yu()) {
                    return;
                }
                le.this.ouw.fqk.ouw(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(int i4, String str) {
                ko koVar = le.this.ouw.ex;
                koVar.mwh = i4;
                koVar.ko = str;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(final int i4, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                float f10;
                int i10;
                final th thVar = le.this.ouw.ey.rn;
                if (thVar != null) {
                    if ((i4 != 3 && !th.ouw(i4)) || thVar.kn == null || jgVar == null) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = thVar.ucs;
                    if (atomicBoolean != null) {
                        if (i4 == 1) {
                            return;
                        }
                        if (i4 == 5 && atomicBoolean.get()) {
                            return;
                        }
                    }
                    final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) thVar.qbp.getLayoutParams();
                    thVar.yhj = (LinearLayout.LayoutParams) thVar.rn.getLayoutParams();
                    final float f11 = layoutParams.weight;
                    vm vmVar = thVar.jqy.f8301mb;
                    if (th.ouw(i4)) {
                        if (vmVar != null) {
                            i10 = vmVar.yu;
                            f10 = i10;
                        } else {
                            f10 = 30.0f;
                        }
                    } else if (vmVar != null) {
                        i10 = vmVar.fkw;
                        f10 = i10;
                    } else {
                        f10 = 70.0f;
                    }
                    com.bytedance.sdk.component.utils.ko.ouw("LandingPageModel", "expressStartWeight is :", Float.valueOf(f11), "expressEndWeight is:", Float.valueOf(f10));
                    final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) thVar.kn.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    }
                    final int i11 = layoutParams2.height;
                    final float f12 = f10;
                    final int i12 = layoutParams2.width;
                    final int i13 = layoutParams2.leftMargin;
                    final int i14 = layoutParams2.topMargin;
                    final int iOuw = osn.ouw(thVar.vpp, (float) jgVar.f7390cf);
                    final int iOuw2 = osn.ouw(thVar.vpp, (float) jgVar.ryl);
                    final int iOuw3 = osn.ouw(thVar.vpp, (float) jgVar.fkw);
                    final int iOuw4 = osn.ouw(thVar.vpp, (float) jgVar.f7392le);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    thVar.bs = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(500L);
                    thVar.bs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.9
                        final /* synthetic */ int bly;

                        /* renamed from: cf */
                        final /* synthetic */ int f8276cf;
                        final /* synthetic */ int fkw;

                        /* renamed from: le */
                        final /* synthetic */ int f8278le;

                        /* renamed from: lh */
                        final /* synthetic */ float f8279lh;
                        final /* synthetic */ int mwh;
                        final /* synthetic */ LinearLayout.LayoutParams ouw;
                        final /* synthetic */ int pno;
                        final /* synthetic */ int ra;
                        final /* synthetic */ int ryl;
                        final /* synthetic */ int tlj;
                        final /* synthetic */ float vt;
                        final /* synthetic */ FrameLayout.LayoutParams yu;

                        public AnonymousClass9(final LinearLayout.LayoutParams layoutParams3, final float f112, final float f122, final FrameLayout.LayoutParams layoutParams22, final int i122, final int iOuw5, final int i112, final int iOuw22, final int i132, final int iOuw32, final int i142, final int iOuw42, final int i42) {
                            layoutParams = layoutParams3;
                            f = f112;
                            f = f122;
                            layoutParams = layoutParams22;
                            i = i122;
                            i = iOuw5;
                            i = i112;
                            i = iOuw22;
                            i = i132;
                            i = iOuw32;
                            i = i142;
                            i = iOuw42;
                            i = i42;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            LinearLayout.LayoutParams layoutParams3 = layoutParams;
                            float f13 = f;
                            layoutParams3.weight = c.c(f, f13, fFloatValue, f13);
                            th.this.yhj.weight = 100.0f - layoutParams.weight;
                            if (th.this.qbp != null) {
                                th.this.qbp.setLayoutParams(layoutParams);
                            }
                            if (th.this.rn != null) {
                                th.this.rn.setLayoutParams(th.this.yhj);
                            }
                            if (th.this.yhj.weight < 30.0f) {
                                th.this.fkw(8);
                            } else {
                                th.this.fkw(0);
                            }
                            FrameLayout.LayoutParams layoutParams4 = layoutParams;
                            layoutParams4.width = i + ((int) ((i - r2) * fFloatValue));
                            layoutParams4.height = i + ((int) ((i - r2) * fFloatValue));
                            layoutParams4.leftMargin = i + ((int) ((i - r2) * fFloatValue));
                            layoutParams4.topMargin = i + ((int) ((i - r2) * fFloatValue));
                            if (th.this.kn != null) {
                                th.this.kn.setLayoutParams(layoutParams);
                            }
                            th.this.lh();
                            if (fFloatValue == 1.0f) {
                                if (th.this.wp != null) {
                                    osn.ouw((View) th.this.wp, 0);
                                    if (th.ouw(i)) {
                                        th.this.wp.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(th.this.vpp, "tt_ad_zoom_down"));
                                        th.this.wp.setTag(1);
                                    } else {
                                        th.this.wp.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(th.this.vpp, "tt_ad_zoom_up"));
                                        th.this.wp.setTag(2);
                                    }
                                }
                                if (th.this.ucs == null) {
                                    th.this.ucs = new AtomicBoolean();
                                }
                                th.this.ucs.set(th.ouw(i));
                            }
                        }
                    });
                    com.bytedance.sdk.openadsdk.yu.lh.yu(thVar.jqy, thVar.tc, i42);
                    thVar.bs.start();
                    if (thVar.mt.compareAndSet(false, true)) {
                        thVar.xdk = SystemClock.elapsedRealtime();
                    }
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = thVar.uq;
                    if (mwhVar != null) {
                        mwhVar.ouw(true, SystemClock.elapsedRealtime());
                    }
                    osn.ouw((View) thVar.wp, 8);
                }
            }
        });
        this.ouw.jae.ouw(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public final void onAdClicked() {
                vpp vppVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3 == null || (vppVar = ouwVar3.vt) == null || !vppVar.pd()) {
                    return;
                }
                le.this.ouw.fqk.osn();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderFail(View view, String str, int i4) {
                if (!le.this.ouw.vt.lso()) {
                    le.this.ouw.bs.ouw(true);
                    le.this.ouw.bs.ouw();
                }
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFExpressM", "onRenderFail、、、code:".concat(String.valueOf(i4)));
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar2 = le.this.ouw.jae;
                if (tljVar2.f8033lh == null) {
                    tljVar2.f8033lh = new Handler(Looper.getMainLooper());
                }
                tljVar2.f8033lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.this.ouw.coz.ouw(false, false, false, 90);
                    }
                });
                le.this.ouw.ey.mwh();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i4);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.fkw("TTAD.RFExpressM", "onRenderFail、、、error:" + th2.getMessage());
                }
                ouw ouwVar3 = le.this.ouw;
                com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar3.vt, "show_ad_fail", ouwVar3.fkw, str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderSuccess(View view, float f10, float f11) {
                final th thVar;
                if (!le.this.ouw.vt.lso()) {
                    if (le.this.ouw.jae.yu()) {
                        le.this.ouw.coz.ouw(true);
                        le.this.ouw.ex.ouw(false);
                    } else {
                        le.this.ouw.ex.ouw(true);
                    }
                    le.this.ouw.ey.ouw(8);
                    le.this.ouw.bs.ouw(true);
                    le.this.ouw.bs.ouw();
                    if (le.this.ouw.jae.yu()) {
                        le.this.ouw.jae.ouw().setBackgroundColor(-16777216);
                        ouw ouwVar3 = le.this.ouw;
                        ouwVar3.coz.ouw(ouwVar3.ey.le());
                    } else {
                        ouw ouwVar4 = le.this.ouw;
                        if (ouwVar4.vt.f8309sd != null && ouwVar4.coz.ouw()) {
                            le.this.ouw.kn = true;
                        }
                    }
                }
                le.this.ouw.coz.vpp();
                if (th.lh(le.this.ouw.vt) && (thVar = le.this.ouw.ey.rn) != null && vpp.fkw(thVar.jqy)) {
                    try {
                        String str = thVar.jqy.f8309sd.f6578f;
                        yu.ouw.vt.ouw(str).ouw(thVar.jqy.f8309sd.f6574b).vt(thVar.jqy.f8309sd.f6573a).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).lh(2).ouw(new th.ouw()).vt(new com.bytedance.sdk.openadsdk.tlj.vt(thVar.jqy, str, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.model.th.4
                            public AnonymousClass4() {
                            }

                            @Override // com.bytedance.sdk.component.fkw.rn
                            public final void ouw(int i4, String str2, Throwable th2) {
                            }

                            @Override // com.bytedance.sdk.component.fkw.rn
                            public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                                try {
                                    Object objVt = cfVar.vt();
                                    if (objVt != null && cfVar.lh() != null) {
                                        BitmapDrawable bitmapDrawable = objVt instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.zih.ouw().getResources(), (Bitmap) objVt) : null;
                                        View viewRn = th.this.ksc.rn();
                                        if (bitmapDrawable == null || viewRn == null || !(viewRn.getParent() instanceof View)) {
                                            return;
                                        }
                                        ((View) viewRn.getParent()).setBackground(bitmapDrawable);
                                    }
                                } catch (Throwable th2) {
                                    com.bytedance.sdk.component.utils.qbp.lh("LandingPageModel", th2.getMessage());
                                }
                            }
                        }));
                    } catch (Exception unused) {
                    }
                }
                le.this.ouw.ey.mwh();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdShow(View view, int i4) {
            }
        });
        ouw();
        FrameLayout.LayoutParams layoutParams = (this.ouw.vt.lso() || com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.ouw.vt.kfa) || th.lh(this.ouw.vt)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.ouw.ey.le().addView(this.ouw.jae.ouw, layoutParams);
        if (!this.ouw.jae.yu()) {
            this.ouw.coz.ouw(false);
        }
        this.ouw.jae.ra();
    }

    public final void ouw() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        ouw ouwVar = this.ouw;
        Activity activity = ouwVar.jvy;
        vpp vppVar = ouwVar.vt;
        String str = ouwVar.fkw;
        com.bytedance.sdk.openadsdk.core.bly.bly blyVar = new com.bytedance.sdk.openadsdk.core.bly.bly(activity, vppVar, str, uoy.ouw(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
                super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
            }
        };
        blyVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.4
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i4) {
                le.this.ouw.fqk.osn();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        ouw ouwVar2 = this.ouw;
        if (ouwVar2.euf && (pnoVar = ouwVar2.f7959gh) != null) {
            int i4 = pnoVar.f7763cf + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i4);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        blyVar.ouw(map);
        ouw ouwVar3 = this.ouw;
        Activity activity2 = ouwVar3.jvy;
        vpp vppVar2 = ouwVar3.vt;
        String str2 = ouwVar3.fkw;
        com.bytedance.sdk.openadsdk.core.bly.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.bly.pno(activity2, vppVar2, str2, uoy.ouw(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.5
            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z3) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(le.this.ouw.ex.fkw()));
                com.bytedance.sdk.openadsdk.activity.pno pnoVar3 = le.this.ouw.f7959gh;
                if (pnoVar3 != null) {
                    pnoVar3.ouw(map2, f10, f11);
                }
                ouw(map2);
                super.ouw(view, f10, f11, f12, f13, sparseArray, z3);
            }
        };
        pnoVar2.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.6
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i10) {
                le.this.ouw.fqk.osn();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        pnoVar2.ouw(map2);
        this.ouw.jae.ouw(blyVar, pnoVar2);
    }
}
