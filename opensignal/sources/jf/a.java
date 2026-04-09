package jf;

import b9.e;
import dd.h;
import dd.r;
import io.sentry.h4;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e7.d f13702a = new e7.d(0);

    public static r a(r rVar, r rVar2) {
        e eVar = new e(13);
        h hVar = new h((e) eVar.f2481d);
        h4 h4Var = new h4(hVar, new AtomicBoolean(false), eVar, 3);
        e7.d dVar = f13702a;
        rVar.f(dVar, h4Var);
        rVar2.f(dVar, h4Var);
        return hVar.f7294a;
    }
}
