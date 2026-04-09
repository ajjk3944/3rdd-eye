package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class hg0 implements pb.b, pb.c {

    /* renamed from: a, reason: collision with root package name */
    public final gx f11858a = new gx();

    /* renamed from: b, reason: collision with root package name */
    public final Object f11859b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f11860c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11861d = false;

    /* renamed from: e, reason: collision with root package name */
    public iu f11862e;

    /* renamed from: f, reason: collision with root package name */
    public di f11863f;

    public static void b(Context context, gx gxVar, Executor executor) {
        if (((Boolean) nl.j.u()).booleanValue() || ((Boolean) nl.f14327h.u()).booleanValue()) {
            gxVar.a(new q81(0, gxVar, new mu0(context, 3)), executor);
        }
    }

    public void O(nb.b bVar) {
        za.i.c("Disconnected from remote ad request service.");
        this.f11858a.d(new og0(1));
    }

    @Override // pb.b
    public void S(int i4) {
        za.i.c("Cannot connect to remote service, fallback to local instance.");
    }

    public final void a() {
        synchronized (this.f11859b) {
            try {
                this.f11861d = true;
                if (this.f11863f.g() || this.f11863f.c()) {
                    this.f11863f.f();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
