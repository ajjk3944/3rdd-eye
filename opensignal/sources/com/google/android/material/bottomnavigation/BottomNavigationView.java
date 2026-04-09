package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.navigation.d;
import ed.b;
import ed.k;
import ed.l;
import kd.c;
import sm.m;

/* loaded from: classes.dex */
public class BottomNavigationView extends d {
    /* JADX WARN: Illegal instructions before constructor call */
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        int i10 = b.bottomNavigationStyle;
        int i11 = k.Widget_Design_BottomNavigationView;
        super(context, attributeSet, i10, i11);
        io.sentry.k kVarE = xd.k.e(getContext(), attributeSet, l.BottomNavigationView, i10, i11, new int[0]);
        int i12 = l.BottomNavigationView_itemHorizontalTranslationEnabled;
        TypedArray typedArray = (TypedArray) kVarE.f12398g;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(i12, true));
        if (typedArray.hasValue(l.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(l.BottomNavigationView_android_minHeight, 0));
        }
        kVarE.l0();
        xd.l.a(this, new m());
    }

    @Override // com.google.android.material.navigation.d
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i11;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, iMakeMeasureSpec);
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getPaddingBottom() + getPaddingTop() + getSuggestedMinimumHeight()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        kd.b bVar = (kd.b) getMenuView();
        if (bVar.B0 != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().b(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(kd.d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
