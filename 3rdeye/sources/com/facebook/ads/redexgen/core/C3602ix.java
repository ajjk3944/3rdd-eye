package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ix, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3602ix implements InterfaceC22834w {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC22804t A02;
    public InterfaceC22834w A04;
    public InterfaceC2699Ln A05;
    public boolean A07;
    public InterfaceC22834w A03 = new C3880nh();
    public InterfaceC2708Lw A06 = InterfaceC2708Lw.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC22834w
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7S A5A() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00, this.A01);
    }

    private C7S A01(InterfaceC3884nl interfaceC3884nl, int i, int i10) {
        C3603iy c3603iyA59;
        InterfaceC2699Ln interfaceC2699Ln = (InterfaceC2699Ln) C3M.A01(this.A05);
        if (this.A07 || interfaceC3884nl == null) {
            c3603iyA59 = null;
        } else if (this.A02 != null) {
            InterfaceC22804t interfaceC22804t = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c3603iyA59 = interfaceC22804t.A59();
        } else {
            c3603iyA59 = new C3604iz().A00(interfaceC2699Ln).A59();
        }
        return new C7S(interfaceC2699Ln, interfaceC3884nl, this.A03.A5A(), c3603iyA59, this.A06, i, null, i10, null);
    }

    public final AnonymousClass31 A02() {
        return null;
    }

    public final C3602ix A03(int i) {
        this.A00 = i;
        return this;
    }

    public final C3602ix A04(InterfaceC22834w interfaceC22834w) {
        this.A03 = interfaceC22834w;
        return this;
    }

    public final C3602ix A05(InterfaceC22834w interfaceC22834w) {
        this.A04 = interfaceC22834w;
        return this;
    }

    public final C3602ix A06(InterfaceC2699Ln interfaceC2699Ln) {
        this.A05 = interfaceC2699Ln;
        return this;
    }

    public final C7S A07() {
        return A01(this.A04 != null ? this.A04.A5A() : null, this.A00 | 1, -1000);
    }
}
