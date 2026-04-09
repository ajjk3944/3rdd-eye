package br;

import io.sentry.a2;
import io.sentry.b2;
import io.sentry.u1;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x1;
import io.sentry.y1;
import io.sentry.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a0 implements y8.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2897a;

    public a0(int i10, boolean z10) {
        switch (i10) {
            case 2:
                this.f2897a = new ArrayList();
                break;
            default:
                this.f2897a = new ArrayList();
                break;
        }
    }

    @Override // y8.e
    public u8.d E0() {
        ArrayList arrayList = this.f2897a;
        return ((f9.a) arrayList.get(0)).c() ? new u8.i(1, arrayList) : new u8.l(arrayList);
    }

    @Override // y8.e
    public List O0() {
        return this.f2897a;
    }

    @Override // y8.e
    public boolean Q0() {
        ArrayList arrayList = this.f2897a;
        return arrayList.size() == 1 && ((f9.a) arrayList.get(0)).c();
    }

    public void a(Object obj) {
        this.f2897a.add(obj);
    }

    public void b(cq.l lVar) {
        synchronized (this.f2897a) {
            try {
                if (!this.f2897a.contains(lVar)) {
                    this.f2897a.add(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        ArrayList arrayList = this.f2897a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public w1 d() {
        ArrayList arrayList = this.f2897a;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (w1) h0.b.f(1, arrayList);
    }

    public boolean e() {
        if (this.f2897a.size() == 1) {
            return true;
        }
        w1 w1VarD = d();
        i();
        if (!(d() instanceof z1)) {
            if (!(d() instanceof x1)) {
                return false;
            }
            x1 x1Var = (x1) d();
            if (w1VarD == null || x1Var == null) {
                return false;
            }
            x1Var.f12861a.add(w1VarD.getValue());
            return false;
        }
        z1 z1Var = (z1) d();
        i();
        y1 y1Var = (y1) d();
        if (z1Var == null || w1VarD == null || y1Var == null) {
            return false;
        }
        y1Var.f12868a.put(z1Var.f12873a, w1VarD.getValue());
        return false;
    }

    public boolean f(v1 v1Var) {
        Object objG = v1Var.g();
        if (d() == null && objG != null) {
            this.f2897a.add(new a2(objG));
            return true;
        }
        if (d() instanceof z1) {
            z1 z1Var = (z1) d();
            i();
            ((y1) d()).f12868a.put(z1Var.f12873a, objG);
            return false;
        }
        if (!(d() instanceof x1)) {
            return false;
        }
        ((x1) d()).f12861a.add(objG);
        return false;
    }

    public void g(Object obj) {
        ArrayList arrayList;
        synchronized (this.f2897a) {
            arrayList = new ArrayList(this.f2897a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((cq.l) it.next()).a(obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void h(final b2 b2Var) {
        boolean zE;
        int[] iArr = u1.f12786a;
        io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) b2Var.f12071d;
        int i10 = iArr[aVar.s0().ordinal()];
        ArrayList arrayList = this.f2897a;
        switch (i10) {
            case 1:
                b2Var.b();
                arrayList.add(new x1());
                zE = false;
                break;
            case 2:
                b2Var.h();
                zE = e();
                break;
            case 3:
                b2Var.f();
                arrayList.add(new y1());
                zE = false;
                break;
            case 4:
                b2Var.i();
                zE = e();
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                arrayList.add(new z1(aVar.i0()));
                zE = false;
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                final int i11 = 0;
                zE = f(new v1() { // from class: io.sentry.t1
                    @Override // io.sentry.v1
                    public final Object g() {
                        switch (i11) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) b2Var.f12071d).q0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f12071d).V());
                        }
                    }
                });
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                zE = f(new androidx.media3.exoplayer.trackselection.h(this, 16, b2Var));
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                final int i12 = 1;
                zE = f(new v1() { // from class: io.sentry.t1
                    @Override // io.sentry.v1
                    public final Object g() {
                        switch (i12) {
                            case 0:
                                return ((io.sentry.vendor.gson.stream.a) b2Var.f12071d).q0();
                            default:
                                return Boolean.valueOf(((io.sentry.vendor.gson.stream.a) b2Var.f12071d).V());
                        }
                    }
                });
                break;
            case 9:
                aVar.o0();
                zE = f(new d5.v(15));
                break;
            case 10:
                zE = true;
                break;
            default:
                zE = false;
                break;
        }
        if (zE) {
            return;
        }
        h(b2Var);
    }

    public void i() {
        ArrayList arrayList = this.f2897a;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }

    public a0(ArrayList arrayList) {
        this.f2897a = arrayList;
    }

    public a0(int i10) {
        this.f2897a = new ArrayList(i10);
    }
}
