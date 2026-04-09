package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ki0 implements f90 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci0 f13162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wp0 f13163c;

    public /* synthetic */ ki0(fi0 fi0Var, ci0 ci0Var, wp0 wp0Var, int i4) {
        this.f13161a = i4;
        this.f13162b = ci0Var;
        this.f13163c = wp0Var;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final wp0 a() {
        switch (this.f13161a) {
        }
        return this.f13163c;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void e(boolean z3, Context context, m60 m60Var) throws e90 {
        kq0 kq0Var;
        switch (this.f13161a) {
            case 0:
                try {
                    qq0 qq0Var = (qq0) this.f13162b.f10135b;
                    qq0Var.b(z3);
                    try {
                        qq0Var.f15399a.V0(new vb.b(context));
                        return;
                    } finally {
                    }
                } catch (kq0 e2) {
                    throw new e90(e2.getCause());
                }
            default:
                try {
                    qq0 qq0Var2 = (qq0) this.f13162b.f10135b;
                    qq0Var2.b(z3);
                    try {
                        qq0Var2.f15399a.R();
                        return;
                    } finally {
                    }
                } catch (kq0 e10) {
                    za.i.i("Cannot show rewarded video.", e10);
                    throw new e90(e10.getCause());
                }
        }
    }
}
