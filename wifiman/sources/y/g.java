package Y;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public class g extends e implements Iterator, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    private final f f24492d;

    /* renamed from: e, reason: collision with root package name */
    private Object f24493e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24494f;

    /* renamed from: g, reason: collision with root package name */
    private int f24495g;

    public g(f fVar, u[] uVarArr) {
        super(fVar.i(), uVarArr);
        this.f24492d = fVar;
        this.f24495g = fVar.h();
    }

    private final void j() {
        if (this.f24492d.h() != this.f24495g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (!this.f24494f) {
            throw new IllegalStateException();
        }
    }

    private final void n(int i10, t tVar, Object obj, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            g()[i11].p(tVar.p(), tVar.p().length, 0);
            while (!AbstractC6492s.d(g()[i11].d(), obj)) {
                g()[i11].j();
            }
            i(i11);
            return;
        }
        int iF = 1 << x.f(i10, i12);
        if (tVar.q(iF)) {
            g()[i11].p(tVar.p(), tVar.m() * 2, tVar.n(iF));
            i(i11);
        } else {
            int iO = tVar.O(iF);
            t tVarN = tVar.N(iO);
            g()[i11].p(tVar.p(), tVar.m() * 2, iO);
            n(i10, tVarN, obj, i11 + 1);
        }
    }

    @Override // Y.e, java.util.Iterator
    public Object next() {
        j();
        this.f24493e = e();
        this.f24494f = true;
        return super.next();
    }

    public final void p(Object obj, Object obj2) {
        if (this.f24492d.containsKey(obj)) {
            if (hasNext()) {
                Object objE = e();
                this.f24492d.put(obj, obj2);
                n(objE != null ? objE.hashCode() : 0, this.f24492d.i(), objE, 0);
            } else {
                this.f24492d.put(obj, obj2);
            }
            this.f24495g = this.f24492d.h();
        }
    }

    @Override // Y.e, java.util.Iterator
    public void remove() {
        k();
        if (hasNext()) {
            Object objE = e();
            V.d(this.f24492d).remove(this.f24493e);
            n(objE != null ? objE.hashCode() : 0, this.f24492d.i(), objE, 0);
        } else {
            V.d(this.f24492d).remove(this.f24493e);
        }
        this.f24493e = null;
        this.f24494f = false;
        this.f24495g = this.f24492d.h();
    }
}
