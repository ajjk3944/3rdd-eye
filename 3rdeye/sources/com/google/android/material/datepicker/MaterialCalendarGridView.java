package com.google.android.material.datepicker;

import L0.I;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f22775b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22776c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f22775b = E.e(null);
        if (r.e(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.cancel_button);
            setNextFocusRightId(com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.id.confirm_button);
        }
        this.f22776c = r.e(getContext(), com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.nestedScrollable);
        I.o(this, new q());
    }

    public final w a() {
        return (w) super.getAdapter();
    }

    public final View b(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (w) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((w) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        w wVar = (w) super.getAdapter();
        InterfaceC4012d<?> interfaceC4012d = wVar.f22884c;
        C4011c c4011c = wVar.f22886e;
        int iMax = Math.max(wVar.a(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(wVar.c(), materialCalendarGridView.getLastVisiblePosition());
        Long item = wVar.getItem(iMax);
        Long item2 = wVar.getItem(iMin);
        Iterator<K0.c<Long, Long>> it = interfaceC4012d.F().iterator();
        while (it.hasNext()) {
            K0.c<Long, Long> next = it.next();
            Long l5 = next.f2940a;
            if (l5 != null) {
                Long l10 = next.f2941b;
                if (l10 != null) {
                    Long l11 = l5;
                    long jLongValue = l11.longValue();
                    Long l12 = l10;
                    long jLongValue2 = l12.longValue();
                    if (item == null || item2 == null || l11.longValue() > item2.longValue() || l12.longValue() < item.longValue()) {
                        materialCalendarGridView = this;
                        wVar = wVar;
                        it = it;
                    } else {
                        boolean zA = d4.n.a(materialCalendarGridView);
                        long jLongValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.f22775b;
                        v vVar = wVar.f22883b;
                        if (jLongValue < jLongValue3) {
                            width = iMax % vVar.f22878e == 0 ? 0 : !zA ? materialCalendarGridView.b(iMax - 1).getRight() : materialCalendarGridView.b(iMax - 1).getLeft();
                            iA = iMax;
                        } else {
                            calendar.setTimeInMillis(jLongValue);
                            iA = wVar.a() + (calendar.get(5) - 1);
                            View viewB = materialCalendarGridView.b(iA);
                            width = (viewB.getWidth() / 2) + viewB.getLeft();
                        }
                        if (jLongValue2 > item2.longValue()) {
                            width2 = (iMin + 1) % vVar.f22878e == 0 ? materialCalendarGridView.getWidth() : !zA ? materialCalendarGridView.b(iMin).getRight() : materialCalendarGridView.b(iMin).getLeft();
                            iA2 = iMin;
                        } else {
                            calendar.setTimeInMillis(jLongValue2);
                            iA2 = wVar.a() + (calendar.get(5) - 1);
                            View viewB2 = materialCalendarGridView.b(iA2);
                            width2 = (viewB2.getWidth() / 2) + viewB2.getLeft();
                        }
                        int itemId = (int) wVar.getItemId(iA);
                        int itemId2 = (int) wVar.getItemId(iA2);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            w wVar2 = wVar;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View viewB3 = materialCalendarGridView.b(numColumns);
                            int top = viewB3.getTop() + c4011c.f22793a.f22787a.top;
                            Iterator<K0.c<Long, Long>> it2 = it;
                            int bottom = viewB3.getBottom() - c4011c.f22793a.f22787a.bottom;
                            if (zA) {
                                int i10 = iA2 > numColumns2 ? 0 : width2;
                                int width4 = numColumns > iA ? getWidth() : width;
                                i = i10;
                                width3 = width4;
                            } else {
                                i = numColumns > iA ? 0 : width;
                                width3 = iA2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, c4011c.f22800h);
                            itemId++;
                            materialCalendarGridView = this;
                            wVar = wVar2;
                            it = it2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((w) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((w) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((w) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((w) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i10) {
        if (!this.f22776c) {
            super.onMeasure(i, i10);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((w) super.getAdapter()).a()) {
            super.setSelection(((w) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (w) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof w)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), w.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
