package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2020vb {

    /* renamed from: b, reason: collision with root package name */
    public static final C2020vb f17275b;

    /* renamed from: a, reason: collision with root package name */
    public final LB f17276a;

    static {
        JB jb = LB.f9635b;
        f17275b = new C2020vb(C1197gC.f14227e);
        String str = Vt.f12096a;
        Integer.toString(0, 36);
    }

    public C2020vb(C1197gC c1197gC) {
        this.f17276a = LB.m(c1197gC);
    }

    public final boolean a(int i) {
        int i3 = 0;
        while (true) {
            LB lb = this.f17276a;
            if (i3 >= lb.size()) {
                return false;
            }
            C1213gb c1213gb = (C1213gb) lb.get(i3);
            boolean[] zArr = c1213gb.f14277e;
            int length = zArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (!zArr[i6]) {
                    i6++;
                } else if (c1213gb.f14274b.f17548c == i) {
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2020vb.class != obj.getClass()) {
            return false;
        }
        return this.f17276a.equals(((C2020vb) obj).f17276a);
    }

    public final int hashCode() {
        return this.f17276a.hashCode();
    }
}
