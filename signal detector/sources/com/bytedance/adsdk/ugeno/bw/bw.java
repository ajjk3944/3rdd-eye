package com.bytedance.adsdk.ugeno.bw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.adsdk.ugeno.bw.dg;
import com.bytedance.adsdk.ugeno.uym.uym;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class bw extends ViewGroup implements com.bytedance.adsdk.ugeno.bw.emc {
    private com.bytedance.adsdk.ugeno.dg aa;
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
            public emc[] newArray(int i) {
                return new emc[i];
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
        public void writeToParcel(Parcel parcel, int i) {
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

        public void dg(int i) {
            this.dg = i;
        }

        public void emc(float f2) {
            this.ypw = f2;
        }

        public void xq(int i) {
            this.emc = i;
        }

        public void ypw(float f2) {
            this.xq = f2;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public void emc(int i) {
            this.ycc = i;
        }

        public void xq(float f2) {
            this.bw = f2;
        }

        @Override // com.bytedance.adsdk.ugeno.bw.ypw
        public void ypw(int i) {
            this.uym = i;
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

        public emc(int i, int i3) {
            super(new ViewGroup.LayoutParams(i, i3));
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

    private boolean bw(int i, int i3) {
        for (int i6 = 1; i6 <= i3; i6++) {
            View viewXq = xq(i - i6);
            if (viewXq != null && viewXq.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean dg(int i, int i3) {
        return bw(i, i3) ? emc() ? (this.ru & 1) != 0 : (this.zz & 1) != 0 : emc() ? (this.ru & 2) != 0 : (this.zz & 2) != 0;
    }

    private boolean ycc(int i) {
        if (i >= 0 && i < this.vk.size()) {
            for (int i3 = i + 1; i3 < this.vk.size(); i3++) {
                if (this.vk.get(i3).ypw() > 0) {
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
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.qh == null) {
            this.qh = new SparseIntArray(getChildCount());
        }
        this.sz = this.cf.emc(view, i, layoutParams, this.qh);
        super.addView(view, i, layoutParams);
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
        int iMax = LinearLayoutManager.INVALID_OFFSET;
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
        int i = 0;
        for (int i3 = 0; i3 < size; i3++) {
            xq xqVar = this.vk.get(i3);
            if (dg(i3)) {
                i += emc() ? this.gbl : this.sup;
            }
            if (ycc(i3)) {
                i += emc() ? this.gbl : this.sup;
            }
            i += xqVar.uym;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.dg dgVar = this.aa;
        if (dgVar != null) {
            dgVar.uym();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.dg dgVar = this.aa;
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
        int i = this.emc;
        if (i == 0) {
            emc(canvas, iEmc == 1, this.ypw == 2);
            return;
        }
        if (i == 1) {
            emc(canvas, iEmc != 1, this.ypw == 2);
            return;
        }
        if (i == 2) {
            boolean z6 = iEmc == 1;
            if (this.ypw == 2) {
                z6 = !z6;
            }
            ypw(canvas, z6, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z7 = iEmc == 1;
        if (this.ypw == 2) {
            z7 = !z7;
        }
        ypw(canvas, z7, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        boolean z7;
        bw bwVar;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        bw bwVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z9;
        com.bytedance.adsdk.ugeno.dg dgVar = this.aa;
        if (dgVar != null) {
            dgVar.ycc();
        }
        int iEmc = uym.emc(this);
        int i16 = this.emc;
        if (i16 == 0) {
            if (iEmc == 1) {
                z7 = true;
                bwVar = this;
                i8 = i;
                i11 = i3;
                i10 = i7;
                i9 = i6;
            } else {
                z7 = false;
                bwVar = this;
                i8 = i;
                i9 = i6;
                i10 = i7;
                i11 = i3;
            }
            bwVar.emc(z7, i8, i11, i9, i10);
        } else if (i16 == 1) {
            if (iEmc != 1) {
                z8 = true;
                bwVar2 = this;
                i12 = i;
                i15 = i3;
                i14 = i7;
                i13 = i6;
            } else {
                z8 = false;
                bwVar2 = this;
                i12 = i;
                i13 = i6;
                i14 = i7;
                i15 = i3;
            }
            bwVar2.emc(z8, i12, i15, i13, i14);
        } else if (i16 == 2) {
            z9 = iEmc == 1;
            if (this.ypw == 2) {
                z9 = !z9;
            }
            emc(z9, false, i, i3, i6, i7);
        } else {
            if (i16 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.emc);
            }
            z9 = iEmc == 1;
            if (this.ypw == 2) {
                z9 = !z9;
            }
            emc(z9, true, i, i3, i6, i7);
        }
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.aa;
        if (dgVar2 != null) {
            dgVar2.emc(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        com.bytedance.adsdk.ugeno.dg dgVar = this.aa;
        if (dgVar != null) {
            int[] iArrEmc = dgVar.emc(i, i3);
            emc(iArrEmc[0], iArrEmc[1]);
        } else {
            emc(i, i3);
        }
        com.bytedance.adsdk.ugeno.dg dgVar2 = this.aa;
        if (dgVar2 != null) {
            dgVar2.bw();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i3, int i6, int i7) {
        super.onSizeChanged(i, i3, i6, i7);
        com.bytedance.adsdk.ugeno.dg dgVar = this.aa;
        if (dgVar != null) {
            dgVar.ypw(i, i3, i6, i7);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
    }

    public void setAlignContent(int i) {
        if (this.bw != i) {
            this.bw = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.dg != i) {
            this.dg = i;
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

    public void setFlexDirection(int i) {
        if (this.emc != i) {
            this.emc = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public void setFlexLines(List<xq> list) {
        this.vk = list;
    }

    public void setFlexWrap(int i) {
        if (this.ypw != i) {
            this.ypw = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.xq != i) {
            this.xq = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.ycc != i) {
            this.ycc = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.zz) {
            this.zz = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.ru) {
            this.ru = i;
            requestLayout();
        }
    }

    public View xq(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.sz;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public View ypw(int i) {
        return xq(i);
    }

    private void emc(int i, int i3) {
        if (this.qh == null) {
            this.qh = new SparseIntArray(getChildCount());
        }
        if (this.cf.ypw(this.qh)) {
            this.sz = this.cf.emc(this.qh);
        }
        int i6 = this.emc;
        if (i6 == 0 || i6 == 1) {
            ypw(i, i3);
        } else if (i6 == 2 || i6 == 3) {
            xq(i, i3);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.emc);
        }
    }

    private void ypw(int i, int i3) {
        this.vk.clear();
        this.sba.emc();
        this.cf.emc(this.sba, i, i3);
        this.vk = this.sba.emc;
        this.cf.emc(i, i3);
        if (this.dg == 3) {
            for (xq xqVar : this.vk) {
                int iMax = LinearLayoutManager.INVALID_OFFSET;
                for (int i6 = 0; i6 < xqVar.msw; i6++) {
                    View viewXq = xq(xqVar.cf + i6);
                    if (viewXq != null && viewXq.getVisibility() != 8) {
                        emc emcVar = (emc) viewXq.getLayoutParams();
                        iMax = this.ypw != 2 ? Math.max(iMax, viewXq.getMeasuredHeight() + Math.max(xqVar.sup - viewXq.getBaseline(), ((ViewGroup.MarginLayoutParams) emcVar).topMargin) + ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin) : Math.max(iMax, viewXq.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) emcVar).topMargin + Math.max(viewXq.getBaseline() + (xqVar.sup - viewXq.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin));
                    }
                }
                xqVar.uym = iMax;
            }
        }
        this.cf.ypw(i, i3, getPaddingBottom() + getPaddingTop());
        this.cf.emc();
        emc(this.emc, i, i3, this.sba.ypw);
    }

    private boolean bw(int i) {
        for (int i3 = 0; i3 < i; i3++) {
            if (this.vk.get(i3).ypw() > 0) {
                return false;
            }
        }
        return true;
    }

    private void xq(int i, int i3) {
        this.vk.clear();
        this.sba.emc();
        this.cf.ypw(this.sba, i, i3);
        this.vk = this.sba.emc;
        this.cf.emc(i, i3);
        this.cf.ypw(i, i3, getPaddingRight() + getPaddingLeft());
        this.cf.emc();
        emc(this.emc, i, i3, this.sba.ypw);
    }

    private boolean dg(int i) {
        if (i >= 0 && i < this.vk.size()) {
            if (bw(i)) {
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
    public View emc(int i) {
        return getChildAt(i);
    }

    private void emc(int i, int i3, int i6, int i7) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i7 = View.combineMeasuredStates(i7, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i3, i7);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i3, i7);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i7 = View.combineMeasuredStates(i7, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i3, i7);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i7 = View.combineMeasuredStates(i7, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i6, i7);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i6, i7);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i7 = View.combineMeasuredStates(i7, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i6, i7);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void ypw(Canvas canvas, boolean z6, boolean z7) {
        int i;
        int i3;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.vk.size();
        for (int i6 = 0; i6 < size; i6++) {
            xq xqVar = this.vk.get(i6);
            for (int i7 = 0; i7 < xqVar.msw; i7++) {
                int i8 = xqVar.cf + i7;
                View viewXq = xq(i8);
                if (viewXq != null && viewXq.getVisibility() != 8) {
                    emc emcVar = (emc) viewXq.getLayoutParams();
                    if (dg(i8, i7)) {
                        if (z7) {
                            top = viewXq.getBottom() + ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin;
                        } else {
                            top = (viewXq.getTop() - ((ViewGroup.MarginLayoutParams) emcVar).topMargin) - this.gbl;
                        }
                        ypw(canvas, xqVar.emc, top, xqVar.uym);
                    }
                    if (i7 == xqVar.msw - 1 && (this.zz & 4) > 0) {
                        if (z7) {
                            bottom = (viewXq.getTop() - ((ViewGroup.MarginLayoutParams) emcVar).topMargin) - this.gbl;
                        } else {
                            bottom = viewXq.getBottom() + ((ViewGroup.MarginLayoutParams) emcVar).bottomMargin;
                        }
                        ypw(canvas, xqVar.emc, bottom, xqVar.uym);
                    }
                }
            }
            if (dg(i6)) {
                if (z6) {
                    i3 = xqVar.xq;
                } else {
                    i3 = xqVar.emc - this.sup;
                }
                emc(canvas, i3, paddingTop, iMax);
            }
            if (ycc(i6) && (this.ru & 4) > 0) {
                if (z6) {
                    i = xqVar.emc - this.sup;
                } else {
                    i = xqVar.xq;
                }
                emc(canvas, i, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public boolean emc() {
        int i = this.emc;
        return i == 0 || i == 1;
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

    private void ypw(Canvas canvas, int i, int i3, int i6) {
        Drawable drawable = this.uym;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i3, i6 + i, this.gbl + i3);
        this.uym.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int ypw(int i, int i3, int i6) {
        return ViewGroup.getChildMeasureSpec(i, i3, i6);
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

    private void emc(Canvas canvas, boolean z6, boolean z7) {
        int i;
        int i3;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.vk.size();
        for (int i6 = 0; i6 < size; i6++) {
            xq xqVar = this.vk.get(i6);
            for (int i7 = 0; i7 < xqVar.msw; i7++) {
                int i8 = xqVar.cf + i7;
                View viewXq = xq(i8);
                if (viewXq != null && viewXq.getVisibility() != 8) {
                    emc emcVar = (emc) viewXq.getLayoutParams();
                    if (dg(i8, i7)) {
                        if (z6) {
                            left = viewXq.getRight() + ((ViewGroup.MarginLayoutParams) emcVar).rightMargin;
                        } else {
                            left = (viewXq.getLeft() - ((ViewGroup.MarginLayoutParams) emcVar).leftMargin) - this.sup;
                        }
                        emc(canvas, left, xqVar.ypw, xqVar.uym);
                    }
                    if (i7 == xqVar.msw - 1 && (this.ru & 4) > 0) {
                        if (z6) {
                            right = (viewXq.getLeft() - ((ViewGroup.MarginLayoutParams) emcVar).leftMargin) - this.sup;
                        } else {
                            right = viewXq.getRight() + ((ViewGroup.MarginLayoutParams) emcVar).rightMargin;
                        }
                        emc(canvas, right, xqVar.ypw, xqVar.uym);
                    }
                }
            }
            if (dg(i6)) {
                if (z7) {
                    i3 = xqVar.dg;
                } else {
                    i3 = xqVar.ypw - this.gbl;
                }
                ypw(canvas, paddingLeft, i3, iMax);
            }
            if (ycc(i6) && (this.zz & 4) > 0) {
                if (z7) {
                    i = xqVar.ypw - this.gbl;
                } else {
                    i = xqVar.dg;
                }
                ypw(canvas, paddingLeft, i, iMax);
            }
        }
    }

    private void emc(Canvas canvas, int i, int i3, int i6) {
        Drawable drawable = this.msw;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i3, this.sup + i, i6 + i3);
        this.msw.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int emc(View view, int i, int i3) {
        int i6;
        int i7;
        if (emc()) {
            i6 = dg(i, i3) ? this.sup : 0;
            if ((this.ru & 4) <= 0) {
                return i6;
            }
            i7 = this.sup;
        } else {
            i6 = dg(i, i3) ? this.gbl : 0;
            if ((this.zz & 4) <= 0) {
                return i6;
            }
            i7 = this.gbl;
        }
        return i6 + i7;
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public void emc(xq xqVar) {
        if (emc()) {
            if ((this.ru & 4) > 0) {
                int i = xqVar.bw;
                int i3 = this.sup;
                xqVar.bw = i + i3;
                xqVar.ycc += i3;
                return;
            }
            return;
        }
        if ((this.zz & 4) > 0) {
            int i6 = xqVar.bw;
            int i7 = this.gbl;
            xqVar.bw = i6 + i7;
            xqVar.ycc += i7;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public int emc(int i, int i3, int i6) {
        return ViewGroup.getChildMeasureSpec(i, i3, i6);
    }

    @Override // com.bytedance.adsdk.ugeno.bw.emc
    public void emc(View view, int i, int i3, xq xqVar) {
        if (dg(i, i3)) {
            if (emc()) {
                int i6 = xqVar.bw;
                int i7 = this.sup;
                xqVar.bw = i6 + i7;
                xqVar.ycc += i7;
                return;
            }
            int i8 = xqVar.bw;
            int i9 = this.gbl;
            xqVar.bw = i8 + i9;
            xqVar.ycc += i9;
        }
    }

    public void emc(com.bytedance.adsdk.ugeno.ypw.xq xqVar) {
        this.aa = xqVar;
    }
}
