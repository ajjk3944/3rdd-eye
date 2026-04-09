package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4805a6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f36333a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36334b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f36335c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ L f36336d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ String f36337e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ C5 f36338f;

    RunnableC4805a6(C5 c52, boolean z10, t7 t7Var, boolean z11, L l10, String str) {
        this.f36333a = z10;
        this.f36334b = t7Var;
        this.f36335c = z11;
        this.f36336d = l10;
        this.f36337e = str;
        this.f36338f = c52;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        long jC;
        long j10;
        long jA;
        InterfaceC4951s2 interfaceC4951s2 = this.f36338f.f35813d;
        if (interfaceC4951s2 == null) {
            this.f36338f.zzj().C().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f36333a) {
            AbstractC7901p.l(this.f36334b);
            this.f36338f.I(interfaceC4951s2, this.f36335c ? null : this.f36336d, this.f36334b);
        } else {
            boolean zP = this.f36338f.a().p(N.f36050U0);
            try {
                if (TextUtils.isEmpty(this.f36337e)) {
                    AbstractC7901p.l(this.f36334b);
                    if (zP) {
                        jA = this.f36338f.f36331a.zzb().a();
                        try {
                            jC = this.f36338f.f36331a.zzb().c();
                        } catch (RemoteException e10) {
                            e = e10;
                            jC = 0;
                            j10 = jA;
                            this.f36338f.zzj().C().b("Failed to send event to the service", e);
                            if (zP) {
                                J2.a(this.f36338f.f36331a).b(36301, 13, j10, this.f36338f.f36331a.zzb().a(), (int) (this.f36338f.f36331a.zzb().c() - jC));
                            }
                            this.f36338f.m0();
                        }
                    } else {
                        jA = 0;
                        jC = 0;
                    }
                    try {
                        interfaceC4951s2.X(this.f36336d, this.f36334b);
                        if (zP) {
                            this.f36338f.zzj().G().a("Logging telemetry for logEvent");
                            J2.a(this.f36338f.f36331a).b(36301, 0, jA, this.f36338f.f36331a.zzb().a(), (int) (this.f36338f.f36331a.zzb().c() - jC));
                        }
                    } catch (RemoteException e11) {
                        e = e11;
                        j10 = jA;
                        this.f36338f.zzj().C().b("Failed to send event to the service", e);
                        if (zP && j10 != 0) {
                            J2.a(this.f36338f.f36331a).b(36301, 13, j10, this.f36338f.f36331a.zzb().a(), (int) (this.f36338f.f36331a.zzb().c() - jC));
                        }
                        this.f36338f.m0();
                    }
                } else {
                    interfaceC4951s2.j0(this.f36336d, this.f36337e, this.f36338f.zzj().K());
                }
            } catch (RemoteException e12) {
                e = e12;
                jC = 0;
                j10 = 0;
            }
        }
        this.f36338f.m0();
    }
}
