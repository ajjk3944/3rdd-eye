package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124xO {

    /* renamed from: b, reason: collision with root package name */
    public static final C2124xO f17587b = new C2124xO(new C1014cu(10));

    /* renamed from: a, reason: collision with root package name */
    public final RB f17588a;

    public C2124xO(C1014cu c1014cu) {
        this.f17588a = (RB) c1014cu.f13695b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2124xO) && this.f17588a.equals(((C2124xO) obj).f17588a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.f17588a, null, null, bool, bool, bool, bool, bool);
    }
}
