package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.hK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3512hK implements VT {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public NX A00;
    public TE A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final MU A07;
    public final C3272dL A08;
    public final US A09;
    public final V6 A0A;
    public final VU A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        XR.A02();
    }

    public C3512hK(C3272dL c3272dL, String str, V6 v62, AdSize adSize, int i) {
        this.A08 = c3272dL;
        this.A0D = str;
        this.A0A = v62;
        this.A06 = adSize;
        this.A04 = i;
        this.A0B = new VU(this.A08);
        this.A0B.A0R(this);
        this.A07 = new MU();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new AbstractC2778Or<C3512hK>(this) { // from class: com.facebook.ads.redexgen.X.6s
            {
                super(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
            public final void A07() {
                C3512hK c3512hKA08 = A08();
                if (c3512hKA08 == null) {
                    return;
                }
                if (C2996Xg.A02(c3512hKA08.A08)) {
                    c3512hKA08.A07();
                } else {
                    c3512hKA08.A05.postDelayed(c3512hKA08.A0C, 5000L);
                }
            }
        };
        this.A09 = c3272dL.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C3568iN> A04() {
        TE te = this.A01;
        final ArrayList arrayList = new ArrayList(te.A02());
        for (TC tcA04 = te.A04(); tcA04 != null; tcA04 = te.A04()) {
            MP mpA00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (mpA00 != null && mpA00.A8c() == AdPlacementType.NATIVE) {
                final C3568iN nativeAdapter = (C3568iN) mpA00;
                nativeAdapter.A0L(this.A08, new AbstractC3513hL() { // from class: com.facebook.ads.redexgen.X.6v
                    @Override // com.facebook.ads.redexgen.core.InterfaceC2716Me
                    public final void AEH(C3568iN c3568iN) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new NU(tcA04.A04(), te.A05(), this.A0D, te.A05().A0C()), C2815Qc.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            this.A0B.A0Q(new VR(this.A08, this.A0D, this.A06 != null ? new X1(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new VB(this.A08, null, null, null), X7.A01(U7.A0N(this.A08)), this.A02, null, new C3504hB()));
        } catch (V2 e4) {
            ADB(V1.A02(e4));
        }
    }

    public final void A08(NX nx) {
        this.A00 = nx;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.facebook.ads.redexgen.core.VT
    public final void ADB(V1 v12) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADB(v12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.VT
    public final void AFO(PW pw) {
        TE teA00 = pw.A00();
        if (teA00 != null) {
            if (this.A03) {
                long jA0A = teA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = teA00;
            List<C3568iN> listA04 = A04();
            if (this.A00 != null) {
                boolean zIsEmpty = listA04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (zIsEmpty) {
                    this.A00.ADB(V1.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEJ(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
