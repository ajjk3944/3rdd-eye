package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1848ns {
    public static final AbstractC1848ns A00 = new C0392Be();
    public static final AbstractC1848ns A02 = new C0390Bc(-1);
    public static final AbstractC1848ns A01 = new C0390Bc(1);

    public abstract int A05();

    public abstract AbstractC1848ns A06(int left, int right);

    public abstract AbstractC1848ns A07(long left, long right);

    public abstract <T> AbstractC1848ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC1848ns A09(boolean left, boolean right);

    public abstract AbstractC1848ns A0A(boolean left, boolean right);

    public AbstractC1848ns() {
    }

    public /* synthetic */ AbstractC1848ns(C0392Be c0392Be) {
        this();
    }

    public static AbstractC1848ns A01() {
        return A00;
    }
}
