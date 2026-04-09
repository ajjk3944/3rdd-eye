package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f19054a;

    /* renamed from: b, reason: collision with root package name */
    private int f19055b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f19054a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f19054a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f19054a.getLayoutParams();
        removeView(this.f19054a);
        e eVarA = e.a(aVar, getContext());
        this.f19054a = eVarA;
        addView(eVarA);
        this.f19054a.setLayoutParams(layoutParams);
        this.f19054a.a(this.f19055b);
    }

    public void a(int i, int i10, int i11, int i12) {
        this.f19055b = i;
        int i13 = i10 + i + i11;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i13;
            layoutParams.width = i13;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i12);
        layoutParams2.setMargins(i11, i11, i11, 0);
        this.f19054a.setLayoutParams(layoutParams2);
        this.f19054a.a(i);
    }
}
