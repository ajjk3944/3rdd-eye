package com.google.android.material.bottomnavigation;

import A3.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import b4.C0344i;
import com.apm.insight.R;
import d3.AbstractC2266a;
import j3.C2562b;
import j3.InterfaceC2563c;
import j3.InterfaceC2564d;
import o.a1;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class BottomNavigationView extends y {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1 a1VarJ = AbstractC2993B.j(getContext(), attributeSet, AbstractC2266a.f19751e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) a1VarJ.f22480c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        a1VarJ.j();
        AbstractC2993B.d(this, new C0344i(18));
    }

    @Override // A3.y
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i3) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i3;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z6) {
        C2562b c2562b = (C2562b) getMenuView();
        if (c2562b.f21374t0 != z6) {
            c2562b.setItemHorizontalTranslationEnabled(z6);
            getPresenter().b(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(InterfaceC2563c interfaceC2563c) {
        setOnItemReselectedListener(interfaceC2563c);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC2564d interfaceC2564d) {
        setOnItemSelectedListener(interfaceC2564d);
    }
}
