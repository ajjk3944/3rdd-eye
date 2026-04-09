package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ux1 implements oy1, sw1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17377a;

    /* renamed from: b, reason: collision with root package name */
    public l90 f17378b;

    /* renamed from: c, reason: collision with root package name */
    public ce1 f17379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx1 f17380d;

    public ux1(wx1 wx1Var, Object obj) {
        this.f17380d = wx1Var;
        this.f17378b = new l90((CopyOnWriteArrayList) wx1Var.f15471c.f13427c, (jy1) null);
        int i4 = 28;
        this.f17379c = new ce1(i4, (CopyOnWriteArrayList) wx1Var.f15472d.f10095c, (Object) null);
        this.f17377a = obj;
    }

    public final boolean a(jy1 jy1Var) {
        jy1 jy1VarV;
        Object obj = this.f17377a;
        wx1 wx1Var = this.f17380d;
        if (jy1Var != null) {
            jy1VarV = wx1Var.v(obj, jy1Var);
            if (jy1VarV == null) {
                return false;
            }
        } else {
            jy1VarV = null;
        }
        wx1Var.u(obj);
        l90 l90Var = this.f17378b;
        l90Var.getClass();
        if (!Objects.equals((jy1) l90Var.f13426b, jy1VarV)) {
            this.f17378b = new l90((CopyOnWriteArrayList) wx1Var.f15471c.f13427c, jy1VarV);
        }
        ce1 ce1Var = this.f17379c;
        ce1Var.getClass();
        if (Objects.equals((jy1) ce1Var.f10094b, jy1VarV)) {
            return true;
        }
        this.f17379c = new ce1(28, (CopyOnWriteArrayList) wx1Var.f15472d.f10095c, jy1VarV);
        return true;
    }

    public final void b(a0.c0 c0Var, jy1 jy1Var) {
        long j = c0Var.f21b;
        wx1 wx1Var = this.f17380d;
        Object obj = this.f17377a;
        wx1Var.w(obj, j);
        wx1Var.w(obj, c0Var.f22c);
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void g(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var, int i10) {
        if (a(jy1Var)) {
            l90 l90Var = this.f17378b;
            b(c0Var, jy1Var);
            l90Var.getClass();
            l90Var.z(new wb(l90Var, cy1Var, c0Var, i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void h(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var) {
        if (a(jy1Var)) {
            l90 l90Var = this.f17378b;
            b(c0Var, jy1Var);
            l90Var.getClass();
            l90Var.z(new my1(l90Var, cy1Var, c0Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void i(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var, IOException iOException, boolean z3) {
        if (a(jy1Var)) {
            l90 l90Var = this.f17378b;
            b(c0Var, jy1Var);
            l90Var.getClass();
            l90Var.z(new aw0(l90Var, cy1Var, c0Var, iOException, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void j(int i4, jy1 jy1Var, cy1 cy1Var, a0.c0 c0Var) {
        if (a(jy1Var)) {
            l90 l90Var = this.f17378b;
            b(c0Var, jy1Var);
            l90Var.getClass();
            l90Var.z(new my1(l90Var, cy1Var, c0Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.oy1
    public final void k(int i4, jy1 jy1Var, a0.c0 c0Var) {
        if (a(jy1Var)) {
            l90 l90Var = this.f17378b;
            b(c0Var, jy1Var);
            l90Var.getClass();
            l90Var.z(new zu1(l90Var, c0Var));
        }
    }
}
