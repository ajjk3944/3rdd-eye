package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class SQ {

    /* renamed from: d, reason: collision with root package name */
    public static final SQ f11183d = new SQ(new C2108x8[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f11184a;

    /* renamed from: b, reason: collision with root package name */
    public final C1197gC f11185b;

    /* renamed from: c, reason: collision with root package name */
    public int f11186c;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
    }

    public SQ(C2108x8... c2108x8Arr) {
        this.f11185b = LB.n(c2108x8Arr);
        this.f11184a = c2108x8Arr.length;
        int i = 0;
        while (i < this.f11185b.f14229d) {
            int i3 = i + 1;
            int i6 = i3;
            while (true) {
                C1197gC c1197gC = this.f11185b;
                if (i6 < c1197gC.f14229d) {
                    if (((C2108x8) c1197gC.get(i)).equals(this.f11185b.get(i6))) {
                        AbstractC2022vd.K("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i6++;
                }
            }
            i = i3;
        }
    }

    public final C2108x8 a(int i) {
        return (C2108x8) this.f11185b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SQ.class != obj.getClass()) {
            return false;
        }
        SQ sq = (SQ) obj;
        return this.f11184a == sq.f11184a && this.f11185b.equals(sq.f11185b);
    }

    public final int hashCode() {
        int i = this.f11186c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f11185b.hashCode();
        this.f11186c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.f11185b.toString();
    }
}
