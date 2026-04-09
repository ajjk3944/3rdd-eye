package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class RO {

    /* renamed from: d, reason: collision with root package name */
    public static final RO f10906d = new C1347j2().b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10907a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10908b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10909c;

    public /* synthetic */ RO(C1347j2 c1347j2) {
        this.f10907a = c1347j2.f14862a;
        this.f10908b = c1347j2.f14863b;
        this.f10909c = c1347j2.f14864c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RO.class != obj.getClass()) {
            return false;
        }
        RO ro = (RO) obj;
        return this.f10907a == ro.f10907a && this.f10908b == ro.f10908b && this.f10909c == ro.f10909c;
    }

    public final int hashCode() {
        int i = (this.f10907a ? 1 : 0) << 2;
        boolean z6 = this.f10908b;
        return (z6 ? 1 : 0) + (z6 ? 1 : 0) + i + (this.f10909c ? 1 : 0);
    }
}
