package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import k3.d;
import k3.g;
import l3.b;
import n3.q;
import n3.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class Flow extends s {
    public g j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // n3.s, n3.b
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        g gVar = new g();
        gVar.f27907s0 = 0;
        gVar.f27908t0 = 0;
        gVar.f27909u0 = 0;
        gVar.f27910v0 = 0;
        gVar.f27911w0 = 0;
        gVar.f27912x0 = 0;
        gVar.f27913y0 = false;
        gVar.f27914z0 = 0;
        gVar.A0 = 0;
        gVar.B0 = new b();
        gVar.C0 = null;
        gVar.D0 = -1;
        gVar.E0 = -1;
        gVar.F0 = -1;
        gVar.G0 = -1;
        gVar.H0 = -1;
        gVar.I0 = -1;
        gVar.J0 = 0.5f;
        gVar.K0 = 0.5f;
        gVar.L0 = 0.5f;
        gVar.M0 = 0.5f;
        gVar.N0 = 0.5f;
        gVar.O0 = 0.5f;
        gVar.P0 = 0;
        gVar.Q0 = 0;
        gVar.R0 = 2;
        gVar.S0 = 2;
        gVar.T0 = 0;
        gVar.U0 = -1;
        gVar.V0 = 0;
        gVar.W0 = new ArrayList();
        gVar.X0 = null;
        gVar.Y0 = null;
        gVar.Z0 = null;
        gVar.f27906b1 = 0;
        this.j = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f29721b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.j.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f27907s0 = dimensionPixelSize;
                    gVar2.f27908t0 = dimensionPixelSize;
                    gVar2.f27909u0 = dimensionPixelSize;
                    gVar2.f27910v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f27909u0 = dimensionPixelSize2;
                    gVar3.f27911w0 = dimensionPixelSize2;
                    gVar3.f27912x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.j.f27910v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.j.f27911w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.j.f27907s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.j.f27912x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.j.f27908t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.j.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.j.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.j.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.j.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.j.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.j.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.j.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.j.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.j.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.j.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.j.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.j.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.j.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.j.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.j.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.j.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.j.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.j.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f29575d = this.j;
        i();
    }

    @Override // n3.b
    public final void h(d dVar, boolean z3) {
        g gVar = this.j;
        int i4 = gVar.f27909u0;
        if (i4 > 0 || gVar.f27910v0 > 0) {
            if (z3) {
                gVar.f27911w0 = gVar.f27910v0;
                gVar.f27912x0 = i4;
            } else {
                gVar.f27911w0 = i4;
                gVar.f27912x0 = gVar.f27910v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // n3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(k3.g r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(k3.g, int, int):void");
    }

    @Override // n3.b, android.view.View
    public final void onMeasure(int i4, int i10) {
        j(this.j, i4, i10);
    }

    public void setFirstHorizontalBias(float f10) {
        this.j.L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.j.F0 = i4;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.j.M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.j.G0 = i4;
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.j.R0 = i4;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.j.J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.j.P0 = i4;
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.j.D0 = i4;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.j.N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.j.H0 = i4;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.j.O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.j.I0 = i4;
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.j.U0 = i4;
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.j.V0 = i4;
        requestLayout();
    }

    public void setPadding(int i4) {
        g gVar = this.j;
        gVar.f27907s0 = i4;
        gVar.f27908t0 = i4;
        gVar.f27909u0 = i4;
        gVar.f27910v0 = i4;
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.j.f27908t0 = i4;
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.j.f27911w0 = i4;
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.j.f27912x0 = i4;
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.j.f27907s0 = i4;
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.j.S0 = i4;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.j.K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.j.Q0 = i4;
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.j.E0 = i4;
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.j.T0 = i4;
        requestLayout();
    }
}
