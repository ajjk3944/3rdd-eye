package com.bytedance.sdk.component.adexpress.dynamic.xq;

import android.content.Context;
import android.text.TextUtils;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class ru {
    public static uym emc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw bwVar, com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar, com.bytedance.sdk.component.adexpress.dynamic.dg.ru ruVar, com.bytedance.sdk.component.adexpress.ypw.sz szVar) {
        String strWo;
        String strHxp;
        if (context == null || bwVar == null || uymVar == null) {
            return null;
        }
        strWo = uymVar.wo();
        strHxp = szVar.hxp();
        strWo.getClass();
        switch (strWo) {
            case "0":
                return new bw(context, bwVar, uymVar);
            case "1":
                return new xq(context, bwVar, uymVar);
            case "2":
                return new ypw(context, bwVar, uymVar);
            case "5":
                return uymVar.yz() == 1 ? new aa(context, bwVar, uymVar, uymVar.cn()) : new vk(context, bwVar, uymVar);
            case "6":
            case "11":
                return new qh(context, bwVar, uymVar);
            case "7":
            case "14":
                return new sup(context, bwVar, uymVar);
            case "8":
                return new sz(context, bwVar, uymVar);
            case "9":
            case "16":
                return new cf(context, bwVar, uymVar, strWo, ruVar.emc(), ruVar.ypw(), ruVar.dg(), ruVar.uym());
            case "10":
                return new dg(context, bwVar, uymVar);
            case "12":
                return new vk(context, bwVar, uymVar);
            case "13":
                return new aa(context, bwVar, uymVar);
            case "17":
            case "18":
                return new yzg(context, bwVar, uymVar, strWo, ruVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                    return new gbl(context, bwVar, uymVar, AbstractC2763b.e(strHxp, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                return new gbl(context, bwVar, uymVar, TextUtils.isEmpty(strHxp) ? null : AbstractC2763b.e(strHxp, "brush_mask.json"), "20");
            case "22":
                return com.bytedance.sdk.component.adexpress.dg.ypw() ? new gbl(context, bwVar, uymVar, AbstractC2763b.e(strHxp, "static/lotties/202327swiper-up-star/index.json"), "22") : new sba(context, bwVar, uymVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                    return new gbl(context, bwVar, uymVar, AbstractC2763b.e(strHxp, "static/lotties/202327swiper-up-star/click.json"), "23");
                }
                return null;
            case "24":
                if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                    return new emc(context, bwVar, uymVar);
                }
                return new gbl(context, bwVar, uymVar, TextUtils.isEmpty(strHxp) ? null : AbstractC2763b.e(strHxp, "swiper_up_star.json"), "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                    return new gbl(context, bwVar, uymVar, AbstractC2763b.e(strHxp, "static/lotties/gesture-slide.json"), "25");
                }
                return null;
            case "29":
                return new ycc(context, bwVar, uymVar, ruVar.emc(), ruVar.ypw(), ruVar.dg(), ruVar.uym());
            default:
                return null;
        }
    }
}
