package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.SystemClock;
import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.to, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1925to extends B7 implements InterfaceC0806Xb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16978c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Su f16979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0657Of f16980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2087wo f16981f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1925to(long j6, C0657Of c0657Of, C2087wo c2087wo, Su su, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.f16976a = obj;
        this.f16977b = str;
        this.f16978c = j6;
        this.f16979d = su;
        this.f16980e = c0657Of;
        Objects.requireNonNull(c2087wo);
        this.f16981f = c2087wo;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            b();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            C7.f(parcel);
            K2(string);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0806Xb
    public final void K2(String str) {
        synchronized (this.f16976a) {
            C2087wo c2087wo = this.f16981f;
            String str2 = this.f16977b;
            p2.j.f22785C.f22797k.getClass();
            c2087wo.d(str2, (int) (SystemClock.elapsedRealtime() - this.f16978c), str, false);
            c2087wo.f17483l.c(str2, "error");
            c2087wo.f17486o.f(str2, "error");
            Yu yu = c2087wo.f17487p;
            Su su = this.f16979d;
            su.g(str);
            su.b(false);
            yu.b(su.n());
            this.f16980e.b(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0806Xb
    public final void b() {
        synchronized (this.f16976a) {
            C2087wo c2087wo = this.f16981f;
            String str = this.f16977b;
            p2.j.f22785C.f22797k.getClass();
            c2087wo.d(str, (int) (SystemClock.elapsedRealtime() - this.f16978c), "", true);
            c2087wo.f17483l.b(str);
            c2087wo.f17486o.v(str);
            Yu yu = c2087wo.f17487p;
            Su su = this.f16979d;
            su.b(true);
            yu.b(su.n());
            this.f16980e.b(Boolean.TRUE);
        }
    }
}
