package qg;

import java.util.NoSuchElementException;
import yg.AbstractC8668c;
import yg.EnumC8672g;

/* renamed from: qg.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7499q extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59198c;

    /* renamed from: d, reason: collision with root package name */
    final Object f59199d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f59200e;

    /* renamed from: qg.q$a */
    static final class a extends AbstractC8668c implements gg.l {

        /* renamed from: c, reason: collision with root package name */
        final long f59201c;

        /* renamed from: d, reason: collision with root package name */
        final Object f59202d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f59203e;

        /* renamed from: f, reason: collision with root package name */
        Dj.c f59204f;

        /* renamed from: g, reason: collision with root package name */
        long f59205g;

        /* renamed from: h, reason: collision with root package name */
        boolean f59206h;

        a(Dj.b bVar, long j10, Object obj, boolean z10) {
            super(bVar);
            this.f59201c = j10;
            this.f59202d = obj;
            this.f59203e = z10;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59206h) {
                return;
            }
            this.f59206h = true;
            Object obj = this.f59202d;
            if (obj != null) {
                d(obj);
            } else if (this.f59203e) {
                this.f66766a.onError(new NoSuchElementException());
            } else {
                this.f66766a.a();
            }
        }

        @Override // yg.AbstractC8668c, Dj.c
        public void cancel() {
            super.cancel();
            this.f59204f.cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59206h) {
                return;
            }
            long j10 = this.f59205g;
            if (j10 != this.f59201c) {
                this.f59205g = j10 + 1;
                return;
            }
            this.f59206h = true;
            this.f59204f.cancel();
            d(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59204f, cVar)) {
                this.f59204f = cVar;
                this.f66766a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59206h) {
                Eg.a.v(th2);
            } else {
                this.f59206h = true;
                this.f66766a.onError(th2);
            }
        }
    }

    public C7499q(gg.i iVar, long j10, Object obj, boolean z10) {
        super(iVar);
        this.f59198c = j10;
        this.f59199d = obj;
        this.f59200e = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59198c, this.f59199d, this.f59200e));
    }
}
