package Ii;

import Ni.AbstractC3409k;

/* loaded from: classes4.dex */
public abstract class H0 extends J {
    @Override // Ii.J
    public J n0(int i10, String str) {
        AbstractC3409k.a(i10);
        return AbstractC3409k.b(this, str);
    }

    public abstract H0 p0();

    protected final String q0() {
        H0 h0P0;
        H0 h0C = C3048c0.c();
        if (this == h0C) {
            return "Dispatchers.Main";
        }
        try {
            h0P0 = h0C.p0();
        } catch (UnsupportedOperationException unused) {
            h0P0 = null;
        }
        if (this == h0P0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
