package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class RL {

    /* renamed from: f, reason: collision with root package name */
    public static final RL f10898f = new RL(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f10899a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f10900b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10901c;

    /* renamed from: d, reason: collision with root package name */
    public int f10902d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10903e;

    public RL(int i, int[] iArr, Object[] objArr, boolean z6) {
        this.f10899a = i;
        this.f10900b = iArr;
        this.f10901c = objArr;
        this.f10903e = z6;
    }

    public static RL a() {
        return new RL(0, new int[8], new Object[8], true);
    }

    public final void b(C1014cu c1014cu) {
        VK vk = (VK) c1014cu.f13695b;
        if (this.f10899a != 0) {
            for (int i = 0; i < this.f10899a; i++) {
                int i3 = this.f10900b[i];
                Object obj = this.f10901c[i];
                int i6 = i3 & 7;
                int i7 = i3 >>> 3;
                if (i6 == 0) {
                    vk.Q(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    vk.S(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    vk.V(i7, (QK) obj);
                } else if (i6 == 3) {
                    vk.M(i7, 3);
                    ((RL) obj).b(c1014cu);
                    vk.M(i7, 4);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new C1582nL());
                    }
                    vk.P(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iJ;
        int iK;
        int iJ2;
        int i = this.f10902d;
        if (i != -1) {
            return i;
        }
        int iJ3 = 0;
        for (int i3 = 0; i3 < this.f10899a; i3++) {
            int i6 = this.f10900b[i3];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    ((Long) this.f10901c[i3]).getClass();
                    iJ2 = VK.J(i7 << 3) + 8;
                } else if (i8 == 2) {
                    int i9 = i7 << 3;
                    QK qk = (QK) this.f10901c[i3];
                    int iJ4 = VK.J(i9);
                    int iF = qk.f();
                    iJ3 = AbstractC1135f5.j(iF, iF, iJ4, iJ3);
                } else if (i8 == 3) {
                    int iJ5 = VK.J(i7 << 3);
                    iJ = iJ5 + iJ5;
                    iK = ((RL) this.f10901c[i3]).c();
                } else {
                    if (i8 != 5) {
                        throw new IllegalStateException(new C1582nL());
                    }
                    ((Integer) this.f10901c[i3]).getClass();
                    iJ2 = VK.J(i7 << 3) + 4;
                }
                iJ3 = iJ2 + iJ3;
            } else {
                int i10 = i7 << 3;
                long jLongValue = ((Long) this.f10901c[i3]).longValue();
                iJ = VK.J(i10);
                iK = VK.K(jLongValue);
            }
            iJ3 = iK + iJ + iJ3;
        }
        this.f10902d = iJ3;
        return iJ3;
    }

    public final void d(int i, Object obj) {
        if (!this.f10903e) {
            throw new UnsupportedOperationException();
        }
        e(this.f10899a + 1);
        int[] iArr = this.f10900b;
        int i3 = this.f10899a;
        iArr[i3] = i;
        this.f10901c[i3] = obj;
        this.f10899a = i3 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.f10900b;
        if (i > iArr.length) {
            int i3 = this.f10899a;
            int i6 = (i3 / 2) + i3;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f10900b = Arrays.copyOf(iArr, i);
            this.f10901c = Arrays.copyOf(this.f10901c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RL)) {
            return false;
        }
        RL rl = (RL) obj;
        int i = this.f10899a;
        if (i == rl.f10899a) {
            int[] iArr = this.f10900b;
            int[] iArr2 = rl.f10900b;
            int i3 = 0;
            while (true) {
                if (i3 >= i) {
                    Object[] objArr = this.f10901c;
                    Object[] objArr2 = rl.f10901c;
                    int i6 = this.f10899a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10899a;
        int i3 = i + 527;
        int[] iArr = this.f10900b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = ((i3 * 31) + i6) * 31;
        Object[] objArr = this.f10901c;
        int i9 = this.f10899a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
