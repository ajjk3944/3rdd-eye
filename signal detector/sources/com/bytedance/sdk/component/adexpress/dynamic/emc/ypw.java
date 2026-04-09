package com.bytedance.sdk.component.adexpress.dynamic.emc;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.dg;
import com.bytedance.sdk.component.adexpress.dynamic.dg.msw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.aa;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cuf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.db;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dr;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ee;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.gbl;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hxp;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.qh;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rie;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ru;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sb;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sba;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sf;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sra;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ul;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.uym;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vk;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xmt;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.xq;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ylm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.zz;
import com.bytedance.sdk.component.adexpress.ypw.sz;

/* loaded from: classes.dex */
public class ypw {
    public static bw emc(Context context, DynamicRootView dynamicRootView, msw mswVar) {
        sz renderRequest;
        if (context == null || dynamicRootView == null || mswVar == null || mswVar.ru() == null) {
            return null;
        }
        switch (mswVar.ru().emc()) {
            case -1:
                return new xmt(context, dynamicRootView, mswVar);
            case 0:
                return new ee(context, dynamicRootView, mswVar);
            case 1:
                return new gbl(context, dynamicRootView, mswVar);
            case 2:
                return new uym(context, dynamicRootView, mswVar);
            case 3:
                return new zz(context, dynamicRootView, mswVar);
            case 4:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sz(context, dynamicRootView, mswVar);
            case 5:
                return new qh(context, dynamicRootView, mswVar);
            case 6:
            case 9:
            case 17:
                return new ycc(context, dynamicRootView, mswVar);
            case 7:
                return new cuf(context, dynamicRootView, mswVar);
            case 8:
                return new sba(context, dynamicRootView, mswVar);
            case 10:
                return new vk(context, dynamicRootView, mswVar);
            case 11:
                return new hxp(context, dynamicRootView, mswVar);
            case 12:
                return new ru(context, dynamicRootView, mswVar);
            case 13:
                return new db(context, dynamicRootView, mswVar);
            case 14:
                return new sb(context, dynamicRootView, mswVar);
            case 15:
                return dg.ypw() ? new sf(context, dynamicRootView, mswVar) : new dr(context, dynamicRootView, mswVar);
            case 16:
                return new gbl(context, dynamicRootView, mswVar);
            case 18:
                return new rie(context, dynamicRootView, mswVar);
            case 19:
                return new sra(context, dynamicRootView, mswVar);
            case 20:
                return new ul(context, dynamicRootView, mswVar);
            case 21:
                return new ylm(context, dynamicRootView, mswVar);
            case 22:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.msw(context, dynamicRootView, mswVar);
            case 23:
                return new aa(context, dynamicRootView, mswVar);
            case 24:
                return new com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dg(context, dynamicRootView, mswVar);
            case 25:
                return new sup(context, dynamicRootView, mswVar);
            case 26:
                return "vertical".equals(mswVar.ru().bw().yuz()) ? new lt(context, dynamicRootView, mswVar) : new xq(context, dynamicRootView, mswVar);
            case 27:
                return new dr(context, dynamicRootView, mswVar);
            case 28:
                if (!dg.ypw() || (renderRequest = dynamicRootView.getRenderRequest()) == null) {
                    return null;
                }
                return new cf(context, dynamicRootView, mswVar, renderRequest.hxp());
            default:
                return null;
        }
    }
}
