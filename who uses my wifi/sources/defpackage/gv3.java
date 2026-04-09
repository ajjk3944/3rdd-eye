package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gv3 extends mr3 {
    public final gw3 a;

    public gv3(gw3 gw3Var) {
        this.a = gw3Var;
    }

    @Override // defpackage.mr3
    public final boolean a() {
        return ((qz3) this.a.h).C() != i04.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gv3)) {
            return false;
        }
        gw3 gw3Var = ((gv3) obj).a;
        gw3 gw3Var2 = this.a;
        qz3 qz3Var = (qz3) gw3Var2.h;
        qz3 qz3Var2 = (qz3) gw3Var2.h;
        i04 i04VarC = qz3Var.C();
        qz3 qz3Var3 = (qz3) gw3Var.h;
        qz3 qz3Var4 = (qz3) gw3Var.h;
        return i04VarC.equals(qz3Var3.C()) && qz3Var2.A().equals(qz3Var4.A()) && qz3Var2.B().equals(qz3Var4.B());
    }

    public final int hashCode() {
        gw3 gw3Var = this.a;
        return Objects.hash((qz3) gw3Var.h, (v34) gw3Var.g);
    }

    public final String toString() {
        gw3 gw3Var = this.a;
        String strA = ((qz3) gw3Var.h).A();
        int iOrdinal = ((qz3) gw3Var.h).C().ordinal();
        return "(typeUrl=" + strA + ", outputPrefixType=" + (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}
