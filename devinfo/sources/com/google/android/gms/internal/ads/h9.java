package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11775c;

    /* renamed from: d, reason: collision with root package name */
    public int f11776d;

    /* renamed from: e, reason: collision with root package name */
    public String f11777e;

    public h9(int i4, int i10, int i11) {
        this.f11773a = i4 != Integer.MIN_VALUE ? r5.c.j(i4, "/", new StringBuilder(String.valueOf(i4).length() + 1)) : "";
        this.f11774b = i10;
        this.f11775c = i11;
        this.f11776d = LinearLayoutManager.INVALID_OFFSET;
        this.f11777e = "";
    }

    public final void a() {
        int i4 = this.f11776d;
        int i10 = i4 == Integer.MIN_VALUE ? this.f11774b : i4 + this.f11775c;
        this.f11776d = i10;
        int length = String.valueOf(i10).length();
        String str = this.f11773a;
        this.f11777e = d.h.q(i10, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.f11776d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
