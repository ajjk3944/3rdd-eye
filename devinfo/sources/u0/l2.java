package u0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l2 implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34856a;

    /* renamed from: b, reason: collision with root package name */
    public int f34857b;

    /* renamed from: c, reason: collision with root package name */
    public int f34858c;

    /* renamed from: d, reason: collision with root package name */
    public int f34859d;

    /* renamed from: e, reason: collision with root package name */
    public Object f34860e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f34861f;

    public l2(uk.e eVar) {
        this.f34856a = 1;
        this.f34861f = eVar;
        this.f34857b = -1;
        int iE = ci.b.e(0, 0, ((CharSequence) eVar.f35522c).length());
        this.f34858c = iE;
        this.f34859d = iE;
    }

    public void a() {
        yj.i iVar;
        uk.e eVar = (uk.e) this.f34861f;
        CharSequence charSequence = (CharSequence) eVar.f35522c;
        int i4 = this.f34859d;
        if (i4 < 0) {
            this.f34857b = 0;
            this.f34860e = null;
            return;
        }
        if (i4 <= charSequence.length() && (iVar = (yj.i) ((mk.e) eVar.f35521b).invoke(charSequence, Integer.valueOf(this.f34859d))) != null) {
            int iIntValue = ((Number) iVar.f37638a).intValue();
            int iIntValue2 = ((Number) iVar.f37639b).intValue();
            this.f34860e = ci.b.E(this.f34858c, iIntValue);
            int i10 = iIntValue + iIntValue2;
            this.f34858c = i10;
            this.f34859d = i10 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f34860e = new sk.d(this.f34858c, vk.i.B0(charSequence), 1);
            this.f34859d = -1;
        }
        this.f34857b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f34856a) {
            case 0:
                throw null;
            default:
                if (this.f34857b == -1) {
                    a();
                }
                return this.f34857b == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f34856a) {
            case 0:
                throw null;
            default:
                if (this.f34857b == -1) {
                    a();
                }
                if (this.f34857b == 0) {
                    throw new NoSuchElementException();
                }
                sk.d dVar = (sk.d) this.f34860e;
                nk.k.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f34860e = null;
                this.f34857b = -1;
                return dVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f34856a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l2(b2 b2Var, int i4, l0 l0Var, q qVar) {
        this.f34856a = 0;
        this.f34860e = b2Var;
        this.f34857b = i4;
        this.f34861f = qVar;
        this.f34858c = b2Var.f34749h;
    }
}
