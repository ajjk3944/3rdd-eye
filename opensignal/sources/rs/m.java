package rs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class m extends p {

    /* renamed from: a, reason: collision with root package name */
    public final i f21766a;

    public m() {
        this.f21766a = new i();
    }

    public final boolean i() {
        b0 b0Var = this.f21766a.f21760a;
        int i10 = 0;
        while (true) {
            if (i10 >= b0Var.f21735d.size()) {
                Iterator it = b0Var.c().iterator();
                while (it.hasNext()) {
                    if (!i.e((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!i.e((Map.Entry) b0Var.f21735d.get(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public final int j() {
        b0 b0Var = this.f21766a.f21760a;
        int iD = 0;
        for (int i10 = 0; i10 < b0Var.f21735d.size(); i10++) {
            Map.Entry entry = (Map.Entry) b0Var.f21735d.get(i10);
            iD += i.d((n) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : b0Var.c()) {
            iD += i.d((n) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(o oVar) {
        o(oVar);
        n nVar = oVar.f21773d;
        Object obj = this.f21766a.f21760a.get(nVar);
        if (obj == null) {
            return oVar.f21771b;
        }
        if (!nVar.f21769g) {
            return oVar.a(obj);
        }
        if (nVar.f21768d.getJavaType() != k0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(oVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(o oVar) {
        o(oVar);
        n nVar = oVar.f21773d;
        i iVar = this.f21766a;
        iVar.getClass();
        if (nVar.f21769g) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return iVar.f21760a.get(nVar) != null;
    }

    public final void m() {
        this.f21766a.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n(f5.u r10, b5.m r11, rs.g r12, int r13) throws rs.t {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rs.m.n(f5.u, b5.m, rs.g, int):boolean");
    }

    public final void o(o oVar) {
        if (oVar.f21770a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public m(l lVar) {
        lVar.f21764d.f();
        lVar.f21765g = false;
        this.f21766a = lVar.f21764d;
    }
}
