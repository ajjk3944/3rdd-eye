package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.l4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2065l4 implements L8 {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C2064l3 A04;
    public final C06204u A03 = new C06204u(new byte[5]);
    public final SparseArray<LH> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0176  */
    @Override // com.instagram.common.viewpoint.core.L8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A5A(com.instagram.common.viewpoint.core.C06214v r13) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2065l4.A5A(com.facebook.ads.redexgen.X.4v):void");
    }

    public C2065l4(C2064l3 c2064l3, int i10) {
        this.A04 = c2064l3;
        this.A00 = i10;
    }

    private LD A00(C06214v c06214v, int i10) {
        int descriptorTag = c06214v.A09();
        int descriptorLength = descriptorTag + i10;
        int i11 = -1;
        String strTrim = null;
        ArrayList arrayList = null;
        while (c06214v.A09() < descriptorLength) {
            int positionOfNextDescriptor = c06214v.A0I();
            int iA09 = c06214v.A09() + c06214v.A0I();
            if (iA09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long jA0Q = c06214v.A0Q();
                if (jA0Q == 1094921523) {
                    i11 = 129;
                } else if (jA0Q == 1161904947) {
                    i11 = 135;
                } else if (jA0Q == 1094921524) {
                    i11 = 172;
                } else if (jA0Q == 1212503619) {
                    i11 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i11 = 129;
            } else if (positionOfNextDescriptor == 122) {
                i11 = 135;
            } else {
                String[] strArr = A05;
                String str = strArr[1];
                String str2 = strArr[2];
                int descriptorsStartPosition = str.length();
                if (descriptorsStartPosition != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c06214v.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i11 = 172;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i11 = 138;
                } else {
                    String[] strArr3 = A05;
                    String str3 = strArr3[1];
                    String str4 = strArr3[2];
                    int descriptorsStartPosition3 = str3.length();
                    if (descriptorsStartPosition3 != str4.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String strA0W = c06214v.A0W(3);
                        String[] strArr5 = A05;
                        String str5 = strArr5[1];
                        String str6 = strArr5[2];
                        int descriptorsStartPosition4 = str5.length();
                        if (descriptorsStartPosition4 != str6.length()) {
                            strTrim = strA0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            strTrim = strA0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i11 = 89;
                        arrayList = new ArrayList();
                        while (c06214v.A09() < iA09) {
                            String strTrim2 = c06214v.A0W(3).trim();
                            int iA0I = c06214v.A0I();
                            byte[] bArr = new byte[4];
                            c06214v.A0k(bArr, 0, 4);
                            arrayList.add(new LC(strTrim2, iA0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i11 = 257;
                    }
                }
            }
            c06214v.A0g(iA09 - c06214v.A09());
        }
        c06214v.A0f(descriptorLength);
        return new LD(i11, strTrim, arrayList, Arrays.copyOfRange(c06214v.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
    }
}
