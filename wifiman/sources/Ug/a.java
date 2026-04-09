package Ug;

import android.R;
import com.google.ar.core.ImageMetadata;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f22440d = {-128, 64, BER.ASN_CONSTRUCTOR, BER.ASN_SEQUENCE, 8, 4, 2, 1};

    /* renamed from: e, reason: collision with root package name */
    private static int[] f22441e = {8388608, 4194304, 2097152, ImageMetadata.SHADING_MODE, ImageMetadata.LENS_APERTURE, 262144, 131072, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, 32768, TLSTM.TLS_MAX_FRAGMENT_SIZE, 8192, 4096, 2048, 1024, 512, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: f, reason: collision with root package name */
    private static byte[] f22442f = {56, BER.SEQUENCE, 40, BER.ASN_CONSTRUCTOR, 24, BER.ASN_SEQUENCE, 8, 0, 57, 49, 41, 33, 25, BER.ASN_SET, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, 19, 11, 3};

    /* renamed from: g, reason: collision with root package name */
    private static int[] f22443g = {1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28};

    /* renamed from: h, reason: collision with root package name */
    private static byte[] f22444h = {13, BER.ASN_SEQUENCE, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, BER.ASN_CONSTRUCTOR, 47, 43, BER.SEQUENCE, 38, 55, 33, 52, 45, 41, 49, 35, 28, BER.ASN_EXTENSION_ID};

    /* renamed from: i, reason: collision with root package name */
    private static int[] f22445i = {R.attr.transitionName, 0, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, R.attr.fillColor, R.attr.manageSpaceActivity, 66564, 4, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, 1024, R.attr.transitionName, R.attr.fillColor, 1024, 16778244, R.attr.manageSpaceActivity, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, R.attr.theme, R.attr.theme, 16778244, ImageMetadata.CONTROL_AE_REGIONS, 16777220, 16777220, ImageMetadata.CONTROL_AE_REGIONS, 0, 1028, 66564, 16777216, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, R.attr.fillColor, 4, R.attr.theme, R.attr.transitionName, 16777216, 16777216, 1024, R.attr.manageSpaceActivity, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, 66560, 16777220, 1024, 4, 16778244, 66564, R.attr.fillColor, ImageMetadata.CONTROL_AE_REGIONS, R.attr.theme, 16778244, 16777220, 1028, 66564, R.attr.transitionName, 1028, 16778240, 16778240, 0, ImageMetadata.CONTROL_AE_REGIONS, 66560, 0, R.attr.manageSpaceActivity};

    /* renamed from: j, reason: collision with root package name */
    private static int[] f22446j = {-2146402272, -2147450880, 32768, 1081376, ImageMetadata.SHADING_MODE, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, PduHandle.NONE, -2147450880, ImageMetadata.SHADING_MODE, 32, -2146435040, 1081344, 1048608, -2147450848, 0, PduHandle.NONE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, ImageMetadata.SHADING_MODE, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, PduHandle.NONE, 32800, -2146402304, ImageMetadata.SHADING_MODE, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, PduHandle.NONE, -2146435040, -2146402272, 1081344};

    /* renamed from: k, reason: collision with root package name */
    private static int[] f22447k = {520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584};

    /* renamed from: l, reason: collision with root package name */
    private static int[] f22448l = {8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928};

    /* renamed from: m, reason: collision with root package name */
    private static int[] f22449m = {PSKKeyManager.MAX_KEY_LENGTH_BYTES, 34078976, 34078720, 1107296512, ImageMetadata.LENS_APERTURE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 1073741824, 34078720, 1074266368, ImageMetadata.LENS_APERTURE, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, ImageMetadata.LENS_APERTURE, 1107296512, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, ImageMetadata.LENS_APERTURE, 0, 1074266112, 34078976, 1073742080};

    /* renamed from: n, reason: collision with root package name */
    private static int[] f22450n = {536870928, 541065216, TLSTM.TLS_MAX_FRAGMENT_SIZE, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, TLSTM.TLS_MAX_FRAGMENT_SIZE, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, TLSTM.TLS_MAX_FRAGMENT_SIZE, 541065216, 4210704, TLSTM.TLS_MAX_FRAGMENT_SIZE, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312};

    /* renamed from: o, reason: collision with root package name */
    private static int[] f22451o = {2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154};

    /* renamed from: p, reason: collision with root package name */
    private static int[] f22452p = {268439616, 4096, 262144, 268701760, SQLiteDatabase.CREATE_IF_NECESSARY, 268439616, 64, SQLiteDatabase.CREATE_IF_NECESSARY, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, SQLiteDatabase.CREATE_IF_NECESSARY, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, SQLiteDatabase.CREATE_IF_NECESSARY, 268701696};

    /* renamed from: a, reason: collision with root package name */
    private int[] f22453a = new int[32];

    /* renamed from: b, reason: collision with root package name */
    private int[] f22454b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int[] f22455c = new int[2];

    public a(byte[] bArr) {
        if (bArr.length != 7) {
            g(bArr);
            return;
        }
        byte[] bArr2 = new byte[8];
        f(bArr, bArr2);
        g(bArr2);
    }

    private void a(int[] iArr, int[] iArr2) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            i10 += 2;
            int i15 = iArr[i13];
            int i16 = (i14 & 16515072) << 6;
            iArr2[i11] = i16;
            int i17 = i16 | ((i14 & 4032) << 10);
            iArr2[i11] = i17;
            int i18 = ((16515072 & i15) >>> 10) | i17;
            iArr2[i11] = i18;
            iArr2[i11] = i18 | ((i15 & 4032) >>> 6);
            int i19 = i11 + 1;
            int i20 = (i14 & 258048) << 12;
            iArr2[i19] = i20;
            int i21 = ((i14 & 63) << 16) | i20;
            iArr2[i19] = i21;
            int i22 = i21 | ((i15 & 258048) >>> 4);
            iArr2[i19] = i22;
            iArr2[i19] = i22 | (i15 & 63);
            i11 += 2;
        }
    }

    private void b(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = ((i10 >>> 4) ^ i11) & 252645135;
        int i13 = i11 ^ i12;
        int i14 = i10 ^ (i12 << 4);
        int i15 = ((i14 >>> 16) ^ i13) & 65535;
        int i16 = i13 ^ i15;
        int i17 = i14 ^ (i15 << 16);
        int i18 = ((i16 >>> 2) ^ i17) & 858993459;
        int i19 = i17 ^ i18;
        int i20 = i16 ^ (i18 << 2);
        int i21 = ((i20 >>> 8) ^ i19) & 16711935;
        int i22 = i19 ^ i21;
        int i23 = i20 ^ (i21 << 8);
        int i24 = ((i23 >>> 31) & 1) | (i23 << 1);
        int i25 = (i22 ^ i24) & (-1431655766);
        int i26 = i22 ^ i25;
        int i27 = i24 ^ i25;
        int i28 = ((i26 >>> 31) & 1) | (i26 << 1);
        int i29 = 0;
        for (int i30 = 0; i30 < 8; i30++) {
            int i31 = ((i27 << 28) | (i27 >>> 4)) ^ iArr3[i29];
            int[] iArr4 = f22451o;
            int i32 = iArr4[i31 & 63];
            int[] iArr5 = f22449m;
            int i33 = i32 | iArr5[(i31 >>> 8) & 63];
            int[] iArr6 = f22447k;
            int i34 = i33 | iArr6[(i31 >>> 16) & 63];
            int[] iArr7 = f22445i;
            int i35 = iArr7[(i31 >>> 24) & 63] | i34;
            int i36 = iArr3[i29 + 1] ^ i27;
            int[] iArr8 = f22452p;
            int i37 = i35 | iArr8[i36 & 63];
            int[] iArr9 = f22450n;
            int i38 = i37 | iArr9[(i36 >>> 8) & 63];
            int[] iArr10 = f22448l;
            int i39 = i38 | iArr10[(i36 >>> 16) & 63];
            int[] iArr11 = f22446j;
            i28 ^= i39 | iArr11[(i36 >>> 24) & 63];
            int i40 = i29 + 3;
            int i41 = ((i28 << 28) | (i28 >>> 4)) ^ iArr3[i29 + 2];
            int i42 = iArr7[(i41 >>> 24) & 63] | iArr4[i41 & 63] | iArr5[(i41 >>> 8) & 63] | iArr6[(i41 >>> 16) & 63];
            i29 += 4;
            int i43 = iArr3[i40] ^ i28;
            i27 ^= (((i42 | iArr8[i43 & 63]) | iArr9[(i43 >>> 8) & 63]) | iArr10[(i43 >>> 16) & 63]) | iArr11[(i43 >>> 24) & 63];
        }
        int i44 = (i27 >>> 1) | (i27 << 31);
        int i45 = (i28 ^ i44) & (-1431655766);
        int i46 = i28 ^ i45;
        int i47 = i44 ^ i45;
        int i48 = (i46 >>> 1) | (i46 << 31);
        int i49 = ((i48 >>> 8) ^ i47) & 16711935;
        int i50 = i47 ^ i49;
        int i51 = i48 ^ (i49 << 8);
        int i52 = ((i51 >>> 2) ^ i50) & 858993459;
        int i53 = i50 ^ i52;
        int i54 = i51 ^ (i52 << 2);
        int i55 = ((i53 >>> 16) ^ i54) & 65535;
        int i56 = i54 ^ i55;
        int i57 = i53 ^ (i55 << 16);
        int i58 = ((i57 >>> 4) ^ i56) & 252645135;
        iArr2[0] = i57 ^ (i58 << 4);
        iArr2[1] = i56 ^ i58;
    }

    private void c(byte[] bArr, boolean z10, int[] iArr) {
        int i10;
        int[] iArr2 = new int[56];
        int[] iArr3 = new int[56];
        int[] iArr4 = new int[32];
        int i11 = 0;
        while (true) {
            int i12 = 1;
            if (i11 >= 56) {
                break;
            }
            byte b10 = f22442f[i11];
            if ((bArr[b10 >>> 3] & f22440d[b10 & 7]) == 0) {
                i12 = 0;
            }
            iArr2[i11] = i12;
            i11++;
        }
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = z10 ? i13 << 1 : (15 - i13) << 1;
            int i15 = i14 + 1;
            iArr4[i15] = 0;
            iArr4[i14] = 0;
            int i16 = 0;
            while (true) {
                if (i16 >= 28) {
                    break;
                }
                int i17 = f22443g[i13] + i16;
                if (i17 < 28) {
                    iArr3[i16] = iArr2[i17];
                } else {
                    iArr3[i16] = iArr2[i17 - 28];
                }
                i16++;
            }
            for (i10 = 28; i10 < 56; i10++) {
                int i18 = f22443g[i13] + i10;
                if (i18 < 56) {
                    iArr3[i10] = iArr2[i18];
                } else {
                    iArr3[i10] = iArr2[i18 - 28];
                }
            }
            for (int i19 = 0; i19 < 24; i19++) {
                byte[] bArr2 = f22444h;
                if (iArr3[bArr2[i19]] != 0) {
                    iArr4[i14] = iArr4[i14] | f22441e[i19];
                }
                if (iArr3[bArr2[i19 + 24]] != 0) {
                    iArr4[i15] = iArr4[i15] | f22441e[i19];
                }
            }
        }
        a(iArr4, iArr);
    }

    private void d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        i(bArr, i10, this.f22455c, 0, 2);
        int[] iArr = this.f22455c;
        b(iArr, iArr, this.f22453a);
        h(this.f22455c, 0, bArr2, i11, 2);
    }

    public static void f(byte[] bArr, byte[] bArr2) {
        bArr2[0] = (byte) ((bArr[0] >> 1) & 255);
        bArr2[1] = (byte) ((((bArr[0] & 1) << 6) | (((bArr[1] & 255) >> 2) & 255)) & 255);
        bArr2[2] = (byte) ((((bArr[1] & 3) << 5) | (((bArr[2] & 255) >> 3) & 255)) & 255);
        bArr2[3] = (byte) ((((bArr[2] & 7) << 4) | (((bArr[3] & 255) >> 4) & 255)) & 255);
        bArr2[4] = (byte) ((((bArr[3] & 15) << 3) | (((bArr[4] & 255) >> 5) & 255)) & 255);
        bArr2[5] = (byte) ((((bArr[4] & BER.ASN_EXTENSION_ID) << 2) | (((bArr[5] & 255) >> 6) & 255)) & 255);
        bArr2[6] = (byte) ((((bArr[5] & 63) << 1) | (((bArr[6] & 255) >> 7) & 255)) & 255);
        bArr2[7] = (byte) (bArr[6] & 127);
        for (int i10 = 0; i10 < 8; i10++) {
            bArr2[i10] = (byte) (bArr2[i10] << 1);
        }
    }

    public static void h(int[] iArr, int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 4) + i11;
            int i15 = iArr[i10 + i13];
            bArr[i14] = (byte) (i15 >>> 24);
            bArr[i14 + 1] = (byte) (i15 >>> 16);
            bArr[i14 + 2] = (byte) (i15 >>> 8);
            bArr[i14 + 3] = (byte) i15;
        }
    }

    public static void i(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = (i13 * 4) + i10;
            iArr[i11 + i13] = (bArr[i14 + 3] & 255) | ((bArr[i14] & 255) << 24) | ((bArr[i14 + 1] & 255) << 16) | ((bArr[i14 + 2] & 255) << 8);
        }
    }

    public void e(byte[] bArr, byte[] bArr2) {
        d(bArr, 0, bArr2, 0);
    }

    public void g(byte[] bArr) {
        c(bArr, true, this.f22453a);
        c(bArr, false, this.f22454b);
    }
}
