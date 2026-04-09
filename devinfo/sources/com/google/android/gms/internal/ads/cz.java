package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cz extends h41 {

    /* renamed from: e, reason: collision with root package name */
    public final Context f10263e;

    /* renamed from: f, reason: collision with root package name */
    public final l91 f10264f;
    public final ix0 g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10265h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10266i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public InputStream f10267k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10268l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f10269m;

    /* renamed from: n, reason: collision with root package name */
    public volatile ei f10270n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10271o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10272p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10273q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10274r;

    /* renamed from: s, reason: collision with root package name */
    public long f10275s;

    /* renamed from: t, reason: collision with root package name */
    public vd.b f10276t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f10277u;

    public cz(Context context, l91 l91Var, String str, int i4, hm1 hm1Var, ix0 ix0Var) {
        super(false);
        this.f10263e = context;
        this.f10264f = l91Var;
        this.g = ix0Var;
        this.f10265h = str;
        this.f10266i = i4;
        this.f10271o = false;
        this.f10272p = false;
        this.f10273q = false;
        this.f10274r = false;
        this.f10275s = 0L;
        this.f10277u = new AtomicLong(-1L);
        this.f10276t = null;
        this.j = ((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue();
        b(hm1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0240  */
    /* JADX WARN: Type inference failed for: r5v19, types: [ua.j] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // com.google.android.gms.internal.ads.l91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.gb1 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cz.a(com.google.android.gms.internal.ads.gb1):long");
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        if (!this.f10268l) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f10267k;
        int iD = inputStream != null ? inputStream.read(bArr, i4, i10) : this.f10264f.d(i4, i10, bArr);
        if (this.j && this.f10267k == null) {
            return iD;
        }
        g(iD);
        return iD;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() throws IOException {
        if (!this.f10268l) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f10268l = false;
        this.f10269m = null;
        boolean z3 = (this.j && this.f10267k == null) ? false : true;
        InputStream inputStream = this.f10267k;
        if (inputStream != null) {
            tb.b.d(inputStream);
            this.f10267k = null;
        } else {
            this.f10264f.f();
        }
        if (z3) {
            h();
        }
    }

    public final long i() {
        if (this.f10270n != null) {
            AtomicLong atomicLong = this.f10277u;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.f10276t == null) {
                        this.f10276t = fx.f11274a.e(new qe(3, this));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f10276t.isDone()) {
                try {
                    this.f10277u.compareAndSet(-1L, ((Long) this.f10276t.get()).longValue());
                    return this.f10277u.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean j() {
        if (!this.j) {
            return false;
        }
        pk pkVar = sk.f16089d5;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || this.f10273q) {
            return ((Boolean) sVar.f36166c.a(sk.f16104e5)).booleanValue() && !this.f10274r;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f10269m;
    }
}
