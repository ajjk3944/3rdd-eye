package io.appmetrica.analytics.impl;

import android.content.Context;
import g0.C4356c;

/* loaded from: classes3.dex */
public final class Vd {

    /* renamed from: a, reason: collision with root package name */
    public final p9.l f40286a;

    public Vd(C4484ae c4484ae) {
        this.f40286a = c4484ae;
    }

    public final Wd a(Context context, C4565dh c4565dh) {
        return new Wd(context, c4565dh, this.f40286a, new androidx.work.s(), EnumC4997ub.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final Wd b(Context context, C4565dh c4565dh) {
        return new Wd(context, c4565dh, this.f40286a, new C4356c(1), EnumC4997ub.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final Xk a(B0 b02) {
        return new Td(b02.f39139f.f39218d);
    }

    public static final Xk b(B0 b02) {
        return new W();
    }
}
