package n6;

import fb.j;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c5.a implements b {
    public Object B;

    /* renamed from: g, reason: collision with root package name */
    public long f17382g;

    /* renamed from: r, reason: collision with root package name */
    public b f17383r;

    /* renamed from: x, reason: collision with root package name */
    public long f17384x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f17385y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a() {
        super(0);
        this.f17385y = 1;
    }

    @Override // n6.b
    public final int a(long j) {
        b bVar = this.f17383r;
        bVar.getClass();
        return bVar.a(j - this.f17384x);
    }

    @Override // n6.b
    public final long e(int i10) {
        b bVar = this.f17383r;
        bVar.getClass();
        return bVar.e(i10) + this.f17384x;
    }

    @Override // n6.b
    public final List f(long j) {
        b bVar = this.f17383r;
        bVar.getClass();
        return bVar.f(j - this.f17384x);
    }

    @Override // n6.b
    public final int h() {
        b bVar = this.f17383r;
        bVar.getClass();
        return bVar.h();
    }

    public final void p() {
        switch (this.f17385y) {
            case 0:
                eb.c cVar = (eb.c) this.B;
                synchronized (cVar.f8072b) {
                    this.f3295d = 0;
                    this.f17383r = null;
                    a[] aVarArr = (a[]) cVar.k;
                    int i10 = cVar.f8076f;
                    cVar.f8076f = i10 + 1;
                    aVarArr[i10] = this;
                    if (!cVar.f8073c.isEmpty() && cVar.f8076f > 0) {
                        cVar.f8072b.notify();
                    }
                }
                return;
            case 1:
                j jVar = (j) ((io.sentry.android.replay.capture.e) this.B).f11882d;
                this.f3295d = 0;
                this.f17383r = null;
                jVar.f8814c.add(this);
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) ((bc.j) this.B).f2613e;
                a5.a.i(arrayDeque.size() < 2);
                a5.a.e(!arrayDeque.contains(this));
                this.f3295d = 0;
                this.f17383r = null;
                arrayDeque.addFirst(this);
                return;
        }
    }

    public final void q(long j, b bVar, long j7) {
        this.f17382g = j;
        this.f17383r = bVar;
        if (j7 != Long.MAX_VALUE) {
            j = j7;
        }
        this.f17384x = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i10) {
        super(0);
        this.f17385y = i10;
        this.B = cVar;
    }
}
