package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1213gb {

    /* renamed from: a, reason: collision with root package name */
    public final int f14273a;

    /* renamed from: b, reason: collision with root package name */
    public final C2108x8 f14274b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14275c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14276d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f14277e;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public C1213gb(C2108x8 c2108x8, boolean z6, int[] iArr, boolean[] zArr) {
        int i = c2108x8.f17546a;
        this.f14273a = i;
        AbstractC0582Jp.m(i == iArr.length && i == zArr.length);
        this.f14274b = c2108x8;
        this.f14275c = z6 && i > 1;
        this.f14276d = (int[]) iArr.clone();
        this.f14277e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1213gb.class == obj.getClass()) {
            C1213gb c1213gb = (C1213gb) obj;
            if (this.f14275c == c1213gb.f14275c && this.f14274b.equals(c1213gb.f14274b) && Arrays.equals(this.f14276d, c1213gb.f14276d) && Arrays.equals(this.f14277e, c1213gb.f14277e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14277e) + ((Arrays.hashCode(this.f14276d) + (((this.f14274b.hashCode() * 31) + (this.f14275c ? 1 : 0)) * 31)) * 31);
    }
}
