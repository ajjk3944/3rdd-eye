package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* loaded from: assets/audience_network/classes2.dex */
public abstract class JM {
    public static String[] A00 = {"FTgkNuEfB21sdffM4MB", "AHdMCcfHPrYhHZuJq7ar8kaDD0", "m1AQBHavwMcQPTMSh8yPHqRX8TIuxSKu", "w1PNvsr2QHXMQttzrVJcJFpvqWAZZ2ue", "3yahnNe", "CLySAaMkPHNUkUwJF2Q2hF0h64PJDpTx", "AMIcFao4vlNbyapwbaOz2OEX2RJAnqn2", "UMo3DITmDXTtEPejAH8oJ9deLVPgGECA"};
    public static final int[] A01 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A00(int i4, boolean z3) {
        if ((i4 >>> 8) == 3368816) {
            return true;
        }
        if (A00[1].length() == 5) {
            throw new RuntimeException();
        }
        A00[1] = "W7vtI7n9AGcg3kiZwr1R4Wd";
        if (i4 == 1751476579 && z3) {
            return true;
        }
        int[] iArr = A01;
        if (A00[1].length() == 5) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[6] = "p6Add4WRgBlZ7U9sigG7YhPBNKEcLx90";
        strArr[7] = "5Tff00eh7q1qfGppTlmWVovL6e7TawLb";
        for (int i10 : iArr) {
            if (i10 == i4) {
                return true;
            }
        }
        return false;
    }

    public static boolean A01(InterfaceC1787ms interfaceC1787ms) throws IOException {
        return A03(interfaceC1787ms, true, false);
    }

    public static boolean A02(InterfaceC1787ms interfaceC1787ms, boolean z3) throws IOException {
        return A03(interfaceC1787ms, false, z3);
    }

    public static boolean A03(InterfaceC1787ms interfaceC1787ms, boolean z3, boolean z10) throws IOException {
        long jA8O = interfaceC1787ms.A8O();
        long inputLength = 4096;
        if (jA8O != -1 && jA8O <= 4096) {
            inputLength = jA8O;
        }
        int i4 = (int) inputLength;
        C02434v c02434v = new C02434v(64);
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (i10 < i4) {
            int i11 = 8;
            c02434v.A0d(8);
            if (!interfaceC1787ms.AGu(c02434v.A0l(), 0, 8, true)) {
                break;
            }
            long jA0Q = c02434v.A0Q();
            int headerSize = c02434v.A0C();
            if (jA0Q == 1) {
                i11 = 16;
                interfaceC1787ms.AGt(c02434v.A0l(), 8, 8);
                c02434v.A0e(16);
                jA0Q = c02434v.A0P();
            } else if (jA0Q == 0) {
                long jA8O2 = interfaceC1787ms.A8O();
                if (jA8O2 != -1) {
                    jA0Q = (jA8O2 - interfaceC1787ms.A8i()) + 8;
                }
            }
            if (jA0Q < i11) {
                return false;
            }
            i10 += i11;
            if (headerSize == 1836019574) {
                int i12 = (int) jA0Q;
                String[] strArr = A00;
                if (strArr[2].charAt(21) == strArr[5].charAt(21)) {
                    throw new RuntimeException();
                }
                A00[1] = "1NOCBl6uYr6a5zcz7K9cJi9";
                i4 += i12;
                if (jA8O != -1 && i4 > jA8O) {
                    i4 = (int) jA8O;
                }
            } else {
                if (headerSize == 1836019558 || headerSize == 1836475768) {
                    z12 = true;
                    break;
                }
                if ((i10 + jA0Q) - i11 >= i4) {
                    break;
                }
                int atomDataSize = (int) (jA0Q - i11);
                i10 += atomDataSize;
                if (headerSize == 1718909296) {
                    if (atomDataSize >= 8) {
                        c02434v.A0d(atomDataSize);
                        interfaceC1787ms.AGt(c02434v.A0l(), 0, atomDataSize);
                        int atomDataSize2 = atomDataSize / 4;
                        int brandsCount = 0;
                        while (true) {
                            if (brandsCount >= atomDataSize2) {
                                break;
                            }
                            if (brandsCount == 1) {
                                c02434v.A0g(4);
                            } else if (A00(c02434v.A0C(), z10)) {
                                z11 = true;
                                break;
                            }
                            brandsCount++;
                        }
                        if (!z11) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else if (atomDataSize != 0) {
                    interfaceC1787ms.A47(atomDataSize);
                }
            }
        }
        return z11 && z3 == z12;
    }
}
