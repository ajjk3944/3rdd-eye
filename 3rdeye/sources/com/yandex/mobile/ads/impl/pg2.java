package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.dy;
import com.yandex.mobile.ads.impl.xx;

/* loaded from: classes3.dex */
final class pg2 extends kotlin.jvm.internal.m implements p9.p<dy.h.a, Boolean, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ug2 f31745b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31746a;

        static {
            int[] iArr = new int[dy.h.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f31746a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg2(ug2 ug2Var) {
        super(2);
        this.f31745b = ug2Var;
    }

    @Override // p9.p
    public final C1992A invoke(dy.h.a aVar, Boolean bool) {
        dy.h.a switchType = aVar;
        boolean zBooleanValue = bool.booleanValue();
        kotlin.jvm.internal.l.f(switchType, "switchType");
        if (a.f31746a[switchType.ordinal()] == 1) {
            this.f31745b.f34060a.invoke(new xx.e(zBooleanValue));
        }
        return C1992A.f18074a;
    }
}
