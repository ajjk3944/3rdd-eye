package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
/* renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2562Gf {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, 15, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, 27, 93, 73, 90, 86, 94, 27, 95, 84, 94, 72, 27, 85, 84, 79, 27, 72, 79, 90, 73, 79, 27, 76, 82, 79, 83, 27, 72, 66, 85, 88, 27, 88, 84, 95, 94, 21};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC3738lN interfaceC3738lN) throws IOException {
        interfaceC3738lN.AI1();
        C4J c4j = new C4J(2);
        interfaceC3738lN.AG9(c4j.A0l(), 0, 2);
        int syncCode = c4j.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC3738lN.AI1();
            return syncCode;
        }
        interfaceC3738lN.AI1();
        throw C22172i.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC3738lN interfaceC3738lN, boolean z10) throws IOException {
        InterfaceC2585Hc id3FramePredicate;
        if (z10) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C23698i.A03;
        }
        Metadata metadataA00 = new C2567Gk().A00(interfaceC3738lN, id3FramePredicate);
        if (metadataA00 == null || metadataA00.A02() == 0) {
            return null;
        }
        return metadataA00;
    }

    public static Metadata A02(InterfaceC3738lN interfaceC3738lN, boolean z10) throws IOException {
        interfaceC3738lN.AI1();
        long jA8a = interfaceC3738lN.A8a();
        Metadata metadataA01 = A01(interfaceC3738lN, z10);
        interfaceC3738lN.AJJ((int) (interfaceC3738lN.A8a() - jA8a));
        return metadataA01;
    }

    public static C2563Gg A03(C4J c4j) {
        c4j.A0g(1);
        int iA0K = c4j.A0K();
        int length = c4j.A09();
        long j4 = length + iA0K;
        int i = iA0K / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i10 = 0;
        while (true) {
            if (i10 >= i) {
                break;
            }
            long jA0P = c4j.A0P();
            if (jA0P == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jA0P;
            jArrCopyOf2[i10] = c4j.A0P();
            c4j.A0g(2);
            i10++;
        }
        int length2 = c4j.A09();
        c4j.A0g((int) (j4 - length2));
        return new C2563Gg(jArrCopyOf, jArrCopyOf2);
    }

    public static C2563Gg A04(InterfaceC3738lN interfaceC3738lN, int i) throws IOException {
        C4J c4j = new C4J(i);
        interfaceC3738lN.readFully(c4j.A0l(), 0, i);
        return A03(c4j);
    }

    public static C2564Gh A05(InterfaceC3738lN interfaceC3738lN) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC3738lN.readFully(bArr, 0, 38);
        return new C2564Gh(bArr, 4);
    }

    public static List<String> A07(InterfaceC3738lN interfaceC3738lN, int i) throws IOException {
        C4J c4j = new C4J(i);
        interfaceC3738lN.readFully(c4j.A0l(), 0, i);
        c4j.A0g(4);
        return Arrays.asList(H8.A05(c4j, false, false).A02);
    }

    public static void A09(InterfaceC3738lN interfaceC3738lN) throws IOException {
        C4J c4j = new C4J(4);
        interfaceC3738lN.readFully(c4j.A0l(), 0, 4);
        if (c4j.A0Q() == 1716281667) {
        } else {
            throw C22172i.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC3738lN interfaceC3738lN) throws IOException {
        C4J c4j = new C4J(4);
        interfaceC3738lN.AG9(c4j.A0l(), 0, 4);
        return c4j.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC3738lN interfaceC3738lN, C2561Ge c2561Ge) throws IOException {
        interfaceC3738lN.AI1();
        C4I c4i = new C4I(new byte[4]);
        interfaceC3738lN.AG9(c4i.A00, 0, 4);
        boolean zA0H = c4i.A0H();
        int iA04 = c4i.A04(7);
        int iA042 = c4i.A04(24) + 4;
        if (iA04 == 0) {
            C2564Gh c2564GhA05 = A05(interfaceC3738lN);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            c2561Ge.A00 = c2564GhA05;
        } else {
            C2564Gh c2564Gh = c2561Ge.A00;
            if (c2564Gh != null) {
                if (iA04 != 3) {
                    if (iA04 == 4) {
                        c2561Ge.A00 = c2564Gh.A0B(A07(interfaceC3738lN, iA042));
                    } else if (iA04 == 6) {
                        C4J c4j = new C4J(iA042);
                        interfaceC3738lN.readFully(c4j.A0l(), 0, iA042);
                        c4j.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c4j);
                        c2561Ge.A00 = c2564Gh.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC3738lN.AJJ(iA042);
                    }
                } else {
                    c2561Ge.A00 = c2564Gh.A09(A04(interfaceC3738lN, iA042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return zA0H;
    }
}
