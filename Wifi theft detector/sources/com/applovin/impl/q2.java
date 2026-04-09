package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f7373a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f7374b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f7375c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f7376d;

    /* renamed from: e, reason: collision with root package name */
    private r2 f7377e;

    /* renamed from: f, reason: collision with root package name */
    private int f7378f;

    public void a(int i10) {
        this.f7378f = i10;
    }

    public r2 b() {
        return this.f7377e;
    }

    public int a() {
        return this.f7378f;
    }

    public void a(r2 r2Var) {
        this.f7377e = r2Var;
        this.f7373a.setText(r2Var.k());
        this.f7373a.setTextColor(r2Var.l());
        if (this.f7374b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.f7374b.setTypeface(null, 0);
                this.f7374b.setVisibility(0);
                this.f7374b.setText(r2Var.f());
                this.f7374b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f7374b.setTypeface(null, 1);
                }
            } else {
                this.f7374b.setVisibility(8);
            }
        }
        if (this.f7375c != null) {
            if (r2Var.h() > 0) {
                this.f7375c.setImageResource(r2Var.h());
                this.f7375c.setColorFilter(r2Var.i());
                this.f7375c.setVisibility(0);
            } else {
                this.f7375c.setVisibility(8);
            }
        }
        if (this.f7376d != null) {
            if (r2Var.d() > 0) {
                this.f7376d.setImageResource(r2Var.d());
                this.f7376d.setColorFilter(r2Var.e());
                this.f7376d.setVisibility(0);
                return;
            }
            this.f7376d.setVisibility(8);
        }
    }
}
