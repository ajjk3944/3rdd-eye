package com.google.android.gms.internal.ads;

import R.InterfaceC0188o;
import android.view.View;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401k2 implements InterfaceC1295i2, InterfaceC0188o {

    /* renamed from: a, reason: collision with root package name */
    public int f15053a;

    /* renamed from: b, reason: collision with root package name */
    public int f15054b;

    /* renamed from: c, reason: collision with root package name */
    public int f15055c;

    /* renamed from: d, reason: collision with root package name */
    public int f15056d;

    /* renamed from: e, reason: collision with root package name */
    public Object f15057e;

    @Override // com.google.android.gms.internal.ads.InterfaceC1295i2
    public int a() {
        return this.f15053a;
    }

    public long b() {
        int i = this.f15055c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f15057e;
        int i3 = this.f15053a;
        long j6 = jArr[i3];
        this.f15053a = this.f15056d & (i3 + 1);
        this.f15055c = i - 1;
        return j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1295i2
    public int c() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1295i2
    public int f() {
        C2036vr c2036vr = (C2036vr) this.f15057e;
        int i = this.f15054b;
        if (i == 8) {
            return c2036vr.K();
        }
        if (i == 16) {
            return c2036vr.L();
        }
        int i3 = this.f15055c;
        this.f15055c = i3 + 1;
        if (i3 % 2 != 0) {
            return this.f15056d & 15;
        }
        int iK = c2036vr.K();
        this.f15056d = iK;
        return (iK & 240) >> 4;
    }

    @Override // R.InterfaceC0188o
    public R.r0 p(View view, R.r0 r0Var) {
        View view2 = (View) this.f15057e;
        J.c cVarF = r0Var.f3359a.f(519);
        int i = this.f15053a;
        if (i >= 0) {
            view2.getLayoutParams().height = i + cVarF.f2008b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f15054b + cVarF.f2007a, this.f15055c + cVarF.f2008b, this.f15056d + cVarF.f2009c, view2.getPaddingBottom());
        return r0Var;
    }
}
