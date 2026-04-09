package com.squareup.picasso;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f5954a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5955b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5956c;

    public o(InputStream inputStream, boolean z10, long j) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Stream may not be null.");
        }
        this.f5954a = inputStream;
        this.f5955b = z10;
        this.f5956c = j;
    }
}
