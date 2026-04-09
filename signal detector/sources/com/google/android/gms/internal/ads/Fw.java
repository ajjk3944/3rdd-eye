package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import M2.InterfaceC0163c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class Fw implements InterfaceC0162b, InterfaceC0163c {

    /* renamed from: a, reason: collision with root package name */
    public final Pw f8228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8230c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1945u7 f8231d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedBlockingQueue f8232e;

    /* renamed from: f, reason: collision with root package name */
    public final HandlerThread f8233f;

    /* renamed from: g, reason: collision with root package name */
    public final Cw f8234g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8235h;

    public Fw(Context context, EnumC1945u7 enumC1945u7, String str, String str2, Cw cw) throws PackageManager.NameNotFoundException {
        this.f8229b = str;
        this.f8231d = enumC1945u7;
        this.f8230c = str2;
        this.f8234g = cw;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f8233f = handlerThread;
        handlerThread.start();
        this.f8235h = System.currentTimeMillis();
        Pw pw = new Pw(context, handlerThread.getLooper(), this, this, 19621000);
        this.f8228a = pw;
        this.f8232e = new LinkedBlockingQueue();
        pw.n();
    }

    public final void a() {
        Pw pw = this.f8228a;
        if (pw != null) {
            if (pw.i() || pw.d()) {
                pw.h();
            }
        }
    }

    public final void b(int i, long j6, Exception exc) {
        Cw cw = this.f8234g;
        if (cw != null) {
            cw.c(i, System.currentTimeMillis() - j6, exc);
        }
    }

    @Override // M2.InterfaceC0162b
    public final void g0(int i) throws InterruptedException {
        try {
            b(4011, this.f8235h, null);
            this.f8232e.put(new Vw());
        } catch (InterruptedException unused) {
        }
    }

    @Override // M2.InterfaceC0162b
    public final void h0() {
        Sw sw;
        long j6 = this.f8235h;
        HandlerThread handlerThread = this.f8233f;
        try {
            sw = (Sw) this.f8228a.t();
        } catch (DeadObjectException | IllegalStateException unused) {
            sw = null;
        }
        if (sw != null) {
            try {
                Uw uw = new Uw(1, 1, this.f8231d.f17066a, this.f8229b, this.f8230c);
                Parcel parcelH0 = sw.h0();
                C7.c(parcelH0, uw);
                Parcel parcelK0 = sw.k0(parcelH0, 3);
                Vw vw = (Vw) C7.b(parcelK0, Vw.CREATOR);
                parcelK0.recycle();
                b(5011, j6, null);
                this.f8232e.put(vw);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // M2.InterfaceC0163c
    public final void k0(J2.b bVar) throws InterruptedException {
        try {
            b(4012, this.f8235h, null);
            this.f8232e.put(new Vw());
        } catch (InterruptedException unused) {
        }
    }
}
