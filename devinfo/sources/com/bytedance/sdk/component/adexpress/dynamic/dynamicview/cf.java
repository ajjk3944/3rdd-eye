package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.shadow.okio.a;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf extends le {
    private String ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements com.bytedance.sdk.component.fkw.pno {
        private final WeakReference<Context> ouw;

        public ouw(Context context) {
            this.ouw = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.fkw.pno
        public final Bitmap ouw(Bitmap bitmap) {
            Context context = this.ouw.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(context, bitmap, 25);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements com.bytedance.sdk.component.fkw.rn {
        private WeakReference<View> ouw;
        private Resources vt;

        public vt(View view, Resources resources) {
            this.ouw = new WeakReference<>(view);
            this.vt = resources;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i4, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt;
            View view = this.ouw.get();
            if (view == null || (objVt = cfVar.vt()) == null || cfVar.lh() == null) {
                return;
            }
            if (objVt instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.vt, (Bitmap) objVt));
            } else if (objVt instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.i(objVt)) {
                    a.c(objVt).start();
                }
                view.setBackground((Drawable) objVt);
            }
        }
    }

    public cf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        Uri uri;
        super(context, dynamicRootView, pnoVar);
        if (!TextUtils.isEmpty(this.ryl.yu.fn) && pnoVar.f7304jg) {
            com.bytedance.sdk.component.adexpress.le.tlj tljVar = new com.bytedance.sdk.component.adexpress.le.tlj(context);
            tljVar.setAnimationsLoop(this.ryl.yu.byv);
            tljVar.setImageLottieTosPath(this.ryl.yu.fn);
            tljVar.setLottieAppNameMaxLength(this.ryl.yu.ehk);
            tljVar.setLottieAdTitleMaxLength(this.ryl.yu.f7286ki);
            tljVar.setLottieAdDescMaxLength(this.ryl.yu.xwt);
            tljVar.setData(pnoVar.ko);
            this.ko = tljVar;
        } else if (this.ryl.yu.ouw > 0.0f) {
            com.bytedance.sdk.component.adexpress.le.tc tcVar = new com.bytedance.sdk.component.adexpress.le.tc(context);
            this.ko = tcVar;
            tcVar.setXRound((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.yu.ouw));
            ((com.bytedance.sdk.component.adexpress.le.tc) this.ko).setYRound((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.yu.ouw));
        } else if (le() || !"arrowButton".equals(pnoVar.bly.ouw)) {
            String strBly = this.ryl.bly();
            boolean zEndsWith = false;
            if (!TextUtils.isEmpty(strBly) && (uri = Uri.parse(strBly)) != null) {
                String path = uri.getPath();
                if (!TextUtils.isEmpty(path)) {
                    zEndsWith = path.endsWith(".gif");
                }
            }
            if (zEndsWith) {
                this.ko = new com.bytedance.sdk.component.adexpress.le.mwh(context);
            } else {
                this.ko = new ImageView(context);
            }
        } else {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.vt vtVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.vt(context);
            vtVar.setBrickNativeValue(this.ryl);
            this.ko = vtVar;
        }
        this.ouw = getImageKey();
        this.ko.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(pnoVar.bly.ouw)) {
            if (this.ryl.vt() > 0 || this.ryl.ouw() > 0) {
                int iMin = Math.min(this.ra, this.pno);
                this.ra = iMin;
                this.pno = Math.min(iMin, this.pno);
                this.bly = (int) (com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, (this.ryl.ouw() / 2) + this.ryl.vt() + 0.5f) + this.bly);
            } else {
                int iMax = Math.max(this.ra, this.pno);
                this.ra = iMax;
                this.pno = Math.max(iMax, this.pno);
            }
            this.ryl.yu.ouw = this.ra / 2;
        }
        addView(this.ko, new FrameLayout.LayoutParams(this.ra, this.pno));
    }

    private String getImageKey() {
        Map<String, String> map = this.f7230jg.getRenderRequest().ra;
        if (map == null || map.size() <= 0) {
            return null;
        }
        return map.get(this.ryl.bly());
    }

    private boolean pno() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        String str = raVar.f7307le;
        if (raVar.yu.odc) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return Math.abs((((float) this.ra) / (((float) this.pno) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.ko).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.i(drawable)) {
            return;
        }
        a.c(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.ko).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.i(drawable)) {
            return;
        }
        a.c(drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        int iJg;
        super.ra();
        if (!TextUtils.isEmpty(this.ryl.yu.fn)) {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iMwh = 0;
        if ("arrowButton".equals(this.mwh.bly.ouw)) {
            ((ImageView) this.ko).setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this.f7229cf, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.ko).getDrawable() != null) {
                ((ImageView) this.ko).getDrawable().setAutoMirrored(true);
            }
            this.ko.setPadding(0, 0, 0, 0);
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.ko.setBackgroundColor(this.ryl.mwh());
        String str = this.mwh.bly.vt;
        if ("user".equals(str)) {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.ko).setColorFilter(this.ryl.le());
            ((ImageView) this.ko).setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.ko;
            int i4 = this.ra;
            imageView.setPadding(i4 / 10, this.pno / 5, i4 / 10, 0);
        } else if (str != null && str.startsWith("@")) {
            try {
                ((ImageView) this.ko).setImageResource(Integer.parseInt(str.substring(1)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        com.bytedance.sdk.component.fkw.ko koVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu;
        String strBly = this.ryl.bly();
        if (!TextUtils.isEmpty(strBly) && !strBly.startsWith("http:") && !strBly.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.f7230jg;
            strBly = com.bytedance.sdk.component.adexpress.dynamic.fkw.bly.vt(strBly, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.f7230jg.getRenderRequest().jqy);
        }
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh;
        if (lhVar != null) {
            iMwh = lhVar.mwh();
            iJg = lhVar.jg();
        } else {
            iJg = 0;
        }
        com.bytedance.sdk.component.fkw.tlj tljVarFkw = koVar.ouw(strBly).ouw(this.ouw).ouw(this.ra).vt(this.pno).yu(iMwh).fkw(iJg);
        String str2 = this.f7230jg.getRenderRequest().tlj;
        if (!TextUtils.isEmpty(str2)) {
            tljVarFkw.vt(str2);
        }
        if (pno()) {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.FIT_CENTER);
            tljVarFkw.ouw(Bitmap.Config.ARGB_4444).lh(2).ouw(new ouw(this.f7229cf)).vt(new vt(this.ko, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                tljVarFkw.lh(1).ouw((ImageView) this.ko);
            }
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.ko instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.ko).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }
}
