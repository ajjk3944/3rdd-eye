package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class oe0 extends mg implements kp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr0 f14688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx f14689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ re0 f14690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(long j, gx gxVar, re0 re0Var, yr0 yr0Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f14685a = obj;
        this.f14686b = str;
        this.f14687c = j;
        this.f14688d = yr0Var;
        this.f14689e = gxVar;
        Objects.requireNonNull(re0Var);
        this.f14690f = re0Var;
    }

    @Override // com.google.android.gms.internal.ads.kp
    public final void c() {
        synchronized (this.f14685a) {
            re0 re0Var = this.f14690f;
            String str = this.f14686b;
            ua.j.C.f35267k.getClass();
            re0Var.d(str, (int) (SystemClock.elapsedRealtime() - this.f14687c), "", true);
            re0Var.f15626l.b(str);
            re0Var.f15629o.j(str);
            cs0 cs0Var = re0Var.f15630p;
            yr0 yr0Var = this.f14688d;
            yr0Var.c(true);
            cs0Var.b(yr0Var.F1());
            this.f14689e.b(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.kp
    public final void g(String str) {
        synchronized (this.f14685a) {
            re0 re0Var = this.f14690f;
            String str2 = this.f14686b;
            ua.j.C.f35267k.getClass();
            re0Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.f14687c), str, false);
            re0Var.f15626l.c(str2, "error");
            re0Var.f15629o.f(str2, "error");
            cs0 cs0Var = re0Var.f15630p;
            yr0 yr0Var = this.f14688d;
            yr0Var.g(str);
            yr0Var.c(false);
            cs0Var.b(yr0Var.F1());
            this.f14689e.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            c();
        } else {
            if (i4 != 3) {
                return false;
            }
            String string = parcel.readString();
            ng.f(parcel);
            g(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
