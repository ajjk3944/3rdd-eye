package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import javax.jmdns.impl.constants.DNSConstants;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network/classes2.dex */
public final class XP implements VM {
    public static byte[] A04;
    public static String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC1326Xe A00;
    public C2423rN<C1271Uw, V1> A01;
    public final C1810ge A02;
    public final C0754Ao A03 = C0754Ao.A01();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[1].length() == 18) {
                throw new RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 121);
            i13++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, 127, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, 12, 77, 12, 66, 89, 64, 64, 12, 79, 94, 73, 77, 88, 69, 90, 73, 12, 90, 69, 73, 91, 13, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, 53, 9, 2, Flags.CD, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = XP.class.getSimpleName();
    }

    public XP(C1810ge c1810ge) {
        this.A02 = c1810ge;
    }

    private void A01() {
        this.A02.A08().ABC(A00(89, 14, 19), DNSConstants.DNS_TTL, new C1227Te(A00(67, 22, 124)));
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void ADb() {
        if (this.A01 != null) {
            this.A01.A07.A00();
        } else {
            A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AGc() {
        if (this.A01 != null) {
            this.A01.A07.A03();
        } else {
            A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKU(View view) {
        if (this.A01 == null) {
            this.A02.A08().ABC(A00(89, 14, 19), DNSConstants.DNS_TTL, new C1227Te(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKn(View view, String str, boolean z10) {
        AKo(view, str, z10, false);
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKo(View view, String str, boolean z10, boolean z11) {
        AKp(view, str, z10, z11, false);
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKp(View view, String str, boolean z10, boolean z11, boolean z12) {
        if (view != null) {
            this.A00 = new ViewOnAttachStateChangeListenerC1326Xe(view, this.A02);
            this.A03.A0A(this.A00, view);
            if (z11) {
                this.A00.A04();
            }
            this.A01 = C2423rN.A00(new C1271Uw(this.A02, view, str, z10, z12), new V1(), A06).A06(new C1327Xf(new XM())).A07();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A08().ABC(A00(89, 14, 19), DNSConstants.DNS_TTL, new C1227Te(A00(0, 32, 98)));
    }
}
