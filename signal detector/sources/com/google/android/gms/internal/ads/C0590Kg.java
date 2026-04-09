package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import f4.InterfaceFutureC2326a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590Kg extends AbstractC2003vB {

    /* renamed from: C, reason: collision with root package name */
    public boolean f9497C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9498D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9499E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9500F;

    /* renamed from: G, reason: collision with root package name */
    public long f9501G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceFutureC2326a f9502H;

    /* renamed from: I, reason: collision with root package name */
    public final AtomicLong f9503I;

    /* renamed from: e, reason: collision with root package name */
    public final Context f9504e;

    /* renamed from: f, reason: collision with root package name */
    public final XD f9505f;

    /* renamed from: g, reason: collision with root package name */
    public final L6 f9506g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9507h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f9508j;

    /* renamed from: k, reason: collision with root package name */
    public InputStream f9509k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9510l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f9511m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C1892t8 f9512n;

    public C0590Kg(Context context, XD xd, String str, int i, InterfaceC1958uK interfaceC1958uK, L6 l6) {
        super(false);
        this.f9504e = context;
        this.f9505f = xd;
        this.f9506g = l6;
        this.f9507h = str;
        this.i = i;
        this.f9497C = false;
        this.f9498D = false;
        this.f9499E = false;
        this.f9500F = false;
        this.f9501G = 0L;
        this.f9503I = new AtomicLong(-1L);
        this.f9502H = null;
        this.f9508j = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue();
        c(interfaceC1958uK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0240  */
    /* JADX WARN: Type inference failed for: r5v19, types: [p2.j] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // com.google.android.gms.internal.ads.XD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(com.google.android.gms.internal.ads.TE r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0590Kg.a(com.google.android.gms.internal.ads.TE):long");
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        if (!this.f9510l) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f9509k;
        int iD = inputStream != null ? inputStream.read(bArr, i, i3) : this.f9505f.d(i, i3, bArr);
        if (this.f9508j && this.f9509k == null) {
            return iD;
        }
        g(iD);
        return iD;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f9511m;
    }

    public final long k() {
        if (this.f9512n != null) {
            AtomicLong atomicLong = this.f9503I;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.f9502H == null) {
                        this.f9502H = AbstractC0640Nf.f10005a.b(new J6(3, this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f9502H.isDone()) {
                try {
                    this.f9503I.compareAndSet(-1L, ((Long) this.f9502H.get()).longValue());
                    return this.f9503I.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final boolean l() {
        if (!this.f9508j) {
            return false;
        }
        E9 e9 = H9.f8732d5;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || this.f9499E) {
            return ((Boolean) c2841s.f23270c.a(H9.f8739e5)).booleanValue() && !this.f9500F;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() throws IOException {
        if (!this.f9510l) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f9510l = false;
        this.f9511m = null;
        boolean z6 = (this.f9508j && this.f9509k == null) ? false : true;
        InputStream inputStream = this.f9509k;
        if (inputStream != null) {
            Q2.b.c(inputStream);
            this.f9509k = null;
        } else {
            this.f9505f.m();
        }
        if (z6) {
            j();
        }
    }
}
