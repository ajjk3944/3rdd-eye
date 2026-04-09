package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2226ns {
    public static final AbstractC2226ns A00 = new C0770Be();
    public static final AbstractC2226ns A02 = new C0768Bc(-1);
    public static final AbstractC2226ns A01 = new C0768Bc(1);

    public abstract int A05();

    public abstract AbstractC2226ns A06(int left, int right);

    public abstract AbstractC2226ns A07(long left, long right);

    public abstract <T> AbstractC2226ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC2226ns A09(boolean left, boolean right);

    public abstract AbstractC2226ns A0A(boolean left, boolean right);

    public AbstractC2226ns() {
    }

    public /* synthetic */ AbstractC2226ns(C0770Be c0770Be) {
        this();
    }

    public static AbstractC2226ns A01() {
        return A00;
    }
}
