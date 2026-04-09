package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1702pg implements XD {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16185a;

    /* renamed from: b, reason: collision with root package name */
    public final CG f16186b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16188d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16189e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f16190f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16191g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f16192h;
    public volatile C1892t8 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16193j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16194k = false;

    /* renamed from: l, reason: collision with root package name */
    public TE f16195l;

    public C1702pg(Context context, CG cg, String str, int i) {
        this.f16185a = context;
        this.f16186b = cg;
        this.f16187c = str;
        this.f16188d = i;
        new AtomicLong(-1L);
        this.f16189e = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8792n2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final long a(TE te) throws IOException {
        if (this.f16191g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f16191g = true;
        Uri uri = te.f11361a;
        this.f16192h = uri;
        this.f16195l = te;
        this.i = C1892t8.a(uri);
        E9 e9 = H9.f8713a5;
        C2841s c2841s = C2841s.f23267e;
        C1731q8 c1731q8L = null;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            if (this.i != null) {
                this.i.f16865h = te.f11363c;
                C1892t8 c1892t8 = this.i;
                String str = this.f16187c;
                c1892t8.i = str != null ? str : "";
                this.i.f16866j = this.f16188d;
                c1731q8L = p2.j.f22785C.f22796j.l(this.i);
            }
            if (c1731q8L != null && c1731q8L.a()) {
                this.f16193j = c1731q8L.f();
                this.f16194k = c1731q8L.d();
                if (!b()) {
                    this.f16190f = c1731q8L.b();
                    return -1L;
                }
            }
        } else if (this.i != null) {
            this.i.f16865h = te.f11363c;
            C1892t8 c1892t82 = this.i;
            String str2 = this.f16187c;
            c1892t82.i = str2 != null ? str2 : "";
            this.i.f16866j = this.f16188d;
            long jLongValue = (this.i.f16864g ? (Long) c2841s.f23270c.a(H9.f8725c5) : (Long) c2841s.f23270c.a(H9.b5)).longValue();
            p2.j.f22785C.f22797k.getClass();
            SystemClock.elapsedRealtime();
            C2000v8 c2000v8P = C1994v2.p(this.f16185a, this.i);
            try {
                try {
                    try {
                        C2162y8 c2162y8 = (C2162y8) c2000v8P.f10212a.get(jLongValue, TimeUnit.MILLISECONDS);
                        c2162y8.getClass();
                        this.f16193j = c2162y8.f17686c;
                        this.f16194k = c2162y8.f17688e;
                        if (!b()) {
                            this.f16190f = c2162y8.f17684a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        c2000v8P.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    c2000v8P.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            p2.j.f22785C.f22797k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.i != null) {
            Map map = te.f11362b;
            long j6 = te.f11363c;
            long j7 = te.f11364d;
            int i = te.f11365e;
            Uri uri2 = Uri.parse(this.i.f16858a);
            AbstractC0582Jp.j0(uri2, "The uri must be set.");
            this.f16195l = new TE(uri2, map, j6, j7, i);
        }
        return this.f16186b.a(this.f16195l);
    }

    public final boolean b() {
        if (!this.f16189e) {
            return false;
        }
        E9 e9 = H9.f8732d5;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || this.f16193j) {
            return ((Boolean) c2841s.f23270c.a(H9.f8739e5)).booleanValue() && !this.f16194k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void c(InterfaceC1958uK interfaceC1958uK) {
    }

    @Override // com.google.android.gms.internal.ads.IN
    public final int d(int i, int i3, byte[] bArr) throws IOException {
        if (!this.f16191g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f16190f;
        return inputStream != null ? inputStream.read(bArr, i, i3) : this.f16186b.d(i, i3, bArr);
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Uri f() {
        return this.f16192h;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final Map h() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void m() throws IOException {
        if (!this.f16191g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f16191g = false;
        this.f16192h = null;
        InputStream inputStream = this.f16190f;
        if (inputStream == null) {
            this.f16186b.m();
        } else {
            Q2.b.c(inputStream);
            this.f16190f = null;
        }
    }
}
