package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdClosedListener;

/* renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0999Zd extends FrameLayout {
    public static String[] A0E = {"5RNIIKEidNz4CxH4JgV5654XoKm2WCRJ", "1p9zA", "TyFhTVOKfwCiarLUW0", "qGg1KSsP6zNQFhXHIMmjZGXDOHal5qmq", "ysvkaelauuCqE6L7ICudiIGq1Ejo0wOd", "BlsqFJOSCgQfST", "dpiEaUs9Aor9er1WGZ", "tfv9H94"};
    public int A00;
    public AdClosedListener A01;
    public EnumC0728Oi A02;
    public C0729Oj A03;
    public C0730Ok A04;
    public InterfaceC0998Zc A05;
    public final C0726Og A06;
    public final C1436gi A07;
    public final VA A08;
    public final InterfaceC0977Yh A09;
    public final InterfaceC0978Yi A0A;
    public final String A0B;
    public final C0706Nm A0C;
    public final InterfaceC1001Zf A0D;

    public abstract void A0O();

    public abstract void A0P();

    public abstract void A0R(C0730Ok c0730Ok, EnumC0728Oi enumC0728Oi);

    public abstract boolean A0S();

    public AbstractC0999Zd(C1436gi c1436gi, VA va2, String str) {
        this(c1436gi, va2, str, null, null, null);
    }

    public AbstractC0999Zd(C1436gi c1436gi, VA va2, String str, C0706Nm c0706Nm, InterfaceC0978Yi interfaceC0978Yi, InterfaceC0977Yh interfaceC0977Yh) {
        super(c1436gi);
        this.A00 = 0;
        this.A02 = EnumC0728Oi.A05;
        this.A04 = null;
        this.A0D = new MF(this);
        this.A07 = c1436gi;
        this.A08 = va2;
        this.A0A = interfaceC0978Yi;
        this.A09 = interfaceC0977Yh;
        this.A0B = str;
        this.A0C = c0706Nm;
        this.A06 = AbstractC0727Oh.A00(this.A07.A02());
    }

    public static /* synthetic */ int A02(AbstractC0999Zd abstractC0999Zd) {
        int i4 = abstractC0999Zd.A00;
        abstractC0999Zd.A00 = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int A03(AbstractC0999Zd abstractC0999Zd) {
        int i4 = abstractC0999Zd.A00;
        abstractC0999Zd.A00 = i4 - 1;
        return i4;
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
    public void A0G(C0730Ok c0730Ok) {
        this.A03.A08(this.A02);
        A0Q(c0730Ok, this.A02);
        N8.A01(this.A07).A0L();
        if (A0S()) {
            A0E();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C0730Ok c0730Ok) {
        this.A04 = c0730Ok;
        this.A03.A09(this.A02, this.A00);
        A0R(c0730Ok, this.A02);
    }

    public final void A0M() {
        A0E();
    }

    public final void A0N() {
        this.A03 = new C0729Oj(new VI(this.A0B, this.A08));
        if (this.A0A != null) {
            InterfaceC0978Yi interfaceC0978Yi = this.A0A;
            if (A0E[0].charAt(22) == 'O') {
                throw new RuntimeException();
            }
            A0E[7] = "FLAi4P2";
            interfaceC0978Yi.AFA(true);
        }
        if (this.A05 != null) {
            this.A05.ACs();
        }
        A0F();
    }

    public void A0Q(C0730Ok c0730Ok, EnumC0728Oi enumC0728Oi) {
        if (this.A01 != null) {
            this.A07.A0F().ABV();
            this.A01.onAdClosed();
        }
    }

    public void setAdReportingCallbackListener(InterfaceC0998Zc interfaceC0998Zc) {
        this.A05 = interfaceC0998Zc;
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.A01 = adClosedListener;
    }
}
