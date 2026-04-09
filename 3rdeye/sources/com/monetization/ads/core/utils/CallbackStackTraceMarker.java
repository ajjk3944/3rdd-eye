package com.monetization.ads.core.utils;

import b9.C1992A;
import kotlin.jvm.internal.l;
import p9.InterfaceC5480a;

/* loaded from: classes2.dex */
public final class CallbackStackTraceMarker {
    public CallbackStackTraceMarker(InterfaceC5480a<C1992A> block) {
        l.f(block, "block");
        block.invoke();
    }
}
