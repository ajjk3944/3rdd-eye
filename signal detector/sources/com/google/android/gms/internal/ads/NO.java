package com.google.android.gms.internal.ads;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class NO {

    /* renamed from: d, reason: collision with root package name */
    public static final NO f9998d;

    /* renamed from: a, reason: collision with root package name */
    public final int f9999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10000b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f10001c;

    static {
        NO no;
        if (Build.VERSION.SDK_INT >= 33) {
            QB qb = new QB(4);
            for (int i = 1; i <= 10; i++) {
                qb.f(Integer.valueOf(Vt.b(i)));
            }
            no = new NO(2, qb.h());
        } else {
            no = new NO(2, 10);
        }
        f9998d = no;
    }

    public NO(int i, int i3) {
        this.f9999a = i;
        this.f10000b = i3;
        this.f10001c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NO)) {
            return false;
        }
        NO no = (NO) obj;
        return this.f9999a == no.f9999a && this.f10000b == no.f10000b && Objects.equals(this.f10001c, no.f10001c);
    }

    public final int hashCode() {
        RB rb = this.f10001c;
        return (((this.f9999a * 31) + this.f10000b) * 31) + (rb == null ? 0 : rb.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10001c);
        int i = this.f9999a;
        int length = String.valueOf(i).length();
        int i3 = this.f10000b;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i3).length() + 15 + strValueOf.length() + 1);
        AbstractC2763b.h(sb, "AudioProfile[format=", i, ", maxChannelCount=", i3);
        return AbstractC1135f5.n(sb, ", channelMasks=", strValueOf, "]");
    }

    public NO(int i, Set set) {
        this.f9999a = i;
        RB rbJ = RB.j(set);
        this.f10001c = rbJ;
        AbstractC1896tC abstractC1896tCA = rbJ.a();
        int iMax = 0;
        while (abstractC1896tCA.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) abstractC1896tCA.next()).intValue()));
        }
        this.f10000b = iMax;
    }
}
