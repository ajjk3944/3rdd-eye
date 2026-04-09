package androidx.constraintlayout.helper.widget;

import A.b;
import C.r;
import C.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import z.d;
import z.g;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: j, reason: collision with root package name */
    public g f5037j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // C.t, C.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        g gVar = new g();
        gVar.f24423s0 = 0;
        gVar.f24424t0 = 0;
        gVar.f24425u0 = 0;
        gVar.v0 = 0;
        gVar.f24426w0 = 0;
        gVar.f24427x0 = 0;
        gVar.f24428y0 = false;
        gVar.f24429z0 = 0;
        gVar.f24395A0 = 0;
        gVar.f24396B0 = new b();
        gVar.f24397C0 = null;
        gVar.f24398D0 = -1;
        gVar.f24399E0 = -1;
        gVar.f24400F0 = -1;
        gVar.f24401G0 = -1;
        gVar.f24402H0 = -1;
        gVar.f24403I0 = -1;
        gVar.f24404J0 = 0.5f;
        gVar.f24405K0 = 0.5f;
        gVar.f24406L0 = 0.5f;
        gVar.f24407M0 = 0.5f;
        gVar.f24408N0 = 0.5f;
        gVar.f24409O0 = 0.5f;
        gVar.f24410P0 = 0;
        gVar.f24411Q0 = 0;
        gVar.f24412R0 = 2;
        gVar.f24413S0 = 2;
        gVar.f24414T0 = 0;
        gVar.f24415U0 = -1;
        gVar.f24416V0 = 0;
        gVar.f24417W0 = new ArrayList();
        gVar.f24418X0 = null;
        gVar.f24419Y0 = null;
        gVar.f24420Z0 = null;
        gVar.f24422b1 = 0;
        this.f5037j = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f1013b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f5037j.f24416V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f5037j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f24423s0 = dimensionPixelSize;
                    gVar2.f24424t0 = dimensionPixelSize;
                    gVar2.f24425u0 = dimensionPixelSize;
                    gVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar3 = this.f5037j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f24425u0 = dimensionPixelSize2;
                    gVar3.f24426w0 = dimensionPixelSize2;
                    gVar3.f24427x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f5037j.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f5037j.f24426w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f5037j.f24423s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f5037j.f24427x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f5037j.f24424t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f5037j.f24414T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f5037j.f24398D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f5037j.f24399E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f5037j.f24400F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f5037j.f24402H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f5037j.f24401G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f5037j.f24403I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f5037j.f24404J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f5037j.f24406L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f5037j.f24408N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f5037j.f24407M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f5037j.f24409O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f5037j.f24405K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f5037j.f24412R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f5037j.f24413S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f5037j.f24410P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f5037j.f24411Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f5037j.f24415U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f812d = this.f5037j;
        k();
    }

    @Override // C.c
    public final void i(d dVar, boolean z6) {
        g gVar = this.f5037j;
        int i = gVar.f24425u0;
        if (i > 0 || gVar.v0 > 0) {
            if (z6) {
                gVar.f24426w0 = gVar.v0;
                gVar.f24427x0 = i;
            } else {
                gVar.f24426w0 = i;
                gVar.f24427x0 = gVar.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v45 */
    @Override // C.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(z.g r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.l(z.g, int, int):void");
    }

    @Override // C.c, android.view.View
    public final void onMeasure(int i, int i3) {
        l(this.f5037j, i, i3);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f5037j.f24406L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f5037j.f24400F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f5037j.f24407M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f5037j.f24401G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f5037j.f24412R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f5037j.f24404J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f5037j.f24410P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f5037j.f24398D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f5037j.f24408N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f5037j.f24402H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f5037j.f24409O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f5037j.f24403I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f5037j.f24415U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f5037j.f24416V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f5037j;
        gVar.f24423s0 = i;
        gVar.f24424t0 = i;
        gVar.f24425u0 = i;
        gVar.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f5037j.f24424t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f5037j.f24426w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f5037j.f24427x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f5037j.f24423s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f5037j.f24413S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f5037j.f24405K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f5037j.f24411Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f5037j.f24399E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f5037j.f24414T0 = i;
        requestLayout();
    }
}
