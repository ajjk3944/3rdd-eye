package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.b00;
import com.google.android.gms.internal.ads.d90;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.fo;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.hf0;
import com.google.android.gms.internal.ads.m60;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.t80;
import com.google.android.gms.internal.ads.uz;
import com.google.android.gms.internal.ads.zs;
import j$.util.concurrent.ConcurrentHashMap;
import j4.g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import qb.a;
import ua.f;
import ua.j;
import va.s;
import vb.b;
import xa.c;
import xa.e;
import xa.k;
import xa.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new g(28);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicLong f9017y = new AtomicLong(0);

    /* renamed from: z, reason: collision with root package name */
    public static final ConcurrentHashMap f9018z = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final e f9019a;

    /* renamed from: b, reason: collision with root package name */
    public final va.a f9020b;

    /* renamed from: c, reason: collision with root package name */
    public final l f9021c;

    /* renamed from: d, reason: collision with root package name */
    public final qz f9022d;

    /* renamed from: e, reason: collision with root package name */
    public final fo f9023e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9024f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9025h;

    /* renamed from: i, reason: collision with root package name */
    public final c f9026i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9027k;

    /* renamed from: l, reason: collision with root package name */
    public final String f9028l;

    /* renamed from: m, reason: collision with root package name */
    public final za.a f9029m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9030n;

    /* renamed from: o, reason: collision with root package name */
    public final f f9031o;

    /* renamed from: p, reason: collision with root package name */
    public final eo f9032p;

    /* renamed from: q, reason: collision with root package name */
    public final String f9033q;

    /* renamed from: r, reason: collision with root package name */
    public final String f9034r;

    /* renamed from: s, reason: collision with root package name */
    public final String f9035s;

    /* renamed from: t, reason: collision with root package name */
    public final m60 f9036t;

    /* renamed from: u, reason: collision with root package name */
    public final t80 f9037u;

    /* renamed from: v, reason: collision with root package name */
    public final zs f9038v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f9039w;

    /* renamed from: x, reason: collision with root package name */
    public final long f9040x;

    public AdOverlayInfoParcel(b00 b00Var, za.a aVar, String str, String str2, zs zsVar) {
        this.f9019a = null;
        this.f9020b = null;
        this.f9021c = null;
        this.f9022d = b00Var;
        this.f9032p = null;
        this.f9023e = null;
        this.f9024f = null;
        this.g = false;
        this.f9025h = null;
        this.f9026i = null;
        this.j = 14;
        this.f9027k = 5;
        this.f9028l = null;
        this.f9029m = aVar;
        this.f9030n = null;
        this.f9031o = null;
        this.f9033q = str;
        this.f9034r = str2;
        this.f9035s = null;
        this.f9036t = null;
        this.f9037u = null;
        this.f9038v = zsVar;
        this.f9039w = false;
        this.f9040x = f9017y.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e2) {
            if (!((Boolean) s.f36163e.f36166c.a(sk.f16187je)).booleanValue()) {
                return null;
            }
            j.C.f35265h.f("AdOverlayInfoParcel.getFromIntent", e2);
            return null;
        }
    }

    public static final b c(Object obj) {
        if (((Boolean) s.f36163e.f36166c.a(sk.f16187je)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iO = com.bumptech.glide.f.O(parcel, 20293);
        com.bumptech.glide.f.H(parcel, 2, this.f9019a, i4);
        va.a aVar = this.f9020b;
        com.bumptech.glide.f.F(parcel, 3, c(aVar));
        l lVar = this.f9021c;
        com.bumptech.glide.f.F(parcel, 4, c(lVar));
        qz qzVar = this.f9022d;
        com.bumptech.glide.f.F(parcel, 5, c(qzVar));
        fo foVar = this.f9023e;
        com.bumptech.glide.f.F(parcel, 6, c(foVar));
        com.bumptech.glide.f.I(parcel, 7, this.f9024f);
        com.bumptech.glide.f.N(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        com.bumptech.glide.f.I(parcel, 9, this.f9025h);
        c cVar = this.f9026i;
        com.bumptech.glide.f.F(parcel, 10, c(cVar));
        com.bumptech.glide.f.N(parcel, 11, 4);
        parcel.writeInt(this.j);
        com.bumptech.glide.f.N(parcel, 12, 4);
        parcel.writeInt(this.f9027k);
        com.bumptech.glide.f.I(parcel, 13, this.f9028l);
        com.bumptech.glide.f.H(parcel, 14, this.f9029m, i4);
        com.bumptech.glide.f.I(parcel, 16, this.f9030n);
        com.bumptech.glide.f.H(parcel, 17, this.f9031o, i4);
        eo eoVar = this.f9032p;
        com.bumptech.glide.f.F(parcel, 18, c(eoVar));
        com.bumptech.glide.f.I(parcel, 19, this.f9033q);
        com.bumptech.glide.f.I(parcel, 24, this.f9034r);
        com.bumptech.glide.f.I(parcel, 25, this.f9035s);
        m60 m60Var = this.f9036t;
        com.bumptech.glide.f.F(parcel, 26, c(m60Var));
        t80 t80Var = this.f9037u;
        com.bumptech.glide.f.F(parcel, 27, c(t80Var));
        zs zsVar = this.f9038v;
        com.bumptech.glide.f.F(parcel, 28, c(zsVar));
        com.bumptech.glide.f.N(parcel, 29, 4);
        parcel.writeInt(this.f9039w ? 1 : 0);
        com.bumptech.glide.f.N(parcel, 30, 8);
        long j = this.f9040x;
        parcel.writeLong(j);
        com.bumptech.glide.f.P(parcel, iO);
        if (((Boolean) s.f36163e.f36166c.a(sk.f16187je)).booleanValue()) {
            f9018z.put(Long.valueOf(j), new xa.j(aVar, lVar, qzVar, eoVar, foVar, cVar, m60Var, t80Var, zsVar, fx.f11277d.schedule(new k(j), ((Integer) r2.f36166c.a(sk.f16217le)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(d90 d90Var, qz qzVar, int i4, za.a aVar, String str, f fVar, String str2, String str3, String str4, m60 m60Var, qh0 qh0Var, String str5) {
        this.f9019a = null;
        this.f9020b = null;
        this.f9021c = d90Var;
        this.f9022d = qzVar;
        this.f9032p = null;
        this.f9023e = null;
        this.g = false;
        if (((Boolean) s.f36163e.f36166c.a(sk.f16133g1)).booleanValue()) {
            this.f9024f = null;
            this.f9025h = null;
        } else {
            this.f9024f = str2;
            this.f9025h = str3;
        }
        this.f9026i = null;
        this.j = i4;
        this.f9027k = 1;
        this.f9028l = null;
        this.f9029m = aVar;
        this.f9030n = str;
        this.f9031o = fVar;
        this.f9033q = str5;
        this.f9034r = null;
        this.f9035s = str4;
        this.f9036t = m60Var;
        this.f9037u = null;
        this.f9038v = qh0Var;
        this.f9039w = false;
        this.f9040x = f9017y.getAndIncrement();
    }

    public AdOverlayInfoParcel(hf0 hf0Var, qz qzVar, za.a aVar) {
        this.f9021c = hf0Var;
        this.f9022d = qzVar;
        this.j = 1;
        this.f9029m = aVar;
        this.f9019a = null;
        this.f9020b = null;
        this.f9032p = null;
        this.f9023e = null;
        this.f9024f = null;
        this.g = false;
        this.f9025h = null;
        this.f9026i = null;
        this.f9027k = 1;
        this.f9028l = null;
        this.f9030n = null;
        this.f9031o = null;
        this.f9033q = null;
        this.f9034r = null;
        this.f9035s = null;
        this.f9036t = null;
        this.f9037u = null;
        this.f9038v = null;
        this.f9039w = false;
        this.f9040x = f9017y.getAndIncrement();
    }

    public AdOverlayInfoParcel(va.a aVar, uz uzVar, eo eoVar, fo foVar, c cVar, b00 b00Var, boolean z3, int i4, String str, String str2, za.a aVar2, t80 t80Var, qh0 qh0Var) {
        this.f9019a = null;
        this.f9020b = aVar;
        this.f9021c = uzVar;
        this.f9022d = b00Var;
        this.f9032p = eoVar;
        this.f9023e = foVar;
        this.f9024f = str2;
        this.g = z3;
        this.f9025h = str;
        this.f9026i = cVar;
        this.j = i4;
        this.f9027k = 3;
        this.f9028l = null;
        this.f9029m = aVar2;
        this.f9030n = null;
        this.f9031o = null;
        this.f9033q = null;
        this.f9034r = null;
        this.f9035s = null;
        this.f9036t = null;
        this.f9037u = t80Var;
        this.f9038v = qh0Var;
        this.f9039w = false;
        this.f9040x = f9017y.getAndIncrement();
    }

    public AdOverlayInfoParcel(va.a aVar, uz uzVar, eo eoVar, fo foVar, c cVar, b00 b00Var, boolean z3, int i4, String str, za.a aVar2, t80 t80Var, qh0 qh0Var, boolean z10) {
        this.f9019a = null;
        this.f9020b = aVar;
        this.f9021c = uzVar;
        this.f9022d = b00Var;
        this.f9032p = eoVar;
        this.f9023e = foVar;
        this.f9024f = null;
        this.g = z3;
        this.f9025h = null;
        this.f9026i = cVar;
        this.j = i4;
        this.f9027k = 3;
        this.f9028l = str;
        this.f9029m = aVar2;
        this.f9030n = null;
        this.f9031o = null;
        this.f9033q = null;
        this.f9034r = null;
        this.f9035s = null;
        this.f9036t = null;
        this.f9037u = t80Var;
        this.f9038v = qh0Var;
        this.f9039w = z10;
        this.f9040x = f9017y.getAndIncrement();
    }

    public AdOverlayInfoParcel(va.a aVar, l lVar, c cVar, b00 b00Var, boolean z3, int i4, za.a aVar2, t80 t80Var, qh0 qh0Var) {
        this.f9019a = null;
        this.f9020b = aVar;
        this.f9021c = lVar;
        this.f9022d = b00Var;
        this.f9032p = null;
        this.f9023e = null;
        this.f9024f = null;
        this.g = z3;
        this.f9025h = null;
        this.f9026i = cVar;
        this.j = i4;
        this.f9027k = 2;
        this.f9028l = null;
        this.f9029m = aVar2;
        this.f9030n = null;
        this.f9031o = null;
        this.f9033q = null;
        this.f9034r = null;
        this.f9035s = null;
        this.f9036t = null;
        this.f9037u = t80Var;
        this.f9038v = qh0Var;
        this.f9039w = false;
        this.f9040x = f9017y.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z3, String str2, IBinder iBinder5, int i4, int i10, String str3, za.a aVar, String str4, f fVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z10, long j) {
        this.f9019a = eVar;
        this.f9024f = str;
        this.g = z3;
        this.f9025h = str2;
        this.j = i4;
        this.f9027k = i10;
        this.f9028l = str3;
        this.f9029m = aVar;
        this.f9030n = str4;
        this.f9031o = fVar;
        this.f9033q = str5;
        this.f9034r = str6;
        this.f9035s = str7;
        this.f9039w = z10;
        this.f9040x = j;
        if (((Boolean) s.f36163e.f36166c.a(sk.f16187je)).booleanValue()) {
            xa.j jVar = (xa.j) f9018z.remove(Long.valueOf(j));
            if (jVar != null) {
                this.f9020b = jVar.f37064a;
                this.f9021c = jVar.f37065b;
                this.f9022d = jVar.f37066c;
                this.f9032p = jVar.f37067d;
                this.f9023e = jVar.f37068e;
                this.f9036t = jVar.g;
                this.f9037u = jVar.f37070h;
                this.f9038v = jVar.f37071i;
                this.f9026i = jVar.f37069f;
                jVar.j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f9020b = (va.a) b.U0(b.r0(iBinder));
        this.f9021c = (l) b.U0(b.r0(iBinder2));
        this.f9022d = (qz) b.U0(b.r0(iBinder3));
        this.f9032p = (eo) b.U0(b.r0(iBinder6));
        this.f9023e = (fo) b.U0(b.r0(iBinder4));
        this.f9026i = (c) b.U0(b.r0(iBinder5));
        this.f9036t = (m60) b.U0(b.r0(iBinder7));
        this.f9037u = (t80) b.U0(b.r0(iBinder8));
        this.f9038v = (zs) b.U0(b.r0(iBinder9));
    }

    public AdOverlayInfoParcel(e eVar, va.a aVar, l lVar, c cVar, za.a aVar2, b00 b00Var, t80 t80Var, String str) {
        this.f9019a = eVar;
        this.f9020b = aVar;
        this.f9021c = lVar;
        this.f9022d = b00Var;
        this.f9032p = null;
        this.f9023e = null;
        this.f9024f = null;
        this.g = false;
        this.f9025h = null;
        this.f9026i = cVar;
        this.j = -1;
        this.f9027k = 4;
        this.f9028l = null;
        this.f9029m = aVar2;
        this.f9030n = null;
        this.f9031o = null;
        this.f9033q = str;
        this.f9034r = null;
        this.f9035s = null;
        this.f9036t = null;
        this.f9037u = t80Var;
        this.f9038v = null;
        this.f9039w = false;
        this.f9040x = f9017y.getAndIncrement();
    }
}
