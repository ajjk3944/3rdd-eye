package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.sup;
import com.bytedance.adsdk.ugeno.dg.ycc;
import com.bytedance.adsdk.ugeno.dg.zz;
import com.bytedance.adsdk.ugeno.uym.msw;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.adsdk.ugeno.ypw.emc<com.bytedance.adsdk.ugeno.ycc.ypw> implements com.bytedance.adsdk.ugeno.ycc.xq {
    private float av;
    private int cwv;
    private boolean dm;
    private String dor;
    private int dpk;
    private float etw;
    private float fxt;
    private boolean ge;
    private float gyw;
    private boolean hh;
    private int hs;
    private int iat;
    private String igv;
    private int knr;
    private float kv;
    private float nx;
    private float oa;
    private float oug;
    private JSONArray oz;
    private boolean qp;
    private boolean rr;
    private float sg;
    private float sx;
    private boolean tc;
    private boolean xst;
    private int ya;
    private String zhk;

    public ypw(Context context) {
        super(context);
        this.dpk = 0;
        this.hh = true;
        this.ge = true;
        this.oa = 500.0f;
        this.nx = 2000.0f;
        this.zhk = "slide";
        this.dor = "dot";
        this.sg = 8.0f;
        this.etw = 8.0f;
        this.kv = 50.0f;
        this.gyw = 90.0f;
        this.qp = false;
        this.iat = Color.parseColor("#666666");
        this.hs = Color.parseColor("#ffffff");
        this.igv = "row";
        this.sx = 1.0f;
        this.av = 0.0f;
        this.oug = 0.0f;
        this.fxt = 0.0f;
        this.knr = 0;
        this.ya = 0;
        this.tc = true;
        this.xst = false;
        this.rr = true;
        float fEmc = msw.emc(this.ypw, 8.0f);
        this.sg = fEmc;
        this.etw = fEmc;
    }

    private void ffd() throws JSONException {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.size(); i10++) {
            com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.get(i10);
            if (xqVar != null) {
                sup supVar = new sup(this.ypw);
                emc(supVar);
                supVar.emc(this.vhn);
                ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).emc((com.bytedance.adsdk.ugeno.ycc.ypw) supVar.emc(xqVar.xmt(), this.dg, (JSONObject) null));
            }
        }
    }

    private void msw(int i10) {
        zz zzVar = this.kkn;
        if (zzVar == null) {
            return;
        }
        zzVar.emc("SwiperView://slide", Integer.valueOf(this.cwv), Integer.valueOf(i10), Integer.valueOf(!this.dm ? 1 : 0));
    }

    private int ndl() {
        if (this.knr == 1) {
            List<com.bytedance.adsdk.ugeno.ypw.xq<View>> list = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.oz;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void uym(int i10) {
        if (this.kkn == null) {
            return;
        }
        if (this.cwv == 0 && i10 == ndl() - 1) {
            this.kkn.emc("SwiperView://reloop", 1);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor FIRST_TO_LAST");
        }
        if (this.cwv == ndl() - 1 && i10 == 0) {
            this.kkn.emc("SwiperView://reloop", 0);
            Log.d("BaseSwiper", "onPageSelected: reloop monitor LAST_TO_FIRST");
        }
    }

    private void wd() {
        List<com.bytedance.adsdk.ugeno.ypw.xq<View>> list = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar = ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.get(0);
        if (this.oz == null) {
            return;
        }
        for (int i10 = 0; i10 < this.oz.length(); i10++) {
            sup supVar = new sup(this.ypw);
            emc(supVar);
            supVar.emc(this.vhn);
            try {
                JSONObject jSONObjectOptJSONObject = this.oz.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.dg.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.dg.put("$item", jSONObjectOptJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).emc((com.bytedance.adsdk.ugeno.ycc.ypw) supVar.emc(xqVar.xmt(), this.dg, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void dg() throws Resources.NotFoundException {
        ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).sz(((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).getCurrentItem() - 1);
    }

    public void xq() throws Resources.NotFoundException {
        ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).sz(((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).getCurrentItem() + 1);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public View emc() {
        com.bytedance.adsdk.ugeno.ycc.ypw ypwVar = new com.bytedance.adsdk.ugeno.ycc.ypw(this.ypw);
        this.bw = ypwVar;
        ypwVar.emc((dg) this);
        return this.bw;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc, com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException, Resources.NotFoundException {
        super.ypw();
        ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).xq((int) this.oa).bw(this.xst).emc(this.dor).emc(this.sg).ypw(this.etw).xq(this.kv).dg(this.gyw).ypw(this.igv).emc(this.dpk).ypw().dg(this.hh).emc(this.ge).ypw((int) this.oa).dg((int) this.nx).ypw(this.tc).xq(this.qp).ycc(this.iat).bw(this.hs).msw((int) this.oug).zz((int) this.fxt).uym((int) this.av).bw(this.sx).xq(this.zhk).sz(this.ya);
        ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).setOnPageChangeListener(this);
        if (this.knr == 1) {
            ffd();
        } else {
            wd();
        }
        ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).xq();
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        if (xqVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.add(xqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.emc
    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, ViewGroup.LayoutParams layoutParams) {
        if (xqVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ypw.emc) this).emc.add(xqVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void emc(String str, String str2) {
        super.emc(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startIndex":
                this.ya = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                break;
            case "indicatorColor":
                this.iat = com.bytedance.adsdk.ugeno.uym.emc.emc(str2, this.iat);
                break;
            case "indicatorStyle":
                this.dor = str2;
                break;
            case "indicatorWidth":
                this.sg = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.etw = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 8.0f));
                break;
            case "nextMargin":
                this.fxt = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "driveMode":
                this.knr = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0);
                break;
            case "effect":
                this.zhk = str2;
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.dpk = 1;
                    break;
                } else {
                    this.dpk = 0;
                    break;
                }
            case "disableOnInteraction":
                this.xst = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                break;
            case "indicator":
                this.qp = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, false);
                break;
            case "indicatorX":
                this.kv = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 50.0f);
                break;
            case "indicatorY":
                this.gyw = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 90.0f);
                break;
            case "previousMargin":
                this.oug = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "loop":
                this.hh = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "delay":
                this.nx = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 2000.0f);
                break;
            case "speed":
                this.oa = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.igv = str2;
                break;
            case "allowTouchMove":
                this.tc = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "pageCount":
                this.sx = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 1.0f);
                break;
            case "pageMargin":
                this.av = msw.emc(this.ypw, com.bytedance.adsdk.ugeno.uym.xq.emc(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.hs = com.bytedance.adsdk.ugeno.uym.emc.emc(str2, this.hs);
                break;
            case "autoplay":
                this.ge = com.bytedance.adsdk.ugeno.uym.xq.emc(str2, true);
                break;
            case "dataList":
                this.oz = com.bytedance.adsdk.ugeno.uym.ypw.emc(str2, (JSONArray) null);
                break;
        }
    }

    public void emc(int i10) throws Resources.NotFoundException {
        if (((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).getCurrentItem() != i10) {
            ((com.bytedance.adsdk.ugeno.ycc.ypw) this.bw).sz(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.xq
    public void emc(boolean z10, int i10, float f10, int i11) {
        Log.d("BaseSwiper", "onPageScrolled: loop=" + z10 + "; position=" + i10 + "; positionOffset=" + f10 + "; positionOffsetPixels=" + i11);
        emc(z10, i10, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.xq
    public void emc(boolean z10, int i10, int i11, boolean z11, boolean z12) {
        if (this.cwv != i10) {
            uym(i10);
            msw(i10);
            this.cwv = i10;
        }
        Log.d("BaseSwiper", "onPageSelected: loop=" + z10 + "; position=" + i10 + "; loopPosition=" + i11 + "; isFirst=" + z11 + "; isLast=" + z12);
    }

    @Override // com.bytedance.adsdk.ugeno.ycc.xq
    public void emc(boolean z10, int i10) {
        if (i10 == 0) {
            if (!z10) {
                this.rr = true;
            }
            this.dm = false;
        } else if (i10 == 1) {
            this.dm = true;
        }
        Log.d("BaseSwiper", "onPageScrollStateChanged: loop=" + z10 + "; state=" + i10);
    }

    private void emc(boolean z10, int i10, float f10) {
        if (this.kkn != null && !z10 && i10 == ndl() - 1 && f10 == 0.0f && this.rr) {
            this.kkn.emc("SwiperView://finish", new Object[0]);
            Log.d("BaseSwiper", "onPageScrolled: finish monitor");
            this.rr = false;
        }
    }

    private void emc(sup supVar) {
        if (this.xst) {
            supVar.emc(new com.bytedance.adsdk.ugeno.core.bw() { // from class: com.bytedance.adsdk.ugeno.ypw.1
                @Override // com.bytedance.adsdk.ugeno.core.bw
                public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar, String str, List<ycc.emc> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.ypw.xq) ypw.this).bw != null) {
                        ((com.bytedance.adsdk.ugeno.ycc.ypw) ((com.bytedance.adsdk.ugeno.ypw.xq) ypw.this).bw).ycc();
                    }
                }
            });
        }
    }
}
