package D3;

import E3.n;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import y3.h;
import y3.j;
import y3.u;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1045f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final n f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1047b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.e f1048c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.d f1049d;

    /* renamed from: e, reason: collision with root package name */
    public final G3.b f1050e;

    public c(Executor executor, z3.e eVar, n nVar, F3.d dVar, G3.b bVar) {
        this.f1047b = executor;
        this.f1048c = eVar;
        this.f1046a = nVar;
        this.f1049d = dVar;
        this.f1050e = bVar;
    }

    @Override // D3.e
    public final void a(j jVar, h hVar, v3.j jVar2) {
        this.f1047b.execute(new a(this, jVar, jVar2, hVar, 0));
    }
}
