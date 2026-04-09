package j1;

import c1.C4188d;
import j1.e;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f50029a = new boolean[3];

    static void a(f fVar, C4188d c4188d, e eVar) {
        eVar.f49930t = -1;
        eVar.f49932u = -1;
        e.b bVar = fVar.f49890Y[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f49890Y[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f49879N.f49853g;
            int iO = fVar.O() - eVar.f49881P.f49853g;
            d dVar = eVar.f49879N;
            dVar.f49855i = c4188d.q(dVar);
            d dVar2 = eVar.f49881P;
            dVar2.f49855i = c4188d.q(dVar2);
            c4188d.f(eVar.f49879N.f49855i, i10);
            c4188d.f(eVar.f49881P.f49855i, iO);
            eVar.f49930t = 2;
            eVar.C0(i10, iO);
        }
        if (fVar.f49890Y[1] == bVar2 || eVar.f49890Y[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f49880O.f49853g;
        int iU = fVar.u() - eVar.f49882Q.f49853g;
        d dVar3 = eVar.f49880O;
        dVar3.f49855i = c4188d.q(dVar3);
        d dVar4 = eVar.f49882Q;
        dVar4.f49855i = c4188d.q(dVar4);
        c4188d.f(eVar.f49880O.f49855i, i11);
        c4188d.f(eVar.f49882Q.f49855i, iU);
        if (eVar.f49913k0 > 0 || eVar.N() == 8) {
            d dVar5 = eVar.f49883R;
            dVar5.f49855i = c4188d.q(dVar5);
            c4188d.f(eVar.f49883R.f49855i, eVar.f49913k0 + i11);
        }
        eVar.f49932u = 2;
        eVar.P0(i11, iU);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
