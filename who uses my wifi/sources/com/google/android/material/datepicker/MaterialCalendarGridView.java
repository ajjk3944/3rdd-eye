package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import defpackage.e61;
import defpackage.g41;
import defpackage.jc0;
import defpackage.xe0;
import defpackage.yb0;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        g41.c(null);
        if (jc0.T(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.phuongpn.whousemywifi.networkscanner.R.id.cancel_button);
            setNextFocusRightId(com.phuongpn.whousemywifi.networkscanner.R.id.confirm_button);
        }
        this.f = jc0.T(getContext(), com.phuongpn.whousemywifi.networkscanner.R.attr.nestedScrollable);
        e61.l(this, new yb0(2));
    }

    public final xe0 a() {
        return (xe0) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (xe0) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((xe0) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xe0 xe0Var = (xe0) super.getAdapter();
        xe0Var.getClass();
        int iMax = Math.max(xe0Var.a(), getFirstVisiblePosition());
        int iMin = Math.min(xe0Var.c(), getLastVisiblePosition());
        xe0Var.getItem(iMax);
        xe0Var.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((xe0) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((xe0) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((xe0) super.getAdapter()).a() && selectedItemPosition <= ((xe0) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((xe0) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((xe0) super.getAdapter()).a()) {
            super.setSelection(((xe0) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (xe0) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof xe0)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), xe0.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
