package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ar, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0757Ar implements InterfaceC2430rY {
    public final List<InterfaceC2431rZ> A00 = new ArrayList();

    @Override // com.instagram.common.viewpoint.core.InterfaceC2430rY
    public final InterfaceC2431rZ A6i(int i10) {
        this.A00.get(i10);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC2431rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2430rY
    public final int size() {
        return this.A00.size();
    }
}
