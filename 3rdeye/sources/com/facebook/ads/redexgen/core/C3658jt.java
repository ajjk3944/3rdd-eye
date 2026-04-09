package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3658jt implements InterfaceC2662Kc {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C3949or> A01;

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C3949or> A03(C2661Kb c2661Kb) {
        String strA02;
        int i;
        if (A05(32)) {
            return this.A01;
        }
        C4J c4j = new C4J(c2661Kb.A03);
        List<C3949or> arrayList = this.A01;
        while (c4j.A07() > 0) {
            int iA0I = c4j.A0I();
            int iA09 = c4j.A09() + c4j.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c4j.A0I() & 31;
                for (int i10 = 0; i10 < iA0I2; i10++) {
                    String strA0W = c4j.A0W(3);
                    int iA0I3 = c4j.A0I();
                    boolean z10 = (iA0I3 & 128) != 0;
                    if (z10) {
                        strA02 = A02(19, 19, 47);
                        i = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 57);
                        i = 1;
                    }
                    byte bA0I = (byte) c4j.A0I();
                    c4j.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z10) {
                        boolean z11 = (bA0I & 64) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        listA04 = C3U.A04(z11);
                    }
                    arrayList.add(new C2D().A11(strA02).A10(strA0W).A0Z(i).A12(listA04).A14());
                }
            }
            c4j.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, 12, 27, 27, 23, 20, 14, 12, 31, 20, 26, 25, -38, 33, 25, 15, -39, 15, 33, 13, -39, 12, 20, 31, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C3658jt() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C3658jt(int i) {
        this(i, MetaExoPlayerCustomizedCollections.A03(new C3949or[0]));
    }

    public C3658jt(int i, List<C3949or> list) {
        this.A00 = i;
        this.A01 = list;
    }

    private KX A00(C2661Kb c2661Kb) {
        return new KX(A03(c2661Kb));
    }

    private C2667Kh A01(C2661Kb c2661Kb) {
        return new C2667Kh(A03(c2661Kb));
    }

    private boolean A05(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2662Kc
    public final SparseArray<InterfaceC2665Kf> A5I() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2662Kc
    public final InterfaceC2665Kf A5N(int i, C2661Kb c2661Kb) {
        switch (i) {
            case 2:
            case 128:
                return new C3647ji(new C3655jq(A01(c2661Kb)));
            case 3:
            case 4:
                return new C3647ji(new C3649jk(c2661Kb.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C3647ji(new C3659ju(false, c2661Kb.A01));
            case 16:
                return new C3647ji(new C3654jp(A01(c2661Kb)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C3647ji(new C3650jl(c2661Kb.A01));
            case 21:
                return new C3647ji(new C3651jm());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C3647ji(new C3653jo(A00(c2661Kb), A05(1), A05(8)));
            case 36:
                return new C3647ji(new C3652jn(A00(c2661Kb)));
            case 89:
                return new C3647ji(new C3656jr(c2661Kb.A02));
            case 129:
            case 135:
                return new C3647ji(new C3665k0(c2661Kb.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C3642jd(new C3648jj(A02(61, 20, 26)));
            case CONFIG_REFRESH_FAILED_VALUE:
                break;
            case 172:
                return new C3647ji(new C3662jx(c2661Kb.A01));
            case 257:
                return new C3642jd(new C3648jj(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C3647ji(new C3657js(c2661Kb.A01));
    }
}
