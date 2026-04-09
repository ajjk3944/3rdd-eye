package com.google.android.material.datepicker;

import M3.A;
import R.O;
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
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18256a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        u.c(null);
        if (k.i0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.apm.insight.R.id.cancel_button);
            setNextFocusRightId(com.apm.insight.R.id.confirm_button);
        }
        this.f18256a = k.i0(getContext(), com.apm.insight.R.attr.nestedScrollable);
        O.m(this, new A(4));
    }

    public final n a() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n nVar = (n) super.getAdapter();
        nVar.getClass();
        int iMax = Math.max(nVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(nVar.c(), getLastVisiblePosition());
        nVar.getItem(iMax);
        nVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z6, int i, Rect rect) {
        if (!z6) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((n) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((n) super.getAdapter()).a());
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
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((n) super.getAdapter()).a() && selectedItemPosition <= ((n) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((n) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i3) {
        if (!this.f18256a) {
            super.onMeasure(i, i3);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((n) super.getAdapter()).a()) {
            super.setSelection(((n) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
