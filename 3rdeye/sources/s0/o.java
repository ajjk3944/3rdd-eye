package s0;

import N7.G8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import r0.C5505b;
import r0.C5508e;
import r0.C5509f;

/* compiled from: WidgetGroup.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f45940f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<C5508e> f45941a;

    /* renamed from: b, reason: collision with root package name */
    public int f45942b;

    /* renamed from: c, reason: collision with root package name */
    public int f45943c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<a> f45944d;

    /* renamed from: e, reason: collision with root package name */
    public int f45945e;

    /* compiled from: WidgetGroup.java */
    public class a {
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f45941a.size();
        if (this.f45945e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.f45945e == oVar.f45942b) {
                    c(this.f45943c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(p0.c cVar, int i) {
        int iN;
        int iN2;
        ArrayList<C5508e> arrayList = this.f45941a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C5509f c5509f = (C5509f) arrayList.get(0).f45536V;
        cVar.t();
        c5509f.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).b(cVar, false);
        }
        if (i == 0 && c5509f.f45585A0 > 0) {
            C5505b.a(c5509f, cVar, arrayList, 0);
        }
        if (i == 1 && c5509f.f45586B0 > 0) {
            C5505b.a(c5509f, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        this.f45944d = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C5508e c5508e = arrayList.get(i11);
            a aVar = new a();
            new WeakReference(c5508e);
            p0.c.n(c5508e.f45524J);
            p0.c.n(c5508e.f45525K);
            p0.c.n(c5508e.f45526L);
            p0.c.n(c5508e.f45527M);
            p0.c.n(c5508e.f45528N);
            this.f45944d.add(aVar);
        }
        if (i == 0) {
            iN = p0.c.n(c5509f.f45524J);
            iN2 = p0.c.n(c5509f.f45526L);
            cVar.t();
        } else {
            iN = p0.c.n(c5509f.f45525K);
            iN2 = p0.c.n(c5509f.f45527M);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, o oVar) {
        Iterator<C5508e> it = this.f45941a.iterator();
        while (it.hasNext()) {
            C5508e next = it.next();
            ArrayList<C5508e> arrayList = oVar.f45941a;
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
            int i10 = oVar.f45942b;
            if (i == 0) {
                next.f45571p0 = i10;
            } else {
                next.f45573q0 = i10;
            }
        }
        this.f45945e = oVar.f45942b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f45943c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strJ = B4.i.j(sb, this.f45942b, "] <");
        Iterator<C5508e> it = this.f45941a.iterator();
        while (it.hasNext()) {
            C5508e next = it.next();
            StringBuilder sbV = G8.v(strJ, " ");
            sbV.append(next.f45559j0);
            strJ = sbV.toString();
        }
        return G8.s(strJ, " >");
    }
}
