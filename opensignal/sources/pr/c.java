package pr;

import bf.n;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import ht.g0;
import ht.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import mq.p;
import or.o;
import rr.a0;
import rr.p0;
import rr.r0;
import rr.w;
import ur.c0;

/* loaded from: classes.dex */
public final class c extends ht.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f20625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(dVar.f20626x);
        this.f20625c = dVar;
    }

    @Override // ht.h
    public final Collection b() {
        List<qs.b> listH;
        Iterable iterableH;
        d dVar = this.f20625c;
        int i10 = dVar.D;
        int i11 = b.f20624a[dVar.B.ordinal()];
        if (i11 == 1) {
            listH = e5.H(d.H);
        } else if (i11 == 2) {
            listH = e5.I(d.I, new qs.b(o.j, g.Function.numberedClassName(i10)));
        } else if (i11 == 3) {
            listH = e5.H(d.H);
        } else {
            if (i11 != 4) {
                throw new n();
            }
            listH = e5.I(d.I, new qs.b(o.f19717e, g.SuspendFunction.numberedClassName(i10)));
        }
        a0 a0VarO = ((c0) dVar.f20627y).o();
        ArrayList arrayList = new ArrayList(p.a0(listH, 10));
        for (qs.b bVar : listH) {
            rr.f fVarD = w.d(a0VarO, bVar);
            if (fVarD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            List list = dVar.G;
            int size = fVarD.v().o().size();
            l.e(list, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(h0.b.m("Requested element count ", size, " is less than zero.").toString());
            }
            if (size == 0) {
                iterableH = mq.w.f16945a;
            } else {
                int size2 = list.size();
                if (size >= size2) {
                    iterableH = mq.o.Q0(list);
                } else if (size == 1) {
                    iterableH = e5.H(mq.o.z0(list));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list instanceof RandomAccess) {
                        for (int i12 = size2 - size; i12 < size2; i12++) {
                            arrayList2.add(list.get(i12));
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableH = arrayList2;
                }
            }
            ArrayList arrayList3 = new ArrayList(p.a0(iterableH, 10));
            Iterator it = iterableH.iterator();
            while (it.hasNext()) {
                arrayList3.add(new g0(((r0) it.next()).q()));
            }
            i0.f10910d.getClass();
            arrayList.add(ht.e.q(i0.f10911g, fVarD, arrayList3));
        }
        return mq.o.Q0(arrayList);
    }

    @Override // ht.h
    public final p0 d() {
        return p0.f21711g;
    }

    @Override // ht.b
    /* renamed from: i */
    public final rr.f p() {
        return this.f20625c;
    }

    @Override // ht.m0
    public final List o() {
        return this.f20625c.G;
    }

    @Override // ht.b, ht.m0
    public final rr.i p() {
        return this.f20625c;
    }

    @Override // ht.m0
    public final boolean r() {
        return true;
    }

    public final String toString() {
        return this.f20625c.toString();
    }
}
