package z0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final k[] f37805a;

    /* renamed from: b, reason: collision with root package name */
    public int f37806b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37807c = true;

    public c(j jVar, k[] kVarArr) {
        this.f37805a = kVarArr;
        kVarArr[0].a(jVar.f37825d, Integer.bitCount(jVar.f37822a) * 2, 0);
        this.f37806b = 0;
        a();
    }

    public final void a() {
        int i4 = this.f37806b;
        k[] kVarArr = this.f37805a;
        k kVar = kVarArr[i4];
        if (kVar.f37828c < kVar.f37827b) {
            return;
        }
        while (-1 < i4) {
            int iB = b(i4);
            if (iB == -1) {
                k kVar2 = kVarArr[i4];
                int i10 = kVar2.f37828c;
                Object[] objArr = kVar2.f37826a;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    kVar2.f37828c = i10 + 1;
                    iB = b(i4);
                }
            }
            if (iB != -1) {
                this.f37806b = iB;
                return;
            }
            if (i4 > 0) {
                k kVar3 = kVarArr[i4 - 1];
                int i11 = kVar3.f37828c;
                int length2 = kVar3.f37826a.length;
                kVar3.f37828c = i11 + 1;
            }
            kVarArr[i4].a(j.f37821e.f37825d, 0, 0);
            i4--;
        }
        this.f37807c = false;
    }

    public final int b(int i4) {
        k[] kVarArr = this.f37805a;
        k kVar = kVarArr[i4];
        int i10 = kVar.f37828c;
        if (i10 < kVar.f37827b) {
            return i4;
        }
        Object[] objArr = kVar.f37826a;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        nk.k.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        j jVar = (j) obj;
        if (i4 == 6) {
            k kVar2 = kVarArr[i4 + 1];
            Object[] objArr2 = jVar.f37825d;
            kVar2.a(objArr2, objArr2.length, 0);
        } else {
            kVarArr[i4 + 1].a(jVar.f37825d, Integer.bitCount(jVar.f37822a) * 2, 0);
        }
        return b(i4 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f37807c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f37807c) {
            throw new NoSuchElementException();
        }
        Object next = this.f37805a[this.f37806b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
