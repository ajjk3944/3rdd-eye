package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class EnumC2935Uu {
    public static byte[] A00;
    public static String[] A01 = {"t11qfTcdRX3vtzWg9o3D7yzOQIlsgekI", "6i20agDhmSdy9vSyuA65WoFMQBMnYQqu", "rdyvRl0mnrLy9iBwCAplKJJzDaMabc0M", "SOZt7VgRETJYcVg4", "xbstiP5KKiAzncux", "VTcuBCbEWMb14OGNQVtfuGUmCLIRmz1L", "NW0LuK6Vb9eH6jcO6lyYeFn7KSHSxynw", "5brGPIOfpSxIScBaveghLVMlb1271YeU"};
    public static final /* synthetic */ EnumC2935Uu[] A02;
    public static final EnumC2935Uu A03;
    public static final EnumC2935Uu A04;
    public static final EnumC2935Uu A05;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
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
        A03 = new EnumC2935Uu(A01(0, 7, 61), 0);
        A05 = new EnumC2935Uu(A01(10, 2, 108), 1);
        A04 = new EnumC2935Uu(A01(7, 3, 12), 2);
        A02 = A03();
    }

    public EnumC2935Uu(String str, int i) {
    }

    public static VideoAutoplayBehavior A00(@Nullable EnumC2935Uu enumC2935Uu) {
        if (enumC2935Uu == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        switch (C2934Ut.A00[enumC2935Uu.ordinal()]) {
            case 1:
                VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                if (A01[1].charAt(31) != 'u') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "tGhoRPzzdwkU9rBMhrkq51QPgJKMKCG7";
                strArr[7] = "oLzw2E9OShYSASB843fXRAiyIcSfpUGD";
                return videoAutoplayBehavior;
            case 2:
                return VideoAutoplayBehavior.ON;
            case 3:
                return VideoAutoplayBehavior.OFF;
            default:
                return VideoAutoplayBehavior.DEFAULT;
        }
    }

    public static /* synthetic */ EnumC2935Uu[] A03() {
        EnumC2935Uu[] enumC2935UuArr = new EnumC2935Uu[3];
        enumC2935UuArr[0] = A03;
        if (A01[5].charAt(31) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "zoiTRupMudK7uDXw";
        strArr[4] = "VFYrxWbIb3tlnjHn";
        enumC2935UuArr[1] = A05;
        enumC2935UuArr[2] = A04;
        return enumC2935UuArr;
    }

    public static EnumC2935Uu valueOf(String str) {
        return (EnumC2935Uu) Enum.valueOf(EnumC2935Uu.class, str);
    }

    public static EnumC2935Uu[] values() {
        return (EnumC2935Uu[]) A02.clone();
    }
}
