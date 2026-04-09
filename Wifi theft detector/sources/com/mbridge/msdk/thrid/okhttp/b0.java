package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class b0 implements Closeable {

    public static class a extends b0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f17501a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f17502b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.e f17503c;

        public a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
            this.f17501a = uVar;
            this.f17502b = j10;
            this.f17503c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.f17502b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        @Nullable
        public u l() {
            return this.f17501a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public com.mbridge.msdk.thrid.okio.e m() {
            return this.f17503c;
        }
    }

    public static b0 a(@Nullable u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    private Charset h() {
        u uVarL = l();
        return uVarL != null ? uVarL.a(com.mbridge.msdk.thrid.okhttp.internal.c.f17635j) : com.mbridge.msdk.thrid.okhttp.internal.c.f17635j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public abstract long k();

    @Nullable
    public abstract u l();

    public abstract com.mbridge.msdk.thrid.okio.e m();

    public final String n() throws IOException {
        com.mbridge.msdk.thrid.okio.e eVarM = m();
        try {
            return eVarM.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM);
        }
    }

    public static b0 a(@Nullable u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(uVar, j10, eVar);
        }
        throw new NullPointerException("source == null");
    }
}
