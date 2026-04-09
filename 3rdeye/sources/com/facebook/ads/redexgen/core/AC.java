package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class AC implements InterfaceC4002q2 {
    public final List<InterfaceC4003q3> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.core.InterfaceC4002q2
    public final InterfaceC4003q3 A6a(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC4003q3> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC4002q2
    public final int size() {
        return this.A00.size();
    }
}
