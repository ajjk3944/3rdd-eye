package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Sz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11300a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11301b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f11302c;

    /* renamed from: d, reason: collision with root package name */
    public final C1948uA f11303d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11304e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f11305f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11306g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f11307h;

    public Sz(Context context, InterfaceC1692pN interfaceC1692pN, Vz vz, C1948uA c1948uA, ExecutorService executorService, Kz kz, Cw cw) {
        this.f11301b = context;
        this.f11304e = interfaceC1692pN;
        this.f11305f = vz;
        this.f11303d = c1948uA;
        this.f11302c = executorService;
        this.f11306g = kz;
        this.f11307h = cw;
    }

    public static Jy a(int i) {
        Iy iyD = Jy.D();
        iyD.b();
        ((Jy) iyD.f13551b).I(i);
        return (Jy) iyD.d();
    }

    public static Jy b(int i) {
        Iy iyD = Jy.D();
        iyD.b();
        ((Jy) iyD.f13551b).I(i);
        return (Jy) iyD.d();
    }

    public Sz(Context context, ExecutorService executorService, Xx xx, C1612ny c1612ny, C1948uA c1948uA, Uz uz) {
        this.f11301b = context;
        this.f11302c = executorService;
        this.f11304e = c1612ny;
        this.f11303d = c1948uA;
        this.f11307h = uz;
        this.f11305f = xx.G();
        this.f11306g = xx.M().C();
    }
}
