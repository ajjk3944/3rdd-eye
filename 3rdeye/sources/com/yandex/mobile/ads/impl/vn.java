package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ny;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
abstract class vn implements c32 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a> f34624a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<g32> f34625b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityQueue<a> f34626c;

    /* renamed from: d, reason: collision with root package name */
    private a f34627d;

    /* renamed from: e, reason: collision with root package name */
    private long f34628e;

    /* renamed from: f, reason: collision with root package name */
    private long f34629f;

    public static final class a extends f32 implements Comparable<a> {

        /* renamed from: k, reason: collision with root package name */
        private long f34630k;

        public /* synthetic */ a(int i) {
            this();
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a aVar2 = aVar;
            if (f() != aVar2.f()) {
                return f() ? 1 : -1;
            }
            long j4 = this.f30574f - aVar2.f30574f;
            if (j4 == 0) {
                j4 = this.f34630k - aVar2.f34630k;
                if (j4 == 0) {
                    return 0;
                }
            }
            return j4 > 0 ? 1 : -1;
        }

        private a() {
        }
    }

    public static final class b extends g32 {

        /* renamed from: f, reason: collision with root package name */
        private ny.a<b> f34631f;

        public b(ny.a<b> aVar) {
            this.f34631f = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.ny
        public final void h() {
            this.f34631f.a(this);
        }
    }

    public vn() {
        int i = 0;
        for (int i10 = 0; i10 < 10; i10++) {
            this.f34624a.add(new a(i));
        }
        this.f34625b = new ArrayDeque<>();
        while (i < 2) {
            this.f34625b.add(new b(new K0(this, 3)));
            i++;
        }
        this.f34626c = new PriorityQueue<>();
    }

    public abstract void b(f32 f32Var);

    public abstract b32 c();

    @Override // com.yandex.mobile.ads.impl.jy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(f32 f32Var) throws d32 {
        if (f32Var != this.f34627d) {
            throw new IllegalArgumentException();
        }
        a aVar = (a) f32Var;
        if (aVar.e()) {
            aVar.b();
            this.f34624a.add(aVar);
        } else {
            long j4 = this.f34629f;
            this.f34629f = 1 + j4;
            aVar.f34630k = j4;
            this.f34626c.add(aVar);
        }
        this.f34627d = null;
    }

    @Override // com.yandex.mobile.ads.impl.jy
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f32 b() throws d32 {
        if (this.f34627d != null) {
            throw new IllegalStateException();
        }
        if (this.f34624a.isEmpty()) {
            return null;
        }
        a aVarPollFirst = this.f34624a.pollFirst();
        this.f34627d = aVarPollFirst;
        return aVarPollFirst;
    }

    @Override // com.yandex.mobile.ads.impl.jy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g32 a() throws d32 {
        if (this.f34625b.isEmpty()) {
            return null;
        }
        while (!this.f34626c.isEmpty()) {
            a aVarPeek = this.f34626c.peek();
            int i = s82.f32899a;
            if (aVarPeek.f30574f > this.f34628e) {
                break;
            }
            a aVarPoll = this.f34626c.poll();
            if (aVarPoll.f()) {
                g32 g32VarPollFirst = this.f34625b.pollFirst();
                g32VarPollFirst.b(4);
                aVarPoll.b();
                this.f34624a.add(aVarPoll);
                return g32VarPollFirst;
            }
            b(aVarPoll);
            if (h()) {
                b32 b32VarC = c();
                g32 g32VarPollFirst2 = this.f34625b.pollFirst();
                g32VarPollFirst2.a(aVarPoll.f30574f, b32VarC, Long.MAX_VALUE);
                aVarPoll.b();
                this.f34624a.add(aVarPoll);
                return g32VarPollFirst2;
            }
            aVarPoll.b();
            this.f34624a.add(aVarPoll);
        }
        return null;
    }

    public final g32 f() {
        return this.f34625b.pollFirst();
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public void flush() {
        this.f34629f = 0L;
        this.f34628e = 0L;
        while (!this.f34626c.isEmpty()) {
            a aVarPoll = this.f34626c.poll();
            int i = s82.f32899a;
            aVarPoll.b();
            this.f34624a.add(aVarPoll);
        }
        a aVar = this.f34627d;
        if (aVar != null) {
            aVar.b();
            this.f34624a.add(aVar);
            this.f34627d = null;
        }
    }

    public final long g() {
        return this.f34628e;
    }

    public abstract boolean h();

    public final void a(g32 g32Var) {
        g32Var.b();
        this.f34625b.add(g32Var);
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public void a(long j4) {
        this.f34628e = j4;
    }
}
