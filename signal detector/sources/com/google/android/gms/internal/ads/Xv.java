package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Xv implements B3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12519a;

    public Xv(int i) {
        this.f12519a = i;
    }

    @Override // com.google.android.gms.internal.ads.B3
    public final /* synthetic */ void a(O2 o22) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Xv) && this.f12519a == ((Xv) obj).f12519a;
    }

    public final int hashCode() {
        return this.f12519a;
    }

    public final String toString() {
        int i = this.f12519a;
        return A.f.i(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
