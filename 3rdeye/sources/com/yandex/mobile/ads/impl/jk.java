package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kw0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class jk implements jw0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<jw0.c> f29173a = new ArrayList<>(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<jw0.c> f29174b = new HashSet<>(1);

    /* renamed from: c, reason: collision with root package name */
    private final kw0.a f29175c = new kw0.a();

    /* renamed from: d, reason: collision with root package name */
    private final c40.a f29176d = new c40.a();

    /* renamed from: e, reason: collision with root package name */
    private Looper f29177e;

    /* renamed from: f, reason: collision with root package name */
    private v42 f29178f;

    /* renamed from: g, reason: collision with root package name */
    private gi1 f29179g;

    public void a() {
    }

    public abstract void a(q62 q62Var);

    public void b() {
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void c(jw0.c cVar) {
        this.f29177e.getClass();
        boolean zIsEmpty = this.f29174b.isEmpty();
        this.f29174b.add(cVar);
        if (zIsEmpty) {
            b();
        }
    }

    public final boolean d() {
        return !this.f29174b.isEmpty();
    }

    public abstract void e();

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(Handler handler, c40 c40Var) {
        this.f29176d.a(handler, c40Var);
    }

    public final kw0.a b(int i, jw0.b bVar) {
        return this.f29175c.a(i, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(Handler handler, kw0 kw0Var) {
        this.f29175c.a(handler, kw0Var);
    }

    public final kw0.a b(jw0.b bVar) {
        return this.f29175c.a(0, bVar);
    }

    public final c40.a a(int i, jw0.b bVar) {
        return this.f29176d.a(i, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void b(jw0.c cVar) {
        boolean zIsEmpty = this.f29174b.isEmpty();
        this.f29174b.remove(cVar);
        if (zIsEmpty || !this.f29174b.isEmpty()) {
            return;
        }
        a();
    }

    public final c40.a a(jw0.b bVar) {
        return this.f29176d.a(0, bVar);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(jw0.c cVar, q62 q62Var, gi1 gi1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f29177e;
        if (looper != null && looper != looperMyLooper) {
            throw new IllegalArgumentException();
        }
        this.f29179g = gi1Var;
        v42 v42Var = this.f29178f;
        this.f29173a.add(cVar);
        if (this.f29177e == null) {
            this.f29177e = looperMyLooper;
            this.f29174b.add(cVar);
            a(q62Var);
        } else if (v42Var != null) {
            c(cVar);
            cVar.a(this, v42Var);
        }
    }

    public final gi1 c() {
        gi1 gi1Var = this.f29179g;
        if (gi1Var != null) {
            return gi1Var;
        }
        throw new IllegalStateException();
    }

    public final void a(v42 v42Var) {
        this.f29178f = v42Var;
        Iterator<jw0.c> it = this.f29173a.iterator();
        while (it.hasNext()) {
            it.next().a(this, v42Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(jw0.c cVar) {
        this.f29173a.remove(cVar);
        if (this.f29173a.isEmpty()) {
            this.f29177e = null;
            this.f29178f = null;
            this.f29179g = null;
            this.f29174b.clear();
            e();
            return;
        }
        b(cVar);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(c40 c40Var) {
        this.f29176d.e(c40Var);
    }

    @Override // com.yandex.mobile.ads.impl.jw0
    public final void a(kw0 kw0Var) {
        this.f29175c.a(kw0Var);
    }
}
