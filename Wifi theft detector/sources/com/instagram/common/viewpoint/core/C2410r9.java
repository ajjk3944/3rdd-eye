package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2410r9 {
    public final InterfaceC2414rD A00;
    public final String A01;
    public final Collection<C2423rN> A02;
    public final Collection<C2423rN> A03;
    public final List<Rect> A04;

    public C2410r9(String str, InterfaceC2414rD interfaceC2414rD, List<Rect> rects, Collection<C2423rN> collection, Collection<C2423rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2414rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
