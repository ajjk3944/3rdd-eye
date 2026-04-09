package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Log;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8B, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8B implements InterfaceC1932pF {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC1932pF A06;
    public C02565i A07;
    public C02565i A08;

    @MetaExoPlayerCustomization
    public ML A09;
    public MZ A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC1932pF A0D;
    public final InterfaceC1932pF A0E;
    public final InterfaceC1932pF A0F;
    public final MP A0G;
    public final MS A0H;
    public final MY A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = bArrCopyOfRange[i12];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            bArrCopyOfRange[i12] = (byte) ((b10 ^ i11) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{25, 59, 57, 50, Utf8.REPLACEMENT_BYTE, 30, 59, 46, 59, 9, 53, 47, 40, 57, Utf8.REPLACEMENT_BYTE, 22, 58, 32, 57, 49, 59, 114, 33, 117, 32, 37, 49, 52, 33, 48, 117, 39, 48, 49, 60, 39, 48, 54, 33, 48, 49, 117, 0, 7, 28, 123, 117, 1, 61, 60, 38, 117, 56, 60, 50, 61, 33, 117, 54, 52, 32, 38, 48, 117, 39, 48, 57, 52, 33, 60, 35, 48, 117, 0, 7, 28, 38, 117, 50, 48, 33, 117, 39, 48, 38, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, 39, 39, 48, 54, 33, 57, 44, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AGi(C02565i c02565i) throws IOException {
        try {
            String strA4l = this.A0I.A4l(c02565i);
            C02565i c02565iA09 = c02565i.A04().A08(strA4l).A09();
            this.A08 = c02565iA09;
            this.A05 = A01(this.A0G, strA4l, c02565iA09.A06);
            this.A03 = c02565i.A04;
            this.A09 = new ML(c02565i.A07);
            this.A0B = A00(c02565i) != -1;
            boolean z3 = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC0678Mj.A00(this.A0G.A7S(strA4l));
                if (this.A00 != -1) {
                    this.A00 -= c02565i.A04;
                    if (this.A00 < 0) {
                        throw new C02495b(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            boolean z10 = c02565i.A07.A08 <= 0 && c02565i.A07.A07 <= 0;
            if (c02565i.A03 != -1) {
                this.A00 = this.A00 == -1 ? c02565i.A03 : Math.min(this.A00, c02565i.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(c02565iA09, false, z10);
            }
            return c02565i.A03 != -1 ? c02565i.A03 : this.A00;
        } catch (Throwable th2) {
            A09(th2);
            throw th2;
        }
    }

    static {
        A05();
    }

    public C8B(MP mp, InterfaceC1932pF interfaceC1932pF, InterfaceC1932pF interfaceC1932pF2, C5W c5w, MY my, int i4, AbstractC02013d abstractC02013d, int i10, MS ms) {
        this.A0G = mp;
        this.A0D = interfaceC1932pF2;
        this.A0I = my == null ? MY.A00 : my;
        this.A0J = (i4 & 1) != 0;
        this.A0L = (i4 & 2) != 0;
        this.A0K = (i4 & 4) != 0;
        if (interfaceC1932pF != null) {
            interfaceC1932pF = abstractC02013d != null ? new AH(interfaceC1932pF, abstractC02013d, i10) : interfaceC1932pF;
            this.A0F = interfaceC1932pF;
            this.A0E = c5w != null ? new AF(interfaceC1932pF, c5w) : null;
        } else {
            this.A0F = AI.A02;
            this.A0E = null;
        }
        this.A0H = ms;
    }

    private int A00(C02565i c02565i) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c02565i.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(MP mp, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC0678Mj.A01(mp.A7S(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    MP mp = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        mp.AHg(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th2) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AHg(this.A0A);
                this.A0A = null;
            }
            throw th2;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A7A();
            throw new NullPointerException(A02(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, 17, 44));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A06(com.instagram.common.viewpoint.core.C02565i r22, boolean r23, boolean r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C8B.A06(com.facebook.ads.redexgen.X.5i, boolean, boolean):void");
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C0680Ml c0680Ml = new C0680Ml();
            C0680Ml.A00(c0680Ml, this.A03);
            this.A0G.A4E(str, c0680Ml);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C0680Ml c0680Ml = new C0680Ml();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            C0680Ml.A01(c0680Ml, uri2);
        } else {
            C0680Ml.A01(c0680Ml, null);
        }
        try {
            this.A0G.A4E(str, c0680Ml);
        } catch (MM e2) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e2);
        }
    }

    private void A09(Throwable th2) {
        if (A0B() || (th2 instanceof MM)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final MP A0E() {
        return this.A0G;
    }

    public final MY A0F() {
        return this.A0I;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final void A43(InterfaceC02675t interfaceC02675t) {
        AbstractC02203y.A01(interfaceC02675t);
        this.A0D.A43(interfaceC02675t);
        this.A0F.A43(interfaceC02675t);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final Map<String, List<String>> A8t() {
        if (A0C()) {
            return this.A0F.A8t();
        }
        return Collections.emptyMap();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final Uri A9P() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1932pF
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e2) {
            A09(e2);
            throw e2;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01762c
    public final int read(byte[] bArr, int i4, int i10) throws Throwable {
        if (i10 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        C02565i currentDataSpec = (C02565i) AbstractC02203y.A01(this.A08);
        C02565i c02565i = (C02565i) AbstractC02203y.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
        } catch (Throwable th2) {
            e = th2;
        }
        try {
            int bytesRead = ((InterfaceC1932pF) AbstractC02203y.A01(this.A06)).read(bArr, i4, i10);
            if (bytesRead != -1) {
                if (A0B()) {
                    this.A04 += bytesRead;
                }
                this.A03 += bytesRead;
                this.A02 += bytesRead;
                if (this.A00 != -1) {
                    this.A00 -= bytesRead;
                }
            } else if (A0C() && (c02565i.A03 == -1 || this.A02 < c02565i.A03)) {
                A07((String) C5C.A0f(currentDataSpec.A08));
            } else if (this.A00 > 0 || this.A00 == -1) {
                A03();
                A06(currentDataSpec, false, false);
                return read(bArr, i4, i10);
            }
            return bytesRead;
        } catch (Throwable th3) {
            e = th3;
            A09(e);
            throw e;
        }
    }
}
