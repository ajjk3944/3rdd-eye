package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import A.f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class bw extends FrameLayout implements IAnimation, mkp, rtt {
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.emc.ypw aa;
    protected float bw;
    protected View cf;
    protected float dg;
    private float emc;
    protected Context gbl;
    protected int msw;
    protected DynamicRootView qh;
    protected int ru;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.xq sba;
    protected com.bytedance.sdk.component.adexpress.dynamic.dg.uym sup;
    protected com.bytedance.sdk.component.adexpress.dynamic.dg.msw sz;
    private float ul;
    protected int uym;
    protected boolean vk;
    protected float xq;
    protected float ycc;
    private com.bytedance.sdk.component.utils.ee ylm;
    private float ypw;
    private float yzg;
    protected int zz;
    private static final View.OnTouchListener sra = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener rie = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public bw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context);
        this.gbl = context;
        this.qh = dynamicRootView;
        this.sz = mswVar;
        this.xq = mswVar.ycc();
        this.dg = mswVar.uym();
        this.bw = mswVar.msw();
        this.ycc = mswVar.zz();
        this.zz = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.xq);
        this.ru = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.dg);
        this.uym = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.bw);
        this.msw = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.ycc);
        com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar = new com.bytedance.sdk.component.adexpress.dynamic.dg.uym(mswVar.ru());
        this.sup = uymVar;
        if (uymVar.sba() > 0) {
            this.uym = (this.sup.sba() * 2) + this.uym;
            this.msw = (this.sup.sba() * 2) + this.msw;
            this.zz -= this.sup.sba();
            this.ru -= this.sup.sba();
            List<com.bytedance.sdk.component.adexpress.dynamic.dg.msw> listGbl = mswVar.gbl();
            if (listGbl != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar2 : listGbl) {
                    mswVar2.xq(mswVar2.ycc() + com.bytedance.sdk.component.adexpress.dg.uym.ypw(this.gbl, this.sup.sba()));
                    mswVar2.dg(mswVar2.uym() + com.bytedance.sdk.component.adexpress.dg.uym.ypw(this.gbl, this.sup.sba()));
                    mswVar2.emc(com.bytedance.sdk.component.adexpress.dg.uym.ypw(this.gbl, this.sup.sba()));
                    mswVar2.ypw(com.bytedance.sdk.component.adexpress.dg.uym.ypw(this.gbl, this.sup.sba()));
                }
            }
        }
        this.vk = this.sup.qh() > 0.0d;
        this.sba = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.xq();
    }

    public boolean bw() {
        com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar = this.sup;
        return (uymVar == null || uymVar.sb() == 0) ? false : true;
    }

    public boolean dg() throws JSONException {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.cf;
        if (view == null) {
            view = this;
        }
        if (bw()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = sra;
            onClickListener = rie;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int iEmc = com.bytedance.sdk.component.adexpress.dynamic.ypw.emc.emc(this.sup);
            if (iEmc == 2 || iEmc == 3) {
                view.setOnClickListener(rie);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        emc(view);
        ypw(view);
        return true;
    }

    public void emc(int i) {
        com.bytedance.sdk.component.adexpress.dynamic.dg.uym uymVar = this.sup;
        if (uymVar != null && uymVar.emc(i)) {
            zz();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && (getChildAt(i3) instanceof bw)) {
                    ((bw) childAt).emc(i);
                }
            }
        }
    }

    public Drawable getBackgroundDrawable() {
        return emc(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.vk;
    }

    public int getClickArea() {
        return this.sup.sb();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.ycc.emc getDynamicClickListener() {
        return this.qh.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.msw;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.dg.ycc getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.dg.bw bwVarRu;
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = this.sz;
        if (mswVar == null || (bwVarRu = mswVar.ru()) == null) {
            return null;
        }
        return bwVarRu.bw();
    }

    public int getDynamicWidth() {
        return this.uym;
    }

    public String getImageObjectFit() {
        return this.sup.wd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.yzg;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(emc(ypw(this.sup.iyl().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.ul;
    }

    public boolean msw() {
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = this.sz;
        return mswVar == null || mswVar.ru() == null || this.sz.ru().bw() == null || this.sz.ru().bw().oa() == null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        uym();
        emc();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ypw();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.sba.emc(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.xq xqVar = this.sba;
        View view = this.cf;
        if (view == null) {
            view = this;
        }
        xqVar.emc(view, i, i3);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f2) {
        this.yzg = f2;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f2) {
        this.emc = f2;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f2) {
        this.ypw = f2;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z6) {
        this.vk = z6;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f2) {
        this.ul = f2;
        this.sba.emc(this, f2);
    }

    public void uym() {
        if (msw()) {
            return;
        }
        View view = this.cf;
        if (view == null) {
            view = this;
        }
        this.aa = new com.bytedance.sdk.component.adexpress.dynamic.animation.emc.ypw(view, this.sz.ru().bw().oa());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.emc.ypw ypwVar = bw.this.aa;
                if (ypwVar != null) {
                    ypwVar.emc();
                }
            }
        });
    }

    public boolean xq() {
        zz();
        ycc();
        dg();
        return true;
    }

    public void ycc() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.uym, this.msw);
        layoutParams.topMargin = this.ru;
        int i = this.zz;
        layoutParams.leftMargin = i;
        layoutParams.setMarginStart(i);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public void ypw(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.dg.ycc yccVarBw;
        com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar = this.sz;
        if (mswVar == null || (yccVarBw = mswVar.ru().bw()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(yccVarBw.igv()));
    }

    private List<String> ypw(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z6 = false;
        int i3 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            if (str.charAt(i6) == '(') {
                i++;
                z6 = true;
            } else if (str.charAt(i6) == ')' && i - 1 == 0 && z6) {
                int i7 = i6 + 1;
                arrayList.add(str.substring(i3, i7));
                i3 = i7;
                z6 = false;
            }
        }
        return arrayList;
    }

    public void emc(View view) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.sz.msw());
            jSONObject.put("height", this.sz.zz());
            if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.emc.ul, this.sup.mxo());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.emc.ylm, this.sz.ru().ypw());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.emc.sra, this.sz.xq());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.emc.rie, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.sup.mxo());
            view.setTag(2097610715, this.sz.ru().ypw());
            view.setTag(2097610714, this.sz.xq());
            view.setTag(2097610713, jSONObject.toString());
            int iEmc = com.bytedance.sdk.component.adexpress.dynamic.ypw.emc.emc(this.sup);
            if (iEmc == 1) {
                view.setTag(2097610707, new Pair(this.sup.ee(), Long.valueOf(this.sup.db())));
                view.setTag(2097610708, Integer.valueOf(iEmc));
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mkp
    public void ypw() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.emc.ypw ypwVar = this.aa;
        if (ypwVar != null) {
            ypwVar.ypw();
        }
    }

    public Drawable emc(boolean z6, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iSf;
        if (!TextUtils.isEmpty(this.sup.iyl())) {
            try {
                String strIyl = this.sup.iyl();
                String strSubstring = strIyl.substring(strIyl.indexOf("(") + 1, strIyl.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d6 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d6 > 225.0d && d6 < 315.0d) {
                        int i = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableEmc = emc(emc(strArrSplit[0]), iArr);
                gradientDrawableEmc.setShape(0);
                gradientDrawableEmc.setCornerRadius(com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.cf()));
                return gradientDrawableEmc;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fEmc = com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.cf());
        drawable.setCornerRadius(fEmc);
        if (fEmc < 1.0f) {
            float fEmc2 = com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.xmt());
            float fEmc3 = com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.lt());
            float fEmc4 = com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.cuf());
            float fEmc5 = com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.rtt());
            float[] fArr = new float[8];
            if (fEmc2 > 0.0f) {
                fArr[0] = fEmc2;
                fArr[1] = fEmc2;
            }
            if (fEmc3 > 0.0f) {
                fArr[2] = fEmc3;
                fArr[3] = fEmc3;
            }
            if (fEmc4 > 0.0f) {
                fArr[4] = fEmc4;
                fArr[5] = fEmc4;
            }
            if (fEmc5 > 0.0f) {
                fArr[6] = fEmc5;
                fArr[7] = fEmc5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z6) {
            iSf = Color.parseColor(str);
        } else {
            iSf = this.sup.sf();
        }
        drawable.setColor(iSf);
        if (this.sup.aa() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.aa()), this.sup.vk());
        } else if (this.sup.sba() > 0) {
            drawable.setStroke(this.sup.sba(), this.sup.vk());
            drawable.setAlpha(50);
            if (f.x(this.sz, "video-vd")) {
                setLayerType(1, null);
                return new yzg((int) fEmc, this.sup.sba());
            }
        }
        return drawable;
    }

    public ypw emc(Bitmap bitmap) {
        return new emc(bitmap, null);
    }

    private Drawable[] emc(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i3 = 0;
                while (i3 < length) {
                    int i6 = i3 + 1;
                    iArr[i3] = com.bytedance.sdk.component.adexpress.dynamic.dg.uym.emc(strArrSplit[i6].substring(0, 7));
                    i3 = i6;
                }
                GradientDrawable gradientDrawableEmc = emc(emc(strArrSplit[0]), iArr);
                gradientDrawableEmc.setShape(0);
                gradientDrawableEmc.setCornerRadius(com.bytedance.sdk.component.adexpress.dg.uym.emc(this.gbl, this.sup.cf()));
                drawableArr[(list.size() - 1) - i] = gradientDrawableEmc;
            }
        }
        return drawableArr;
    }

    public GradientDrawable emc(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation emc(String str) {
        try {
            int i = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void emc() {
        if (isShown()) {
            int iEmc = com.bytedance.sdk.component.adexpress.dynamic.ypw.emc.emc(this.sup);
            if (iEmc == 2) {
                if (this.ylm == null) {
                    this.ylm = new com.bytedance.sdk.component.utils.ee(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw.4
                };
                com.bytedance.sdk.component.adexpress.ypw.sz renderRequest = this.qh.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.cf();
                    renderRequest.ylm();
                    renderRequest.yzg();
                    return;
                }
                return;
            }
            if (iEmc == 3) {
                if (this.ylm == null) {
                    this.ylm = new com.bytedance.sdk.component.utils.ee(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw.5
                };
                com.bytedance.sdk.component.adexpress.ypw.sz renderRequest2 = this.qh.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.aa();
                    renderRequest2.sra();
                    renderRequest2.sba();
                    renderRequest2.ul();
                }
            }
        }
    }
}
