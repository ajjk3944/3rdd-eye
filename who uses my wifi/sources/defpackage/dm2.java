package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class dm2 implements zk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dm2(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.zk3
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                a83 a83Var = (a83) obj;
                mq1 mq1Var = new mq1((Context) this.b);
                mq1Var.c = a83Var.B;
                mq1Var.f = a83Var.C.toString();
                mq1Var.e = ((e51) this.c).f;
                mq1Var.d = ((l83) this.d).g;
                return mq1Var;
            case 1:
                ag2 ag2Var = (ag2) this.b;
                if (((a83) this.c).M) {
                    ag2Var.H0();
                }
                xh2 xh2Var = (xh2) this.d;
                ag2Var.L0();
                ag2Var.onPause();
                return xh2Var.y();
            case 2:
                ag2 ag2Var2 = (ag2) this.b;
                if (((a83) this.c).M) {
                    ag2Var2.H0();
                }
                di2 di2Var = (di2) this.d;
                ag2Var2.L0();
                ag2Var2.onPause();
                return di2Var.y();
            default:
                ag2 ag2Var3 = (ag2) this.b;
                if (((a83) this.c).M) {
                    ag2Var3.H0();
                }
                ii2 ii2Var = (ii2) this.d;
                ag2Var3.L0();
                ag2Var3.onPause();
                return ii2Var.y();
        }
    }
}
