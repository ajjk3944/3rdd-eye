package fb;

import a5.d0;
import dd.s;
import gb.k;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import qb.v;

/* loaded from: classes.dex */
public abstract class j implements eb.f, n6.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8812a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f8813b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f8814c;

    /* renamed from: d, reason: collision with root package name */
    public final PriorityQueue f8815d;

    /* renamed from: e, reason: collision with root package name */
    public long f8816e;

    /* renamed from: f, reason: collision with root package name */
    public long f8817f;

    /* renamed from: g, reason: collision with root package name */
    public Comparable f8818g;

    public j(int i10) {
        this.f8812a = i10;
        switch (i10) {
            case 1:
                this.f8813b = new ArrayDeque();
                for (int i11 = 0; i11 < 10; i11++) {
                    this.f8813b.add(new o6.g(1));
                }
                this.f8814c = new ArrayDeque();
                for (int i12 = 0; i12 < 2; i12++) {
                    ArrayDeque arrayDeque = this.f8814c;
                    io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(19, this);
                    n6.a aVar = new n6.a();
                    aVar.B = eVar;
                    arrayDeque.add(aVar);
                }
                this.f8815d = new PriorityQueue();
                break;
            default:
                this.f8813b = new ArrayDeque();
                for (int i13 = 0; i13 < 10; i13++) {
                    this.f8813b.add(new h(1));
                }
                this.f8814c = new ArrayDeque();
                for (int i14 = 0; i14 < 2; i14++) {
                    ArrayDeque arrayDeque2 = this.f8814c;
                    bf.a aVar2 = new bf.a(19, this);
                    i iVar = new i(4);
                    iVar.f8811y = aVar2;
                    arrayDeque2.add(iVar);
                }
                this.f8815d = new PriorityQueue();
                break;
        }
    }

    @Override // eb.f, n6.c
    public final void a(long j) {
        switch (this.f8812a) {
            case 0:
                this.f8816e = j;
                break;
            default:
                this.f8816e = j;
                break;
        }
    }

    @Override // z9.a, c5.d
    public final Object c() {
        switch (this.f8812a) {
            case 0:
                qb.b.j(((h) this.f8818g) == null);
                ArrayDeque arrayDeque = this.f8813b;
                if (arrayDeque.isEmpty()) {
                    return null;
                }
                h hVar = (h) arrayDeque.pollFirst();
                this.f8818g = hVar;
                return hVar;
            default:
                a5.a.i(((o6.g) this.f8818g) == null);
                ArrayDeque arrayDeque2 = this.f8813b;
                if (arrayDeque2.isEmpty()) {
                    return null;
                }
                o6.g gVar = (o6.g) arrayDeque2.pollFirst();
                this.f8818g = gVar;
                return gVar;
        }
    }

    @Override // z9.a
    public void d(eb.i iVar) {
        qb.b.g(iVar == ((h) this.f8818g));
        h hVar = (h) iVar;
        if (hVar.g(Integer.MIN_VALUE)) {
            hVar.p();
            this.f8813b.add(hVar);
        } else {
            long j = this.f8817f;
            this.f8817f = 1 + j;
            hVar.F = j;
            this.f8815d.add(hVar);
        }
        this.f8818g = null;
    }

    @Override // c5.d
    public void e(n6.e eVar) {
        a5.a.e(eVar == ((o6.g) this.f8818g));
        o6.g gVar = (o6.g) eVar;
        if (gVar.g(Integer.MIN_VALUE)) {
            gVar.p();
            this.f8813b.add(gVar);
        } else {
            long j = this.f8817f;
            this.f8817f = 1 + j;
            gVar.F = j;
            this.f8815d.add(gVar);
        }
        this.f8818g = null;
    }

    public abstract s f();

    @Override // z9.a, c5.d
    public void flush() {
        int i10 = this.f8812a;
        PriorityQueue priorityQueue = this.f8815d;
        ArrayDeque arrayDeque = this.f8813b;
        switch (i10) {
            case 0:
                this.f8817f = 0L;
                this.f8816e = 0L;
                while (!priorityQueue.isEmpty()) {
                    h hVar = (h) priorityQueue.poll();
                    int i11 = v.f20828a;
                    hVar.p();
                    arrayDeque.add(hVar);
                }
                h hVar2 = (h) this.f8818g;
                if (hVar2 != null) {
                    hVar2.p();
                    arrayDeque.add(hVar2);
                    this.f8818g = null;
                    break;
                }
                break;
            default:
                this.f8817f = 0L;
                this.f8816e = 0L;
                while (!priorityQueue.isEmpty()) {
                    o6.g gVar = (o6.g) priorityQueue.poll();
                    int i12 = d0.f105a;
                    gVar.p();
                    arrayDeque.add(gVar);
                }
                o6.g gVar2 = (o6.g) this.f8818g;
                if (gVar2 != null) {
                    gVar2.p();
                    arrayDeque.add(gVar2);
                    this.f8818g = null;
                    break;
                }
                break;
        }
    }

    public abstract k g();

    public abstract void h(h hVar);

    public abstract void i(o6.g gVar);

    @Override // z9.a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public eb.j b() {
        ArrayDeque arrayDeque = this.f8814c;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f8815d;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            h hVar = (h) priorityQueue.peek();
            int i10 = v.f20828a;
            if (hVar.f26793y > this.f8816e) {
                return null;
            }
            h hVar2 = (h) priorityQueue.poll();
            boolean zG = hVar2.g(4);
            ArrayDeque arrayDeque2 = this.f8813b;
            if (zG) {
                eb.j jVar = (eb.j) arrayDeque.pollFirst();
                jVar.f3295d = 4 | jVar.f3295d;
                hVar2.p();
                arrayDeque2.add(hVar2);
                return jVar;
            }
            h(hVar2);
            if (l()) {
                s sVarF = f();
                eb.j jVar2 = (eb.j) arrayDeque.pollFirst();
                long j = hVar2.f26793y;
                jVar2.f26799g = j;
                jVar2.f8084r = sVarF;
                jVar2.f8085x = j;
                hVar2.p();
                arrayDeque2.add(hVar2);
                return jVar2;
            }
            hVar2.p();
            arrayDeque2.add(hVar2);
        }
    }

    @Override // z9.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public n6.a b() {
        ArrayDeque arrayDeque = this.f8814c;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f8815d;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            o6.g gVar = (o6.g) priorityQueue.peek();
            int i10 = d0.f105a;
            if (gVar.f3308y > this.f8816e) {
                return null;
            }
            o6.g gVar2 = (o6.g) priorityQueue.poll();
            boolean zG = gVar2.g(4);
            ArrayDeque arrayDeque2 = this.f8813b;
            if (zG) {
                n6.a aVar = (n6.a) arrayDeque.pollFirst();
                aVar.b(4);
                gVar2.p();
                arrayDeque2.add(gVar2);
                return aVar;
            }
            i(gVar2);
            if (l()) {
                k kVarG = g();
                n6.a aVar2 = (n6.a) arrayDeque.pollFirst();
                aVar2.q(gVar2.f3308y, kVarG, Long.MAX_VALUE);
                gVar2.p();
                arrayDeque2.add(gVar2);
                return aVar2;
            }
            gVar2.p();
            arrayDeque2.add(gVar2);
        }
    }

    public abstract boolean l();

    @Override // z9.a, c5.d
    public void release() {
        int i10 = this.f8812a;
    }

    private void m() {
    }

    private void n() {
    }
}
