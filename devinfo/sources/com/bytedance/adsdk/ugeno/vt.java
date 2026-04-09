package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.yu.bly;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.le.vt> implements com.bytedance.adsdk.ugeno.le.lh {
    private JSONArray ajl;

    /* renamed from: ak, reason: collision with root package name */
    private boolean f6952ak;
    private float baa;
    private float byv;
    private int cu;
    private String ehk;
    private int eot;
    private float fg;
    private float fn;
    private boolean hsa;

    /* renamed from: ki, reason: collision with root package name */
    private String f6953ki;
    private float kq;
    private float lai;
    private int ln;
    private int mu;
    private int nbp;
    private float nn;
    private boolean qni;

    /* renamed from: rh, reason: collision with root package name */
    private boolean f6954rh;
    private float sm;
    private boolean smu;
    private boolean swm;

    /* renamed from: vf, reason: collision with root package name */
    private float f6955vf;
    private int vrp;
    private String xne;
    private float xwt;
    private boolean zjq;

    public vt(Context context) {
        super(context);
        this.ln = 0;
        this.qni = true;
        this.smu = true;
        this.fn = 500.0f;
        this.byv = 2000.0f;
        this.ehk = "slide";
        this.f6953ki = "dot";
        this.xwt = 8.0f;
        this.fg = 8.0f;
        this.baa = 50.0f;
        this.nn = 90.0f;
        this.zjq = false;
        this.eot = Color.parseColor("#666666");
        this.mu = Color.parseColor("#ffffff");
        this.xne = "row";
        this.lai = 1.0f;
        this.sm = 0.0f;
        this.f6955vf = 0.0f;
        this.kq = 0.0f;
        this.nbp = 0;
        this.cu = 0;
        this.swm = true;
        this.hsa = false;
        this.f6952ak = true;
        float fOuw = ra.ouw(this.vt, 8.0f);
        this.xwt = fOuw;
        this.fg = fOuw;
    }

    private int jvy() {
        if (this.nbp == 1) {
            List<com.bytedance.adsdk.ugeno.vt.lh<View>> list = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.ajl;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final View ouw() {
        com.bytedance.adsdk.ugeno.le.vt vtVar = new com.bytedance.adsdk.ugeno.le.vt(this.vt);
        this.fkw = vtVar;
        vtVar.f6904cf = this;
        return vtVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException, Resources.NotFoundException {
        super.vt();
        com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw = ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw((int) this.fn);
        ouwVarOuw.f6897le = this.hsa;
        com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw2 = ouwVarOuw.ouw(this.f6953ki);
        ouwVarOuw2.bly.setIndicatorWidth((int) this.xwt);
        ouwVarOuw2.bly.setIndicatorHeight((int) this.fg);
        ouwVarOuw2.bly.setIndicatorX(this.baa);
        ouwVarOuw2.bly.setIndicatorY(this.nn);
        ouwVarOuw2.bly.setIndicatorDirection(this.xne);
        ouwVarOuw2.pno = this.ln;
        com.bytedance.adsdk.ugeno.le.ouw.ouw ouwVar = ouwVarOuw2.bly;
        ouwVar.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.le.ouw.ouw.1
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ouw.ouw(ouw.this);
            }
        });
        com.bytedance.adsdk.ugeno.le.ouw ouwVarOuw3 = ouwVarOuw2.vt(this.qni).ouw(this.smu);
        ouwVarOuw3.vt = (int) this.fn;
        com.bytedance.adsdk.ugeno.le.ouw ouwVarVt = ouwVarOuw3.vt((int) this.byv);
        ouwVarVt.fkw = this.swm;
        ouwVarVt.yu = this.zjq;
        com.bytedance.adsdk.ugeno.le.ouw ouwVarFkw = ouwVarVt.yu(this.eot).lh(this.mu).le((int) this.f6955vf).ra((int) this.kq).fkw((int) this.sm);
        ouwVarFkw.f6898lh = this.lai;
        ouwVarFkw.vt(this.ehk).cf(this.cu);
        ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).setOnPageChangeListener(this);
        int i4 = 0;
        if (this.nbp == 1) {
            while (i4 < ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.size()) {
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.get(i4);
                if (lhVar != null) {
                    ryl rylVar = new ryl(this.vt);
                    ouw(rylVar);
                    rylVar.ouw(this.kfa);
                    ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw((com.bytedance.adsdk.ugeno.le.vt) rylVar.ouw(lhVar.jqy(), this.yu));
                }
                i4++;
            }
        } else {
            List<com.bytedance.adsdk.ugeno.vt.lh<View>> list = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw;
            if (list != null && !list.isEmpty()) {
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVar2 = ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.get(0);
                if (this.ajl != null) {
                    while (i4 < this.ajl.length()) {
                        ryl rylVar2 = new ryl(this.vt);
                        ouw(rylVar2);
                        rylVar2.ouw(this.kfa);
                        try {
                            JSONObject jSONObjectOptJSONObject = this.ajl.optJSONObject(i4);
                            if (jSONObjectOptJSONObject != null) {
                                if (jSONObjectOptJSONObject.has("$chunk")) {
                                    this.yu.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                                } else {
                                    this.yu.put("$item", jSONObjectOptJSONObject);
                                }
                                ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw((com.bytedance.adsdk.ugeno.le.vt) rylVar2.ouw(lhVar2.jqy(), this.yu));
                            }
                        } catch (Throwable unused) {
                        }
                        i4++;
                    }
                }
            }
        }
        ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (lhVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.add(lhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, ViewGroup.LayoutParams layoutParams) {
        if (lhVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vt.ouw) this).ouw.add(lhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startIndex":
                this.cu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                break;
            case "indicatorColor":
                this.eot = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, this.eot);
                break;
            case "indicatorStyle":
                this.f6953ki = str2;
                break;
            case "indicatorWidth":
                this.xwt = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.fg = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 8.0f));
                break;
            case "nextMargin":
                this.kq = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "driveMode":
                this.nbp = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                break;
            case "effect":
                this.ehk = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.ln = 1;
                    break;
                } else {
                    this.ln = 0;
                    break;
                }
            case "disableOnInteraction":
                this.hsa = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "indicator":
                this.zjq = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, false);
                break;
            case "indicatorX":
                this.baa = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 50.0f);
                break;
            case "indicatorY":
                this.nn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 90.0f);
                break;
            case "previousMargin":
                this.f6955vf = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "loop":
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "delay":
                this.byv = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 2000.0f);
                break;
            case "speed":
                this.fn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.xne = str2;
                break;
            case "allowTouchMove":
                this.swm = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "pageCount":
                this.lai = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case "pageMargin":
                this.sm = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.mu = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, this.mu);
                break;
            case "autoplay":
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "dataList":
                this.ajl = com.bytedance.adsdk.ugeno.ra.vt.ouw(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.le.lh
    public final void ouw(boolean z3, int i4, float f10, int i10) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z3 + "; position=" + i4 + "; positionOffset=" + f10 + "; positionOffsetPixels=" + i10);
        if (this.zrz != null && !z3 && i4 == jvy() - 1 && f10 == 0.0f && this.f6952ak) {
            this.zrz.ouw("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.f6952ak = false;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.le.lh
    public final void ouw(boolean z3, int i4, int i10, boolean z10, boolean z11) {
        int i11 = this.vrp;
        if (i11 != i4) {
            if (this.zrz != null) {
                if (i11 == 0 && i4 == jvy() - 1) {
                    this.zrz.ouw("SwiperView://reloop", 1);
                    Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
                }
                if (this.vrp == jvy() - 1 && i4 == 0) {
                    this.zrz.ouw("SwiperView://reloop", 0);
                    Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
                }
            }
            bly blyVar = this.zrz;
            if (blyVar != null) {
                blyVar.ouw("SwiperView://slide", Integer.valueOf(this.vrp), Integer.valueOf(i4), Integer.valueOf(!this.f6954rh ? 1 : 0));
            }
            this.vrp = i4;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z3 + "; position=" + i4 + "; loopPosition=" + i10 + "; isFirst=" + z10 + "; isLast=" + z11);
    }

    @Override // com.bytedance.adsdk.ugeno.le.lh
    public final void ouw(boolean z3, int i4) {
        if (i4 == 0) {
            if (!z3) {
                this.f6952ak = true;
            }
            this.f6954rh = false;
        } else if (i4 == 1) {
            this.f6954rh = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z3 + "; state=" + i4);
    }

    private void ouw(ryl rylVar) {
        if (this.hsa) {
            rylVar.fkw = new com.bytedance.adsdk.ugeno.core.fkw() { // from class: com.bytedance.adsdk.ugeno.vt.1
                @Override // com.bytedance.adsdk.ugeno.core.fkw
                public final void ouw(String str) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && vt.this.fkw != null) {
                        ((com.bytedance.adsdk.ugeno.le.vt) vt.this.fkw).yu();
                    }
                }
            };
        }
    }
}
