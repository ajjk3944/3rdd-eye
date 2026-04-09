package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.z32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public final class y32 {

    /* renamed from: a, reason: collision with root package name */
    private final z32 f35612a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35613b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35614c;

    /* renamed from: d, reason: collision with root package name */
    private v32 f35615d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f35616e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35617f;

    public y32(z32 taskRunner, String name) {
        kotlin.jvm.internal.l.f(taskRunner, "taskRunner");
        kotlin.jvm.internal.l.f(name, "name");
        this.f35612a = taskRunner;
        this.f35613b = name;
        this.f35616e = new ArrayList();
    }

    public final void a(v32 task, long j4) {
        kotlin.jvm.internal.l.f(task, "task");
        synchronized (this.f35612a) {
            if (!this.f35614c) {
                if (a(task, j4, false)) {
                    this.f35612a.a(this);
                }
                C1992A c1992a = C1992A.f18074a;
            } else if (task.a()) {
                if (z32.i.isLoggable(Level.FINE)) {
                    w32.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (z32.i.isLoggable(Level.FINE)) {
                    w32.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean b() {
        v32 v32Var = this.f35615d;
        if (v32Var != null && v32Var.a()) {
            this.f35617f = true;
        }
        boolean z10 = false;
        for (int size = this.f35616e.size() - 1; -1 < size; size--) {
            if (((v32) this.f35616e.get(size)).a()) {
                v32 v32Var2 = (v32) this.f35616e.get(size);
                if (z32.i.isLoggable(Level.FINE)) {
                    w32.b(v32Var2, this, "canceled");
                }
                this.f35616e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final v32 c() {
        return this.f35615d;
    }

    public final boolean d() {
        return this.f35617f;
    }

    public final ArrayList e() {
        return this.f35616e;
    }

    public final String f() {
        return this.f35613b;
    }

    public final boolean g() {
        return this.f35614c;
    }

    public final z32 h() {
        return this.f35612a;
    }

    public final void i() {
        this.f35617f = false;
    }

    public final void j() {
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f35612a) {
            try {
                this.f35614c = true;
                if (b()) {
                    this.f35612a.a(this);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f35613b;
    }

    public final boolean a(v32 task, long j4, boolean z10) {
        String strD;
        kotlin.jvm.internal.l.f(task, "task");
        task.a(this);
        long jA = this.f35612a.d().a();
        long j10 = jA + j4;
        int iIndexOf = this.f35616e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.c() <= j10) {
                z32 z32Var = z32.f36157h;
                if (z32.b.a().isLoggable(Level.FINE)) {
                    w32.b(task, this, "already scheduled");
                }
                return false;
            }
            this.f35616e.remove(iIndexOf);
        }
        task.a(j10);
        z32 z32Var2 = z32.f36157h;
        if (z32.b.a().isLoggable(Level.FINE)) {
            if (z10) {
                strD = androidx.work.s.d("run again after ", w32.a(j10 - jA));
            } else {
                strD = androidx.work.s.d("scheduled after ", w32.a(j10 - jA));
            }
            w32.b(task, this, strD);
        }
        Iterator it = this.f35616e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((v32) it.next()).c() - jA > j4) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f35616e.size();
        }
        this.f35616e.add(size, task);
        return size == 0;
    }

    public final void a(v32 v32Var) {
        this.f35615d = v32Var;
    }

    public final void a() {
        if (t82.f33485f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f35612a) {
            try {
                if (b()) {
                    this.f35612a.a(this);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
