package uj;

import ch.n;
import ek.c;
import io.sentry.hints.i;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import js.e;
import xi.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f23568a;

    /* renamed from: b, reason: collision with root package name */
    public final u f23569b;

    /* renamed from: c, reason: collision with root package name */
    public final df.c f23570c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.a f23571d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f23572e;

    public a(c cVar, u uVar, e eVar, df.c cVar2, i iVar, q3.a aVar, Executor executor) {
        this.f23568a = cVar;
        this.f23569b = uVar;
        this.f23570c = cVar2;
        this.f23571d = aVar;
        this.f23572e = executor;
        n.b("IpWatcher", "Initializing IpWatcher");
        ((CopyOnWriteArraySet) eVar.f13797d).add(this);
    }
}
