package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189g4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14196c;

    /* renamed from: d, reason: collision with root package name */
    public int f14197d;

    /* renamed from: e, reason: collision with root package name */
    public String f14198e;

    public C1189g4(int i, int i3, int i6) {
        this.f14194a = i != Integer.MIN_VALUE ? AbstractC2763b.d(i, "/", new StringBuilder(String.valueOf(i).length() + 1)) : "";
        this.f14195b = i3;
        this.f14196c = i6;
        this.f14197d = LinearLayoutManager.INVALID_OFFSET;
        this.f14198e = "";
    }

    public final void a() {
        int i = this.f14197d;
        int i3 = i == Integer.MIN_VALUE ? this.f14195b : i + this.f14196c;
        this.f14197d = i3;
        int length = String.valueOf(i3).length();
        String str = this.f14194a;
        this.f14198e = A.f.i(i3, str, new StringBuilder(str.length() + length));
    }

    public final void b() {
        if (this.f14197d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
