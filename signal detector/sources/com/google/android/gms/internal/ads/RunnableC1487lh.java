package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.lh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1487lh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BinderC1541mh f15422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15426e;

    public /* synthetic */ RunnableC1487lh(BinderC1541mh binderC1541mh, int i, int i3, boolean z6, boolean z7) {
        this.f15422a = binderC1541mh;
        this.f15423b = i;
        this.f15424c = i3;
        this.f15425d = z6;
        this.f15426e = z7;
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
        int i;
        ?? r10;
        ?? r22;
        q2.C0 c02;
        q2.C0 c03;
        q2.C0 c04;
        BinderC1541mh binderC1541mh = this.f15422a;
        int i3 = this.f15423b;
        int i6 = this.f15424c;
        boolean z6 = this.f15425d;
        boolean z7 = this.f15426e;
        synchronized (binderC1541mh.f15637b) {
            try {
                boolean z8 = binderC1541mh.f15642g;
                if (z8 || i6 != 1) {
                    i = i6;
                    r10 = false;
                } else {
                    i6 = 1;
                    i = 1;
                    r10 = true;
                }
                ?? r12 = i3 != i6;
                if (r12 == true && i == 1) {
                    r22 = true;
                    i = 1;
                } else {
                    r22 = false;
                }
                ?? r122 = r12 == true && i == 2;
                ?? r13 = r12 == true && i == 3;
                binderC1541mh.f15642g = z8 || r10 == true;
                if (r10 != false) {
                    try {
                        q2.C0 c05 = binderC1541mh.f15641f;
                        if (c05 != null) {
                            c05.b();
                        }
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                    }
                }
                if (r22 != false && (c04 = binderC1541mh.f15641f) != null) {
                    c04.I0(c04.h0(), 2);
                }
                if (r122 != false && (c03 = binderC1541mh.f15641f) != null) {
                    c03.e();
                }
                if (r13 != false) {
                    q2.C0 c06 = binderC1541mh.f15641f;
                    if (c06 != null) {
                        c06.g();
                    }
                    binderC1541mh.f15636a.T();
                }
                if (z6 != z7 && (c02 = binderC1541mh.f15641f) != null) {
                    Parcel parcelH0 = c02.h0();
                    ClassLoader classLoader = C7.f7544a;
                    parcelH0.writeInt(z7 ? 1 : 0);
                    c02.I0(parcelH0, 5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
