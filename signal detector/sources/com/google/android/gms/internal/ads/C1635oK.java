package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635oK extends AbstractC1527mK {

    /* renamed from: a, reason: collision with root package name */
    public final C2120xK f15933a = new C2120xK();

    public final AbstractC1527mK d(String str) {
        return (AbstractC1527mK) this.f15933a.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1635oK) && ((C1635oK) obj).f15933a.equals(this.f15933a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f15933a.hashCode();
    }
}
