package Ei;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.V;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public class g extends e implements Iterator, InterfaceC6944a {

    /* renamed from: d, reason: collision with root package name */
    private final f f4786d;

    /* renamed from: e, reason: collision with root package name */
    private Object f4787e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4788f;

    /* renamed from: g, reason: collision with root package name */
    private int f4789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f builder, u[] path) {
        super(builder.j(), path);
        AbstractC6492s.i(builder, "builder");
        AbstractC6492s.i(path, "path");
        this.f4786d = builder;
        this.f4789g = builder.i();
    }

    private final void j() {
        if (this.f4786d.i() != this.f4789g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if (!this.f4788f) {
            throw new IllegalStateException();
        }
    }

    private final void n(int i10, t tVar, Object obj, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            g()[i11].p(tVar.m(), tVar.m().length, 0);
            while (!AbstractC6492s.d(g()[i11].d(), obj)) {
                g()[i11].j();
            }
            i(i11);
            return;
        }
        int iE = 1 << x.e(i10, i12);
        if (tVar.n(iE)) {
            g()[i11].p(tVar.m(), tVar.i() * 2, tVar.j(iE));
            i(i11);
        } else {
            int iJ = tVar.J(iE);
            t tVarI = tVar.I(iJ);
            g()[i11].p(tVar.m(), tVar.i() * 2, iJ);
            n(i10, tVarI, obj, i11 + 1);
        }
    }

    @Override // Ei.e, java.util.Iterator
    public Object next() {
        j();
        this.f4787e = e();
        this.f4788f = true;
        return super.next();
    }

    public final void p(Object obj, Object obj2) {
        if (this.f4786d.containsKey(obj)) {
            if (hasNext()) {
                Object objE = e();
                this.f4786d.put(obj, obj2);
                n(objE != null ? objE.hashCode() : 0, this.f4786d.j(), objE, 0);
            } else {
                this.f4786d.put(obj, obj2);
            }
            this.f4789g = this.f4786d.i();
        }
    }

    @Override // Ei.e, java.util.Iterator
    public void remove() {
        k();
        if (hasNext()) {
            Object objE = e();
            V.d(this.f4786d).remove(this.f4787e);
            n(objE != null ? objE.hashCode() : 0, this.f4786d.j(), objE, 0);
        } else {
            V.d(this.f4786d).remove(this.f4787e);
        }
        this.f4787e = null;
        this.f4788f = false;
        this.f4789g = this.f4786d.i();
    }
}
