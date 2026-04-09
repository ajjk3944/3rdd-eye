package com.applovin.impl;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f3546a;

    public a(Context context, int i4, int i10) {
        RelativeLayout.LayoutParams layoutParams;
        super(context);
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i10);
        this.f3546a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i4 == -2 || i4 == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i4, i4);
        } else {
            int iDpToPx = AppLovinSdkUtils.dpToPx(context, i4);
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    public void a() {
        setVisibility(0);
    }

    public void b() {
        setVisibility(8);
    }

    public void setColor(int i4) {
        this.f3546a.getIndeterminateDrawable().setColorFilter(i4, PorterDuff.Mode.SRC_IN);
    }
}
