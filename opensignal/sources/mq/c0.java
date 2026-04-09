package mq;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c0 implements ListIterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16928a = 2;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16929d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16930g;

    public c0(e0 e0Var, int i10) {
        this.f16930g = e0Var;
        this.f16929d = ((List) e0Var.f16933d).listIterator(o.i0(i10, e0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f16928a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f16929d;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f16928a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((br.u) this.f16929d).f2915a < ((x0.w) this.f16930g).f24756r - 1) {
                }
                break;
        }
        return ((ListIterator) this.f16929d).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f16928a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((br.u) this.f16929d).f2915a >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f16929d).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f16928a) {
            case 0:
                return ((ListIterator) this.f16929d).previous();
            case 1:
                return ((ListIterator) this.f16929d).previous();
            default:
                br.u uVar = (br.u) this.f16929d;
                int i10 = uVar.f2915a + 1;
                x0.w wVar = (x0.w) this.f16930g;
                x0.p.a(i10, wVar.f24756r);
                uVar.f2915a = i10;
                return wVar.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f16928a) {
            case 0:
                d0 d0Var = (d0) this.f16930g;
                return e5.z(d0Var) - ((ListIterator) this.f16929d).previousIndex();
            case 1:
                e0 e0Var = (e0) this.f16930g;
                return e5.z(e0Var) - ((ListIterator) this.f16929d).previousIndex();
            default:
                return ((br.u) this.f16929d).f2915a + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f16928a) {
            case 0:
                return ((ListIterator) this.f16929d).next();
            case 1:
                return ((ListIterator) this.f16929d).next();
            default:
                br.u uVar = (br.u) this.f16929d;
                int i10 = uVar.f2915a;
                x0.w wVar = (x0.w) this.f16930g;
                x0.p.a(i10, wVar.f24756r);
                uVar.f2915a = i10 - 1;
                return wVar.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f16928a) {
            case 0:
                d0 d0Var = (d0) this.f16930g;
                return e5.z(d0Var) - ((ListIterator) this.f16929d).nextIndex();
            case 1:
                e0 e0Var = (e0) this.f16930g;
                return e5.z(e0Var) - ((ListIterator) this.f16929d).nextIndex();
            default:
                return ((br.u) this.f16929d).f2915a;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f16928a) {
            case 0:
                ((ListIterator) this.f16929d).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f16928a) {
            case 0:
                ((ListIterator) this.f16929d).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public c0(d0 d0Var, int i10) {
        this.f16930g = d0Var;
        this.f16929d = d0Var.f16931a.listIterator(o.i0(i10, d0Var));
    }

    public c0(br.u uVar, x0.w wVar) {
        this.f16929d = uVar;
        this.f16930g = wVar;
    }
}
