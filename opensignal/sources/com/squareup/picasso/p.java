package com.squareup.picasso;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5969a;

    /* renamed from: d, reason: collision with root package name */
    public final int f5970d;

    public p(String str, int i10, int i11) {
        super(str);
        this.f5969a = x.isOfflineOnly(i10);
        this.f5970d = i11;
    }
}
