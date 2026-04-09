package com.instagram.common.viewpoint.core;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.1X, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1X extends C8M {
    public static byte[] A0I;
    public static String[] A0J = {"xyPuKzK0jyL2a", "iL7bHi", "xWOCeVedudZJs", "eDpkr1uq432y6tY7AB6w", "Ypq0mJEh8s3UPXcAK8ds", "IbMgmnX", "KmOfE4b", "2YMQiowZDjtDDRtBYtxBF6amitwY9A2K"};
    public static final int[] A0K;
    public static final int[] A0L;
    public static final int[] A0M;
    public static final int[] A0N;
    public static final int[] A0O;
    public static final int[] A0P;
    public static final int[] A0Q;
    public static final boolean[] A0R;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public long A05;
    public List<C1946pT> A07;
    public List<C1946pT> A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final long A0F;
    public final C02434v A0G = new C02434v();
    public final ArrayList<C0603Jm> A0H = new ArrayList<>();
    public C0603Jm A06 = new C0603Jm(0, 4);
    public int A04 = 0;

    public static String A06(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0I = new byte[]{10, 44, 40, 127, 121, 113, 13, 44, 42, 38, 45, 44, 59, 90, 125, 101, 114, 127, 122, 119, 51, 112, 123, 114, 125, 125, 118, 127, 61, 51, 87, 118, 117, 114, 102, 127, 103, 122, 125, 116, 51, 103, 124, 51, 80, 80, 34, 61, 7, 22, 22, 10, 15, 5, 7, 18, 15, 9, 8, 73, 30, 75, 11, 22, 82, 75, 5, 3, 7, 75, 80, 86, 94};
    }

    static {
        A09();
        A0M = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0L = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0Q = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        A0K = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 104, 105, 106, FacebookMediationAdapter.ERROR_NULL_CONTEXT, 108, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, 110, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, AppLovinMediationAdapter.ERROR_CHILD_USER, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        A0N = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        A0O = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, TTAdConstant.MATE_VALID, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        A0P = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, WebSocketProtocol.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
        A0R = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    public C1X(String str, int i4, long j) {
        this.A0F = j > 0 ? 1000 * j : -9223372036854775807L;
        this.A0C = A06(48, 25, 84).equals(str) ? 2 : 3;
        switch (i4) {
            case 1:
                this.A0D = 0;
                this.A0E = 0;
                break;
            case 2:
                this.A0D = 1;
                this.A0E = 0;
                break;
            case 3:
                this.A0D = 0;
                this.A0E = 1;
                break;
            case 4:
                this.A0D = 1;
                this.A0E = 1;
                break;
            default:
                AbstractC02284g.A07(A06(0, 13, 123), A06(13, 35, 33));
                this.A0D = 0;
                this.A0E = 0;
                break;
        }
        A0E(0);
        A08();
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }

    public static char A00(byte b10) {
        int index = A0K[(b10 & 127) - 32];
        return (char) index;
    }

    public static char A01(byte b10) {
        int index = A0O[b10 & 31];
        return (char) index;
    }

    public static char A02(byte b10) {
        int index = A0P[b10 & 31];
        return (char) index;
    }

    public static char A03(byte b10) {
        int index = A0N[b10 & 15];
        return (char) index;
    }

    public static char A04(byte b10, byte b11) {
        if ((b10 & 1) == 0) {
            return A01(b11);
        }
        return A02(b11);
    }

    public static int A05(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<C1946pT> A07() {
        int iMin = 2;
        int size = this.A0H.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C1946pT c1946pTA08 = this.A0H.get(i4).A08(LinearLayoutManager.INVALID_OFFSET);
            arrayList.add(c1946pTA08);
            if (c1946pTA08 != null) {
                int positionAnchor = c1946pTA08.A08;
                iMin = Math.min(iMin, positionAnchor);
            }
        }
        List<Cue> displayCues = new ArrayList<>(size);
        for (int i10 = 0; i10 < size; i10++) {
            C1946pT c1946pT = (C1946pT) arrayList.get(i10);
            if (c1946pT != null) {
                int cueBuilderCount = c1946pT.A08;
                if (cueBuilderCount != iMin) {
                    c1946pT = (C1946pT) AbstractC02203y.A01(this.A0H.get(i10).A08(iMin));
                }
                displayCues.add(c1946pT);
            }
        }
        return displayCues;
    }

    private void A08() {
        this.A06.A0C(this.A02);
        this.A0H.clear();
        this.A0H.add(this.A06);
    }

    private void A0A(byte b10) {
        this.A06.A0B(' ');
        int style = (b10 >> 1) & 7;
        this.A06.A0F(style, (b10 & 1) == 1);
    }

    private void A0B(byte b10) {
        switch (b10) {
            case 32:
                A0E(2);
                return;
            case 33:
            case 34:
            case 35:
            case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FORTY /* 40 */:
            default:
                if (this.A02 == 0) {
                    return;
                }
                switch (b10) {
                    case 33:
                        this.A06.A09();
                        return;
                    case TTAdConstant.CONVERSION_LINK_AUTO_OPEN_INSTANT_PANEL_WHEN_VIDEO_FINISHED /* 36 */:
                    default:
                        return;
                    case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_DRAW /* 44 */:
                        this.A07 = Collections.emptyList();
                        if (this.A02 != 1) {
                            int i4 = this.A02;
                            String[] strArr = A0J;
                            if (strArr[3].length() != strArr[4].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0J;
                            strArr2[6] = "b3deduR";
                            strArr2[5] = "v1SkHRN";
                            if (i4 != 3) {
                                return;
                            }
                        }
                        A08();
                        return;
                    case 45:
                        int i10 = this.A02;
                        String[] strArr3 = A0J;
                        if (strArr3[0].length() != strArr3[2].length()) {
                            String[] strArr4 = A0J;
                            strArr4[3] = "HCAfJwwR1nZZ2pYCiapM";
                            strArr4[4] = "hVuFMnq3D5R8fxepiPSv";
                            if (i10 != 1) {
                                return;
                            }
                        } else {
                            String[] strArr5 = A0J;
                            strArr5[6] = "UkNz47z";
                            strArr5[5] = "ECTKBDG";
                            if (i10 != 1) {
                                return;
                            }
                        }
                        if (this.A06.A0G()) {
                            return;
                        }
                        this.A06.A0A();
                        return;
                    case 46:
                        A08();
                        return;
                    case 47:
                        this.A07 = A07();
                        if (A0J[1].length() != 6) {
                            throw new RuntimeException();
                        }
                        String[] strArr6 = A0J;
                        strArr6[0] = "wlzHXutwvMVrg";
                        strArr6[2] = "RfwTYRDUxUGrE";
                        A08();
                        return;
                }
            case 37:
                A0E(1);
                String[] strArr7 = A0J;
                if (strArr7[6].length() != strArr7[5].length()) {
                    A0J[7] = "zMKPmeCrWxL39kxcGHJTHFiYR7RUOgb0";
                    A0F(2);
                    return;
                } else {
                    String[] strArr8 = A0J;
                    strArr8[3] = "sWiniOu4qAad1WdM0urN";
                    strArr8[4] = "Trq384lR27iyv87KhrGz";
                    A0F(2);
                    return;
                }
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
                A0E(1);
                A0F(3);
                return;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
                A0E(1);
                A0F(4);
                return;
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
                A0E(3);
                return;
        }
    }

    private void A0C(byte b10, byte b11) {
        int i4 = A0M[b10 & 7];
        int row = b11 & 32;
        int row2 = row != 0 ? 1 : 0;
        if (row2 != 0) {
            i4++;
        }
        int row3 = this.A06.A03;
        if (i4 != row3) {
            int row4 = this.A02;
            if (row4 != 1) {
                C0603Jm c0603Jm = this.A06;
                String[] strArr = A0J;
                String str = strArr[6];
                String str2 = strArr[5];
                int length = str.length();
                int row5 = str2.length();
                if (length != row5) {
                    throw new RuntimeException();
                }
                A0J[7] = "S2lulK2aovW1jS0uX55S7WO6vUVtsAxG";
                if (!c0603Jm.A0G()) {
                    this.A06 = new C0603Jm(this.A02, this.A03);
                    this.A0H.add(this.A06);
                }
            }
            this.A06.A03 = i4;
        }
        int cursorOrStyle = (b11 & 16) == 16 ? 1 : 0;
        int row6 = b11 & 1;
        boolean isCursor = row6 == 1;
        int row7 = b11 >> 1;
        int i10 = row7 & 7;
        C0603Jm c0603Jm2 = this.A06;
        int row8 = cursorOrStyle != 0 ? 8 : i10;
        c0603Jm2.A0F(row8, isCursor);
        if (cursorOrStyle != 0) {
            C0603Jm c0603Jm3 = this.A06;
            int row9 = A0L[i10];
            c0603Jm3.A02 = row9;
        }
    }

    private void A0D(byte b10, byte b11) {
        if (A0L(b10)) {
            this.A0A = false;
        }
        if (!A0K(b10)) {
            return;
        }
        switch (b11) {
            case 32:
            case 37:
            case TTAdConstant.CONVERSION_LINK_LANDING_PAGE_CEILING /* 38 */:
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_NEW /* 39 */:
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_BANNER /* 41 */:
            case 47:
                this.A0A = true;
                break;
            case 42:
            case TTAdConstant.CONVERSION_LINK_ONE_SLOT_MULTIPLE_ADS_FEED /* 43 */:
                this.A0A = false;
                break;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0013 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0E(int r3) {
        /*
            r2 = this;
            int r0 = r2.A02
            if (r0 != r3) goto L5
            return
        L5:
            int r1 = r2.A02
            r2.A02 = r3
            r0 = 3
            if (r3 != r0) goto L24
            r1 = 0
        Ld:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Jm> r0 = r2.A0H
            int r0 = r0.size()
            if (r1 >= r0) goto L23
            java.util.ArrayList<com.facebook.ads.redexgen.X.Jm> r0 = r2.A0H
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Jm r0 = (com.instagram.common.viewpoint.core.C0603Jm) r0
            r0.A0D(r3)
            int r1 = r1 + 1
            goto Ld
        L23:
            return
        L24:
            r2.A08()
            if (r1 == r0) goto L2e
            r0 = 1
            if (r3 == r0) goto L2e
            if (r3 != 0) goto L34
        L2e:
            java.util.List r0 = java.util.Collections.emptyList()
            r2.A07 = r0
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1X.A0E(int):void");
    }

    private void A0F(int i4) {
        this.A03 = i4;
        this.A06.A0E(i4);
    }

    private boolean A0G() {
        return (this.A0F == -9223372036854775807L || this.A05 == -9223372036854775807L || A0V() - this.A05 < this.A0F) ? false : true;
    }

    private boolean A0H(byte b10) {
        if (A0I(b10)) {
            this.A04 = A05(b10);
        }
        return this.A04 == this.A0D;
    }

    public static boolean A0I(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean A0J(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean A0K(byte b10) {
        return (b10 & 247) == 20;
    }

    public static boolean A0L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static boolean A0M(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean A0N(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean A0O(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean A0P(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean A0Q(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean A0R(byte b10, byte b11) {
        if ((b10 & 247) == 23) {
            String[] strArr = A0J;
            if (strArr[0].length() == strArr[2].length()) {
                A0J[7] = "7sgcSwZzVixk1cNRVVtuUYOxON5VA7NQ";
                if (b11 >= 33) {
                    if (A0J[7].charAt(24) != '4') {
                        A0J[1] = "zvE6QP";
                        if (b11 <= 35) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A0S(boolean z3, byte b10, byte b11) {
        if (z3 && A0J(b10)) {
            if (this.A0B && this.A00 == b10 && this.A01 == b11) {
                this.A0B = false;
                return true;
            }
            this.A0B = true;
            this.A00 = b10;
            this.A01 = b11;
        } else {
            this.A0B = false;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    /* renamed from: A0W */
    public final /* bridge */ /* synthetic */ C8S A5r() throws C1728lj {
        return super.A5r();
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.AnonymousClass60
    /* renamed from: A0X, reason: merged with bridge method [inline-methods] */
    public final C8P A5t() throws C1728lj {
        C8P c8pA0Y;
        C8P outputBuffer = super.A5t();
        if (outputBuffer != null) {
            return outputBuffer;
        }
        if (A0G() && (c8pA0Y = A0Y()) != null) {
            this.A07 = Collections.emptyList();
            this.A05 = -9223372036854775807L;
            c8pA0Y.A0C(A0V(), A0Z(), Long.MAX_VALUE);
            return c8pA0Y;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    public final C1726lh A0Z() {
        this.A08 = this.A07;
        return new C1726lh((List) AbstractC02203y.A01(this.A07));
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    /* renamed from: A0a */
    public final /* bridge */ /* synthetic */ void AHJ(C8S c8s) throws C1728lj {
        super.AHJ(c8s);
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    public final void A0b(C8S c8s) {
        ByteBuffer subtitleData = (ByteBuffer) AbstractC02203y.A01(c8s.A02);
        this.A0G.A0j(subtitleData.array(), subtitleData.limit());
        boolean z3 = false;
        while (true) {
            if (this.A0G.A07() >= this.A0C) {
                byte bA0I = this.A0C == 2 ? (byte) -4 : (byte) this.A0G.A0I();
                int iA0I = this.A0G.A0I();
                int iA0I2 = this.A0G.A0I();
                if ((bA0I & 2) == 0 && (bA0I & 1) == this.A0E) {
                    byte b10 = (byte) (iA0I & 127);
                    byte ccHeader = (byte) (iA0I2 & 127);
                    if (b10 != 0 || ccHeader != 0) {
                        boolean z10 = this.A09;
                        this.A09 = (bA0I & 4) == 4 && A0R[iA0I] && A0R[iA0I2];
                        if (A0S(this.A09, b10, ccHeader)) {
                            continue;
                        } else if (!this.A09) {
                            if (z10) {
                                A08();
                                String[] strArr = A0J;
                                if (strArr[0].length() != strArr[2].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0J;
                                strArr2[3] = "7LYQsBtV1mB8cg17zlGC";
                                strArr2[4] = "4QeECkpa3Q5V1bGzM4Sw";
                                z3 = true;
                            } else {
                                continue;
                            }
                        } else {
                            A0D(b10, ccHeader);
                            if (this.A0A && A0H(b10)) {
                                if (A0I(b10)) {
                                    if (A0Q(b10, ccHeader)) {
                                        this.A06.A0B(A03(ccHeader));
                                    } else if (A0M(b10, ccHeader)) {
                                        this.A06.A09();
                                        this.A06.A0B(A04(b10, ccHeader));
                                    } else if (A0N(b10, ccHeader)) {
                                        A0A(ccHeader);
                                    } else if (A0P(b10, ccHeader)) {
                                        A0C(b10, ccHeader);
                                    } else if (!A0R(b10, ccHeader)) {
                                        if (A0O(b10, ccHeader)) {
                                            A0B(ccHeader);
                                        }
                                    } else {
                                        this.A06.A04 = ccHeader - 32;
                                    }
                                } else {
                                    this.A06.A0B(A00(b10));
                                    if ((ccHeader & 224) != 0) {
                                        this.A06.A0B(A00(ccHeader));
                                    }
                                }
                                z3 = true;
                            }
                        }
                    }
                }
            } else {
                if (z3) {
                    if (this.A02 == 1 || this.A02 == 3) {
                        this.A07 = A07();
                        this.A05 = A0V();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8M
    public final boolean A0d() {
        return this.A07 != this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.AnonymousClass60
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.InterfaceC1735lq
    public final /* bridge */ /* synthetic */ void AJh(long j) {
        super.AJh(j);
    }

    @Override // com.instagram.common.viewpoint.core.C8M, com.instagram.common.viewpoint.core.AnonymousClass60
    public final void flush() {
        super.flush();
        this.A07 = null;
        this.A08 = null;
        A0E(0);
        A0F(4);
        A08();
        this.A09 = false;
        this.A0B = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
        this.A04 = 0;
        this.A0A = true;
        this.A05 = -9223372036854775807L;
    }
}
