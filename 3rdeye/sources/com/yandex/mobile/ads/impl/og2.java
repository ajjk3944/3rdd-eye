package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.dy;

/* loaded from: classes3.dex */
final class og2 extends kotlin.jvm.internal.m implements p9.l<dy.c.a, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    public static final og2 f31363b = new og2();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31364a;

        static {
            int[] iArr = new int[dy.c.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31364a = iArr;
        }
    }

    public og2() {
        super(1);
    }

    @Override // p9.l
    public final C1992A invoke(dy.c.a aVar) {
        dy.c.a actionType = aVar;
        kotlin.jvm.internal.l.f(actionType, "actionType");
        int i = a.f31364a[actionType.ordinal()];
        return C1992A.f18074a;
    }
}
