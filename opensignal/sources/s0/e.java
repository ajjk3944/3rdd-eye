package s0;

import br.b0;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class e extends d {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public final v0.g f21831r;

    /* renamed from: x, reason: collision with root package name */
    public Object f21832x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21833y;

    public e(v0.g gVar, l[] lVarArr) {
        super(gVar.f23743d, lVarArr);
        this.f21831r = gVar;
        this.B = gVar.f23745r;
    }

    public final void c(int i10, k kVar, Object obj, int i11) {
        int i12 = i11 * 5;
        l[] lVarArr = this.f21828a;
        if (i12 <= 30) {
            int iH = 1 << se.b.H(i10, i12);
            if (kVar.h(iH)) {
                lVarArr[i11].a(kVar.f21844d, Integer.bitCount(kVar.f21841a) * 2, kVar.f(iH));
                this.f21829d = i11;
                return;
            } else {
                int iT = kVar.t(iH);
                k kVarS = kVar.s(iT);
                lVarArr[i11].a(kVar.f21844d, Integer.bitCount(kVar.f21841a) * 2, iT);
                c(i10, kVarS, obj, i11 + 1);
                return;
            }
        }
        l lVar = lVarArr[i11];
        Object[] objArr = kVar.f21844d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            l lVar2 = lVarArr[i11];
            if (br.l.a(lVar2.f21845a[lVar2.f21847g], obj)) {
                this.f21829d = i11;
                return;
            } else {
                lVarArr[i11].f21847g += 2;
            }
        }
    }

    @Override // s0.d, java.util.Iterator
    public final Object next() {
        if (this.f21831r.f23745r != this.B) {
            throw new ConcurrentModificationException();
        }
        if (!this.f21830g) {
            throw new NoSuchElementException();
        }
        l lVar = this.f21828a[this.f21829d];
        this.f21832x = lVar.f21845a[lVar.f21847g];
        this.f21833y = true;
        return super.next();
    }

    @Override // s0.d, java.util.Iterator
    public final void remove() {
        if (!this.f21833y) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f21830g;
        v0.g gVar = this.f21831r;
        if (!z10) {
            b0.a(gVar).remove(this.f21832x);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            l lVar = this.f21828a[this.f21829d];
            Object obj = lVar.f21845a[lVar.f21847g];
            b0.a(gVar).remove(this.f21832x);
            c(obj != null ? obj.hashCode() : 0, gVar.f23743d, obj, 0);
        }
        this.f21832x = null;
        this.f21833y = false;
        this.B = gVar.f23745r;
    }
}
