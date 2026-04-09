package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2086lP implements LE {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C2374qI> A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C2374qI> A03(LD ld) {
        String strA02;
        int i10;
        if (A05(32)) {
            return this.A01;
        }
        C06214v c06214v = new C06214v(ld.A03);
        List<C2374qI> arrayList = this.A01;
        while (c06214v.A07() > 0) {
            int iA0I = c06214v.A0I();
            int iA09 = c06214v.A09() + c06214v.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c06214v.A0I() & 31;
                for (int i11 = 0; i11 < iA0I2; i11++) {
                    String strA0W = c06214v.A0W(3);
                    int iA0I3 = c06214v.A0I();
                    boolean z10 = (iA0I3 & 128) != 0;
                    if (z10) {
                        strA02 = A02(19, 19, 47);
                        i10 = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 57);
                        i10 = 1;
                    }
                    byte bA0I = (byte) c06214v.A0I();
                    c06214v.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z10) {
                        boolean z11 = (bA0I & 64) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        listA04 = AnonymousClass46.A04(z11);
                    }
                    arrayList.add(new C05652p().A11(strA02).A10(strA0W).A0Z(i10).A12(listA04).A14());
                }
            }
            c06214v.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, 12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 33, 25, 15, -39, 15, 33, 13, -39, 12, 20, 31, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C2086lP() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C2086lP(int i10) {
        this(i10, MetaExoPlayerCustomizedCollections.A03(new C2374qI[0]));
    }

    public C2086lP(int i10, List<C2374qI> list) {
        this.A00 = i10;
        this.A01 = list;
    }

    private L9 A00(LD ld) {
        return new L9(A03(ld));
    }

    private LJ A01(LD ld) {
        return new LJ(A03(ld));
    }

    private boolean A05(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.LE
    public final SparseArray<LH> A5Q() {
        return new SparseArray<>();
    }

    @Override // com.instagram.common.viewpoint.core.LE
    public final LH A5V(int i10, LD ld) {
        switch (i10) {
            case 2:
            case 128:
                return new C2075lE(new C2083lM(A01(ld)));
            case 3:
            case 4:
                return new C2075lE(new C2077lG(ld.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C2075lE(new C2087lQ(false, ld.A01));
            case 16:
                return new C2075lE(new C2082lL(A01(ld)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C2075lE(new C2078lH(ld.A01));
            case 21:
                return new C2075lE(new C2079lI());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C2075lE(new C2081lK(A00(ld), A05(1), A05(8)));
            case 36:
                return new C2075lE(new C2080lJ(A00(ld)));
            case 89:
                return new C2075lE(new C2084lN(ld.A02));
            case 129:
            case 135:
                return new C2075lE(new C2093lW(ld.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C2070l9(new C2076lF(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C2075lE(new C2090lT(ld.A01));
            case 257:
                return new C2070l9(new C2076lF(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C2075lE(new C2085lO(ld.A01));
    }
}
