package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f4316a;

    /* renamed from: b, reason: collision with root package name */
    public d f4317b;

    /* renamed from: c, reason: collision with root package name */
    public Set f4318c;

    /* renamed from: d, reason: collision with root package name */
    public a f4319d;

    /* renamed from: e, reason: collision with root package name */
    public int f4320e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f4321f;

    /* renamed from: g, reason: collision with root package name */
    public o2.a f4322g;

    /* renamed from: h, reason: collision with root package name */
    public t f4323h;

    /* renamed from: i, reason: collision with root package name */
    public n f4324i;

    /* renamed from: j, reason: collision with root package name */
    public f f4325j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f4326a;

        /* renamed from: b, reason: collision with root package name */
        public List f4327b;

        /* renamed from: c, reason: collision with root package name */
        public Network f4328c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f4326a = list;
            this.f4327b = list;
        }
    }

    public WorkerParameters(UUID uuid, d dVar, Collection collection, a aVar, int i10, Executor executor, o2.a aVar2, t tVar, n nVar, f fVar) {
        this.f4316a = uuid;
        this.f4317b = dVar;
        this.f4318c = new HashSet(collection);
        this.f4319d = aVar;
        this.f4320e = i10;
        this.f4321f = executor;
        this.f4322g = aVar2;
        this.f4323h = tVar;
        this.f4324i = nVar;
        this.f4325j = fVar;
    }

    public Executor a() {
        return this.f4321f;
    }

    public f b() {
        return this.f4325j;
    }

    public UUID c() {
        return this.f4316a;
    }

    public d d() {
        return this.f4317b;
    }

    public Network e() {
        return this.f4319d.f4328c;
    }

    public n f() {
        return this.f4324i;
    }

    public int g() {
        return this.f4320e;
    }

    public Set h() {
        return this.f4318c;
    }

    public o2.a i() {
        return this.f4322g;
    }

    public List j() {
        return this.f4319d.f4326a;
    }

    public List k() {
        return this.f4319d.f4327b;
    }

    public t l() {
        return this.f4323h;
    }
}
