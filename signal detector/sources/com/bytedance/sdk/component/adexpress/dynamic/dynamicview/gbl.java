package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import U4.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class gbl extends ycc {
    private String emc;

    public static class emc implements com.bytedance.sdk.component.bw.msw {
        private final WeakReference<Context> emc;

        public emc(Context context) {
            this.emc = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.bw.msw
        public Bitmap emc(Bitmap bitmap) {
            Context context = this.emc.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.dg.emc.emc(context, bitmap, 25);
            }
            return null;
        }
    }

    public static class ypw implements com.bytedance.sdk.component.bw.vk {
        private WeakReference<View> emc;
        private Resources ypw;

        public ypw(View view, Resources resources) {
            this.emc = new WeakReference<>(view);
            this.ypw = resources;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            Object objYpw;
            View view = this.emc.get();
            if (view == null || (objYpw = gblVar.ypw()) == null || gblVar.xq() == null) {
                return;
            }
            if (objYpw instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.ypw, (Bitmap) objYpw));
            } else if (objYpw instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && e.t(objYpw)) {
                    a.j(objYpw).start();
                }
                view.setBackground((Drawable) objYpw);
            }
        }
    }

    public gbl(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        if (!TextUtils.isEmpty(this.sup.rig()) && mswVar.yzg()) {
            com.bytedance.sdk.component.adexpress.ycc.ru ruVar = new com.bytedance.sdk.component.adexpress.ycc.ru(context);
            ruVar.setAnimationsLoop(this.sup.pe());
            ruVar.setImageLottieTosPath(this.sup.rig());
            ruVar.setLottieAppNameMaxLength(this.sup.pm());
            ruVar.setLottieAdTitleMaxLength(this.sup.bv());
            ruVar.setLottieAdDescMaxLength(this.sup.yid());
            ruVar.setData(mswVar.ul());
            this.cf = ruVar;
        } else if (this.sup.cf() > 0.0f) {
            com.bytedance.sdk.component.adexpress.ycc.ee eeVar = new com.bytedance.sdk.component.adexpress.ycc.ee(context);
            this.cf = eeVar;
            eeVar.setXRound((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, this.sup.cf()));
            ((com.bytedance.sdk.component.adexpress.ycc.ee) this.cf).setYRound((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, this.sup.cf()));
        } else if (!msw() && "arrowButton".equals(mswVar.ru().ypw())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.ypw ypwVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ypw(context);
            ypwVar.setBrickNativeValue(this.sup);
            this.cf = ypwVar;
        } else if (com.bytedance.sdk.component.adexpress.dg.zz.ypw(this.sup.gbl())) {
            this.cf = new com.bytedance.sdk.component.adexpress.ycc.sz(context);
        } else {
            this.cf = new ImageView(context);
        }
        this.emc = getImageKey();
        this.cf.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(mswVar.ru().ypw())) {
            if (this.sup.ypw() > 0 || this.sup.emc() > 0) {
                int iMin = Math.min(this.uym, this.msw);
                this.uym = iMin;
                this.msw = Math.min(iMin, this.msw);
                this.zz = (int) (com.bytedance.sdk.component.adexpress.dg.uym.emc(context, (this.sup.emc() / 2) + this.sup.ypw() + 0.5f) + this.zz);
            } else {
                int iMax = Math.max(this.uym, this.msw);
                this.uym = iMax;
                this.msw = Math.max(iMax, this.msw);
            }
            this.sup.emc(this.uym / 2);
        }
        addView(this.cf, new FrameLayout.LayoutParams(this.uym, this.msw));
    }

    private boolean emc() {
        String strSup = this.sup.sup();
        if (this.sup.ul()) {
            return true;
        }
        if (TextUtils.isEmpty(strSup)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strSup);
            return Math.abs((((float) this.uym) / (((float) this.msw) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> mapGbl = this.qh.getRenderRequest().gbl();
        if (mapGbl == null || mapGbl.size() <= 0) {
            return null;
        }
        return mapGbl.get(this.sup.gbl());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.cf).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !w1.a.d(drawable)) {
            return;
        }
        w1.a.b(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.cf).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !w1.a.d(drawable)) {
            return;
        }
        w1.a.b(drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        int iVk;
        super.zz();
        if (!TextUtils.isEmpty(this.sup.rig())) {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iCf = 0;
        if ("arrowButton".equals(this.sz.ru().ypw())) {
            ((ImageView) this.cf).setImageResource(com.bytedance.sdk.component.utils.rie.dg(this.gbl, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.cf).getDrawable() != null) {
                ((ImageView) this.cf).getDrawable().setAutoMirrored(true);
            }
            this.cf.setPadding(0, 0, 0, 0);
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.cf.setBackgroundColor(this.sup.sf());
        String strXq = this.sz.ru().xq();
        if ("user".equals(strXq)) {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.cf).setColorFilter(this.sup.uym());
            ((ImageView) this.cf).setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.cf;
            int i = this.uym;
            imageView.setPadding(i / 10, this.msw / 5, i / 10, 0);
        } else if (strXq != null && strXq.startsWith("@")) {
            try {
                ((ImageView) this.cf).setImageResource(Integer.parseInt(strXq.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.bw.cf cfVarBw = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().bw();
        String strGbl = this.sup.gbl();
        if (!TextUtils.isEmpty(strGbl) && !strGbl.startsWith("http:") && !strGbl.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.qh;
            strGbl = com.bytedance.sdk.component.adexpress.dynamic.bw.zz.ypw(strGbl, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.qh.getRenderRequest().hxp());
        }
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        if (xqVarXq != null) {
            iCf = xqVarXq.cf();
            iVk = xqVarXq.vk();
        } else {
            iVk = 0;
        }
        com.bytedance.sdk.component.bw.ru ruVarBw = cfVarBw.emc(strGbl).emc(this.emc).emc(this.uym).ypw(this.msw).dg(iCf).bw(iVk);
        String strQh = this.qh.getRenderRequest().qh();
        if (!TextUtils.isEmpty(strQh)) {
            ruVarBw.ypw(strQh);
        }
        if (emc()) {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.FIT_CENTER);
            ruVarBw.emc(Bitmap.Config.ARGB_4444).xq(2).emc(new emc(this.gbl)).emc(new ypw(this.cf, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                ruVarBw.xq(1).emc((ImageView) this.cf);
            }
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.cf instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.cf).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }
}
