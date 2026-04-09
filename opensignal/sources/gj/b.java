package gj;

import android.content.Context;
import android.telephony.TelephonyManager;
import br.l;
import cg.e;
import ch.f;
import ch.i;
import h9.r2;
import io.sentry.k;
import io.sentry.t;
import java.util.concurrent.ThreadFactory;
import ph.j;
import sm.m;
import yh.c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9591a;

    /* renamed from: b, reason: collision with root package name */
    public final ag.b f9592b;

    /* renamed from: c, reason: collision with root package name */
    public final r2 f9593c;

    /* renamed from: d, reason: collision with root package name */
    public final k f9594d;

    /* renamed from: e, reason: collision with root package name */
    public final al.b f9595e;

    /* renamed from: f, reason: collision with root package name */
    public final TelephonyManager f9596f;

    /* renamed from: g, reason: collision with root package name */
    public final f f9597g;

    /* renamed from: h, reason: collision with root package name */
    public final c f9598h;

    /* renamed from: i, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f9599i;
    public final i j;
    public final ThreadFactory k;

    /* renamed from: l, reason: collision with root package name */
    public final ThreadFactory f9600l;

    /* renamed from: m, reason: collision with root package name */
    public final t f9601m;

    /* renamed from: n, reason: collision with root package name */
    public final io.sentry.hints.i f9602n;

    /* renamed from: o, reason: collision with root package name */
    public final ee.f f9603o;

    /* renamed from: p, reason: collision with root package name */
    public final j f9604p;

    /* renamed from: q, reason: collision with root package name */
    public final df.c f9605q;

    /* renamed from: r, reason: collision with root package name */
    public final e f9606r;

    /* renamed from: s, reason: collision with root package name */
    public final m f9607s;

    /* renamed from: t, reason: collision with root package name */
    public final m f9608t;

    /* renamed from: u, reason: collision with root package name */
    public final sm.f f9609u;

    /* renamed from: v, reason: collision with root package name */
    public final io.sentry.hints.i f9610v;

    public b(Context context, ag.b bVar, r2 r2Var, k kVar, al.b bVar2, TelephonyManager telephonyManager, f fVar, c cVar, io.sentry.internal.debugmeta.c cVar2, i iVar, ThreadFactory threadFactory, ThreadFactory threadFactory2, t tVar, io.sentry.hints.i iVar2, ee.f fVar2, j jVar, df.c cVar3, e eVar, m mVar, m mVar2, sm.f fVar3, io.sentry.hints.i iVar3) {
        l.e(r2Var, "uploadProviderFactory");
        l.e(kVar, "videoResourceGetterFactory");
        l.e(threadFactory2, "tutThreadFactory");
        l.e(tVar, "handlerThreadFactory");
        l.e(iVar2, "videoPlaybackLibrarySelector");
        this.f9591a = context;
        this.f9592b = bVar;
        this.f9593c = r2Var;
        this.f9594d = kVar;
        this.f9595e = bVar2;
        this.f9596f = telephonyManager;
        this.f9597g = fVar;
        this.f9598h = cVar;
        this.f9599i = cVar2;
        this.j = iVar;
        this.k = threadFactory;
        this.f9600l = threadFactory2;
        this.f9601m = tVar;
        this.f9602n = iVar2;
        this.f9603o = fVar2;
        this.f9604p = jVar;
        this.f9605q = cVar3;
        this.f9606r = eVar;
        this.f9607s = mVar;
        this.f9608t = mVar2;
        this.f9609u = fVar3;
        this.f9610v = iVar3;
    }
}
