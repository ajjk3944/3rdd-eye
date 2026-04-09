package vk;

import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g extends nk.i implements mk.c {

    /* renamed from: i, reason: collision with root package name */
    public static final g f36287i = new g(1, f.class, "next", "next()Lkotlin/text/MatchResult;", 0);

    @Override // mk.c
    public final Object invoke(Object obj) {
        f fVar = (f) obj;
        nk.k.e(fVar, "p0");
        CharSequence charSequence = fVar.f36284b;
        Matcher matcher = fVar.f36283a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        nk.k.d(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new f(matcher2, charSequence);
        }
        return null;
    }
}
