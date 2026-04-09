package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045dO {

    /* renamed from: a, reason: collision with root package name */
    public final long f13758a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13759b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13760c;

    public /* synthetic */ C1045dO(C0990cO c0990cO) {
        this.f13758a = c0990cO.f13552a;
        this.f13759b = c0990cO.f13553b;
        this.f13760c = c0990cO.f13554c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1045dO)) {
            return false;
        }
        C1045dO c1045dO = (C1045dO) obj;
        return this.f13758a == c1045dO.f13758a && this.f13759b == c1045dO.f13759b && this.f13760c == c1045dO.f13760c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f13758a), Float.valueOf(this.f13759b), Long.valueOf(this.f13760c));
    }
}
