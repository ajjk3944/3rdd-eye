package com.google.android.material.timepicker;

import F1.W;
import O3.g;
import O3.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import f4.C5527g;
import f4.C5529i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class d extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f37959x;

    /* renamed from: y, reason: collision with root package name */
    private int f37960y;

    /* renamed from: z, reason: collision with root package name */
    private C5527g f37961z;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(g.f17103f, this);
        W.q0(this, u());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f17339X3, i10, 0);
        this.f37960y = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f17346Y3, 0);
        this.f37959x = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.f37958a.z();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f37959x);
            handler.post(this.f37959x);
        }
    }

    private void t(List list, androidx.constraintlayout.widget.e eVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            eVar.g(((View) it.next()).getId(), O3.e.f17073c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable u() {
        C5527g c5527g = new C5527g();
        this.f37961z = c5527g;
        c5527g.R(new C5529i(0.5f));
        this.f37961z.T(ColorStateList.valueOf(-1));
        return this.f37961z;
    }

    private static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(W.k());
        }
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f37961z.T(ColorStateList.valueOf(i10));
    }

    int v(int i10) {
        return i10 == 2 ? Math.round(this.f37960y * 0.66f) : this.f37960y;
    }

    public int w() {
        return this.f37960y;
    }

    public void x(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f37960y = i10;
        z();
    }

    protected void z() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != O3.e.f17073c && !y(childAt)) {
                int i11 = (Integer) childAt.getTag(O3.e.f17081k);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            t((List) entry.getValue(), eVar, v(((Integer) entry.getKey()).intValue()));
        }
        eVar.c(this);
    }
}
