package a5;

import o4.AbstractC2763b;
import q5.i;

/* renamed from: a5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4754c;

    public C0277d(int i, String str, String str2) {
        this.f4752a = str;
        this.f4753b = str2;
        this.f4754c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0277d)) {
            return false;
        }
        C0277d c0277d = (C0277d) obj;
        return i.a(this.f4752a, c0277d.f4752a) && i.a(this.f4753b, c0277d.f4753b) && this.f4754c == c0277d.f4754c;
    }

    public final int hashCode() {
        return ((this.f4753b.hashCode() + (this.f4752a.hashCode() * 31)) * 31) + this.f4754c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NrBandInfo(band=");
        sb.append(this.f4752a);
        sb.append(", frequencyRange=");
        sb.append(this.f4753b);
        sb.append(", centerFreq=");
        return AbstractC2763b.d(this.f4754c, ")", sb);
    }
}
