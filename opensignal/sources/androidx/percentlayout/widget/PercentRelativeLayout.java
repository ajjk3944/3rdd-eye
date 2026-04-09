package androidx.percentlayout.widget;

import a7.a;
import a7.b;
import a7.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import b9.c;
import java.util.WeakHashMap;
import u3.i0;

@Deprecated
/* loaded from: classes.dex */
public class PercentRelativeLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final c f2035a;

    public PercentRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2035a = new c(2, this);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d generateLayoutParams(AttributeSet attributeSet) {
        a aVar;
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z6.a.PercentLayout_Layout);
        float fraction = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0f);
        if (fraction != -1.0f) {
            aVar = new a();
            aVar.f174a = fraction;
        } else {
            aVar = null;
        }
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0f);
        if (fraction2 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f175b = fraction2;
        }
        float fraction3 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0f);
        if (fraction3 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f176c = fraction3;
            aVar.f177d = fraction3;
            aVar.f178e = fraction3;
            aVar.f179f = fraction3;
        }
        float fraction4 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0f);
        if (fraction4 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f176c = fraction4;
        }
        float fraction5 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0f);
        if (fraction5 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f177d = fraction5;
        }
        float fraction6 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0f);
        if (fraction6 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f178e = fraction6;
        }
        float fraction7 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0f);
        if (fraction7 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f179f = fraction7;
        }
        float fraction8 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0f);
        if (fraction8 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f180g = fraction8;
        }
        float fraction9 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0f);
        if (fraction9 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f181h = fraction9;
        }
        float fraction10 = typedArrayObtainStyledAttributes.getFraction(z6.a.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0f);
        if (fraction10 != -1.0f) {
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f182i = fraction10;
        }
        typedArrayObtainStyledAttributes.recycle();
        dVar.f185a = aVar;
        return dVar;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PercentRelativeLayout percentRelativeLayout = (PercentRelativeLayout) this.f2035a.f2478d;
        int childCount = percentRelativeLayout.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            ViewGroup.LayoutParams layoutParams = percentRelativeLayout.getChildAt(i14).getLayoutParams();
            if (layoutParams instanceof b) {
                d dVar = (d) ((b) layoutParams);
                if (dVar.f185a == null) {
                    dVar.f185a = new a();
                }
                a aVar = dVar.f185a;
                if (aVar != null) {
                    a7.c cVar = aVar.j;
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (!cVar.f184b) {
                            ((ViewGroup.LayoutParams) marginLayoutParams).width = ((ViewGroup.MarginLayoutParams) cVar).width;
                        }
                        if (!cVar.f183a) {
                            ((ViewGroup.LayoutParams) marginLayoutParams).height = ((ViewGroup.MarginLayoutParams) cVar).height;
                        }
                        cVar.f184b = false;
                        cVar.f183a = false;
                        marginLayoutParams.leftMargin = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        marginLayoutParams.topMargin = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                        marginLayoutParams.rightMargin = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        marginLayoutParams.bottomMargin = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                        marginLayoutParams.setMarginStart(cVar.getMarginStart());
                        marginLayoutParams.setMarginEnd(cVar.getMarginEnd());
                    } else {
                        if (!cVar.f184b) {
                            layoutParams.width = ((ViewGroup.MarginLayoutParams) cVar).width;
                        }
                        if (!cVar.f183a) {
                            layoutParams.height = ((ViewGroup.MarginLayoutParams) cVar).height;
                        }
                        cVar.f184b = false;
                        cVar.f183a = false;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        c cVar = this.f2035a;
        cVar.getClass();
        int size = View.MeasureSpec.getSize(i10);
        PercentRelativeLayout percentRelativeLayout = (PercentRelativeLayout) cVar.f2478d;
        int paddingLeft = (size - percentRelativeLayout.getPaddingLeft()) - percentRelativeLayout.getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - percentRelativeLayout.getPaddingTop()) - percentRelativeLayout.getPaddingBottom();
        int childCount = percentRelativeLayout.getChildCount();
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i12 >= childCount) {
                break;
            }
            View childAt = percentRelativeLayout.getChildAt(i12);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof b) {
                d dVar = (d) ((b) layoutParams);
                if (dVar.f185a == null) {
                    dVar.f185a = new a();
                }
                a aVar = dVar.f185a;
                if (aVar != null) {
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        aVar.a(marginLayoutParams, paddingLeft, size2);
                        a7.c cVar2 = aVar.j;
                        ((ViewGroup.MarginLayoutParams) cVar2).leftMargin = marginLayoutParams.leftMargin;
                        ((ViewGroup.MarginLayoutParams) cVar2).topMargin = marginLayoutParams.topMargin;
                        ((ViewGroup.MarginLayoutParams) cVar2).rightMargin = marginLayoutParams.rightMargin;
                        ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin = marginLayoutParams.bottomMargin;
                        cVar2.setMarginStart(marginLayoutParams.getMarginStart());
                        cVar2.setMarginEnd(marginLayoutParams.getMarginEnd());
                        float f10 = aVar.f176c;
                        if (f10 >= 0.0f) {
                            marginLayoutParams.leftMargin = Math.round(paddingLeft * f10);
                        }
                        float f11 = aVar.f177d;
                        if (f11 >= 0.0f) {
                            marginLayoutParams.topMargin = Math.round(size2 * f11);
                        }
                        float f12 = aVar.f178e;
                        if (f12 >= 0.0f) {
                            marginLayoutParams.rightMargin = Math.round(paddingLeft * f12);
                        }
                        float f13 = aVar.f179f;
                        if (f13 >= 0.0f) {
                            marginLayoutParams.bottomMargin = Math.round(size2 * f13);
                        }
                        float f14 = aVar.f180g;
                        if (f14 >= 0.0f) {
                            marginLayoutParams.setMarginStart(Math.round(paddingLeft * f14));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = aVar.f181h;
                        if (f15 >= 0.0f) {
                            marginLayoutParams.setMarginEnd(Math.round(paddingLeft * f15));
                        } else {
                            z11 = z10;
                        }
                        if (z11) {
                            WeakHashMap weakHashMap = i0.f23177a;
                            marginLayoutParams.resolveLayoutDirection(childAt.getLayoutDirection());
                        }
                    } else {
                        aVar.a(layoutParams, paddingLeft, size2);
                    }
                }
            }
            i12++;
        }
        super.onMeasure(i10, i11);
        int childCount2 = percentRelativeLayout.getChildCount();
        boolean z12 = false;
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = percentRelativeLayout.getChildAt(i13);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            if (layoutParams2 instanceof b) {
                d dVar2 = (d) ((b) layoutParams2);
                if (dVar2.f185a == null) {
                    dVar2.f185a = new a();
                }
                a aVar2 = dVar2.f185a;
                if (aVar2 != null) {
                    a7.c cVar3 = aVar2.j;
                    if ((childAt2.getMeasuredWidthAndState() & (-16777216)) == 16777216 && aVar2.f174a >= 0.0f && ((ViewGroup.MarginLayoutParams) cVar3).width == -2) {
                        layoutParams2.width = -2;
                        z12 = true;
                    }
                    if ((childAt2.getMeasuredHeightAndState() & (-16777216)) == 16777216 && aVar2.f175b >= 0.0f && ((ViewGroup.MarginLayoutParams) cVar3).height == -2) {
                        layoutParams2.height = -2;
                        z12 = true;
                    }
                }
            }
        }
        if (z12) {
            super.onMeasure(i10, i11);
        }
    }
}
