package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k03 implements qq2 {
    public final /* synthetic */ int f;
    public final /* synthetic */ c03 g;
    public final /* synthetic */ a83 h;

    public /* synthetic */ k03(f03 f03Var, c03 c03Var, a83 a83Var, int i) {
        this.f = i;
        this.g = c03Var;
        this.h = a83Var;
    }

    @Override // defpackage.qq2
    public final a83 d() {
        switch (this.f) {
        }
        return this.h;
    }

    @Override // defpackage.qq2
    public final void q(boolean z, Context context, an2 an2Var) throws pq2 {
        n83 n83Var;
        switch (this.f) {
            case 0:
                try {
                    u83 u83Var = (u83) this.g.b;
                    u83Var.b(z);
                    try {
                        u83Var.a.e3(new oi0(context));
                        return;
                    } finally {
                    }
                } catch (n83 e) {
                    throw new pq2(e.getCause());
                }
            default:
                try {
                    u83 u83Var2 = (u83) this.g.b;
                    u83Var2.b(z);
                    try {
                        u83Var2.a.S();
                        return;
                    } finally {
                    }
                } catch (n83 e2) {
                    gi2.q0(5);
                    throw new pq2(e2.getCause());
                }
        }
    }
}
