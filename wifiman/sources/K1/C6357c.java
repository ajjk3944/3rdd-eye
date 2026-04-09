package k1;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6357c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f51033k;

    /* renamed from: l, reason: collision with root package name */
    private int f51034l;

    public C6357c(j1.e eVar, int i10) {
        super(eVar);
        this.f51033k = new ArrayList();
        this.f51092f = i10;
        q();
    }

    private void q() {
        j1.e eVar;
        j1.e eVar2 = this.f51088b;
        j1.e eVarG = eVar2.G(this.f51092f);
        while (true) {
            j1.e eVar3 = eVarG;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarG = eVar2.G(this.f51092f);
            }
        }
        this.f51088b = eVar;
        this.f51033k.add(eVar.I(this.f51092f));
        j1.e eVarE = eVar.E(this.f51092f);
        while (eVarE != null) {
            this.f51033k.add(eVarE.I(this.f51092f));
            eVarE = eVarE.E(this.f51092f);
        }
        Iterator it = this.f51033k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i10 = this.f51092f;
            if (i10 == 0) {
                pVar.f51088b.f49896c = this;
            } else if (i10 == 1) {
                pVar.f51088b.f49898d = this;
            }
        }
        if (this.f51092f == 0 && ((j1.f) this.f51088b.F()).y1() && this.f51033k.size() > 1) {
            ArrayList arrayList = this.f51033k;
            this.f51088b = ((p) arrayList.get(arrayList.size() - 1)).f51088b;
        }
        this.f51034l = this.f51092f == 0 ? this.f51088b.w() : this.f51088b.L();
    }

    private j1.e r() {
        for (int i10 = 0; i10 < this.f51033k.size(); i10++) {
            p pVar = (p) this.f51033k.get(i10);
            if (pVar.f51088b.N() != 8) {
                return pVar.f51088b;
            }
        }
        return null;
    }

    private j1.e s() {
        for (int size = this.f51033k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f51033k.get(size);
            if (pVar.f51088b.N() != 8) {
                return pVar.f51088b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    @Override // k1.p, k1.InterfaceC6358d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(k1.InterfaceC6358d r27) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C6357c.a(k1.d):void");
    }

    @Override // k1.p
    void d() {
        Iterator it = this.f51033k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = this.f51033k.size();
        if (size < 1) {
            return;
        }
        j1.e eVar = ((p) this.f51033k.get(0)).f51088b;
        j1.e eVar2 = ((p) this.f51033k.get(size - 1)).f51088b;
        if (this.f51092f == 0) {
            j1.d dVar = eVar.f49879N;
            j1.d dVar2 = eVar2.f49881P;
            f fVarI = i(dVar, 0);
            int iF = dVar.f();
            j1.e eVarR = r();
            if (eVarR != null) {
                iF = eVarR.f49879N.f();
            }
            if (fVarI != null) {
                b(this.f51094h, fVarI, iF);
            }
            f fVarI2 = i(dVar2, 0);
            int iF2 = dVar2.f();
            j1.e eVarS = s();
            if (eVarS != null) {
                iF2 = eVarS.f49881P.f();
            }
            if (fVarI2 != null) {
                b(this.f51095i, fVarI2, -iF2);
            }
        } else {
            j1.d dVar3 = eVar.f49880O;
            j1.d dVar4 = eVar2.f49882Q;
            f fVarI3 = i(dVar3, 1);
            int iF3 = dVar3.f();
            j1.e eVarR2 = r();
            if (eVarR2 != null) {
                iF3 = eVarR2.f49880O.f();
            }
            if (fVarI3 != null) {
                b(this.f51094h, fVarI3, iF3);
            }
            f fVarI4 = i(dVar4, 1);
            int iF4 = dVar4.f();
            j1.e eVarS2 = s();
            if (eVarS2 != null) {
                iF4 = eVarS2.f49882Q.f();
            }
            if (fVarI4 != null) {
                b(this.f51095i, fVarI4, -iF4);
            }
        }
        this.f51094h.f51044a = this;
        this.f51095i.f51044a = this;
    }

    @Override // k1.p
    public void e() {
        for (int i10 = 0; i10 < this.f51033k.size(); i10++) {
            ((p) this.f51033k.get(i10)).e();
        }
    }

    @Override // k1.p
    void f() {
        this.f51089c = null;
        Iterator it = this.f51033k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // k1.p
    public long j() {
        int size = this.f51033k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f51094h.f51049f + ((p) this.f51033k.get(i10)).j() + r4.f51095i.f51049f;
        }
        return j10;
    }

    @Override // k1.p
    boolean m() {
        int size = this.f51033k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f51033k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f51092f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f51033k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
