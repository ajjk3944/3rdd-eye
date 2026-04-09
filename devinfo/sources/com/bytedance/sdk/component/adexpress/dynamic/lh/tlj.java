package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.text.TextUtils;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj {
    public static ra ouw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar) {
        String str;
        String str2;
        if (context == null || fkwVar == null || raVar == null) {
            return null;
        }
        str = raVar.yu.tc;
        str2 = mwhVar.jqy;
        str.getClass();
        switch (str) {
            case "0":
                return new fkw(context, fkwVar, raVar);
            case "1":
                return new lh(context, fkwVar);
            case "2":
                return new vt(context, raVar);
            case "5":
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
                return leVar.ms == 1 ? new zih(context, fkwVar, raVar, leVar.zin) : new rn(context, fkwVar, raVar);
            case "6":
            case "11":
                return new jg(context, raVar);
            case "7":
            case "14":
                return new ryl(context, raVar);
            case "8":
                return new mwh(context, fkwVar);
            case "9":
            case "16":
                return new ko(context, fkwVar, raVar, str, tljVar.ouw, tljVar.vt, tljVar.yu, tljVar.ra);
            case "10":
                return new yu(context, fkwVar, raVar);
            case "12":
                return new rn(context, fkwVar, raVar);
            case "13":
                return new zih(context, fkwVar, raVar);
            case "17":
            case "18":
                return new th(context, fkwVar, raVar, str, tljVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new cf(context, fkwVar, raVar, h.s(str2, "static/lotties/glass-swipe/glass-swipe.json"), "20");
                }
                return new cf(context, fkwVar, raVar, TextUtils.isEmpty(str2) ? null : h.s(str2, "brush_mask.json"), "20");
            case "22":
                return com.bytedance.sdk.component.adexpress.yu.vt() ? new cf(context, fkwVar, raVar, h.s(str2, "static/lotties/202327swiper-up-star/index.json"), "22") : new vm(context, raVar);
            case "23":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new cf(context, fkwVar, raVar, h.s(str2, "static/lotties/202327swiper-up-star/click.json"), "23");
                }
                return null;
            case "24":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new ouw(context, fkwVar, raVar);
                }
                return new cf(context, fkwVar, raVar, TextUtils.isEmpty(str2) ? null : h.s(str2, "swiper_up_star.json"), "24");
            case "25":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new cf(context, fkwVar, raVar, h.s(str2, "static/lotties/gesture-slide.json"), "25");
                }
                return null;
            case "29":
                return new le(context, fkwVar, raVar, tljVar.ouw, tljVar.vt, tljVar.yu, tljVar.ra);
            default:
                return null;
        }
    }
}
