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
import androidx.recyclerview.widget.LinearLayoutManager;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20436a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.c(null);
        if (m.l0(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(com.liuzh.deviceinfo.R.id.cancel_button);
            setNextFocusRightId(com.liuzh.deviceinfo.R.id.confirm_button);
        }
        this.f20436a = m.l0(com.liuzh.deviceinfo.R.attr.nestedScrollable, getContext());
        v0.o(this, new g(2));
    }

    public final p a() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p pVar = (p) super.getAdapter();
        pVar.getClass();
        int iMax = Math.max(pVar.a(), getFirstVisiblePosition());
        int iMin = Math.min(pVar.c(), getLastVisiblePosition());
        pVar.getItem(iMax);
        pVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        if (!z3) {
            super.onFocusChanged(false, i4, rect);
            return;
        }
        if (i4 == 33) {
            setSelection(((p) super.getAdapter()).c());
        } else if (i4 == 130) {
            setSelection(((p) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((p) super.getAdapter()).a() && selectedItemPosition <= ((p) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(((p) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i4, int i10) {
        if (!this.f20436a) {
            super.onMeasure(i4, i10);
            return;
        }
        super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i4) {
        if (i4 < ((p) super.getAdapter()).a()) {
            super.setSelection(((p) super.getAdapter()).a());
        } else {
            super.setSelection(i4);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (p) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof p)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
