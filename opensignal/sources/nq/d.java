package nq;

import br.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends k4.c implements Iterator, cr.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f18501x;

    public d(f fVar, int i10) {
        this.f18501x = i10;
        l.e(fVar, "map");
        this.f14040r = fVar;
        this.f14038d = -1;
        this.f14039g = fVar.D;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18501x) {
            case 0:
                b();
                int i10 = this.f14037a;
                f fVar = (f) this.f14040r;
                if (i10 >= fVar.f18510y) {
                    throw new NoSuchElementException();
                }
                this.f14037a = i10 + 1;
                this.f14038d = i10;
                e eVar = new e(fVar, i10);
                e();
                return eVar;
            case 1:
                b();
                int i11 = this.f14037a;
                f fVar2 = (f) this.f14040r;
                if (i11 >= fVar2.f18510y) {
                    throw new NoSuchElementException();
                }
                this.f14037a = i11 + 1;
                this.f14038d = i11;
                Object obj = fVar2.f18505a[i11];
                e();
                return obj;
            default:
                b();
                int i12 = this.f14037a;
                f fVar3 = (f) this.f14040r;
                if (i12 >= fVar3.f18510y) {
                    throw new NoSuchElementException();
                }
                this.f14037a = i12 + 1;
                this.f14038d = i12;
                Object[] objArr = fVar3.f18506d;
                l.b(objArr);
                Object obj2 = objArr[this.f14038d];
                e();
                return obj2;
        }
    }
}
