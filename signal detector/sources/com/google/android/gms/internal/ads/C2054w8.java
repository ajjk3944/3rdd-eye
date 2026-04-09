package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2054w8 extends PushbackInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1338iu f17406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2054w8(C1338iu c1338iu, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.f17406a = c1338iu;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        ((A1.s) this.f17406a.f14824d).i();
        super.close();
    }
}
