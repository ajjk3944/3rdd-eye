package qr;

import rr.a0;
import ur.c0;

/* loaded from: classes.dex */
public final class o extends c0 {
    public final /* synthetic */ int D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a0 a0Var, qs.c cVar, int i10) {
        super(a0Var, cVar);
        this.D = i10;
        switch (i10) {
            case 1:
                br.l.e(a0Var, "module");
                br.l.e(cVar, "fqName");
                super(a0Var, cVar);
                break;
            default:
                break;
        }
    }

    @Override // rr.f0
    public final /* bridge */ /* synthetic */ at.n W() {
        switch (this.D) {
        }
        return at.m.f2303b;
    }
}
