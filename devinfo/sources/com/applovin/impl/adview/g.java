package com.applovin.impl.adview;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private e f3692a;

    /* renamed from: b, reason: collision with root package name */
    private int f3693b;

    public g(e.a aVar, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        e eVarA = e.a(aVar, activity);
        this.f3692a = eVarA;
        addView(eVarA);
    }

    public void a(e.a aVar) {
        if (aVar == null || aVar == this.f3692a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f3692a.getLayoutParams();
        removeView(this.f3692a);
        e eVarA = e.a(aVar, getContext());
        this.f3692a = eVarA;
        addView(eVarA);
        this.f3692a.setLayoutParams(layoutParams);
        this.f3692a.a(this.f3693b);
    }

    public void a(int i4, int i10, int i11, int i12) {
        this.f3693b = i4;
        int i13 = i10 + i4 + i11;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i13;
            layoutParams.width = i13;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, i4, i12);
        layoutParams2.setMargins(i11, i11, i11, 0);
        this.f3692a.setLayoutParams(layoutParams2);
        this.f3692a.a(i4);
    }
}
