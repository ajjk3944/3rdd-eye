package com.bytedance.adsdk.ugeno.yoga.ypw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.dg;
import com.bytedance.adsdk.ugeno.emc.msw;
import com.bytedance.adsdk.ugeno.emc.uym;
import com.bytedance.adsdk.ugeno.yoga.bw;
import com.bytedance.adsdk.ugeno.yoga.gbl;
import com.bytedance.adsdk.ugeno.yoga.qh;
import com.bytedance.adsdk.ugeno.yoga.ru;
import com.bytedance.adsdk.ugeno.yoga.sz;
import com.bytedance.adsdk.ugeno.yoga.ycc;
import com.bytedance.adsdk.ugeno.yoga.zz;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class xq extends ViewGroup implements uym, com.bytedance.adsdk.ugeno.ypw.ypw {
    private msw dg;
    private final Map<View, ru> emc;
    private dg xq;
    private final ru ypw;

    public xq(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        ru ruVarEmc;
        this.ypw.emc((com.bytedance.adsdk.ugeno.yoga.uym) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.ypw.ypw) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.emc.containsKey(view)) {
            return;
        }
        if (view instanceof xq) {
            ruVarEmc = ((xq) view).getYogaNode();
        } else {
            ruVarEmc = this.emc.containsKey(view) ? this.emc.get(view) : gbl.emc();
            ruVarEmc.emc(view);
            ruVarEmc.emc((com.bytedance.adsdk.ugeno.yoga.uym) new ypw());
        }
        emc((emc) view.getLayoutParams(), ruVarEmc, view);
        this.emc.put(view, ruVarEmc);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.ypw.emc()));
        } else {
            ru ruVar = this.ypw;
            ruVar.emc(ruVarEmc, ruVar.emc());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof emc;
    }

    public void dg(View view, int i10) {
        int iEmc;
        view.setVisibility(i10);
        try {
            ru ruVar = this.emc.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iEmc = this.ypw.emc(ruVar)) == -1) {
                    return;
                }
                this.ypw.ypw(iEmc);
                view.setTag(151060224, Integer.valueOf(iEmc));
                emc(this.ypw);
                return;
            }
            if (tag == null || this.ypw.emc(ruVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.ypw.emc()) {
                this.ypw.emc(this.emc.get(view), iIntValue);
            } else {
                this.ypw.emc(this.emc.get(view), this.ypw.emc());
            }
            emc(this.ypw);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.ypw(canvas);
        }
    }

    public ru emc(View view) {
        return this.emc.get(view);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new emc(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new emc(layoutParams);
    }

    public float getBorderRadius() {
        return this.dg.emc();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getRipple() {
        return this.dg.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getRubIn() {
        return this.dg.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getShine() {
        return this.dg.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.emc.uym
    public float getStretch() {
        return this.dg.getStretch();
    }

    public ru getYogaNode() {
        return this.ypw;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.emc(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.ycc();
        }
        if (!(getParent() instanceof xq)) {
            emc(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        emc(this.ypw, 0.0f, 0.0f);
        dg dgVar2 = this.xq;
        if (dgVar2 != null) {
            dgVar2.emc(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof xq)) {
            emc(i10, i11);
        }
        dg dgVar = this.xq;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i10, i11);
            setMeasuredDimension(iArrEmc[0], iArrEmc[1]);
        } else {
            setMeasuredDimension(Math.round(this.ypw.msw()), Math.round(this.ypw.zz()));
        }
        dg dgVar2 = this.xq;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.ypw(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            emc(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            emc(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        emc(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        emc(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        emc(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            emc(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            emc(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.dg.emc(i10);
    }

    public void setBorderRadius(float f10) {
        this.dg.emc(f10);
    }

    public void setRipple(float f10) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.ypw(f10);
        }
    }

    public void setRubIn(float f10) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.bw(f10);
        }
    }

    public void setShine(float f10) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.xq(f10);
        }
    }

    public void setStretch(float f10) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.dg(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void xq(View view, int i10) {
        dg(view, i10);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void ypw(int i10) {
        ru ruVar = this.ypw;
        if (ruVar != null) {
            ypw(ruVar, i10);
            requestLayout();
        }
    }

    public xq(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.dg = new msw(this);
        ru ruVarEmc = gbl.emc();
        this.ypw = ruVarEmc;
        this.emc = new HashMap();
        ruVarEmc.emc(this);
        ruVarEmc.emc((com.bytedance.adsdk.ugeno.yoga.uym) new ypw());
        emc((emc) generateDefaultLayoutParams(), ruVarEmc, this);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void emc(int i10) {
        ru ruVar = this.ypw;
        if (ruVar != null) {
            emc(ruVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void ypw(View view, int i10) {
        ru ruVarEmc;
        if (view == null || (ruVarEmc = emc(view)) == null) {
            return;
        }
        ypw(ruVarEmc, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void emc(View view, int i10) {
        ru ruVarEmc;
        if (view == null || (ruVarEmc = emc(view)) == null) {
            return;
        }
        emc(ruVarEmc, i10);
        view.requestLayout();
    }

    private void ypw(ru ruVar, int i10) {
        if (i10 == -1) {
            ruVar.uym(100.0f);
        } else if (i10 == -2) {
            ruVar.bw();
        } else {
            ruVar.ycc(i10);
        }
    }

    private void emc(ru ruVar, int i10) {
        if (i10 == -1) {
            ruVar.bw(100.0f);
        } else if (i10 == -2) {
            ruVar.dg();
        } else {
            ruVar.dg(i10);
        }
    }

    public static class ypw implements com.bytedance.adsdk.ugeno.yoga.uym {
        @Override // com.bytedance.adsdk.ugeno.yoga.uym
        public long emc(ru ruVar, float f10, com.bytedance.adsdk.ugeno.yoga.msw mswVar, float f11, com.bytedance.adsdk.ugeno.yoga.msw mswVar2) {
            View view = (View) ruVar.ru();
            if (view == null || (view instanceof xq)) {
                return zz.emc(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, emc(mswVar)), View.MeasureSpec.makeMeasureSpec((int) f11, emc(mswVar2)));
            return zz.emc(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int emc(com.bytedance.adsdk.ugeno.yoga.msw mswVar) {
            if (mswVar == com.bytedance.adsdk.ugeno.yoga.msw.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return mswVar == com.bytedance.adsdk.ugeno.yoga.msw.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class emc extends ViewGroup.LayoutParams {

        /* renamed from: aa, reason: collision with root package name */
        private float f9214aa;
        private float bw;
        private float cf;
        private float dg;
        SparseArray<Float> emc;
        private float gbl;
        private float msw;
        private float qh;
        private float ru;
        private float sba;
        private float sup;
        private float sz;
        private float uym;
        private float vk;
        private float xq;
        private float ycc;
        SparseArray<String> ypw;
        private float yzg;
        private float zz;

        public emc(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof emc) {
                emc emcVar = (emc) layoutParams;
                this.emc = emcVar.emc.clone();
                this.ypw = emcVar.ypw.clone();
                return;
            }
            this.emc = new SparseArray<>();
            this.ypw = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.emc.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.emc.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void aa(float f10) {
            this.yzg = f10;
            this.emc.put(28, Float.valueOf(f10));
        }

        public void bw(float f10) {
            this.gbl = f10;
            this.emc.put(9, Float.valueOf(f10));
        }

        public void cf(float f10) {
            this.f9214aa = f10;
            this.emc.put(25, Float.valueOf(f10));
        }

        public void dg(float f10) {
            this.ru = f10;
            this.emc.put(8, Float.valueOf(f10));
        }

        public void emc(float f10) {
            this.uym = f10;
            this.emc.put(5, Float.valueOf(f10));
        }

        public void gbl(float f10) {
            this.xq = f10;
            this.emc.put(17, Float.valueOf(f10));
        }

        public void msw(float f10) {
            this.qh = f10;
            this.emc.put(11, Float.valueOf(f10));
        }

        public void qh(float f10) {
            this.ycc = f10;
            this.emc.put(20, Float.valueOf(f10));
        }

        public void ru(float f10) {
            this.vk = f10;
            this.emc.put(13, Float.valueOf(f10));
        }

        public void sup(float f10) {
            this.dg = f10;
            this.emc.put(18, Float.valueOf(f10));
        }

        public void sz(float f10) {
            this.bw = f10;
            this.emc.put(19, Float.valueOf(f10));
        }

        public void uym(float f10) {
            this.sz = f10;
            this.emc.put(10, Float.valueOf(f10));
        }

        public void vk(float f10) {
            this.sba = f10;
            this.emc.put(27, Float.valueOf(f10));
        }

        public void xq(float f10) {
            this.zz = f10;
            this.emc.put(7, Float.valueOf(f10));
        }

        public void ycc(float f10) {
            this.sup = f10;
            this.emc.put(14, Float.valueOf(f10));
        }

        public void ypw(float f10) {
            this.msw = f10;
            this.emc.put(6, Float.valueOf(f10));
        }

        public void zz(float f10) {
            this.cf = f10;
            this.emc.put(12, Float.valueOf(f10));
        }

        public emc(int i10, int i11) {
            super(i10, i11);
            this.emc = new SparseArray<>();
            this.ypw = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.emc.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.emc.put(16, Float.valueOf(i11));
            }
        }
    }

    private void emc(ru ruVar) {
        if (ruVar.ypw() != null) {
            emc(ruVar.ypw());
        } else {
            ruVar.emc(Float.NaN, Float.NaN);
        }
    }

    private void emc(View view, boolean z10) {
        try {
            ru ruVar = this.emc.get(view);
            if (ruVar == null) {
                return;
            }
            ru ruVarYpw = ruVar.ypw();
            int i10 = 0;
            while (true) {
                if (i10 >= ruVarYpw.emc()) {
                    break;
                }
                if (ruVarYpw.emc(i10).equals(ruVar)) {
                    ruVarYpw.ypw(i10);
                    break;
                }
                i10++;
            }
            ruVar.emc((Object) null);
            this.emc.remove(view);
            if (z10) {
                this.ypw.emc(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void emc(ru ruVar, float f10, float f11) {
        View view = (View) ruVar.ru();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(ruVar.ycc() + f10);
            int iRound2 = Math.round(ruVar.uym() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(ruVar.msw()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(ruVar.zz()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iEmc = ruVar.emc();
        for (int i10 = 0; i10 < iEmc; i10++) {
            if (equals(view)) {
                emc(ruVar.emc(i10), f10, f11);
            } else if (!(view instanceof xq)) {
                emc(ruVar.emc(i10), ruVar.ycc() + f10, ruVar.uym() + f11);
            }
        }
    }

    private void emc(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.ypw.ycc(size2);
        }
        if (mode == 1073741824) {
            this.ypw.dg(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.ypw.gbl(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.ypw.ru(size);
        }
        this.ypw.emc(Float.NaN, Float.NaN);
    }

    public static void emc(emc emcVar, ru ruVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            ruVar.emc(com.bytedance.adsdk.ugeno.yoga.xq.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.LEFT, r0.left);
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.TOP, r0.top);
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.RIGHT, r0.right);
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.BOTTOM, r0.bottom);
            }
        }
        for (int i10 = 0; i10 < emcVar.emc.size(); i10++) {
            int iKeyAt = emcVar.emc.keyAt(i10);
            float fFloatValue = emcVar.emc.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                ruVar.xq(com.bytedance.adsdk.ugeno.yoga.emc.emc(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                ruVar.emc(com.bytedance.adsdk.ugeno.yoga.emc.emc(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.emc.emc(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                ruVar.sup(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    ruVar.xq();
                } else {
                    ruVar.xq(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                ruVar.emc(bw.emc(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                ruVar.emc(fFloatValue);
            } else if (iKeyAt == 7) {
                ruVar.ypw(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    ruVar.uym(100.0f);
                } else if (fFloatValue == -2.0f) {
                    ruVar.bw();
                } else {
                    ruVar.ycc(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                ruVar.emc(com.bytedance.adsdk.ugeno.yoga.dg.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                ruVar.emc(ycc.emc(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                ruVar.emc(com.bytedance.adsdk.ugeno.yoga.dg.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                ruVar.emc(com.bytedance.adsdk.ugeno.yoga.dg.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                ruVar.emc(com.bytedance.adsdk.ugeno.yoga.dg.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                ruVar.zz(fFloatValue);
            } else if (iKeyAt == 27) {
                ruVar.msw(fFloatValue);
            } else if (iKeyAt == 22) {
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                ruVar.ypw(com.bytedance.adsdk.ugeno.yoga.dg.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                ruVar.xq(com.bytedance.adsdk.ugeno.yoga.dg.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                ruVar.xq(com.bytedance.adsdk.ugeno.yoga.dg.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                ruVar.xq(com.bytedance.adsdk.ugeno.yoga.dg.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                ruVar.xq(com.bytedance.adsdk.ugeno.yoga.dg.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                ruVar.emc(sz.emc(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    ruVar.bw(100.0f);
                } else if (fFloatValue == -2.0f) {
                    ruVar.dg();
                } else {
                    ruVar.dg(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                ruVar.emc(qh.emc(Math.round(fFloatValue)));
            }
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.xq = xqVar;
    }
}
