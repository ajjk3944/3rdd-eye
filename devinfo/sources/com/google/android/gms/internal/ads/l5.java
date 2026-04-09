package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l5 implements i5, e4.s {

    /* renamed from: a, reason: collision with root package name */
    public int f13372a;

    /* renamed from: b, reason: collision with root package name */
    public int f13373b;

    /* renamed from: c, reason: collision with root package name */
    public int f13374c;

    /* renamed from: d, reason: collision with root package name */
    public int f13375d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13376e;

    @Override // com.google.android.gms.internal.ads.i5
    public int a() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.i5
    public int b() {
        return this.f13372a;
    }

    public long c() {
        int i4 = this.f13374c;
        if (i4 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.f13376e;
        int i10 = this.f13372a;
        long j = jArr[i10];
        this.f13372a = this.f13375d & (i10 + 1);
        this.f13374c = i4 - 1;
        return j;
    }

    @Override // e4.s
    public e4.c2 j(View view, e4.c2 c2Var) {
        View view2 = (View) this.f13376e;
        v3.b bVarG = c2Var.f22315a.g(519);
        int i4 = this.f13372a;
        if (i4 >= 0) {
            view2.getLayoutParams().height = i4 + bVarG.f35794b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f13373b + bVarG.f35793a, this.f13374c + bVarG.f35794b, this.f13375d + bVarG.f35795c, view2.getPaddingBottom());
        return c2Var;
    }

    @Override // com.google.android.gms.internal.ads.i5
    public int zzc() {
        sk0 sk0Var = (sk0) this.f13376e;
        int i4 = this.f13373b;
        if (i4 == 8) {
            return sk0Var.K();
        }
        if (i4 == 16) {
            return sk0Var.L();
        }
        int i10 = this.f13374c;
        this.f13374c = i10 + 1;
        if (i10 % 2 != 0) {
            return this.f13375d & 15;
        }
        int iK = sk0Var.K();
        this.f13375d = iK;
        return (iK & 240) >> 4;
    }
}
