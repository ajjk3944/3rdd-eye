package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* renamed from: com.facebook.ads.redexgen.X.1b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C01491b extends AE implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"58lW15hp88fFpLaSxErp", "56QScXrV6I", "DwEmmtKo2ODeTiA17rxauXwet98Z4", "A4aLtxZMLOPLaVE6SeDzXnpOLTGefetw", "FhOKuZuvLBWd8lghoK1mwxVLtzQRZ", "h1d8vpIJ83Cnf8DVjx4Ui7av1xQxYsFL", "y1YT0hSXczs7bGZDGpuR", "alxZNjekiwxoo3ZSsAAxphzspQJfVEZr"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C1996qI A05;
    public InterfaceC1735lq A06;
    public C8S A07;
    public C8P A08;
    public C8P A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C02996z A0E;
    public final EP A0F;
    public final ES A0G;

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "1YRuRVntTKbD5w1SSS8awuyRss3tM";
            strArr2[4] = "HmFGzdsys3t1iPkkAdwtO8Q44Z9aJ";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 122);
            i12++;
        }
    }

    public static void A09() {
        A0H = new byte[]{89, 127, 104, 126, 99, 126, 102, 111, 42, 110, 111, 105, 101, 110, 99, 100, 109, 42, 108, 107, 99, 102, 111, 110, 36, 42, 121, 126, 120, 111, 107, 103, 76, 101, 120, 103, 107, 126, 55, 57, 8, 21, 25, Utf8.REPLACEMENT_BYTE, 8, 3, 9, 8, 31, 8, 31};
    }

    static {
        A09();
    }

    public C01491b(ES es, Looper looper, EP ep) {
        super(3);
        this.A0G = (ES) AbstractC02203y.A01(es);
        this.A0D = looper == null ? null : C5C.A0c(looper, this);
        this.A0F = ep;
        this.A0E = new C02996z();
        this.A02 = -9223372036854775807L;
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC02203y.A01(this.A09);
        if (this.A01 >= this.A09.A84()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A83(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j) {
        int iA8a = this.A09.A8a(j);
        if (iA8a != 0) {
            int nextEventTimeIndex = this.A09.A84();
            if (nextEventTimeIndex != 0) {
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[0];
                int length = str.length();
                int nextEventTimeIndex2 = str2.length();
                if (length != nextEventTimeIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "dWbBH4lKinuUlTA8CpNFonpmnzuPl";
                strArr2[4] = "MDue3s6tkJ65MZJ0TxYFZvpfeIb1w";
                if (iA8a == -1) {
                    C8P c8p = this.A09;
                    if (A0I[1].length() != 10) {
                        int nextEventTimeIndex3 = this.A09.A84();
                        return c8p.A83(nextEventTimeIndex3 - 1);
                    }
                    A0I[3] = "us0wUp64B7rq5nQeuQUWAOSOIfPFOl8I";
                    int nextEventTimeIndex4 = this.A09.A84();
                    return c8p.A83(nextEventTimeIndex4 - 1);
                }
                int nextEventTimeIndex5 = iA8a - 1;
                return this.A09.A83(nextEventTimeIndex5);
            }
        }
        return ((AbstractC1916oz) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j) {
        boolean z3 = true;
        AbstractC02203y.A08(j != -9223372036854775807L);
        if (this.A04 == -9223372036854775807L) {
            z3 = false;
        }
        AbstractC02203y.A08(z3);
        return j - this.A04;
    }

    private void A04() {
        A0B(new C1944pR(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5K((C1996qI) AbstractC02203y.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((InterfaceC1735lq) AbstractC02203y.A01(this.A06)).AHb();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(C1944pR c1944pR) {
        this.A0G.ADa(c1944pR.A01);
        this.A0G.ADZ(c1944pR);
    }

    private void A0B(C1944pR c1944pR) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c1944pR).sendToTarget();
        } else {
            A0A(c1944pR);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0C(ER er) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, er).sendToTarget();
        }
    }

    private void A0D(C1728lj c1728lj) {
        AbstractC02284g.A08(A03(39, 12, 23), A03(0, 39, AppLovinMediationAdapter.ERROR_CHILD_USER) + this.A05, c1728lj);
        A0C(new ER(this.A05, c1728lj));
        A04();
        A08();
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1Z() {
        this.A05 = null;
        this.A02 = -9223372036854775807L;
        A04();
        this.A04 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1a(long j, boolean z3) {
        this.A03 = j;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((InterfaceC1735lq) AbstractC02203y.A01(this.A06)).flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AE
    public final void A1c(C1996qI[] c1996qIArr, long j, long j8) {
        this.A04 = j8;
        this.A05 = c1996qIArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final boolean AAP() {
        return this.A0B;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    public final boolean AAe() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AIX(long r10, long r12) throws com.instagram.common.viewpoint.core.AnonymousClass61 {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C01491b.AIX(long, long):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03157p
    public final int AKM(C1996qI c1996qI) {
        if (this.A0F.AKN(c1996qI)) {
            return AbstractC03087i.A00(4);
        }
        if (C3J.A0E(c1996qI.A0W)) {
            return AbstractC03087i.A00(1);
        }
        return AbstractC03087i.A00(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1905oo, com.instagram.common.viewpoint.core.InterfaceC03157p
    public final String getName() {
        return A03(39, 12, 23);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0A((C1944pR) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
