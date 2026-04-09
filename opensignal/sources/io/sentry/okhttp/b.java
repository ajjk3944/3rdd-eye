package io.sentry.okhttp;

import ar.k;
import br.l;
import br.n;
import io.sentry.i1;
import io.sentry.o6;
import java.io.IOException;
import lq.b0;

/* loaded from: classes.dex */
public final class b extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12468d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ IOException f12469g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(IOException iOException, int i10) {
        super(1);
        this.f12468d = i10;
        this.f12469g = iOException;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f12468d) {
            case 0:
                i1 i1Var = (i1) obj;
                l.e(i1Var, "it");
                i1Var.a(o6.INTERNAL_ERROR);
                i1Var.f(this.f12469g);
                break;
            case 1:
                i1 i1Var2 = (i1) obj;
                l.e(i1Var2, "it");
                if (!i1Var2.d()) {
                    i1Var2.a(o6.INTERNAL_ERROR);
                    i1Var2.f(this.f12469g);
                }
                break;
            default:
                i1 i1Var3 = (i1) obj;
                l.e(i1Var3, "it");
                if (!i1Var3.d()) {
                    i1Var3.a(o6.INTERNAL_ERROR);
                    i1Var3.f(this.f12469g);
                }
                break;
        }
        return b0.f15562a;
    }
}
