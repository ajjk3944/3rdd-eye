package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0379Ar implements InterfaceC2052rY {
    public final List<InterfaceC2053rZ> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC2052rY
    public final InterfaceC2053rZ A6i(int i4) {
        this.A00.get(i4);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2053rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2052rY
    public final int size() {
        return this.A00.size();
    }
}
