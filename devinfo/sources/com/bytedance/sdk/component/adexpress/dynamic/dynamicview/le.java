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
import com.applovin.shadow.okio.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class le extends fkw {
    private static String qbp = "";
    private Runnable ouw;

    /* renamed from: th, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.lh.bly f7234th;
    private Runnable vt;
    private volatile boolean zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh implements com.bytedance.sdk.component.fkw.pno {
        private final WeakReference<Context> ouw;
        private final int vt;

        public lh(Context context, int i4) {
            this.ouw = new WeakReference<>(context);
            this.vt = i4;
        }

        @Override // com.bytedance.sdk.component.fkw.pno
        public final Bitmap ouw(Bitmap bitmap) {
            Context context = this.ouw.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.yu.ouw.ouw(context, bitmap, this.vt);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements com.bytedance.sdk.component.fkw.rn {

        /* renamed from: lh, reason: collision with root package name */
        private final com.bytedance.sdk.component.adexpress.dynamic.yu.pno f7235lh;
        private final WeakReference<View> ouw;
        private final WeakReference<DynamicRootView> vt;

        public ouw(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
            this.ouw = new WeakReference<>(view);
            this.vt = new WeakReference<>(dynamicRootView);
            this.f7235lh = pnoVar;
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i4, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Drawable bitmapDrawable;
            com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
            View view = this.ouw.get();
            Object objVt = cfVar.vt();
            if (objVt instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objVt);
            } else if (objVt instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.i(objVt)) {
                    a.c(objVt).start();
                }
                bitmapDrawable = (Drawable) objVt;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
                DynamicRootView dynamicRootView = this.vt.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().ouw) || "splash_ad".equals(dynamicRootView.getRenderRequest().ouw)) {
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
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.f7235lh;
            if (pnoVar == null || (fkwVar = pnoVar.bly) == null || 6 != fkwVar.ouw() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements com.bytedance.sdk.component.fkw.rn {
        private final WeakReference<View> ouw;
        private final WeakReference<fkw> vt;

        public vt(View view, fkw fkwVar) {
            this.ouw = new WeakReference<>(view);
            this.vt = new WeakReference<>(fkwVar);
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(int i4, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.fkw.rn
        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
            Object objVt;
            fkw fkwVar;
            View view = this.ouw.get();
            if (view == null || (objVt = cfVar.vt()) == null || cfVar.lh() == null || (fkwVar = this.vt.get()) == null || !(objVt instanceof Bitmap)) {
                return;
            }
            view.setBackground(fkwVar.ouw((Bitmap) objVt));
        }
    }

    public le(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.zin = true;
        setTag(Integer.valueOf(getClickArea()));
        String str = pnoVar.bly.ouw;
        if ("logo-union".equals(str)) {
            dynamicRootView.setLogoUnionHeight(this.pno - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.ouw() + this.ryl.vt())));
        } else if ("scoreCountWithIcon".equals(str)) {
            dynamicRootView.setScoreCountWithIcon(this.pno - ((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, this.ryl.ouw() + this.ryl.vt())));
        }
    }

    private static String getBuildModel() {
        String str;
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.component.utils.tc.ouw)) {
                str = Build.MODEL;
                com.bytedance.sdk.component.utils.tc.ouw = str;
            } else {
                str = com.bytedance.sdk.component.utils.tc.ouw;
            }
            qbp = str;
        } catch (Throwable unused) {
            qbp = Build.MODEL;
        }
        if (TextUtils.isEmpty(qbp)) {
            qbp = Build.MODEL;
        }
        return qbp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable lh(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                if (jSONArray.getString(i4).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i4));
                } else if (jSONArray.getString(i4).endsWith("deg")) {
                    string = jSONArray.getString(i4);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(((String) arrayList.get(i10)).substring(0, 7));
            }
            GradientDrawable gradientDrawableOuw = ouw(fkw.ouw(string), iArr);
            gradientDrawableOuw.setShape(0);
            gradientDrawableOuw.setCornerRadius(com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.ouw));
            return gradientDrawableOuw;
        } catch (Throwable unused) {
            return null;
        }
    }

    private String vt(String str) {
        try {
            Map<String, String> map = this.f7230jg.getRenderRequest().ra;
            if (map != null && map.size() > 0) {
                return map.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.ra, this.pno);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        final View view = this.ko;
        if (view == null) {
            view = this;
        }
        double d10 = this.mwh.bly.f7280lh.tlj;
        if (d10 < 90.0d && d10 > 0.0d) {
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le.2
                @Override // java.lang.Runnable
                public final void run() {
                    le.this.setVisibility(8);
                }
            }, (long) (d10 * 1000.0d));
        }
        double d11 = this.mwh.bly.f7280lh.bly;
        if (d11 > 0.0d) {
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (le.this.mwh.bly.f7280lh.njr != null) {
                        return;
                    }
                    view.setVisibility(0);
                    le.this.setVisibility(0);
                }
            }, (long) (d11 * 1000.0d));
        }
        if (!TextUtils.isEmpty(this.ryl.yu.tc) && this.zin) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.ryl.yu;
            int i4 = leVar.euf;
            int i10 = leVar.f7292sd;
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le.4
                @Override // java.lang.Runnable
                public final void run() {
                    DynamicRootView dynamicRootView = le.this.f7230jg;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        le leVar2 = le.this;
                        le leVar3 = le.this;
                        leVar2.f7234th = new com.bytedance.sdk.component.adexpress.dynamic.lh.bly(leVar3.f7229cf, leVar3, leVar3.ryl);
                    } else {
                        com.bytedance.sdk.component.adexpress.vt.mwh renderRequest = le.this.f7230jg.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.tlj();
                        tljVar.ouw = renderRequest.f7396cf;
                        tljVar.vt = renderRequest.ryl;
                        tljVar.f7310lh = renderRequest.mwh;
                        tljVar.f7309le = renderRequest.f7402th;
                        tljVar.ra = renderRequest.qbp;
                        tljVar.pno = renderRequest.zin;
                        tljVar.yu = renderRequest.f7397jg;
                        tljVar.fkw = renderRequest.ko;
                        le leVar4 = le.this;
                        le leVar5 = le.this;
                        leVar4.f7234th = new com.bytedance.sdk.component.adexpress.dynamic.lh.bly(leVar5.f7229cf, leVar5, leVar5.ryl, tljVar, renderRequest);
                    }
                    le leVar6 = le.this;
                    leVar6.ouw((View) leVar6.f7234th);
                    if (le.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) le.this.getParent()).setClipChildren(false);
                    }
                    le.this.setClipChildren(false);
                    le.this.f7234th.setTag(2);
                    le.ouw((ViewGroup) le.this);
                    le leVar7 = le.this;
                    leVar7.addView(leVar7.f7234th, new FrameLayout.LayoutParams(-1, -1));
                    com.bytedance.sdk.component.adexpress.dynamic.lh.ra raVar = le.this.f7234th.vt;
                    if (raVar != null) {
                        raVar.ouw();
                    }
                }
            };
            this.ouw = runnable;
            postDelayed(runnable, i4 * 1000);
            if (!this.ryl.yu.qld && i10 < Integer.MAX_VALUE && i4 < i10) {
                Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        le leVar2 = le.this;
                        if (leVar2.f7234th != null) {
                            le.ouw(leVar2);
                            com.bytedance.sdk.component.adexpress.dynamic.lh.ra raVar = le.this.f7234th.vt;
                            if (raVar != null) {
                                raVar.vt();
                            }
                            le.this.f7234th.setVisibility(4);
                            le leVar3 = le.this;
                            leVar3.removeView(leVar3.f7234th);
                        }
                    }
                };
                this.vt = runnable2;
                postDelayed(runnable2, i10 * 1000);
            }
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.ouw);
            removeCallbacks(this.vt);
        } catch (Exception unused) {
        }
    }

    public boolean ra() {
        int iMwh;
        int iJg;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.ko;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        int iRyl = this.ryl.ryl();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pnoVar.bly.ouw);
        sb2.append(":");
        sb2.append(pnoVar.ouw);
        if (pnoVar.bly.f7280lh != null) {
            sb2.append(":");
            sb2.append(pnoVar.bly.f7280lh.mq);
        }
        sb2.append(":");
        sb2.append(iRyl);
        setContentDescription(sb2.toString());
        String str = this.ryl.yu.zjq;
        String str2 = null;
        String strOuw = (TextUtils.isEmpty(str) || (dynamicRootView = this.f7230jg) == null || dynamicRootView.getRenderRequest() == null || this.f7230jg.getRenderRequest().ouw() == null || (jSONObjectOptJSONObject = this.f7230jg.getRenderRequest().ouw().optJSONObject("creative")) == null) ? null : ouw(jSONObjectOptJSONObject.opt(str));
        if (TextUtils.isEmpty(strOuw)) {
            strOuw = this.ryl.yu.f7285jg;
        }
        com.bytedance.sdk.component.adexpress.ouw.ouw.lh lhVar = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f7383lh;
        if (lhVar != null) {
            iMwh = lhVar.mwh();
            iJg = lhVar.jg();
        } else {
            iMwh = 0;
            iJg = 0;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        if (leVar.odc) {
            int i4 = leVar.ycd;
            String str3 = raVar.vt;
            com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(str3).ouw(this.ra).vt(this.pno).yu(iMwh).fkw(iJg).ouw(vt(str3)).lh(2).ouw(new lh(this.f7229cf, i4)).vt(new vt(view, this));
        } else if (!TextUtils.isEmpty(strOuw)) {
            if (!strOuw.startsWith("http:") && !strOuw.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.f7230jg;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    str2 = this.f7230jg.getRenderRequest().jqy;
                }
                strOuw = com.bytedance.sdk.component.adexpress.dynamic.fkw.bly.vt(strOuw, str2);
            }
            com.bytedance.sdk.component.fkw.tlj tljVarLh = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().yu.ouw(strOuw).ouw(this.ra).vt(this.pno).yu(iMwh).fkw(iJg).ouw(vt(strOuw)).lh(1);
            if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
                tljVarLh.ouw(Bitmap.Config.ARGB_8888);
            }
            tljVarLh.vt(new ouw(view, this.f7230jg, this.mwh));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.ryl.yu.kfa > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        le leVar2 = le.this;
                        if (leVar2.ryl.yu.ixm > 0) {
                            Drawable drawableLh = leVar2.lh(leVar2.f7230jg.getBgMaterialCenterCalcColor().get(Integer.valueOf(le.this.ryl.yu.ixm)));
                            if (drawableLh == null) {
                                le leVar3 = le.this;
                                drawableLh = leVar3.ouw(true, leVar3.f7230jg.getBgMaterialCenterCalcColor().get(Integer.valueOf(le.this.ryl.yu.ixm)));
                            }
                            if (drawableLh != null) {
                                view.setBackground(drawableLh);
                                return;
                            }
                            View view2 = view;
                            le leVar4 = le.this;
                            view2.setBackground(leVar4.ouw(true, leVar4.f7230jg.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.ryl.yu.kfa * 1000.0d));
        }
        View view2 = this.ko;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.lh()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.vt()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu()), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.ouw()));
        }
        if (this.rn || this.ryl.yu.bly > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    public static /* synthetic */ boolean ouw(le leVar) {
        leVar.zin = false;
        return false;
    }

    private static String ouw(Object obj) {
        while (!(obj instanceof String)) {
            if (obj instanceof JSONArray) {
                obj = ((JSONArray) obj).opt(0);
            } else {
                if (!(obj instanceof JSONObject)) {
                    return null;
                }
                obj = ((JSONObject) obj).optString("url");
            }
        }
        return (String) obj;
    }

    public static /* synthetic */ void ouw(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
            if (viewGroup.getChildAt(i4) instanceof com.bytedance.sdk.component.adexpress.dynamic.lh.bly) {
                viewGroup.removeViewAt(i4);
            }
        }
    }
}
