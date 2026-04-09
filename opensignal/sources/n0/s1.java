package n0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s1 implements Iterable, cr.a {
    public boolean B;
    public int D;
    public HashMap F;
    public u.t G;

    /* renamed from: d, reason: collision with root package name */
    public int f17311d;

    /* renamed from: r, reason: collision with root package name */
    public int f17313r;

    /* renamed from: x, reason: collision with root package name */
    public int f17314x;

    /* renamed from: a, reason: collision with root package name */
    public int[] f17310a = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public Object[] f17312g = new Object[0];

    /* renamed from: y, reason: collision with root package name */
    public final Object f17315y = new Object();
    public ArrayList E = new ArrayList();

    public final int a(a aVar) {
        if (this.B) {
            q.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            g1.a("Anchor refers to a group that was removed");
        }
        return aVar.f17127a;
    }

    public final void b() {
        this.F = new HashMap();
    }

    public final r1 c() {
        if (this.B) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f17314x++;
        return new r1(this);
    }

    public final v1 d() {
        if (this.B) {
            q.c("Cannot start a writer when another writer is pending");
        }
        if (this.f17314x > 0) {
            q.c("Cannot start a writer when a reader is pending");
        }
        this.B = true;
        this.D++;
        return new v1(this);
    }

    public final boolean e(a aVar) {
        int iE;
        return aVar.a() && (iE = u1.e(this.E, aVar.f17127a, this.f17311d)) >= 0 && br.l.a(this.E.get(iE), aVar);
    }

    public final k0 g(int i10) {
        int i11;
        ArrayList arrayList;
        int iE;
        HashMap map = this.F;
        if (map != null) {
            if (this.B) {
                q.c("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i10 < 0 || i10 >= (i11 = this.f17311d) || (iE = u1.e((arrayList = this.E), i10, i11)) < 0) ? null : (a) arrayList.get(iE);
            if (aVar != null) {
                return (k0) map.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j0(this, 0, this.f17311d);
    }
}
