package s0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final l[] f21828a;

    /* renamed from: d, reason: collision with root package name */
    public int f21829d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21830g = true;

    public d(k kVar, l[] lVarArr) {
        this.f21828a = lVarArr;
        lVarArr[0].a(kVar.f21844d, Integer.bitCount(kVar.f21841a) * 2, 0);
        this.f21829d = 0;
        a();
    }

    public final void a() {
        int i10 = this.f21829d;
        l[] lVarArr = this.f21828a;
        l lVar = lVarArr[i10];
        if (lVar.f21847g < lVar.f21846d) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                l lVar2 = lVarArr[i10];
                int i11 = lVar2.f21847g;
                Object[] objArr = lVar2.f21845a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    lVar2.f21847g = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f21829d = iB;
                return;
            }
            if (i10 > 0) {
                l lVar3 = lVarArr[i10 - 1];
                int i12 = lVar3.f21847g;
                int length2 = lVar3.f21845a.length;
                lVar3.f21847g = i12 + 1;
            }
            lVarArr[i10].a(k.f21840e.f21844d, 0, 0);
            i10--;
        }
        this.f21830g = false;
    }

    public final int b(int i10) {
        l[] lVarArr = this.f21828a;
        l lVar = lVarArr[i10];
        int i11 = lVar.f21847g;
        if (i11 < lVar.f21846d) {
            return i10;
        }
        Object[] objArr = lVar.f21845a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        br.l.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        k kVar = (k) obj;
        if (i10 == 6) {
            l lVar2 = lVarArr[i10 + 1];
            Object[] objArr2 = kVar.f21844d;
            lVar2.a(objArr2, objArr2.length, 0);
        } else {
            lVarArr[i10 + 1].a(kVar.f21844d, Integer.bitCount(kVar.f21841a) * 2, 0);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21830g;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f21830g) {
            throw new NoSuchElementException();
        }
        Object next = this.f21828a[this.f21829d].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
