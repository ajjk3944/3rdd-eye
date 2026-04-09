package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0392Be extends AbstractC1848ns {
    public C0392Be() {
        super(null);
    }

    private final AbstractC1848ns A00(int result) {
        if (result < 0) {
            return AbstractC1848ns.A02;
        }
        if (result > 0) {
            return AbstractC1848ns.A01;
        }
        return AbstractC1848ns.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1848ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1848ns
    public final AbstractC1848ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1848ns
    public final AbstractC1848ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1848ns
    public final <T> AbstractC1848ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1848ns
    public final AbstractC1848ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1848ns
    public final AbstractC1848ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
