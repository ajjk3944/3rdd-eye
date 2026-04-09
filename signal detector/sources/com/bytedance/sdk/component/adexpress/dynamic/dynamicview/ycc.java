package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ycc extends bw {
    private static String ul = "";
    private Runnable emc;
    private volatile boolean ylm;
    private Runnable ypw;
    protected com.bytedance.sdk.component.adexpress.dynamic.xq.zz yzg;

    public static class emc implements com.bytedance.sdk.component.bw.vk {
        private final WeakReference<View> emc;
        private final com.bytedance.sdk.component.adexpress.dynamic.dg.msw xq;
        private final WeakReference<DynamicRootView> ypw;

        public emc(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
            this.emc = new WeakReference<>(view);
            this.ypw = new WeakReference<>(dynamicRootView);
            this.xq = mswVar;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            Drawable bitmapDrawable;
            View view = this.emc.get();
            Object objYpw = gblVar.ypw();
            if (objYpw instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objYpw);
            } else if (objYpw instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawable = (Drawable) objYpw;
                    if (w1.a.d(drawable)) {
                        w1.a.b(drawable).start();
                    }
                }
                bitmapDrawable = (Drawable) objYpw;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.dg.ypw()) {
                DynamicRootView dynamicRootView = this.ypw.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().dg()) || "splash_ad".equals(dynamicRootView.getRenderRequest().dg())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = this.xq;
            if (mswVar == null || mswVar.ru() == null || 6 != this.xq.ru().emc() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    public static class xq implements com.bytedance.sdk.component.bw.msw {
        private final WeakReference<Context> emc;
        private final int ypw;

        public xq(Context context, int i) {
            this.emc = new WeakReference<>(context);
            this.ypw = i;
        }

        @Override // com.bytedance.sdk.component.bw.msw
        public Bitmap emc(Bitmap bitmap) {
            Context context = this.emc.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.dg.emc.emc(context, bitmap, this.ypw);
            }
            return null;
        }
    }

    public static class ypw implements com.bytedance.sdk.component.bw.vk {
        private final WeakReference<View> emc;
        private final WeakReference<bw> ypw;

        public ypw(View view, bw bwVar) {
            this.emc = new WeakReference<>(view);
            this.ypw = new WeakReference<>(bwVar);
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            Object objYpw;
            bw bwVar;
            View view = this.emc.get();
            if (view == null || (objYpw = gblVar.ypw()) == null || gblVar.xq() == null || (bwVar = this.ypw.get()) == null || !(objYpw instanceof Bitmap)) {
                return;
            }
            view.setBackground(bwVar.emc((Bitmap) objYpw));
        }
    }

    public ycc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.ylm = true;
        setTag(Integer.valueOf(getClickArea()));
        String strYpw = mswVar.ru().ypw();
        if ("logo-union".equals(strYpw)) {
            dynamicRootView.setLogoUnionHeight(this.msw - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, this.sup.emc() + this.sup.ypw())));
        } else if ("scoreCountWithIcon".equals(strYpw)) {
            dynamicRootView.setScoreCountWithIcon(this.msw - ((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, this.sup.emc() + this.sup.ypw())));
        }
    }

    private static String getBuildModel() {
        try {
            ul = com.bytedance.sdk.component.utils.db.emc();
        } catch (Throwable unused) {
            ul = Build.MODEL;
        }
        if (TextUtils.isEmpty(ul)) {
            ul = Build.MODEL;
        }
        return ul;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable xq(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    string = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(((String) arrayList.get(i3)).substring(0, 7));
            }
            GradientDrawable gradientDrawableEmc = emc(emc(string), iArr);
            gradientDrawableEmc.setShape(0);
            gradientDrawableEmc.setCornerRadius(com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.cf()));
            return gradientDrawableEmc;
        } catch (Throwable unused) {
            return null;
        }
    }

    private String ypw(String str) {
        try {
            Map<String, String> mapGbl = this.qh.getRenderRequest().gbl();
            if (mapGbl != null && mapGbl.size() > 0) {
                return mapGbl.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.uym, this.msw);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.cf;
        if (view == null) {
            view = this;
        }
        double dUl = this.sz.ru().bw().ul();
        if (dUl < 90.0d && dUl > 0.0d) {
            com.bytedance.sdk.component.utils.zz.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc.2
                @Override // java.lang.Runnable
                public void run() {
                    ycc.this.setVisibility(8);
                }
            }, (long) (dUl * 1000.0d));
        }
        emc(this.sz.ru().bw().yzg(), view);
        if (!TextUtils.isEmpty(this.sup.wo())) {
            emc();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.emc);
            removeCallbacks(this.ypw);
        } catch (Exception unused) {
        }
    }

    public boolean zz() {
        int iCf;
        int iVk;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.cf;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.sz.emc(this.sup.sb()));
        String strRgy = this.sup.rgy();
        String strHxp = null;
        String strEmc = (TextUtils.isEmpty(strRgy) || (dynamicRootView = this.qh) == null || dynamicRootView.getRenderRequest() == null || this.qh.getRenderRequest().xq() == null || (jSONObjectOptJSONObject = this.qh.getRenderRequest().xq().optJSONObject("creative")) == null) ? null : emc(jSONObjectOptJSONObject.opt(strRgy));
        if (TextUtils.isEmpty(strEmc)) {
            strEmc = this.sup.ylm();
        }
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        if (xqVarXq != null) {
            iCf = xqVarXq.cf();
            iVk = xqVarXq.vk();
        } else {
            iCf = 0;
            iVk = 0;
        }
        if (this.sup.ul()) {
            int iYzg = this.sup.yzg();
            String str = this.sup.ypw;
            com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().bw().emc(str).emc(this.uym).ypw(this.msw).dg(iCf).bw(iVk).emc(ypw(str)).xq(2).emc(new xq(this.gbl, iYzg)).emc(new ypw(view, this));
        } else if (!TextUtils.isEmpty(strEmc)) {
            if (!strEmc.startsWith("http:") && !strEmc.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.qh;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strHxp = this.qh.getRenderRequest().hxp();
                }
                strEmc = com.bytedance.sdk.component.adexpress.dynamic.bw.zz.ypw(strEmc, strHxp);
            }
            com.bytedance.sdk.component.bw.ru ruVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().bw().emc(strEmc).emc(this.uym).ypw(this.msw).dg(iCf).bw(iVk).emc(ypw(strEmc)).xq(1);
            emc(ruVarXq);
            ruVarXq.emc(new emc(view, this.qh, this.sz));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.sup.dr() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (ycc.this.sup.mkp() > 0) {
                            ycc yccVar = ycc.this;
                            Drawable drawableXq = yccVar.xq(yccVar.qh.getBgMaterialCenterCalcColor().get(Integer.valueOf(ycc.this.sup.mkp())));
                            if (drawableXq == null) {
                                ycc yccVar2 = ycc.this;
                                drawableXq = yccVar2.emc(true, yccVar2.qh.getBgMaterialCenterCalcColor().get(Integer.valueOf(ycc.this.sup.mkp())));
                            }
                            if (drawableXq != null) {
                                view.setBackground(drawableXq);
                                return;
                            }
                            View view2 = view;
                            ycc yccVar3 = ycc.this;
                            view2.setBackground(yccVar3.emc(true, yccVar3.qh.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.sup.dr() * 1000.0d));
        }
        View view2 = this.cf;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.xq()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.ypw()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.dg()), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.emc()));
        }
        if (this.vk || this.sup.qh() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private String emc(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return emc(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return emc((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private static void emc(com.bytedance.sdk.component.bw.ru ruVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            ruVar.emc(Bitmap.Config.ARGB_8888);
        }
    }

    private void emc(double d6, final View view) {
        if (d6 > 0.0d) {
            com.bytedance.sdk.component.utils.zz.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc.3
                @Override // java.lang.Runnable
                public void run() {
                    if (ycc.this.sz.ru().bw().oa() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    ycc.this.setVisibility(0);
                }
            }, (long) (d6 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.xq.zz) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void emc() {
        if (this.ylm) {
            int iWa = this.sup.wa();
            int iRqm = this.sup.rqm();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = ycc.this.qh;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        ycc yccVar = ycc.this;
                        ycc yccVar2 = ycc.this;
                        yccVar.yzg = new com.bytedance.sdk.component.adexpress.dynamic.xq.zz(yccVar2.gbl, yccVar2, yccVar2.sup);
                    } else {
                        com.bytedance.sdk.component.adexpress.ypw.sz renderRequest = ycc.this.qh.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.dg.ru ruVar = new com.bytedance.sdk.component.adexpress.dynamic.dg.ru();
                        ruVar.emc(renderRequest.cf());
                        ruVar.ypw(renderRequest.vk());
                        ruVar.xq(renderRequest.aa());
                        ruVar.emc(renderRequest.sba());
                        ruVar.ypw(renderRequest.yzg());
                        ruVar.xq(renderRequest.ul());
                        ruVar.dg(renderRequest.ylm());
                        ruVar.bw(renderRequest.sra());
                        ycc yccVar3 = ycc.this;
                        ycc yccVar4 = ycc.this;
                        yccVar3.yzg = new com.bytedance.sdk.component.adexpress.dynamic.xq.zz(yccVar4.gbl, yccVar4, yccVar4.sup, ruVar, renderRequest);
                    }
                    ycc yccVar5 = ycc.this;
                    yccVar5.ypw(yccVar5.yzg);
                    if (ycc.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ycc.this.getParent()).setClipChildren(false);
                    }
                    ycc.this.setClipChildren(false);
                    ycc.this.yzg.setTag(2);
                    ycc yccVar6 = ycc.this;
                    yccVar6.emc((ViewGroup) yccVar6);
                    ycc yccVar7 = ycc.this;
                    yccVar7.addView(yccVar7.yzg, new FrameLayout.LayoutParams(-1, -1));
                    ycc.this.yzg.xq();
                }
            };
            this.emc = runnable;
            postDelayed(runnable, iWa * 1000);
            if (this.sup.wad() || iRqm >= Integer.MAX_VALUE || iWa >= iRqm) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc.5
                @Override // java.lang.Runnable
                public void run() {
                    ycc yccVar = ycc.this;
                    if (yccVar.yzg != null) {
                        yccVar.ylm = false;
                        ycc.this.yzg.dg();
                        ycc.this.yzg.setVisibility(4);
                        ycc yccVar2 = ycc.this;
                        yccVar2.removeView(yccVar2.yzg);
                    }
                }
            };
            this.ypw = runnable2;
            postDelayed(runnable2, iRqm * 1000);
        }
    }
}
