package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jg0 extends hg0 {
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public int f12744h;

    @Override // com.google.android.gms.internal.ads.hg0, pb.c
    public final void O(nb.b bVar) {
        za.i.c("Cannot connect to remote service, fallback to local instance.");
        this.f11858a.d(new og0(1));
    }

    @Override // pb.b
    public final void T() {
        synchronized (this.f11859b) {
            try {
                if (!this.f11861d) {
                    this.f11861d = true;
                    try {
                        try {
                            int i4 = this.f12744h;
                            if (i4 == 2) {
                                ((bu) this.f11863f.t()).o1(this.f11862e, ((Boolean) va.s.f36163e.f36166c.a(sk.f16201ke)).booleanValue() ? new gg0(this.f11858a, this.f11862e) : new fg0(this));
                            } else if (i4 == 3) {
                                ((bu) this.f11863f.t()).T3(this.g, ((Boolean) va.s.f36163e.f36166c.a(sk.f16201ke)).booleanValue() ? new gg0(this.f11858a, this.f11862e) : new fg0(this));
                            } else {
                                this.f11858a.d(new og0(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f11858a.d(new og0(1));
                        }
                    } catch (Throwable th2) {
                        ua.j.C.f35265h.f("RemoteUrlAndCacheKeyClientTask.onConnected", th2);
                        this.f11858a.d(new og0(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
