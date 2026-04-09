package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f5155a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f5156b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f5157c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f5158d;

    /* renamed from: e, reason: collision with root package name */
    private r2 f5159e;

    /* renamed from: f, reason: collision with root package name */
    private int f5160f;

    public void a(int i4) {
        this.f5160f = i4;
    }

    public r2 b() {
        return this.f5159e;
    }

    public int a() {
        return this.f5160f;
    }

    public void a(r2 r2Var) {
        this.f5159e = r2Var;
        this.f5155a.setText(r2Var.k());
        this.f5155a.setTextColor(r2Var.l());
        if (this.f5156b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.f5156b.setTypeface(null, 0);
                this.f5156b.setVisibility(0);
                this.f5156b.setText(r2Var.f());
                this.f5156b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f5156b.setTypeface(null, 1);
                }
            } else {
                this.f5156b.setVisibility(8);
            }
        }
        if (this.f5157c != null) {
            if (r2Var.h() > 0) {
                this.f5157c.setImageResource(r2Var.h());
                this.f5157c.setColorFilter(r2Var.i());
                this.f5157c.setVisibility(0);
            } else {
                this.f5157c.setVisibility(8);
            }
        }
        if (this.f5158d != null) {
            if (r2Var.d() > 0) {
                this.f5158d.setImageResource(r2Var.d());
                this.f5158d.setColorFilter(r2Var.e());
                this.f5158d.setVisibility(0);
                return;
            }
            this.f5158d.setVisibility(8);
        }
    }
}
