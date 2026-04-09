package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1377Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC1106Oi A02;
    public C1107Oj A03;
    public C1108Ok A04;
    public InterfaceC1376Zc A05;
    public final C1104Og A06;
    public final C1814gi A07;
    public final VA A08;
    public final InterfaceC1355Yh A09;
    public final InterfaceC1356Yi A0A;
    public final String A0B;
    public final C1084Nm A0C;
    public final InterfaceC1379Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C1108Ok c1108Ok, EnumC1106Oi enumC1106Oi);

    public abstract boolean A0S();

    public AbstractC1377Zd(C1814gi c1814gi, VA va, String str) {
        this(c1814gi, va, str, null, null, null);
    }

    public AbstractC1377Zd(C1814gi c1814gi, VA va, String str, C1084Nm c1084Nm, InterfaceC1356Yi interfaceC1356Yi, InterfaceC1355Yh interfaceC1355Yh) {
        super(c1814gi);
        this.A00 = 0;
        this.A02 = EnumC1106Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c1814gi;
        this.A08 = va;
        this.A0A = interfaceC1356Yi;
        this.A09 = interfaceC1355Yh;
        this.A0B = str;
        this.A0C = c1084Nm;
        this.A06 = AbstractC1105Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC1377Zd abstractC1377Zd) {
        int i10 = abstractC1377Zd.A00;
        abstractC1377Zd.A00 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A03(AbstractC1377Zd abstractC1377Zd) {
        int i10 = abstractC1377Zd.A00;
        abstractC1377Zd.A00 = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E() {
        if (this.A03.A0A()) {
            this.A08.AB3(this.A0B, this.A03.A02());
            this.A03.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F() {
        this.A04 = null;
        this.A03.A05();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C1108Ok c1108Ok) {
        this.A03.A08(this.A02);
        A0Q(c1108Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C1108Ok c1108Ok) {
        this.A04 = c1108Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c1108Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C1107Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC1356Yi interfaceC1356Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC1356Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C1108Ok c1108Ok, EnumC1106Oi enumC1106Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC1376Zc interfaceC1376Zc) {
        this.A05 = interfaceC1376Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
