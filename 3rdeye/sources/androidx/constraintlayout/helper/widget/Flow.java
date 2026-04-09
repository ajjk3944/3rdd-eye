package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import r0.C5508e;
import r0.C5510g;
import r0.C5514k;
import u0.d;
import u0.f;

/* loaded from: classes.dex */
public class Flow extends f {

    /* renamed from: l, reason: collision with root package name */
    public C5510g f15195l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // u0.f, androidx.constraintlayout.widget.c
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f15195l = new C5510g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f46499b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f15195l.f45622W0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C5510g c5510g = this.f15195l;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c5510g.f45660t0 = dimensionPixelSize;
                    c5510g.f45661u0 = dimensionPixelSize;
                    c5510g.f45662v0 = dimensionPixelSize;
                    c5510g.f45663w0 = dimensionPixelSize;
                } else if (index == 18) {
                    C5510g c5510g2 = this.f15195l;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c5510g2.f45662v0 = dimensionPixelSize2;
                    c5510g2.f45664x0 = dimensionPixelSize2;
                    c5510g2.f45665y0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f15195l.f45663w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f15195l.f45664x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f15195l.f45660t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f15195l.f45665y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f15195l.f45661u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f15195l.f45620U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f15195l.f45605E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f15195l.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f15195l.f45606G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f15195l.f45608I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f15195l.f45607H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f15195l.f45609J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f15195l.f45610K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f15195l.f45612M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f15195l.f45614O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f15195l.f45613N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f15195l.f45615P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f15195l.f45611L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f15195l.f45618S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f15195l.f45619T0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f15195l.f45616Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f15195l.f45617R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f15195l.f45621V0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f15307e = this.f15195l;
        i();
    }

    @Override // androidx.constraintlayout.widget.c
    public final void h(C5508e c5508e, boolean z10) {
        C5510g c5510g = this.f15195l;
        int i = c5510g.f45662v0;
        if (i > 0 || c5510g.f45663w0 > 0) {
            if (z10) {
                c5510g.f45664x0 = c5510g.f45663w0;
                c5510g.f45665y0 = i;
            } else {
                c5510g.f45664x0 = i;
                c5510g.f45665y0 = c5510g.f45663w0;
            }
        }
    }

    @Override // u0.f
    public final void j(C5514k c5514k, int i, int i10) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (c5514k == null) {
            setMeasuredDimension(0, 0);
        } else {
            c5514k.T(mode, size, mode2, size2);
            setMeasuredDimension(c5514k.f45656A0, c5514k.f45657B0);
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i10) {
        j(this.f15195l, i, i10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f15195l.f45612M0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f15195l.f45606G0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f15195l.f45613N0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f15195l.f45607H0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f15195l.f45618S0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f15195l.f45610K0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f15195l.f45616Q0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f15195l.f45605E0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f15195l.f45614O0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f15195l.f45608I0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f15195l.f45615P0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f15195l.f45609J0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f15195l.f45621V0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f15195l.f45622W0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C5510g c5510g = this.f15195l;
        c5510g.f45660t0 = i;
        c5510g.f45661u0 = i;
        c5510g.f45662v0 = i;
        c5510g.f45663w0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f15195l.f45661u0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f15195l.f45664x0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f15195l.f45665y0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f15195l.f45660t0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f15195l.f45619T0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f15195l.f45611L0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f15195l.f45617R0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f15195l.F0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f15195l.f45620U0 = i;
        requestLayout();
    }
}
