package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class z {

    public static class a extends z {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f18140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f18141b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f18142c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f18143d;

        public a(u uVar, int i10, byte[] bArr, int i11) {
            this.f18140a = uVar;
            this.f18141b = i10;
            this.f18142c = bArr;
            this.f18143d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f18141b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        @Nullable
        public u b() {
            return this.f18140a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f18142c, this.f18143d, this.f18141b);
        }
    }

    public static z a(@Nullable u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    @Nullable
    public abstract u b();

    public static z a(@Nullable u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}
