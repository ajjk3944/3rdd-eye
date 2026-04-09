package com.google.android.material.timepicker;

import C2.h;
import L0.I;
import L0.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import l4.C5287f;
import l4.C5288g;
import l4.C5290i;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes2.dex */
public class c extends ConstraintLayout {

    /* renamed from: t, reason: collision with root package name */
    public final h f23193t;

    /* renamed from: u, reason: collision with root package name */
    public int f23194u;

    /* renamed from: v, reason: collision with root package name */
    public final C5287f f23195v;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            h hVar = this.f23193t;
            handler.removeCallbacks(hVar);
            handler.post(hVar);
        }
    }

    public void h() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.b(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i10 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i10 == null) {
                    i10 = 1;
                }
                if (!map.containsKey(i10)) {
                    map.put(i10, new ArrayList());
                }
                ((List) map.get(i10)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f23194u * 0.66f) : this.f23194u;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap<Integer, d.a> map2 = dVar.f15316c;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new d.a());
                }
                d.b bVar = map2.get(Integer.valueOf(id)).f15320d;
                bVar.f15400z = R.id.circle_center;
                bVar.f15335A = iRound;
                bVar.f15336B = size;
                size += 360.0f / list.size();
            }
        }
        dVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            h hVar = this.f23193t;
            handler.removeCallbacks(hVar);
            handler.post(hVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f23195v.k(ColorStateList.valueOf(i));
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C5287f c5287f = new C5287f();
        this.f23195v = c5287f;
        C5288g c5288g = new C5288g(0.5f);
        C5290i.a aVarE = c5287f.f43759b.f43782a.e();
        aVarE.f43815e = c5288g;
        aVarE.f43816f = c5288g;
        aVarE.f43817g = c5288g;
        aVarE.f43818h = c5288g;
        c5287f.setShapeAppearanceModel(aVarE.a());
        this.f23195v.k(ColorStateList.valueOf(-1));
        C5287f c5287f2 = this.f23195v;
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        setBackground(c5287f2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3134v, i, 0);
        this.f23194u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f23193t = new h(this, 26);
        typedArrayObtainStyledAttributes.recycle();
    }
}
