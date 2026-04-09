package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ag2;
import defpackage.an2;
import defpackage.ax2;
import defpackage.e51;
import defpackage.ed4;
import defpackage.fc2;
import defpackage.fd1;
import defpackage.fe4;
import defpackage.fg2;
import defpackage.hg4;
import defpackage.jg2;
import defpackage.kf1;
import defpackage.l0;
import defpackage.l32;
import defpackage.m32;
import defpackage.md2;
import defpackage.mz1;
import defpackage.oi0;
import defpackage.oq2;
import defpackage.pz2;
import defpackage.sd4;
import defpackage.tw1;
import defpackage.uk2;
import defpackage.w82;
import defpackage.xp2;
import defpackage.ye4;
import defpackage.zb4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends l0 implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new ed4(3);
    public static final AtomicLong D = new AtomicLong(0);
    public static final ConcurrentHashMap E = new ConcurrentHashMap();
    public final w82 A;
    public final boolean B;
    public final long C;
    public final fc2 f;
    public final fd1 g;
    public final ye4 h;
    public final ag2 i;
    public final m32 j;
    public final String k;
    public final boolean l;
    public final String m;
    public final kf1 n;
    public final int o;
    public final int p;
    public final String q;
    public final e51 r;
    public final String s;
    public final zb4 t;
    public final l32 u;
    public final String v;
    public final String w;
    public final String x;
    public final an2 y;
    public final xp2 z;

    public AdOverlayInfoParcel(fd1 fd1Var, fg2 fg2Var, l32 l32Var, m32 m32Var, kf1 kf1Var, jg2 jg2Var, boolean z, int i, String str, e51 e51Var, xp2 xp2Var, pz2 pz2Var, boolean z2) {
        this.f = null;
        this.g = fd1Var;
        this.h = fg2Var;
        this.i = jg2Var;
        this.u = l32Var;
        this.j = m32Var;
        this.k = null;
        this.l = z;
        this.m = null;
        this.n = kf1Var;
        this.o = i;
        this.p = 3;
        this.q = str;
        this.r = e51Var;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = xp2Var;
        this.A = pz2Var;
        this.B = z2;
        this.C = D.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) tw1.e.c.a(mz1.Kd)).booleanValue()) {
                return null;
            }
            hg4.C.h.d("AdOverlayInfoParcel.getFromIntent", e);
            return null;
        }
    }

    public static final oi0 b(Object obj) {
        if (((Boolean) tw1.e.c.a(mz1.Kd)).booleanValue()) {
            return null;
        }
        return new oi0(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.C(parcel, 2, this.f, i);
        fd1 fd1Var = this.g;
        uk2.B(parcel, 3, b(fd1Var));
        ye4 ye4Var = this.h;
        uk2.B(parcel, 4, b(ye4Var));
        ag2 ag2Var = this.i;
        uk2.B(parcel, 5, b(ag2Var));
        m32 m32Var = this.j;
        uk2.B(parcel, 6, b(m32Var));
        uk2.D(parcel, 7, this.k);
        uk2.T(parcel, 8, 4);
        parcel.writeInt(this.l ? 1 : 0);
        uk2.D(parcel, 9, this.m);
        kf1 kf1Var = this.n;
        uk2.B(parcel, 10, b(kf1Var));
        uk2.T(parcel, 11, 4);
        parcel.writeInt(this.o);
        uk2.T(parcel, 12, 4);
        parcel.writeInt(this.p);
        uk2.D(parcel, 13, this.q);
        uk2.C(parcel, 14, this.r, i);
        uk2.D(parcel, 16, this.s);
        uk2.C(parcel, 17, this.t, i);
        l32 l32Var = this.u;
        uk2.B(parcel, 18, b(l32Var));
        uk2.D(parcel, 19, this.v);
        uk2.D(parcel, 24, this.w);
        uk2.D(parcel, 25, this.x);
        an2 an2Var = this.y;
        uk2.B(parcel, 26, b(an2Var));
        xp2 xp2Var = this.z;
        uk2.B(parcel, 27, b(xp2Var));
        w82 w82Var = this.A;
        uk2.B(parcel, 28, b(w82Var));
        uk2.T(parcel, 29, 4);
        parcel.writeInt(this.B ? 1 : 0);
        uk2.T(parcel, 30, 8);
        long j = this.C;
        parcel.writeLong(j);
        uk2.O(parcel, I);
        if (((Boolean) tw1.e.c.a(mz1.Kd)).booleanValue()) {
            E.put(Long.valueOf(j), new sd4(fd1Var, ye4Var, ag2Var, l32Var, m32Var, kf1Var, an2Var, xp2Var, w82Var, md2.d.schedule(new fe4(j), ((Integer) r2.c.a(mz1.Md)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(fd1 fd1Var, fg2 fg2Var, l32 l32Var, m32 m32Var, kf1 kf1Var, jg2 jg2Var, boolean z, int i, String str, String str2, e51 e51Var, xp2 xp2Var, pz2 pz2Var) {
        this.f = null;
        this.g = fd1Var;
        this.h = fg2Var;
        this.i = jg2Var;
        this.u = l32Var;
        this.j = m32Var;
        this.k = str2;
        this.l = z;
        this.m = str;
        this.n = kf1Var;
        this.o = i;
        this.p = 3;
        this.q = null;
        this.r = e51Var;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = xp2Var;
        this.A = pz2Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(fd1 fd1Var, ye4 ye4Var, kf1 kf1Var, jg2 jg2Var, boolean z, int i, e51 e51Var, xp2 xp2Var, pz2 pz2Var) {
        this.f = null;
        this.g = fd1Var;
        this.h = ye4Var;
        this.i = jg2Var;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = z;
        this.m = null;
        this.n = kf1Var;
        this.o = i;
        this.p = 2;
        this.q = null;
        this.r = e51Var;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = xp2Var;
        this.A = pz2Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(fc2 fc2Var, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, e51 e51Var, String str4, zb4 zb4Var, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.f = fc2Var;
        this.k = str;
        this.l = z;
        this.m = str2;
        this.o = i;
        this.p = i2;
        this.q = str3;
        this.r = e51Var;
        this.s = str4;
        this.t = zb4Var;
        this.v = str5;
        this.w = str6;
        this.x = str7;
        this.B = z2;
        this.C = j;
        if (((Boolean) tw1.e.c.a(mz1.Kd)).booleanValue()) {
            sd4 sd4Var = (sd4) E.remove(Long.valueOf(j));
            if (sd4Var != null) {
                this.g = sd4Var.a;
                this.h = sd4Var.b;
                this.i = sd4Var.c;
                this.u = sd4Var.d;
                this.j = sd4Var.e;
                this.y = sd4Var.g;
                this.z = sd4Var.h;
                this.A = sd4Var.i;
                this.n = sd4Var.f;
                sd4Var.j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.g = (fd1) oi0.l1(oi0.X0(iBinder));
        this.h = (ye4) oi0.l1(oi0.X0(iBinder2));
        this.i = (ag2) oi0.l1(oi0.X0(iBinder3));
        this.u = (l32) oi0.l1(oi0.X0(iBinder6));
        this.j = (m32) oi0.l1(oi0.X0(iBinder4));
        this.n = (kf1) oi0.l1(oi0.X0(iBinder5));
        this.y = (an2) oi0.l1(oi0.X0(iBinder7));
        this.z = (xp2) oi0.l1(oi0.X0(iBinder8));
        this.A = (w82) oi0.l1(oi0.X0(iBinder9));
    }

    public AdOverlayInfoParcel(fc2 fc2Var, fd1 fd1Var, ye4 ye4Var, kf1 kf1Var, e51 e51Var, jg2 jg2Var, xp2 xp2Var, String str) {
        this.f = fc2Var;
        this.g = fd1Var;
        this.h = ye4Var;
        this.i = jg2Var;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = kf1Var;
        this.o = -1;
        this.p = 4;
        this.q = null;
        this.r = e51Var;
        this.s = null;
        this.t = null;
        this.v = str;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = xp2Var;
        this.A = null;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(jg2 jg2Var, e51 e51Var, String str, String str2, w82 w82Var) {
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = jg2Var;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = null;
        this.o = 14;
        this.p = 5;
        this.q = null;
        this.r = e51Var;
        this.s = null;
        this.t = null;
        this.v = str;
        this.w = str2;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = w82Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(oq2 oq2Var, ag2 ag2Var, int i, e51 e51Var, String str, zb4 zb4Var, String str2, String str3, String str4, an2 an2Var, pz2 pz2Var, String str5) {
        this.f = null;
        this.g = null;
        this.h = oq2Var;
        this.i = ag2Var;
        this.u = null;
        this.j = null;
        this.l = false;
        if (((Boolean) tw1.e.c.a(mz1.R0)).booleanValue()) {
            this.k = null;
            this.m = null;
        } else {
            this.k = str2;
            this.m = str3;
        }
        this.n = null;
        this.o = i;
        this.p = 1;
        this.q = null;
        this.r = e51Var;
        this.s = str;
        this.t = zb4Var;
        this.v = str5;
        this.w = null;
        this.x = str4;
        this.y = an2Var;
        this.z = null;
        this.A = pz2Var;
        this.B = false;
        this.C = D.getAndIncrement();
    }

    public AdOverlayInfoParcel(ax2 ax2Var, ag2 ag2Var, e51 e51Var) {
        this.h = ax2Var;
        this.i = ag2Var;
        this.o = 1;
        this.r = e51Var;
        this.f = null;
        this.g = null;
        this.u = null;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = null;
        this.n = null;
        this.p = 1;
        this.q = null;
        this.s = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = false;
        this.C = D.getAndIncrement();
    }
}
