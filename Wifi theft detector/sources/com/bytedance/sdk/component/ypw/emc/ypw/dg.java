package com.bytedance.sdk.component.ypw.emc.ypw;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public class dg implements Serializable, Comparable<dg> {
    transient int bw;
    final byte[] dg;
    transient String ycc;
    static final char[] emc = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Charset ypw = Charset.forName(C.UTF8_NAME);
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
        int i10 = this.bw;
        if (i10 != 0) {
            return i10;
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
        if (iEmc == -1) {
            if (this.dg.length <= 64) {
                return "[hex=" + ypw() + "]";
            }
            return "[size=" + this.dg.length + " hex=" + emc(0, 64).ypw() + "…]";
        }
        String strReplace = strEmc.substring(0, iEmc).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iEmc >= strEmc.length()) {
            return "[text=" + strReplace + "]";
        }
        return "[size=" + this.dg.length + " text=" + strReplace + "…]";
    }

    public int xq() {
        return this.dg.length;
    }

    public String ypw() {
        byte[] bArr = this.dg;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = emc;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
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

    public dg emc(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.dg;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.dg.length + ")");
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new dg(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte emc(int i10) {
        return this.dg[i10];
    }

    public boolean emc(int i10, dg dgVar, int i11, int i12) {
        return dgVar.emc(i11, this.dg, i10, i12);
    }

    public boolean emc(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.dg;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && zz.emc(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public int compareTo(dg dgVar) {
        int iXq = xq();
        int iXq2 = dgVar.xq();
        int iMin = Math.min(iXq, iXq2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iEmc = emc(i10) & 255;
            int iEmc2 = dgVar.emc(i10) & 255;
            if (iEmc != iEmc2) {
                return iEmc < iEmc2 ? -1 : 1;
            }
        }
        if (iXq == iXq2) {
            return 0;
        }
        return iXq < iXq2 ? -1 : 1;
    }

    public static int emc(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
