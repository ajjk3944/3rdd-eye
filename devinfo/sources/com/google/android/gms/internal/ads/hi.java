package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hi extends PushbackInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pq0 f11878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(pq0 pq0Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f11878a = pq0Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((b5.i0) this.f11878a.f15075d).l();
        super.close();
    }
}
