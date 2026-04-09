package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
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
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class fkw extends FrameLayout implements IAnimation, bs, fak {
    protected int bly;

    /* renamed from: cf, reason: collision with root package name */
    protected Context f7229cf;
    protected float fkw;

    /* renamed from: jg, reason: collision with root package name */
    protected DynamicRootView f7230jg;
    protected View ko;

    /* renamed from: le, reason: collision with root package name */
    protected float f7231le;

    /* renamed from: lh, reason: collision with root package name */
    protected float f7232lh;
    protected com.bytedance.sdk.component.adexpress.dynamic.yu.pno mwh;
    private float ouw;
    protected int pno;
    private float qbp;
    protected int ra;
    protected boolean rn;
    protected com.bytedance.sdk.component.adexpress.dynamic.yu.ra ryl;

    /* renamed from: th, reason: collision with root package name */
    private float f7233th;
    protected int tlj;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh vm;
    private float vt;
    protected float yu;
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt zih;
    private com.bytedance.sdk.component.utils.ex zin;
    private static final View.OnTouchListener vpp = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.2
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };
    private static final View.OnClickListener jqy = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    };

    public fkw(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context);
        this.f7229cf = context;
        this.f7230jg = dynamicRootView;
        this.mwh = pnoVar;
        float f10 = pnoVar.vt;
        this.f7232lh = f10;
        this.yu = pnoVar.f7306lh;
        this.fkw = pnoVar.f7305le;
        this.f7231le = pnoVar.ra;
        this.bly = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, f10);
        this.tlj = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.yu);
        this.ra = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.fkw);
        this.pno = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.f7231le);
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.ra(pnoVar.bly);
        this.ryl = raVar;
        int i4 = raVar.yu.f7284gh;
        if (i4 > 0) {
            this.ra = (i4 * 2) + this.ra;
            this.pno = (i4 * 2) + this.pno;
            this.bly -= i4;
            this.tlj -= i4;
            List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list = pnoVar.tlj;
            if (list != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 : list) {
                    pnoVar2.vt += com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f7229cf, this.ryl.yu.f7284gh);
                    pnoVar2.f7306lh += com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f7229cf, this.ryl.yu.f7284gh);
                    pnoVar2.yu = com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f7229cf, this.ryl.yu.f7284gh);
                    pnoVar2.fkw = com.bytedance.sdk.component.adexpress.yu.ra.vt(this.f7229cf, this.ryl.yu.f7284gh);
                }
            }
        }
        this.rn = this.ryl.yu.bly > 0.0d;
        this.vm = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fak
    public void a_() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.a_();
        }
    }

    public void fkw() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ra, this.pno);
        layoutParams.topMargin = this.tlj;
        int i4 = this.bly;
        layoutParams.leftMargin = i4;
        layoutParams.setMarginStart(i4);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public Drawable getBackgroundDrawable() {
        return ouw(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.rn;
    }

    public int getClickArea() {
        return this.ryl.ryl();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.le.ouw getDynamicClickListener() {
        return this.f7230jg.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.pno;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.yu.le getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || (fkwVar = pnoVar.bly) == null) {
            return null;
        }
        return fkwVar.f7280lh;
    }

    public int getDynamicWidth() {
        return this.ra;
    }

    public String getImageObjectFit() {
        return this.ryl.yu.ln;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.f7233th;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            String strReplaceAll = this.ryl.yu.eot.replaceAll("/\\*.*\\*/", "");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            boolean z3 = false;
            int i10 = 0;
            for (int i11 = 0; i11 < strReplaceAll.length(); i11++) {
                if (strReplaceAll.charAt(i11) == '(') {
                    i4++;
                    z3 = true;
                } else if (strReplaceAll.charAt(i11) == ')' && i4 - 1 == 0 && z3) {
                    int i12 = i11 + 1;
                    arrayList.add(strReplaceAll.substring(i10, i12));
                    i10 = i12;
                    z3 = false;
                }
            }
            return new LayerDrawable(ouw(arrayList));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.qbp;
    }

    public final boolean le() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        return pnoVar == null || (fkwVar = pnoVar.bly) == null || (leVar = fkwVar.f7280lh) == null || leVar.njr == null;
    }

    public boolean lh() throws JSONException {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.ko;
        if (view == null) {
            view = this;
        }
        if (yu()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = vpp;
            onClickListener = jqy;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int iOuw = com.bytedance.sdk.component.adexpress.dynamic.vt.ouw.ouw(this.ryl);
            if (iOuw == 2 || iOuw == 3) {
                view.setOnClickListener(jqy);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.mwh.f7305le);
            jSONObject.put("height", this.mwh.ra);
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.qbp, this.ryl.yu.jae);
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.zin, this.mwh.bly.ouw);
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.vpp, this.mwh.ouw);
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.jqy, jSONObject.toString());
            } else {
                view.setTag(2097610717, this.ryl.yu.jae);
                view.setTag(2097610715, this.mwh.bly.ouw);
                view.setTag(2097610714, this.mwh.ouw);
                view.setTag(2097610713, jSONObject.toString());
                int iOuw2 = com.bytedance.sdk.component.adexpress.dynamic.vt.ouw.ouw(this.ryl);
                if (iOuw2 == 1) {
                    com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = this.ryl.yu;
                    view.setTag(2097610707, new Pair(leVar.baa, Long.valueOf(leVar.nn)));
                    view.setTag(2097610708, Integer.valueOf(iOuw2));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        ouw(view);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!le()) {
            View view = this.ko;
            if (view == null) {
                view = this;
            }
            this.zih = new com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt(view, this.mwh.bly.f7280lh.njr);
            post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.vt vtVar = fkw.this.zih;
                    if (vtVar != null) {
                        for (com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu yuVar : vtVar.ouw) {
                            try {
                                List<ObjectAnimator> list = yuVar.ouw;
                                if (list != null) {
                                    for (ObjectAnimator objectAnimator : list) {
                                        objectAnimator.start();
                                        if (yuVar.vt.bly > 0.0d) {
                                            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu.1
                                                final /* synthetic */ ObjectAnimator ouw;

                                                public AnonymousClass1(ObjectAnimator objectAnimator2) {
                                                    objectAnimator = objectAnimator2;
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationRepeat(Animator animator) {
                                                    objectAnimator.pause();
                                                    ouw ouwVar = yu.this.new ouw(objectAnimator);
                                                    ScheduledFuture<?> scheduledFutureOuw = com.bytedance.sdk.component.adexpress.yu.yu.ouw(ouwVar, (long) (yu.this.vt.bly * 1000.0d), TimeUnit.MILLISECONDS);
                                                    ouwVar.vt = scheduledFutureOuw;
                                                    yu.this.f7222lh.add(scheduledFutureOuw);
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationCancel(Animator animator) {
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationEnd(Animator animator) {
                                                }

                                                @Override // android.animation.Animator.AnimatorListener
                                                public final void onAnimationStart(Animator animator) {
                                                }
                                            });
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            });
        }
        if (isShown()) {
            int iOuw = com.bytedance.sdk.component.adexpress.dynamic.vt.ouw.ouw(this.ryl);
            if (iOuw == 2) {
                if (this.zin == null) {
                    getContext().getApplicationContext();
                    this.zin = new com.bytedance.sdk.component.utils.ex();
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.4
                };
                this.f7230jg.getRenderRequest();
                return;
            }
            if (iOuw == 3) {
                if (this.zin == null) {
                    getContext().getApplicationContext();
                    this.zin = new com.bytedance.sdk.component.utils.ex();
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw.5
                };
                this.f7230jg.getRenderRequest();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a_();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.vm.ouw(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.lh lhVar = this.vm;
        View view = this.ko;
        if (view == null) {
            view = this;
        }
        lhVar.ouw(view, i4, i10);
    }

    public final void ouw(int i4) {
        com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        if (raVar == null || (fkwVar = raVar.fkw) == null) {
            return;
        }
        if (i4 == 1) {
            raVar.yu = fkwVar.yu;
        } else {
            raVar.yu = fkwVar.f7280lh;
        }
        if (raVar.yu != null) {
            ra();
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != null && (getChildAt(i10) instanceof fkw)) {
                    ((fkw) childAt).ouw(i4);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.f7233th = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.ouw = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.vt = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z3) {
        this.rn = z3;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.qbp = f10;
        this.vm.ouw(this, f10);
    }

    public final boolean vt() {
        ra();
        fkw();
        lh();
        return true;
    }

    public boolean yu() {
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        return (raVar == null || raVar.ryl() == 0) ? false : true;
    }

    public final void ouw(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh;
        if (pnoVar == null || (leVar = pnoVar.bly.f7280lh) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(leVar.zjp));
    }

    public final Drawable ouw(boolean z3, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iMwh;
        if (!TextUtils.isEmpty(this.ryl.yu.eot)) {
            try {
                String str2 = this.ryl.yu.eot;
                String strSubstring = str2.substring(str2.indexOf("(") + 1, str2.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i4 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i4;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableOuw = ouw(ouw(strArrSplit[0]), iArr);
                gradientDrawableOuw.setShape(0);
                gradientDrawableOuw.setCornerRadius(com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.ouw));
                return gradientDrawableOuw;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fOuw = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.ouw);
        drawable.setCornerRadius(fOuw);
        if (fOuw < 1.0f) {
            float fOuw2 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.lgp);
            float fOuw3 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.zrz);
            float fOuw4 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.wbf);
            float fOuw5 = com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.eay);
            float[] fArr = new float[8];
            if (fOuw2 > 0.0f) {
                fArr[0] = fOuw2;
                fArr[1] = fOuw2;
            }
            if (fOuw3 > 0.0f) {
                fArr[2] = fOuw3;
                fArr[3] = fOuw3;
            }
            if (fOuw4 > 0.0f) {
                fArr[4] = fOuw4;
                fArr[5] = fOuw4;
            }
            if (fOuw5 > 0.0f) {
                fArr[6] = fOuw5;
                fArr[7] = fOuw5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z3) {
            iMwh = Color.parseColor(str);
        } else {
            iMwh = this.ryl.mwh();
        }
        drawable.setColor(iMwh);
        com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar = this.ryl;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
        float f10 = leVar.vt;
        if (f10 > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, f10), this.ryl.cf());
        } else {
            int i10 = leVar.f7284gh;
            if (i10 > 0) {
                drawable.setStroke(i10, raVar.cf());
                drawable.setAlpha(50);
                if (TextUtils.equals(this.mwh.bly.ouw, "video-vd")) {
                    setLayerType(1, null);
                    return new th((int) fOuw, this.ryl.yu.f7284gh);
                }
            }
        }
        return drawable;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
    }

    public vt ouw(Bitmap bitmap) {
        return new ouw(bitmap, null);
    }

    private Drawable[] ouw(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            String str = list.get(i4);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    iArr[i10] = com.bytedance.sdk.component.adexpress.dynamic.yu.ra.ouw(strArrSplit[i11].substring(0, 7));
                    i10 = i11;
                }
                GradientDrawable gradientDrawableOuw = ouw(ouw(strArrSplit[0]), iArr);
                gradientDrawableOuw.setShape(0);
                gradientDrawableOuw.setCornerRadius(com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.f7229cf, this.ryl.yu.ouw));
                drawableArr[(list.size() - 1) - i4] = gradientDrawableOuw;
            }
        }
        return drawableArr;
    }

    public GradientDrawable ouw(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr.length == 0) {
            return new GradientDrawable();
        }
        if (iArr.length == 1) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(iArr[0]);
            return gradientDrawable;
        }
        return new GradientDrawable(orientation, iArr);
    }

    public static GradientDrawable.Orientation ouw(String str) {
        try {
            int i4 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i4 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i4 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i4 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }
}
