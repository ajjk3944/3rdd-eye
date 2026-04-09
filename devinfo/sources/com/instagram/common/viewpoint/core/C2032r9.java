package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.r9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2032r9 {
    public final InterfaceC2036rD A00;
    public final String A01;
    public final Collection<C2045rN> A02;
    public final Collection<C2045rN> A03;
    public final List<Rect> A04;

    public C2032r9(String str, InterfaceC2036rD interfaceC2036rD, List<Rect> rects, Collection<C2045rN> collection, Collection<C2045rN> collection2) {
        this.A01 = str;
        this.A00 = interfaceC2036rD;
        this.A04 = new ArrayList(rects);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
