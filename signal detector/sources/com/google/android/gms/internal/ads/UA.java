package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class UA extends QA {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11617a;

    public UA(Object obj) {
        this.f11617a = obj;
    }

    @Override // com.google.android.gms.internal.ads.QA
    public final Object a() {
        return this.f11617a;
    }

    @Override // com.google.android.gms.internal.ads.QA
    public final QA b(NA na) {
        Object objApply = na.apply(this.f11617a);
        AbstractC0582Jp.j0(objApply, "the Function passed to Optional.transform() must not return null.");
        return new UA(objApply);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UA) {
            return this.f11617a.equals(((UA) obj).f11617a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11617a.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.f11617a.toString();
        return AbstractC1135f5.n(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }
}
