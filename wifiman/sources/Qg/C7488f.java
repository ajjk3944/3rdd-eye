package qg;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import yg.C8671f;

/* renamed from: qg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7488f extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final Dj.a[] f58969b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f58970c;

    /* renamed from: qg.f$a */
    static final class a extends C8671f implements gg.l {

        /* renamed from: i, reason: collision with root package name */
        final Dj.b f58971i;

        /* renamed from: j, reason: collision with root package name */
        final Dj.a[] f58972j;

        /* renamed from: k, reason: collision with root package name */
        final boolean f58973k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicInteger f58974l;

        /* renamed from: m, reason: collision with root package name */
        int f58975m;

        /* renamed from: n, reason: collision with root package name */
        List f58976n;

        /* renamed from: o, reason: collision with root package name */
        long f58977o;

        a(Dj.a[] aVarArr, boolean z10, Dj.b bVar) {
            super(false);
            this.f58971i = bVar;
            this.f58972j = aVarArr;
            this.f58973k = z10;
            this.f58974l = new AtomicInteger();
        }

        @Override // Dj.b
        public void a() {
            if (this.f58974l.getAndIncrement() == 0) {
                Dj.a[] aVarArr = this.f58972j;
                int length = aVarArr.length;
                int i10 = this.f58975m;
                while (i10 != length) {
                    Dj.a aVar = aVarArr[i10];
                    if (aVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.f58973k) {
                            this.f58971i.onError(nullPointerException);
                            return;
                        }
                        List arrayList = this.f58976n;
                        if (arrayList == null) {
                            arrayList = new ArrayList((length - i10) + 1);
                            this.f58976n = arrayList;
                        }
                        arrayList.add(nullPointerException);
                        i10++;
                    } else {
                        long j10 = this.f58977o;
                        if (j10 != 0) {
                            this.f58977o = 0L;
                            p(j10);
                        }
                        aVar.b(this);
                        i10++;
                        this.f58975m = i10;
                        if (this.f58974l.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List list = this.f58976n;
                if (list == null) {
                    this.f58971i.a();
                } else if (list.size() == 1) {
                    this.f58971i.onError((Throwable) list.get(0));
                } else {
                    this.f58971i.onError(new CompositeException(list));
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f58977o++;
            this.f58971i.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (!this.f58973k) {
                this.f58971i.onError(th2);
                return;
            }
            List arrayList = this.f58976n;
            if (arrayList == null) {
                arrayList = new ArrayList((this.f58972j.length - this.f58975m) + 1);
                this.f58976n = arrayList;
            }
            arrayList.add(th2);
            a();
        }
    }

    public C7488f(Dj.a[] aVarArr, boolean z10) {
        this.f58969b = aVarArr;
        this.f58970c = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(this.f58969b, this.f58970c, bVar);
        bVar.j(aVar);
        aVar.a();
    }
}
