package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0841Zc implements w2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f12903a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12905c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12906d;

    public C0841Zc(HashSet hashSet, boolean z6, int i, boolean z7) {
        this.f12903a = hashSet;
        this.f12904b = z6;
        this.f12905c = i;
        this.f12906d = z7;
    }

    @Override // w2.f
    public final int a() {
        return this.f12905c;
    }

    @Override // w2.f
    public final boolean b() {
        return this.f12906d;
    }

    @Override // w2.f
    public final boolean c() {
        return this.f12904b;
    }

    @Override // w2.f
    public final Set d() {
        return this.f12903a;
    }
}
