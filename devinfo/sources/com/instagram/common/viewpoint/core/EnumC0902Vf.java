package com.instagram.common.viewpoint.core;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC0902Vf {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC0902Vf[] A02;
    public static final EnumC0902Vf A03;
    public static final EnumC0902Vf A04;
    public static final EnumC0902Vf A05;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{88, 89, 90, 93, 73, 80, 72, 98, 107, 107, 2, 3};
    }

    static {
        A02();
        A03 = new EnumC0902Vf(A01(0, 7, 61), 0);
        A05 = new EnumC0902Vf(A01(10, 2, 108), 1);
        A04 = new EnumC0902Vf(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC0902Vf(String str, int i4) {
    }

    public static VideoAutoplayBehavior A00(@Nullable EnumC0902Vf enumC0902Vf) {
        if (enumC0902Vf == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (enumC0902Vf.ordinal()) {
            case 0:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 1:
                return VideoAutoplayBehavior.ON;
            case 2:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ EnumC0902Vf[] A03() {
        EnumC0902Vf[] enumC0902VfArr = new EnumC0902Vf[3];
        enumC0902VfArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC0902VfArr[1] = A05;
        enumC0902VfArr[2] = A04;
        return enumC0902VfArr;
    }

    public static EnumC0902Vf valueOf(String str) {
        return (EnumC0902Vf) Enum.valueOf(EnumC0902Vf.class, str);
    }

    public static EnumC0902Vf[] values() {
        return (EnumC0902Vf[]) A02.clone();
    }
}
