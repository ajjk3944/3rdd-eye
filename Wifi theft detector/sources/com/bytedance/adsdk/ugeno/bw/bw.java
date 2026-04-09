package com.bytedance.adsdk.ugeno.bw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.bw.dg;
import com.bytedance.adsdk.ugeno.uym.uym;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class bw extends ViewGroup implements com.bytedance.adsdk.ugeno.bw.emc {

    /* renamed from: aa, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.dg f9205aa;
    private int bw;
    private dg cf;
    private int dg;
    private int emc;
    private int gbl;
    private Drawable msw;
    private SparseIntArray qh;
    private int ru;
    private dg.emc sba;
    private int sup;
    private int[] sz;
    private Drawable uym;
    private List<xq> vk;
    private int xq;
    private int ycc;
    private int ypw;
    private int zz;

    public static class emc extends ViewGroup.MarginLayoutParams implements ypw {
        public static final Parcelable.Creator<emc> CREATOR = new Parcelable.Creator<emc>() { // from class: com.bytedance.adsdk.ugeno.bw.bw.emc.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public emc createFromParcel(Parcel parcel) {
                return new emc(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: emc, reason: merged with bridge method [inline-methods] */
            public emc[] newArray(int i10) {
                return new emc[i10];
            }
        };
        private float bw;
        private int dg;
        private int emc;
        private int msw;
        private boolean ru;
        private int uym;
        private float xq;
        private int ycc;
        private float ypw;
        private int zz;

        public emc(emc emcVar) {
            super((ViewGroup.MarginLayoutParams) emcVar);
            this.emc = 1;
            this.ypw = 0.0f;
            this.xq = 0.0f;
            this.dg = -1;
            this.bw = -1.0f;
            this.ycc = -1;
            this.uym = -1;
            this.msw = 16777215;
            this.zz = 16777215;
            this.emc = emcVar.emc;
            this.ypw = emcVar.ypw;
            this.xq = emcVar.xq;
            this.dg = emcVar.dg;
            this.bw = emcVar.bw;
            this.ycc = emcVar.ycc;
            this.uym = emcVar.uym;
            this.msw = emcVar.msw;
            this.zz = emcVar.zz;
            this.ru = emcVar.ru;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public float bw() {
            return this.xq;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int cf() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public float dg() {
            return this.ypw;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int emc() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public boolean gbl() {
            return this.ru;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int msw() {
            return this.uym;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int qh() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int ru() {
            return this.zz;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public float sup() {
            return this.bw;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int sz() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int uym() {
            return this.ycc;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int vk() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.emc);
            parcel.writeFloat(this.ypw);
            parcel.writeFloat(this.xq);
            parcel.writeInt(this.dg);
            parcel.writeFloat(this.bw);
            parcel.writeInt(this.ycc);
            parcel.writeInt(this.uym);
            parcel.writeInt(this.msw);
            parcel.writeInt(this.zz);
            parcel.writeByte(this.ru ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int xq() {
            return this.emc;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int ycc() {
            return this.dg;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int ypw() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public int zz() {
            return this.msw;
        }

        public void dg(int i10) {
            this.dg = i10;
        }

        public void emc(float f10) {
            this.ypw = f10;
        }

        public void xq(int i10) {
            this.emc = i10;
        }

        public void ypw(float f10) {
            this.xq = f10;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public void emc(int i10) {
            this.ycc = i10;
        }

        public void xq(float f10) {
            this.bw = f10;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public void ypw(int i10) {
            this.uym = i10;
        }

        public emc(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.emc = 1;
            this.ypw = 0.0f;
            this.xq = 0.0f;
            this.dg = -1;
            this.bw = -1.0f;
            this.ycc = -1;
            this.uym = -1;
            this.msw = 16777215;
            this.zz = 16777215;
        }

        public emc(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.emc = 1;
            this.ypw = 0.0f;
            this.xq = 0.0f;
            this.dg = -1;
            this.bw = -1.0f;
            this.ycc = -1;
            this.uym = -1;
            this.msw = 16777215;
            this.zz = 16777215;
        }

        public emc(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.emc = 1;
            this.ypw = 0.0f;
            this.xq = 0.0f;
            this.dg = -1;
            this.bw = -1.0f;
            this.ycc = -1;
            this.uym = -1;
            this.msw = 16777215;
            this.zz = 16777215;
        }

        public emc(Parcel parcel) {
            super(0, 0);
            this.emc = 1;
            this.ypw = 0.0f;
            this.xq = 0.0f;
            this.dg = -1;
            this.bw = -1.0f;
            this.ycc = -1;
            this.uym = -1;
            this.msw = 16777215;
            this.zz = 16777215;
            this.emc = parcel.readInt();
            this.ypw = parcel.readFloat();
            this.xq = parcel.readFloat();
            this.dg = parcel.readInt();
            this.bw = parcel.readFloat();
            this.ycc = parcel.readInt();
            this.uym = parcel.readInt();
            this.msw = parcel.readInt();
            this.zz = parcel.readInt();
            this.ru = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public bw(Context context) {
        super(context, null);
        this.ycc = -1;
        this.cf = new dg(this);
        this.vk = new ArrayList();
        this.sba = new dg.emc();
    }

    private boolean bw(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewXq = xq(i10 - i12);
            if (viewXq != null && viewXq.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean dg(int i10, int i11) {
        return bw(i10, i11) ? emc() ? (this.ru & 1) != 0 : (this.zz & 1) != 0 : emc() ? (this.ru & 2) != 0 : (this.zz & 2) != 0;
    }

    private boolean ycc(int i10) {
        if (i10 >= 0 && i10 < this.vk.size()) {
            for (int i11 = i10 + 1; i11 < this.vk.size(); i11++) {
                if (this.vk.get(i11).ypw() > 0) {
                    return false;
                }
            }
            if (emc()) {
                return (this.zz & 4) != 0;
            }
            if ((this.ru & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.qh == null) {
            this.qh = new SparseIntArray(getChildCount());
        }
        this.sz = this.cf.emc(view, i10, layoutParams, this.qh);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof emc;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int emc(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof emc ? new emc((emc) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new emc((ViewGroup.MarginLayoutParams) layoutParams) : new emc(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getAlignContent() {
        return this.bw;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getAlignItems() {
        return this.dg;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.uym;
    }

    public Drawable getDividerDrawableVertical() {
        return this.msw;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getFlexDirection() {
        return this.emc;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<xq> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.vk.size());
        for (xq xqVar : this.vk) {
            if (xqVar.ypw() != 0) {
                arrayList.add(xqVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public List<xq> getFlexLinesInternal() {
        return this.vk;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getFlexWrap() {
        return this.ypw;
    }

    public int getJustifyContent() {
        return this.xq;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getLargestMainSize() {
        Iterator<xq> it = this.vk.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().bw);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getMaxLine() {
        return this.ycc;
    }

    public int getShowDividerHorizontal() {
        return this.zz;
    }

    public int getShowDividerVertical() {
        return this.ru;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int getSumOfCrossSize() {
        int size = this.vk.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            xq xqVar = this.vk.get(i11);
            if (dg(i11)) {
                i10 += emc() ? this.gbl : this.sup;
            }
            if (ycc(i11)) {
                i10 += emc() ? this.gbl : this.sup;
            }
            i10 += xqVar.uym;
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.dg dgVar = this.f9205aa;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.dg dgVar = this.f9205aa;
        if (dgVar != null) {
            dgVar.msw();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.msw == null && this.uym == null) {
            return;
        }
        if (this.zz == 0 && this.ru == 0) {
            return;
        }
        int iEmc = uym.emc(this);
        int i10 = this.emc;
        if (i10 == 0) {
            emc(canvas, iEmc == 1, this.ypw == 2);
            return;
        }
        if (i10 == 1) {
            emc(canvas, iEmc != 1, this.ypw == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iEmc == 1;
            if (this.ypw == 2) {
                z10 = !z10;
            }
            ypw(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iEmc == 1;
        if (this.ypw == 2) {
            z11 = !z11;
        }
        ypw(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        bw bwVar;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        bw bwVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z13;
        com.bytedance.adsdk.ugeno.dg dgVar = this.f9205aa;
        if (dgVar != null) {
            dgVar.ycc();
        }
        int iEmc = uym.emc(this);
        int i22 = this.emc;
        if (i22 == 0) {
            if (iEmc == 1) {
                z11 = true;
                bwVar = this;
                i14 = i10;
                i17 = i11;
                i16 = i13;
                i15 = i12;
            } else {
                z11 = false;
                bwVar = this;
                i14 = i10;
                i15 = i12;
                i16 = i13;
                i17 = i11;
            }
            bwVar.emc(z11, i14, i17, i15, i16);
        } else if (i22 == 1) {
            if (iEmc != 1) {
                z12 = true;
                bwVar2 = this;
                i18 = i10;
                i21 = i11;
                i20 = i13;
                i19 = i12;
            } else {
                z12 = false;
                bwVar2 = this;
                i18 = i10;
                i19 = i12;
                i20 = i13;
                i21 = i11;
            }
            bwVar2.emc(z12, i18, i21, i19, i20);
        } else if (i22 == 2) {
            z13 = iEmc == 1;
            if (this.ypw == 2) {
                z13 = !z13;
            }
            emc(z13, false, i10, i11, i12, i13);
        } else {
            if (i22 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.emc);
            }
            z13 = iEmc == 1;
            if (this.ypw == 2) {
                z13 = !z13;
            }
            emc(z13, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.f9205aa;
        if (dgVar2 != null) {
            dgVar2.emc(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.dg dgVar = this.f9205aa;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i10, i11);
            emc(iArrEmc[0], iArrEmc[1]);
        } else {
            emc(i10, i11);
        }
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.f9205aa;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.dg dgVar = this.f9205aa;
        if (dgVar != null) {
            dgVar.ypw(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setAlignContent(int i10) {
        if (this.bw != i10) {
            this.bw = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.dg != i10) {
            this.dg = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.uym) {
            return;
        }
        this.uym = drawable;
        if (drawable != null) {
            this.gbl = drawable.getIntrinsicHeight();
        } else {
            this.gbl = 0;
        }
        ypw();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.msw) {
            return;
        }
        this.msw = drawable;
        if (drawable != null) {
            this.sup = drawable.getIntrinsicWidth();
        } else {
            this.sup = 0;
        }
        ypw();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.emc != i10) {
            this.emc = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public void setFlexLines(List<xq> list) {
        this.vk = list;
    }

    public void setFlexWrap(int i10) {
        if (this.ypw != i10) {
            this.ypw = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.xq != i10) {
            this.xq = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.ycc != i10) {
            this.ycc = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.zz) {
            this.zz = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.ru) {
            this.ru = i10;
            requestLayout();
        }
    }

    public View xq(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.sz;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public View ypw(int i10) {
        return xq(i10);
    }

    private void emc(int i10, int i11) {
        if (this.qh == null) {
            this.qh = new SparseIntArray(getChildCount());
        }
        if (this.cf.ypw(this.qh)) {
            this.sz = this.cf.emc(this.qh);
        }
        int i12 = this.emc;
        if (i12 == 0 || i12 == 1) {
            ypw(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            xq(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.emc);
        }
    }

    private void ypw(int i10, int i11) {
        this.vk.clear();
        this.sba.emc();
        this.cf.emc(this.sba, i10, i11);
        this.vk = this.sba.emc;
        this.cf.emc(i10, i11);
        if (this.dg == 3) {
            for (xq xqVar : this.vk) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < xqVar.msw; i12++) {
                    View viewXq = xq(xqVar.cf + i12);
                    if (viewXq != null && viewXq.getVisibility() != 8) {
                        emc emcVar = (emc) viewXq.getLayoutParams();
                        iMax = this.ypw != 2 ? Math.max(iMax, viewXq.getMeasuredHeight() + Math.max(xqVar.sup - viewXq.getBaseline(), ((ViewGroup.MarginLayoutParams) emcVar).topMargin) + ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin) : Math.max(iMax, viewXq.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) emcVar).topMargin + Math.max((xqVar.sup - viewXq.getMeasuredHeight()) + viewXq.getBaseline(), ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin));
                    }
                }
                xqVar.uym = iMax;
            }
        }
        this.cf.ypw(i10, i11, getPaddingTop() + getPaddingBottom());
        this.cf.emc();
        emc(this.emc, i10, i11, this.sba.ypw);
    }

    private boolean bw(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.vk.get(i11).ypw() > 0) {
                return false;
            }
        }
        return true;
    }

    private void xq(int i10, int i11) {
        this.vk.clear();
        this.sba.emc();
        this.cf.ypw(this.sba, i10, i11);
        this.vk = this.sba.emc;
        this.cf.emc(i10, i11);
        this.cf.ypw(i10, i11, getPaddingLeft() + getPaddingRight());
        this.cf.emc();
        emc(this.emc, i10, i11, this.sba.ypw);
    }

    private boolean dg(int i10) {
        if (i10 >= 0 && i10 < this.vk.size()) {
            if (bw(i10)) {
                return emc() ? (this.zz & 1) != 0 : (this.ru & 1) != 0;
            }
            if (emc()) {
                return (this.zz & 2) != 0;
            }
            if ((this.ru & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public View emc(int i10) {
        return getChildAt(i10);
    }

    private void emc(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void ypw(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.vk.size();
        for (int i12 = 0; i12 < size; i12++) {
            xq xqVar = this.vk.get(i12);
            for (int i13 = 0; i13 < xqVar.msw; i13++) {
                int i14 = xqVar.cf + i13;
                View viewXq = xq(i14);
                if (viewXq != null && viewXq.getVisibility() != 8) {
                    emc emcVar = (emc) viewXq.getLayoutParams();
                    if (dg(i14, i13)) {
                        if (z11) {
                            top = viewXq.getBottom() + ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin;
                        } else {
                            top = (viewXq.getTop() - ((ViewGroup.MarginLayoutParams) emcVar).topMargin) - this.gbl;
                        }
                        ypw(canvas, xqVar.emc, top, xqVar.uym);
                    }
                    if (i13 == xqVar.msw - 1 && (this.zz & 4) > 0) {
                        if (z11) {
                            bottom = (viewXq.getTop() - ((ViewGroup.MarginLayoutParams) emcVar).topMargin) - this.gbl;
                        } else {
                            bottom = viewXq.getBottom() + ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin;
                        }
                        ypw(canvas, xqVar.emc, bottom, xqVar.uym);
                    }
                }
            }
            if (dg(i12)) {
                if (z10) {
                    i11 = xqVar.xq;
                } else {
                    i11 = xqVar.emc - this.sup;
                }
                emc(canvas, i11, paddingTop, iMax);
            }
            if (ycc(i12) && (this.ru & 4) > 0) {
                if (z10) {
                    i10 = xqVar.emc - this.sup;
                } else {
                    i10 = xqVar.xq;
                }
                emc(canvas, i10, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public boolean emc() {
        int i10 = this.emc;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bw.bw.emc(boolean, int, int, int, int):void");
    }

    private void ypw(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.uym;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.gbl + i11);
        this.uym.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int ypw(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void ypw() {
        if (this.uym == null && this.msw == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void emc(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bw.bw.emc(boolean, boolean, int, int, int, int):void");
    }

    private void emc(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.vk.size();
        for (int i12 = 0; i12 < size; i12++) {
            xq xqVar = this.vk.get(i12);
            for (int i13 = 0; i13 < xqVar.msw; i13++) {
                int i14 = xqVar.cf + i13;
                View viewXq = xq(i14);
                if (viewXq != null && viewXq.getVisibility() != 8) {
                    emc emcVar = (emc) viewXq.getLayoutParams();
                    if (dg(i14, i13)) {
                        if (z10) {
                            left = viewXq.getRight() + ((ViewGroup.MarginLayoutParams) emcVar).rightMargin;
                        } else {
                            left = (viewXq.getLeft() - ((ViewGroup.MarginLayoutParams) emcVar).leftMargin) - this.sup;
                        }
                        emc(canvas, left, xqVar.ypw, xqVar.uym);
                    }
                    if (i13 == xqVar.msw - 1 && (this.ru & 4) > 0) {
                        if (z10) {
                            right = (viewXq.getLeft() - ((ViewGroup.MarginLayoutParams) emcVar).leftMargin) - this.sup;
                        } else {
                            right = viewXq.getRight() + ((ViewGroup.MarginLayoutParams) emcVar).rightMargin;
                        }
                        emc(canvas, right, xqVar.ypw, xqVar.uym);
                    }
                }
            }
            if (dg(i12)) {
                if (z11) {
                    i11 = xqVar.dg;
                } else {
                    i11 = xqVar.ypw - this.gbl;
                }
                ypw(canvas, paddingLeft, i11, iMax);
            }
            if (ycc(i12) && (this.zz & 4) > 0) {
                if (z11) {
                    i10 = xqVar.ypw - this.gbl;
                } else {
                    i10 = xqVar.dg;
                }
                ypw(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void emc(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.msw;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.sup + i10, i12 + i11);
        this.msw.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int emc(View view, int i10, int i11) {
        int i12;
        int i13;
        if (emc()) {
            i12 = dg(i10, i11) ? this.sup : 0;
            if ((this.ru & 4) <= 0) {
                return i12;
            }
            i13 = this.sup;
        } else {
            i12 = dg(i10, i11) ? this.gbl : 0;
            if ((this.zz & 4) <= 0) {
                return i12;
            }
            i13 = this.gbl;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public void emc(xq xqVar) {
        if (emc()) {
            if ((this.ru & 4) > 0) {
                int i10 = xqVar.bw;
                int i11 = this.sup;
                xqVar.bw = i10 + i11;
                xqVar.ycc += i11;
                return;
            }
            return;
        }
        if ((this.zz & 4) > 0) {
            int i12 = xqVar.bw;
            int i13 = this.gbl;
            xqVar.bw = i12 + i13;
            xqVar.ycc += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int emc(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public void emc(View view, int i10, int i11, xq xqVar) {
        if (dg(i10, i11)) {
            if (emc()) {
                int i12 = xqVar.bw;
                int i13 = this.sup;
                xqVar.bw = i12 + i13;
                xqVar.ycc += i13;
                return;
            }
            int i14 = xqVar.bw;
            int i15 = this.gbl;
            xqVar.bw = i14 + i15;
            xqVar.ycc += i15;
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.f9205aa = xqVar;
    }
}
