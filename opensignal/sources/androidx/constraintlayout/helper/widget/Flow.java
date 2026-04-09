package androidx.constraintlayout.helper.widget;

import a3.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c3.s;
import c3.u;
import java.util.ArrayList;
import z2.g;
import z2.j;

/* loaded from: classes.dex */
public class Flow extends u {
    public j F;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // c3.u, c3.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        j jVar = new j();
        jVar.f26604s0 = 0;
        jVar.f26605t0 = 0;
        jVar.f26606u0 = 0;
        jVar.f26607v0 = 0;
        jVar.f26608w0 = 0;
        jVar.f26609x0 = 0;
        jVar.f26610y0 = false;
        jVar.f26611z0 = 0;
        jVar.A0 = 0;
        jVar.B0 = new b();
        jVar.C0 = null;
        jVar.D0 = -1;
        jVar.E0 = -1;
        jVar.F0 = -1;
        jVar.G0 = -1;
        jVar.H0 = -1;
        jVar.I0 = -1;
        jVar.J0 = 0.5f;
        jVar.K0 = 0.5f;
        jVar.L0 = 0.5f;
        jVar.M0 = 0.5f;
        jVar.N0 = 0.5f;
        jVar.O0 = 0.5f;
        jVar.P0 = 0;
        jVar.Q0 = 0;
        jVar.R0 = 2;
        jVar.S0 = 2;
        jVar.T0 = 0;
        jVar.U0 = -1;
        jVar.V0 = 0;
        jVar.W0 = new ArrayList();
        jVar.X0 = null;
        jVar.Y0 = null;
        jVar.Z0 = null;
        jVar.f26603b1 = 0;
        this.F = jVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == s.ConstraintLayout_Layout_android_orientation) {
                    this.F.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_padding) {
                    j jVar2 = this.F;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar2.f26604s0 = dimensionPixelSize;
                    jVar2.f26605t0 = dimensionPixelSize;
                    jVar2.f26606u0 = dimensionPixelSize;
                    jVar2.f26607v0 = dimensionPixelSize;
                } else if (index == s.ConstraintLayout_Layout_android_paddingStart) {
                    j jVar3 = this.F;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar3.f26606u0 = dimensionPixelSize2;
                    jVar3.f26608w0 = dimensionPixelSize2;
                    jVar3.f26609x0 = dimensionPixelSize2;
                } else if (index == s.ConstraintLayout_Layout_android_paddingEnd) {
                    this.F.f26607v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingLeft) {
                    this.F.f26608w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingTop) {
                    this.F.f26604s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingRight) {
                    this.F.f26609x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_android_paddingBottom) {
                    this.F.f26605t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_wrapMode) {
                    this.F.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.F.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.F.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.F.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.F.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.F.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.F.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.F.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.F.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.F.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.F.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.F.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalBias) {
                    this.F.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.F.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.F.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == s.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.F.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_verticalGap) {
                    this.F.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == s.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.F.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f3146r = this.F;
        k();
    }

    @Override // c3.c
    public final void i(g gVar, boolean z10) {
        j jVar = this.F;
        int i10 = jVar.f26606u0;
        if (i10 > 0 || jVar.f26607v0 > 0) {
            if (z10) {
                jVar.f26608w0 = jVar.f26607v0;
                jVar.f26609x0 = i10;
            } else {
                jVar.f26608w0 = i10;
                jVar.f26609x0 = jVar.f26607v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:388:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x010f A[EDGE_INSN: B:427:0x010f->B:62:0x010f BREAK  A[LOOP:1: B:56:0x00f8->B:61:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // c3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(z2.j r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1903
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.l(z2.j, int, int):void");
    }

    @Override // c3.c, android.view.View
    public final void onMeasure(int i10, int i11) {
        l(this.F, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.F.L0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.F.F0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.F.M0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.F.G0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.F.R0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.F.J0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.F.P0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.F.D0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.F.N0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.F.H0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.F.O0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.F.I0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.F.U0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.F.V0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        j jVar = this.F;
        jVar.f26604s0 = i10;
        jVar.f26605t0 = i10;
        jVar.f26606u0 = i10;
        jVar.f26607v0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.F.f26605t0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.F.f26608w0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.F.f26609x0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.F.f26604s0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.F.S0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.F.K0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.F.Q0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.F.E0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.F.T0 = i10;
        requestLayout();
    }
}
