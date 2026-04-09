package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Ar {

    /* renamed from: c, reason: collision with root package name */
    public static final Ar f7055c = new Ar(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f7056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7057b;

    static {
        new Ar(0, 0);
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public Ar(int i, int i3) {
        boolean z6 = false;
        if ((i == -1 || i >= 0) && (i3 == -1 || i3 >= 0)) {
            z6 = true;
        }
        AbstractC0582Jp.m(z6);
        this.f7056a = i;
        this.f7057b = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ar) {
            Ar ar = (Ar) obj;
            if (this.f7056a == ar.f7056a && this.f7057b == ar.f7057b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7056a;
        return ((i >>> 16) | (i << 16)) ^ this.f7057b;
    }

    public final String toString() {
        int i = this.f7056a;
        int length = String.valueOf(i).length();
        int i3 = this.f7057b;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i3).length());
        sb.append(i);
        sb.append("x");
        sb.append(i3);
        return sb.toString();
    }
}
