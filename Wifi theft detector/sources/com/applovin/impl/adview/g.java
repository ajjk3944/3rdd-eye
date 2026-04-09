package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* loaded from: classes.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f5500a;

    /* renamed from: b, reason: collision with root package name */
    private int f5501b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f5500a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f5500a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f5500a.getLayoutParams();
        removeView(this.f5500a);
        e eVarA = e.a(aVar, getContext());
        this.f5500a = eVarA;
        addView(eVarA);
        this.f5500a.setLayoutParams(layoutParams);
        this.f5500a.a(this.f5501b);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f5501b = i10;
        int i14 = i11 + i10 + i12;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i14;
            layoutParams.width = i14;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i14, i14));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i10, i10, i13);
        layoutParams2.setMargins(i12, i12, i12, 0);
        this.f5500a.setLayoutParams(layoutParams2);
        this.f5500a.a(i10);
    }
}
