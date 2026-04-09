package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f00 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g00 f10945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10949e;

    public /* synthetic */ f00(g00 g00Var, int i4, int i10, boolean z3, boolean z10) {
        this.f10945a = g00Var;
        this.f10946b = i4;
        this.f10947c = i10;
        this.f10948d = z3;
        this.f10949e = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        ?? r10;
        ?? r22;
        va.b2 b2Var;
        va.b2 b2Var2;
        va.b2 b2Var3;
        g00 g00Var = this.f10945a;
        int i10 = this.f10946b;
        int i11 = this.f10947c;
        boolean z3 = this.f10948d;
        boolean z10 = this.f10949e;
        synchronized (g00Var.f11330b) {
            try {
                boolean z11 = g00Var.g;
                if (z11 || i11 != 1) {
                    i4 = i11;
                    r10 = false;
                } else {
                    i11 = 1;
                    i4 = 1;
                    r10 = true;
                }
                ?? r12 = i10 != i11;
                if (r12 == true && i4 == 1) {
                    r22 = true;
                    i4 = 1;
                } else {
                    r22 = false;
                }
                ?? r122 = r12 == true && i4 == 2;
                ?? r13 = r12 == true && i4 == 3;
                g00Var.g = z11 || r10 == true;
                if (r10 != false) {
                    try {
                        va.b2 b2Var4 = g00Var.f11334f;
                        if (b2Var4 != null) {
                            b2Var4.c();
                        }
                    } catch (RemoteException e2) {
                        za.i.k("#007 Could not call remote method.", e2);
                    }
                }
                if (r22 != false && (b2Var3 = g00Var.f11334f) != null) {
                    b2Var3.g1(b2Var3.T(), 2);
                }
                if (r122 != false && (b2Var2 = g00Var.f11334f) != null) {
                    b2Var2.e();
                }
                if (r13 != false) {
                    va.b2 b2Var5 = g00Var.f11334f;
                    if (b2Var5 != null) {
                        b2Var5.z1();
                    }
                    g00Var.f11329a.C();
                }
                if (z3 != z10 && (b2Var = g00Var.f11334f) != null) {
                    Parcel parcelT = b2Var.T();
                    ClassLoader classLoader = ng.f14287a;
                    parcelT.writeInt(z10 ? 1 : 0);
                    b2Var.g1(parcelT, 5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
