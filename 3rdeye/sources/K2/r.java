package k2;

import android.graphics.ColorFilter;
import android.graphics.Path;
import i2.InterfaceC4433F;
import i2.z;
import java.util.ArrayList;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5279l;
import n2.C5351e;
import u2.C5628g;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public final class r implements m, AbstractC5268a.InterfaceC0489a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f43282b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f43283c;

    /* renamed from: d, reason: collision with root package name */
    public final z f43284d;

    /* renamed from: e, reason: collision with root package name */
    public final C5279l f43285e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43286f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f43281a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final C5211b f43287g = new C5211b();

    public r(z zVar, q2.b bVar, p2.q qVar) {
        this.f43282b = qVar.f45081a;
        this.f43283c = qVar.f45084d;
        this.f43284d = zVar;
        C5279l c5279l = new C5279l((List) qVar.f45083c.f2034b);
        this.f43285e = c5279l;
        bVar.e(c5279l);
        c5279l.a(this);
    }

    @Override // l2.AbstractC5268a.InterfaceC0489a
    public final void a() {
        this.f43286f = false;
        this.f43284d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // k2.InterfaceC5212c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List<k2.InterfaceC5212c> r6, java.util.List<k2.InterfaceC5212c> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L3c
            java.lang.Object r1 = r1.get(r0)
            k2.c r1 = (k2.InterfaceC5212c) r1
            boolean r2 = r1 instanceof k2.u
            if (r2 == 0) goto L29
            r2 = r1
            k2.u r2 = (k2.u) r2
            p2.s$a r3 = r2.f43295c
            p2.s$a r4 = p2.s.a.SIMULTANEOUSLY
            if (r3 != r4) goto L29
            k2.b r1 = r5.f43287g
            java.util.ArrayList r1 = r1.f43173a
            r1.add(r2)
            r2.c(r5)
            goto L39
        L29:
            boolean r2 = r1 instanceof k2.s
            if (r2 == 0) goto L39
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            k2.s r1 = (k2.s) r1
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            l2.l r6 = r5.f43285e
            r6.f43725m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.r.b(java.util.List, java.util.List):void");
    }

    @Override // n2.InterfaceC5352f
    public final void c(ColorFilter colorFilter, B0.f fVar) {
        if (colorFilter == InterfaceC4433F.f38299K) {
            this.f43285e.k(fVar);
        }
    }

    @Override // n2.InterfaceC5352f
    public final void g(C5351e c5351e, int i, ArrayList arrayList, C5351e c5351e2) {
        C5628g.f(c5351e, i, arrayList, c5351e2, this);
    }

    @Override // k2.InterfaceC5212c
    public final String getName() {
        return this.f43282b;
    }

    @Override // k2.m
    public final Path getPath() {
        boolean z10 = this.f43286f;
        Path path = this.f43281a;
        C5279l c5279l = this.f43285e;
        if (z10 && c5279l.f43690e == null) {
            return path;
        }
        path.reset();
        if (this.f43283c) {
            this.f43286f = true;
            return path;
        }
        Path pathF = c5279l.f();
        if (pathF == null) {
            return path;
        }
        path.set(pathF);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f43287g.a(path);
        this.f43286f = true;
        return path;
    }
}
