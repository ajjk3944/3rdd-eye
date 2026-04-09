package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.j3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1952j3 implements N9 {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C06887k A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 10, 14, 83, 89, 91, 92, 92, 32, 3, 12, 12, 7, 16, 66, Flags.CD, 15, 18, 16, 7, 17, 17, Flags.CD, 13, 12, 66, 4, Flags.CD, 16, 7, 6, 28, 29, 49, 18, 29, 29, 22, 1, 63, 28, 20, 20, 26, 29, 20, 58, 30, 3, 1, 22, 0, 0, 26, 28, 29};
    }

    static {
        A01();
    }

    public C1952j3(C06887k c06887k, Runnable runnable) {
        this.A00 = c06887k;
        this.A01 = runnable;
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void ADC(InterfaceC2010k8 interfaceC2010k8) {
        this.A00.A02.A0F().A4a();
        this.A00.A07.A0C();
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void ADD(InterfaceC2010k8 interfaceC2010k8, View view) {
        this.A00.A02.A0F().A4Z(interfaceC2010k8 == ((AbstractC1949j0) this.A00).A00);
        if (interfaceC2010k8 != ((AbstractC1949j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        N1 n12 = ((AbstractC1949j0) this.A00).A01;
        C06887k c06887k = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1949j0) c06887k).A01 = interfaceC2010k8;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC2010k8);
        } else {
            this.A00.A07.A0E(view);
            this.A00.A0Q(n12);
        }
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void ADE(InterfaceC2010k8 interfaceC2010k8) {
        AbstractC1297Vy.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        this.A00.A02.A0F().A4c();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final void AEN(InterfaceC2010k8 interfaceC2010k8, C1286Vm c1286Vm) {
        this.A00.A02.A0F().A4b(interfaceC2010k8 == ((AbstractC1949j0) this.A00).A00, c1286Vm.A03().getErrorCode());
        if (interfaceC2010k8 != ((AbstractC1949j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC2010k8);
        this.A00.ADp(c1286Vm);
    }
}
