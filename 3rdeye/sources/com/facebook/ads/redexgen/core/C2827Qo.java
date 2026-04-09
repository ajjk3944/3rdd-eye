package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2827Qo {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C3469gb<AbstractC2819Qg, C2825Qm> A00 = new C3469gb<>();
    public final OS<AbstractC2819Qg> A01 = new OS<>();

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private QJ A00(AbstractC2819Qg abstractC2819Qg, int i) {
        C2825Qm c2825QmA0B;
        QJ info;
        int iA08 = this.A00.A08(abstractC2819Qg);
        if (iA08 >= 0 && (c2825QmA0B = this.A00.A0B(iA08)) != null) {
            int i10 = c2825QmA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i10 & i) != 0) {
                int i11 = c2825QmA0B.A00;
                int index = ~i;
                c2825QmA0B.A00 = i11 & index;
                if (i == 4) {
                    info = c2825QmA0B.A02;
                } else if (i == 8) {
                    info = c2825QmA0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = c2825QmA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    C2825Qm.A02(c2825QmA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final QJ A03(AbstractC2819Qg abstractC2819Qg) {
        return A00(abstractC2819Qg, 8);
    }

    public final QJ A04(AbstractC2819Qg abstractC2819Qg) {
        return A00(abstractC2819Qg, 4);
    }

    public final AbstractC2819Qg A05(long j4) {
        return this.A01.A08(j4);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C2825Qm.A01();
    }

    public final void A08(long j4, AbstractC2819Qg abstractC2819Qg) {
        this.A01.A0B(j4, abstractC2819Qg);
    }

    public final void A09(AbstractC2819Qg abstractC2819Qg) {
        C2825Qm c2825QmA00 = this.A00.get(abstractC2819Qg);
        if (c2825QmA00 == null) {
            c2825QmA00 = C2825Qm.A00();
            this.A00.put(abstractC2819Qg, c2825QmA00);
        }
        c2825QmA00.A00 |= 1;
    }

    public final void A0A(AbstractC2819Qg abstractC2819Qg) {
        C2825Qm c2825Qm = this.A00.get(abstractC2819Qg);
        if (c2825Qm == null) {
            return;
        }
        c2825Qm.A00 &= -2;
    }

    public final void A0B(AbstractC2819Qg abstractC2819Qg) {
        int iA06 = this.A01.A06() - 1;
        while (true) {
            if (iA06 < 0) {
                break;
            }
            if (abstractC2819Qg == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
            iA06--;
        }
        C2825Qm info = this.A00.remove(abstractC2819Qg);
        if (info != null) {
            C2825Qm.A02(info);
        }
    }

    public final void A0C(AbstractC2819Qg abstractC2819Qg) {
        A0A(abstractC2819Qg);
    }

    public final void A0D(AbstractC2819Qg abstractC2819Qg, QJ qj) {
        C2825Qm c2825QmA00 = this.A00.get(abstractC2819Qg);
        if (c2825QmA00 == null) {
            c2825QmA00 = C2825Qm.A00();
            this.A00.put(abstractC2819Qg, c2825QmA00);
        }
        c2825QmA00.A00 |= 2;
        c2825QmA00.A02 = qj;
    }

    public final void A0E(AbstractC2819Qg abstractC2819Qg, QJ qj) {
        C2825Qm c2825QmA00 = this.A00.get(abstractC2819Qg);
        if (c2825QmA00 == null) {
            c2825QmA00 = C2825Qm.A00();
            this.A00.put(abstractC2819Qg, c2825QmA00);
        }
        c2825QmA00.A01 = qj;
        c2825QmA00.A00 |= 8;
    }

    public final void A0F(AbstractC2819Qg abstractC2819Qg, QJ qj) {
        C2825Qm c2825QmA00 = this.A00.get(abstractC2819Qg);
        if (c2825QmA00 == null) {
            c2825QmA00 = C2825Qm.A00();
            this.A00.put(abstractC2819Qg, c2825QmA00);
        }
        c2825QmA00.A02 = qj;
        c2825QmA00.A00 |= 4;
    }

    public final void A0G(InterfaceC2826Qn interfaceC2826Qn) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC2819Qg abstractC2819QgA09 = this.A00.A09(size);
            C2825Qm c2825QmA0A = this.A00.A0A(size);
            if ((c2825QmA0A.A00 & 3) == 3) {
                interfaceC2826Qn.AJo(abstractC2819QgA09);
            } else {
                int index = c2825QmA0A.A00;
                if ((index & 1) != 0) {
                    if (c2825QmA0A.A02 == null) {
                        interfaceC2826Qn.AJo(abstractC2819QgA09);
                    } else {
                        interfaceC2826Qn.AGR(abstractC2819QgA09, c2825QmA0A.A02, c2825QmA0A.A01);
                    }
                } else if ((c2825QmA0A.A00 & 14) == 14) {
                    interfaceC2826Qn.AGP(abstractC2819QgA09, c2825QmA0A.A02, c2825QmA0A.A01);
                } else if ((c2825QmA0A.A00 & 12) == 12) {
                    interfaceC2826Qn.AGT(abstractC2819QgA09, c2825QmA0A.A02, c2825QmA0A.A01);
                } else {
                    int index2 = c2825QmA0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC2826Qn.AGR(abstractC2819QgA09, c2825QmA0A.A02, null);
                    } else {
                        int index3 = c2825QmA0A.A00;
                        if ((index3 & 8) != 0) {
                            QJ qj = c2825QmA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC2826Qn.AGP(abstractC2819QgA09, qj, c2825QmA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C2825Qm.A02(c2825QmA0A);
        }
    }

    public final boolean A0H(AbstractC2819Qg abstractC2819Qg) {
        C2825Qm record = this.A00.get(abstractC2819Qg);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC2819Qg abstractC2819Qg) {
        C2825Qm record = this.A00.get(abstractC2819Qg);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
