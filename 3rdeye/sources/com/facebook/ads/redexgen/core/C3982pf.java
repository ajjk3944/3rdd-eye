package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3982pf {
    public final InterfaceC3987pk A00;
    public final String A01;
    public final Collection<C3996pu> A02;
    public final Collection<C3996pu> A03;
    public final List<Rect> A04;

    public C3982pf(String str, InterfaceC3987pk interfaceC3987pk, List<Rect> rects, Collection<C3996pu> collection, Collection<C3996pu> collection2) {
        this.A01 = str;
        this.A00 = interfaceC3987pk;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
