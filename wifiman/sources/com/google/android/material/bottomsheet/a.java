package com.google.android.material.bottomsheet;

import F1.C2755j0;
import F1.C2780w0;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class a extends C2755j0.b {

    /* renamed from: c, reason: collision with root package name */
    private final View f37114c;

    /* renamed from: d, reason: collision with root package name */
    private int f37115d;

    /* renamed from: e, reason: collision with root package name */
    private int f37116e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f37117f;

    public a(View view) {
        super(0);
        this.f37117f = new int[2];
        this.f37114c = view;
    }

    @Override // F1.C2755j0.b
    public void c(C2755j0 c2755j0) {
        this.f37114c.setTranslationY(0.0f);
    }

    @Override // F1.C2755j0.b
    public void d(C2755j0 c2755j0) {
        this.f37114c.getLocationOnScreen(this.f37117f);
        this.f37115d = this.f37117f[1];
    }

    @Override // F1.C2755j0.b
    public C2780w0 e(C2780w0 c2780w0, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C2755j0) it.next()).c() & C2780w0.l.c()) != 0) {
                this.f37114c.setTranslationY(P3.a.c(this.f37116e, 0, r0.b()));
                break;
            }
        }
        return c2780w0;
    }

    @Override // F1.C2755j0.b
    public C2755j0.a f(C2755j0 c2755j0, C2755j0.a aVar) {
        this.f37114c.getLocationOnScreen(this.f37117f);
        int i10 = this.f37115d - this.f37117f[1];
        this.f37116e = i10;
        this.f37114c.setTranslationY(i10);
        return aVar;
    }
}
