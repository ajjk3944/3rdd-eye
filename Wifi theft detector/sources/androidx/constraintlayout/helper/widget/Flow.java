package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import b0.d;
import b0.g;
import x.b;

/* loaded from: classes.dex */
public class Flow extends g {

    /* renamed from: l, reason: collision with root package name */
    public e f1869l;

    public Flow(Context context) {
        super(context);
    }

    @Override // b0.g, androidx.constraintlayout.widget.b
    public void n(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.n(attributeSet);
        this.f1869l = new e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.ConstraintLayout_Layout_android_orientation) {
                    this.f1869l.x2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_padding) {
                    this.f1869l.D1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_paddingStart) {
                    this.f1869l.I1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f1869l.F1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1869l.G1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1869l.J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1869l.H1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1869l.E1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1869l.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1869l.r2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1869l.B2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1869l.l2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1869l.t2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1869l.n2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1869l.v2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1869l.p2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1869l.k2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1869l.s2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1869l.m2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1869l.u2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1869l.z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1869l.o2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == d.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1869l.y2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == d.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1869l.q2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1869l.A2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1869l.w2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2182d = this.f1869l;
        v();
    }

    @Override // androidx.constraintlayout.widget.b
    public void o(c.a aVar, b bVar, ConstraintLayout.b bVar2, SparseArray sparseArray) {
        super.o(aVar, bVar, bVar2, sparseArray);
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            int i10 = bVar2.Y;
            if (i10 != -1) {
                eVar.x2(i10);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onMeasure(int i10, int i11) {
        w(this.f1869l, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.b
    public void p(ConstraintWidget constraintWidget, boolean z10) {
        this.f1869l.o1(z10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1869l.k2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1869l.l2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1869l.m2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1869l.n2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1869l.o2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1869l.p2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1869l.q2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1869l.r2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1869l.w2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1869l.x2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f1869l.D1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1869l.E1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1869l.G1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1869l.H1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1869l.J1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1869l.y2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1869l.z2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1869l.A2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1869l.B2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1869l.C2(i10);
        requestLayout();
    }

    @Override // b0.g
    public void w(h hVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (hVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            hVar.x1(mode, size, mode2, size2);
            setMeasuredDimension(hVar.s1(), hVar.r1());
        }
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
