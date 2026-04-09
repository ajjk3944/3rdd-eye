package com.google.android.gms.ads.internal.overlay;

import N2.a;
import S2.b;
import a.AbstractC0241a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.C0561Il;
import com.google.android.gms.internal.ads.C0615Lo;
import com.google.android.gms.internal.ads.C0947bh;
import com.google.android.gms.internal.ads.C1273hh;
import com.google.android.gms.internal.ads.C1760qk;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0570Jd;
import com.google.android.gms.internal.ads.InterfaceC0828Yg;
import com.google.android.gms.internal.ads.InterfaceC1912tb;
import com.google.android.gms.internal.ads.InterfaceC1966ub;
import com.google.android.gms.internal.ads.InterfaceC2084wl;
import g3.C2333b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p2.f;
import p2.j;
import q2.C2841s;
import q2.InterfaceC2806a;
import s2.InterfaceC2893c;
import s2.e;
import s2.i;
import s2.k;
import u2.C2951a;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C2333b(15);
    public static final AtomicLong M = new AtomicLong(0);

    /* renamed from: N, reason: collision with root package name */
    public static final ConcurrentHashMap f6852N = new ConcurrentHashMap();

    /* renamed from: C, reason: collision with root package name */
    public final f f6853C;

    /* renamed from: D, reason: collision with root package name */
    public final InterfaceC1912tb f6854D;

    /* renamed from: E, reason: collision with root package name */
    public final String f6855E;

    /* renamed from: F, reason: collision with root package name */
    public final String f6856F;

    /* renamed from: G, reason: collision with root package name */
    public final String f6857G;

    /* renamed from: H, reason: collision with root package name */
    public final C1760qk f6858H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC2084wl f6859I;

    /* renamed from: J, reason: collision with root package name */
    public final InterfaceC0570Jd f6860J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f6861K;

    /* renamed from: L, reason: collision with root package name */
    public final long f6862L;

    /* renamed from: a, reason: collision with root package name */
    public final e f6863a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2806a f6864b;

    /* renamed from: c, reason: collision with root package name */
    public final k f6865c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0828Yg f6866d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1966ub f6867e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6868f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6869g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6870h;
    public final InterfaceC2893c i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6871j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6872k;

    /* renamed from: l, reason: collision with root package name */
    public final String f6873l;

    /* renamed from: m, reason: collision with root package name */
    public final C2951a f6874m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6875n;

    public AdOverlayInfoParcel(C1273hh c1273hh, C2951a c2951a, String str, String str2, InterfaceC0570Jd interfaceC0570Jd) {
        this.f6863a = null;
        this.f6864b = null;
        this.f6865c = null;
        this.f6866d = c1273hh;
        this.f6854D = null;
        this.f6867e = null;
        this.f6868f = null;
        this.f6869g = false;
        this.f6870h = null;
        this.i = null;
        this.f6871j = 14;
        this.f6872k = 5;
        this.f6873l = null;
        this.f6874m = c2951a;
        this.f6875n = null;
        this.f6853C = null;
        this.f6855E = str;
        this.f6856F = str2;
        this.f6857G = null;
        this.f6858H = null;
        this.f6859I = null;
        this.f6860J = interfaceC0570Jd;
        this.f6861K = false;
        this.f6862L = M.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e6) {
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.he)).booleanValue()) {
                return null;
            }
            j.f22785C.f22795h.f("AdOverlayInfoParcel.getFromIntent", e6);
            return null;
        }
    }

    public static final b b(Object obj) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.he)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iE = AbstractC0241a.E(parcel, 20293);
        AbstractC0241a.t(parcel, 2, this.f6863a, i);
        InterfaceC2806a interfaceC2806a = this.f6864b;
        AbstractC0241a.s(parcel, 3, b(interfaceC2806a));
        k kVar = this.f6865c;
        AbstractC0241a.s(parcel, 4, b(kVar));
        InterfaceC0828Yg interfaceC0828Yg = this.f6866d;
        AbstractC0241a.s(parcel, 5, b(interfaceC0828Yg));
        InterfaceC1966ub interfaceC1966ub = this.f6867e;
        AbstractC0241a.s(parcel, 6, b(interfaceC1966ub));
        AbstractC0241a.u(parcel, 7, this.f6868f);
        AbstractC0241a.B(parcel, 8, 4);
        parcel.writeInt(this.f6869g ? 1 : 0);
        AbstractC0241a.u(parcel, 9, this.f6870h);
        InterfaceC2893c interfaceC2893c = this.i;
        AbstractC0241a.s(parcel, 10, b(interfaceC2893c));
        AbstractC0241a.B(parcel, 11, 4);
        parcel.writeInt(this.f6871j);
        AbstractC0241a.B(parcel, 12, 4);
        parcel.writeInt(this.f6872k);
        AbstractC0241a.u(parcel, 13, this.f6873l);
        AbstractC0241a.t(parcel, 14, this.f6874m, i);
        AbstractC0241a.u(parcel, 16, this.f6875n);
        AbstractC0241a.t(parcel, 17, this.f6853C, i);
        InterfaceC1912tb interfaceC1912tb = this.f6854D;
        AbstractC0241a.s(parcel, 18, b(interfaceC1912tb));
        AbstractC0241a.u(parcel, 19, this.f6855E);
        AbstractC0241a.u(parcel, 24, this.f6856F);
        AbstractC0241a.u(parcel, 25, this.f6857G);
        C1760qk c1760qk = this.f6858H;
        AbstractC0241a.s(parcel, 26, b(c1760qk));
        InterfaceC2084wl interfaceC2084wl = this.f6859I;
        AbstractC0241a.s(parcel, 27, b(interfaceC2084wl));
        InterfaceC0570Jd interfaceC0570Jd = this.f6860J;
        AbstractC0241a.s(parcel, 28, b(interfaceC0570Jd));
        AbstractC0241a.B(parcel, 29, 4);
        parcel.writeInt(this.f6861K ? 1 : 0);
        AbstractC0241a.B(parcel, 30, 8);
        long j6 = this.f6862L;
        parcel.writeLong(j6);
        AbstractC0241a.H(parcel, iE);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.he)).booleanValue()) {
            f6852N.put(Long.valueOf(j6), new i(interfaceC2806a, kVar, interfaceC0828Yg, interfaceC1912tb, interfaceC1966ub, interfaceC2893c, c1760qk, interfaceC2084wl, interfaceC0570Jd, AbstractC0640Nf.f10008d.schedule(new s2.j(j6), ((Integer) r2.f23270c.a(H9.je)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(C0561Il c0561Il, InterfaceC0828Yg interfaceC0828Yg, int i, C2951a c2951a, String str, f fVar, String str2, String str3, String str4, C1760qk c1760qk, BinderC0718Rp binderC0718Rp, String str5) {
        this.f6863a = null;
        this.f6864b = null;
        this.f6865c = c0561Il;
        this.f6866d = interfaceC0828Yg;
        this.f6854D = null;
        this.f6867e = null;
        this.f6869g = false;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8747g1)).booleanValue()) {
            this.f6868f = null;
            this.f6870h = null;
        } else {
            this.f6868f = str2;
            this.f6870h = str3;
        }
        this.i = null;
        this.f6871j = i;
        this.f6872k = 1;
        this.f6873l = null;
        this.f6874m = c2951a;
        this.f6875n = str;
        this.f6853C = fVar;
        this.f6855E = str5;
        this.f6856F = null;
        this.f6857G = str4;
        this.f6858H = c1760qk;
        this.f6859I = null;
        this.f6860J = binderC0718Rp;
        this.f6861K = false;
        this.f6862L = M.getAndIncrement();
    }

    public AdOverlayInfoParcel(C0615Lo c0615Lo, InterfaceC0828Yg interfaceC0828Yg, C2951a c2951a) {
        this.f6865c = c0615Lo;
        this.f6866d = interfaceC0828Yg;
        this.f6871j = 1;
        this.f6874m = c2951a;
        this.f6863a = null;
        this.f6864b = null;
        this.f6854D = null;
        this.f6867e = null;
        this.f6868f = null;
        this.f6869g = false;
        this.f6870h = null;
        this.i = null;
        this.f6872k = 1;
        this.f6873l = null;
        this.f6875n = null;
        this.f6853C = null;
        this.f6855E = null;
        this.f6856F = null;
        this.f6857G = null;
        this.f6858H = null;
        this.f6859I = null;
        this.f6860J = null;
        this.f6861K = false;
        this.f6862L = M.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC2806a interfaceC2806a, C0947bh c0947bh, InterfaceC1912tb interfaceC1912tb, InterfaceC1966ub interfaceC1966ub, InterfaceC2893c interfaceC2893c, C1273hh c1273hh, boolean z6, int i, String str, String str2, C2951a c2951a, InterfaceC2084wl interfaceC2084wl, BinderC0718Rp binderC0718Rp) {
        this.f6863a = null;
        this.f6864b = interfaceC2806a;
        this.f6865c = c0947bh;
        this.f6866d = c1273hh;
        this.f6854D = interfaceC1912tb;
        this.f6867e = interfaceC1966ub;
        this.f6868f = str2;
        this.f6869g = z6;
        this.f6870h = str;
        this.i = interfaceC2893c;
        this.f6871j = i;
        this.f6872k = 3;
        this.f6873l = null;
        this.f6874m = c2951a;
        this.f6875n = null;
        this.f6853C = null;
        this.f6855E = null;
        this.f6856F = null;
        this.f6857G = null;
        this.f6858H = null;
        this.f6859I = interfaceC2084wl;
        this.f6860J = binderC0718Rp;
        this.f6861K = false;
        this.f6862L = M.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC2806a interfaceC2806a, C0947bh c0947bh, InterfaceC1912tb interfaceC1912tb, InterfaceC1966ub interfaceC1966ub, InterfaceC2893c interfaceC2893c, C1273hh c1273hh, boolean z6, int i, String str, C2951a c2951a, InterfaceC2084wl interfaceC2084wl, BinderC0718Rp binderC0718Rp, boolean z7) {
        this.f6863a = null;
        this.f6864b = interfaceC2806a;
        this.f6865c = c0947bh;
        this.f6866d = c1273hh;
        this.f6854D = interfaceC1912tb;
        this.f6867e = interfaceC1966ub;
        this.f6868f = null;
        this.f6869g = z6;
        this.f6870h = null;
        this.i = interfaceC2893c;
        this.f6871j = i;
        this.f6872k = 3;
        this.f6873l = str;
        this.f6874m = c2951a;
        this.f6875n = null;
        this.f6853C = null;
        this.f6855E = null;
        this.f6856F = null;
        this.f6857G = null;
        this.f6858H = null;
        this.f6859I = interfaceC2084wl;
        this.f6860J = binderC0718Rp;
        this.f6861K = z7;
        this.f6862L = M.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC2806a interfaceC2806a, k kVar, InterfaceC2893c interfaceC2893c, C1273hh c1273hh, boolean z6, int i, C2951a c2951a, InterfaceC2084wl interfaceC2084wl, BinderC0718Rp binderC0718Rp) {
        this.f6863a = null;
        this.f6864b = interfaceC2806a;
        this.f6865c = kVar;
        this.f6866d = c1273hh;
        this.f6854D = null;
        this.f6867e = null;
        this.f6868f = null;
        this.f6869g = z6;
        this.f6870h = null;
        this.i = interfaceC2893c;
        this.f6871j = i;
        this.f6872k = 2;
        this.f6873l = null;
        this.f6874m = c2951a;
        this.f6875n = null;
        this.f6853C = null;
        this.f6855E = null;
        this.f6856F = null;
        this.f6857G = null;
        this.f6858H = null;
        this.f6859I = interfaceC2084wl;
        this.f6860J = binderC0718Rp;
        this.f6861K = false;
        this.f6862L = M.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z6, String str2, IBinder iBinder5, int i, int i3, String str3, C2951a c2951a, String str4, f fVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z7, long j6) {
        this.f6863a = eVar;
        this.f6868f = str;
        this.f6869g = z6;
        this.f6870h = str2;
        this.f6871j = i;
        this.f6872k = i3;
        this.f6873l = str3;
        this.f6874m = c2951a;
        this.f6875n = str4;
        this.f6853C = fVar;
        this.f6855E = str5;
        this.f6856F = str6;
        this.f6857G = str7;
        this.f6861K = z7;
        this.f6862L = j6;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.he)).booleanValue()) {
            i iVar = (i) f6852N.remove(Long.valueOf(j6));
            if (iVar != null) {
                this.f6864b = iVar.f23485a;
                this.f6865c = iVar.f23486b;
                this.f6866d = iVar.f23487c;
                this.f6854D = iVar.f23488d;
                this.f6867e = iVar.f23489e;
                this.f6858H = iVar.f23491g;
                this.f6859I = iVar.f23492h;
                this.f6860J = iVar.i;
                this.i = iVar.f23490f;
                iVar.f23493j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f6864b = (InterfaceC2806a) b.n1(b.d1(iBinder));
        this.f6865c = (k) b.n1(b.d1(iBinder2));
        this.f6866d = (InterfaceC0828Yg) b.n1(b.d1(iBinder3));
        this.f6854D = (InterfaceC1912tb) b.n1(b.d1(iBinder6));
        this.f6867e = (InterfaceC1966ub) b.n1(b.d1(iBinder4));
        this.i = (InterfaceC2893c) b.n1(b.d1(iBinder5));
        this.f6858H = (C1760qk) b.n1(b.d1(iBinder7));
        this.f6859I = (InterfaceC2084wl) b.n1(b.d1(iBinder8));
        this.f6860J = (InterfaceC0570Jd) b.n1(b.d1(iBinder9));
    }

    public AdOverlayInfoParcel(e eVar, InterfaceC2806a interfaceC2806a, k kVar, InterfaceC2893c interfaceC2893c, C2951a c2951a, C1273hh c1273hh, InterfaceC2084wl interfaceC2084wl, String str) {
        this.f6863a = eVar;
        this.f6864b = interfaceC2806a;
        this.f6865c = kVar;
        this.f6866d = c1273hh;
        this.f6854D = null;
        this.f6867e = null;
        this.f6868f = null;
        this.f6869g = false;
        this.f6870h = null;
        this.i = interfaceC2893c;
        this.f6871j = -1;
        this.f6872k = 4;
        this.f6873l = null;
        this.f6874m = c2951a;
        this.f6875n = null;
        this.f6853C = null;
        this.f6855E = str;
        this.f6856F = null;
        this.f6857G = null;
        this.f6858H = null;
        this.f6859I = interfaceC2084wl;
        this.f6860J = null;
        this.f6861K = false;
        this.f6862L = M.getAndIncrement();
    }
}
