package su;

import ee.x;
import java.io.IOException;
import kf.n;
import ou.f0;
import ou.p;
import ou.t;
import vu.d0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f22321a;

    /* renamed from: b, reason: collision with root package name */
    public final ou.a f22322b;

    /* renamed from: c, reason: collision with root package name */
    public final i f22323c;

    /* renamed from: d, reason: collision with root package name */
    public final p f22324d;

    /* renamed from: e, reason: collision with root package name */
    public n f22325e;

    /* renamed from: f, reason: collision with root package name */
    public x f22326f;

    /* renamed from: g, reason: collision with root package name */
    public int f22327g;

    /* renamed from: h, reason: collision with root package name */
    public int f22328h;

    /* renamed from: i, reason: collision with root package name */
    public int f22329i;
    public f0 j;

    public e(l lVar, ou.a aVar, i iVar, p pVar) {
        br.l.e(lVar, "connectionPool");
        br.l.e(pVar, "eventListener");
        this.f22321a = lVar;
        this.f22322b = aVar;
        this.f22323c = iVar;
        this.f22324d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x02e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.k a(int r15, int r16, int r17, boolean r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 920
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.e.a(int, int, int, boolean, boolean):su.k");
    }

    public final boolean b(t tVar) {
        br.l.e(tVar, "url");
        t tVar2 = this.f22322b.f19858h;
        return tVar.f19971e == tVar2.f19971e && br.l.a(tVar.f19970d, tVar2.f19970d);
    }

    public final void c(IOException iOException) {
        br.l.e(iOException, "e");
        this.j = null;
        if ((iOException instanceof d0) && ((d0) iOException).f23986a == vu.c.REFUSED_STREAM) {
            this.f22327g++;
        } else if (iOException instanceof vu.a) {
            this.f22328h++;
        } else {
            this.f22329i++;
        }
    }
}
