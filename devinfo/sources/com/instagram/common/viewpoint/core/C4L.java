package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.4L, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4L extends EF {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C1310eg A01;
    public boolean A02;
    public final UN<C4K> A03;
    public final UN<C4B> A04;
    public final UN<E3> A05;
    public final UN<C4A> A06;
    public final UN<C0461Dy> A07;
    public final UN<C0459Dw> A08;
    public final UN<C0458Dv> A09;
    public final UN<C0453Dq> A0A;
    public final UN<C0452Dp> A0B;
    public final C0473Ek A0C;
    public final E0 A0D;
    public final AbstractC0454Dr A0E;

    public C4L(C1436gi c1436gi, VA va2, C0473Ek c0473Ek, String str) {
        this(c1436gi, va2, c0473Ek, str, 0, 0, false, null, null);
    }

    public C4L(C1436gi c1436gi, VA va2, C0473Ek c0473Ek, String str, int i4, int i10, boolean z3, Bundle bundle, Map<String, String> map) {
        super(c1436gi, va2, c0473Ek, str, !c0473Ek.A0m(), i4, i10, z3, bundle, map, new EE(c1436gi, c0473Ek));
        this.A0E = new AbstractC0454Dr() { // from class: com.facebook.ads.redexgen.X.4M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0455Ds c0455Ds) {
                this.A00.A0f();
            }
        };
        this.A08 = new EQ(this);
        this.A04 = new EO(this);
        this.A05 = new EN(this);
        this.A06 = new EM(this);
        this.A03 = new EL(this);
        this.A07 = new EK(this);
        this.A0A = new EJ(this);
        this.A0B = new EI(this);
        this.A09 = new C0466Ed(this);
        this.A0D = new E0() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e12) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = c0473Ek;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C0886Up.A2u(c1436gi)) {
            this.A01 = new C1310eg(c0473Ek, str, z3, null);
        }
    }

    public C4L(C1436gi c1436gi, VA va2, C0473Ek c0473Ek, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1436gi, va2, c0473Ek, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.instagram.common.viewpoint.core.EF
    public final void A0n(EnumC1314ek enumC1314ek, Map<String, String> map) {
        super.A0n(enumC1314ek, map);
        if (this.A01 != null && enumC1314ek == EnumC1314ek.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        ET et = new ET(this);
        if (this.A0C.A0q()) {
            Y4.A00(et);
            return;
        }
        C0473Ek c0473Ek = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c0473Ek.getStateHandler().post(et);
    }
}
