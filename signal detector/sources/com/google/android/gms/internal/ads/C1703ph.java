package com.google.android.gms.internal.ads;

import j$.util.Objects;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1703ph {

    /* renamed from: e, reason: collision with root package name */
    public static final C1703ph f16196e = new C1703ph(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f16197a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16198b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16199c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16200d;

    public C1703ph(int i, int i3, int i6) {
        this.f16197a = i;
        this.f16198b = i3;
        this.f16199c = i6;
        this.f16200d = Vt.a(i6) ? Vt.d(i6) * i3 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1703ph)) {
            return false;
        }
        C1703ph c1703ph = (C1703ph) obj;
        return this.f16197a == c1703ph.f16197a && this.f16198b == c1703ph.f16198b && this.f16199c == c1703ph.f16199c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16197a), Integer.valueOf(this.f16198b), Integer.valueOf(this.f16199c));
    }

    public final String toString() {
        int i = this.f16197a;
        int length = String.valueOf(i).length();
        int i3 = this.f16198b;
        int length2 = String.valueOf(i3).length();
        int i6 = this.f16199c;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i6).length() + 1);
        AbstractC2763b.h(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i3);
        return A.f.n(sb, ", encoding=", i6, "]");
    }
}
