package com.bytedance.sdk.openadsdk.lh;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.lh.tlj;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno extends ViewGroup implements tlj.lh {
    private final tlj ouw;

    public pno(Context context, tlj tljVar) {
        super(context);
        this.ouw = tljVar;
        tljVar.ouw(this);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        int i13;
        int childCount = getChildCount();
        int i14 = i11 - i4;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i18 = i15 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i18 + i16 < i14) {
                i13 = i16 + i18;
            } else {
                i17 += marginLayoutParams.bottomMargin + measuredHeight;
                i13 = 0;
            }
            childAt.layout(i13, marginLayoutParams.topMargin + i17, i13 + measuredWidth, measuredHeight + i17);
            i16 = i13 + measuredWidth + marginLayoutParams.rightMargin;
            i15++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        View.MeasureSpec.getMode(i4);
        View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i4);
        View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < getChildCount()) {
            View childAt = getChildAt(i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i4, i10);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = i11 != 0 ? marginLayoutParams.leftMargin : 0;
            int i15 = (measuredWidth + i14) + i13 < size ? i13 + i14 : 0;
            if (i15 == 0) {
                i12 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i13 = i15 + measuredWidth + marginLayoutParams.rightMargin;
            i11++;
        }
        setMeasuredDimension(size, i12);
    }

    public final void ouw(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            FilterWord filterWord = list.get(i4);
            if (filterWord != null) {
                TextView textView = new TextView(getContext());
                textView.setTag(filterWord);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                int iOuw = osn.ouw(getContext(), 8.0f);
                marginLayoutParams.leftMargin = iOuw;
                marginLayoutParams.bottomMargin = iOuw;
                textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216}));
                textView.setText(filterWord.getName());
                textView.setPadding(iOuw, iOuw, iOuw, iOuw);
                GradientDrawable gradientDrawable = new GradientDrawable();
                float fOuw = osn.ouw(getContext(), 5.0f);
                gradientDrawable.setCornerRadius(fOuw);
                gradientDrawable.setColor(Color.parseColor("#0D000000"));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setStroke(osn.ouw(getContext(), 1.0f), Color.parseColor("#FE2C55"));
                gradientDrawable2.setCornerRadius(fOuw);
                gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
                stateListDrawable.addState(new int[0], gradientDrawable);
                textView.setBackground(stateListDrawable);
                textView.setSelected(false);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lh.pno.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (pno.this.ouw != null) {
                            if (view.isSelected()) {
                                pno.this.ouw.ouw(tlj.ouw);
                                return;
                            }
                            Object tag = view.getTag();
                            if (tag instanceof FilterWord) {
                                pno.this.ouw.ouw((FilterWord) tag);
                            }
                        }
                    }
                });
                textView.setSelected(false);
                textView.setLayoutParams(marginLayoutParams);
                addView(textView);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lh.tlj.lh
    public final void ouw(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null) {
                if (tlj.ouw.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }
}
