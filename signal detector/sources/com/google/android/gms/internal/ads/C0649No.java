package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;
import j2.AbstractC2547c;
import j2.AbstractC2555k;
import j2.C2556l;

/* renamed from: com.google.android.gms.internal.ads.No, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649No extends AbstractC2547c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10065a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10066b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10067c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10068d;

    public C0649No(BinderC0751To binderC0751To, String str, AbstractC2555k abstractC2555k) {
        this.f10065a = 0;
        this.f10066b = str;
        this.f10067c = abstractC2555k;
        Objects.requireNonNull(binderC0751To);
        this.f10068d = binderC0751To;
    }

    @Override // j2.AbstractC2547c
    public void a() {
        switch (this.f10065a) {
            case 1:
                synchronized (this.f10066b) {
                    try {
                        AbstractC2547c abstractC2547c = (AbstractC2547c) this.f10067c;
                        if (abstractC2547c != null) {
                            abstractC2547c.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // j2.AbstractC2547c
    public final void b(C2556l c2556l) {
        switch (this.f10065a) {
            case 0:
                ((BinderC0751To) this.f10068d).M3(BinderC0751To.P3(c2556l));
                return;
            default:
                q2.F0 f02 = (q2.F0) this.f10068d;
                j2.s sVar = f02.f23104c;
                q2.L l2 = f02.i;
                q2.B0 b0C = null;
                if (l2 != null) {
                    try {
                        b0C = l2.C();
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                    }
                }
                sVar.a(b0C);
                synchronized (this.f10066b) {
                    try {
                        AbstractC2547c abstractC2547c = (AbstractC2547c) this.f10067c;
                        if (abstractC2547c != null) {
                            abstractC2547c.b(c2556l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // j2.AbstractC2547c
    public void c() {
        switch (this.f10065a) {
            case 1:
                synchronized (this.f10066b) {
                    try {
                        AbstractC2547c abstractC2547c = (AbstractC2547c) this.f10067c;
                        if (abstractC2547c != null) {
                            abstractC2547c.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // j2.AbstractC2547c
    public final void d() {
        switch (this.f10065a) {
            case 0:
                ((BinderC0751To) this.f10068d).L3((AbstractC2555k) this.f10067c, (String) this.f10066b);
                return;
            default:
                q2.F0 f02 = (q2.F0) this.f10068d;
                j2.s sVar = f02.f23104c;
                q2.L l2 = f02.i;
                q2.B0 b0C = null;
                if (l2 != null) {
                    try {
                        b0C = l2.C();
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                    }
                }
                sVar.a(b0C);
                synchronized (this.f10066b) {
                    try {
                        AbstractC2547c abstractC2547c = (AbstractC2547c) this.f10067c;
                        if (abstractC2547c != null) {
                            abstractC2547c.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // j2.AbstractC2547c
    public void e() {
        switch (this.f10065a) {
            case 1:
                synchronized (this.f10066b) {
                    try {
                        AbstractC2547c abstractC2547c = (AbstractC2547c) this.f10067c;
                        if (abstractC2547c != null) {
                            abstractC2547c.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // j2.AbstractC2547c, q2.InterfaceC2806a
    public void onAdClicked() {
        switch (this.f10065a) {
            case 1:
                synchronized (this.f10066b) {
                    try {
                        AbstractC2547c abstractC2547c = (AbstractC2547c) this.f10067c;
                        if (abstractC2547c != null) {
                            abstractC2547c.onAdClicked();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    public C0649No(q2.F0 f02) {
        this.f10065a = 1;
        this.f10068d = f02;
        this.f10066b = new Object();
    }
}
