package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class bg2 {

    /* renamed from: a, reason: collision with root package name */
    private final sa2 f25262a;

    /* renamed from: b, reason: collision with root package name */
    private final gz1 f25263b;

    public /* synthetic */ bg2(sa2 sa2Var) {
        this(sa2Var, new gz1());
    }

    public final ag2 a(Context context, mb2 videoAdInfo, nc2 videoAdPosition) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoAdPosition, "videoAdPosition");
        xf2 xf2Var = new xf2(context);
        ee2 ee2Var = new ee2(context);
        ar arVar = new ar();
        arVar.a(new wu(videoAdInfo.b(), xf2Var, ee2Var));
        arVar.a(new fd2(videoAdInfo.g(), xf2Var));
        an2 an2VarA = this.f25262a.a(context, videoAdPosition, this.f25263b.a(videoAdInfo.b()), videoAdInfo.g().d());
        if (an2VarA != null) {
            arVar.a(an2VarA);
        }
        return new ag2(arVar);
    }

    public bg2(sa2 verificationVideoTrackerProvider, gz1 skipInfoParser) {
        kotlin.jvm.internal.l.f(verificationVideoTrackerProvider, "verificationVideoTrackerProvider");
        kotlin.jvm.internal.l.f(skipInfoParser, "skipInfoParser");
        this.f25262a = verificationVideoTrackerProvider;
        this.f25263b = skipInfoParser;
    }
}
