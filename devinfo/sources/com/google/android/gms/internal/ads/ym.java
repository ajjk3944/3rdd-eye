package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ym extends sa.c {

    /* renamed from: a, reason: collision with root package name */
    public final xm f18798a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f18799b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f18800c;

    /* renamed from: d, reason: collision with root package name */
    public final double f18801d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18802e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18803f;

    public ym(xm xmVar) {
        double dF;
        int iC;
        vb.a aVarA;
        this.f18798a = xmVar;
        Uri uriZzc = null;
        try {
            aVarA = xmVar.a();
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
        Drawable drawable = aVarA != null ? (Drawable) vb.b.U0(aVarA) : null;
        this.f18799b = drawable;
        try {
            uriZzc = this.f18798a.zzc();
        } catch (RemoteException e10) {
            za.i.f("", e10);
        }
        this.f18800c = uriZzc;
        try {
            dF = this.f18798a.f();
        } catch (RemoteException e11) {
            za.i.f("", e11);
            dF = 1.0d;
        }
        this.f18801d = dF;
        int iD = -1;
        try {
            iC = this.f18798a.c();
        } catch (RemoteException e12) {
            za.i.f("", e12);
            iC = -1;
        }
        this.f18802e = iC;
        try {
            iD = this.f18798a.d();
        } catch (RemoteException e13) {
            za.i.f("", e13);
        }
        this.f18803f = iD;
    }

    @Override // sa.c
    public final Drawable a() {
        return this.f18799b;
    }

    @Override // sa.c
    public final double b() {
        return this.f18801d;
    }

    @Override // sa.c
    public final Uri c() {
        return this.f18800c;
    }

    @Override // sa.c
    public final int d() {
        return this.f18802e;
    }

    @Override // sa.c
    public final int e() {
        return this.f18803f;
    }
}
