package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import M2.InterfaceC0163c;
import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.kp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1441kp implements InterfaceC0162b, InterfaceC0163c {

    /* renamed from: a, reason: collision with root package name */
    public final C0657Of f15279a = new C0657Of();

    /* renamed from: b, reason: collision with root package name */
    public final Object f15280b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15281c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15282d = false;

    /* renamed from: e, reason: collision with root package name */
    public C1807re f15283e;

    /* renamed from: f, reason: collision with root package name */
    public C1838s8 f15284f;

    public static void b(Context context, C0657Of c0657Of, Executor executor) {
        if (((Boolean) AbstractC0994ca.f13575j.v()).booleanValue() || ((Boolean) AbstractC0994ca.f13574h.v()).booleanValue()) {
            c0657Of.a(new CD(c0657Of, 0, new C1288hw(context, 4)), executor);
        }
    }

    public final void a() {
        synchronized (this.f15280b) {
            try {
                this.f15282d = true;
                if (this.f15284f.i() || this.f15284f.d()) {
                    this.f15284f.h();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M2.InterfaceC0162b
    public void g0(int i) {
        u2.k.c("Cannot connect to remote service, fallback to local instance.");
    }

    public void k0(J2.b bVar) {
        u2.k.c("Disconnected from remote ad request service.");
        this.f15279a.c(new C1765qp(1));
    }
}
