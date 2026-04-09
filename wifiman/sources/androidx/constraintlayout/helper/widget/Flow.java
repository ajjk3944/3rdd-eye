package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.j;
import o1.AbstractC7056l;
import o1.C7049e;
import o1.C7051g;

/* loaded from: classes.dex */
public class Flow extends j {

    /* renamed from: k, reason: collision with root package name */
    private C7051g f30041k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.j, androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.g(attributeSet);
        this.f30041k = new C7051g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f30435a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f30442b1) {
                    this.f30041k.S1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30449c1) {
                    this.f30041k.Y0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30519m1) {
                    this.f30041k.d1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30526n1) {
                    this.f30041k.a1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30456d1) {
                    this.f30041k.b1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30463e1) {
                    this.f30041k.e1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30470f1) {
                    this.f30041k.c1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30477g1) {
                    this.f30041k.Z0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30345L1) {
                    this.f30041k.X1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30285B1) {
                    this.f30041k.M1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30339K1) {
                    this.f30041k.W1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30582v1) {
                    this.f30041k.G1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30297D1) {
                    this.f30041k.O1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30595x1) {
                    this.f30041k.I1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30309F1) {
                    this.f30041k.Q1(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f30607z1) {
                    this.f30041k.K1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f30575u1) {
                    this.f30041k.F1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f30291C1) {
                    this.f30041k.N1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f30589w1) {
                    this.f30041k.H1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f30303E1) {
                    this.f30041k.P1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f30327I1) {
                    this.f30041k.U1(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f30601y1) {
                    this.f30041k.J1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f30321H1) {
                    this.f30041k.T1(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f30279A1) {
                    this.f30041k.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30333J1) {
                    this.f30041k.V1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f30315G1) {
                    this.f30041k.R1(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f30156d = this.f30041k;
        m();
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(C7049e c7049e, boolean z10) {
        this.f30041k.K0(z10);
    }

    @Override // androidx.constraintlayout.widget.j
    public void n(AbstractC7056l abstractC7056l, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (abstractC7056l == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC7056l.S0(mode, size, mode2, size2);
            setMeasuredDimension(abstractC7056l.N0(), abstractC7056l.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    protected void onMeasure(int i10, int i11) {
        n(this.f30041k, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f30041k.F1(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f30041k.G1(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f30041k.H1(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f30041k.I1(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f30041k.J1(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f30041k.K1(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f30041k.L1(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f30041k.M1(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f30041k.R1(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f30041k.S1(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f30041k.Y0(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f30041k.Z0(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f30041k.b1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f30041k.c1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f30041k.e1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f30041k.T1(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f30041k.U1(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f30041k.V1(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f30041k.W1(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f30041k.X1(i10);
        requestLayout();
    }
}
