package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30828a;

    public nb(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f30828a = context;
    }

    public final void a(String str) {
        if (str != null) {
            ob obVar = new ob(this.f30828a);
            Context context = this.f30828a;
            new lb(new mb(obVar, context, new kb(context, obVar), new hb()).a(), obVar).a(str);
        }
    }
}
