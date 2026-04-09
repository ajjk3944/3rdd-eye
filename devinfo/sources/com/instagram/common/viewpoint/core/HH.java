package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class HH {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ AppLovinMediationAdapter.ERROR_CHILD_USER);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, 15, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, 27, 93, 73, 90, 86, 94, 27, 95, 84, 94, 72, 27, 85, 84, 79, 27, 72, 79, 90, 73, 79, 27, 76, 82, 79, 83, 27, 72, 66, 85, 88, 27, 88, 84, 95, 94, 21};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC1787ms interfaceC1787ms) throws IOException {
        interfaceC1787ms.AIl();
        C02434v c02434v = new C02434v(2);
        interfaceC1787ms.AGt(c02434v.A0l(), 0, 2);
        int syncCode = c02434v.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC1787ms.AIl();
            return syncCode;
        }
        interfaceC1787ms.AIl();
        throw C3K.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC1787ms interfaceC1787ms, boolean z3) throws IOException {
        IE id3FramePredicate;
        if (z3) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C9U.A03;
        }
        Metadata metadataA00 = new HM().A00(interfaceC1787ms, id3FramePredicate);
        if (metadataA00 == null || metadataA00.A02() == 0) {
            return null;
        }
        return metadataA00;
    }

    public static Metadata A02(InterfaceC1787ms interfaceC1787ms, boolean z3) throws IOException {
        interfaceC1787ms.AIl();
        long jA8i = interfaceC1787ms.A8i();
        Metadata metadataA01 = A01(interfaceC1787ms, z3);
        interfaceC1787ms.AK3((int) (interfaceC1787ms.A8i() - jA8i));
        return metadataA01;
    }

    public static HI A03(C02434v c02434v) {
        c02434v.A0g(1);
        int iA0K = c02434v.A0K();
        int length = c02434v.A09();
        long j = length + iA0K;
        int i4 = iA0K / 18;
        long[] jArrCopyOf = new long[i4];
        long[] jArrCopyOf2 = new long[i4];
        int i10 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            long jA0P = c02434v.A0P();
            if (jA0P == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jA0P;
            jArrCopyOf2[i10] = c02434v.A0P();
            c02434v.A0g(2);
            i10++;
        }
        int length2 = c02434v.A09();
        c02434v.A0g((int) (j - length2));
        return new HI(jArrCopyOf, jArrCopyOf2);
    }

    public static HI A04(InterfaceC1787ms interfaceC1787ms, int i4) throws IOException {
        C02434v c02434v = new C02434v(i4);
        interfaceC1787ms.readFully(c02434v.A0l(), 0, i4);
        return A03(c02434v);
    }

    public static HJ A05(InterfaceC1787ms interfaceC1787ms) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC1787ms.readFully(bArr, 0, 38);
        return new HJ(bArr, 4);
    }

    public static List<String> A07(InterfaceC1787ms interfaceC1787ms, int i4) throws IOException {
        C02434v c02434v = new C02434v(i4);
        interfaceC1787ms.readFully(c02434v.A0l(), 0, i4);
        c02434v.A0g(4);
        return Arrays.asList(AbstractC0550Hk.A05(c02434v, false, false).A02);
    }

    public static void A09(InterfaceC1787ms interfaceC1787ms) throws IOException {
        C02434v c02434v = new C02434v(4);
        interfaceC1787ms.readFully(c02434v.A0l(), 0, 4);
        if (c02434v.A0Q() == 1716281667) {
        } else {
            throw C3K.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC1787ms interfaceC1787ms) throws IOException {
        C02434v c02434v = new C02434v(4);
        interfaceC1787ms.AGt(c02434v.A0l(), 0, 4);
        return c02434v.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC1787ms interfaceC1787ms, HG hg2) throws IOException {
        interfaceC1787ms.AIl();
        C02424u c02424u = new C02424u(new byte[4]);
        interfaceC1787ms.AGt(c02424u.A00, 0, 4);
        boolean zA0H = c02424u.A0H();
        int iA04 = c02424u.A04(7);
        int iA042 = c02424u.A04(24) + 4;
        if (iA04 == 0) {
            HJ hjA05 = A05(interfaceC1787ms);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            hg2.A00 = hjA05;
        } else {
            HJ hj2 = hg2.A00;
            if (hj2 != null) {
                if (iA04 != 3) {
                    if (iA04 == 4) {
                        hg2.A00 = hj2.A0B(A07(interfaceC1787ms, iA042));
                    } else if (iA04 == 6) {
                        C02434v c02434v = new C02434v(iA042);
                        interfaceC1787ms.readFully(c02434v.A0l(), 0, iA042);
                        c02434v.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c02434v);
                        hg2.A00 = hj2.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC1787ms.AK3(iA042);
                    }
                } else {
                    hg2.A00 = hj2.A09(A04(interfaceC1787ms, iA042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return zA0H;
    }
}
