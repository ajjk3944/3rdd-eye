package t5;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34172b;

    /* renamed from: c, reason: collision with root package name */
    public final e6.b f34173c;

    /* renamed from: d, reason: collision with root package name */
    public final km.y f34174d;

    /* renamed from: e, reason: collision with root package name */
    public final List f34175e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34176f;
    public final r g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f34177h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f34178i;
    public final Intent j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f34179k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f34180l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f34181m;

    /* renamed from: n, reason: collision with root package name */
    public final String f34182n;

    /* renamed from: o, reason: collision with root package name */
    public final File f34183o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f34184p;

    /* renamed from: q, reason: collision with root package name */
    public final List f34185q;

    /* renamed from: r, reason: collision with root package name */
    public final List f34186r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f34187s;

    /* renamed from: t, reason: collision with root package name */
    public final d6.b f34188t;

    /* renamed from: u, reason: collision with root package name */
    public final ck.h f34189u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34190v;

    public a(Context context, String str, e6.b bVar, km.y yVar, List list, boolean z3, r rVar, Executor executor, Executor executor2, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, List list2, List list3, boolean z12, d6.b bVar2, ck.h hVar) {
        nk.k.e(context, "context");
        nk.k.e(yVar, "migrationContainer");
        nk.k.e(executor, "queryExecutor");
        nk.k.e(executor2, "transactionExecutor");
        nk.k.e(list2, "typeConverters");
        nk.k.e(list3, "autoMigrationSpecs");
        this.f34171a = context;
        this.f34172b = str;
        this.f34173c = bVar;
        this.f34174d = yVar;
        this.f34175e = list;
        this.f34176f = z3;
        this.g = rVar;
        this.f34177h = executor;
        this.f34178i = executor2;
        this.j = intent;
        this.f34179k = z10;
        this.f34180l = z11;
        this.f34181m = set;
        this.f34182n = str2;
        this.f34183o = file;
        this.f34184p = callable;
        this.f34185q = list2;
        this.f34186r = list3;
        this.f34187s = z12;
        this.f34188t = bVar2;
        this.f34189u = hVar;
        this.f34190v = true;
    }
}
