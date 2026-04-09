package defpackage;

import java.security.SecureRandom;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l00 implements Cloneable {
    public static final SecureRandom i = new SecureRandom();
    public int f;
    public int g;
    public int[] h;

    public l00(int i2) {
        if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException("DNS message ID " + i2 + " is out of range");
        }
        this.h = new int[4];
        this.g = 0;
        this.f = i2;
    }

    public static void a(int i2) {
        if (i2 >= 0 && i2 <= 15) {
            ou.a.d(i2);
            if ((i2 < 1 || i2 > 4) && i2 < 12) {
                return;
            }
        }
        throw new IllegalArgumentException(ex0.f("invalid flag bit ", i2));
    }

    public static boolean c(int i2, int i3) {
        a(i3);
        return (i2 & (1 << (15 - i3))) != 0;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l00 clone() {
        l00 l00Var = (l00) super.clone();
        l00Var.f = this.f;
        l00Var.g = this.g;
        int[] iArr = new int[l00Var.h.length];
        l00Var.h = iArr;
        int[] iArr2 = this.h;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        return l00Var;
    }

    public final int d() {
        return (this.g >> 11) & 15;
    }

    public final void e() {
        this.g &= 34815;
    }

    public final String f(int i2) {
        StringBuilder sb = new StringBuilder(";; ->>HEADER<<- opcode: ");
        sb.append(oj0.a.e(d()));
        sb.append(", status: ");
        sb.append(pn0.a.e(i2));
        sb.append(", id: ");
        sb.append(this.f);
        sb.append("\n;; flags: ");
        for (int i3 = 0; i3 < 16; i3++) {
            if (i3 >= 0 && i3 <= 15) {
                ue0 ue0Var = ou.a;
                ue0Var.d(i3);
                if ((i3 < 1 || i3 > 4) && i3 < 12 && c(this.g, i3)) {
                    sb.append(ue0Var.e(i3));
                    sb.append(" ");
                }
            }
        }
        sb.append("; ");
        for (int i4 = 0; i4 < 4; i4++) {
            sb.append(tt0.a.e(i4));
            sb.append(": ");
            sb.append(this.h[i4]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public final String toString() {
        return f(this.g & 15);
    }
}
