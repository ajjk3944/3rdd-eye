package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.kY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3699kY implements GX, InterfaceC2579Gw {
    public static byte[] A0Q;
    public static String[] A0R = {"uzhMW", "LbToze1ZyMStOzMPMggUyU89k761Fydj", "roznHbdGo", "zeOiwqyw9G80TO", "hwgMtT9WWej", "AZ5CtgA3jsgDmrh", "c4g75mNjYzBkznfgxB8HcDFPfSogi", "Prtl1ARtkjOsoD"};
    public static final InterfaceC2558Gb A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0A;
    public long A0B;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D54927862 get video/audio duration for progressive")
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public MotionPhotoMetadata A0F;
    public C2610Ic[] A0G;
    public long[][] A0H;
    public final int A0I;
    public final C4J A0J;
    public final C4J A0K;
    public final C4J A0L;
    public final C4J A0M;
    public final C2617Ij A0N;
    public final ArrayDeque<C3710kj> A0O;
    public final List<Metadata.Entry> A0P;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A03(com.facebook.ads.redexgen.core.InterfaceC3738lN r22, com.facebook.ads.redexgen.core.C2576Gt r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3699kY.A03(com.facebook.ads.redexgen.X.lN, com.facebook.ads.redexgen.X.Gt):int");
    }

    public static String A09(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Q, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0Q = new byte[]{-47, 4, -1, -3, -80, 3, -7, 10, -11, -80, -4, -11, 3, 3, -80, 4, -8, -15, -2, -80, -8, -11, -15, -12, -11, 2, -80, -4, -11, -2, -9, 4, -8, -80, -72, 5, -2, 3, 5, 0, 0, -1, 2, 4, -11, -12, -71, -66, 18, 55, 63, 42, 53, 50, 45, -23, 23, 10, 21, -23, 53, 46, 55, 48, 61, 49, -8, 12, -5, 0, 6, -58, -8, -6, -53, 49, 69, 52, 57, 63, -1, 68, 66, 69, 53, -3, 56, 52};
    }

    static {
        A0C();
        A0S = new InterfaceC2558Gb() { // from class: com.facebook.ads.redexgen.X.kZ
            @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
            public final GX[] A5F() {
                return C3699kY.A0M();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC2557Ga.A01(this, uri, map);
            }
        };
    }

    public C3699kY() {
        this(0);
    }

    public C3699kY(int i) {
        this.A0I = i;
        this.A04 = (i & 4) != 0 ? 3 : 0;
        this.A0N = new C2617Ij();
        this.A0P = new ArrayList();
        this.A0J = new C4J(16);
        this.A0O = new ArrayDeque<>();
        this.A0L = new C4J(AbstractC2573Gq.A03);
        this.A0K = new C4J(4);
        this.A0M = new C4J();
        this.A08 = -1;
        this.A0E = GY.A00;
        this.A0G = new C2610Ic[0];
    }

    public static int A00(int i) {
        switch (i) {
            case 1751476579:
                return 2;
            case 1903435808:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[1] = "rbgKKZbH0NS3XFJda55b1nN6iCZjcLPR";
                return 1;
            default:
                if (A0R[6].length() != 29) {
                    throw new RuntimeException();
                }
                A0R[4] = "05jGjYjRxbz";
                return 0;
        }
    }

    private int A01(long j4) {
        long j10 = Long.MAX_VALUE;
        int preferredTrackIndex = 1;
        int i = -1;
        long sampleOffset = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 1;
        int trackIndex = -1;
        int i11 = 0;
        while (true) {
            C2610Ic[] c2610IcArr = this.A0G;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0R[6] = "Fcko3uaud46cO6nUcug7HhLZFNYBY";
            if (i11 >= c2610IcArr.length) {
                if (j11 == Long.MAX_VALUE || i10 == 0) {
                    return i;
                }
                long j12 = 10485760 + j11;
                if (A0R[1].charAt(1) == 'b') {
                    A0R[1] = "AbIM1W3wiFJMRqsWOI3P0CqvLybO2M00";
                    if (sampleOffset < j12) {
                        return i;
                    }
                } else if (sampleOffset < j12) {
                    return i;
                }
                return trackIndex;
            }
            C2610Ic c2610Ic = this.A0G[i11];
            int i12 = c2610Ic.A00;
            if (i12 != c2610Ic.A04.A01) {
                long j13 = c2610Ic.A04.A06[i12];
                long minAccumulatedBytes = ((long[][]) AbstractC22614a.A0f(this.A0H))[i11][i12];
                long j14 = j13 - j4;
                int i13 = (j14 < 0 || j14 >= 262144) ? 1 : 0;
                if ((i13 == 0 && preferredTrackIndex != 0) || (i13 == preferredTrackIndex && j14 < j10)) {
                    preferredTrackIndex = i13;
                    j10 = j14;
                    i = i11;
                    if (A0R[6].length() != 29) {
                        String[] strArr2 = A0R;
                        strArr2[5] = "nNk7RawiIyahd9Y";
                        strArr2[0] = "017pL";
                        sampleOffset = minAccumulatedBytes;
                    } else {
                        A0R[1] = "1bC0in6G1ApWSL3PegJBmoVzHl6EE3tw";
                        sampleOffset = minAccumulatedBytes;
                    }
                }
                if (minAccumulatedBytes < j11) {
                    j11 = minAccumulatedBytes;
                    i10 = i13;
                    trackIndex = i11;
                }
            }
            i11++;
        }
    }

    public static int A02(C4J c4j) {
        c4j.A0f(8);
        int majorBrand = A00(c4j.A0C());
        if (majorBrand != 0) {
            return majorBrand;
        }
        c4j.A0g(4);
        while (c4j.A07() > 0) {
            int majorBrand2 = A00(c4j.A0C());
            if (majorBrand2 != 0) {
                return majorBrand2;
            }
        }
        return 0;
    }

    private int A04(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        int iA07 = this.A0N.A07(interfaceC3738lN, c2576Gt, this.A0P);
        if (iA07 == 1 && c2576Gt.A00 == 0) {
            A0A();
        }
        return iA07;
    }

    public static int A05(C2623Ip c2623Ip, long j4) {
        int iA00 = c2623Ip.A00(j4);
        if (iA00 == -1) {
            return c2623Ip.A01(j4);
        }
        return iA00;
    }

    public static long A06(C2623Ip c2623Ip, long j4, long j10) {
        int iA05 = A05(c2623Ip, j4);
        if (iA05 == -1) {
            return j10;
        }
        return Math.min(c2623Ip.A06[iA05], j10);
    }

    private final C2578Gv A07(long j4, int i) {
        long jA06;
        long j10;
        int mainTrackIndex;
        if (this.A0G.length == 0) {
            return new C2578Gv(C2580Gx.A04);
        }
        long j11 = -9223372036854775807L;
        long jA062 = -1;
        int i10 = i != -1 ? i : this.A03;
        if (i10 != -1) {
            C2623Ip c2623Ip = this.A0G[i10].A04;
            int iA05 = A05(c2623Ip, j4);
            if (iA05 == -1) {
                return new C2578Gv(C2580Gx.A04);
            }
            j10 = c2623Ip.A07[iA05];
            jA06 = c2623Ip.A06[iA05];
            if (A0R[6].length() != 29) {
                throw new RuntimeException();
            }
            A0R[1] = "zbT5rN6sguJCvWwII8HLCHwSkH7sQNQT";
            if (j10 < j4 && iA05 < c2623Ip.A01 - 1 && (mainTrackIndex = c2623Ip.A01(j4)) != -1 && mainTrackIndex != iA05) {
                j11 = c2623Ip.A07[mainTrackIndex];
                jA062 = c2623Ip.A06[mainTrackIndex];
            }
        } else {
            jA06 = Long.MAX_VALUE;
            if (A0R[4].length() != 11) {
                j10 = j4;
            } else {
                A0R[2] = "SenK5aC";
                j10 = j4;
            }
        }
        if (i == -1) {
            for (int i11 = 0; i11 < this.A0G.length; i11++) {
                if (i11 != this.A03) {
                    C2623Ip sampleTable = this.A0G[i11].A04;
                    jA06 = A06(sampleTable, j10, jA06);
                    if (j11 != -9223372036854775807L) {
                        jA062 = A06(sampleTable, j11, jA062);
                    }
                }
            }
        }
        C2580Gx c2580Gx = new C2580Gx(j10, jA06);
        if (j11 == -9223372036854775807L) {
            return new C2578Gv(c2580Gx);
        }
        return new C2578Gv(c2580Gx, new C2580Gx(j11, jA062));
    }

    public static /* synthetic */ C2620Im A08(C2620Im c2620Im) {
        return c2620Im;
    }

    private void A0A() {
        this.A04 = 0;
        this.A00 = 0;
    }

    private void A0B() {
        if (this.A02 == 2 && (this.A0I & 2) != 0) {
            this.A0E.AJh(0, 4).A6W(new C2D().A0v(this.A0F == null ? null : new Metadata(this.A0F)).A14());
            this.A0E.A6G();
            this.A0E.AIN(new C3733lI(-9223372036854775807L));
        }
    }

    private void A0D(long j4) throws C22172i {
        while (!this.A0O.isEmpty() && this.A0O.peek().A00 == j4) {
            C3710kj c3710kjPop = this.A0O.pop();
            if (((II) c3710kjPop).A00 == 1836019574) {
                A0G(c3710kjPop);
                this.A0O.clear();
                this.A04 = 2;
            } else if (!this.A0O.isEmpty()) {
                C3710kj containerAtom = this.A0O.peek();
                containerAtom.A08(c3710kjPop);
            }
        }
        if (this.A04 != 2) {
            A0A();
        }
    }

    private void A0E(long j4) {
        if (this.A01 == 1836086884) {
            this.A0F = new MotionPhotoMetadata(0L, j4, -9223372036854775807L, j4 + this.A00, this.A09 - this.A00);
        }
    }

    private void A0F(InterfaceC3738lN interfaceC3738lN) throws IOException {
        this.A0M.A0d(8);
        interfaceC3738lN.AG9(this.A0M.A0l(), 0, 8);
        IO.A0Q(this.A0M);
        interfaceC3738lN.AJJ(this.A0M.A09());
        interfaceC3738lN.AI1();
    }

    /* JADX WARN: Incorrect condition in loop: B:58:0x0138 */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Adding average bitrate calculation logic")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0G(com.facebook.ads.redexgen.core.C3710kj r36) throws com.facebook.ads.redexgen.core.C22172i {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3699kY.A0G(com.facebook.ads.redexgen.X.kj):void");
    }

    private void A0H(C2610Ic c2610Ic, long j4) {
        C2623Ip c2623Ip = c2610Ic.A04;
        int sampleIndex = c2623Ip.A00(j4);
        if (sampleIndex == -1) {
            sampleIndex = c2623Ip.A01(j4);
        }
        c2610Ic.A00 = sampleIndex;
        if (A0R[2].length() == 19) {
            throw new RuntimeException();
        }
        A0R[2] = "DxqZc2lJMNLNZhW19Xb8kO";
    }

    public static boolean A0I(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(int r4) {
        /*
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r4 == r0) goto L8d
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r4 == r0) goto L8d
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3699kY.A0R
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L20:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3699kY.A0R
            java.lang.String r1 = "UHuXZ9PGVGxrhu"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "Sv1JTBT1egKeuo"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L8d
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r4 == r0) goto L8d
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r4 == r0) goto L8d
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r4 == r0) goto L8d
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r4 == r0) goto L8d
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r4 == r0) goto L8d
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r4 == r0) goto L8d
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r4 == r0) goto L8d
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r4 == r0) goto L8d
            r3 = 1937007471(0x7374636f, float:1.9362445E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3699kY.A0R
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto L91
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3699kY.A0R
            java.lang.String r1 = "0EWWhWMRQ7MgS85x4CKboIorprSqD"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L8d
        L6f:
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r4 == r0) goto L8d
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r4 == r0) goto L8d
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r4 == r0) goto L8d
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r4 == r0) goto L8d
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r4 == r0) goto L8d
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r4 != r0) goto L8f
        L8d:
            r0 = 1
        L8e:
            return r0
        L8f:
            r0 = 0
            goto L8e
        L91:
            if (r4 == r3) goto L8d
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3699kY.A0J(int):boolean");
    }

    private boolean A0K(InterfaceC3738lN interfaceC3738lN) throws IOException {
        C3710kj containerAtom;
        if (this.A00 == 0) {
            if (!interfaceC3738lN.AGh(this.A0J.A0l(), 0, 8, true)) {
                A0B();
                return false;
            }
            this.A00 = 8;
            this.A0J.A0f(0);
            this.A09 = this.A0J.A0Q();
            this.A01 = this.A0J.A0C();
        }
        if (this.A09 == 1) {
            if (A0R[2].length() == 19) {
                throw new RuntimeException();
            }
            A0R[2] = "uEfPCG8cZZkUCN4sq";
            interfaceC3738lN.readFully(this.A0J.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A09 = this.A0J.A0R();
        } else if (this.A09 == 0) {
            long jA8G = interfaceC3738lN.A8G();
            if (jA8G == -1 && (containerAtom = this.A0O.peek()) != null) {
                jA8G = containerAtom.A00;
            }
            if (jA8G != -1) {
                this.A09 = (jA8G - interfaceC3738lN.A8f()) + this.A00;
            }
        }
        if (this.A09 >= this.A00) {
            if (A0I(this.A01)) {
                long jA8f = (interfaceC3738lN.A8f() + this.A09) - this.A00;
                if (this.A09 != this.A00 && this.A01 == 1835365473) {
                    A0F(interfaceC3738lN);
                }
                this.A0O.push(new C3710kj(this.A01, jA8f));
                if (this.A09 == this.A00) {
                    A0D(jA8f);
                } else {
                    A0A();
                }
            } else if (A0J(this.A01)) {
                C3M.A08(this.A00 == 8);
                C3M.A08(this.A09 <= 2147483647L);
                C4J c4j = new C4J((int) this.A09);
                C4J atomData = this.A0J;
                System.arraycopy(atomData.A0l(), 0, c4j.A0l(), 0, 8);
                this.A0D = c4j;
                this.A04 = 1;
            } else {
                A0E(interfaceC3738lN.A8f() - this.A00);
                this.A0D = null;
                this.A04 = 1;
            }
            return true;
        }
        throw C22172i.A00(A09(0, 48, 61));
    }

    private boolean A0L(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        long j4 = this.A09 - this.A00;
        long atomEndPosition = interfaceC3738lN.A8f() + j4;
        boolean z10 = false;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC3738lN.readFully(c4j.A0l(), this.A00, (int) j4);
            if (this.A01 == 1718909296) {
                this.A02 = A02(c4j);
            } else if (!this.A0O.isEmpty()) {
                this.A0O.peek().A09(new C3709ki(this.A01, c4j));
            }
        } else if (j4 < 262144) {
            interfaceC3738lN.AJJ((int) j4);
        } else {
            long atomPayloadSize = interfaceC3738lN.A8f();
            c2576Gt.A00 = atomPayloadSize + j4;
            z10 = true;
        }
        A0D(atomEndPosition);
        return z10 && this.A04 != 2;
    }

    public static /* synthetic */ GX[] A0M() {
        return new GX[]{new C3699kY()};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long[][] A0N(com.facebook.ads.redexgen.core.C2610Ic[] r16) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3699kY.A0N(com.facebook.ads.redexgen.X.Ic[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        return A07(j4, -1);
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        while (true) {
            switch (this.A04) {
                case 0:
                    if (!A0K(interfaceC3738lN)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0L(interfaceC3738lN, c2576Gt)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return A03(interfaceC3738lN, c2576Gt);
                case 3:
                    return A04(interfaceC3738lN, c2576Gt);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j4, long j10) {
        this.A0O.clear();
        this.A00 = 0;
        this.A08 = -1;
        this.A05 = 0;
        this.A06 = 0;
        this.A07 = 0;
        if (j4 == 0) {
            int i = this.A04;
            String[] strArr = A0R;
            if (strArr[3].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0R;
            strArr2[3] = "BBO5nGzNDCjhdG";
            strArr2[7] = "Qq9RZt6cBQ724Z";
            if (i != 3) {
                A0A();
                return;
            } else {
                this.A0N.A08();
                this.A0P.clear();
                return;
            }
        }
        for (C2610Ic c2610Ic : this.A0G) {
            A0H(c2610Ic, j10);
            if (c2610Ic.A02 != null) {
                c2610Ic.A02.A02();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC3738lN interfaceC3738lN) throws IOException {
        return AbstractC2618Ik.A02(interfaceC3738lN, (this.A0I & 2) != 0);
    }
}
