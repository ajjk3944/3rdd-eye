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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hy implements l91 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12013a;

    /* renamed from: b, reason: collision with root package name */
    public final pe1 f12014b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12015c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12016d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12017e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f12018f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f12019h;

    /* renamed from: i, reason: collision with root package name */
    public volatile ei f12020i;
    public boolean j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12021k = false;

    /* renamed from: l, reason: collision with root package name */
    public gb1 f12022l;

    public hy(Context context, pe1 pe1Var, String str, int i4) {
        this.f12013a = context;
        this.f12014b = pe1Var;
        this.f12015c = str;
        this.f12016d = i4;
        new AtomicLong(-1L);
        this.f12017e = ((Boolean) va.s.f36163e.f36166c.a(sk.f16237n2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Map A1() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final long a(gb1 gb1Var) throws IOException {
        if (this.g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.g = true;
        Uri uri = gb1Var.f11479a;
        this.f12019h = uri;
        this.f12022l = gb1Var;
        this.f12020i = ei.a(uri);
        pk pkVar = sk.f16039a5;
        va.s sVar = va.s.f36163e;
        bi biVarJ = null;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            if (this.f12020i != null) {
                this.f12020i.f10799h = gb1Var.f11481c;
                ei eiVar = this.f12020i;
                String str = this.f12015c;
                eiVar.f10800i = str != null ? str : "";
                this.f12020i.j = this.f12016d;
                biVarJ = ua.j.C.j.j(this.f12020i);
            }
            if (biVarJ != null && biVarJ.a()) {
                this.j = biVarJ.i();
                this.f12021k = biVarJ.f();
                if (!c()) {
                    this.f12018f = biVarJ.c();
                    return -1L;
                }
            }
        } else if (this.f12020i != null) {
            this.f12020i.f10799h = gb1Var.f11481c;
            ei eiVar2 = this.f12020i;
            String str2 = this.f12015c;
            eiVar2.f10800i = str2 != null ? str2 : "";
            this.f12020i.j = this.f12016d;
            long jLongValue = (this.f12020i.g ? (Long) sVar.f36166c.a(sk.f16073c5) : (Long) sVar.f36166c.a(sk.f16056b5)).longValue();
            ua.j.C.f35267k.getClass();
            SystemClock.elapsedRealtime();
            gi giVarR = w5.r(this.f12013a, this.f12020i);
            try {
                try {
                    try {
                        ji jiVar = (ji) giVarR.f11625a.get(jLongValue, TimeUnit.MILLISECONDS);
                        jiVar.getClass();
                        this.j = jiVar.f12752c;
                        this.f12021k = jiVar.f12754e;
                        if (!c()) {
                            this.f12018f = jiVar.f12750a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        giVarR.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    giVarR.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            ua.j.C.f35267k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.f12020i != null) {
            Map map = gb1Var.f11480b;
            long j = gb1Var.f11481c;
            long j8 = gb1Var.f11482d;
            int i4 = gb1Var.f11483e;
            Uri uri2 = Uri.parse(this.f12020i.f10793a);
            mq0.e0(uri2, "The uri must be set.");
            this.f12022l = new gb1(uri2, map, j, j8, i4);
        }
        return this.f12014b.a(this.f12022l);
    }

    public final boolean c() {
        if (!this.f12017e) {
            return false;
        }
        pk pkVar = sk.f16089d5;
        va.s sVar = va.s.f36163e;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() || this.j) {
            return ((Boolean) sVar.f36166c.a(sk.f16104e5)).booleanValue() && !this.f12021k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vs1
    public final int d(int i4, int i10, byte[] bArr) throws IOException {
        if (!this.g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f12018f;
        return inputStream != null ? inputStream.read(bArr, i4, i10) : this.f12014b.d(i4, i10, bArr);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void f() throws IOException {
        if (!this.g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.g = false;
        this.f12019h = null;
        InputStream inputStream = this.f12018f;
        if (inputStream == null) {
            this.f12014b.f();
        } else {
            tb.b.d(inputStream);
            this.f12018f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final Uri zzc() {
        return this.f12019h;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void b(hm1 hm1Var) {
    }
}
