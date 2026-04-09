package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public class y4 implements Iterable, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final y4 f5268g = new y4(o5.f5149b);

    /* renamed from: a, reason: collision with root package name */
    public int f5269a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5270d;

    static {
        int i10 = u4.f5216a;
    }

    public y4(byte[] bArr) {
        bArr.getClass();
        this.f5270d = bArr;
    }

    public static y4 d(byte[] bArr, int i10, int i11) {
        e(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new y4(bArr2);
    }

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public byte a(int i10) {
        return this.f5270d[i10];
    }

    public byte b(int i10) {
        return this.f5270d[i10];
    }

    public int c() {
        return this.f5270d.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof y4) && c() == ((y4) obj).c()) {
            if (c() == 0) {
                return true;
            }
            if (!(obj instanceof y4)) {
                return obj.equals(this);
            }
            y4 y4Var = (y4) obj;
            int i10 = this.f5269a;
            int i11 = y4Var.f5269a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int iC = c();
                if (iC > y4Var.c()) {
                    int iC2 = c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 18 + String.valueOf(iC2).length());
                    sb2.append("Length too large: ");
                    sb2.append(iC);
                    sb2.append(iC2);
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (iC <= y4Var.c()) {
                    byte[] bArr = y4Var.f5270d;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < iC) {
                        if (this.f5270d[i12] == bArr[i13]) {
                            i12++;
                            i13++;
                        }
                    }
                    return true;
                }
                int iC3 = y4Var.c();
                StringBuilder sb3 = new StringBuilder(String.valueOf(iC).length() + 27 + String.valueOf(iC3).length());
                sb3.append("Ran off end of other: 0, ");
                sb3.append(iC);
                sb3.append(", ");
                sb3.append(iC3);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f5269a;
        if (i10 != 0) {
            return i10;
        }
        int iC = c();
        int i11 = iC;
        for (int i12 = 0; i12 < iC; i12++) {
            i11 = (i11 * 31) + this.f5270d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f5269a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iC = c();
        if (c() <= 50) {
            strConcat = e5.Y(this);
        } else {
            int iE = e(0, 47, c());
            strConcat = e5.Y(iE == 0 ? f5268g : new x4(iE, this.f5270d)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(iC);
        sb2.append(" contents=\"");
        return w.g.j(sb2, strConcat, "\">");
    }
}
