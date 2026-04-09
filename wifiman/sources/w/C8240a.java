package w;

import java.util.List;
import l0.C6531g;
import y0.C8593n;
import y0.C8604y;

/* renamed from: w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8240a implements t {

    /* renamed from: a, reason: collision with root package name */
    public static final C8240a f63847a = new C8240a();

    private C8240a() {
    }

    @Override // w.t
    public long a(Y0.d dVar, C8593n c8593n, long j10) {
        List listC = c8593n.c();
        C6531g c6531gD = C6531g.d(C6531g.f52335b.c());
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            c6531gD = C6531g.d(C6531g.r(c6531gD.v(), ((C8604y) listC.get(i10)).m()));
        }
        return C6531g.s(c6531gD.v(), -dVar.d1(Y0.h.j(64)));
    }
}
