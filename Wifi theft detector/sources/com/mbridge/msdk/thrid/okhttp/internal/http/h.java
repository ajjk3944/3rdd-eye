package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class h extends b0 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f17729a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17730b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f17731c;

    public h(@Nullable String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f17729a = str;
        this.f17730b = j10;
        this.f17731c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f17730b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f17729a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f17731c;
    }
}
