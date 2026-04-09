package h7;

import android.graphics.Path;
import f7.b0;
import f7.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s implements n, i7.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f25000b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25001c;

    /* renamed from: d, reason: collision with root package name */
    public final x f25002d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.n f25003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25004f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24999a = new Path();
    public final c g = new c(0);

    public s(x xVar, n7.a aVar, m7.n nVar) {
        this.f25000b = nVar.f28936a;
        this.f25001c = nVar.f28939d;
        this.f25002d = xVar;
        i7.n nVar2 = new i7.n((List) nVar.f28938c.f218b);
        this.f25003e = nVar2;
        aVar.e(nVar2);
        nVar2.a(this);
    }

    @Override // i7.a
    public final void a() {
        this.f25004f = false;
        this.f25002d.invalidateSelf();
    }

    @Override // h7.n
    public final Path b() {
        boolean z3 = this.f25004f;
        i7.n nVar = this.f25003e;
        Path path = this.f24999a;
        if (z3 && nVar.f25876e == null) {
            return path;
        }
        path.reset();
        if (this.f25001c) {
            this.f25004f = true;
            return path;
        }
        Path path2 = (Path) nVar.e();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(path);
        this.f25004f = true;
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // h7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L40
            java.lang.Object r1 = r1.get(r0)
            h7.d r1 = (h7.d) r1
            boolean r2 = r1 instanceof h7.u
            if (r2 == 0) goto L28
            r2 = r1
            h7.u r2 = (h7.u) r2
            int r3 = r2.f25012c
            r4 = 1
            if (r3 != r4) goto L28
            h7.c r1 = r5.g
            java.util.ArrayList r1 = r1.f24902a
            r1.add(r2)
            r2.e(r5)
            goto L3d
        L28:
            boolean r2 = r1 instanceof h7.r
            if (r2 == 0) goto L3d
            if (r7 != 0) goto L33
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L33:
            h7.r r1 = (h7.r) r1
            i7.e r2 = r1.f24997b
            r2.a(r5)
            r7.add(r1)
        L3d:
            int r0 = r0 + 1
            goto L2
        L40:
            i7.n r6 = r5.f25003e
            r6.f25898m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.s.c(java.util.List, java.util.List):void");
    }

    @Override // k7.f
    public final void f(Object obj, km.o oVar) {
        if (obj == b0.N) {
            this.f25003e.j(oVar);
        }
    }

    @Override // k7.f
    public final void g(k7.e eVar, int i4, ArrayList arrayList, k7.e eVar2) {
        r7.h.g(eVar, i4, arrayList, eVar2, this);
    }

    @Override // h7.d
    public final String getName() {
        return this.f25000b;
    }
}
