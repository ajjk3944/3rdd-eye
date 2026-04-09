package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import m2.AbstractC2656c;

/* renamed from: com.google.android.gms.internal.ads.Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0652Oa extends AbstractC2656c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0635Na f10202a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f10203b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f10204c;

    /* renamed from: d, reason: collision with root package name */
    public final double f10205d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10206e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10207f;

    public C0652Oa(InterfaceC0635Na interfaceC0635Na) {
        double dM;
        int iB;
        S2.a aVarC;
        this.f10202a = interfaceC0635Na;
        Uri uriF = null;
        try {
            aVarC = interfaceC0635Na.c();
        } catch (RemoteException e6) {
            u2.k.f("", e6);
        }
        Drawable drawable = aVarC != null ? (Drawable) S2.b.n1(aVarC) : null;
        this.f10203b = drawable;
        try {
            uriF = this.f10202a.f();
        } catch (RemoteException e7) {
            u2.k.f("", e7);
        }
        this.f10204c = uriF;
        try {
            dM = this.f10202a.m();
        } catch (RemoteException e8) {
            u2.k.f("", e8);
            dM = 1.0d;
        }
        this.f10205d = dM;
        int iD = -1;
        try {
            iB = this.f10202a.b();
        } catch (RemoteException e9) {
            u2.k.f("", e9);
            iB = -1;
        }
        this.f10206e = iB;
        try {
            iD = this.f10202a.d();
        } catch (RemoteException e10) {
            u2.k.f("", e10);
        }
        this.f10207f = iD;
    }

    @Override // m2.AbstractC2656c
    public final Drawable a() {
        return this.f10203b;
    }

    @Override // m2.AbstractC2656c
    public final double b() {
        return this.f10205d;
    }

    @Override // m2.AbstractC2656c
    public final Uri c() {
        return this.f10204c;
    }

    @Override // m2.AbstractC2656c
    public final int d() {
        return this.f10206e;
    }

    @Override // m2.AbstractC2656c
    public final int e() {
        return this.f10207f;
    }
}
