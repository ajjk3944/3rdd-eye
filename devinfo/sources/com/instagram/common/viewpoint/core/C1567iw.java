package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.iw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1567iw implements NG {
    public static byte[] A07;
    public static String[] A08 = {"HqViDmZKE9gqowyTLi9oGTmraxBLxdfb", "ZDhLRf5Uu21mhR1h1Q7a0O5z7jEhSu9k", "2GbaqYyT8OuzZpNttfxCN9qv1cIIYzBc", "fbbf2hOViPWoQMO0MuifN9tE3LO9hSeI", "DwEg34XuIOHddfNq0Duo86gfWbmgRcX4", "GcZc2s8wIoPvhyGTdTaWZVIVIYLPtEuL", "AIVK7lVsrhvQj", "0MZsasdmKrVN6CPRKwrl3lR9QzLAtIP"};
    public final /* synthetic */ long A03;
    public final /* synthetic */ C03067g A04;
    public final /* synthetic */ C0865Tu A05;
    public final /* synthetic */ Runnable A06;
    public boolean A02 = false;
    public boolean A01 = false;
    public boolean A00 = false;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, -112, -112, -115, -112, -59, -53, -65};
    }

    static {
        A01();
    }

    public C1567iw(C03067g c03067g, Runnable runnable, long j, C0865Tu c0865Tu) {
        this.A04 = c03067g;
        this.A06 = runnable;
        this.A03 = j;
        this.A05 = c0865Tu;
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void AEv(C1618ju c1618ju) {
        if (!this.A00) {
            this.A00 = true;
            String[] strArr = A08;
            if (strArr[1].charAt(12) != strArr[5].charAt(12)) {
                throw new RuntimeException();
            }
            A08[0] = "A302cEzPVYQXumyZNbB7zeSxM9mEDz6J";
            this.A04.A05(this.A05.A03(EnumC0869Ty.A02), null);
        }
        if (this.A04.A07 != null) {
            this.A04.A07.A0C();
        }
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void AEw(C1618ju c1618ju) {
        if (c1618ju != this.A04.A00) {
            return;
        }
        Handler handlerA0H = this.A04.A0H();
        Runnable runnable = this.A06;
        if (A08[7].length() != 31) {
            throw new RuntimeException();
        }
        A08[0] = "XfIEhebH8X778eyni9LsSDQR6QKL4f9o";
        handlerA0H.removeCallbacks(runnable);
        this.A04.A01 = c1618ju;
        this.A04.A07.A0F(c1618ju);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            if (A08[3].charAt(7) == 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "6CdPuG9VNNO8hZ7pQWbBuknU9qSrspmw";
            strArr[5] = "JYrF77GwPBrAhOPn8MtwFVV4pu279MHz";
            this.A04.A05(this.A05.A03(EnumC0869Ty.A04), mapA01);
        }
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void AEx(C1618ju c1618ju) {
        if (!this.A01) {
            this.A01 = true;
            this.A04.A05(this.A05.A03(EnumC0869Ty.A03), null);
        }
        this.A04.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.NG
    public final void AEz(C1618ju c1618ju, C0908Vm c0908Vm) {
        if (c1618ju != this.A04.A00) {
            return;
        }
        this.A04.A0H().removeCallbacks(this.A06);
        this.A04.A0Q(c1618ju);
        if (!this.A02) {
            this.A02 = true;
            Map mapA01 = this.A04.A01(this.A03);
            mapA01.put(A00(0, 5, 14), String.valueOf(c0908Vm.A03().getErrorCode()));
            mapA01.put(A00(5, 3, 72), String.valueOf(c0908Vm.A04()));
            this.A04.A05(this.A05.A03(EnumC0869Ty.A04), mapA01);
        }
        this.A04.ADp(c0908Vm);
    }
}
