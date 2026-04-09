package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements hy {
    public final /* synthetic */ int f;

    public /* synthetic */ ig(int i) {
        this.f = i;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        jg jgVar;
        switch (this.f) {
            case 0:
                String str = (String) obj;
                fk fkVar = (fk) obj2;
                i30.m(str, "acc");
                i30.m(fkVar, "element");
                if (str.length() == 0) {
                    return fkVar.toString();
                }
                return str + ", " + fkVar;
            default:
                hk hkVar = (hk) obj;
                fk fkVar2 = (fk) obj2;
                i30.m(hkVar, "acc");
                i30.m(fkVar2, "element");
                hk hkVarI = hkVar.i(fkVar2.getKey());
                ls lsVar = ls.f;
                if (hkVarI == lsVar) {
                    return fkVar2;
                }
                pz pzVar = pz.h;
                rj rjVar = (rj) hkVarI.h(pzVar);
                if (rjVar == null) {
                    jgVar = new jg(hkVarI, fkVar2);
                } else {
                    hk hkVarI2 = hkVarI.i(pzVar);
                    if (hkVarI2 == lsVar) {
                        return new jg(fkVar2, rjVar);
                    }
                    jgVar = new jg(new jg(hkVarI2, fkVar2), rjVar);
                }
                return jgVar;
        }
    }
}
