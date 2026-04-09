package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jg implements hk, Serializable {
    public final hk f;
    public final fk g;

    public jg(hk hkVar, fk fkVar) {
        i30.m(hkVar, "left");
        i30.m(fkVar, "element");
        this.f = hkVar;
        this.g = fkVar;
    }

    public final boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (obj instanceof jg) {
            jg jgVar = (jg) obj;
            int i = 2;
            jg jgVar2 = jgVar;
            int i2 = 2;
            while (true) {
                hk hkVar = jgVar2.f;
                jgVar2 = hkVar instanceof jg ? (jg) hkVar : null;
                if (jgVar2 == null) {
                    break;
                }
                i2++;
            }
            jg jgVar3 = this;
            while (true) {
                hk hkVar2 = jgVar3.f;
                jgVar3 = hkVar2 instanceof jg ? (jg) hkVar2 : null;
                if (jgVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                jg jgVar4 = this;
                while (true) {
                    fk fkVar = jgVar4.g;
                    if (!i30.c(jgVar.h(fkVar.getKey()), fkVar)) {
                        zC = false;
                        break;
                    }
                    hk hkVar3 = jgVar4.f;
                    if (!(hkVar3 instanceof jg)) {
                        i30.k(hkVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        fk fkVar2 = (fk) hkVar3;
                        zC = i30.c(jgVar.h(fkVar2.getKey()), fkVar2);
                        break;
                    }
                    jgVar4 = (jg) hkVar3;
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hk
    public final Object f(Object obj, hy hyVar) {
        return hyVar.f(this.f.f(obj, hyVar), this.g);
    }

    @Override // defpackage.hk
    public final hk g(hk hkVar) {
        i30.m(hkVar, "context");
        return hkVar == ls.f ? this : (hk) hkVar.f(this, new ig(1));
    }

    @Override // defpackage.hk
    public final fk h(gk gkVar) {
        i30.m(gkVar, "key");
        jg jgVar = this;
        while (true) {
            fk fkVarH = jgVar.g.h(gkVar);
            if (fkVarH != null) {
                return fkVarH;
            }
            hk hkVar = jgVar.f;
            if (!(hkVar instanceof jg)) {
                return hkVar.h(gkVar);
            }
            jgVar = (jg) hkVar;
        }
    }

    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode();
    }

    @Override // defpackage.hk
    public final hk i(gk gkVar) {
        i30.m(gkVar, "key");
        fk fkVar = this.g;
        fk fkVarH = fkVar.h(gkVar);
        hk hkVar = this.f;
        if (fkVarH != null) {
            return hkVar;
        }
        hk hkVarI = hkVar.i(gkVar);
        return hkVarI == hkVar ? this : hkVarI == ls.f ? fkVar : new jg(hkVarI, fkVar);
    }

    public final String toString() {
        return "[" + ((String) f("", new ig(0))) + ']';
    }
}
