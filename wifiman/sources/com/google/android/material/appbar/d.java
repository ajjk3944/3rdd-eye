package com.google.android.material.appbar;

import F1.W;
import android.view.View;

/* loaded from: classes3.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final View f36988a;

    /* renamed from: b, reason: collision with root package name */
    private int f36989b;

    /* renamed from: c, reason: collision with root package name */
    private int f36990c;

    /* renamed from: d, reason: collision with root package name */
    private int f36991d;

    /* renamed from: e, reason: collision with root package name */
    private int f36992e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36993f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36994g = true;

    public d(View view) {
        this.f36988a = view;
    }

    void a() {
        View view = this.f36988a;
        W.X(view, this.f36991d - (view.getTop() - this.f36989b));
        View view2 = this.f36988a;
        W.W(view2, this.f36992e - (view2.getLeft() - this.f36990c));
    }

    public int b() {
        return this.f36991d;
    }

    void c() {
        this.f36989b = this.f36988a.getTop();
        this.f36990c = this.f36988a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f36994g || this.f36992e == i10) {
            return false;
        }
        this.f36992e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f36993f || this.f36991d == i10) {
            return false;
        }
        this.f36991d = i10;
        a();
        return true;
    }
}
