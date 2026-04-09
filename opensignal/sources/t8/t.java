package t8;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import r8.z;

/* loaded from: classes.dex */
public final class t implements n, u8.a, k {

    /* renamed from: b, reason: collision with root package name */
    public final String f22648b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22649c;

    /* renamed from: d, reason: collision with root package name */
    public final r8.v f22650d;

    /* renamed from: e, reason: collision with root package name */
    public final u8.m f22651e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22652f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f22647a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final fh.f f22653g = new fh.f(3);

    public t(r8.v vVar, a9.b bVar, z8.s sVar) {
        this.f22648b = sVar.f26769a;
        this.f22649c = sVar.f26772d;
        this.f22650d = vVar;
        u8.m mVar = new u8.m((List) sVar.f26771c.f1504d);
        this.f22651e = mVar;
        bVar.e(mVar);
        mVar.a(this);
    }

    @Override // u8.a
    public final void a() {
        this.f22652f = false;
        this.f22650d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // t8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L41
            java.lang.Object r1 = r1.get(r0)
            t8.c r1 = (t8.c) r1
            boolean r2 = r1 instanceof t8.v
            if (r2 == 0) goto L29
            r2 = r1
            t8.v r2 = (t8.v) r2
            z8.w r3 = r2.f22661c
            z8.w r4 = z8.w.SIMULTANEOUSLY
            if (r3 != r4) goto L29
            fh.f r1 = r5.f22653g
            java.util.ArrayList r1 = r1.f8871a
            r1.add(r2)
            r2.c(r5)
            goto L3e
        L29:
            boolean r2 = r1 instanceof t8.s
            if (r2 == 0) goto L3e
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            t8.s r1 = (t8.s) r1
            u8.d r2 = r1.f22645b
            r2.a(r5)
            r7.add(r1)
        L3e:
            int r0 = r0 + 1
            goto L2
        L41:
            u8.m r6 = r5.f22651e
            r6.f23473m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.t.b(java.util.List, java.util.List):void");
    }

    @Override // x8.g
    public final void c(x8.f fVar, int i10, ArrayList arrayList, x8.f fVar2) {
        e9.g.g(fVar, i10, arrayList, fVar2, this);
    }

    @Override // x8.g
    public final void f(bm.e eVar, Object obj) {
        if (obj == z.N) {
            this.f22651e.k(eVar);
        }
    }

    @Override // t8.n
    public final Path g() {
        boolean z10 = this.f22652f;
        u8.m mVar = this.f22651e;
        Path path = this.f22647a;
        if (z10 && mVar.f23451e == null) {
            return path;
        }
        path.reset();
        if (this.f22649c) {
            this.f22652f = true;
            return path;
        }
        Path path2 = (Path) mVar.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f22653g.e(path);
        this.f22652f = true;
        return path;
    }

    @Override // t8.c
    public final String getName() {
        return this.f22648b;
    }
}
