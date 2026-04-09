package com.bytedance.adsdk.ugeno.fkw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.bytedance.adsdk.ugeno.fkw.yu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends ViewGroup implements com.bytedance.adsdk.ugeno.fkw.ouw {
    private Drawable bly;

    /* renamed from: cf, reason: collision with root package name */
    private int f6879cf;
    private int fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int[] f6880jg;
    private SparseIntArray ko;

    /* renamed from: le, reason: collision with root package name */
    private int f6881le;

    /* renamed from: lh, reason: collision with root package name */
    private int f6882lh;
    private int mwh;
    com.bytedance.adsdk.ugeno.yu ouw;
    private Drawable pno;
    private int ra;
    private yu rn;
    private int ryl;
    private int tlj;
    private yu.ouw vm;
    private int vt;
    private int yu;
    private List<lh> zih;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw extends ViewGroup.MarginLayoutParams implements vt {
        public static final Parcelable.Creator<ouw> CREATOR = new Parcelable.Creator<ouw>() { // from class: com.bytedance.adsdk.ugeno.fkw.fkw.ouw.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ouw createFromParcel(Parcel parcel) {
                return new ouw(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ouw[] newArray(int i4) {
                return new ouw[i4];
            }
        };
        private int bly;
        float fkw;

        /* renamed from: le, reason: collision with root package name */
        private int f6883le;

        /* renamed from: lh, reason: collision with root package name */
        float f6884lh;
        int ouw;
        private int pno;
        private int ra;
        private boolean tlj;
        float vt;
        int yu;

        public ouw(ouw ouwVar) {
            super((ViewGroup.MarginLayoutParams) ouwVar);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f6884lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f6883le = -1;
            this.ra = -1;
            this.pno = 16777215;
            this.bly = 16777215;
            this.ouw = ouwVar.ouw;
            this.vt = ouwVar.vt;
            this.f6884lh = ouwVar.f6884lh;
            this.yu = ouwVar.yu;
            this.fkw = ouwVar.fkw;
            this.f6883le = ouwVar.f6883le;
            this.ra = ouwVar.ra;
            this.pno = ouwVar.pno;
            this.bly = ouwVar.bly;
            this.tlj = ouwVar.tlj;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int bly() {
            return this.pno;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final boolean cf() {
            return this.tlj;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float fkw() {
            return this.f6884lh;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int jg() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ko() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int le() {
            return this.yu;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int lh() {
            return this.ouw;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int mwh() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ouw() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int pno() {
            return this.ra;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ra() {
            return this.f6883le;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int rn() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float ryl() {
            return this.fkw;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int tlj() {
            return this.bly;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int vt() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.ouw);
            parcel.writeFloat(this.vt);
            parcel.writeFloat(this.f6884lh);
            parcel.writeInt(this.yu);
            parcel.writeFloat(this.fkw);
            parcel.writeInt(this.f6883le);
            parcel.writeInt(this.ra);
            parcel.writeInt(this.pno);
            parcel.writeInt(this.bly);
            parcel.writeByte(this.tlj ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float yu() {
            return this.vt;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final void ouw(int i4) {
            this.f6883le = i4;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final void vt(int i4) {
            this.ra = i4;
        }

        public ouw(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f6884lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f6883le = -1;
            this.ra = -1;
            this.pno = 16777215;
            this.bly = 16777215;
        }

        public ouw(int i4, int i10) {
            super(new ViewGroup.LayoutParams(i4, i10));
            this.ouw = 1;
            this.vt = 0.0f;
            this.f6884lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f6883le = -1;
            this.ra = -1;
            this.pno = 16777215;
            this.bly = 16777215;
        }

        public ouw(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f6884lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f6883le = -1;
            this.ra = -1;
            this.pno = 16777215;
            this.bly = 16777215;
        }

        public ouw(Parcel parcel) {
            super(0, 0);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f6884lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f6883le = -1;
            this.ra = -1;
            this.pno = 16777215;
            this.bly = 16777215;
            this.ouw = parcel.readInt();
            this.vt = parcel.readFloat();
            this.f6884lh = parcel.readFloat();
            this.yu = parcel.readInt();
            this.fkw = parcel.readFloat();
            this.f6883le = parcel.readInt();
            this.ra = parcel.readInt();
            this.pno = parcel.readInt();
            this.bly = parcel.readInt();
            this.tlj = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public fkw(Context context) {
        super(context, null);
        this.ra = -1;
        this.rn = new yu(this);
        this.zih = new ArrayList();
        this.vm = new yu.ouw();
    }

    private boolean fkw(int i4, int i10) {
        return le(i4, i10) ? ouw() ? (this.f6879cf & 1) != 0 : (this.tlj & 1) != 0 : ouw() ? (this.f6879cf & 2) != 0 : (this.tlj & 2) != 0;
    }

    private boolean le(int i4, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            View viewLh = lh(i4 - i11);
            if (viewLh != null && viewLh.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private View lh(int i4) {
        if (i4 < 0) {
            return null;
        }
        int[] iArr = this.f6880jg;
        if (i4 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i4]);
    }

    private void vt(int i4, int i10) {
        if (this.ko == null) {
            this.ko = new SparseIntArray(getChildCount());
        }
        if (this.rn.vt(this.ko)) {
            this.f6880jg = this.rn.ouw(this.ko);
        }
        int i11 = this.vt;
        if (i11 == 0 || i11 == 1) {
            lh(i4, i10);
        } else if (i11 == 2 || i11 == 3) {
            yu(i4, i10);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.vt);
        }
    }

    private void yu(int i4, int i10) {
        this.zih.clear();
        this.vm.ouw();
        this.rn.ouw(this.vm, i4, i10);
        this.zih = this.vm.ouw;
        this.rn.ouw(i4, i10);
        this.rn.ouw(i4, i10, getPaddingRight() + getPaddingLeft());
        this.rn.ouw();
        ouw(this.vt, i4, i10, this.vm.vt);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (this.ko == null) {
            this.ko = new SparseIntArray(getChildCount());
        }
        this.f6880jg = this.rn.ouw(view, i4, layoutParams, this.ko);
        super.addView(view, i4, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ouw;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ouw ? new ouw((ouw) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ouw((ViewGroup.MarginLayoutParams) layoutParams) : new ouw(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getAlignContent() {
        return this.f6881le;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getAlignItems() {
        return this.fkw;
    }

    public final Drawable getDividerDrawableHorizontal() {
        return this.pno;
    }

    public final Drawable getDividerDrawableVertical() {
        return this.bly;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexDirection() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexItemCount() {
        return getChildCount();
    }

    public final List<lh> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.zih.size());
        for (lh lhVar : this.zih) {
            if (lhVar.ouw() != 0) {
                arrayList.add(lhVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final List<lh> getFlexLinesInternal() {
        return this.zih;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexWrap() {
        return this.f6882lh;
    }

    public final int getJustifyContent() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getLargestMainSize() {
        Iterator<lh> it = this.zih.iterator();
        int iMax = LinearLayoutManager.INVALID_OFFSET;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().fkw);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getMaxLine() {
        return this.ra;
    }

    public final int getShowDividerHorizontal() {
        return this.tlj;
    }

    public final int getShowDividerVertical() {
        return this.f6879cf;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getSumOfCrossSize() {
        int size = this.zih.size();
        int i4 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            lh lhVar = this.zih.get(i10);
            if (yu(i10)) {
                i4 += ouw() ? this.ryl : this.mwh;
            }
            if (le(i10)) {
                i4 += ouw() ? this.ryl : this.mwh;
            }
            i4 += lhVar.ra;
        }
        return i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.bly == null && this.pno == null) {
            return;
        }
        if (this.tlj == 0 && this.f6879cf == 0) {
            return;
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.le.ouw(this);
        int i4 = this.vt;
        if (i4 == 0) {
            ouw(canvas, iOuw == 1, this.f6882lh == 2);
            return;
        }
        if (i4 == 1) {
            ouw(canvas, iOuw != 1, this.f6882lh == 2);
            return;
        }
        if (i4 == 2) {
            boolean z3 = iOuw == 1;
            if (this.f6882lh == 2) {
                z3 = !z3;
            }
            vt(canvas, z3, false);
            return;
        }
        if (i4 != 3) {
            return;
        }
        boolean z10 = iOuw == 1;
        if (this.f6882lh == 2) {
            z10 = !z10;
        }
        vt(canvas, z10, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        boolean z10;
        fkw fkwVar;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        fkw fkwVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z12;
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.yu();
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.le.ouw(this);
        int i21 = this.vt;
        if (i21 == 0) {
            if (iOuw == 1) {
                z10 = true;
                fkwVar = this;
                i13 = i4;
                i16 = i10;
                i15 = i12;
                i14 = i11;
            } else {
                z10 = false;
                fkwVar = this;
                i13 = i4;
                i14 = i11;
                i15 = i12;
                i16 = i10;
            }
            fkwVar.ouw(z10, i13, i16, i14, i15);
        } else if (i21 == 1) {
            if (iOuw != 1) {
                z11 = true;
                fkwVar2 = this;
                i17 = i4;
                i20 = i10;
                i19 = i12;
                i18 = i11;
            } else {
                z11 = false;
                fkwVar2 = this;
                i17 = i4;
                i18 = i11;
                i19 = i12;
                i20 = i10;
            }
            fkwVar2.ouw(z11, i17, i20, i18, i19);
        } else if (i21 == 2) {
            z12 = iOuw == 1;
            if (this.f6882lh == 2) {
                z12 = !z12;
            }
            ouw(z12, false, i4, i10, i11, i12);
        } else {
            if (i21 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.vt);
            }
            z12 = iOuw == 1;
            if (this.f6882lh == 2) {
                z12 = !z12;
            }
            ouw(z12, true, i4, i10, i11, i12);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i4, i10);
            vt(iArrOuw[0], iArrOuw[1]);
        } else {
            vt(i4, i10);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i10, int i11, int i12) {
        super.onSizeChanged(i4, i10, i11, i12);
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i4, i10);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final View ouw(int i4) {
        return getChildAt(i4);
    }

    public final void setAlignContent(int i4) {
        if (this.f6881le != i4) {
            this.f6881le = i4;
            requestLayout();
        }
    }

    public final void setAlignItems(int i4) {
        if (this.fkw != i4) {
            this.fkw = i4;
            requestLayout();
        }
    }

    public final void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public final void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.pno) {
            return;
        }
        this.pno = drawable;
        if (drawable != null) {
            this.ryl = drawable.getIntrinsicHeight();
        } else {
            this.ryl = 0;
        }
        vt();
        requestLayout();
    }

    public final void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.bly) {
            return;
        }
        this.bly = drawable;
        if (drawable != null) {
            this.mwh = drawable.getIntrinsicWidth();
        } else {
            this.mwh = 0;
        }
        vt();
        requestLayout();
    }

    public final void setFlexDirection(int i4) {
        if (this.vt != i4) {
            this.vt = i4;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void setFlexLines(List<lh> list) {
        this.zih = list;
    }

    public final void setFlexWrap(int i4) {
        if (this.f6882lh != i4) {
            this.f6882lh = i4;
            requestLayout();
        }
    }

    public final void setJustifyContent(int i4) {
        if (this.yu != i4) {
            this.yu = i4;
            requestLayout();
        }
    }

    public final void setMaxLine(int i4) {
        if (this.ra != i4) {
            this.ra = i4;
            requestLayout();
        }
    }

    public final void setShowDivider(int i4) {
        setShowDividerVertical(i4);
        setShowDividerHorizontal(i4);
    }

    public final void setShowDividerHorizontal(int i4) {
        if (i4 != this.tlj) {
            this.tlj = i4;
            requestLayout();
        }
    }

    public final void setShowDividerVertical(int i4) {
        if (i4 != this.f6879cf) {
            this.f6879cf = i4;
            requestLayout();
        }
    }

    private void ouw(int i4, int i10, int i11, int i12) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (i4 == 0 || i4 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i4)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i10, i12);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
            }
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, 256);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i11, i12);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
            }
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private boolean le(int i4) {
        if (i4 >= 0 && i4 < this.zih.size()) {
            for (int i10 = i4 + 1; i10 < this.zih.size(); i10++) {
                if (this.zih.get(i10).ouw() > 0) {
                    return false;
                }
            }
            if (ouw()) {
                return (this.tlj & 4) != 0;
            }
            if ((this.f6879cf & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private void lh(int i4, int i10) {
        this.zih.clear();
        this.vm.ouw();
        this.rn.ouw(this.vm, i4, i10, (List<lh>) null);
        this.zih = this.vm.ouw;
        this.rn.ouw(i4, i10);
        if (this.fkw == 3) {
            for (lh lhVar : this.zih) {
                int iMax = LinearLayoutManager.INVALID_OFFSET;
                for (int i11 = 0; i11 < lhVar.pno; i11++) {
                    View viewLh = lh(lhVar.ko + i11);
                    if (viewLh != null && viewLh.getVisibility() != 8) {
                        ouw ouwVar = (ouw) viewLh.getLayoutParams();
                        if (this.f6882lh != 2) {
                            iMax = Math.max(iMax, viewLh.getMeasuredHeight() + Math.max(lhVar.ryl - viewLh.getBaseline(), ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin);
                        } else {
                            iMax = Math.max(iMax, viewLh.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ouwVar).topMargin + Math.max(viewLh.getBaseline() + (lhVar.ryl - viewLh.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin));
                        }
                    }
                }
                lhVar.ra = iMax;
            }
        }
        this.rn.ouw(i4, i10, getPaddingBottom() + getPaddingTop());
        this.rn.ouw();
        ouw(this.vt, i4, i10, this.vm.vt);
    }

    private boolean fkw(int i4) {
        for (int i10 = 0; i10 < i4; i10++) {
            if (this.zih.get(i10).ouw() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final View vt(int i4) {
        return lh(i4);
    }

    private void vt(Canvas canvas, boolean z3, boolean z10) {
        int i4;
        int i10;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.zih.size();
        for (int i11 = 0; i11 < size; i11++) {
            lh lhVar = this.zih.get(i11);
            for (int i12 = 0; i12 < lhVar.pno; i12++) {
                int i13 = lhVar.ko + i12;
                View viewLh = lh(i13);
                if (viewLh != null && viewLh.getVisibility() != 8) {
                    ouw ouwVar = (ouw) viewLh.getLayoutParams();
                    if (fkw(i13, i12)) {
                        if (z10) {
                            top = viewLh.getBottom() + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin;
                        } else {
                            top = (viewLh.getTop() - ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) - this.ryl;
                        }
                        vt(canvas, lhVar.ouw, top, lhVar.ra);
                    }
                    if (i12 == lhVar.pno - 1 && (this.tlj & 4) > 0) {
                        if (z10) {
                            bottom = (viewLh.getTop() - ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) - this.ryl;
                        } else {
                            bottom = viewLh.getBottom() + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin;
                        }
                        vt(canvas, lhVar.ouw, bottom, lhVar.ra);
                    }
                }
            }
            if (yu(i11)) {
                if (z3) {
                    i10 = lhVar.f6891lh;
                } else {
                    i10 = lhVar.ouw - this.mwh;
                }
                ouw(canvas, i10, paddingTop, iMax);
            }
            if (le(i11) && (this.f6879cf & 4) > 0) {
                if (z3) {
                    i4 = lhVar.ouw - this.mwh;
                } else {
                    i4 = lhVar.f6891lh;
                }
                ouw(canvas, i4, paddingTop, iMax);
            }
        }
    }

    private boolean yu(int i4) {
        if (i4 >= 0 && i4 < this.zih.size()) {
            if (fkw(i4)) {
                return ouw() ? (this.tlj & 1) != 0 : (this.f6879cf & 1) != 0;
            }
            if (ouw()) {
                return (this.tlj & 2) != 0;
            }
            if ((this.f6879cf & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final boolean ouw() {
        int i4 = this.vt;
        return i4 == 0 || i4 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.fkw.ouw(boolean, int, int, int, int):void");
    }

    private void vt(Canvas canvas, int i4, int i10, int i11) {
        Drawable drawable = this.pno;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i4, i10, i11 + i4, this.ryl + i10);
        this.pno.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int vt(int i4, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i4, i10, i11);
    }

    private void vt() {
        if (this.pno == null && this.bly == null) {
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
    private void ouw(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.fkw.fkw.ouw(boolean, boolean, int, int, int, int):void");
    }

    private void ouw(Canvas canvas, boolean z3, boolean z10) {
        int i4;
        int i10;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.zih.size();
        for (int i11 = 0; i11 < size; i11++) {
            lh lhVar = this.zih.get(i11);
            for (int i12 = 0; i12 < lhVar.pno; i12++) {
                int i13 = lhVar.ko + i12;
                View viewLh = lh(i13);
                if (viewLh != null && viewLh.getVisibility() != 8) {
                    ouw ouwVar = (ouw) viewLh.getLayoutParams();
                    if (fkw(i13, i12)) {
                        if (z3) {
                            left = viewLh.getRight() + ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin;
                        } else {
                            left = (viewLh.getLeft() - ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin) - this.mwh;
                        }
                        ouw(canvas, left, lhVar.vt, lhVar.ra);
                    }
                    if (i12 == lhVar.pno - 1 && (this.f6879cf & 4) > 0) {
                        if (z3) {
                            right = (viewLh.getLeft() - ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin) - this.mwh;
                        } else {
                            right = viewLh.getRight() + ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin;
                        }
                        ouw(canvas, right, lhVar.vt, lhVar.ra);
                    }
                }
            }
            if (yu(i11)) {
                if (z10) {
                    i10 = lhVar.yu;
                } else {
                    i10 = lhVar.vt - this.ryl;
                }
                vt(canvas, paddingLeft, i10, iMax);
            }
            if (le(i11) && (this.tlj & 4) > 0) {
                if (z10) {
                    i4 = lhVar.vt - this.ryl;
                } else {
                    i4 = lhVar.yu;
                }
                vt(canvas, paddingLeft, i4, iMax);
            }
        }
    }

    private void ouw(Canvas canvas, int i4, int i10, int i11) {
        Drawable drawable = this.bly;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i4, i10, this.mwh + i4, i11 + i10);
        this.bly.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int ouw(int i4, int i10) {
        int i11;
        int i12;
        if (ouw()) {
            i11 = fkw(i4, i10) ? this.mwh : 0;
            if ((this.f6879cf & 4) <= 0) {
                return i11;
            }
            i12 = this.mwh;
        } else {
            i11 = fkw(i4, i10) ? this.ryl : 0;
            if ((this.tlj & 4) <= 0) {
                return i11;
            }
            i12 = this.ryl;
        }
        return i11 + i12;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void ouw(lh lhVar) {
        if (ouw()) {
            if ((this.f6879cf & 4) > 0) {
                int i4 = lhVar.fkw;
                int i10 = this.mwh;
                lhVar.fkw = i4 + i10;
                lhVar.f6890le += i10;
                return;
            }
            return;
        }
        if ((this.tlj & 4) > 0) {
            int i11 = lhVar.fkw;
            int i12 = this.ryl;
            lhVar.fkw = i11 + i12;
            lhVar.f6890le += i12;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int ouw(int i4, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i4, i10, i11);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void ouw(int i4, int i10, lh lhVar) {
        if (fkw(i4, i10)) {
            if (ouw()) {
                int i11 = lhVar.fkw;
                int i12 = this.mwh;
                lhVar.fkw = i11 + i12;
                lhVar.f6890le += i12;
                return;
            }
            int i13 = lhVar.fkw;
            int i14 = this.ryl;
            lhVar.fkw = i13 + i14;
            lhVar.f6890le += i14;
        }
    }
}
