package io.appmetrica.analytics.impl;

import b9.C1992A;

/* renamed from: io.appmetrica.analytics.impl.ae, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4484ae extends kotlin.jvm.internal.k implements p9.l {
    public C4484ae(Object obj) {
        super(1, obj, C4510be.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        C4510be c4510be = (C4510be) this.receiver;
        c4510be.f40585a.markCrashCompleted((String) obj);
        c4510be.f40585a.deleteCompletedCrashes();
        return C1992A.f18074a;
    }
}
