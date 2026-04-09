package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class i2 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f19517a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f19518b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f19519c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f19520d;

    /* renamed from: e, reason: collision with root package name */
    private j2 f19521e;

    /* renamed from: f, reason: collision with root package name */
    private int f19522f;

    public void a(int i) {
        this.f19522f = i;
    }

    public j2 b() {
        return this.f19521e;
    }

    public int a() {
        return this.f19522f;
    }

    public void a(j2 j2Var) {
        this.f19521e = j2Var;
        this.f19517a.setText(j2Var.k());
        this.f19517a.setTextColor(j2Var.l());
        if (this.f19518b != null) {
            if (!TextUtils.isEmpty(j2Var.f())) {
                this.f19518b.setTypeface(null, 0);
                this.f19518b.setVisibility(0);
                this.f19518b.setText(j2Var.f());
                this.f19518b.setTextColor(j2Var.g());
                if (j2Var.p()) {
                    this.f19518b.setTypeface(null, 1);
                }
            } else {
                this.f19518b.setVisibility(8);
            }
        }
        if (this.f19519c != null) {
            if (j2Var.h() > 0) {
                this.f19519c.setImageResource(j2Var.h());
                this.f19519c.setColorFilter(j2Var.i());
                this.f19519c.setVisibility(0);
            } else {
                this.f19519c.setVisibility(8);
            }
        }
        if (this.f19520d != null) {
            if (j2Var.d() > 0) {
                this.f19520d.setImageResource(j2Var.d());
                this.f19520d.setColorFilter(j2Var.e());
                this.f19520d.setVisibility(0);
                return;
            }
            this.f19520d.setVisibility(8);
        }
    }
}
