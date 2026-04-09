package com.bytedance.adsdk.ugeno.yoga.ypw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
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
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ru ruVarEmc;
        this.ypw.emc((com.bytedance.adsdk.ugeno.yoga.uym) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.ypw.ypw) {
            throw null;
        }
        super.addView(view, i, layoutParams);
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

    public void dg(View view, int i) {
        int iEmc;
        view.setVisibility(i);
        try {
            ru ruVar = this.emc.get(view);
            Object tag = view.getTag(151060224);
            if (i != 0) {
                if (i != 8 || (iEmc = this.ypw.emc(ruVar)) == -1) {
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
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.ycc();
        }
        if (!(getParent() instanceof xq)) {
            emc(View.MeasureSpec.makeMeasureSpec(i6 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i7 - i3, 1073741824));
        }
        emc(this.ypw, 0.0f, 0.0f);
        dg dgVar2 = this.xq;
        if (dgVar2 != null) {
            dgVar2.emc(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        if (!(getParent() instanceof xq)) {
            emc(i, i3);
        }
        dg dgVar = this.xq;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i, i3);
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
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        dg dgVar = this.xq;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            emc(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            emc(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        emc(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        emc(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        emc(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i3) {
        for (int i6 = i; i6 < i + i3; i6++) {
            emc(getChildAt(i6), false);
        }
        super.removeViews(i, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i3) {
        for (int i6 = i; i6 < i + i3; i6++) {
            emc(getChildAt(i6), true);
        }
        super.removeViewsInLayout(i, i3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.dg.emc(i);
    }

    public void setBorderRadius(float f2) {
        this.dg.emc(f2);
    }

    public void setRipple(float f2) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.ypw(f2);
        }
    }

    public void setRubIn(float f2) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.bw(f2);
        }
    }

    public void setShine(float f2) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.xq(f2);
        }
    }

    public void setStretch(float f2) {
        msw mswVar = this.dg;
        if (mswVar != null) {
            mswVar.dg(f2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void xq(View view, int i) {
        dg(view, i);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void ypw(int i) {
        ru ruVar = this.ypw;
        if (ruVar != null) {
            ypw(ruVar, i);
            requestLayout();
        }
    }

    public xq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dg = new msw(this);
        ru ruVarEmc = gbl.emc();
        this.ypw = ruVarEmc;
        this.emc = new HashMap();
        ruVarEmc.emc(this);
        ruVarEmc.emc((com.bytedance.adsdk.ugeno.yoga.uym) new ypw());
        emc((emc) generateDefaultLayoutParams(), ruVarEmc, this);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void emc(int i) {
        ru ruVar = this.ypw;
        if (ruVar != null) {
            emc(ruVar, i);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void ypw(View view, int i) {
        ru ruVarEmc;
        if (view == null || (ruVarEmc = emc(view)) == null) {
            return;
        }
        ypw(ruVarEmc, i);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.ypw
    public void emc(View view, int i) {
        ru ruVarEmc;
        if (view == null || (ruVarEmc = emc(view)) == null) {
            return;
        }
        emc(ruVarEmc, i);
        view.requestLayout();
    }

    private void ypw(ru ruVar, int i) {
        if (i == -1) {
            ruVar.uym(100.0f);
        } else if (i == -2) {
            ruVar.bw();
        } else {
            ruVar.ycc(i);
        }
    }

    private void emc(ru ruVar, int i) {
        if (i == -1) {
            ruVar.bw(100.0f);
        } else if (i == -2) {
            ruVar.dg();
        } else {
            ruVar.dg(i);
        }
    }

    public static class ypw implements com.bytedance.adsdk.ugeno.yoga.uym {
        @Override // com.bytedance.adsdk.ugeno.yoga.uym
        public long emc(ru ruVar, float f2, com.bytedance.adsdk.ugeno.yoga.msw mswVar, float f5, com.bytedance.adsdk.ugeno.yoga.msw mswVar2) {
            View view = (View) ruVar.ru();
            if (view == null || (view instanceof xq)) {
                return zz.emc(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f2, emc(mswVar)), View.MeasureSpec.makeMeasureSpec((int) f5, emc(mswVar2)));
            return zz.emc(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int emc(com.bytedance.adsdk.ugeno.yoga.msw mswVar) {
            return mswVar == com.bytedance.adsdk.ugeno.yoga.msw.AT_MOST ? LinearLayoutManager.INVALID_OFFSET : mswVar == com.bytedance.adsdk.ugeno.yoga.msw.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class emc extends ViewGroup.LayoutParams {
        private float aa;
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

        public void aa(float f2) {
            this.yzg = f2;
            this.emc.put(28, Float.valueOf(f2));
        }

        public void bw(float f2) {
            this.gbl = f2;
            this.emc.put(9, Float.valueOf(f2));
        }

        public void cf(float f2) {
            this.aa = f2;
            this.emc.put(25, Float.valueOf(f2));
        }

        public void dg(float f2) {
            this.ru = f2;
            this.emc.put(8, Float.valueOf(f2));
        }

        public void emc(float f2) {
            this.uym = f2;
            this.emc.put(5, Float.valueOf(f2));
        }

        public void gbl(float f2) {
            this.xq = f2;
            this.emc.put(17, Float.valueOf(f2));
        }

        public void msw(float f2) {
            this.qh = f2;
            this.emc.put(11, Float.valueOf(f2));
        }

        public void qh(float f2) {
            this.ycc = f2;
            this.emc.put(20, Float.valueOf(f2));
        }

        public void ru(float f2) {
            this.vk = f2;
            this.emc.put(13, Float.valueOf(f2));
        }

        public void sup(float f2) {
            this.dg = f2;
            this.emc.put(18, Float.valueOf(f2));
        }

        public void sz(float f2) {
            this.bw = f2;
            this.emc.put(19, Float.valueOf(f2));
        }

        public void uym(float f2) {
            this.sz = f2;
            this.emc.put(10, Float.valueOf(f2));
        }

        public void vk(float f2) {
            this.sba = f2;
            this.emc.put(27, Float.valueOf(f2));
        }

        public void xq(float f2) {
            this.zz = f2;
            this.emc.put(7, Float.valueOf(f2));
        }

        public void ycc(float f2) {
            this.sup = f2;
            this.emc.put(14, Float.valueOf(f2));
        }

        public void ypw(float f2) {
            this.msw = f2;
            this.emc.put(6, Float.valueOf(f2));
        }

        public void zz(float f2) {
            this.cf = f2;
            this.emc.put(12, Float.valueOf(f2));
        }

        public emc(int i, int i3) {
            super(i, i3);
            this.emc = new SparseArray<>();
            this.ypw = new SparseArray<>();
            if (i == -2 || i == -1 || i >= 0) {
                this.emc.put(15, Float.valueOf(i));
            }
            if (i3 == -2 || i3 == -1 || i3 >= 0) {
                this.emc.put(16, Float.valueOf(i3));
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

    private void emc(View view, boolean z6) {
        try {
            ru ruVar = this.emc.get(view);
            if (ruVar == null) {
                return;
            }
            ru ruVarYpw = ruVar.ypw();
            int i = 0;
            while (true) {
                if (i >= ruVarYpw.emc()) {
                    break;
                }
                if (ruVarYpw.emc(i).equals(ruVar)) {
                    ruVarYpw.ypw(i);
                    break;
                }
                i++;
            }
            ruVar.emc((Object) null);
            this.emc.remove(view);
            if (z6) {
                this.ypw.emc(Float.NaN, Float.NaN);
            }
        } catch (Throwable unused) {
        }
    }

    private void emc(ru ruVar, float f2, float f5) {
        View view = (View) ruVar.ru();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(ruVar.ycc() + f2);
            int iRound2 = Math.round(ruVar.uym() + f5);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(ruVar.msw()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(ruVar.zz()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iEmc = ruVar.emc();
        for (int i = 0; i < iEmc; i++) {
            if (equals(view)) {
                emc(ruVar.emc(i), f2, f5);
            } else if (!(view instanceof xq)) {
                emc(ruVar.emc(i), ruVar.ycc() + f2, ruVar.uym() + f5);
            }
        }
    }

    private void emc(int i, int i3) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i3);
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
        for (int i = 0; i < emcVar.emc.size(); i++) {
            int iKeyAt = emcVar.emc.keyAt(i);
            float fFloatValue = emcVar.emc.valueAt(i).floatValue();
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
