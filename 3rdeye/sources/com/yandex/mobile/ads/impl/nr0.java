package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.RunnableC2009g;
import com.yandex.mobile.ads.impl.vb0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class nr0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final dp f30975a;

    /* renamed from: b, reason: collision with root package name */
    private final bf0 f30976b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f30977c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f30978d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f30979e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f30980f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30981g;

    public interface a<T> {
        void invoke(T t10);
    }

    public interface b<T> {
        void a(T t10, vb0 vb0Var);
    }

    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f30982a;

        /* renamed from: b, reason: collision with root package name */
        private vb0.a f30983b = new vb0.a();

        /* renamed from: c, reason: collision with root package name */
        private boolean f30984c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30985d;

        public c(T t10) {
            this.f30982a = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f30982a.equals(((c) obj).f30982a);
        }

        public final int hashCode() {
            return this.f30982a.hashCode();
        }
    }

    public nr0(Looper looper, dp dpVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dpVar, bVar);
    }

    public final void a(T t10) {
        if (this.f30981g) {
            return;
        }
        t10.getClass();
        this.f30978d.add(new c<>(t10));
    }

    private nr0(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, dp dpVar, b<T> bVar) {
        this.f30975a = dpVar;
        this.f30978d = copyOnWriteArraySet;
        this.f30977c = bVar;
        this.f30979e = new ArrayDeque<>();
        this.f30980f = new ArrayDeque<>();
        this.f30976b = dpVar.a(looper, new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.V2
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f24286b.a(message);
            }
        });
    }

    public final void b() {
        Iterator<c<T>> it = this.f30978d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f30977c;
            ((c) next).f30985d = true;
            if (((c) next).f30984c) {
                bVar.a(next.f30982a, ((c) next).f30983b.a());
            }
        }
        this.f30978d.clear();
        this.f30981g = true;
    }

    public final nr0<T> a(Looper looper, b<T> bVar) {
        return new nr0<>(this.f30978d, looper, this.f30975a, bVar);
    }

    public final void a() {
        if (this.f30980f.isEmpty()) {
            return;
        }
        if (!this.f30976b.b()) {
            bf0 bf0Var = this.f30976b;
            bf0Var.a(bf0Var.b(0));
        }
        boolean zIsEmpty = this.f30979e.isEmpty();
        this.f30979e.addAll(this.f30980f);
        this.f30980f.clear();
        if (zIsEmpty) {
            while (!this.f30979e.isEmpty()) {
                this.f30979e.peekFirst().run();
                this.f30979e.removeFirst();
            }
        }
    }

    public final void b(T t10) {
        Iterator<c<T>> it = this.f30978d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f30982a.equals(t10)) {
                b<T> bVar = this.f30977c;
                ((c) next).f30985d = true;
                if (((c) next).f30984c) {
                    bVar.a(next.f30982a, ((c) next).f30983b.a());
                }
                this.f30978d.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.f30978d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f30977c;
            if (!((c) next).f30985d && ((c) next).f30984c) {
                vb0 vb0VarA = ((c) next).f30983b.a();
                ((c) next).f30983b = new vb0.a();
                ((c) next).f30984c = false;
                bVar.a(next.f30982a, vb0VarA);
            }
            if (this.f30976b.b()) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.f30985d) {
                if (i != -1) {
                    cVar.f30983b.a(i);
                }
                cVar.f30984c = true;
                aVar.invoke(cVar.f30982a);
            }
        }
    }

    public final void a(int i, a<T> aVar) {
        this.f30980f.add(new RunnableC2009g(new CopyOnWriteArraySet(this.f30978d), i, 1, aVar));
    }
}
