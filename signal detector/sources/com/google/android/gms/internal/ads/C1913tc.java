package com.google.android.gms.internal.ads;

import android.util.Log;
import h0.C2351a;
import j1.C2544c;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import l1.InterfaceC2636b;
import l1.InterfaceC2639e;
import p1.InterfaceC2770a;

/* renamed from: com.google.android.gms.internal.ads.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1913tc implements InterfaceC2770a {

    /* renamed from: a, reason: collision with root package name */
    public final long f16933a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16934b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f16935c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16936d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16937e;

    public /* synthetic */ C1913tc(C0895ak c0895ak, ArrayList arrayList, long j6, C2021vc c2021vc, C1536mc c1536mc) {
        this.f16934b = c0895ak;
        this.f16935c = arrayList;
        this.f16933a = j6;
        this.f16936d = c2021vc;
        this.f16937e = c1536mc;
    }

    public synchronized C2544c a() {
        try {
            if (((C2544c) this.f16937e) == null) {
                this.f16937e = C2544c.n((File) this.f16935c, this.f16933a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C2544c) this.f16937e;
    }

    @Override // p1.InterfaceC2770a
    public void i(InterfaceC2639e interfaceC2639e, V2.e eVar) {
        p1.b bVarL;
        boolean z6;
        String strH = ((C2351a) this.f16934b).H(interfaceC2639e);
        V2.h hVar = (V2.h) this.f16936d;
        synchronized (hVar) {
            try {
                bVarL = (p1.b) ((HashMap) hVar.f3875b).get(strH);
                if (bVarL == null) {
                    bVarL = ((h2.d) hVar.f3876c).l();
                    ((HashMap) hVar.f3875b).put(strH, bVarL);
                }
                bVarL.f22736b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        bVarL.f22735a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strH + " for for Key: " + interfaceC2639e);
            }
            try {
                C2544c c2544cA = a();
                if (c2544cA.k(strH) == null) {
                    A1.s sVarE = c2544cA.e(strH);
                    if (sVarE == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strH));
                    }
                    try {
                        if (((InterfaceC2636b) eVar.f3868b).l(eVar.f3869c, sVarE.e(), (l1.h) eVar.f3870d)) {
                            C2544c.a((C2544c) sVarE.f125d, sVarE, true);
                            sVarE.f122a = true;
                        }
                        if (!z6) {
                            try {
                                sVarE.d();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!sVarE.f122a) {
                            try {
                                sVarE.d();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e6) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e6);
                }
            }
        } finally {
            ((V2.h) this.f16936d).w(strH);
        }
    }

    @Override // p1.InterfaceC2770a
    public File k(InterfaceC2639e interfaceC2639e) {
        String strH = ((C2351a) this.f16934b).H(interfaceC2639e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strH + " for for Key: " + interfaceC2639e);
        }
        try {
            h2.d dVarK = a().k(strH);
            if (dVarK != null) {
                return ((File[]) dVarK.f20472a)[0];
            }
            return null;
        } catch (IOException e6) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            return null;
        }
    }

    public C1913tc(File file) {
        this.f16936d = new V2.h(25);
        this.f16935c = file;
        this.f16933a = 262144000L;
        this.f16934b = new C2351a(28);
    }
}
