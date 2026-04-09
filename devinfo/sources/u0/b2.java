package u0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b2 implements h1.c, Iterable, ok.a {

    /* renamed from: b, reason: collision with root package name */
    public int f34744b;

    /* renamed from: d, reason: collision with root package name */
    public int f34746d;

    /* renamed from: e, reason: collision with root package name */
    public int f34747e;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f34749h;
    public HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public x.u f34751k;

    /* renamed from: a, reason: collision with root package name */
    public int[] f34743a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f34745c = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public final Object f34748f = new Object();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f34750i = new ArrayList();

    public final int a(a aVar) {
        if (this.g) {
            r.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            j1.a("Anchor refers to a group that was removed");
        }
        return aVar.f34724a;
    }

    public final void c() {
        this.j = new HashMap();
    }

    public final a2 d() {
        if (this.g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f34747e++;
        return new a2(this);
    }

    public final e2 f() {
        if (this.g) {
            r.a("Cannot start a writer when another writer is pending");
        }
        if (this.f34747e > 0) {
            r.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.f34749h++;
        return new e2(this);
    }

    public final boolean g(a aVar) {
        int iE;
        return aVar.a() && (iE = d2.e(this.f34750i, aVar.f34724a, this.f34744b)) >= 0 && nk.k.a(this.f34750i.get(iE), aVar);
    }

    public final l0 i(int i4) {
        int i10;
        ArrayList arrayList;
        int iE;
        HashMap map = this.j;
        if (map != null) {
            if (this.g) {
                r.a("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i4 < 0 || i4 >= (i10 = this.f34744b) || (iE = d2.e((arrayList = this.f34750i), i4, i10)) < 0) ? null : (a) arrayList.get(iE);
            if (aVar != null) {
                return (l0) map.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new k0(this, 0, this.f34744b);
    }
}
