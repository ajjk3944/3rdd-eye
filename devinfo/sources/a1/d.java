package a1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import nk.k;
import uk.g;
import x.c0;
import x.d0;
import x.g0;
import x.h0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    /* renamed from: b, reason: collision with root package name */
    public Object f163b;

    /* renamed from: c, reason: collision with root package name */
    public int f164c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f165d;

    public d(Object obj, Map map) {
        this.f162a = 0;
        this.f163b = obj;
        this.f165d = map;
    }

    public void a() {
        Object objInvoke;
        uk.e eVar = (uk.e) this.f165d;
        if (this.f164c == -2) {
            objInvoke = ((mk.a) eVar.f35522c).invoke();
        } else {
            mk.c cVar = (mk.c) eVar.f35521b;
            Object obj = this.f163b;
            k.b(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f163b = objInvoke;
        this.f164c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f162a) {
            case 0:
                if (this.f164c < ((Map) this.f165d).size()) {
                }
                break;
            case 1:
                if (this.f164c < 0) {
                    a();
                }
                if (this.f164c == 1) {
                }
                break;
        }
        return ((g) this.f163b).hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f162a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f163b;
                this.f164c++;
                Object obj2 = ((Map) this.f165d).get(obj);
                if (obj2 != null) {
                    this.f163b = ((a) obj2).f153b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            case 1:
                if (this.f164c < 0) {
                    a();
                }
                if (this.f164c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.f163b;
                k.c(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f164c = -1;
                return obj3;
            case 2:
                return ((g) this.f163b).next();
            default:
                return ((g) this.f163b).next();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f162a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i4 = this.f164c;
                if (i4 != -1) {
                    ((d0) this.f165d).f36869b.h(i4);
                    this.f164c = -1;
                    return;
                }
                return;
            default:
                int i10 = this.f164c;
                if (i10 != -1) {
                    ((h0) this.f165d).f36901b.m(i10);
                    this.f164c = -1;
                    return;
                }
                return;
        }
    }

    public d(uk.e eVar) {
        this.f162a = 1;
        this.f165d = eVar;
        this.f164c = -2;
    }

    public d(h0 h0Var) {
        this.f162a = 3;
        this.f165d = h0Var;
        this.f164c = -1;
        this.f163b = jm.a.r(new g0(h0Var, this, null));
    }

    public d(d0 d0Var) {
        this.f162a = 2;
        this.f165d = d0Var;
        this.f164c = -1;
        this.f163b = jm.a.r(new c0(d0Var, this, null));
    }
}
