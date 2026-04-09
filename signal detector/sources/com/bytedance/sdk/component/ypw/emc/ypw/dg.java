package com.bytedance.sdk.component.ypw.emc.ypw;

import A.f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class dg implements Serializable, Comparable<dg> {
    transient int bw;
    final byte[] dg;
    transient String ycc;
    static final char[] emc = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset ypw = Charset.forName("UTF-8");
    public static final dg xq = emc(new byte[0]);

    public dg(byte[] bArr) {
        this.dg = bArr;
    }

    public static dg emc(byte... bArr) {
        if (bArr != null) {
            return new dg((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public byte[] dg() {
        return (byte[]) this.dg.clone();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dg) {
            dg dgVar = (dg) obj;
            int iXq = dgVar.xq();
            byte[] bArr = this.dg;
            if (iXq == bArr.length && dgVar.emc(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.bw;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.dg);
        this.bw = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (this.dg.length == 0) {
            return "[size=0]";
        }
        String strEmc = emc();
        int iEmc = emc(strEmc, 64);
        if (iEmc != -1) {
            String strReplace = strEmc.substring(0, iEmc).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iEmc >= strEmc.length()) {
                return f.m("[text=", strReplace, "]");
            }
            return "[size=" + this.dg.length + " text=" + strReplace + "…]";
        }
        if (this.dg.length <= 64) {
            return "[hex=" + ypw() + "]";
        }
        return "[size=" + this.dg.length + " hex=" + emc(0, 64).ypw() + "…]";
    }

    public int xq() {
        return this.dg.length;
    }

    public String ypw() {
        byte[] bArr = this.dg;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b5 : bArr) {
            int i3 = i + 1;
            char[] cArr2 = emc;
            cArr[i] = cArr2[(b5 >> 4) & 15];
            i += 2;
            cArr[i3] = cArr2[b5 & 15];
        }
        return new String(cArr);
    }

    public String emc() {
        String str = this.ycc;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.dg, ypw);
        this.ycc = str2;
        return str2;
    }

    public dg emc(int i, int i3) {
        if (i >= 0) {
            byte[] bArr = this.dg;
            if (i3 > bArr.length) {
                throw new IllegalArgumentException(AbstractC2763b.d(this.dg.length, ")", new StringBuilder("endIndex > length(")));
            }
            int i6 = i3 - i;
            if (i6 >= 0) {
                if (i == 0 && i3 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i, bArr2, 0, i6);
                return new dg(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte emc(int i) {
        return this.dg[i];
    }

    public boolean emc(int i, dg dgVar, int i3, int i6) {
        return dgVar.emc(i3, this.dg, i, i6);
    }

    public boolean emc(int i, byte[] bArr, int i3, int i6) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.dg;
        return i <= bArr2.length - i6 && i3 >= 0 && i3 <= bArr.length - i6 && zz.emc(bArr2, i, bArr, i3, i6);
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(dg dgVar) {
        int iXq = xq();
        int iXq2 = dgVar.xq();
        int iMin = Math.min(iXq, iXq2);
        for (int i = 0; i < iMin; i++) {
            int iEmc = emc(i) & 255;
            int iEmc2 = dgVar.emc(i) & 255;
            if (iEmc != iEmc2) {
                return iEmc < iEmc2 ? -1 : 1;
            }
        }
        if (iXq == iXq2) {
            return 0;
        }
        return iXq < iXq2 ? -1 : 1;
    }

    public static int emc(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i3 = 0;
        while (iCharCount < length) {
            if (i3 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i3++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
