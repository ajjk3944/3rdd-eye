package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class LK extends AbstractC1896tC {

    /* renamed from: b, reason: collision with root package name */
    public int f9652b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QK f9654d;

    public LK(QK qk) {
        super(1);
        this.f9654d = qk;
        this.f9652b = 0;
        this.f9653c = qk.f();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC
    public final byte a() {
        int i = this.f9652b;
        if (i >= this.f9653c) {
            throw new NoSuchElementException();
        }
        this.f9652b = i + 1;
        return this.f9654d.e(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9652b < this.f9653c;
    }
}
