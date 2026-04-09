package w1;

import F1.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import f9.InterfaceC4350h;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import w1.k;

/* compiled from: DatabaseConfiguration.android.kt */
/* renamed from: w1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5716b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47198a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47199b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0026c f47200c;

    /* renamed from: d, reason: collision with root package name */
    public final k.d f47201d;

    /* renamed from: e, reason: collision with root package name */
    public final List<k.b> f47202e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47203f;

    /* renamed from: g, reason: collision with root package name */
    public final k.c f47204g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f47205h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final Intent f47206j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f47207k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f47208l;

    /* renamed from: m, reason: collision with root package name */
    public final Set<Integer> f47209m;

    /* renamed from: n, reason: collision with root package name */
    public final String f47210n;

    /* renamed from: o, reason: collision with root package name */
    public final File f47211o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable<InputStream> f47212p;

    /* renamed from: q, reason: collision with root package name */
    public final List<Object> f47213q;

    /* renamed from: r, reason: collision with root package name */
    public final List<Object> f47214r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f47215s;

    /* renamed from: t, reason: collision with root package name */
    public final E1.b f47216t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4350h f47217u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f47218v;

    @SuppressLint({"LambdaLast"})
    public C5716b(Context context, String str, c.InterfaceC0026c interfaceC0026c, k.d migrationContainer, List list, boolean z10, k.c journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z13, E1.b bVar, InterfaceC4350h interfaceC4350h) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.l.f(journalMode, "journalMode");
        kotlin.jvm.internal.l.f(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.l.f(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.l.f(typeConverters, "typeConverters");
        kotlin.jvm.internal.l.f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f47198a = context;
        this.f47199b = str;
        this.f47200c = interfaceC0026c;
        this.f47201d = migrationContainer;
        this.f47202e = list;
        this.f47203f = z10;
        this.f47204g = journalMode;
        this.f47205h = queryExecutor;
        this.i = transactionExecutor;
        this.f47206j = intent;
        this.f47207k = z11;
        this.f47208l = z12;
        this.f47209m = set;
        this.f47210n = str2;
        this.f47211o = file;
        this.f47212p = callable;
        this.f47213q = typeConverters;
        this.f47214r = autoMigrationSpecs;
        this.f47215s = z13;
        this.f47216t = bVar;
        this.f47217u = interfaceC4350h;
        this.f47218v = true;
    }
}
