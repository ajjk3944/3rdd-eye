package com.bytedance.sdk.openadsdk.xq;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.bytedance.sdk.openadsdk.xq.ru;
import java.util.List;

/* loaded from: classes.dex */
public class msw extends ViewGroup implements ru.xq {
    private final ru emc;

    public msw(Context context, ru ruVar) {
        super(context);
        this.emc = ruVar;
        ruVar.emc(this);
    }

    private View ypw(FilterWord filterWord) {
        TextView textView = new TextView(getContext());
        textView.setTag(filterWord);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iYpw = vw.ypw(getContext(), 8.0f);
        marginLayoutParams.leftMargin = iYpw;
        marginLayoutParams.bottomMargin = iYpw;
        textView.setTextColor(emc());
        textView.setText(filterWord.getName());
        textView.setPadding(iYpw, iYpw, iYpw, iYpw);
        textView.setBackground(ypw());
        textView.setSelected(false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.xq.msw.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (msw.this.emc != null) {
                    if (view.isSelected()) {
                        msw.this.emc.emc(ru.emc);
                        return;
                    }
                    Object tag = view.getTag();
                    if (tag instanceof FilterWord) {
                        msw.this.emc.emc((FilterWord) tag);
                    }
                }
            }
        });
        textView.setSelected(false);
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int i8;
        int childCount = getChildCount();
        int i9 = i6 - i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = i10 != 0 ? marginLayoutParams.leftMargin : 0;
            if (measuredWidth + i13 + i11 < i9) {
                i8 = i11 + i13;
            } else {
                i12 += marginLayoutParams.bottomMargin + measuredHeight;
                i8 = 0;
            }
            childAt.layout(i8, marginLayoutParams.topMargin + i12, i8 + measuredWidth, measuredHeight + i12);
            i11 = i8 + measuredWidth + marginLayoutParams.rightMargin;
            i10++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        View.MeasureSpec.getMode(i);
        View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i3);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < getChildCount()) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            measureChild(childAt, i, i3);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i9 = i6 != 0 ? marginLayoutParams.leftMargin : 0;
            int i10 = (measuredWidth + i9) + i8 < size ? i8 + i9 : 0;
            if (i10 == 0) {
                i7 += measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            i8 = i10 + measuredWidth + marginLayoutParams.rightMargin;
            i6++;
        }
        setMeasuredDimension(size, i7);
    }

    public void emc(List<FilterWord> list) {
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            FilterWord filterWord = list.get(i);
            if (filterWord != null) {
                addView(ypw(filterWord));
            }
        }
    }

    private ColorStateList emc() {
        return new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{Color.rgb(255, 44, 85), -16777216});
    }

    @Override // com.bytedance.sdk.openadsdk.xq.ru.xq
    public void emc(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (ru.emc.equals(filterWord)) {
                    childAt.setSelected(false);
                } else {
                    childAt.setSelected(filterWord.equals(childAt.getTag()));
                }
            }
        }
    }

    private Drawable ypw() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float fYpw = vw.ypw(getContext(), 5.0f);
        gradientDrawable.setCornerRadius(fYpw);
        gradientDrawable.setColor(Color.parseColor("#0D000000"));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(vw.ypw(getContext(), 1.0f), Color.parseColor("#FE2C55"));
        gradientDrawable2.setCornerRadius(fYpw);
        gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }
}
