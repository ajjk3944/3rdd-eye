package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a70;

/* loaded from: classes3.dex */
public final class la1 {

    /* renamed from: a, reason: collision with root package name */
    private final c00 f29959a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ la1(Context context, C4072a3 c4072a3, a8 a8Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, a8Var, new c00(applicationContext, a8Var, c4072a3));
    }

    public final ia1 a(mb2<ab1> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        ia1 ia1VarA = a70.a.a().a(videoAdInfo);
        if (ia1VarA != null && !ia1VarA.e()) {
            return ia1VarA;
        }
        d70 d70VarA = this.f29959a.a();
        a70.a.a().a(videoAdInfo, d70VarA);
        return d70VarA;
    }

    public la1(Context context, C4072a3 adConfiguration, a8<?> adResponse, c00 exoPlayerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(exoPlayerCreator, "exoPlayerCreator");
        this.f29959a = exoPlayerCreator;
    }
}
