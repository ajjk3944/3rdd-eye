package r1;

import u.o;
import u.w;
import u.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final v1.m f21141a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21142b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21143c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21144d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21145e;

    /* renamed from: f, reason: collision with root package name */
    public final z f21146f = new z();

    /* renamed from: g, reason: collision with root package name */
    public final e f21147g = new e();

    /* renamed from: h, reason: collision with root package name */
    public final w f21148h = new w(10);

    public b(v1.m mVar) {
        this.f21141a = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r18, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.b.a(long, java.util.List, boolean):void");
    }

    public final boolean b(q3.a aVar, boolean z10) {
        o oVar = (o) aVar.f20679d;
        v1.m mVar = this.f21141a;
        e eVar = this.f21147g;
        boolean zA = eVar.a(oVar, mVar, aVar, z10);
        p0.e eVar2 = eVar.f21162a;
        if (!zA) {
            return false;
        }
        boolean z11 = true;
        this.f21142b = true;
        Object[] objArr = eVar2.f20230a;
        int i10 = eVar2.f20232g;
        boolean z12 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z12 = ((d) objArr[i11]).e(aVar, z10) || z12;
        }
        Object[] objArr2 = eVar2.f20230a;
        int i12 = eVar2.f20232g;
        boolean z13 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            z13 = ((d) objArr2[i13]).d(aVar) || z13;
        }
        eVar.b(aVar);
        if (!z13 && !z12) {
            z11 = false;
        }
        this.f21142b = false;
        if (this.f21145e) {
            this.f21145e = false;
            z zVar = this.f21146f;
            int i14 = zVar.f23135b;
            for (int i15 = 0; i15 < i14; i15++) {
                d((z0.l) zVar.e(i15));
            }
            zVar.c();
        }
        if (this.f21143c) {
            this.f21143c = false;
            c();
        }
        if (this.f21144d) {
            this.f21144d = false;
            eVar.f21162a.g();
        }
        return z11;
    }

    public final void c() {
        if (this.f21142b) {
            this.f21143c = true;
            return;
        }
        e eVar = this.f21147g;
        p0.e eVar2 = eVar.f21162a;
        Object[] objArr = eVar2.f20230a;
        int i10 = eVar2.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            ((d) objArr[i11]).c();
        }
        if (this.f21144d) {
            this.f21144d = true;
        } else {
            eVar.f21162a.g();
        }
    }

    public final void d(z0.l lVar) {
        if (this.f21142b) {
            this.f21145e = true;
            this.f21146f.a(lVar);
            return;
        }
        e eVar = this.f21147g;
        z zVar = eVar.f21163b;
        zVar.c();
        zVar.a(eVar);
        while (zVar.h()) {
            e eVar2 = (e) zVar.j(zVar.f23135b - 1);
            int i10 = 0;
            while (true) {
                p0.e eVar3 = eVar2.f21162a;
                if (i10 < eVar3.f20232g) {
                    d dVar = (d) eVar3.f20230a[i10];
                    if (br.l.a(dVar.f21155c, lVar)) {
                        eVar2.f21162a.j(dVar);
                        dVar.c();
                    } else {
                        zVar.a(dVar);
                        i10++;
                    }
                }
            }
        }
    }
}
