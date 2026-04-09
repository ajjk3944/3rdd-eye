package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.iu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1943iu implements WC {
    public static byte[] A0E;
    public static String[] A0F = {"gvO2SkJ6judPPNAAbU10EdMFrysfMOoq", "C8fayNw08H03MAMa0MYSKK0pyo1qSvcR", "zD", "tQ435k35SGtCPZ", "PU5xmRYaUesfDikXgdcM0c", "Sj", "IzP0LuOvX3krWKzZjoX9w767Mf8waFqk", "fiC8qpcDm8TluoxAfEpO8PomLrdxugFO"};
    public OB A00;
    public C1245Tw A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final N6 A07;
    public final C1814gi A08;
    public final VA A09;
    public final EnumC1289Vq A0A;
    public final WD A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-47, -46, -125, -45, -49, -60, -58, -56, -48, -56, -47, -41, -125, -52, -47, -125, -43, -56, -42, -45, -46, -47, -42, -56};
    }

    static {
        A05();
        YD.A02();
    }

    public C1943iu(C1814gi c1814gi, String str, EnumC1289Vq enumC1289Vq, AdSize adSize, int i10) {
        this.A08 = c1814gi;
        this.A0D = str;
        this.A0A = enumC1289Vq;
        this.A06 = adSize;
        this.A04 = i10;
        this.A0B = new WD(this.A08);
        this.A0B.A0R(this);
        this.A07 = new N6();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new Q9<C1943iu>(this) { // from class: com.facebook.ads.redexgen.X.7e
            {
                super(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
            public final void A07() {
                C1943iu c1943iuA08 = A08();
                if (c1943iuA08 == null) {
                    return;
                }
                if (YV.A02(c1943iuA08.A08)) {
                    c1943iuA08.A07();
                } else {
                    c1943iuA08.A05.postDelayed(c1943iuA08.A0C, 5000L);
                }
            }
        };
        this.A09 = c1814gi.A0A();
        DynamicLoaderFactory.makeLoader(this.A08).getInitApi().onAdLoadInvoked(this.A08);
    }

    private List<C1996ju> A04() {
        C1245Tw c1245Tw = this.A01;
        final ArrayList arrayList = new ArrayList(c1245Tw.A02());
        for (C1243Tu c1243TuA04 = c1245Tw.A04(); c1243TuA04 != null; c1243TuA04 = c1245Tw.A04()) {
            N1 n1A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (n1A00 != null && n1A00.A8k() == AdPlacementType.NATIVE) {
                final C1996ju nativeAdapter = (C1996ju) n1A00;
                nativeAdapter.A0L(this.A08, new AbstractC1944iv() { // from class: com.facebook.ads.redexgen.X.7f
                    @Override // com.instagram.common.viewpoint.core.NG
                    public final void AEw(C1996ju c1996ju) {
                        arrayList.add(nativeAdapter);
                    }
                }, this.A09, new O8(c1243TuA04.A04(), c1245Tw.A05(), this.A0D, c1245Tw.A05().A0C()), UK.A0K());
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
            this.A0B.A0Q(new WA(this.A08, this.A0D, this.A06 != null ? new C1335Xn(this.A06.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, new C1293Vu(this.A08, null, null, null), AbstractC1341Xt.A01(C1264Up.A0N(this.A08)), this.A02, null, new C1933ij()));
        } catch (C1287Vn e10) {
            ADp(C1286Vm.A02(e10));
        }
    }

    public final void A08(OB ob) {
        this.A00 = ob;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        return this.A01 == null || this.A01.A0I();
    }

    @Override // com.instagram.common.viewpoint.core.WC
    public final void ADp(C1286Vm c1286Vm) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        if (this.A00 != null) {
            this.A00.ADp(c1286Vm);
        }
    }

    @Override // com.instagram.common.viewpoint.core.WC
    public final void AG7(RG rg) {
        C1245Tw c1245TwA00 = rg.A00();
        if (c1245TwA00 != null) {
            if (this.A03) {
                long jA0A = c1245TwA00.A05().A0A();
                if (jA0A == 0) {
                    jA0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, jA0A);
            }
            this.A01 = c1245TwA00;
            List<C1996ju> listA04 = A04();
            if (this.A00 != null) {
                boolean zIsEmpty = listA04.isEmpty();
                String[] strArr = A0F;
                if (strArr[7].charAt(9) == strArr[6].charAt(9)) {
                    throw new RuntimeException();
                }
                A0F[0] = "Ma8ASQR7F1ZvPn5hHoXinNcVvjUetiuh";
                if (zIsEmpty) {
                    this.A00.ADp(C1286Vm.A01(AdErrorType.NO_FILL, A03(0, 0, 63)));
                    return;
                } else {
                    this.A00.AEy(listA04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 18));
    }
}
