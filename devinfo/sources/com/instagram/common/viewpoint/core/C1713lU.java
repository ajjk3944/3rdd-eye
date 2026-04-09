package com.instagram.common.viewpoint.core;

import android.net.Uri;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1713lU implements H9 {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final HD A04 = new HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.instagram.common.viewpoint.core.HD
        public final H9[] A5N() {
            return C1713lU.A00();
        }

        @Override // com.instagram.common.viewpoint.core.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C1712lT A02 = new C1712lT();
    public final C02434v A01 = new C02434v(Http2.INITIAL_MAX_FRAME_SIZE);

    public static /* synthetic */ H9[] A00() {
        return new H9[]{new C1713lU()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha2) {
        this.A02.A5c(ha2, new LG(0, 1));
        ha2.A6O();
        ha2.AJ7(new C1782mn(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC1787ms interfaceC1787ms, HV hv) throws IOException {
        int i4 = interfaceC1787ms.read(this.A01.A0l(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i4 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i4);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j, long j8) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC1787ms interfaceC1787ms) throws IOException {
        C02434v c02434v = new C02434v(10);
        int length = 0;
        while (true) {
            byte[] bArrA0l = c02434v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC1787ms.AGt(bArrA0l, 0, 10);
            c02434v.A0f(0);
            if (c02434v.A0K() != 4801587) {
                interfaceC1787ms.AIl();
                interfaceC1787ms.A47(length);
                int i4 = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC1787ms.AGt(c02434v.A0l(), 0, 7);
                    c02434v.A0f(0);
                    int headerPosition = c02434v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC1787ms.AIl();
                        i4++;
                        if (i4 - length >= 8192) {
                            return false;
                        }
                        interfaceC1787ms.A47(i4);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = AbstractC0534Gu.A02(c02434v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC1787ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c02434v.A0g(3);
                int iA0H = c02434v.A0H();
                length += iA0H + 10;
                interfaceC1787ms.A47(iA0H);
            }
        }
    }
}
