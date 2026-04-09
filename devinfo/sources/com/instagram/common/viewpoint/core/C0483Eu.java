package com.instagram.common.viewpoint.core;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Eu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0483Eu implements InterfaceC1313ej {
    public final C1436gi A01;
    public final VA A02;
    public final C1310eg A03;
    public final C0473Ek A04;
    public final String A07;
    public final E4 A06 = new E4() { // from class: com.facebook.ads.redexgen.X.4P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4B c4b) {
            if (this.A00.A00.booleanValue()) {
                return;
            }
            this.A00.A01.A0F().AJ2();
            this.A00.A08();
        }
    };
    public final EA A05 = new EA() { // from class: com.facebook.ads.redexgen.X.4O
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            if (!this.A00.A00.booleanValue()) {
                this.A00.A01.A0F().AJ0();
                this.A00.A08();
            }
            this.A00.A00 = true;
        }
    };
    public Boolean A00 = false;

    public C0483Eu(C1436gi c1436gi, VA va2, C0473Ek c0473Ek, String str, boolean z3, EF ef2, Map<String, String> extraParams) {
        this.A01 = c1436gi;
        this.A02 = va2;
        this.A07 = str;
        this.A04 = c0473Ek;
        this.A03 = new C1310eg(c0473Ek, str, z3, extraParams);
        if (C0886Up.A2B(this.A01)) {
            this.A01.A0F().AIx();
            ef2.A0m(this);
        } else {
            this.A01.A0F().AIy();
            this.A04.getEventBus().A03(this.A06, this.A05);
        }
    }

    public final void A07() {
        F1 f12 = new F1(this);
        if (this.A04.A0q()) {
            Y4.A00(f12);
        } else {
            this.A04.getStateHandler().post(f12);
        }
    }

    public final synchronized void A08() {
        if (!this.A00.booleanValue()) {
            this.A02.ABy(this.A07, this.A03.A06());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1313ej
    public final void AEk() {
        this.A01.A0F().AJ1();
        A08();
    }
}
