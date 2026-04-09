package sr;

import java.util.Iterator;
import java.util.List;
import mq.v;
import rr.g0;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22218a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22219d;

    public /* synthetic */ i(int i10, List list) {
        this.f22218a = i10;
        this.f22219d = list;
    }

    @Override // sr.h
    public final boolean G(qs.c cVar) {
        switch (this.f22218a) {
            case 1:
                br.l.e(cVar, "fqName");
                Iterator it = ((Iterable) mq.o.j0((List) this.f22219d).f16942b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).G(cVar)) {
                        break;
                    }
                }
                break;
        }
        return ba.m.A(this, cVar);
    }

    @Override // sr.h
    public final boolean isEmpty() {
        switch (this.f22218a) {
            case 0:
                return ((List) this.f22219d).isEmpty();
            case 1:
                List list = (List) this.f22219d;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f22218a) {
            case 0:
                return ((List) this.f22219d).iterator();
            case 1:
                return new st.e(new st.g(mq.o.j0((List) this.f22219d), k.f22224d, st.n.E));
            default:
                return v.f16944a;
        }
    }

    public String toString() {
        switch (this.f22218a) {
            case 0:
                return ((List) this.f22219d).toString();
            default:
                return super.toString();
        }
    }

    @Override // sr.h
    public final b w(qs.c cVar) {
        switch (this.f22218a) {
            case 0:
                return ba.m.v(this, cVar);
            case 1:
                br.l.e(cVar, "fqName");
                st.e eVar = new st.e(st.l.c0(mq.o.j0((List) this.f22219d), new g0(cVar, 1)));
                return (b) (!eVar.hasNext() ? null : eVar.next());
            default:
                br.l.e(cVar, "fqName");
                if (cVar.equals((qs.c) this.f22219d)) {
                    return is.b.f12948a;
                }
                return null;
        }
    }

    public i(h[] hVarArr) {
        this.f22218a = 1;
        this.f22219d = mq.l.A0(hVarArr);
    }

    public i(qs.c cVar) {
        this.f22218a = 2;
        br.l.e(cVar, "fqNameToMatch");
        this.f22219d = cVar;
    }
}
