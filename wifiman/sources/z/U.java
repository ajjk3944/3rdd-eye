package z;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import oh.AbstractC7137b;
import org.snmp4j.mp.MPv3;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class U {
    public static final C0.D a(T t10, int i10, int i11, int i12, int i13, int i14, androidx.compose.ui.layout.m mVar, List list, androidx.compose.ui.layout.t[] tVarArr, int i15, int i16, int[] iArr, int i17) throws Throwable {
        int[] iArr2;
        long j10;
        long j11;
        String str;
        String str2;
        int i18;
        Integer num;
        int i19;
        int iK;
        int i20;
        String str3;
        int i21;
        float f10;
        String str4;
        float f11;
        long j12;
        long j13;
        String str5;
        String str6;
        String str7;
        String str8;
        int i22;
        int i23;
        String str9;
        float f12;
        int i24;
        int i25;
        float f13;
        String str10;
        long j14;
        int i26;
        String str11;
        String str12;
        int i27;
        int i28;
        float f14;
        float f15;
        char c10;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        long j15;
        int[] iArr3;
        int i35;
        int i36;
        float f16;
        int[] iArr4;
        int i37;
        List list2 = list;
        int i38 = i16;
        int i39 = i38 - i15;
        int i40 = 0;
        int i41 = i15;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int[] iArr5 = new int[i39];
        long j16 = i14;
        float f17 = 0.0f;
        int i46 = 0;
        while (true) {
            int iD = MPv3.MAX_MESSAGE_ID;
            if (i41 >= i38) {
                break;
            }
            int i47 = i46;
            C0.B b10 = (C0.B) list2.get(i41);
            V vC = S.c(b10);
            float fE = S.e(vC);
            i45 = (i45 != 0 || S.f(vC)) ? 1 : i40;
            if (fE > 0.0f) {
                i44++;
                i34 = i41;
                j15 = j16;
                iArr4 = iArr5;
                i36 = i39;
                f16 = f17 + fE;
                i37 = i40;
            } else {
                if (i13 != Integer.MAX_VALUE && vC != null) {
                    vC.c();
                }
                int i48 = i12 - i43;
                androidx.compose.ui.layout.t tVarT = tVarArr[i41];
                if (tVarT == null) {
                    if (i12 != Integer.MAX_VALUE) {
                        iD = AbstractC7978m.d(i48, i40);
                    }
                    i31 = i48;
                    i32 = i43;
                    i33 = i44;
                    i34 = i41;
                    iArr3 = iArr5;
                    j15 = j16;
                    i35 = i47;
                    i36 = i39;
                    f16 = f17;
                    tVarT = b10.T(T.n(t10, 0, 0, iD, i13, false, 16, null));
                } else {
                    i31 = i48;
                    i32 = i43;
                    i33 = i44;
                    i34 = i41;
                    j15 = j16;
                    iArr3 = iArr5;
                    i35 = i47;
                    i36 = i39;
                    f16 = f17;
                }
                androidx.compose.ui.layout.t tVar = tVarT;
                int iH = t10.h(tVar);
                int iK2 = t10.k(tVar);
                iArr4 = iArr3;
                iArr4[i34 - i15] = iH;
                i37 = 0;
                int iMin = Math.min(i14, AbstractC7978m.d(i31 - iH, 0));
                i43 = iH + iMin + i32;
                int iMax = Math.max(i35, iK2);
                tVarArr[i34] = tVar;
                i47 = iMax;
                i42 = iMin;
                i44 = i33;
            }
            i41 = i34 + 1;
            iArr5 = iArr4;
            i40 = i37;
            f17 = f16;
            i39 = i36;
            i46 = i47;
            j16 = j15;
        }
        int i49 = i46;
        long j17 = j16;
        int[] iArr6 = iArr5;
        int i50 = i39;
        float f18 = f17;
        int i51 = i40;
        int i52 = i43;
        int i53 = i44;
        if (i53 == 0) {
            i20 = i52 - i42;
            iArr2 = iArr6;
            iK = i51;
            i18 = i10;
            i19 = i49;
            num = null;
        } else {
            int i54 = i12 != Integer.MAX_VALUE ? i12 : i10;
            iArr2 = iArr6;
            long j18 = (i53 - 1) * j17;
            long jE = AbstractC7978m.e((i54 - i52) - j18, 0L);
            float f19 = jE / f18;
            int i55 = i15;
            long jRound = jE;
            while (true) {
                j10 = jE;
                j11 = j18;
                str = "arrangementSpacingPx ";
                str2 = "targetSpace ";
                if (i55 >= i38) {
                    break;
                }
                float fE2 = S.e(S.c((C0.B) list2.get(i55)));
                float f20 = f19 * fE2;
                try {
                    jRound -= Math.round(f20);
                    i55++;
                    list2 = list;
                    i38 = i16;
                    jE = j10;
                    j18 = j11;
                } catch (IllegalArgumentException e10) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i12 + "mainAxisMin " + i10 + "targetSpace " + i54 + "arrangementSpacingPx " + j17 + "weightChildrenCount " + i53 + "fixedSpace " + i52 + "arrangementSpacingTotal " + j11 + "remainingToTarget " + j10 + "totalWeight " + f18 + "weightUnitSpace " + f19 + "itemWeight " + fE2 + "weightedSize " + f20).initCause(e10);
                }
            }
            i18 = i10;
            float f21 = f18;
            String str13 = "weightedSize ";
            String str14 = "weightUnitSpace ";
            String str15 = "totalWeight ";
            long j19 = j10;
            String str16 = "remainingToTarget ";
            long j20 = j11;
            String str17 = "arrangementSpacingTotal ";
            long j21 = j17;
            int i56 = i49;
            int i57 = 0;
            int i58 = i15;
            int i59 = i16;
            while (i58 < i59) {
                if (tVarArr[i58] == null) {
                    C0.B b11 = (C0.B) list.get(i58);
                    V vC2 = S.c(b11);
                    float fE3 = S.e(vC2);
                    String str18 = str;
                    int i60 = i54;
                    if (i13 != Integer.MAX_VALUE && vC2 != null) {
                        vC2.c();
                    }
                    if (fE3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int iB = AbstractC7137b.b(jRound);
                    String str19 = str2;
                    jRound -= iB;
                    float f22 = f19 * fE3;
                    int iMax2 = Math.max(0, Math.round(f22) + iB);
                    try {
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        f12 = f22;
                        i24 = i53;
                        i25 = i52;
                        f13 = fE3;
                        str10 = str13;
                        j14 = j20;
                        i26 = i60;
                        str11 = str18;
                        str12 = str19;
                        i27 = iB;
                        i28 = iMax2;
                        f14 = f19;
                        f15 = f21;
                        j12 = j21;
                    }
                    try {
                        if (S.b(vC2)) {
                            c10 = 65535;
                            int i61 = iMax2 != Integer.MAX_VALUE ? iMax2 : 0;
                            j14 = j20;
                            str11 = str18;
                            i27 = iB;
                            i28 = iMax2;
                            str12 = str19;
                            int i62 = i61;
                            f12 = f22;
                            i26 = i60;
                            i24 = i53;
                            i25 = i52;
                            f13 = fE3;
                            f14 = f19;
                            str10 = str13;
                            f15 = f21;
                            j12 = j21;
                            androidx.compose.ui.layout.t tVarT2 = b11.T(t10.g(i62, 0, i28, i13, true));
                            int iH2 = t10.h(tVarT2);
                            int iK3 = t10.k(tVarT2);
                            iArr2[i58 - i15] = iH2;
                            i57 += iH2;
                            int iMax3 = Math.max(i56, iK3);
                            tVarArr[i58] = tVarT2;
                            i56 = iMax3;
                            str4 = str10;
                            f11 = f15;
                            f10 = f14;
                            j13 = j19;
                            str5 = str14;
                            str6 = str15;
                            str7 = str16;
                            str8 = str17;
                            j20 = j14;
                            str3 = str11;
                            str9 = str12;
                            i22 = i26;
                            i23 = i24;
                            i21 = i25;
                        } else {
                            c10 = 65535;
                        }
                        androidx.compose.ui.layout.t tVarT22 = b11.T(t10.g(i62, 0, i28, i13, true));
                        int iH22 = t10.h(tVarT22);
                        int iK32 = t10.k(tVarT22);
                        iArr2[i58 - i15] = iH22;
                        i57 += iH22;
                        int iMax32 = Math.max(i56, iK32);
                        tVarArr[i58] = tVarT22;
                        i56 = iMax32;
                        str4 = str10;
                        f11 = f15;
                        f10 = f14;
                        j13 = j19;
                        str5 = str14;
                        str6 = str15;
                        str7 = str16;
                        str8 = str17;
                        j20 = j14;
                        str3 = str11;
                        str9 = str12;
                        i22 = i26;
                        i23 = i24;
                        i21 = i25;
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i12 + "mainAxisMin " + i18 + str12 + i26 + str11 + j12 + "weightChildrenCount " + i24 + "fixedSpace " + i25 + str17 + j14 + str16 + j19 + str15 + f15 + str14 + f14 + "weight " + f13 + str10 + f12 + "crossAxisDesiredSize " + ((Object) null) + "remainderUnit " + i27 + "childMainAxisSize " + i28).initCause(e);
                    }
                    j14 = j20;
                    str11 = str18;
                    i27 = iB;
                    i28 = iMax2;
                    str12 = str19;
                    int i622 = i61;
                    f12 = f22;
                    i26 = i60;
                    i24 = i53;
                    i25 = i52;
                    f13 = fE3;
                    f14 = f19;
                    str10 = str13;
                    f15 = f21;
                    j12 = j21;
                } else {
                    str3 = str;
                    i21 = i52;
                    f10 = f19;
                    str4 = str13;
                    f11 = f21;
                    j12 = j21;
                    j13 = j19;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                    i22 = i54;
                    i23 = i53;
                    str9 = str2;
                }
                i58++;
                str2 = str9;
                i54 = i22;
                str = str3;
                i53 = i23;
                i52 = i21;
                j19 = j13;
                f19 = f10;
                str14 = str5;
                str15 = str6;
                str16 = str7;
                str17 = str8;
                i59 = i16;
                j21 = j12;
                f21 = f11;
                str13 = str4;
            }
            int i63 = i52;
            num = null;
            i19 = i56;
            iK = AbstractC7978m.k((int) (i57 + j20), 0, i12 - i63);
            i20 = i63;
        }
        if (i45 != 0) {
            int iMax4 = 0;
            int iMax5 = 0;
            for (int i64 = i15; i64 < i16; i64++) {
                androidx.compose.ui.layout.t tVar2 = tVarArr[i64];
                AbstractC6492s.f(tVar2);
                AbstractC8690m abstractC8690mA = S.a(S.d(tVar2));
                Integer numB = abstractC8690mA != null ? abstractC8690mA.b(tVar2) : num;
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    int iK4 = t10.k(tVar2);
                    iMax4 = Math.max(iMax4, iIntValue != Integer.MIN_VALUE ? numB.intValue() : 0);
                    if (iIntValue == Integer.MIN_VALUE) {
                        iIntValue = iK4;
                    }
                    iMax5 = Math.max(iMax5, iK4 - iIntValue);
                }
            }
            i29 = iMax5;
            i30 = iMax4;
        } else {
            i29 = 0;
            i30 = 0;
        }
        int iMax6 = Math.max(AbstractC7978m.d(i20 + iK, 0), i18);
        int iMax7 = Math.max(i19, Math.max(i11, i29 + i30));
        int[] iArr7 = new int[i50];
        for (int i65 = 0; i65 < i50; i65++) {
            iArr7[i65] = 0;
        }
        t10.a(iMax6, iArr2, iArr7, mVar);
        return t10.d(tVarArr, mVar, i30, iArr7, iMax6, iMax7, iArr, i17, i15, i16);
    }
}
