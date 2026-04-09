package com.staircase3.opensignal.goldstar.persistence;

import android.database.Cursor;
import android.os.Looper;
import bm.a;
import br.l;
import i7.h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import mq.w;
import mq.x;
import mq.y;
import o7.d;
import o7.e;
import p7.b;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000:\u0001\u0003B\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/staircase3/opensignal/goldstar/persistence/OpensignalDatabase;", "<init>", "()V", "ic/a", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class OpensignalDatabase {
    public static OpensignalDatabase k;

    /* renamed from: a, reason: collision with root package name */
    public volatile b f6075a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f6076b;

    /* renamed from: c, reason: collision with root package name */
    public o7.b f6077c;

    /* renamed from: e, reason: collision with root package name */
    public List f6079e;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f6083i;
    public static final Object j = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final a f6071l = new a(34, 35, 0);

    /* renamed from: m, reason: collision with root package name */
    public static final a f6072m = new a(35, 36, 1);

    /* renamed from: n, reason: collision with root package name */
    public static final a f6073n = new a(36, 37, 2);

    /* renamed from: o, reason: collision with root package name */
    public static final a f6074o = new a(37, 38, 3);

    /* renamed from: d, reason: collision with root package name */
    public final h f6078d = d();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f6080f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantReadWriteLock f6081g = new ReentrantReadWriteLock();

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f6082h = new ThreadLocal();

    public OpensignalDatabase() {
        l.d(Collections.synchronizedMap(new LinkedHashMap()), "synchronizedMap(mutableMapOf())");
        this.f6083i = new LinkedHashMap();
    }

    public static Object m(Class cls, o7.b bVar) {
        if (cls.isInstance(bVar)) {
            return bVar;
        }
        if (bVar instanceof i7.b) {
            return m(cls, ((i7.b) bVar).b());
        }
        return null;
    }

    public final void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().I().X() && this.f6082h.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final e c(String str) {
        l.e(str, "sql");
        a();
        b();
        return g().I().o(str);
    }

    public abstract h d();

    public abstract o7.b e(f7.a aVar);

    public List f(Map map) {
        l.e(map, "autoMigrationSpecs");
        return w.f16945a;
    }

    public final o7.b g() {
        o7.b bVar = this.f6077c;
        if (bVar != null) {
            return bVar;
        }
        l.l("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return y.f16947a;
    }

    public Map i() {
        return x.f16946a;
    }

    public final void j() {
        g().I().K();
        if (g().I().X()) {
            return;
        }
        h hVar = this.f6078d;
        if (hVar.f11256e.compareAndSet(false, true)) {
            Executor executor = hVar.f11252a.f6076b;
            if (executor != null) {
                executor.execute(hVar.f11261l);
            } else {
                l.l("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final Cursor k(d dVar) {
        a();
        b();
        return g().I().t(dVar);
    }

    public abstract bm.d l();

    public abstract bm.e n();
}
